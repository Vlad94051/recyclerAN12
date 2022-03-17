package com.kir.test.domain

import com.kir.test.data.model.DataNews
import com.kir.test.presentation.news.BaseItem
import com.kir.test.presentation.news.Date
import com.kir.test.presentation.news.News

fun List<DataNews>.toBaseItems(): List<BaseItem> {
    val items = mutableListOf<BaseItem>()


    this.forEachIndexed { index, item ->
        if (index == 0) {
            items.add(Date(item.date))
        } else if (item.date != this[index - 1].date) {
            items.add(Date(item.date))
        }
        items.add(News(title = item.title))
    }
    return items
}