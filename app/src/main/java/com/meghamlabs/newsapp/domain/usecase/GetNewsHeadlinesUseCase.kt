package com.meghamlabs.newsapp.domain.usecase

import com.meghamlabs.newsapp.data.model.APIResponse
import com.meghamlabs.newsapp.data.util.Resource
import com.meghamlabs.newsapp.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository)  {


    suspend fun execute(country: String, page: Int): Resource<APIResponse>{

        return newsRepository.getNewsHeadlines(country, page)
    }



}