# LocationTypeApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLocationTypeAsync**](LocationTypeApi.md#addLocationTypeAsync) | **POST** /commerce/admin/locationtypes | Add Location Type Async |
| [**deleteLocationType**](LocationTypeApi.md#deleteLocationType) | **DELETE** /commerce/admin/locationtypes/{locationTypeCode} | Delete Location Type |
| [**getLocationType**](LocationTypeApi.md#getLocationType) | **GET** /commerce/admin/locationtypes/{locationTypeCode} | Get Location Type |
| [**getLocationTypes**](LocationTypeApi.md#getLocationTypes) | **GET** /commerce/admin/locationtypes | Get Location Types |
| [**getLocationTypesWithPagination**](LocationTypeApi.md#getLocationTypesWithPagination) | **GET** /commerce/admin/locationtypes/withpagination | Get Location Types  &lt;param name&#x3D;\&quot;pageSize\&quot;&gt;&lt;/param&gt;&lt;param name&#x3D;\&quot;sortBy\&quot;&gt;&lt;/param&gt; |
| [**updateLocationType**](LocationTypeApi.md#updateLocationType) | **PUT** /commerce/admin/locationtypes/{locationTypeCode} | Update Location Type |


<a name="addLocationTypeAsync"></a>
# **addLocationTypeAsync**
> LocationType addLocationTypeAsync(locationType)

Add Location Type Async

Create a LocationType.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationTypeApi;

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

    LocationTypeApi apiInstance = new LocationTypeApi(defaultClient);
    LocationType locationType = new LocationType(); // LocationType | 
    try {
      LocationType result = apiInstance.addLocationTypeAsync(locationType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationTypeApi#addLocationTypeAsync");
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
| **locationType** | [**LocationType**](LocationType.md)|  | [optional] |

### Return type

[**LocationType**](LocationType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteLocationType"></a>
# **deleteLocationType**
> deleteLocationType(locationTypeCode)

Delete Location Type

Delete Location Type.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationTypeApi;

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

    LocationTypeApi apiInstance = new LocationTypeApi(defaultClient);
    String locationTypeCode = "locationTypeCode_example"; // String | 
    try {
      apiInstance.deleteLocationType(locationTypeCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationTypeApi#deleteLocationType");
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
| **locationTypeCode** | **String**|  | |

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

<a name="getLocationType"></a>
# **getLocationType**
> LocationType getLocationType(locationTypeCode)

Get Location Type

Get a LocationType.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationTypeApi;

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

    LocationTypeApi apiInstance = new LocationTypeApi(defaultClient);
    String locationTypeCode = "locationTypeCode_example"; // String | 
    try {
      LocationType result = apiInstance.getLocationType(locationTypeCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationTypeApi#getLocationType");
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
| **locationTypeCode** | **String**|  | |

### Return type

[**LocationType**](LocationType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocationTypes"></a>
# **getLocationTypes**
> List&lt;LocationType&gt; getLocationTypes()

Get Location Types

Get a collection of LocationTypes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationTypeApi;

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

    LocationTypeApi apiInstance = new LocationTypeApi(defaultClient);
    try {
      List<LocationType> result = apiInstance.getLocationTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationTypeApi#getLocationTypes");
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

[**List&lt;LocationType&gt;**](LocationType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocationTypesWithPagination"></a>
# **getLocationTypesWithPagination**
> LocationTypeCollection getLocationTypesWithPagination(startIndex, pageSize)

Get Location Types  &lt;param name&#x3D;\&quot;pageSize\&quot;&gt;&lt;/param&gt;&lt;param name&#x3D;\&quot;sortBy\&quot;&gt;&lt;/param&gt;

Get a collection of LocationTypes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationTypeApi;

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

    LocationTypeApi apiInstance = new LocationTypeApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    try {
      LocationTypeCollection result = apiInstance.getLocationTypesWithPagination(startIndex, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationTypeApi#getLocationTypesWithPagination");
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
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 100] |

### Return type

[**LocationTypeCollection**](LocationTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateLocationType"></a>
# **updateLocationType**
> LocationType updateLocationType(locationTypeCode, locationType)

Update Location Type

Update a LocationType.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationTypeApi;

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

    LocationTypeApi apiInstance = new LocationTypeApi(defaultClient);
    String locationTypeCode = "locationTypeCode_example"; // String | 
    LocationType locationType = new LocationType(); // LocationType | 
    try {
      LocationType result = apiInstance.updateLocationType(locationTypeCode, locationType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationTypeApi#updateLocationType");
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
| **locationTypeCode** | **String**|  | |
| **locationType** | [**LocationType**](LocationType.md)|  | [optional] |

### Return type

[**LocationType**](LocationType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

