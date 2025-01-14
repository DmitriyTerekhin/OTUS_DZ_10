package com.example.otus_dz_10.useCase

import com.example.otus_dz_10.threads.ioDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

abstract class BaseUseCase<in T, out R>(
    private val dispatcher: CoroutineDispatcher = ioDispatcher
) {

    abstract suspend fun execute(param: T): R

    suspend operator fun invoke(param: T): Result<R> = withContext(dispatcher) {
        runCatching { execute(param) }
    }
}