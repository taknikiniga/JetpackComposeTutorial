package com.taknikiniga.di.module

import com.taknikiniga.networking.data_layer.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RetrofitDi {

    val baseURl = "https://apiv2.cricket.com.au/"

    val client: OkHttpClient = OkHttpClient.Builder().readTimeout(60, TimeUnit.MINUTES).build()


    // Ok Https Here

    @Singleton
    @Provides
    fun provideRetrofit():ApiService =
        Retrofit.Builder().client(client).baseUrl(baseURl)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(ApiService::class.java)

}