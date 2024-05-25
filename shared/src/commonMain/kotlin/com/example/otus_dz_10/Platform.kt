package com.example.otus_dz_10

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform