# EntitiesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEntity**](EntitiesApi.md#deleteEntity) | **DELETE** /platform/entitylists/{entityListFullName}/entities/{id} | Delete Entity |
| [**getEntities**](EntitiesApi.md#getEntities) | **GET** /platform/entitylists/{entityListFullName}/entities | Get Entities |
| [**getEntity**](EntitiesApi.md#getEntity) | **GET** /platform/entitylists/{entityListFullName}/entities/{id} | Get Entity |
| [**getViewEntities**](EntitiesApi.md#getViewEntities) | **GET** /platform/entitylists/{entityListFullName}/views/{viewName}/entities | Get View Entities |
| [**getViewEntity**](EntitiesApi.md#getViewEntity) | **GET** /platform/entitylists/{entityListFullName}/views/{viewName}/entities/{entityId} | Get View Entity |
| [**insertEntity**](EntitiesApi.md#insertEntity) | **POST** /platform/entitylists/{entityListFullName}/entities | Add Entity |
| [**updateEntity**](EntitiesApi.md#updateEntity) | **PUT** /platform/entitylists/{entityListFullName}/entities/{id} | Update Entity |


<a name="deleteEntity"></a>
# **deleteEntity**
> deleteEntity(entityListFullName, id)

Delete Entity

Delete an existing Entity from an EntityList instance

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String id = "id_example"; // String | The unique id of the Entity
    try {
      apiInstance.deleteEntity(entityListFullName, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#deleteEntity");
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
| **id** | **String**| The unique id of the Entity | |

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

<a name="getEntities"></a>
# **getEntities**
> EntityCollection getEntities(entityListFullName, pageSize, startIndex, filter, sortBy, responseFields)

Get Entities

Get a filtered collection of Entities from an EntityList instance

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    Integer pageSize = 10; // Integer | 
    Integer startIndex = 0; // Integer | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      EntityCollection result = apiInstance.getEntities(entityListFullName, pageSize, startIndex, filter, sortBy, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getEntities");
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
| **pageSize** | **Integer**|  | [optional] [default to 10] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **filter** | **String**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**EntityCollection**](EntityCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getEntity"></a>
# **getEntity**
> Object getEntity(entityListFullName, id, responseFields)

Get Entity

Get a specific Entity from an EntityList instance

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String id = "id_example"; // String | The unique id of the Entity
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getEntity(entityListFullName, id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getEntity");
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
| **id** | **String**| The unique id of the Entity | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getViewEntities"></a>
# **getViewEntities**
> EntityCollection getViewEntities(entityListFullName, viewName, pageSize, startIndex, filter, responseFields)

Get View Entities

Get a filtered collection of Entities for a ListView on an EntityList

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String viewName = "viewName_example"; // String | The name of the ListView
    Integer pageSize = 10; // Integer | 
    Integer startIndex = 0; // Integer | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      EntityCollection result = apiInstance.getViewEntities(entityListFullName, viewName, pageSize, startIndex, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getViewEntities");
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
| **viewName** | **String**| The name of the ListView | |
| **pageSize** | **Integer**|  | [optional] [default to 10] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**EntityCollection**](EntityCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getViewEntity"></a>
# **getViewEntity**
> Object getViewEntity(entityListFullName, viewName, entityId, responseFields)

Get View Entity

Get a specific Entity in a ListView on an EntityList

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String viewName = "viewName_example"; // String | The name of the ListView
    String entityId = "entityId_example"; // String | The unique Entity id
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getViewEntity(entityListFullName, viewName, entityId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#getViewEntity");
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
| **viewName** | **String**| The name of the ListView | |
| **entityId** | **String**| The unique Entity id | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="insertEntity"></a>
# **insertEntity**
> Object insertEntity(entityListFullName, responseFields, body)

Add Entity

Insert an Entity into an EntityList instance

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Object body = null; // Object | The Entity in json format
    try {
      Object result = apiInstance.insertEntity(entityListFullName, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#insertEntity");
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
| **body** | **Object**| The Entity in json format | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateEntity"></a>
# **updateEntity**
> Object updateEntity(entityListFullName, id, responseFields, body)

Update Entity

Update an existing Entity in an EntityList instance

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    EntitiesApi apiInstance = new EntitiesApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String id = "id_example"; // String | The unique id of the Entity
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Object body = null; // Object | The Entity in json format
    try {
      Object result = apiInstance.updateEntity(entityListFullName, id, responseFields, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntitiesApi#updateEntity");
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
| **id** | **String**| The unique id of the Entity | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **body** | **Object**| The Entity in json format | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

