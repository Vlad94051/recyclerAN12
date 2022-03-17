package com.kir.test.domain

import com.kir.test.data.NewsRepository
import com.kir.test.data.getRepository
import com.kir.test.presentation.news.BaseItem

fun getInteractor(): NewsInteractor = NewsInteractorImpl(repository = getRepository())

interface NewsInteractor {
   suspend fun getNewsItems(): List<BaseItem>
}

class NewsInteractorImpl(private val repository: NewsRepository): NewsInteractor {

   override suspend fun getNewsItems(): List<BaseItem> {
      return repository.getNews().toBaseItems()
   }
}