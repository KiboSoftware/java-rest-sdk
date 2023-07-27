# EntityContainersApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEntityContainer**](EntityContainersApi.md#getEntityContainer) | **GET** /platform/entitylists/{entityListFullName}/entityContainers/{id} | Get Entity Container |
| [**getEntityContainers**](EntityContainersApi.md#getEntityContainers) | **GET** /platform/entitylists/{entityListFullName}/entityContainers | Get Entity Containers |
| [**getViewEntityContainer**](EntityContainersApi.md#getViewEntityContainer) | **GET** /platform/entitylists/{entityListFullName}/views/{viewName}/entityContainers/{entityId} | Get  Entity View Container |
| [**getViewEntityContainers**](EntityContainersApi.md#getViewEntityContainers) | **GET** /platform/entitylists/{entityListFullName}/views/{viewName}/entityContainers | Get Entity View Containers |


<a name="getEntityContainer"></a>
# **getEntityContainer**
> EntityContainer getEntityContainer(entityListFullName, id)

Get Entity Container

Get a specific Entity Container from an  EntityList instance

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityContainersApi;

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

    EntityContainersApi apiInstance = new EntityContainersApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String id = "id_example"; // String | The unique id of the Entity
    try {
      EntityContainer result = apiInstance.getEntityContainer(entityListFullName, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityContainersApi#getEntityContainer");
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

[**EntityContainer**](EntityContainer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getEntityContainers"></a>
# **getEntityContainers**
> EntityContainerCollection getEntityContainers(entityListFullName, pageSize, startIndex, filter, sortBy)

Get Entity Containers

Get a filtered collection of Entity Containers from an Entity List instance

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityContainersApi;

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

    EntityContainersApi apiInstance = new EntityContainersApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    Integer pageSize = 10; // Integer | 
    Integer startIndex = 0; // Integer | 
    String filter = "filter_example"; // String | 
    String sortBy = "sortBy_example"; // String | 
    try {
      EntityContainerCollection result = apiInstance.getEntityContainers(entityListFullName, pageSize, startIndex, filter, sortBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityContainersApi#getEntityContainers");
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

### Return type

[**EntityContainerCollection**](EntityContainerCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getViewEntityContainer"></a>
# **getViewEntityContainer**
> EntityContainer getViewEntityContainer(entityListFullName, viewName, entityId)

Get  Entity View Container

Get an Entity Container for a specific Entity in a ListView on an EntityList

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityContainersApi;

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

    EntityContainersApi apiInstance = new EntityContainersApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String viewName = "viewName_example"; // String | The name of the ListView
    String entityId = "entityId_example"; // String | The unique Entity id
    try {
      EntityContainer result = apiInstance.getViewEntityContainer(entityListFullName, viewName, entityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityContainersApi#getViewEntityContainer");
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

### Return type

[**EntityContainer**](EntityContainer.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getViewEntityContainers"></a>
# **getViewEntityContainers**
> EntityContainerCollection getViewEntityContainers(entityListFullName, viewName, pageSize, startIndex, filter)

Get Entity View Containers

Get a filtered collection of Entity Containers for a ListView on an EntityList

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.EntityContainersApi;

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

    EntityContainersApi apiInstance = new EntityContainersApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String viewName = "viewName_example"; // String | The name of the ListView
    Integer pageSize = 10; // Integer | 
    Integer startIndex = 0; // Integer | 
    String filter = "filter_example"; // String | 
    try {
      EntityContainerCollection result = apiInstance.getViewEntityContainers(entityListFullName, viewName, pageSize, startIndex, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntityContainersApi#getViewEntityContainers");
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

### Return type

[**EntityContainerCollection**](EntityContainerCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

