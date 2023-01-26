package com.meghamlabs.newsapp.domain.usecase

import com.meghamlabs.newsapp.data.model.Article
import com.meghamlabs.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow


class GetSavedNewsUseCase(private val newsRepository: NewsRepository)  {

     fun execute(): Flow<List<Article>> {
         return newsRepository.getSavedNews()
     }

}