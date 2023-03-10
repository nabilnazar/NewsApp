package com.meghamlabs.newsapp.presentation.di

import com.meghamlabs.newsapp.BuildConfig
import com.meghamlabs.newsapp.data.api.NewsAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetModule {
    @Singleton
    @Provides
        fun provideRetrofit(): Retrofit
        {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.URL_KEY)
                .build()
        }

    @Singleton
    @Provides
    fun provideNewsApiService(retrofit: Retrofit):NewsAPIService{

        return retrofit.create(NewsAPIService::class.java)
    }
}