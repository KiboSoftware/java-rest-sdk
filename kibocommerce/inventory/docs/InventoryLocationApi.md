# InventoryLocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationGroups**](InventoryLocationApi.md#getLocationGroups) | **GET** /commerce/inventory/v1/location/{locationGroupCode} | Get Location Groups |
| [**getLocations**](InventoryLocationApi.md#getLocations) | **GET** /commerce/inventory/v1/location/{locationCode} | Get Location |
| [**getLocations1**](InventoryLocationApi.md#getLocations1) | **GET** /commerce/inventory/v1/location | Get Locations |
| [**saveLocation**](InventoryLocationApi.md#saveLocation) | **POST** /commerce/inventory/v1/location | Save Location |


<a name="getLocationGroups"></a>
# **getLocationGroups**
> List&lt;LocationGroupResponse&gt; getLocationGroups(locationGroupCode)

Get Location Groups

Get LocationGroups

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | Location Group Code of the location to get
    try {
      List<LocationGroupResponse> result = apiInstance.getLocationGroups(locationGroupCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryLocationApi#getLocationGroups");
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
| **locationGroupCode** | **String**| Location Group Code of the location to get | |

### Return type

[**List&lt;LocationGroupResponse&gt;**](LocationGroupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Location Not Found |  -  |

<a name="getLocations"></a>
# **getLocations**
> List&lt;LocationResponse&gt; getLocations(locationCode)

Get Location

Get Locations

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    String locationCode = "locationCode_example"; // String | Location Code of the location to get
    try {
      List<LocationResponse> result = apiInstance.getLocations(locationCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryLocationApi#getLocations");
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
| **locationCode** | **String**| Location Code of the location to get | |

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Location Not Found |  -  |

<a name="getLocations1"></a>
# **getLocations1**
> List&lt;LocationResponse&gt; getLocations1()

Get Locations

Get Locations

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    try {
      List<LocationResponse> result = apiInstance.getLocations1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryLocationApi#getLocations1");
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

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

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

<a name="saveLocation"></a>
# **saveLocation**
> List&lt;LocationResponse&gt; saveLocation(locationRequest)

Save Location

Save Location

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    LocationRequest locationRequest = new LocationRequest(); // LocationRequest | Location Request Object
    try {
      List<LocationResponse> result = apiInstance.saveLocation(locationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryLocationApi#saveLocation");
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
| **locationRequest** | [**LocationRequest**](LocationRequest.md)| Location Request Object | |

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

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

