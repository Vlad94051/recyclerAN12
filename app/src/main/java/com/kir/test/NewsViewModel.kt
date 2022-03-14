package com.kir.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kir.test.news.BaseItem
import com.kir.test.news.Date
import com.kir.test.news.News

class NewsViewModel : ViewModel() {
    private val _news = MutableLiveData<List<BaseItem>>()
    val news: LiveData<List<BaseItem>> get() = _news

    init {
        loadNews()
    }

    private fun loadNews() {
        val news = listOf(
            Date("14.02.22"),
            News("Title1"),
            News("Title2"),
            News("Title3"),
            News("Title4"),
            Date("15.02.22"),
            News("Title5"),
            News("Title6"),
            News("Title7"),
        )

        _news.value = news
    }

    fun onMegaButtonClicked() {
        val newNews = News("SUPER MEGA NEWS")
        val newList = _news.value?.toMutableList()
        newList?.add(newNews)
        _news.value = newList
    }
}
