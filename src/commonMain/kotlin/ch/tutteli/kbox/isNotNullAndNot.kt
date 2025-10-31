//TODO 4.0.0 rename file to isNotNullNor.kt and adjust README link
package ch.tutteli.kbox

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

/**
 * Returns true if this [CharSequence] is neither `null` nor empty.
 */
@Deprecated("switch to isNotNullNorEmpty, will be removed with 4.0.0", ReplaceWith("this.isNotNullNorEmpty()"))
@OptIn(ExperimentalContracts::class)
fun CharSequence?.isNotNullAndNotEmpty(): Boolean {
	contract {
		returns(true) implies (this@isNotNullAndNotEmpty != null)
	}
	return this.isNullOrEmpty().not()
}

/**
 * Returns true if this [CharSequence] is neither `null` nor blank.
 */
@Deprecated("switch to isNotNullNorBlank, will be removed with 4.0.0", ReplaceWith("this.isNotNullNorBlank()"))
@OptIn(ExperimentalContracts::class)
fun CharSequence?.isNotNullAndNotBlank(): Boolean {
	contract {
		returns(true) implies (this@isNotNullAndNotBlank != null)
	}
	return this.isNullOrBlank().not()
}

/**
 * Returns true if this [CharSequence] is neither `null` nor empty.
 */
@OptIn(ExperimentalContracts::class)
fun CharSequence?.isNotNullNorEmpty(): Boolean {
	contract {
		returns(true) implies (this@isNotNullNorEmpty != null)
	}
	return this.isNullOrEmpty().not()
}

/**
 * Returns true if this [CharSequence] is neither `null` nor blank.
 */
@OptIn(ExperimentalContracts::class)
fun CharSequence?.isNotNullNorBlank(): Boolean {
	contract {
		returns(true) implies (this@isNotNullNorBlank != null)
	}
	return this.isNullOrBlank().not()
}


/**
 * Returns true if this [Collection] is neither `null` nor empty.
 */
@OptIn(ExperimentalContracts::class)
fun Collection<*>?.isNotNullNorEmpty(): Boolean {
	contract {
		returns(true) implies (this@isNotNullNorEmpty != null)
	}
	return this.isNullOrEmpty().not()
}

/**
 * Returns true if this [CharSequence] is neither `null` nor blank.
 */
@OptIn(ExperimentalContracts::class)
fun Array<*>?.isNotNullNorEmpty(): Boolean {
	contract {
		returns(true) implies (this@isNotNullNorEmpty != null)
	}
	return this.isNullOrEmpty().not()
}

/**
 * Returns true if this [Map] is neither `null` nor blank.
 */
@OptIn(ExperimentalContracts::class)
fun Map<*, *>?.isNotNullNorEmpty(): Boolean {
	contract {
		returns(true) implies (this@isNotNullNorEmpty != null)
	}
	return this.isNullOrEmpty().not()
}


