# EntityListsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEntityList**](EntityListsApi.md#createEntityList) | **POST** /platform/entitylists | Add EntityList |
| [**deleteEntityList**](EntityListsApi.md#deleteEntityList) | **DELETE** /platform/entitylists/{entityListFullName} | Delete EntityList |
| [**getEntityList**](EntityListsApi.md#getEntityList) | **GET** /platform/entitylists/{entityListFullName} | Get EntityList |
| [**getEntityLists**](EntityListsApi.md#getEntityLists) | **GET** /platform/entitylists | Get EntityLists |
| [**updateEntityList**](EntityListsApi.md#updateEntityList) | **PUT** /platform/entitylists/{entityListFullName} | Update Entitylist |


<a name="createEntityList"></a>
# **createEntityList**
> EntityList createEntityList(responseFields, entityList)

Add EntityList

Create a new EntityList for a specific tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntityListsApi apiInstance = new EntityListsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    EntityList entityList = new EntityList(); // EntityList | The EntityList definition
    try {
      EntityList result = apiInstance.createEntityList(responseFields, entityList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityListsApi#createEntityList");
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
| **entityList** | [**EntityList**](EntityList.md)| The EntityList definition | [optional] |

### Return type

[**EntityList**](EntityList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteEntityList"></a>
# **deleteEntityList**
> deleteEntityList(entityListFullName)

Delete EntityList

Delete an existing EntityList for a specific tenant. This will also delete all Entities in all instances of this EntityList for the tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntityListsApi apiInstance = new EntityListsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    try {
      apiInstance.deleteEntityList(entityListFullName);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityListsApi#deleteEntityList");
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
| **entityListFullName** | **String**| The full name of the EntityList including namespace in name@nameSpace format | |

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

<a name="getEntityList"></a>
# **getEntityList**
> EntityList getEntityList(entityListFullName, responseFields)

Get EntityList

Get an existing EntityList definition for a specific tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntityListsApi apiInstance = new EntityListsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      EntityList result = apiInstance.getEntityList(entityListFullName, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityListsApi#getEntityList");
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
| **entityListFullName** | **String**| The full name of the EntityList including namespace in name@nameSpace format | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**EntityList**](EntityList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getEntityLists"></a>
# **getEntityLists**
> EntityListCollection getEntityLists(pageSize, startIndex, filter, sortBy, responseFields)

Get EntityLists

Get a filtered list of EntityLists for a specific tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntityListsApi apiInstance = new EntityListsApi(defaultClient);
    Integer pageSize = 10; // Integer | 
    Integer startIndex = 0; // Integer | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      EntityListCollection result = apiInstance.getEntityLists(pageSize, startIndex, filter, sortBy, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityListsApi#getEntityLists");
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
| **pageSize** | **Integer**|  | [optional] [default to 10] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**EntityListCollection**](EntityListCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateEntityList"></a>
# **updateEntityList**
> EntityList updateEntityList(entityListFullName, responseFields, entityList)

Update Entitylist

Update an existing Entitylist for a specific tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntityListsApi apiInstance = new EntityListsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    EntityList entityList = new EntityList(); // EntityList | The EntityList definition
    try {
      EntityList result = apiInstance.updateEntityList(entityListFullName, responseFields, entityList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityListsApi#updateEntityList");
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
| **entityListFullName** | **String**| The full name of the EntityList including namespace in name@nameSpace format | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **entityList** | [**EntityList**](EntityList.md)| The EntityList definition | [optional] |

### Return type

[**EntityList**](EntityList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

