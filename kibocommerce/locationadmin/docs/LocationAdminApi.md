# LocationAdminApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLocation**](LocationAdminApi.md#addLocation) | **POST** /commerce/admin/locations | Add Location |
| [**addLocationAttribute**](LocationAdminApi.md#addLocationAttribute) | **POST** /commerce/admin/locations/{locationCode}/attributes | Add Location Attribute |
| [**createCutoffTimeOverride**](LocationAdminApi.md#createCutoffTimeOverride) | **POST** /commerce/admin/locations/cutoffoverrides | Create Cutoff Time Override |
| [**deleteCutoffTimeOverride**](LocationAdminApi.md#deleteCutoffTimeOverride) | **DELETE** /commerce/admin/locations/cutoffoverrides/{overrideId} | Delete Cutoff Time Override |
| [**getCutoffTimeByDetails**](LocationAdminApi.md#getCutoffTimeByDetails) | **POST** /commerce/admin/locations/{locationCode}/cutofftime | Get Location Cut Off Time |
| [**getCutoffTimeOverrideById**](LocationAdminApi.md#getCutoffTimeOverrideById) | **GET** /commerce/admin/locations/cutoffoverrides/{overrideId} | Get Cutoff Time Override by Id |
| [**getCutoffTimeOverrides**](LocationAdminApi.md#getCutoffTimeOverrides) | **GET** /commerce/admin/locations/cutoffoverrides | Get Cutoff Time Overrides |
| [**getLocation**](LocationAdminApi.md#getLocation) | **GET** /commerce/admin/locations/{locationCode} | Get Location |
| [**getLocationAttribute**](LocationAdminApi.md#getLocationAttribute) | **GET** /commerce/admin/locations/{locationCode}/attributes/{fullyQualifiedName} | Get Location Attribute |
| [**getLocations**](LocationAdminApi.md#getLocations) | **GET** /commerce/admin/locations | Get Locations |
| [**patchLocation**](LocationAdminApi.md#patchLocation) | **PATCH** /commerce/admin/locations/{locationCode} | Partially Update Location |
| [**removeLocationAttribute**](LocationAdminApi.md#removeLocationAttribute) | **DELETE** /commerce/admin/locations/{locationCode}/attributes/{fullyQualifiedName} | Remove Location Attribute |
| [**updateLocation**](LocationAdminApi.md#updateLocation) | **PUT** /commerce/admin/locations/{locationCode} | Update Location |
| [**updateLocationAttribute**](LocationAdminApi.md#updateLocationAttribute) | **PUT** /commerce/admin/locations/{locationCode}/attributes/{fullyQualifiedName} | Update Location Attribute |


<a name="addLocation"></a>
# **addLocation**
> Location addLocation(responseFields, location)

Add Location

Add a new location.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Location location = new Location(); // Location | 
    try {
      Location result = apiInstance.addLocation(responseFields, location);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#addLocation");
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
| **location** | [**Location**](Location.md)|  | [optional] |

### Return type

[**Location**](Location.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addLocationAttribute"></a>
# **addLocationAttribute**
> LocationAttribute addLocationAttribute(locationCode, responseFields, locationAttributeAddRequest)

Add Location Attribute

Add a new attribute to a location.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | The unique code for a location
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationAttributeAddRequest locationAttributeAddRequest = new LocationAttributeAddRequest(); // LocationAttributeAddRequest | The location attribute to add
    try {
      LocationAttribute result = apiInstance.addLocationAttribute(locationCode, responseFields, locationAttributeAddRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#addLocationAttribute");
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
| **locationCode** | **String**| The unique code for a location | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **locationAttributeAddRequest** | [**LocationAttributeAddRequest**](LocationAttributeAddRequest.md)| The location attribute to add | [optional] |

### Return type

[**LocationAttribute**](LocationAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createCutoffTimeOverride"></a>
# **createCutoffTimeOverride**
> CutoffTimeOverride createCutoffTimeOverride(responseFields, cutoffTimeOverride)

Create Cutoff Time Override

Creates a new Cut Off Time override.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CutoffTimeOverride cutoffTimeOverride = new CutoffTimeOverride(); // CutoffTimeOverride | 
    try {
      CutoffTimeOverride result = apiInstance.createCutoffTimeOverride(responseFields, cutoffTimeOverride);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#createCutoffTimeOverride");
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
| **cutoffTimeOverride** | [**CutoffTimeOverride**](CutoffTimeOverride.md)|  | [optional] |

### Return type

[**CutoffTimeOverride**](CutoffTimeOverride.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCutoffTimeOverride"></a>
# **deleteCutoffTimeOverride**
> deleteCutoffTimeOverride(overrideId)

Delete Cutoff Time Override

Deletes a Cut Off Time override.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String overrideId = "overrideId_example"; // String | 
    try {
      apiInstance.deleteCutoffTimeOverride(overrideId);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#deleteCutoffTimeOverride");
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
| **overrideId** | **String**|  | |

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

<a name="getCutoffTimeByDetails"></a>
# **getCutoffTimeByDetails**
> List&lt;CutoffTimeResponse&gt; getCutoffTimeByDetails(locationCode, responseFields, cutOffTimeRequest)

Get Location Cut Off Time

Gets an override if available, otherwise returns CutoffTime from Location

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CutOffTimeRequest cutOffTimeRequest = new CutOffTimeRequest(); // CutOffTimeRequest | 
    try {
      List<CutoffTimeResponse> result = apiInstance.getCutoffTimeByDetails(locationCode, responseFields, cutOffTimeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#getCutoffTimeByDetails");
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
| **locationCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **cutOffTimeRequest** | [**CutOffTimeRequest**](CutOffTimeRequest.md)|  | [optional] |

### Return type

[**List&lt;CutoffTimeResponse&gt;**](CutoffTimeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCutoffTimeOverrideById"></a>
# **getCutoffTimeOverrideById**
> CutoffTimeOverride getCutoffTimeOverrideById(overrideId, responseFields)

Get Cutoff Time Override by Id

Retrieves a Cut Off Time override by its ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String overrideId = "overrideId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CutoffTimeOverride result = apiInstance.getCutoffTimeOverrideById(overrideId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#getCutoffTimeOverrideById");
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
| **overrideId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CutoffTimeOverride**](CutoffTimeOverride.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCutoffTimeOverrides"></a>
# **getCutoffTimeOverrides**
> CutoffTimeOverrideCollection getCutoffTimeOverrides(locationCode, fromDate, toDate, fulfillmentType, startIndex, pageSize, responseFields)

Get Cutoff Time Overrides

Gets all Cut Off Time overrides. Location and/or Date Range and/or FulfillmentType can be used to filter the results. For a single date, pass only the fromDate parameter.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | 
    OffsetDateTime fromDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime toDate = OffsetDateTime.now(); // OffsetDateTime | 
    String fulfillmentType = "fulfillmentType_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CutoffTimeOverrideCollection result = apiInstance.getCutoffTimeOverrides(locationCode, fromDate, toDate, fulfillmentType, startIndex, pageSize, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#getCutoffTimeOverrides");
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
| **locationCode** | **String**|  | [optional] |
| **fromDate** | **OffsetDateTime**|  | [optional] |
| **toDate** | **OffsetDateTime**|  | [optional] |
| **fulfillmentType** | **String**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 100] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CutoffTimeOverrideCollection**](CutoffTimeOverrideCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocation"></a>
# **getLocation**
> Location getLocation(locationCode, responseFields)

Get Location

Get a location by its unique locationCode.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Location result = apiInstance.getLocation(locationCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#getLocation");
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
| **locationCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Location**](Location.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocationAttribute"></a>
# **getLocationAttribute**
> LocationAttribute getLocationAttribute(locationCode, fullyQualifiedName, responseFields)

Get Location Attribute

Get a specific attribute from a location.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | The unique code for a location
    String fullyQualifiedName = "fullyQualifiedName_example"; // String | The fully qualified name of the attribute to retrieve
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationAttribute result = apiInstance.getLocationAttribute(locationCode, fullyQualifiedName, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#getLocationAttribute");
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
| **locationCode** | **String**| The unique code for a location | |
| **fullyQualifiedName** | **String**| The fully qualified name of the attribute to retrieve | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**LocationAttribute**](LocationAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLocations"></a>
# **getLocations**
> LocationCollection getLocations(startIndex, pageSize, sortBy, filter, responseFields)

Get Locations

Get locations with optional filtering and paging.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationCollection result = apiInstance.getLocations(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#getLocations");
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

[**LocationCollection**](LocationCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="patchLocation"></a>
# **patchLocation**
> Location patchLocation(locationCode, responseFields, operation)

Partially Update Location

Update specific fields of a location using RFC 6902 JSON Patch format.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | the unique code for a location
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<Operation> operation = Arrays.asList(); // List<Operation> | JSON Patch document with operations to apply
    try {
      Location result = apiInstance.patchLocation(locationCode, responseFields, operation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#patchLocation");
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
| **locationCode** | **String**| the unique code for a location | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **operation** | [**List&lt;Operation&gt;**](Operation.md)| JSON Patch document with operations to apply | [optional] |

### Return type

[**Location**](Location.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeLocationAttribute"></a>
# **removeLocationAttribute**
> removeLocationAttribute(locationCode, fullyQualifiedName)

Remove Location Attribute

Remove an attribute from a location.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | The unique code for a location
    String fullyQualifiedName = "fullyQualifiedName_example"; // String | The fully qualified name of the attribute to remove
    try {
      apiInstance.removeLocationAttribute(locationCode, fullyQualifiedName);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#removeLocationAttribute");
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
| **locationCode** | **String**| The unique code for a location | |
| **fullyQualifiedName** | **String**| The fully qualified name of the attribute to remove | |

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

<a name="updateLocation"></a>
# **updateLocation**
> Location updateLocation(locationCode, responseFields, location)

Update Location

Update a location by providing its locationCode.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | the unique code for a location
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Location location = new Location(); // Location | the location update
    try {
      Location result = apiInstance.updateLocation(locationCode, responseFields, location);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#updateLocation");
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
| **locationCode** | **String**| the unique code for a location | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **location** | [**Location**](Location.md)| the location update | [optional] |

### Return type

[**Location**](Location.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateLocationAttribute"></a>
# **updateLocationAttribute**
> LocationAttribute updateLocationAttribute(locationCode, fullyQualifiedName, responseFields, locationAttributeUpdateRequest)

Update Location Attribute

Update an existing attribute for a location.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAdminApi apiInstance = new LocationAdminApi(defaultClient);
    String locationCode = "locationCode_example"; // String | The unique code for a location
    String fullyQualifiedName = "fullyQualifiedName_example"; // String | The fully qualified name of the attribute to update
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationAttributeUpdateRequest locationAttributeUpdateRequest = new LocationAttributeUpdateRequest(); // LocationAttributeUpdateRequest | The location attribute update
    try {
      LocationAttribute result = apiInstance.updateLocationAttribute(locationCode, fullyQualifiedName, responseFields, locationAttributeUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAdminApi#updateLocationAttribute");
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
| **locationCode** | **String**| The unique code for a location | |
| **fullyQualifiedName** | **String**| The fully qualified name of the attribute to update | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **locationAttributeUpdateRequest** | [**LocationAttributeUpdateRequest**](LocationAttributeUpdateRequest.md)| The location attribute update | [optional] |

### Return type

[**LocationAttribute**](LocationAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

