package com.example.otus_dz_10

import com.example.otus_dz_10.http.NetworkClient
import com.example.otus_dz_10.service.NewsService
import com.example.otus_dz_10.useCase.NewsUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.dsl.module
import kotlin.reflect.KClass

class KoinDI : KoinComponent {
    val serviceModule = module {
        single { NetworkClient() }
        single { NewsService(get()) }
    }

    val usecaseModule = module {
        factory {
            NewsUseCase(get())
        }
    }

    val vmModule = module {
        factory<NewsViewModel> { NewsViewModel(get()) }
    }

    fun start() = startKoin {
        modules(listOf(serviceModule, usecaseModule, vmModule))
    }
}

object KoinDIFactory {
    val di by lazy {
        KoinDI().apply {
            start()
        }
    }
}

fun<T:Any> KoinDIFactory.resolve(clazz: KClass<T>): T? {
    return KoinDIFactory.di.getKoin().get(clazz)
}