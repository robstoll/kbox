package ch.tutteli.kbox

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

/**
 * Returns true if this [CharSequence] is neither `null` nor empty.
 */
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
@OptIn(ExperimentalContracts::class)
fun CharSequence?.isNotNullAndNotBlank(): Boolean {
    contract {
        returns(true) implies (this@isNotNullAndNotBlank != null)
    }
    return this.isNullOrBlank().not()
}
