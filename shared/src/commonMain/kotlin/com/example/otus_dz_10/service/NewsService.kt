package com.example.otus_dz_10.service

import com.example.otus_dz_10.data.NewsList
import com.example.otus_dz_10.http.NetworkClient
import com.example.otus_dz_10.http.NetworkConfig

class NewsService(private val httpClient: NetworkClient) {

    suspend fun loadNews(): Result<NewsList> {
        return httpClient.request(URL)
    }

    companion object {
        val URL = "https://newsapi.org/v2/everything?q=science&apiKey=${NetworkConfig.apiKey}"
    }
}