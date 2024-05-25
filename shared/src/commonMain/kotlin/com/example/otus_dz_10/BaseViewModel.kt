package com.example.otus_dz_10

import com.example.otus_dz_10.threads.uiDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

open class BaseViewModel {
    val job = SupervisorJob()
    protected var scope: CoroutineScope = CoroutineScope(uiDispatcher + job)
}