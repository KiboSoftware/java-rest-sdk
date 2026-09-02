# PriceListEntriesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPriceListEntry**](PriceListEntriesApi.md#addPriceListEntry) | **POST** /commerce/catalog/admin/pricelists/{priceListCode}/entries | Add Price List Entry |
| [**bulkAddPriceListEntries**](PriceListEntriesApi.md#bulkAddPriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkaddentries | Bulk Add Price List Entries |
| [**bulkDeletePriceListEntries**](PriceListEntriesApi.md#bulkDeletePriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkdeleteentries | Bulk Delete Price List Entries |
| [**bulkUpdatePriceListEntries**](PriceListEntriesApi.md#bulkUpdatePriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkupdateentries | Bulk Update Price List Entries. |
| [**deletePriceListEntry**](PriceListEntriesApi.md#deletePriceListEntry) | **DELETE** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Delete Price List Entry by Currency |
| [**getPriceListEntries**](PriceListEntriesApi.md#getPriceListEntries) | **GET** /commerce/catalog/admin/pricelists/{priceListCode}/entries | Get Price List Entries |
| [**getPriceListEntry**](PriceListEntriesApi.md#getPriceListEntry) | **GET** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Get Price List Entries by Currency |
| [**updatePriceListEntry**](PriceListEntriesApi.md#updatePriceListEntry) | **PUT** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Update Price List Entry by Currency |


<a name="addPriceListEntry"></a>
# **addPriceListEntry**
> PriceListEntry addPriceListEntry(priceListCode, responseFields, priceListEntry)

Add Price List Entry

Adds an entry to a price list.

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PriceListEntry priceListEntry = new PriceListEntry(); // PriceListEntry | 
    try {
      PriceListEntry result = apiInstance.addPriceListEntry(priceListCode, responseFields, priceListEntry);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **priceListEntry** | [**PriceListEntry**](PriceListEntry.md)|  | [optional] |

### Return type

[**PriceListEntry**](PriceListEntry.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkAddPriceListEntries"></a>
# **bulkAddPriceListEntries**
> PriceListBulkResult bulkAddPriceListEntries(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry)

Bulk Add Price List Entries

Add bulk price list entries. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    Boolean publishEvents = true; // Boolean | 
    Boolean invalidateCache = true; // Boolean | 
    Boolean allowPartialSuccess = true; // Boolean | Returns status codes of 200 (complete success), 206 (some entries failed validation), 409 (all entries failed validation), or 500 (unexpected failure)
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<PriceListEntry> priceListEntry = Arrays.asList(); // List<PriceListEntry> | 
    try {
      PriceListBulkResult result = apiInstance.bulkAddPriceListEntries(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry);
      System.out.println(result);
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
| **allowPartialSuccess** | **Boolean**| Returns status codes of 200 (complete success), 206 (some entries failed validation), 409 (all entries failed validation), or 500 (unexpected failure) | [optional] |
| **batchJobCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **priceListEntry** | [**List&lt;PriceListEntry&gt;**](PriceListEntry.md)|  | [optional] |

### Return type

[**PriceListBulkResult**](PriceListBulkResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkDeletePriceListEntries"></a>
# **bulkDeletePriceListEntries**
> PriceListBulkResult bulkDeletePriceListEntries(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry)

Bulk Delete Price List Entries

Deletes up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail.

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    Boolean publishEvents = true; // Boolean | 
    Boolean invalidateCache = true; // Boolean | 
    Boolean allowPartialSuccess = true; // Boolean | 
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<PriceListEntry> priceListEntry = Arrays.asList(); // List<PriceListEntry> | 
    try {
      PriceListBulkResult result = apiInstance.bulkDeletePriceListEntries(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry);
      System.out.println(result);
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
| **allowPartialSuccess** | **Boolean**|  | [optional] |
| **batchJobCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **priceListEntry** | [**List&lt;PriceListEntry&gt;**](PriceListEntry.md)|  | [optional] |

### Return type

[**PriceListBulkResult**](PriceListBulkResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="bulkUpdatePriceListEntries"></a>
# **bulkUpdatePriceListEntries**
> PriceListBulkResult bulkUpdatePriceListEntries(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry)

Bulk Update Price List Entries.

Updates up to 5000 price list entries in bulk. By default, any single error will cause the entire batch to fail. If desired, set allowPartialSuccess&#x3D;true to allow valid entries to be completed even if others in the batch fail. &lt;p&gt;This method performs an upsert, which will add missing entries if they do not exist. It can be used in place of Bulk Add Price List Entries to simplify application logic when the desired behavior is to update an entry or add the entry if it does not exist.&lt;/p&gt; &lt;p&gt;Disable the publishEvents parameter to prevent publishing the event related to updating price list entries in the system. Disabling this property helps you prevent performance delays if you expect the event to trigger the re-indexing of a large number of products, or if you want to postpone the operations of other applications and services listening for the event. Disable the invalidateCache parameter if you expect to encounter unacceptable performance hits related to clearing the cache for each product in the price list entries.&lt;/p&gt;

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    Boolean publishEvents = true; // Boolean | 
    Boolean invalidateCache = true; // Boolean | 
    Boolean allowPartialSuccess = true; // Boolean | 
    String batchJobCode = "batchJobCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<PriceListEntry> priceListEntry = Arrays.asList(); // List<PriceListEntry> | 
    try {
      PriceListBulkResult result = apiInstance.bulkUpdatePriceListEntries(publishEvents, invalidateCache, allowPartialSuccess, batchJobCode, responseFields, priceListEntry);
      System.out.println(result);
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
| **allowPartialSuccess** | **Boolean**|  | [optional] |
| **batchJobCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **priceListEntry** | [**List&lt;PriceListEntry&gt;**](PriceListEntry.md)|  | [optional] |

### Return type

[**PriceListBulkResult**](PriceListBulkResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deletePriceListEntry"></a>
# **deletePriceListEntry**
> deletePriceListEntry(priceListCode, productCode, currencyCode, startDate)

Delete Price List Entry by Currency

Deletes a price liste entry for a particular product and currency code.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPriceListEntries"></a>
# **getPriceListEntries**
> PriceListEntryCollection getPriceListEntries(priceListCode, startIndex, pageSize, sortBy, filter, responseFields)

Get Price List Entries

Retrieves the entries within a price list.

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PriceListEntryCollection result = apiInstance.getPriceListEntries(priceListCode, startIndex, pageSize, sortBy, filter, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PriceListEntryCollection**](PriceListEntryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPriceListEntry"></a>
# **getPriceListEntry**
> PriceListEntry getPriceListEntry(priceListCode, productCode, currencyCode, startDate, responseFields)

Get Price List Entries by Currency

Retrieves price list entries for a particular product and currency code.

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    String productCode = "productCode_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PriceListEntry result = apiInstance.getPriceListEntry(priceListCode, productCode, currencyCode, startDate, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PriceListEntry**](PriceListEntry.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePriceListEntry"></a>
# **updatePriceListEntry**
> PriceListEntry updatePriceListEntry(priceListCode, productCode, currencyCode, startDate, responseFields, priceListEntry)

Update Price List Entry by Currency

Updates price list entry for a particular product and currency code.

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

    PriceListEntriesApi apiInstance = new PriceListEntriesApi(defaultClient);
    String priceListCode = "priceListCode_example"; // String | 
    String productCode = "productCode_example"; // String | 
    String currencyCode = "currencyCode_example"; // String | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PriceListEntry priceListEntry = new PriceListEntry(); // PriceListEntry | 
    try {
      PriceListEntry result = apiInstance.updatePriceListEntry(priceListCode, productCode, currencyCode, startDate, responseFields, priceListEntry);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **priceListEntry** | [**PriceListEntry**](PriceListEntry.md)|  | [optional] |

### Return type

[**PriceListEntry**](PriceListEntry.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

