package com.example.newsapp.api

import com.example.newsapp.model.NewsResponse
import com.example.newsapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiHolder {

    @GET("top-headlines")
    suspend fun getNews (
        @Query("country")
        country: String,
        @Query("pageSize")
        pageSize: Int,
        @Query("apiKey")
        apiKey : String = API_KEY
    ): Response<NewsResponse>

    @GET("top-headlines")
    suspend fun getCategory (
        @Query("country")
        country: String,
        @Query("category")
        category: String,
        @Query("pageSize")
        pageSize: Int,
        @Query("apiKey")
        apiKey : String = API_KEY
    ): Response<NewsResponse>

    @GET("everything")
    suspend fun search (
        @Query("q")
        searchQuery: String,
        @Query("pageSize")
        pageSize: Int,
        @Query("apiKey")
        apiKey : String = API_KEY
    ): Response<NewsResponse>
}