# ArticlesApi

All URIs are relative to *https://newsapi.org/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**everythingGet**](ArticlesApi.md#everythingGet) | **GET** /top-headlines/ | News List


<a id="everythingGet"></a>
# **everythingGet**
> ArticleList everythingGet(category, from, sortBy, language, apiKey, page)

News List

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ArticlesApi()
val category : kotlin.String = category_example // kotlin.String | Theme of news
val from : kotlin.String = from_example // kotlin.String | date
val sortBy : kotlin.String = sortBy_example // kotlin.String | Sort
val language : kotlin.String = language_example // kotlin.String | Language in two letters
val apiKey : kotlin.String = apiKey_example // kotlin.String | API key
val page : kotlin.Int = 56 // kotlin.Int | number of page
try {
    val result : ArticleList = apiInstance.everythingGet(category, from, sortBy, language, apiKey, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ArticlesApi#everythingGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ArticlesApi#everythingGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **kotlin.String**| Theme of news |
 **from** | **kotlin.String**| date |
 **sortBy** | **kotlin.String**| Sort |
 **language** | **kotlin.String**| Language in two letters |
 **apiKey** | **kotlin.String**| API key |
 **page** | **kotlin.Int**| number of page | [optional]

### Return type

[**ArticleList**](ArticleList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

