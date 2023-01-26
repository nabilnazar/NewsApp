package com.meghamlabs.newsapp.domain.usecase

import com.meghamlabs.newsapp.data.model.Article
import com.meghamlabs.newsapp.domain.repository.NewsRepository

class SavedNewsUseCase(private val newsRepository: NewsRepository)  {

    suspend fun execute(article: Article) = newsRepository.saveNews(article)

}