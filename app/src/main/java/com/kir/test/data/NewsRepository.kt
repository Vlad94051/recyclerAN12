package com.kir.test.data

import com.kir.test.data.model.DataNews

interface NewsRepository {
   suspend fun getNews(): List<DataNews>
}

fun getRepository(): NewsRepository = NewsRepositoryImpl