# PriceListEntriesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPriceListEntry**](PriceListEntriesApi.md#addPriceListEntry) | **POST** /commerce/catalog/admin/pricelists/{priceListCode}/entries | Add price list entry |
| [**bulkAddPriceListEntries**](PriceListEntriesApi.md#bulkAddPriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkaddentries | Bulk add price list entries |
| [**bulkDeletePriceListEntries**](PriceListEntriesApi.md#bulkDeletePriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkdeleteentries | Bulk delete price list entries |
| [**bulkUpdatePriceListEntries**](PriceListEntriesApi.md#bulkUpdatePriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkupdateentries | Bulk update price list entries |
| [**deletePriceListEntry**](PriceListEntriesApi.md#deletePriceListEntry) | **DELETE** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Delete price list entry |
| [**getPriceListEntries**](PriceListEntriesApi.md#getPriceListEntries) | **GET** /commerce/catalog/admin/pricelists/{priceListCode}/entries | Get price list entries |
| [**getPriceListEntry**](PriceListEntriesApi.md#getPriceListEntry) | **GET** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Get price list entry |
| [**updatePriceListEntry**](PriceListEntriesApi.md#updatePriceListEntry) | **PUT** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Update price list entry |


<a name="addPriceListEntry"></a>
# **addPriceListEntry**
> PriceListEntry addPriceListEntry(priceListCode, priceListEntry)

Add price list entry



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    PriceListEntry priceListEntry = new PriceListEntry(); // PriceListEntry | 
    try {
      PriceListEntry result = apiInstance.addPriceListEntry(priceListCode, priceListEntry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#addPriceListEntry");
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
| **priceListCode** | **String**|  | |
| **priceListEntry** | [**PriceListEntry**](PriceListEntry.md)|  | [optional] |

### Return type

[**PriceListEntry**](PriceListEntry.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="bulkAddPriceListEntries"></a>
# **bulkAddPriceListEntries**
> bulkAddPriceListEntries(publishEvents, invalidateCache, priceListEntry)

Bulk add price list entries



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    Boolean publishEvents = true; // Boolean | 
    Boolean invalidateCache = true; // Boolean | 
    List<PriceListEntry> priceListEntry = Arrays.asList(); // List<PriceListEntry> | 
    try {
      apiInstance.bulkAddPriceListEntries(publishEvents, invalidateCache, priceListEntry);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#bulkAddPriceListEntries");
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
| **publishEvents** | **Boolean**|  | [optional] [default to true] |
| **invalidateCache** | **Boolean**|  | [optional] [default to true] |
| **priceListEntry** | [**List&lt;PriceListEntry&gt;**](PriceListEntry.md)|  | [optional] |

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

<a name="bulkDeletePriceListEntries"></a>
# **bulkDeletePriceListEntries**
> bulkDeletePriceListEntries(publishEvents, invalidateCache, priceListEntry)

Bulk delete price list entries



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    Boolean publishEvents = true; // Boolean | 
    Boolean invalidateCache = true; // Boolean | 
    List<PriceListEntry> priceListEntry = Arrays.asList(); // List<PriceListEntry> | 
    try {
      apiInstance.bulkDeletePriceListEntries(publishEvents, invalidateCache, priceListEntry);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#bulkDeletePriceListEntries");
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
| **publishEvents** | **Boolean**|  | [optional] [default to true] |
| **invalidateCache** | **Boolean**|  | [optional] [default to true] |
| **priceListEntry** | [**List&lt;PriceListEntry&gt;**](PriceListEntry.md)|  | [optional] |

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

<a name="bulkUpdatePriceListEntries"></a>
# **bulkUpdatePriceListEntries**
> bulkUpdatePriceListEntries(publishEvents, invalidateCache, priceListEntry)

Bulk update price list entries



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    Boolean publishEvents = true; // Boolean | 
    Boolean invalidateCache = true; // Boolean | 
    List<PriceListEntry> priceListEntry = Arrays.asList(); // List<PriceListEntry> | 
    try {
      apiInstance.bulkUpdatePriceListEntries(publishEvents, invalidateCache, priceListEntry);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#bulkUpdatePriceListEntries");
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
| **publishEvents** | **Boolean**|  | [optional] [default to true] |
| **invalidateCache** | **Boolean**|  | [optional] [default to true] |
| **priceListEntry** | [**List&lt;PriceListEntry&gt;**](PriceListEntry.md)|  | [optional] |

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

<a name="deletePriceListEntry"></a>
# **deletePriceListEntry**
> deletePriceListEntry(priceListCode, productCode, currencyCode, startDate)

Delete price list entry



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    String productCode = "productCode_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      apiInstance.deletePriceListEntry(priceListCode, productCode, currencyCode, startDate);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#deletePriceListEntry");
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
| **priceListCode** | **String**|  | |
| **productCode** | **String**|  | |
| **currencyCode** | **String**|  | |
| **startDate** | **OffsetDateTime**|  | [optional] |

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

<a name="getPriceListEntries"></a>
# **getPriceListEntries**
> PriceListEntryCollection getPriceListEntries(priceListCode, startIndex, pageSize, sortBy, filter)

Get price list entries



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      PriceListEntryCollection result = apiInstance.getPriceListEntries(priceListCode, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#getPriceListEntries");
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
| **priceListCode** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**PriceListEntryCollection**](PriceListEntryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPriceListEntry"></a>
# **getPriceListEntry**
> PriceListEntry getPriceListEntry(priceListCode, productCode, currencyCode, startDate)

Get price list entry



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    String productCode = "productCode_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      PriceListEntry result = apiInstance.getPriceListEntry(priceListCode, productCode, currencyCode, startDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#getPriceListEntry");
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
| **priceListCode** | **String**|  | |
| **productCode** | **String**|  | |
| **currencyCode** | **String**|  | |
| **startDate** | **OffsetDateTime**|  | [optional] |

### Return type

[**PriceListEntry**](PriceListEntry.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePriceListEntry"></a>
# **updatePriceListEntry**
> PriceListEntry updatePriceListEntry(priceListCode, productCode, currencyCode, startDate, priceListEntry)

Update price list entry



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PriceListEntriesApi;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    String productCode = "productCode_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    PriceListEntry priceListEntry = new PriceListEntry(); // PriceListEntry | 
    try {
      PriceListEntry result = apiInstance.updatePriceListEntry(priceListCode, productCode, currencyCode, startDate, priceListEntry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PriceListEntriesApi#updatePriceListEntry");
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
| **priceListCode** | **String**|  | |
| **productCode** | **String**|  | |
| **currencyCode** | **String**|  | |
| **startDate** | **OffsetDateTime**|  | [optional] |
| **priceListEntry** | [**PriceListEntry**](PriceListEntry.md)|  | [optional] |

### Return type

[**PriceListEntry**](PriceListEntry.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

