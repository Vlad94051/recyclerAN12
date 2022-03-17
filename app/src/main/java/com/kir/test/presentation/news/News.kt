package com.kir.test.presentation.news

data class News(
    val title: String,
    val date: String? = null
) : BaseItem()