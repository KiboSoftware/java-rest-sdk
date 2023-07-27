# DocumentPropertyTypeApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPropertyType**](DocumentPropertyTypeApi.md#createPropertyType) | **POST** /content/propertytypes | Create Property Type |
| [**deletePropertyType**](DocumentPropertyTypeApi.md#deletePropertyType) | **DELETE** /content/propertytypes/{propertyTypeName} | Delete Property Type |
| [**getPropertyType**](DocumentPropertyTypeApi.md#getPropertyType) | **GET** /content/propertytypes/{propertyTypeName} | Get Property Type |
| [**getPropertyTypes**](DocumentPropertyTypeApi.md#getPropertyTypes) | **GET** /content/propertytypes | Get Property Types |
| [**updatePropertyType**](DocumentPropertyTypeApi.md#updatePropertyType) | **PUT** /content/propertytypes/{propertyTypeName} | Update Property Type |


<a name="createPropertyType"></a>
# **createPropertyType**
> PropertyType createPropertyType(propertyType)

Create Property Type

Create Property Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPropertyTypeApi;

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    PropertyType propertyType = new PropertyType(); // PropertyType | 
    try {
      PropertyType result = apiInstance.createPropertyType(propertyType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPropertyTypeApi#createPropertyType");
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
| **propertyType** | [**PropertyType**](PropertyType.md)|  | [optional] |

### Return type

[**PropertyType**](PropertyType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deletePropertyType"></a>
# **deletePropertyType**
> deletePropertyType(propertyTypeName)

Delete Property Type

Delete Property Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPropertyTypeApi;

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    String propertyTypeName = "propertyTypeName_example"; // String | 
    try {
      apiInstance.deletePropertyType(propertyTypeName);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPropertyTypeApi#deletePropertyType");
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
| **propertyTypeName** | **String**|  | |

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

<a name="getPropertyType"></a>
# **getPropertyType**
> PropertyType getPropertyType(propertyTypeName)

Get Property Type

Get Property Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPropertyTypeApi;

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    String propertyTypeName = "propertyTypeName_example"; // String | 
    try {
      PropertyType result = apiInstance.getPropertyType(propertyTypeName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPropertyTypeApi#getPropertyType");
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
| **propertyTypeName** | **String**|  | |

### Return type

[**PropertyType**](PropertyType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPropertyTypes"></a>
# **getPropertyTypes**
> PropertyTypeCollection getPropertyTypes(pageSize, startIndex)

Get Property Types

Retrieves a PagedCollection of PropertyTypes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPropertyTypeApi;

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    Integer pageSize = 10; // Integer | 
    Integer startIndex = 0; // Integer | 
    try {
      PropertyTypeCollection result = apiInstance.getPropertyTypes(pageSize, startIndex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPropertyTypeApi#getPropertyTypes");
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
| **pageSize** | **Integer**|  | [optional] [default to 10] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |

### Return type

[**PropertyTypeCollection**](PropertyTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePropertyType"></a>
# **updatePropertyType**
> PropertyType updatePropertyType(propertyTypeName, propertyType)

Update Property Type

Update Property Type

### Example
```java
// Import classes:
import com.kibocommerce.sdk.content.ApiClient;
import com.kibocommerce.sdk.content.ApiException;
import com.kibocommerce.sdk.content.Configuration;
import com.kibocommerce.sdk.content.auth.*;
import com.kibocommerce.sdk.content.models.*;
import com.kibocommerce.sdk.content.api.DocumentPropertyTypeApi;

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    String propertyTypeName = "propertyTypeName_example"; // String | 
    PropertyType propertyType = new PropertyType(); // PropertyType | 
    try {
      PropertyType result = apiInstance.updatePropertyType(propertyTypeName, propertyType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentPropertyTypeApi#updatePropertyType");
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
| **propertyTypeName** | **String**|  | |
| **propertyType** | [**PropertyType**](PropertyType.md)|  | [optional] |

### Return type

[**PropertyType**](PropertyType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream, application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

