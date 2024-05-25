package com.example.otus_dz_10.data

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class NewsList(
    var articles: List<NewsItem>? = null
)

@kotlinx.serialization.Serializable
data class NewsItem(
    @SerialName("author") val author: String?,
    val title: String?, val description: String?,
    val url: String?, val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
)