# CurrencyApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCurrencyExchangeRates**](CurrencyApi.md#addCurrencyExchangeRates) | **POST** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Update currency localization |
| [**addCurrencyLocalization**](CurrencyApi.md#addCurrencyLocalization) | **POST** /commerce/catalog/admin/currency | Add currency localization |
| [**deleteCurrencyExchangeRate**](CurrencyApi.md#deleteCurrencyExchangeRate) | **DELETE** /commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode} | Delete currency exchange rate |
| [**deleteCurrencyLocalization**](CurrencyApi.md#deleteCurrencyLocalization) | **DELETE** /commerce/catalog/admin/currency/{currencyCode} | Delete currency localization |
| [**getCurrencyExchangeRate**](CurrencyApi.md#getCurrencyExchangeRate) | **GET** /commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode} | Get currency exchange rate |
| [**getCurrencyExchangeRates**](CurrencyApi.md#getCurrencyExchangeRates) | **GET** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Get currency exchange rates |
| [**getCurrencyLocalization**](CurrencyApi.md#getCurrencyLocalization) | **GET** /commerce/catalog/admin/currency/{currencyCode} | Get currency localization |
| [**getCurrencyLocalizations**](CurrencyApi.md#getCurrencyLocalizations) | **GET** /commerce/catalog/admin/currency | Get currency localizations |
| [**updateCurrencyExchangeRates**](CurrencyApi.md#updateCurrencyExchangeRates) | **PUT** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Update currency exchange rates |
| [**updateCurrencyLocalization**](CurrencyApi.md#updateCurrencyLocalization) | **PUT** /commerce/catalog/admin/currency/{currencyCode} | Update currency localization |


<a name="addCurrencyExchangeRates"></a>
# **addCurrencyExchangeRates**
> addCurrencyExchangeRates(currencyCode, catalogAdminsCurrencyExchangeRate)

Update currency localization

Updates the details of a currency-localization.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate = Arrays.asList(); // List<CatalogAdminsCurrencyExchangeRate> | Exchange rates for the currency
    try {
      apiInstance.addCurrencyExchangeRates(currencyCode, catalogAdminsCurrencyExchangeRate);
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
| **catalogAdminsCurrencyExchangeRate** | [**List&lt;CatalogAdminsCurrencyExchangeRate&gt;**](CatalogAdminsCurrencyExchangeRate.md)| Exchange rates for the currency | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addCurrencyLocalization"></a>
# **addCurrencyLocalization**
> CurrencyLocalization addCurrencyLocalization(currencyLocalization)

Add currency localization

Adds a new currency localization

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    CurrencyLocalization currencyLocalization = new CurrencyLocalization(); // CurrencyLocalization | Properties of the currency-localization to create.  Required properties: CurrencyCode
    try {
      CurrencyLocalization result = apiInstance.addCurrencyLocalization(currencyLocalization);
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
| **currencyLocalization** | [**CurrencyLocalization**](CurrencyLocalization.md)| Properties of the currency-localization to create.  Required properties: CurrencyCode | [optional] |

### Return type

[**CurrencyLocalization**](CurrencyLocalization.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCurrencyExchangeRate"></a>
# **deleteCurrencyExchangeRate**
> deleteCurrencyExchangeRate(currencyCode, toCurrencyCode)

Delete currency exchange rate

Delete a single exchange rate for a specified currency-code and target currency-code.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCurrencyLocalization"></a>
# **deleteCurrencyLocalization**
> deleteCurrencyLocalization(currencyCode)

Delete currency localization

Deletes the currency-localization specified by its currency code.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCurrencyExchangeRate"></a>
# **getCurrencyExchangeRate**
> CatalogAdminsCurrencyExchangeRate getCurrencyExchangeRate(currencyCode, toCurrencyCode)

Get currency exchange rate

Retrieves a single exchange rate for a specified currency-code and target-currency-code.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    String toCurrencyCode = "toCurrencyCode_example"; // String | Target currency code
    try {
      CatalogAdminsCurrencyExchangeRate result = apiInstance.getCurrencyExchangeRate(currencyCode, toCurrencyCode);
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

### Return type

[**CatalogAdminsCurrencyExchangeRate**](CatalogAdminsCurrencyExchangeRate.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCurrencyExchangeRates"></a>
# **getCurrencyExchangeRates**
> CurrencyExchangeRateCollection getCurrencyExchangeRates(currencyCode)

Get currency exchange rates

Retrieves a list of exchange rates for a specified currency-code and filter criteria.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    try {
      CurrencyExchangeRateCollection result = apiInstance.getCurrencyExchangeRates(currencyCode);
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

### Return type

[**CurrencyExchangeRateCollection**](CurrencyExchangeRateCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCurrencyLocalization"></a>
# **getCurrencyLocalization**
> CurrencyLocalization getCurrencyLocalization(currencyCode)

Get currency localization

Gets a single currency-localization.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code.
    try {
      CurrencyLocalization result = apiInstance.getCurrencyLocalization(currencyCode);
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

### Return type

[**CurrencyLocalization**](CurrencyLocalization.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCurrencyLocalizations"></a>
# **getCurrencyLocalizations**
> CurrencyLocalizationCollection getCurrencyLocalizations()

Get currency localizations

Gets all currency-localizations.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    try {
      CurrencyLocalizationCollection result = apiInstance.getCurrencyLocalizations();
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
This endpoint does not need any parameter.

### Return type

[**CurrencyLocalizationCollection**](CurrencyLocalizationCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCurrencyExchangeRates"></a>
# **updateCurrencyExchangeRates**
> updateCurrencyExchangeRates(currencyCode, catalogAdminsCurrencyExchangeRate)

Update currency exchange rates

Update multiple exchange rates for a specified currency-code.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code
    List<CatalogAdminsCurrencyExchangeRate> catalogAdminsCurrencyExchangeRate = Arrays.asList(); // List<CatalogAdminsCurrencyExchangeRate> | Exchange rates for the currency
    try {
      apiInstance.updateCurrencyExchangeRates(currencyCode, catalogAdminsCurrencyExchangeRate);
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
| **catalogAdminsCurrencyExchangeRate** | [**List&lt;CatalogAdminsCurrencyExchangeRate&gt;**](CatalogAdminsCurrencyExchangeRate.md)| Exchange rates for the currency | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCurrencyLocalization"></a>
# **updateCurrencyLocalization**
> CurrencyLocalization updateCurrencyLocalization(currencyCode, currencyLocalization)

Update currency localization

Updates the details of a currency-localization.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrencyApi apiInstance = new CurrencyApi(defaultClient);
    String currencyCode = "currencyCode_example"; // String | Currency code.
    CurrencyLocalization currencyLocalization = new CurrencyLocalization(); // CurrencyLocalization | Properties of the currency-localization to update.
    try {
      CurrencyLocalization result = apiInstance.updateCurrencyLocalization(currencyCode, currencyLocalization);
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
| **currencyLocalization** | [**CurrencyLocalization**](CurrencyLocalization.md)| Properties of the currency-localization to update. | [optional] |

### Return type

[**CurrencyLocalization**](CurrencyLocalization.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

