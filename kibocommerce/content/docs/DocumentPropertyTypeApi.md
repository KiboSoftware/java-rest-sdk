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
> PropertyType createPropertyType(responseFields, propertyType)

Create Property Type

Create Property Type. The immutable property types that are defined out-of-the-box are hidden, page_type_definition, string, int, dropzones, boolean, and datetime.

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PropertyType propertyType = new PropertyType(); // PropertyType | 
    try {
      PropertyType result = apiInstance.createPropertyType(responseFields, propertyType);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **propertyType** | [**PropertyType**](PropertyType.md)|  | [optional] |

### Return type

[**PropertyType**](PropertyType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPropertyType"></a>
# **getPropertyType**
> PropertyType getPropertyType(propertyTypeName, responseFields)

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    String propertyTypeName = "propertyTypeName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PropertyType result = apiInstance.getPropertyType(propertyTypeName, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PropertyType**](PropertyType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPropertyTypes"></a>
# **getPropertyTypes**
> PropertyTypeCollection getPropertyTypes(pageSize, startIndex, responseFields)

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    Integer pageSize = 10; // Integer | 
    Integer startIndex = 0; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PropertyTypeCollection result = apiInstance.getPropertyTypes(pageSize, startIndex, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PropertyTypeCollection**](PropertyTypeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePropertyType"></a>
# **updatePropertyType**
> PropertyType updatePropertyType(propertyTypeName, responseFields, propertyType)

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

    DocumentPropertyTypeApi apiInstance = new DocumentPropertyTypeApi(defaultClient);
    String propertyTypeName = "propertyTypeName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PropertyType propertyType = new PropertyType(); // PropertyType | 
    try {
      PropertyType result = apiInstance.updatePropertyType(propertyTypeName, responseFields, propertyType);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **propertyType** | [**PropertyType**](PropertyType.md)|  | [optional] |

### Return type

[**PropertyType**](PropertyType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/octet-stream, text/plain
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

