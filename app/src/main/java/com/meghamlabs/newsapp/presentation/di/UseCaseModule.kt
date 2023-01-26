package com.meghamlabs.newsapp.presentation.di

import com.meghamlabs.newsapp.domain.repository.NewsRepository
import com.meghamlabs.newsapp.domain.usecase.GetNewsHeadlinesUseCase
import com.meghamlabs.newsapp.domain.usecase.GetSearchedNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun providesNewsHeadLineUseCase(newsRepository: NewsRepository):GetNewsHeadlinesUseCase{

        return GetNewsHeadlinesUseCase(newsRepository)
    }


    @Provides
    @Singleton
    fun provideGetSearchedNewsUseCase(newsRepository: NewsRepository): GetSearchedNewsUseCase {

        return GetSearchedNewsUseCase(newsRepository)
    }
}