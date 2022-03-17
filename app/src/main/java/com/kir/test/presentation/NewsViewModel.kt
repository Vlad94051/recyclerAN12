package com.kir.test.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kir.test.domain.getInteractor
import com.kir.test.presentation.news.BaseItem
import com.kir.test.presentation.news.Date
import com.kir.test.presentation.news.News
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    private val _news = MutableLiveData<List<BaseItem>>()
    val news: LiveData<List<BaseItem>> get() = _news

    private val newsInteractor by lazy { getInteractor() }

    init {
        loadNews()
    }

    private fun loadNews() {
       viewModelScope.launch(Dispatchers.IO) {
          _news.postValue(newsInteractor.getNewsItems())
        }
    }

    fun onMegaButtonClicked() {
        val newNews = News("SUPER MEGA NEWS")
        val newList = _news.value?.toMutableList()
        newList?.add(newNews)
        _news.value = newList
    }
}
