# InventoryFetchFileConfigApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFetchConfig**](InventoryFetchFileConfigApi.md#deleteFetchConfig) | **DELETE** /commerce/inventory/v1/config/fetchfile/{fetchFileConfigID} | Delete Fetch Config |
| [**getFetchConfig**](InventoryFetchFileConfigApi.md#getFetchConfig) | **GET** /commerce/inventory/v1/config/fetchfile | Get Fetch Config |
| [**saveFetchConfig**](InventoryFetchFileConfigApi.md#saveFetchConfig) | **POST** /commerce/inventory/v1/config/fetchfile | Save Fetch Config |
| [**testConnection**](InventoryFetchFileConfigApi.md#testConnection) | **GET** /commerce/inventory/v1/config/fetchfile/testConnection/{fetchFileConfigID} | Test Connection |


<a name="deleteFetchConfig"></a>
# **deleteFetchConfig**
> DeletedResponse deleteFetchConfig(xVolTenant, fetchFileConfigID)

Delete Fetch Config

Deletes a fetch file config

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

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

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    Long fetchFileConfigID = 56L; // Long | Id of fetch file config
    try {
      DeletedResponse result = apiInstance.deleteFetchConfig(xVolTenant, fetchFileConfigID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryFetchFileConfigApi#deleteFetchConfig");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **fetchFileConfigID** | **Long**| Id of fetch file config | |

### Return type

[**DeletedResponse**](DeletedResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a name="getFetchConfig"></a>
# **getFetchConfig**
> MFetchFileConfig getFetchConfig(xVolTenant)

Get Fetch Config

Get the Fetch File Configs for the current tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

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

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    try {
      MFetchFileConfig result = apiInstance.getFetchConfig(xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryFetchFileConfigApi#getFetchConfig");
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
| **xVolTenant** | **Integer**| Tenant ID | |

### Return type

[**MFetchFileConfig**](MFetchFileConfig.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

<a name="saveFetchConfig"></a>
# **saveFetchConfig**
> BaseResponse saveFetchConfig(xVolTenant, fetchFileConfigRequest)

Save Fetch Config

Save a new Fetch File Config

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

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

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    FetchFileConfigRequest fetchFileConfigRequest = new FetchFileConfigRequest(); // FetchFileConfigRequest | Request to fetch file configs
    try {
      BaseResponse result = apiInstance.saveFetchConfig(xVolTenant, fetchFileConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryFetchFileConfigApi#saveFetchConfig");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **fetchFileConfigRequest** | [**FetchFileConfigRequest**](FetchFileConfigRequest.md)| Request to fetch file configs | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="testConnection"></a>
# **testConnection**
> FetchFileConnectionResponse testConnection(xVolTenant, fetchFileConfigID)

Test Connection

Attempts to connect to a fetch file endpoint and lists current files if successful

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

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

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    Long fetchFileConfigID = 56L; // Long | Id of fetch file config
    try {
      FetchFileConnectionResponse result = apiInstance.testConnection(xVolTenant, fetchFileConfigID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryFetchFileConfigApi#testConnection");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **fetchFileConfigID** | **Long**| Id of fetch file config | |

### Return type

[**FetchFileConnectionResponse**](FetchFileConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

