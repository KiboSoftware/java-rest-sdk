# OrderAttributeDefinitionsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttribute**](OrderAttributeDefinitionsApi.md#createAttribute) | **POST** /commerce/orders/attributedefinition/attributes | Create Attribute |
| [**getAttribute**](OrderAttributeDefinitionsApi.md#getAttribute) | **GET** /commerce/orders/attributedefinition/attributes/{attributeFQN} | Get Attribute |
| [**getAttributeVocabularyValues**](OrderAttributeDefinitionsApi.md#getAttributeVocabularyValues) | **GET** /commerce/orders/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Attribute Vocabulary Values |
| [**getAttributes**](OrderAttributeDefinitionsApi.md#getAttributes) | **GET** /commerce/orders/attributedefinition/attributes | Get Attributes |
| [**updateAttribute**](OrderAttributeDefinitionsApi.md#updateAttribute) | **PUT** /commerce/orders/attributedefinition/attributes/{attributeFQN} | Update Attribute |


<a name="createAttribute"></a>
# **createAttribute**
> CommerceRuntimeAttribute createAttribute(commerceRuntimeAttribute)

Create Attribute

Create Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderAttributeDefinitionsApi;

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

    OrderAttributeDefinitionsApi apiInstance = new OrderAttributeDefinitionsApi(defaultClient);
    CommerceRuntimeAttribute commerceRuntimeAttribute = new CommerceRuntimeAttribute(); // CommerceRuntimeAttribute | 
    try {
      CommerceRuntimeAttribute result = apiInstance.createAttribute(commerceRuntimeAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderAttributeDefinitionsApi#createAttribute");
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
| **commerceRuntimeAttribute** | [**CommerceRuntimeAttribute**](CommerceRuntimeAttribute.md)|  | [optional] |

### Return type

[**CommerceRuntimeAttribute**](CommerceRuntimeAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttribute"></a>
# **getAttribute**
> CommerceRuntimeAttribute getAttribute(attributeFQN, responseGroups)

Get Attribute

Get Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderAttributeDefinitionsApi;

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

    OrderAttributeDefinitionsApi apiInstance = new OrderAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      CommerceRuntimeAttribute result = apiInstance.getAttribute(attributeFQN, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderAttributeDefinitionsApi#getAttribute");
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

### Return type

[**CommerceRuntimeAttribute**](CommerceRuntimeAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeVocabularyValues"></a>
# **getAttributeVocabularyValues**
> List&lt;CommerceRuntimeAttributeVocabularyValue&gt; getAttributeVocabularyValues(attributeFQN, responseGroups)

Get Attribute Vocabulary Values

Get Attribute Vocabulary Values

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderAttributeDefinitionsApi;

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

    OrderAttributeDefinitionsApi apiInstance = new OrderAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      List<CommerceRuntimeAttributeVocabularyValue> result = apiInstance.getAttributeVocabularyValues(attributeFQN, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderAttributeDefinitionsApi#getAttributeVocabularyValues");
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

### Return type

[**List&lt;CommerceRuntimeAttributeVocabularyValue&gt;**](CommerceRuntimeAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributes"></a>
# **getAttributes**
> CommerceRuntimeAttributeCollection getAttributes(startIndex, pageSize, sortBy, responseGroups, filter)

Get Attributes

Get Attributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderAttributeDefinitionsApi;

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

    OrderAttributeDefinitionsApi apiInstance = new OrderAttributeDefinitionsApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      CommerceRuntimeAttributeCollection result = apiInstance.getAttributes(startIndex, pageSize, sortBy, responseGroups, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderAttributeDefinitionsApi#getAttributes");
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

### Return type

[**CommerceRuntimeAttributeCollection**](CommerceRuntimeAttributeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAttribute"></a>
# **updateAttribute**
> CommerceRuntimeAttribute updateAttribute(attributeFQN, commerceRuntimeAttribute)

Update Attribute

Update Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.OrderAttributeDefinitionsApi;

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

    OrderAttributeDefinitionsApi apiInstance = new OrderAttributeDefinitionsApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    CommerceRuntimeAttribute commerceRuntimeAttribute = new CommerceRuntimeAttribute(); // CommerceRuntimeAttribute | 
    try {
      CommerceRuntimeAttribute result = apiInstance.updateAttribute(attributeFQN, commerceRuntimeAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderAttributeDefinitionsApi#updateAttribute");
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
| **commerceRuntimeAttribute** | [**CommerceRuntimeAttribute**](CommerceRuntimeAttribute.md)|  | [optional] |

### Return type

[**CommerceRuntimeAttribute**](CommerceRuntimeAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

