package com.kir.test.data

import com.kir.test.data.model.DataNews
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object NewsRepositoryImpl : NewsRepository {
    private val newsList = listOf(
        DataNews(
            title = "title1",
            date = "14.02.2021"
        ),
        DataNews(
            title = "title1",
            date = "14.02.2021"
        ),
        DataNews(
            title = "title1",
            date = "14.02.2021"
        ),
        DataNews(
            title = "title1",
            date = "15.02.2021"
        ),
        DataNews(
            title = "title1",
            date = "15.02.2021"
        ),
        DataNews(
            title = "title1",
            date = "15.02.2021"
        ),
        DataNews(
            title = "title1",
            date = "16.02.2021"
        ),
        DataNews(
            title = "title1",
            date = "16.02.2021"
        )
    )

    override suspend fun getNews(): List<DataNews> {
        return withContext(Dispatchers.IO) {
            return@withContext newsList
        }
    }
}