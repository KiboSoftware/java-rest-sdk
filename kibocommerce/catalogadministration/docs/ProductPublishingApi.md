# ProductPublishingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignProductsToPublishSet**](ProductPublishingApi.md#assignProductsToPublishSet) | **POST** /commerce/catalog/admin/publishing/publishsets | Assign Products to Publish Sets |
| [**deletePublishSet**](ProductPublishingApi.md#deletePublishSet) | **DELETE** /commerce/catalog/admin/publishing/publishsets/{publishSetCode} | Delete Publish Set |
| [**getPublishSet**](ProductPublishingApi.md#getPublishSet) | **GET** /commerce/catalog/admin/publishing/publishsets/{publishSetCode} | Get Publish Set |
| [**getPublishSets**](ProductPublishingApi.md#getPublishSets) | **GET** /commerce/catalog/admin/publishing/publishsets | Get Publish Sets |
| [**publishDrafts**](ProductPublishingApi.md#publishDrafts) | **POST** /commerce/catalog/admin/publishing/publishdrafts | Publish Draft Products |


<a name="assignProductsToPublishSet"></a>
# **assignProductsToPublishSet**
> PublishSet assignProductsToPublishSet(responseFields, publishSet)

Assign Products to Publish Sets

Assign products to publish sets.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPublishingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductPublishingApi apiInstance = new ProductPublishingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PublishSet publishSet = new PublishSet(); // PublishSet | 
    try {
      PublishSet result = apiInstance.assignProductsToPublishSet(responseFields, publishSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPublishingApi#assignProductsToPublishSet");
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
| **publishSet** | [**PublishSet**](PublishSet.md)|  | [optional] |

### Return type

[**PublishSet**](PublishSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deletePublishSet"></a>
# **deletePublishSet**
> deletePublishSet(publishSetCode, discardDrafts)

Delete Publish Set

Removes all details about a PublishSet from the product service. If the discardDrafts param is true, it also deletes the product drafts.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPublishingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductPublishingApi apiInstance = new ProductPublishingApi(defaultClient);
    String publishSetCode = "publishSetCode_example"; // String | The code of the PublishSet to delete
    Boolean discardDrafts = false; // Boolean | Whether to also discard the drafts for this publish set.
    try {
      apiInstance.deletePublishSet(publishSetCode, discardDrafts);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPublishingApi#deletePublishSet");
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
| **publishSetCode** | **String**| The code of the PublishSet to delete | |
| **discardDrafts** | **Boolean**| Whether to also discard the drafts for this publish set. | [optional] [default to false] |

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

<a name="getPublishSet"></a>
# **getPublishSet**
> PublishSet getPublishSet(publishSetCode, responseFields)

Get Publish Set

Retrieves the details of a single PublishSet.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPublishingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductPublishingApi apiInstance = new ProductPublishingApi(defaultClient);
    String publishSetCode = "publishSetCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PublishSet result = apiInstance.getPublishSet(publishSetCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPublishingApi#getPublishSet");
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
| **publishSetCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PublishSet**](PublishSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPublishSets"></a>
# **getPublishSets**
> PublishSetCollection getPublishSets(responseFields)

Get Publish Sets

Retrieves a list of PublishSets including the product counts.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPublishingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductPublishingApi apiInstance = new ProductPublishingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PublishSetCollection result = apiInstance.getPublishSets(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPublishingApi#getPublishSets");
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

[**PublishSetCollection**](PublishSetCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="publishDrafts"></a>
# **publishDrafts**
> publishDrafts(responseFields, publishingScope)

Publish Draft Products

Publis draft products.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductPublishingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductPublishingApi apiInstance = new ProductPublishingApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PublishingScope publishingScope = new PublishingScope(); // PublishingScope | 
    try {
      apiInstance.publishDrafts(responseFields, publishingScope);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductPublishingApi#publishDrafts");
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
| **publishingScope** | [**PublishingScope**](PublishingScope.md)|  | [optional] |

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

