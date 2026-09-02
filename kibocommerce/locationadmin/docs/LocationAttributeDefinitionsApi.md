# LocationAttributeDefinitionsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttribute**](LocationAttributeDefinitionsApi.md#createAttribute) | **POST** /commerce/admin/locations/attributedefinition/attributes | Create Attribute |
| [**getAttribute**](LocationAttributeDefinitionsApi.md#getAttribute) | **GET** /commerce/admin/locations/attributedefinition/attributes/{attributeFQN} | Get Attribute |
| [**getAttributeVocabularyValues**](LocationAttributeDefinitionsApi.md#getAttributeVocabularyValues) | **GET** /commerce/admin/locations/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Attribute Vocabulary Values |
| [**getAttributes**](LocationAttributeDefinitionsApi.md#getAttributes) | **GET** /commerce/admin/locations/attributedefinition/attributes | Get Attributes |
| [**updateAttribute**](LocationAttributeDefinitionsApi.md#updateAttribute) | **PUT** /commerce/admin/locations/attributedefinition/attributes/{attributeFQN} | Update Attribute |


<a name="createAttribute"></a>
# **createAttribute**
> LocationAdminAttribute createAttribute(responseFields, locationAdminAttribute)

Create Attribute

Create a new location attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAttributeDefinitionsApi apiInstance = new LocationAttributeDefinitionsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationAdminAttribute locationAdminAttribute = new LocationAdminAttribute(); // LocationAdminAttribute | 
    try {
      LocationAdminAttribute result = apiInstance.createAttribute(responseFields, locationAdminAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAttributeDefinitionsApi#createAttribute");
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
| **locationAdminAttribute** | [**LocationAdminAttribute**](LocationAdminAttribute.md)|  | [optional] |

### Return type

[**LocationAdminAttribute**](LocationAdminAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttribute"></a>
# **getAttribute**
> LocationAdminAttribute getAttribute(attributeFQN, responseGroups, responseFields)

Get Attribute

Get Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAttributeDefinitionsApi apiInstance = new LocationAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationAdminAttribute result = apiInstance.getAttribute(attributeFQN, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAttributeDefinitionsApi#getAttribute");
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
| **attributeFQN** | **String**|  | |
| **responseGroups** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**LocationAdminAttribute**](LocationAdminAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeVocabularyValues"></a>
# **getAttributeVocabularyValues**
> List&lt;LocationAdminAttributeVocabularyValue&gt; getAttributeVocabularyValues(attributeFQN, responseGroups, responseFields)

Get Attribute Vocabulary Values

Retrieves the details of attribute vocabulary values.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAttributeDefinitionsApi apiInstance = new LocationAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<LocationAdminAttributeVocabularyValue> result = apiInstance.getAttributeVocabularyValues(attributeFQN, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAttributeDefinitionsApi#getAttributeVocabularyValues");
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
| **attributeFQN** | **String**|  | |
| **responseGroups** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;LocationAdminAttributeVocabularyValue&gt;**](LocationAdminAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributes"></a>
# **getAttributes**
> CommerceRuntimeAttributeCollection getAttributes(startIndex, pageSize, sortBy, responseGroups, filter, responseFields)

Get Attributes

Retrieves the details of attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAttributeDefinitionsApi apiInstance = new LocationAttributeDefinitionsApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CommerceRuntimeAttributeCollection result = apiInstance.getAttributes(startIndex, pageSize, sortBy, responseGroups, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAttributeDefinitionsApi#getAttributes");
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
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **responseGroups** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CommerceRuntimeAttributeCollection**](CommerceRuntimeAttributeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAttribute"></a>
# **updateAttribute**
> LocationAdminAttribute updateAttribute(attributeFQN, responseFields, locationAdminAttribute)

Update Attribute

Update a location attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.locationadmin.ApiClient;
import com.kibocommerce.sdk.locationadmin.ApiException;
import com.kibocommerce.sdk.locationadmin.Configuration;
import com.kibocommerce.sdk.locationadmin.auth.*;
import com.kibocommerce.sdk.locationadmin.models.*;
import com.kibocommerce.sdk.locationadmin.api.LocationAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LocationAttributeDefinitionsApi apiInstance = new LocationAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationAdminAttribute locationAdminAttribute = new LocationAdminAttribute(); // LocationAdminAttribute | 
    try {
      LocationAdminAttribute result = apiInstance.updateAttribute(attributeFQN, responseFields, locationAdminAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationAttributeDefinitionsApi#updateAttribute");
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
| **attributeFQN** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **locationAdminAttribute** | [**LocationAdminAttribute**](LocationAdminAttribute.md)|  | [optional] |

### Return type

[**LocationAdminAttribute**](LocationAdminAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

