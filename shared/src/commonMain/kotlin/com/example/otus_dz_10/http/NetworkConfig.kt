package com.example.otus_dz_10.http

class NetworkConfig {
    companion object shared {
        val apiUrl = "https://newsapi.org/v2"
        val apiKey = "2ccc8f5638e04cd3baf447be33bc429c"

        val header: HashMap<String, String> = hashMapOf("X-Api-Key" to apiKey)
    }
}