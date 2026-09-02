# LocationGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLocationCodesToGroup**](LocationGroupApi.md#addLocationCodesToGroup) | **POST** /commerce/admin/locationGroups/{locationGroupCode}/locationCodes | Add location codes to a location group |
| [**addLocationGroup**](LocationGroupApi.md#addLocationGroup) | **POST** /commerce/admin/locationGroups | Add Location Group |
| [**deleteLocationGroup**](LocationGroupApi.md#deleteLocationGroup) | **DELETE** /commerce/admin/locationGroups/{locationGroupCode} | Delete Location Group |
| [**getLocationGroup**](LocationGroupApi.md#getLocationGroup) | **GET** /commerce/admin/locationGroups/{locationGroupCode} | Get Location Group |
| [**getLocationGroups**](LocationGroupApi.md#getLocationGroups) | **GET** /commerce/admin/locationGroups | Get Location Groups |
| [**patchLocationGroup**](LocationGroupApi.md#patchLocationGroup) | **PATCH** /commerce/admin/locationGroups/{locationGroupCode} | Partially Update Location Group |
| [**removeLocationCodesFromGroup**](LocationGroupApi.md#removeLocationCodesFromGroup) | **DELETE** /commerce/admin/locationGroups/{locationGroupCode}/locationCodes | Remove location codes from a location group |
| [**updateLocationGroup**](LocationGroupApi.md#updateLocationGroup) | **PUT** /commerce/admin/locationGroups/{locationGroupCode} | Update Location Group |


<a name="addLocationCodesToGroup"></a>
# **addLocationCodesToGroup**
> addLocationCodesToGroup(locationGroupCode, responseFields, locationGroupCodesRequest)

Add location codes to a location group

Add location codes to a location group

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | The unique code of the location group
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationGroupCodesRequest locationGroupCodesRequest = new LocationGroupCodesRequest(); // LocationGroupCodesRequest | Request containing location codes to add
    try {
      apiInstance.addLocationCodesToGroup(locationGroupCode, responseFields, locationGroupCodesRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#addLocationCodesToGroup");
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
| **locationGroupCode** | **String**| The unique code of the location group | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **locationGroupCodesRequest** | [**LocationGroupCodesRequest**](LocationGroupCodesRequest.md)| Request containing location codes to add | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addLocationGroup"></a>
# **addLocationGroup**
> LocationLocationGroup addLocationGroup(responseFields, locationLocationGroup)

Add Location Group

Add a location group.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationLocationGroup locationLocationGroup = new LocationLocationGroup(); // LocationLocationGroup | 
    try {
      LocationLocationGroup result = apiInstance.addLocationGroup(responseFields, locationLocationGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#addLocationGroup");
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
| **locationLocationGroup** | [**LocationLocationGroup**](LocationLocationGroup.md)|  | [optional] |

### Return type

[**LocationLocationGroup**](LocationLocationGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteLocationGroup"></a>
# **deleteLocationGroup**
> deleteLocationGroup(locationGroupCode)

Delete Location Group

Deletes a location group specified by location group code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | 
    try {
      apiInstance.deleteLocationGroup(locationGroupCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#deleteLocationGroup");
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
| **locationGroupCode** | **String**|  | |

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

<a name="getLocationGroup"></a>
# **getLocationGroup**
> LocationLocationGroup getLocationGroup(locationGroupCode, responseFields)

Get Location Group

Gets a location group by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationLocationGroup result = apiInstance.getLocationGroup(locationGroupCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#getLocationGroup");
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
| **locationGroupCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**LocationLocationGroup**](LocationLocationGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocationGroups"></a>
# **getLocationGroups**
> LocationGroupCollection getLocationGroups(startIndex, pageSize, sortBy, filter, responseFields)

Get Location Groups

Gets a collection of location groups.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationGroupCollection result = apiInstance.getLocationGroups(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#getLocationGroups");
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

[**LocationGroupCollection**](LocationGroupCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="patchLocationGroup"></a>
# **patchLocationGroup**
> LocationLocationGroup patchLocationGroup(locationGroupCode, responseFields, operation)

Partially Update Location Group

Update specific fields of a location group using RFC 6902 JSON Patch format.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | the unique code for a location group
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<Operation> operation = Arrays.asList(); // List<Operation> | JSON Patch document with operations to apply
    try {
      LocationLocationGroup result = apiInstance.patchLocationGroup(locationGroupCode, responseFields, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#patchLocationGroup");
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
| **locationGroupCode** | **String**| the unique code for a location group | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| JSON Patch document with operations to apply | [optional] |

### Return type

[**LocationLocationGroup**](LocationLocationGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeLocationCodesFromGroup"></a>
# **removeLocationCodesFromGroup**
> removeLocationCodesFromGroup(locationGroupCode, locationCodes)

Remove location codes from a location group

Remove location codes from a location group

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | The unique code of the location group
    String locationCodes = "locationCodes_example"; // String | Location codes to remove
    try {
      apiInstance.removeLocationCodesFromGroup(locationGroupCode, locationCodes);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#removeLocationCodesFromGroup");
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
| **locationGroupCode** | **String**| The unique code of the location group | |
| **locationCodes** | **String**| Location codes to remove | [optional] |

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

<a name="updateLocationGroup"></a>
# **updateLocationGroup**
> LocationLocationGroup updateLocationGroup(locationGroupCode, responseFields, locationLocationGroup)

Update Location Group

Update an existing location group.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationGroupApi apiInstance = new LocationGroupApi(defaultClient);
    String locationGroupCode = "locationGroupCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationLocationGroup locationLocationGroup = new LocationLocationGroup(); // LocationLocationGroup | 
    try {
      LocationLocationGroup result = apiInstance.updateLocationGroup(locationGroupCode, responseFields, locationLocationGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationGroupApi#updateLocationGroup");
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
| **locationGroupCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **locationLocationGroup** | [**LocationLocationGroup**](LocationLocationGroup.md)|  | [optional] |

### Return type

[**LocationLocationGroup**](LocationLocationGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

