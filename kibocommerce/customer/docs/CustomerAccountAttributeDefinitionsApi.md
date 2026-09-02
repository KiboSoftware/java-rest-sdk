# CustomerAccountAttributeDefinitionsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttribute**](CustomerAccountAttributeDefinitionsApi.md#createAttribute) | **POST** /commerce/customer/accountattributedefinition/attributes | Create Attribute |
| [**getAttribute**](CustomerAccountAttributeDefinitionsApi.md#getAttribute) | **GET** /commerce/customer/accountattributedefinition/attributes/{attributeFQN} | Get Attribute |
| [**getAttributeVocabularyValues**](CustomerAccountAttributeDefinitionsApi.md#getAttributeVocabularyValues) | **GET** /commerce/customer/accountattributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Attribute Vocabulary Values |
| [**getAttributes**](CustomerAccountAttributeDefinitionsApi.md#getAttributes) | **GET** /commerce/customer/accountattributedefinition/attributes | Get Attributes |
| [**updateAttribute**](CustomerAccountAttributeDefinitionsApi.md#updateAttribute) | **PUT** /commerce/customer/accountattributedefinition/attributes/{attributeFQN} | Update Attribute |


<a name="createAttribute"></a>
# **createAttribute**
> CustomerAttribute2 createAttribute(responseFields, customerAttribute2)

Create Attribute

Create a new customer attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerAccountAttributeDefinitionsApi apiInstance = new CustomerAccountAttributeDefinitionsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerAttribute2 customerAttribute2 = new CustomerAttribute2(); // CustomerAttribute2 | 
    try {
      CustomerAttribute2 result = apiInstance.createAttribute(responseFields, customerAttribute2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountAttributeDefinitionsApi#createAttribute");
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
| **customerAttribute2** | [**CustomerAttribute2**](CustomerAttribute2.md)|  | [optional] |

### Return type

[**CustomerAttribute2**](CustomerAttribute2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttribute"></a>
# **getAttribute**
> CustomerAttribute2 getAttribute(attributeFQN, responseGroups, responseFields)

Get Attribute

Get a customer attribute by its attributeFQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerAccountAttributeDefinitionsApi apiInstance = new CustomerAccountAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerAttribute2 result = apiInstance.getAttribute(attributeFQN, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountAttributeDefinitionsApi#getAttribute");
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

[**CustomerAttribute2**](CustomerAttribute2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributeVocabularyValues"></a>
# **getAttributeVocabularyValues**
> List&lt;CommerceRuntimeAttributeVocabularyValue&gt; getAttributeVocabularyValues(attributeFQN, responseGroups, responseFields)

Get Attribute Vocabulary Values

Retrieves the details of attribute vocabulary values.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerAccountAttributeDefinitionsApi apiInstance = new CustomerAccountAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CommerceRuntimeAttributeVocabularyValue> result = apiInstance.getAttributeVocabularyValues(attributeFQN, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountAttributeDefinitionsApi#getAttributeVocabularyValues");
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

[**List&lt;CommerceRuntimeAttributeVocabularyValue&gt;**](CommerceRuntimeAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributes"></a>
# **getAttributes**
> CommerceRuntimeAttributeCollection getAttributes(startIndex, pageSize, sortBy, responseGroups, filter, responseFields)

Get Attributes

Retrieves the details of attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerAccountAttributeDefinitionsApi apiInstance = new CustomerAccountAttributeDefinitionsApi(defaultClient);
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
      System.err.println("Exception when calling CustomerAccountAttributeDefinitionsApi#getAttributes");
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
| **200** | OK |  -  |

<a name="updateAttribute"></a>
# **updateAttribute**
> CustomerAttribute2 updateAttribute(attributeFQN, responseFields, customerAttribute2)

Update Attribute

Update a customer attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountAttributeDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerAccountAttributeDefinitionsApi apiInstance = new CustomerAccountAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerAttribute2 customerAttribute2 = new CustomerAttribute2(); // CustomerAttribute2 | 
    try {
      CustomerAttribute2 result = apiInstance.updateAttribute(attributeFQN, responseFields, customerAttribute2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountAttributeDefinitionsApi#updateAttribute");
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
| **customerAttribute2** | [**CustomerAttribute2**](CustomerAttribute2.md)|  | [optional] |

### Return type

[**CustomerAttribute2**](CustomerAttribute2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

