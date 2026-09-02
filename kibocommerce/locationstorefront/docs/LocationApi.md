# LocationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurbsideLocation**](LocationApi.md#getCurbsideLocation) | **GET** /commerce/storefront/locationUsageTypes/CS/location | Get Curbside Location |
| [**getDeliveryLocation**](LocationApi.md#getDeliveryLocation) | **GET** /commerce/storefront/locationUsageTypes/DL/location | Get Delivery Location |
| [**getDeliveryLocations**](LocationApi.md#getDeliveryLocations) | **GET** /commerce/storefront/locationUsageTypes/DL/locations | Get Delivery Locations |
| [**getDirectShipLocation**](LocationApi.md#getDirectShipLocation) | **GET** /commerce/storefront/locationUsageTypes/DS/location | Get Direct Ship Location |
| [**getInStorePickupLocation**](LocationApi.md#getInStorePickupLocation) | **GET** /commerce/storefront/locationUsageTypes/SP/locations/{locationCode} | Get In Store Pickup Location |
| [**getInStorePickupLocations**](LocationApi.md#getInStorePickupLocations) | **GET** /commerce/storefront/locationUsageTypes/SP/locations | Get In Store Pickup Locations |
| [**getLocation**](LocationApi.md#getLocation) | **GET** /commerce/storefront/locations/{locationCode} | Get Location |
| [**getLocationsInUsageType**](LocationApi.md#getLocationsInUsageType) | **GET** /commerce/storefront/locationUsageTypes/{locationUsageType}/locations | Get Locations In Usage Type |


<a name="getCurbsideLocation"></a>
# **getCurbsideLocation**
> Location getCurbsideLocation(includeAttributeDefinition, responseFields)

Get Curbside Location

Get the Curbside Location for the Site. If the location is not associated with a location type configured for the delivery location usage type (CS), the operation returns an error.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    Boolean includeAttributeDefinition = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Location result = apiInstance.getCurbsideLocation(includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getCurbsideLocation");
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
| **includeAttributeDefinition** | **Boolean**|  | [optional] [default to false] |
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

<a name="getDeliveryLocation"></a>
# **getDeliveryLocation**
> Location getDeliveryLocation(includeAttributeDefinition, responseFields)

Get Delivery Location

Gets a specific Delivery Location for the site. If the location is not associated with a location type configured for the delivery location usage type (DL), the operation returns an error.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    Boolean includeAttributeDefinition = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Location result = apiInstance.getDeliveryLocation(includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getDeliveryLocation");
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
| **includeAttributeDefinition** | **Boolean**|  | [optional] [default to false] |
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

<a name="getDeliveryLocations"></a>
# **getDeliveryLocations**
> LocationCollection getDeliveryLocations(startIndex, pageSize, sortBy, filter, includeAttributeDefinition, responseFields)

Get Delivery Locations

Gets the delivery Locations for the site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeAttributeDefinition = false; // Boolean | Include the location attributes associated definition
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationCollection result = apiInstance.getDeliveryLocations(startIndex, pageSize, sortBy, filter, includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getDeliveryLocations");
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
| **includeAttributeDefinition** | **Boolean**| Include the location attributes associated definition | [optional] [default to false] |
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

<a name="getDirectShipLocation"></a>
# **getDirectShipLocation**
> Location getDirectShipLocation(includeAttributeDefinition, responseFields)

Get Direct Ship Location

Get the Direct Ship Location for the Site. This location acts as an origin address from which order packages will ship, as well as the location where product reservations are created when order items are submitted with the direct ship fulfillment type (DS). If the direct ship location usage type is not configured for this site, the operation returns an error.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    Boolean includeAttributeDefinition = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Location result = apiInstance.getDirectShipLocation(includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getDirectShipLocation");
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
| **includeAttributeDefinition** | **Boolean**|  | [optional] [default to false] |
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

<a name="getInStorePickupLocation"></a>
# **getInStorePickupLocation**
> Location getInStorePickupLocation(locationCode, includeAttributeDefinition, responseFields)

Get In Store Pickup Location

Get a specific in store pickup Location for the Site. If the location is not associated with a location type configured for the in-store pickup location usage type (SP), the operation returns an error.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    String locationCode = "locationCode_example"; // String | 
    Boolean includeAttributeDefinition = false; // Boolean | Include the location attributes associated definition
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Location result = apiInstance.getInStorePickupLocation(locationCode, includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getInStorePickupLocation");
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
| **includeAttributeDefinition** | **Boolean**| Include the location attributes associated definition | [optional] [default to false] |
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

<a name="getInStorePickupLocations"></a>
# **getInStorePickupLocations**
> LocationCollection getInStorePickupLocations(startIndex, pageSize, sortBy, filter, includeAttributeDefinition, responseFields)

Get In Store Pickup Locations

Gets the in store pickup Locations for the site. For example, an application could use this operation to provide a store finder feature based on the shopper&#39;s GPS coordinates.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeAttributeDefinition = false; // Boolean | Include the location attributes associated definition
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationCollection result = apiInstance.getInStorePickupLocations(startIndex, pageSize, sortBy, filter, includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getInStorePickupLocations");
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
| **includeAttributeDefinition** | **Boolean**| Include the location attributes associated definition | [optional] [default to false] |
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

<a name="getLocation"></a>
# **getLocation**
> Location getLocation(locationCode, includeAttributeDefinition, responseFields)

Get Location

Get a Location by locationCode.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    String locationCode = "locationCode_example"; // String | 
    Boolean includeAttributeDefinition = false; // Boolean | Include the location attributes associated definition
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Location result = apiInstance.getLocation(locationCode, includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getLocation");
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
| **includeAttributeDefinition** | **Boolean**| Include the location attributes associated definition | [optional] [default to false] |
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

<a name="getLocationsInUsageType"></a>
# **getLocationsInUsageType**
> LocationCollection getLocationsInUsageType(locationUsageType, startIndex, pageSize, sortBy, filter, includeAttributeDefinition, responseFields)

Get Locations In Usage Type

Get the Locations for the Site associated with the locationUsageType.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationstorefront.ApiClient;
import com.kibocommerce.sdk.locationstorefront.ApiException;
import com.kibocommerce.sdk.locationstorefront.Configuration;
import com.kibocommerce.sdk.locationstorefront.auth.*;
import com.kibocommerce.sdk.locationstorefront.models.*;
import com.kibocommerce.sdk.locationstorefront.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationApi apiInstance = new LocationApi(defaultClient);
    String locationUsageType = "locationUsageType_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeAttributeDefinition = false; // Boolean | Include the location attributes associated definition
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationCollection result = apiInstance.getLocationsInUsageType(locationUsageType, startIndex, pageSize, sortBy, filter, includeAttributeDefinition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getLocationsInUsageType");
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
| **locationUsageType** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 100] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **includeAttributeDefinition** | **Boolean**| Include the location attributes associated definition | [optional] [default to false] |
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

