package com.kir.test.news

sealed class BaseItem {
    object SuperItem : BaseItem()
    data class NoSuperItem(val n: String) : BaseItem()
}

sealed class Error {
    object Unknown : Error()
}

enum class RRR {
    R1, R2, R3
}

fun aa(a: RRR, item: BaseItem) {
    when (a) {
        RRR.R1 -> {
        }
        RRR.R2 -> {
        }
    }

    when(item) {
        BaseItem.SuperItem -> {}
        is BaseItem.NoSuperItem -> {}
    }
}