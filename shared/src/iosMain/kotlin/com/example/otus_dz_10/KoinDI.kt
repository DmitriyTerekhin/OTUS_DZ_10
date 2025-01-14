package com.example.otus_dz_10

import kotlinx.cinterop.ObjCClass
import kotlinx.cinterop.getOriginalKotlinClass
import kotlin.reflect.KClass


fun <T : Any> KoinDIFactory.createType(clazz: ObjCClass): KClass<*>? {
    return getOriginalKotlinClass(clazz)
}

fun <T : Any> KoinDIFactory.resolve(clazz: ObjCClass): T? {
    val kClass = createType<T>(clazz)
    if (kClass != null) {
        return di.getKoin().get(kClass)
    }
    return null
}
