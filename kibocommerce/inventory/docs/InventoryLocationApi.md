# InventoryLocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationGroups**](InventoryLocationApi.md#getLocationGroups) | **GET** /commerce/inventory/v1/location/{locationGroupCode} | Get Location Groups |
| [**getLocations**](InventoryLocationApi.md#getLocations) | **GET** /commerce/inventory/v1/location/{locationCode} | Get Locations |
| [**getLocations_0**](InventoryLocationApi.md#getLocations_0) | **GET** /commerce/inventory/v1/location | Get Locations |
| [**saveLocation**](InventoryLocationApi.md#saveLocation) | **POST** /commerce/inventory/v1/location | Save Location |


<a name="getLocationGroups"></a>
# **getLocationGroups**
> List&lt;LocationGroupResponse&gt; getLocationGroups(xVolTenant, locationGroupCode)

Get Location Groups

Get LocationGroups

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

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

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String locationGroupCode = "locationGroupCode_example"; // String | Location Group Code of the location to get
    try {
      List<LocationGroupResponse> result = apiInstance.getLocationGroups(xVolTenant, locationGroupCode);
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **locationGroupCode** | **String**| Location Group Code of the location to get | |

### Return type

[**List&lt;LocationGroupResponse&gt;**](LocationGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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
> List&lt;LocationResponse&gt; getLocations(xVolTenant, locationCode)

Get Locations

Get Locations

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

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

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String locationCode = "locationCode_example"; // String | Location Code of the location to get
    try {
      List<LocationResponse> result = apiInstance.getLocations(xVolTenant, locationCode);
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **locationCode** | **String**| Location Code of the location to get | |

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Location Not Found |  -  |

<a name="getLocations_0"></a>
# **getLocations_0**
> List&lt;LocationResponse&gt; getLocations_0(xVolTenant)

Get Locations

Get Locations

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

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

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    try {
      List<LocationResponse> result = apiInstance.getLocations_0(xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryLocationApi#getLocations_0");
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

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

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

<a name="saveLocation"></a>
# **saveLocation**
> List&lt;LocationResponse&gt; saveLocation(xVolTenant, locationRequest)

Save Location

Save Location

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryLocationApi;

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

    InventoryLocationApi apiInstance = new InventoryLocationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    LocationRequest locationRequest = new LocationRequest(); // LocationRequest | Location Request Object
    try {
      List<LocationResponse> result = apiInstance.saveLocation(xVolTenant, locationRequest);
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **locationRequest** | [**LocationRequest**](LocationRequest.md)| Location Request Object | |

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

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

