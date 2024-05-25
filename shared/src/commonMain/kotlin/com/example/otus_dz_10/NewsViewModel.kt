package com.example.otus_dz_10

import com.example.otus_dz_10.data.NewsList
import com.example.otus_dz_10.threads.ioDispatcher
import com.example.otus_dz_10.useCase.NewsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NewsViewModel(private val useCase: NewsUseCase) : BaseViewModel() {
    var newsFlow = MutableStateFlow<NewsList?>(null)

    fun loadNews() {
        scope.launch {
            val result = useCase.invoke(Unit)
            result.getOrNull()?.let {
                newsFlow.tryEmit(it)
            }
        }
    }
}