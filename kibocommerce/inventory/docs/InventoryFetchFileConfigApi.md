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
> DeletedResponse deleteFetchConfig(fetchFileConfigID)

Delete Fetch Config

Deletes a fetch file configuration.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    Long fetchFileConfigID = 56L; // Long | Id of fetch file config
    try {
      DeletedResponse result = apiInstance.deleteFetchConfig(fetchFileConfigID);
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
| **fetchFileConfigID** | **Long**| Id of fetch file config | |

### Return type

[**DeletedResponse**](DeletedResponse.md)

### Authorization

No authorization required

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
> MFetchFileConfig getFetchConfig()

Get Fetch Config

Get the Fetch File Configs for the current tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    try {
      MFetchFileConfig result = apiInstance.getFetchConfig();
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
This endpoint does not need any parameter.

### Return type

[**MFetchFileConfig**](MFetchFileConfig.md)

### Authorization

No authorization required

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
> BaseResponse saveFetchConfig(fetchFileConfigRequest)

Save Fetch Config

Save a new Fetch File Configuration.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    FetchFileConfigRequest fetchFileConfigRequest = new FetchFileConfigRequest(); // FetchFileConfigRequest | Request to fetch file configs
    try {
      BaseResponse result = apiInstance.saveFetchConfig(fetchFileConfigRequest);
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
| **fetchFileConfigRequest** | [**FetchFileConfigRequest**](FetchFileConfigRequest.md)| Request to fetch file configs | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

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
> FetchFileConnectionResponse testConnection(fetchFileConfigID)

Test Connection

Attempts to connect to a fetch file endpoint and lists current files if successful

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryFetchFileConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryFetchFileConfigApi apiInstance = new InventoryFetchFileConfigApi(defaultClient);
    Long fetchFileConfigID = 56L; // Long | Id of fetch file config
    try {
      FetchFileConnectionResponse result = apiInstance.testConnection(fetchFileConfigID);
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
| **fetchFileConfigID** | **Long**| Id of fetch file config | |

### Return type

[**FetchFileConnectionResponse**](FetchFileConnectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

