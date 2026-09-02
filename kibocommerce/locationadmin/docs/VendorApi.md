# VendorApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateVendor**](VendorApi.md#activateVendor) | **PUT** /commerce/vendors/{vendorCode}/activate | Activate a vendor by setting its status to Active |
| [**addVendorLocations**](VendorApi.md#addVendorLocations) | **POST** /commerce/vendors/{vendorCode}/locations | Add locations to a vendor (bulk operation) |
| [**createVendor**](VendorApi.md#createVendor) | **POST** /commerce/vendors | Create a new vendor |
| [**createVendorSkuMapping**](VendorApi.md#createVendorSkuMapping) | **POST** /commerce/vendors/{vendorCode}/skumappings | Create a new vendor SKU mapping |
| [**deactivateVendor**](VendorApi.md#deactivateVendor) | **PUT** /commerce/vendors/{vendorCode}/deactivate | Deactivate a vendor by setting its status to InActive |
| [**deleteVendor**](VendorApi.md#deleteVendor) | **DELETE** /commerce/vendors/{vendorCode} | Deletes a specific vendor |
| [**deleteVendorSkuMapping**](VendorApi.md#deleteVendorSkuMapping) | **DELETE** /commerce/vendors/{vendorCode}/skumappings/{upc} | Deletes a specific vendor SKU mapping |
| [**getVendor**](VendorApi.md#getVendor) | **GET** /commerce/vendors/{vendorCode} | Gets a specific vendor by vendor code |
| [**getVendorLocations**](VendorApi.md#getVendorLocations) | **GET** /commerce/vendors/{vendorCode}/locations | Get all locations associated with a vendor |
| [**getVendorSkuMapping**](VendorApi.md#getVendorSkuMapping) | **GET** /commerce/vendors/{vendorCode}/skumappings/{upc} | Gets a specific vendor SKU mapping by UPC |
| [**getVendorSkuMappings**](VendorApi.md#getVendorSkuMappings) | **GET** /commerce/vendors/{vendorCode}/skumappings | Gets list of vendor SKU mappings by filter, sort and paging |
| [**getVendorSkuMappingsByLocation**](VendorApi.md#getVendorSkuMappingsByLocation) | **GET** /commerce/vendors/location/{locationCode}/skumappings | Gets vendor SKU mappings for the vendor associated with a location |
| [**getVendors**](VendorApi.md#getVendors) | **GET** /commerce/vendors | Gets list of vendors by filter, sort and paging |
| [**removeVendorLocations**](VendorApi.md#removeVendorLocations) | **POST** /commerce/vendors/{vendorCode}/locations/delete | Remove multiple locations from a vendor (bulk operation, idempotent) |
| [**updateVendor**](VendorApi.md#updateVendor) | **PUT** /commerce/vendors/{vendorCode} | Update a specific vendor |
| [**updateVendorLocations**](VendorApi.md#updateVendorLocations) | **PUT** /commerce/vendors/{vendorCode}/locations | Update vendor locations (bulk operation with upsert or full replace) |
| [**updateVendorSkuMapping**](VendorApi.md#updateVendorSkuMapping) | **PUT** /commerce/vendors/{vendorCode}/skumappings/{upc} | Update a specific vendor SKU mapping |


<a name="activateVendor"></a>
# **activateVendor**
> Vendor activateVendor(vendorCode, responseFields)

Activate a vendor by setting its status to Active

Activate a vendor by setting its status to Active

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Vendor result = apiInstance.activateVendor(vendorCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#activateVendor");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addVendorLocations"></a>
# **addVendorLocations**
> List&lt;VendorLocation&gt; addVendorLocations(vendorCode, responseFields, vendorLocation)

Add locations to a vendor (bulk operation)

Add locations to a vendor (bulk operation)

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<VendorLocation> vendorLocation = Arrays.asList(); // List<VendorLocation> | List of vendor locations to add
    try {
      List<VendorLocation> result = apiInstance.addVendorLocations(vendorCode, responseFields, vendorLocation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#addVendorLocations");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **vendorLocation** | [**List&lt;VendorLocation&gt;**](VendorLocation.md)| List of vendor locations to add | [optional] |

### Return type

[**List&lt;VendorLocation&gt;**](VendorLocation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createVendor"></a>
# **createVendor**
> Vendor createVendor(responseFields, vendor)

Create a new vendor

Create a new vendor

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Vendor vendor = new Vendor(); // Vendor | Vendor object to create
    try {
      Vendor result = apiInstance.createVendor(responseFields, vendor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#createVendor");
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
| **vendor** | [**Vendor**](Vendor.md)| Vendor object to create | [optional] |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createVendorSkuMapping"></a>
# **createVendorSkuMapping**
> VendorSkuMapping createVendorSkuMapping(vendorCode, responseFields, vendorSkuMapping)

Create a new vendor SKU mapping

Create a new vendor SKU mapping

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    VendorSkuMapping vendorSkuMapping = new VendorSkuMapping(); // VendorSkuMapping | Vendor SKU mapping object to create
    try {
      VendorSkuMapping result = apiInstance.createVendorSkuMapping(vendorCode, responseFields, vendorSkuMapping);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#createVendorSkuMapping");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **vendorSkuMapping** | [**VendorSkuMapping**](VendorSkuMapping.md)| Vendor SKU mapping object to create | [optional] |

### Return type

[**VendorSkuMapping**](VendorSkuMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deactivateVendor"></a>
# **deactivateVendor**
> Vendor deactivateVendor(vendorCode, responseFields)

Deactivate a vendor by setting its status to InActive

Deactivate a vendor by setting its status to InActive

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Vendor result = apiInstance.deactivateVendor(vendorCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#deactivateVendor");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteVendor"></a>
# **deleteVendor**
> deleteVendor(vendorCode)

Deletes a specific vendor

Deletes a specific vendor

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    try {
      apiInstance.deleteVendor(vendorCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#deleteVendor");
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
| **vendorCode** | **String**| Unique vendor code | |

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

<a name="deleteVendorSkuMapping"></a>
# **deleteVendorSkuMapping**
> deleteVendorSkuMapping(vendorCode, upc)

Deletes a specific vendor SKU mapping

Deletes a specific vendor SKU mapping

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String upc = "upc_example"; // String | UPC code
    try {
      apiInstance.deleteVendorSkuMapping(vendorCode, upc);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#deleteVendorSkuMapping");
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
| **vendorCode** | **String**| Unique vendor code | |
| **upc** | **String**| UPC code | |

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

<a name="getVendor"></a>
# **getVendor**
> Vendor getVendor(vendorCode, responseFields)

Gets a specific vendor by vendor code

Gets a specific vendor by vendor code

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Vendor result = apiInstance.getVendor(vendorCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendor");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVendorLocations"></a>
# **getVendorLocations**
> List&lt;VendorLocation&gt; getVendorLocations(vendorCode, responseFields)

Get all locations associated with a vendor

Get all locations associated with a vendor

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<VendorLocation> result = apiInstance.getVendorLocations(vendorCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendorLocations");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;VendorLocation&gt;**](VendorLocation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVendorSkuMapping"></a>
# **getVendorSkuMapping**
> VendorSkuMapping getVendorSkuMapping(vendorCode, upc, responseFields)

Gets a specific vendor SKU mapping by UPC

Gets a specific vendor SKU mapping by UPC

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String upc = "upc_example"; // String | UPC code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      VendorSkuMapping result = apiInstance.getVendorSkuMapping(vendorCode, upc, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendorSkuMapping");
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
| **vendorCode** | **String**| Unique vendor code | |
| **upc** | **String**| UPC code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**VendorSkuMapping**](VendorSkuMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVendorSkuMappings"></a>
# **getVendorSkuMappings**
> VendorSkuMappingCollection getVendorSkuMappings(vendorCode, startIndex, pageSize, sortBy, filter, responseFields)

Gets list of vendor SKU mappings by filter, sort and paging

Gets list of vendor SKU mappings by filter, sort and paging

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    Integer startIndex = 0; // Integer | Starting index for pagination
    Integer pageSize = 100; // Integer | Number of items per page (max 200)
    String sortBy = "sortBy_example"; // String | Sort criteria
    String filter = "filter_example"; // String | Filter criteria
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      VendorSkuMappingCollection result = apiInstance.getVendorSkuMappings(vendorCode, startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendorSkuMappings");
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
| **vendorCode** | **String**| Unique vendor code | |
| **startIndex** | **Integer**| Starting index for pagination | [optional] [default to 0] |
| **pageSize** | **Integer**| Number of items per page (max 200) | [optional] [default to 100] |
| **sortBy** | **String**| Sort criteria | [optional] |
| **filter** | **String**| Filter criteria | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**VendorSkuMappingCollection**](VendorSkuMappingCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVendorSkuMappingsByLocation"></a>
# **getVendorSkuMappingsByLocation**
> VendorSkuMappingCollection getVendorSkuMappingsByLocation(locationCode, startIndex, pageSize, sortBy, filter, responseFields)

Gets vendor SKU mappings for the vendor associated with a location

Gets vendor SKU mappings for the vendor associated with a location

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String locationCode = "locationCode_example"; // String | Location code to find vendor for
    Integer startIndex = 0; // Integer | Starting index for pagination (default: 0)
    Integer pageSize = 100; // Integer | Number of items per page (default: 100, max: 200)
    String sortBy = "sortBy_example"; // String | Sort criteria (e.g., \"upc asc\", \"vendorprice desc\")
    String filter = "filter_example"; // String | Filter criteria (e.g., \"vendorprice gt 10.00\")
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      VendorSkuMappingCollection result = apiInstance.getVendorSkuMappingsByLocation(locationCode, startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendorSkuMappingsByLocation");
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
| **locationCode** | **String**| Location code to find vendor for | |
| **startIndex** | **Integer**| Starting index for pagination (default: 0) | [optional] [default to 0] |
| **pageSize** | **Integer**| Number of items per page (default: 100, max: 200) | [optional] [default to 100] |
| **sortBy** | **String**| Sort criteria (e.g., \&quot;upc asc\&quot;, \&quot;vendorprice desc\&quot;) | [optional] |
| **filter** | **String**| Filter criteria (e.g., \&quot;vendorprice gt 10.00\&quot;) | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**VendorSkuMappingCollection**](VendorSkuMappingCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getVendors"></a>
# **getVendors**
> VendorCollection getVendors(startIndex, pageSize, sortBy, filter, responseFields)

Gets list of vendors by filter, sort and paging

Filter by VendorCode, Name, Status, Email, or LocationCode

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    Integer startIndex = 0; // Integer | Starting index for pagination
    Integer pageSize = 100; // Integer | Number of items per page (max 100)
    String sortBy = "sortBy_example"; // String | Sort criteria
    String filter = "filter_example"; // String | Filter criteria
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      VendorCollection result = apiInstance.getVendors(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#getVendors");
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
| **startIndex** | **Integer**| Starting index for pagination | [optional] [default to 0] |
| **pageSize** | **Integer**| Number of items per page (max 100) | [optional] [default to 100] |
| **sortBy** | **String**| Sort criteria | [optional] |
| **filter** | **String**| Filter criteria | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**VendorCollection**](VendorCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeVendorLocations"></a>
# **removeVendorLocations**
> removeVendorLocations(vendorCode, responseFields, requestBody)

Remove multiple locations from a vendor (bulk operation, idempotent)

Remove multiple locations from a vendor (bulk operation, idempotent)

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | List of location codes to remove
    try {
      apiInstance.removeVendorLocations(vendorCode, responseFields, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#removeVendorLocations");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of location codes to remove | [optional] |

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

<a name="updateVendor"></a>
# **updateVendor**
> Vendor updateVendor(vendorCode, responseFields, vendor)

Update a specific vendor

Update a specific vendor

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Vendor vendor = new Vendor(); // Vendor | Vendor object with changes
    try {
      Vendor result = apiInstance.updateVendor(vendorCode, responseFields, vendor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#updateVendor");
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
| **vendorCode** | **String**| Unique vendor code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **vendor** | [**Vendor**](Vendor.md)| Vendor object with changes | [optional] |

### Return type

[**Vendor**](Vendor.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateVendorLocations"></a>
# **updateVendorLocations**
> List&lt;VendorLocation&gt; updateVendorLocations(vendorCode, removeUnspecified, responseFields, vendorLocation)

Update vendor locations (bulk operation with upsert or full replace)

Update vendor locations (bulk operation with upsert or full replace)

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    Boolean removeUnspecified = false; // Boolean | If true, replaces all locations; if false (default), upserts locations
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<VendorLocation> vendorLocation = Arrays.asList(); // List<VendorLocation> | List of vendor locations to update
    try {
      List<VendorLocation> result = apiInstance.updateVendorLocations(vendorCode, removeUnspecified, responseFields, vendorLocation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#updateVendorLocations");
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
| **vendorCode** | **String**| Unique vendor code | |
| **removeUnspecified** | **Boolean**| If true, replaces all locations; if false (default), upserts locations | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **vendorLocation** | [**List&lt;VendorLocation&gt;**](VendorLocation.md)| List of vendor locations to update | [optional] |

### Return type

[**List&lt;VendorLocation&gt;**](VendorLocation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateVendorSkuMapping"></a>
# **updateVendorSkuMapping**
> VendorSkuMapping updateVendorSkuMapping(vendorCode, upc, responseFields, vendorSkuMapping)

Update a specific vendor SKU mapping

Update a specific vendor SKU mapping

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.VendorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VendorApi apiInstance = new VendorApi(defaultClient);
    String vendorCode = "vendorCode_example"; // String | Unique vendor code
    String upc = "upc_example"; // String | UPC code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    VendorSkuMapping vendorSkuMapping = new VendorSkuMapping(); // VendorSkuMapping | Vendor SKU mapping object with changes
    try {
      VendorSkuMapping result = apiInstance.updateVendorSkuMapping(vendorCode, upc, responseFields, vendorSkuMapping);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VendorApi#updateVendorSkuMapping");
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
| **vendorCode** | **String**| Unique vendor code | |
| **upc** | **String**| UPC code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **vendorSkuMapping** | [**VendorSkuMapping**](VendorSkuMapping.md)| Vendor SKU mapping object with changes | [optional] |

### Return type

[**VendorSkuMapping**](VendorSkuMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

