# CurrencyApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCurrencyExchangeRates**](CurrencyApi.md#addCurrencyExchangeRates) | **POST** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Update Currency Exchange Rates |
| [**addCurrencyLocalization**](CurrencyApi.md#addCurrencyLocalization) | **POST** /commerce/catalog/admin/currency | Add Currency Localization |
| [**deleteCurrencyExchangeRate**](CurrencyApi.md#deleteCurrencyExchangeRate) | **DELETE** /commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode} | Delete Currency Exchange Rate |
| [**deleteCurrencyLocalization**](CurrencyApi.md#deleteCurrencyLocalization) | **DELETE** /commerce/catalog/admin/currency/{currencyCode} | Delete Currency Localization |
| [**getCurrencyExchangeRate**](CurrencyApi.md#getCurrencyExchangeRate) | **GET** /commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode} | Get Currency Exchange Rate |
| [**getCurrencyExchangeRates**](CurrencyApi.md#getCurrencyExchangeRates) | **GET** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Get Currency Exchange Rates |
| [**getCurrencyLocalization**](CurrencyApi.md#getCurrencyLocalization) | **GET** /commerce/catalog/admin/currency/{currencyCode} | Get Currency Localization |
| [**getCurrencyLocalizations**](CurrencyApi.md#getCurrencyLocalizations) | **GET** /commerce/catalog/admin/currency | Get Currency Localizations |
| [**updateCurrencyExchangeRates**](CurrencyApi.md#updateCurrencyExchangeRates) | **PUT** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Bulk Update Currency Exchange Rates |
| [**updateCurrencyLocalization**](CurrencyApi.md#updateCurrencyLocalization) | **PUT** /commerce/catalog/admin/currency/{currencyCode} | Update Currency Localization |


<a name="addCurrencyExchangeRates"></a>
# **addCurrencyExchangeRates**
> addCurrencyExchangeRates(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate)

Update Currency Exchange Rates

Updates the details of a currency localization.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate = Arrays.asList(); // List<CatalogAdminsCurrencyExchangeRate> | Exchange rates for the currency
    try {
      apiInstance.addCurrencyExchangeRates(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#addCurrencyExchangeRates");
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
| **currencyCode** | **String**| Currency code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsCurrencyExchangeRate** | [**List&lt;CatalogAdminsCurrencyExchangeRate&gt;**](CatalogAdminsCurrencyExchangeRate.md)| Exchange rates for the currency | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addCurrencyLocalization"></a>
# **addCurrencyLocalization**
> CurrencyLocalization addCurrencyLocalization(responseFields, currencyLocalization)

Add Currency Localization

Adds a new currency localization.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CurrencyLocalization currencyLocalization = new CurrencyLocalization(); // CurrencyLocalization | Properties of the currency-localization to create. Required properties: CurrencyCode
    try {
      CurrencyLocalization result = apiInstance.addCurrencyLocalization(responseFields, currencyLocalization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#addCurrencyLocalization");
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
| **currencyLocalization** | [**CurrencyLocalization**](CurrencyLocalization.md)| Properties of the currency-localization to create. Required properties: CurrencyCode | [optional] |

### Return type

[**CurrencyLocalization**](CurrencyLocalization.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCurrencyExchangeRate"></a>
# **deleteCurrencyExchangeRate**
> deleteCurrencyExchangeRate(currencyCode, toCurrencyCode)

Delete Currency Exchange Rate

Delete a single exchange rate for a specified currency code and target currency code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    String toCurrencyCode = "toCurrencyCode_example"; // String | C
    try {
      apiInstance.deleteCurrencyExchangeRate(currencyCode, toCurrencyCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#deleteCurrencyExchangeRate");
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
| **currencyCode** | **String**| Currency code | |
| **toCurrencyCode** | **String**| C | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCurrencyLocalization"></a>
# **deleteCurrencyLocalization**
> deleteCurrencyLocalization(currencyCode)

Delete Currency Localization

Deletes the currency localization specified by its currency code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code.
    try {
      apiInstance.deleteCurrencyLocalization(currencyCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#deleteCurrencyLocalization");
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
| **currencyCode** | **String**| Currency code. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCurrencyExchangeRate"></a>
# **getCurrencyExchangeRate**
> CatalogAdminsCurrencyExchangeRate getCurrencyExchangeRate(currencyCode, toCurrencyCode, responseFields)

Get Currency Exchange Rate

Retrieves a single exchange rate for a specified currency code and target currency code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    String toCurrencyCode = "toCurrencyCode_example"; // String | Target currency code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsCurrencyExchangeRate result = apiInstance.getCurrencyExchangeRate(currencyCode, toCurrencyCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#getCurrencyExchangeRate");
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
| **currencyCode** | **String**| Currency code | |
| **toCurrencyCode** | **String**| Target currency code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsCurrencyExchangeRate**](CatalogAdminsCurrencyExchangeRate.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCurrencyExchangeRates"></a>
# **getCurrencyExchangeRates**
> CurrencyExchangeRateCollection getCurrencyExchangeRates(currencyCode, responseFields)

Get Currency Exchange Rates

Retrieves a list of exchange rates for a specified currency code and filter criteria.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CurrencyExchangeRateCollection result = apiInstance.getCurrencyExchangeRates(currencyCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#getCurrencyExchangeRates");
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
| **currencyCode** | **String**| Currency code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CurrencyExchangeRateCollection**](CurrencyExchangeRateCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCurrencyLocalization"></a>
# **getCurrencyLocalization**
> CurrencyLocalization getCurrencyLocalization(currencyCode, responseFields)

Get Currency Localization

Gets a single currency localization.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CurrencyLocalization result = apiInstance.getCurrencyLocalization(currencyCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#getCurrencyLocalization");
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
| **currencyCode** | **String**| Currency code. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CurrencyLocalization**](CurrencyLocalization.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCurrencyLocalizations"></a>
# **getCurrencyLocalizations**
> CurrencyLocalizationCollection getCurrencyLocalizations(responseFields)

Get Currency Localizations

Gets all currency localizations.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CurrencyLocalizationCollection result = apiInstance.getCurrencyLocalizations(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#getCurrencyLocalizations");
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

[**CurrencyLocalizationCollection**](CurrencyLocalizationCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCurrencyExchangeRates"></a>
# **updateCurrencyExchangeRates**
> updateCurrencyExchangeRates(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate)

Bulk Update Currency Exchange Rates

Update multiple exchange rates for a specified currency code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate = Arrays.asList(); // List<CatalogAdminsCurrencyExchangeRate> | Exchange rates for the currency
    try {
      apiInstance.updateCurrencyExchangeRates(currencyCode, responseFields, catalogAdminsCurrencyExchangeRate);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#updateCurrencyExchangeRates");
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
| **currencyCode** | **String**| Currency code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsCurrencyExchangeRate** | [**List&lt;CatalogAdminsCurrencyExchangeRate&gt;**](CatalogAdminsCurrencyExchangeRate.md)| Exchange rates for the currency | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCurrencyLocalization"></a>
# **updateCurrencyLocalization**
> CurrencyLocalization updateCurrencyLocalization(currencyCode, responseFields, currencyLocalization)

Update Currency Localization

Updates the details of a currency localization.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CurrencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CurrencyLocalization currencyLocalization = new CurrencyLocalization(); // CurrencyLocalization | Properties of the currency-localization to update.
    try {
      CurrencyLocalization result = apiInstance.updateCurrencyLocalization(currencyCode, responseFields, currencyLocalization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrencyApi#updateCurrencyLocalization");
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
| **currencyCode** | **String**| Currency code. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **currencyLocalization** | [**CurrencyLocalization**](CurrencyLocalization.md)| Properties of the currency-localization to update. | [optional] |

### Return type

[**CurrencyLocalization**](CurrencyLocalization.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

