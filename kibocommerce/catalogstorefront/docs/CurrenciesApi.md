# CurrenciesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontGetCurrencyExchangeRates**](CurrenciesApi.md#storefrontGetCurrencyExchangeRates) | **GET** /commerce/catalog/storefront/currencies/exchangerates | Get Exchange Rates |


<a name="storefrontGetCurrencyExchangeRates"></a>
# **storefrontGetCurrencyExchangeRates**
> List&lt;CatalogRuntimesCurrencyExchangeRate&gt; storefrontGetCurrencyExchangeRates(responseFields)

Get Exchange Rates

Retrieves a list of currency exchange rates based on the context&#39;s currency code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CatalogRuntimesCurrencyExchangeRate> result = apiInstance.storefrontGetCurrencyExchangeRates(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#storefrontGetCurrencyExchangeRates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CatalogRuntimesCurrencyExchangeRate&gt;**](CatalogRuntimesCurrencyExchangeRate.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

