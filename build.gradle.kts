import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

buildscript {
    // needs to be defined in here because otherwise tutteli-publish plugin does not have this information when applied
    // and we use/apply it in the conventions
    rootProject.version = "3.3.0-SNAPSHOT"
    rootProject.group = "ch.tutteli.kbox"
    rootProject.description = "A utility library for Kotlin"
    extra.set("generationFolder", project.files("src/commonMain/generated/kotlin"))
    extra.set("generationTestFolder", project.files("src/commonTest/generated/kotlin"))
}
val generationFolder: ConfigurableFileCollection by extra
val generationTestFolder: ConfigurableFileCollection by extra


plugins {
    id("build-logic.published-kotlin-multiplatform")
    id("code-generation.generate")
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

kotlin {
    sourceSets {
        commonMain {
            kotlin.srcDir(generationFolder)
        }

        commonTest {

            kotlin.srcDir(generationTestFolder)
            dependencies {
                implementation("ch.tutteli.atrium:atrium-fluent:1.3.0-alpha-2") {
                    exclude(group = "ch.tutteli.kbox")
                }
            }
        }
    }
}

detekt {
    allRules = true
    config.from(files("${rootProject.projectDir}/gradle/detekt.yml"))
}

val detektTasks = tasks.withType<io.gitlab.arturbosch.detekt.Detekt>()

fun Task.reportXml(): Path {
    val fileName = if (name == "detekt") "detekt" else name.substring("detekt".length)
    return project.layout.buildDirectory.file("reports/detekt/$fileName.xml").get().asFile.toPath()
}

// not provided by detekt itself so far, might change in the future
val allDetekt = tasks.register("allDetekt") {
    detektTasks.forEach {
        it.reports {
            xml.required.set(true)
            html.required.set(false)
            txt.required.set(false)
            sarif.required.set(false)
            md.required.set(false)
        }
        dependsOn(it)
    }
}
tasks.named("check").configure {
    dependsOn(allDetekt)
}
detektTasks.forEach {
    val reportXml = it.reportXml()
    it.doLast {
        // necessary as currently detekt writes main.xml for each platform and overrides when doing so
        Files.move(
            project.project.layout.buildDirectory.file("reports/detekt/main.xml").get().asFile.toPath(),
            reportXml,
            StandardCopyOption.REPLACE_EXISTING
        )
    }
    // as we change name of the output file, we need to let gradle know about it
    it.outputs.file(reportXml)
}

nexusPublishing {
    repositories {
        sonatype()
    }
}

/*

Release & deploy a commit
--------------------------------
1. search for X.Y.Z-SNAPSHOT and replace with X.Y.Z
2. update main:
    a) point to the tag, search for `(tree|blob)/main` and replace it with `$1/vX.Y.Z` (README.md)
    b) update badges
    c) rm -r ./docs/kdoc && gr dokkaHtml
    d) commit (modified docs/index.md, docs/kdoc/*, build.gradle.kts, README.md)
    e) git tag vX.Y.Z
    f) git push origin vX.Y.Z
4. deploy to maven-central:

    a) export KBOX_VERSION=v3.2.0 &&
       export DIR_IN_M2="~/.m2/repository/ch/tutteli/kbox" &&
       java -version 2>&1 | grep "version \"11" && rm -r "$DIR_IN_M2" &&
       PUB=true CI=true gr clean pubToMaLo &&
       find "$DIR_IN_M2" -name maven-metadata-local.xml -exec rm -f {} \; &&
       find "$DIR_IN_M2" -type f -not -name "*.md5" -not -name "*.sha1" -not -name "*.asc" -print0 | while read -r -d $'\0' file; do
         base=$(basename "$file");
         md5sum "$file" | awk '{ print $1 }' > "${file}.md5"
         sha1sum "$file" | awk '{ print $1 }' > "$file.sha1"
       done && zip -r "~/Downloads/kbox-$KBOX_VERSION.zip" "$DIR_IN_M2"
    b) goto https://central.sonatype.com/publishing
    c) click on Publish component button
    d) upload zip which was put into ~/Download/kbox-vX.Y.Z.zip
    e) wait for validation to end and check that it contains all components
    f) click on publish
5. create release on github

Prepare next dev cycle
-----------------------
1. point to main, search for `(tree|blob)/vX.Y.Z` and replace it with `$1/main` in *.md
2. Replace badges
3. replace version in this file with X.Y.Z-SNAPSHOT
4. commit & push changes (README.md, build.gradle.kts)

*/

