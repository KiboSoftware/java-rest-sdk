# ListViewsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEntityListView**](ListViewsApi.md#createEntityListView) | **POST** /platform/entitylists/{entityListFullName}/views | Add ListView |
| [**deleteEntityListView**](ListViewsApi.md#deleteEntityListView) | **DELETE** /platform/entitylists/{entityListFullName}/views/{viewName} | Delete ListView |
| [**getEntityListView**](ListViewsApi.md#getEntityListView) | **GET** /platform/entitylists/{entityListFullName}/views/{viewName} | Get ListView |
| [**getEntityListViews**](ListViewsApi.md#getEntityListViews) | **GET** /platform/entitylists/{entityListFullName}/views | Get  ListViews |
| [**updateEntityListView**](ListViewsApi.md#updateEntityListView) | **PUT** /platform/entitylists/{entityListFullName}/views/{viewName} | Update ListView |


<a name="createEntityListView"></a>
# **createEntityListView**
> ListView createEntityListView(entityListFullName, listView)

Add ListView

Create a new ListView definition for a specific EntityList for a specific tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.ListViewsApi;

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

    ListViewsApi apiInstance = new ListViewsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    ListView listView = new ListView(); // ListView | The new ListView definition
    try {
      ListView result = apiInstance.createEntityListView(entityListFullName, listView);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListViewsApi#createEntityListView");
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
| **listView** | [**ListView**](ListView.md)| The new ListView definition | [optional] |

### Return type

[**ListView**](ListView.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteEntityListView"></a>
# **deleteEntityListView**
> deleteEntityListView(entityListFullName, viewName)

Delete ListView

Delete an existing ListView definition for a specific EntityList for a specific tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.ListViewsApi;

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

    ListViewsApi apiInstance = new ListViewsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String viewName = "viewName_example"; // String | The name of the ListView to delete
    try {
      apiInstance.deleteEntityListView(entityListFullName, viewName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListViewsApi#deleteEntityListView");
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
| **viewName** | **String**| The name of the ListView to delete | |

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

<a name="getEntityListView"></a>
# **getEntityListView**
> ListView getEntityListView(entityListFullName, viewName)

Get ListView

Returns a specific ListView definition for a specific EntityList for a specific tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.ListViewsApi;

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

    ListViewsApi apiInstance = new ListViewsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String viewName = "viewName_example"; // String | The name of the ListView
    try {
      ListView result = apiInstance.getEntityListView(entityListFullName, viewName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListViewsApi#getEntityListView");
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

### Return type

[**ListView**](ListView.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getEntityListViews"></a>
# **getEntityListViews**
> ListViewCollection getEntityListViews(entityListFullName)

Get  ListViews

Get all of the defined ListViews for a specific EntityList for a specific tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.ListViewsApi;

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

    ListViewsApi apiInstance = new ListViewsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    try {
      ListViewCollection result = apiInstance.getEntityListViews(entityListFullName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListViewsApi#getEntityListViews");
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

[**ListViewCollection**](ListViewCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateEntityListView"></a>
# **updateEntityListView**
> ListView updateEntityListView(entityListFullName, viewName, listView)

Update ListView

Update an existing ListView definition for a specific EntityList for a specific tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.entities.ApiClient;
import com.kibocommerce.sdk.entities.ApiException;
import com.kibocommerce.sdk.entities.Configuration;
import com.kibocommerce.sdk.entities.auth.*;
import com.kibocommerce.sdk.entities.models.*;
import com.kibocommerce.sdk.entities.api.ListViewsApi;

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

    ListViewsApi apiInstance = new ListViewsApi(defaultClient);
    String entityListFullName = "entityListFullName_example"; // String | The full name of the EntityList including namespace in name@nameSpace format
    String viewName = "viewName_example"; // String | The name of the ListView
    ListView listView = new ListView(); // ListView | The udpated ListView definition
    try {
      ListView result = apiInstance.updateEntityListView(entityListFullName, viewName, listView);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListViewsApi#updateEntityListView");
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
| **listView** | [**ListView**](ListView.md)| The udpated ListView definition | [optional] |

### Return type

[**ListView**](ListView.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

