# CarrierCredentialApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCarrierCredential**](CarrierCredentialApi.md#createCarrierCredential) | **POST** /commerce/shipping/admin/carriers/credentials/{carrierId} | Creates a Mozu |
| [**deleteCarrierCredential**](CarrierCredentialApi.md#deleteCarrierCredential) | **DELETE** /commerce/shipping/admin/carriers/credentials/{carrierId} | Deletes a Mozu |
| [**getCarrierCredential**](CarrierCredentialApi.md#getCarrierCredential) | **GET** /commerce/shipping/admin/carriers/credentials/{carrierId} | Gets a Mozu |
| [**getCarrierCredentials**](CarrierCredentialApi.md#getCarrierCredentials) | **GET** /commerce/shipping/admin/carriers/credentials | Returns a &lt;see cref&#x3D;\&quot;T:Mozu |
| [**updateCarrierCredential**](CarrierCredentialApi.md#updateCarrierCredential) | **PUT** /commerce/shipping/admin/carriers/credentials/{carrierId} | Updates a Mozu |


<a name="createCarrierCredential"></a>
# **createCarrierCredential**
> CarrierCredential createCarrierCredential(carrierId, carrierCredential)

Creates a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredential.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    CarrierCredential carrierCredential = new CarrierCredential(); // CarrierCredential | The carrier credential data.
    try {
      CarrierCredential result = apiInstance.createCarrierCredential(carrierId, carrierCredential);
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
| **carrierCredential** | [**CarrierCredential**](CarrierCredential.md)| The carrier credential data. | [optional] |

### Return type

[**CarrierCredential**](CarrierCredential.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

Deletes a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredential with the specified configuration.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierCredential"></a>
# **getCarrierCredential**
> CarrierCredential getCarrierCredential(carrierId, siteId, locationGroupCode, locationCode)

Gets a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredential with the specified configuration.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    Integer siteId = 56; // Integer | The site ID, if any.
    String locationGroupCode = "locationGroupCode_example"; // String | The location group code, if any.
    String locationCode = "locationCode_example"; // String | The location code, if any.
    try {
      CarrierCredential result = apiInstance.getCarrierCredential(carrierId, siteId, locationGroupCode, locationCode);
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

### Return type

[**CarrierCredential**](CarrierCredential.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierCredentials"></a>
# **getCarrierCredentials**
> CarrierCredentialCollection getCarrierCredentials(startIndex, pageSize, sortBy, filter)

Returns a &lt;see cref&#x3D;\&quot;T:Mozu

hippingAdmin.Contracts.Carriers.CarrierCredentialCollection\&quot;&gt;collection&lt;/see&gt; of &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredential\&quot;&gt;carrier credential&lt;/see&gt; with the specified filters and options.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    Integer startIndex = 56; // Integer | The starting index.
    Integer pageSize = 56; // Integer | The page size.
    String sortBy = "sortBy_example"; // String | Any sorting filters.
    String filter = "filter_example"; // String | Any query filters.
    try {
      CarrierCredentialCollection result = apiInstance.getCarrierCredentials(startIndex, pageSize, sortBy, filter);
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

### Return type

[**CarrierCredentialCollection**](CarrierCredentialCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCarrierCredential"></a>
# **updateCarrierCredential**
> CarrierCredential updateCarrierCredential(carrierId, siteId, locationGroupCode, locationCode, carrierCredential)

Updates a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredential with the specified configuration.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialApi apiInstance = new CarrierCredentialApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    Integer siteId = 56; // Integer | The site ID, if any.
    String locationGroupCode = "locationGroupCode_example"; // String | The location group code, if any.
    String locationCode = "locationCode_example"; // String | The location code, if any.
    CarrierCredential carrierCredential = new CarrierCredential(); // CarrierCredential | The carrier credential data.
    try {
      CarrierCredential result = apiInstance.updateCarrierCredential(carrierId, siteId, locationGroupCode, locationCode, carrierCredential);
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
| **carrierCredential** | [**CarrierCredential**](CarrierCredential.md)| The carrier credential data. | [optional] |

### Return type

[**CarrierCredential**](CarrierCredential.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

