# CarrierCredentialSetApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCarrierCredentialSet**](CarrierCredentialSetApi.md#createCarrierCredentialSet) | **POST** /commerce/shipping/admin/carriers/credential-sets/{carrierId} | Create Carrier Credential Set |
| [**deleteCarrierCredentialSet**](CarrierCredentialSetApi.md#deleteCarrierCredentialSet) | **DELETE** /commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code} | Delete Carrier Credential Set |
| [**getCarrierCredentialSet**](CarrierCredentialSetApi.md#getCarrierCredentialSet) | **GET** /commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code} | Get Carrier Credential Set |
| [**getCarrierCredentialSets**](CarrierCredentialSetApi.md#getCarrierCredentialSets) | **GET** /commerce/shipping/admin/carriers/credential-sets | Get Carrier Credential Sets |
| [**updateCarrierCredentialSet**](CarrierCredentialSetApi.md#updateCarrierCredentialSet) | **PUT** /commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code} | Update Carrier Credential Set |


<a name="createCarrierCredentialSet"></a>
# **createCarrierCredentialSet**
> CarrierCredentialSet createCarrierCredentialSet(carrierId, responseFields, carrierCredentialSet)

Create Carrier Credential Set

Creates a new carrier credential set. See &lt;a href&#x3D;\&quot;/pages/shipping-carriers-api-overview\&quot;&gt;this guide&lt;/a&gt; for details about the fields that are required for each carrier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CarrierCredentialSet carrierCredentialSet = new CarrierCredentialSet(); // CarrierCredentialSet | The carrier credential set data.
    try {
      CarrierCredentialSet result = apiInstance.createCarrierCredentialSet(carrierId, responseFields, carrierCredentialSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialSetApi#createCarrierCredentialSet");
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
| **carrierCredentialSet** | [**CarrierCredentialSet**](CarrierCredentialSet.md)| The carrier credential set data. | [optional] |

### Return type

[**CarrierCredentialSet**](CarrierCredentialSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCarrierCredentialSet"></a>
# **deleteCarrierCredentialSet**
> deleteCarrierCredentialSet(carrierId, code)

Delete Carrier Credential Set

Deletes a carrier credential set

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String code = "code_example"; // String | The carrier credential set code.
    try {
      apiInstance.deleteCarrierCredentialSet(carrierId, code);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialSetApi#deleteCarrierCredentialSet");
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
| **code** | **String**| The carrier credential set code. | |

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

<a name="getCarrierCredentialSet"></a>
# **getCarrierCredentialSet**
> CarrierCredentialSet getCarrierCredentialSet(carrierId, code, responseFields)

Get Carrier Credential Set

Returns a credential set based on a specific Carrier ID and Code

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String code = "code_example"; // String | The carrier credential set code.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CarrierCredentialSet result = apiInstance.getCarrierCredentialSet(carrierId, code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialSetApi#getCarrierCredentialSet");
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
| **code** | **String**| The carrier credential set code. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CarrierCredentialSet**](CarrierCredentialSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierCredentialSets"></a>
# **getCarrierCredentialSets**
> CarrierCredentialSetCollection getCarrierCredentialSets(startIndex, pageSize, sortBy, filter, responseFields)

Get Carrier Credential Sets

Returns a collection of all carrier credential sets

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    Integer startIndex = 56; // Integer | The starting index.
    Integer pageSize = 56; // Integer | The page size.
    String sortBy = "sortBy_example"; // String | Any sorting filters.
    String filter = "filter_example"; // String | Any query filters.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CarrierCredentialSetCollection result = apiInstance.getCarrierCredentialSets(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialSetApi#getCarrierCredentialSets");
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

[**CarrierCredentialSetCollection**](CarrierCredentialSetCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCarrierCredentialSet"></a>
# **updateCarrierCredentialSet**
> CarrierCredentialSet updateCarrierCredentialSet(carrierId, code, responseFields, carrierCredentialSet)

Update Carrier Credential Set

Update an existing carrier credential set. See &lt;a href&#x3D;\&quot;/pages/shipping-carriers-api-overview\&quot;&gt;this guide&lt;/a&gt; for details about the fields that are required for each carrier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.CarrierCredentialSetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String code = "code_example"; // String | The carrier credential set code.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CarrierCredentialSet carrierCredentialSet = new CarrierCredentialSet(); // CarrierCredentialSet | The carrier credential set data.
    try {
      CarrierCredentialSet result = apiInstance.updateCarrierCredentialSet(carrierId, code, responseFields, carrierCredentialSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CarrierCredentialSetApi#updateCarrierCredentialSet");
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
| **code** | **String**| The carrier credential set code. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **carrierCredentialSet** | [**CarrierCredentialSet**](CarrierCredentialSet.md)| The carrier credential set data. | [optional] |

### Return type

[**CarrierCredentialSet**](CarrierCredentialSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

