# DocumentPublishSetApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPublishSetItems**](DocumentPublishSetApi.md#addPublishSetItems) | **PUT** /content/publishsets/{code}/items | Add Publish Set Items |
| [**deletePublishSet**](DocumentPublishSetApi.md#deletePublishSet) | **POST** /content/publishsets/{code} | Delete Publish Set |
| [**getPublishSetItems**](DocumentPublishSetApi.md#getPublishSetItems) | **GET** /content/publishsets/{code}/items | Get Publish Set Items |
| [**getPublishSets**](DocumentPublishSetApi.md#getPublishSets) | **GET** /content/publishsets | Get Publish Set |


<a name="addPublishSetItems"></a>
# **addPublishSetItems**
> addPublishSetItems(code, addOrDeletePublishItem)

Add Publish Set Items

Adds a set of documents by id to a publish set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPublishSetApi;

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

    DocumentPublishSetApi apiInstance = new DocumentPublishSetApi(defaultClient);
    String code = "code_example"; // String | code of the publish set.  Use UNASSIGNED or ALL to denote those special cases
    List<AddOrDeletePublishItem> addOrDeletePublishItem = Arrays.asList(); // List<AddOrDeletePublishItem> | documentId/doclist pairs to add to the publish set
    try {
      apiInstance.addPublishSetItems(code, addOrDeletePublishItem);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPublishSetApi#addPublishSetItems");
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
| **code** | **String**| code of the publish set.  Use UNASSIGNED or ALL to denote those special cases | |
| **addOrDeletePublishItem** | [**List&lt;AddOrDeletePublishItem&gt;**](AddOrDeletePublishItem.md)| documentId/doclist pairs to add to the publish set | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deletePublishSet"></a>
# **deletePublishSet**
> deletePublishSet(code, shouldDiscard)

Delete Publish Set

Adds a set of documents by id to a publish set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPublishSetApi;

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

    DocumentPublishSetApi apiInstance = new DocumentPublishSetApi(defaultClient);
    String code = "code_example"; // String | code of the publish set.  Use UNASSIGNED or ALL to denote those special cases
    Boolean shouldDiscard = true; // Boolean | should trash the drafts in the publish set as well
    try {
      apiInstance.deletePublishSet(code, shouldDiscard);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPublishSetApi#deletePublishSet");
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
| **code** | **String**| code of the publish set.  Use UNASSIGNED or ALL to denote those special cases | |
| **shouldDiscard** | **Boolean**| should trash the drafts in the publish set as well | [optional] |

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

<a name="getPublishSetItems"></a>
# **getPublishSetItems**
> DocumentDraftSummaryPagedCollection getPublishSetItems(code, pageSize, startIndex, sortBy, filter)

Get Publish Set Items

Retrieve a paged collection of publish set Items.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPublishSetApi;

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

    DocumentPublishSetApi apiInstance = new DocumentPublishSetApi(defaultClient);
    String code = "code_example"; // String | code of the publish set.  Use UNASSIGNED or ALL to denote those special cases
    Integer pageSize = 100; // Integer | maximum number of items to return
    Integer startIndex = 0; // Integer | start index
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      DocumentDraftSummaryPagedCollection result = apiInstance.getPublishSetItems(code, pageSize, startIndex, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPublishSetApi#getPublishSetItems");
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
| **code** | **String**| code of the publish set.  Use UNASSIGNED or ALL to denote those special cases | |
| **pageSize** | **Integer**| maximum number of items to return | [optional] [default to 100] |
| **startIndex** | **Integer**| start index | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**DocumentDraftSummaryPagedCollection**](DocumentDraftSummaryPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPublishSets"></a>
# **getPublishSets**
> PublishSetSummaryPagedCollection getPublishSets(pageSize, startIndex)

Get Publish Set

Returns a List of current Publishing sets with counts of drafts in each.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPublishSetApi;

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

    DocumentPublishSetApi apiInstance = new DocumentPublishSetApi(defaultClient);
    Integer pageSize = 100; // Integer | maximum number of items to return
    Integer startIndex = 0; // Integer | start index
    try {
      PublishSetSummaryPagedCollection result = apiInstance.getPublishSets(pageSize, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPublishSetApi#getPublishSets");
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
| **pageSize** | **Integer**| maximum number of items to return | [optional] [default to 100] |
| **startIndex** | **Integer**| start index | [optional] [default to 0] |

### Return type

[**PublishSetSummaryPagedCollection**](PublishSetSummaryPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

