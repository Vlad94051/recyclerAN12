package com.kir.test.news

data class News(
    val title: String,
    val date: String? = null
) : BaseItem()