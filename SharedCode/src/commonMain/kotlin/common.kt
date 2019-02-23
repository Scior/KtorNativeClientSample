package org.kotlin.mpp.mobile

import org.kotlin.mpp.mobile.api.HttpRequest

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

fun getGoogle(completion: ((String) -> Unit)) {
    val request = HttpRequest("https://www.google.co.jp/")
    return request.getAsync(completion)
}
