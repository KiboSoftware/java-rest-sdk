# CarrierCredentialApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCarrierCredential**](CarrierCredentialApi.md#createCarrierCredential) | **POST** /commerce/shipping/admin/carriers/credentials/{carrierId} | Create Carrier Credentials |
| [**deleteCarrierCredential**](CarrierCredentialApi.md#deleteCarrierCredential) | **DELETE** /commerce/shipping/admin/carriers/credentials/{carrierId} | Delete Carrier Credentials |
| [**getCarrierCredential**](CarrierCredentialApi.md#getCarrierCredential) | **GET** /commerce/shipping/admin/carriers/credentials/{carrierId} | Get Carrier Credentials by ID |
| [**getCarrierCredentials**](CarrierCredentialApi.md#getCarrierCredentials) | **GET** /commerce/shipping/admin/carriers/credentials | Get Carrier Credentials |
| [**updateCarrierCredential**](CarrierCredentialApi.md#updateCarrierCredential) | **PUT** /commerce/shipping/admin/carriers/credentials/{carrierId} | Update Carrier Credentials |


<a name="createCarrierCredential"></a>
# **createCarrierCredential**
> CarrierCredential createCarrierCredential(carrierId, responseFields, carrierCredential)

Create Carrier Credentials

Creates new carrier credentials. See &lt;a href&#x3D;\&quot;/pages/shipping-carriers-api-overview\&quot;&gt;this guide&lt;/a&gt; for details about the fields that are required for each carrier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CarrierCredential carrierCredential = new CarrierCredential(); // CarrierCredential | The carrier credential data.
    try {
      CarrierCredential result = apiInstance.createCarrierCredential(carrierId, responseFields, carrierCredential);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialApi#createCarrierCredential");
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
| **carrierId** | **String**| The carrier ID. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **carrierCredential** | [**CarrierCredential**](CarrierCredential.md)| The carrier credential data. | [optional] |

### Return type

[**CarrierCredential**](CarrierCredential.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCarrierCredential"></a>
# **deleteCarrierCredential**
> deleteCarrierCredential(carrierId, siteId, locationGroupCode, locationCode)

Delete Carrier Credentials

Deletes carrier credentials

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    Integer siteId = 56; // Integer | The site ID, if any.
    String locationGroupCode = "locationGroupCode_example"; // String | The location group code, if any.
    String locationCode = "locationCode_example"; // String | The location code, if any.
    try {
      apiInstance.deleteCarrierCredential(carrierId, siteId, locationGroupCode, locationCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialApi#deleteCarrierCredential");
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
| **carrierId** | **String**| The carrier ID. | |
| **siteId** | **Integer**| The site ID, if any. | [optional] |
| **locationGroupCode** | **String**| The location group code, if any. | [optional] |
| **locationCode** | **String**| The location code, if any. | [optional] |

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

<a name="getCarrierCredential"></a>
# **getCarrierCredential**
> CarrierCredential getCarrierCredential(carrierId, siteId, locationGroupCode, locationCode, responseFields)

Get Carrier Credentials by ID

Retrieves carrier credentials for a specific Carrier ID

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    Integer siteId = 56; // Integer | The site ID, if any.
    String locationGroupCode = "locationGroupCode_example"; // String | The location group code, if any.
    String locationCode = "locationCode_example"; // String | The location code, if any.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CarrierCredential result = apiInstance.getCarrierCredential(carrierId, siteId, locationGroupCode, locationCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialApi#getCarrierCredential");
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
| **carrierId** | **String**| The carrier ID. | |
| **siteId** | **Integer**| The site ID, if any. | [optional] |
| **locationGroupCode** | **String**| The location group code, if any. | [optional] |
| **locationCode** | **String**| The location code, if any. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CarrierCredential**](CarrierCredential.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierCredentials"></a>
# **getCarrierCredentials**
> CarrierCredentialCollection getCarrierCredentials(startIndex, pageSize, sortBy, filter, responseFields)

Get Carrier Credentials

Returns a collection of all carrier credentials

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    Integer startIndex = 56; // Integer | The starting index.
    Integer pageSize = 56; // Integer | The page size.
    String sortBy = "sortBy_example"; // String | Any sorting filters.
    String filter = "filter_example"; // String | Any query filters.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CarrierCredentialCollection result = apiInstance.getCarrierCredentials(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialApi#getCarrierCredentials");
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
| **startIndex** | **Integer**| The starting index. | [optional] |
| **pageSize** | **Integer**| The page size. | [optional] |
| **sortBy** | **String**| Any sorting filters. | [optional] |
| **filter** | **String**| Any query filters. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CarrierCredentialCollection**](CarrierCredentialCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCarrierCredential"></a>
# **updateCarrierCredential**
> CarrierCredential updateCarrierCredential(carrierId, siteId, locationGroupCode, locationCode, responseFields, carrierCredential)

Update Carrier Credentials

Updates existing carrier credentials. See &lt;a href&#x3D;\&quot;/pages/shipping-carriers-api-overview\&quot;&gt;this guide&lt;/a&gt; for details about the fields that are required for each carrier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    Integer siteId = 56; // Integer | The site ID, if any.
    String locationGroupCode = "locationGroupCode_example"; // String | The location group code, if any.
    String locationCode = "locationCode_example"; // String | The location code, if any.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CarrierCredential carrierCredential = new CarrierCredential(); // CarrierCredential | The carrier credential data.
    try {
      CarrierCredential result = apiInstance.updateCarrierCredential(carrierId, siteId, locationGroupCode, locationCode, responseFields, carrierCredential);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialApi#updateCarrierCredential");
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
| **carrierId** | **String**| The carrier ID. | |
| **siteId** | **Integer**| The site ID, if any. | [optional] |
| **locationGroupCode** | **String**| The location group code, if any. | [optional] |
| **locationCode** | **String**| The location code, if any. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **carrierCredential** | [**CarrierCredential**](CarrierCredential.md)| The carrier credential data. | [optional] |

### Return type

[**CarrierCredential**](CarrierCredential.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

