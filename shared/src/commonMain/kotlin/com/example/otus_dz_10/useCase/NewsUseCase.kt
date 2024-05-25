package com.example.otus_dz_10.useCase

import com.example.otus_dz_10.data.NewsList
import com.example.otus_dz_10.service.NewsService

class NewsUseCase(private var newsService: NewsService) : BaseUseCase<Unit, NewsList?>() {
    override suspend fun execute(param: Unit): NewsList? {
        return try {
            newsService.loadNews()?.getOrNull()
        } catch (e: Exception) {
            throw e
        }
    }
}