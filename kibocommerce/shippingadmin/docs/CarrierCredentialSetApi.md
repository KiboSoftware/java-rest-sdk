# CarrierCredentialSetApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCarrierCredentialSet**](CarrierCredentialSetApi.md#createCarrierCredentialSet) | **POST** /commerce/shipping/admin/carriers/credential-sets/{carrierId} | Creates a Mozu |
| [**deleteCarrierCredentialSet**](CarrierCredentialSetApi.md#deleteCarrierCredentialSet) | **DELETE** /commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code} | Deletes a Mozu |
| [**getCarrierCredentialSet**](CarrierCredentialSetApi.md#getCarrierCredentialSet) | **GET** /commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code} | Returns a Mozu |
| [**getCarrierCredentialSets**](CarrierCredentialSetApi.md#getCarrierCredentialSets) | **GET** /commerce/shipping/admin/carriers/credential-sets | Returns a &lt;see cref&#x3D;\&quot;T:Mozu |
| [**updateCarrierCredentialSet**](CarrierCredentialSetApi.md#updateCarrierCredentialSet) | **PUT** /commerce/shipping/admin/carriers/credential-sets/{carrierId}/{code} | Updates a Mozu |


<a name="createCarrierCredentialSet"></a>
# **createCarrierCredentialSet**
> CarrierCredentialSet createCarrierCredentialSet(carrierId, carrierCredentialSet)

Creates a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredentialSet.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    CarrierCredentialSet carrierCredentialSet = new CarrierCredentialSet(); // CarrierCredentialSet | The carrier credential set data.
    try {
      CarrierCredentialSet result = apiInstance.createCarrierCredentialSet(carrierId, carrierCredentialSet);
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
| **carrierCredentialSet** | [**CarrierCredentialSet**](CarrierCredentialSet.md)| The carrier credential set data. | [optional] |

### Return type

[**CarrierCredentialSet**](CarrierCredentialSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

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

Deletes a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierCredentialSet"></a>
# **getCarrierCredentialSet**
> CarrierCredentialSet getCarrierCredentialSet(carrierId, code)

Returns a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String code = "code_example"; // String | The carrier credential set code.
    try {
      CarrierCredentialSet result = apiInstance.getCarrierCredentialSet(carrierId, code);
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

### Return type

[**CarrierCredentialSet**](CarrierCredentialSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCarrierCredentialSets"></a>
# **getCarrierCredentialSets**
> CarrierCredentialSetCollection getCarrierCredentialSets(startIndex, pageSize, sortBy, filter)

Returns a &lt;see cref&#x3D;\&quot;T:Mozu

hippingAdmin.Contracts.Carriers.CarrierCredentialSetCollection\&quot;&gt;collection&lt;/see&gt; of &lt;see cref&#x3D;\&quot;T:Mozu.ShippingAdmin.Contracts.Carriers.CarrierCredentialSet\&quot;&gt;carrier credential sets&lt;/see&gt; with the specified filters and options.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    Integer startIndex = 56; // Integer | The starting index.
    Integer pageSize = 56; // Integer | The page size.
    String sortBy = "sortBy_example"; // String | Any sorting filters.
    String filter = "filter_example"; // String | Any query filters.
    try {
      CarrierCredentialSetCollection result = apiInstance.getCarrierCredentialSets(startIndex, pageSize, sortBy, filter);
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

### Return type

[**CarrierCredentialSetCollection**](CarrierCredentialSetCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCarrierCredentialSet"></a>
# **updateCarrierCredentialSet**
> CarrierCredentialSet updateCarrierCredentialSet(carrierId, code, carrierCredentialSet)

Updates a Mozu

hippingAdmin.Contracts.Carriers.CarrierCredentialSet with the specified carrier and code.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CarrierCredentialSetApi apiInstance = new CarrierCredentialSetApi(defaultClient);
    String carrierId = "carrierId_example"; // String | The carrier ID.
    String code = "code_example"; // String | The carrier credential set code.
    CarrierCredentialSet carrierCredentialSet = new CarrierCredentialSet(); // CarrierCredentialSet | The carrier credential set data.
    try {
      CarrierCredentialSet result = apiInstance.updateCarrierCredentialSet(carrierId, code, carrierCredentialSet);
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
| **carrierCredentialSet** | [**CarrierCredentialSet**](CarrierCredentialSet.md)| The carrier credential set data. | [optional] |

### Return type

[**CarrierCredentialSet**](CarrierCredentialSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

