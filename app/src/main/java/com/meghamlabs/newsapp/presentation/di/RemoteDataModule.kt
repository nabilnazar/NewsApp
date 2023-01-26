package com.meghamlabs.newsapp.presentation.di

import com.meghamlabs.newsapp.data.api.NewsAPIService
import com.meghamlabs.newsapp.data.repository.dataSource.NewsRemoteDataSource
import com.meghamlabs.newsapp.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService): NewsRemoteDataSource{

        return NewsRemoteDataSourceImpl(newsAPIService)

    }

}