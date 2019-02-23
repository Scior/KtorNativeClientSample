package org.kotlin.mpp.mobile.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HttpRequest (
    private val urlString: String
) {
    private val client = HttpClient()

    suspend fun get(): String {
        return client.get(urlString)
    }

    fun getAsync(completion: ((String) -> Unit)){
        GlobalScope.launch {
            completion(get())
        }
    }
}