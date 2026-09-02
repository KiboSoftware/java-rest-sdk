# TransferTimesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransferTime**](TransferTimesApi.md#createTransferTime) | **POST** /commerce/admin/locations/transfertimes | Create Transfer Time |
| [**deleteTransferTime**](TransferTimesApi.md#deleteTransferTime) | **DELETE** /commerce/admin/locations/transfertimes/{id} | Delete Transfer Time |
| [**getTransferTime**](TransferTimesApi.md#getTransferTime) | **GET** /commerce/admin/locations/transfertimes/{id} | Gets a specif transfertime by Id |
| [**getTransferTimes**](TransferTimesApi.md#getTransferTimes) | **GET** /commerce/admin/locations/transfertimes | Get Transfer Times |
| [**getTransferTimesByLocations**](TransferTimesApi.md#getTransferTimesByLocations) | **POST** /commerce/admin/locations/transfertimes/{tolocationcode} | Get Transfer Times by Locations |
| [**updateTransferTime**](TransferTimesApi.md#updateTransferTime) | **PUT** /commerce/admin/locations/transfertimes/{id} | Update Transfer Time |


<a name="createTransferTime"></a>
# **createTransferTime**
> LocationTransferTime createTransferTime(responseFields, locationTransferTime)

Create Transfer Time

Create transfertime between locations or location types

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.TransferTimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TransferTimesApi apiInstance = new TransferTimesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationTransferTime locationTransferTime = new LocationTransferTime(); // LocationTransferTime | 
    try {
      LocationTransferTime result = apiInstance.createTransferTime(responseFields, locationTransferTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferTimesApi#createTransferTime");
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
| **locationTransferTime** | [**LocationTransferTime**](LocationTransferTime.md)|  | [optional] |

### Return type

[**LocationTransferTime**](LocationTransferTime.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteTransferTime"></a>
# **deleteTransferTime**
> deleteTransferTime(id)

Delete Transfer Time

Deletes a specific transfer time

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.TransferTimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TransferTimesApi apiInstance = new TransferTimesApi(defaultClient);
    String id = "id_example"; // String | Unique Id of transfertime
    try {
      apiInstance.deleteTransferTime(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferTimesApi#deleteTransferTime");
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
| **id** | **String**| Unique Id of transfertime | |

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
| **200** | Success |  -  |

<a name="getTransferTime"></a>
# **getTransferTime**
> LocationTransferTime getTransferTime(id, responseFields)

Gets a specif transfertime by Id

Gets a specific transfertime by Id

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.TransferTimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TransferTimesApi apiInstance = new TransferTimesApi(defaultClient);
    String id = "id_example"; // String | Unique Id of transfertime
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationTransferTime result = apiInstance.getTransferTime(id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferTimesApi#getTransferTime");
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
| **id** | **String**| Unique Id of transfertime | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**LocationTransferTime**](LocationTransferTime.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTransferTimes"></a>
# **getTransferTimes**
> TransferTimesCollection getTransferTimes(startIndex, pageSize, sortBy, filter, responseFields)

Get Transfer Times

Gets list of transfertimes by filter (FromId and ToId), sort and paging.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.TransferTimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TransferTimesApi apiInstance = new TransferTimesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      TransferTimesCollection result = apiInstance.getTransferTimes(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferTimesApi#getTransferTimes");
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
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**TransferTimesCollection**](TransferTimesCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTransferTimesByLocations"></a>
# **getTransferTimesByLocations**
> List&lt;LocationTransferTime&gt; getTransferTimesByLocations(tolocationcode, responseFields, requestBody)

Get Transfer Times by Locations

Gets transfertimes between a specific ToLocation and a list of FromLocations

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.TransferTimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TransferTimesApi apiInstance = new TransferTimesApi(defaultClient);
    String tolocationcode = "tolocationcode_example"; // String | To LocationCode
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | List of FromLocationCodes
    try {
      List<LocationTransferTime> result = apiInstance.getTransferTimesByLocations(tolocationcode, responseFields, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferTimesApi#getTransferTimesByLocations");
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
| **tolocationcode** | **String**| To LocationCode | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of FromLocationCodes | [optional] |

### Return type

[**List&lt;LocationTransferTime&gt;**](LocationTransferTime.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateTransferTime"></a>
# **updateTransferTime**
> LocationTransferTime updateTransferTime(id, responseFields, locationTransferTime)

Update Transfer Time

Update a specific transfer time

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.TransferTimesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TransferTimesApi apiInstance = new TransferTimesApi(defaultClient);
    String id = "id_example"; // String | Unique Id of the transfertime
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationTransferTime locationTransferTime = new LocationTransferTime(); // LocationTransferTime | Transfertime object with changes
    try {
      LocationTransferTime result = apiInstance.updateTransferTime(id, responseFields, locationTransferTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferTimesApi#updateTransferTime");
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
| **id** | **String**| Unique Id of the transfertime | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **locationTransferTime** | [**LocationTransferTime**](LocationTransferTime.md)| Transfertime object with changes | [optional] |

### Return type

[**LocationTransferTime**](LocationTransferTime.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

