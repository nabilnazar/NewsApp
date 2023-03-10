package com.meghamlabs.newsapp.presentation.di

import com.meghamlabs.newsapp.data.repository.NewsRepositoryImpl
import com.meghamlabs.newsapp.data.repository.dataSource.NewsRemoteDataSource
import com.meghamlabs.newsapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource):NewsRepository{

        return NewsRepositoryImpl(newsRemoteDataSource)
    }


}