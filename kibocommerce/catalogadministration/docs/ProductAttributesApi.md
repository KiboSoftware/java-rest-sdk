# ProductAttributesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAttribute**](ProductAttributesApi.md#addAttribute) | **POST** /commerce/catalog/admin/attributedefinition/attributes | Add a product attribute |
| [**addAttributeVocabularyValue**](ProductAttributesApi.md#addAttributeVocabularyValue) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Add product attribute vocabulary value |
| [**addAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#addAttributeVocabularyValueLocalizedContent) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Add product attribute vocabulary value |
| [**addLocalizedContent**](ProductAttributesApi.md#addLocalizedContent) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Add product attribute localized content |
| [**deleteAttribute**](ProductAttributesApi.md#deleteAttribute) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Delete product attribute |
| [**deleteAttributeVocabularyValue**](ProductAttributesApi.md#deleteAttributeVocabularyValue) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Delete product attribute vocabulary value |
| [**deleteAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#deleteAttributeVocabularyValueLocalizedContent) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Delete product attribute vocabulary value localized content |
| [**deleteLocalizedContent**](ProductAttributesApi.md#deleteLocalizedContent) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Delete product attribute localized content |
| [**getAttribute**](ProductAttributesApi.md#getAttribute) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Get product attribute |
| [**getAttributeLocalizedContent**](ProductAttributesApi.md#getAttributeLocalizedContent) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Get product attribute localized content |
| [**getAttributeLocalizedContents**](ProductAttributesApi.md#getAttributeLocalizedContents) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Get product attribute localized contents |
| [**getAttributeTypeRules**](ProductAttributesApi.md#getAttributeTypeRules) | **GET** /commerce/catalog/admin/attributedefinition/attributes/typerules | Get attribute type rules |
| [**getAttributeVocabularyValue**](ProductAttributesApi.md#getAttributeVocabularyValue) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Get product attribute vocabulary value |
| [**getAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#getAttributeVocabularyValueLocalizedContent) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Get product attribute vocabulary value localized content |
| [**getAttributeVocabularyValueLocalizedContents**](ProductAttributesApi.md#getAttributeVocabularyValueLocalizedContents) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Get product attribute vocabulary value localized content |
| [**getAttributeVocabularyValues**](ProductAttributesApi.md#getAttributeVocabularyValues) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Get product attribute vocabulary values |
| [**getAttributes**](ProductAttributesApi.md#getAttributes) | **GET** /commerce/catalog/admin/attributedefinition/attributes | Get product attributes |
| [**updateAttribute**](ProductAttributesApi.md#updateAttribute) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Update a product attribute |
| [**updateAttributeVocabularyValue**](ProductAttributesApi.md#updateAttributeVocabularyValue) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Update product attribute vocabulary value |
| [**updateAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#updateAttributeVocabularyValueLocalizedContent) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Update product attribute vocabulary value localized content |
| [**updateAttributeVocabularyValueLocalizedContents**](ProductAttributesApi.md#updateAttributeVocabularyValueLocalizedContents) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Update product attribute vocabulary value localized content |
| [**updateAttributeVocabularyValues**](ProductAttributesApi.md#updateAttributeVocabularyValues) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Update product attribute vocabulary values |
| [**updateLocalizedContent**](ProductAttributesApi.md#updateLocalizedContent) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Update product attribute localized content |
| [**updateLocalizedContents**](ProductAttributesApi.md#updateLocalizedContents) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Update product attribute localized content |


<a name="addAttribute"></a>
# **addAttribute**
> CatalogAdminsAttribute addAttribute(catalogAdminsAttribute)

Add a product attribute

Add / Create Attribute

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    CatalogAdminsAttribute catalogAdminsAttribute = new CatalogAdminsAttribute(); // CatalogAdminsAttribute | 
    try {
      CatalogAdminsAttribute result = apiInstance.addAttribute(catalogAdminsAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#addAttribute");
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
| **catalogAdminsAttribute** | [**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)|  | [optional] |

### Return type

[**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAttributeVocabularyValue"></a>
# **addAttributeVocabularyValue**
> CatalogAdminsAttributeVocabularyValue addAttributeVocabularyValue(attributeFQN, catalogAdminsAttributeVocabularyValue)

Add product attribute vocabulary value

Add product attribute vocabulary value

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue = new CatalogAdminsAttributeVocabularyValue(); // CatalogAdminsAttributeVocabularyValue | 
    try {
      CatalogAdminsAttributeVocabularyValue result = apiInstance.addAttributeVocabularyValue(attributeFQN, catalogAdminsAttributeVocabularyValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#addAttributeVocabularyValue");
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
| **catalogAdminsAttributeVocabularyValue** | [**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAttributeVocabularyValueLocalizedContent"></a>
# **addAttributeVocabularyValueLocalizedContent**
> AttributeVocabularyValueLocalizedContent addAttributeVocabularyValueLocalizedContent(attributeFQN, value, attributeVocabularyValueLocalizedContent)

Add product attribute vocabulary value



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = new AttributeVocabularyValueLocalizedContent(); // AttributeVocabularyValueLocalizedContent | 
    try {
      AttributeVocabularyValueLocalizedContent result = apiInstance.addAttributeVocabularyValueLocalizedContent(attributeFQN, value, attributeVocabularyValueLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#addAttributeVocabularyValueLocalizedContent");
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
| **value** | **String**|  | |
| **attributeVocabularyValueLocalizedContent** | [**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)|  | [optional] |

### Return type

[**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addLocalizedContent"></a>
# **addLocalizedContent**
> CatalogAdminsAttributeLocalizedContent addLocalizedContent(attributeFQN, catalogAdminsAttributeLocalizedContent)

Add product attribute localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent = new CatalogAdminsAttributeLocalizedContent(); // CatalogAdminsAttributeLocalizedContent | 
    try {
      CatalogAdminsAttributeLocalizedContent result = apiInstance.addLocalizedContent(attributeFQN, catalogAdminsAttributeLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#addLocalizedContent");
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
| **catalogAdminsAttributeLocalizedContent** | [**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteAttribute"></a>
# **deleteAttribute**
> deleteAttribute(attributeFQN)

Delete product attribute



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteAttribute(attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#deleteAttribute");
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

<a name="deleteAttributeVocabularyValue"></a>
# **deleteAttributeVocabularyValue**
> deleteAttributeVocabularyValue(attributeFQN, value)

Delete product attribute vocabulary value



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    try {
      apiInstance.deleteAttributeVocabularyValue(attributeFQN, value);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#deleteAttributeVocabularyValue");
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
| **value** | **String**|  | |

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

<a name="deleteAttributeVocabularyValueLocalizedContent"></a>
# **deleteAttributeVocabularyValueLocalizedContent**
> deleteAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode)

Delete product attribute vocabulary value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    try {
      apiInstance.deleteAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#deleteAttributeVocabularyValueLocalizedContent");
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
| **value** | **String**|  | |
| **localeCode** | **String**|  | |

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

<a name="deleteLocalizedContent"></a>
# **deleteLocalizedContent**
> deleteLocalizedContent(attributeFQN, localeCode)

Delete product attribute localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    try {
      apiInstance.deleteLocalizedContent(attributeFQN, localeCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#deleteLocalizedContent");
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
| **localeCode** | **String**|  | |

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

<a name="getAttribute"></a>
# **getAttribute**
> CatalogAdminsAttribute getAttribute(attributeFQN, responseGroups)

Get product attribute



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      CatalogAdminsAttribute result = apiInstance.getAttribute(attributeFQN, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttribute");
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

[**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeLocalizedContent"></a>
# **getAttributeLocalizedContent**
> CatalogAdminsAttributeLocalizedContent getAttributeLocalizedContent(attributeFQN, localeCode)

Get product attribute localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    try {
      CatalogAdminsAttributeLocalizedContent result = apiInstance.getAttributeLocalizedContent(attributeFQN, localeCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributeLocalizedContent");
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
| **localeCode** | **String**|  | |

### Return type

[**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeLocalizedContents"></a>
# **getAttributeLocalizedContents**
> List&lt;CatalogAdminsAttributeLocalizedContent&gt; getAttributeLocalizedContents(attributeFQN)

Get product attribute localized contents



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      List<CatalogAdminsAttributeLocalizedContent> result = apiInstance.getAttributeLocalizedContents(attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributeLocalizedContents");
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

### Return type

[**List&lt;CatalogAdminsAttributeLocalizedContent&gt;**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeTypeRules"></a>
# **getAttributeTypeRules**
> AttributeTypeRuleCollection getAttributeTypeRules(startIndex, pageSize, sortBy, filter)

Get attribute type rules

Retrieves a paged list of attribute type rules according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      AttributeTypeRuleCollection result = apiInstance.getAttributeTypeRules(startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributeTypeRules");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |

### Return type

[**AttributeTypeRuleCollection**](AttributeTypeRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeVocabularyValue"></a>
# **getAttributeVocabularyValue**
> CatalogAdminsAttributeVocabularyValue getAttributeVocabularyValue(attributeFQN, value)

Get product attribute vocabulary value



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    try {
      CatalogAdminsAttributeVocabularyValue result = apiInstance.getAttributeVocabularyValue(attributeFQN, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributeVocabularyValue");
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
| **value** | **String**|  | |

### Return type

[**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeVocabularyValueLocalizedContent"></a>
# **getAttributeVocabularyValueLocalizedContent**
> AttributeVocabularyValueLocalizedContent getAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode)

Get product attribute vocabulary value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    try {
      AttributeVocabularyValueLocalizedContent result = apiInstance.getAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributeVocabularyValueLocalizedContent");
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
| **value** | **String**|  | |
| **localeCode** | **String**|  | |

### Return type

[**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttributeVocabularyValueLocalizedContents"></a>
# **getAttributeVocabularyValueLocalizedContents**
> List&lt;AttributeVocabularyValueLocalizedContent&gt; getAttributeVocabularyValueLocalizedContents(attributeFQN, value)

Get product attribute vocabulary value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    try {
      List<AttributeVocabularyValueLocalizedContent> result = apiInstance.getAttributeVocabularyValueLocalizedContents(attributeFQN, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributeVocabularyValueLocalizedContents");
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
| **value** | **String**|  | |

### Return type

[**List&lt;AttributeVocabularyValueLocalizedContent&gt;**](AttributeVocabularyValueLocalizedContent.md)

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
> List&lt;CatalogAdminsAttributeVocabularyValue&gt; getAttributeVocabularyValues(attributeFQN, responseGroups)

Get product attribute vocabulary values



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      List<CatalogAdminsAttributeVocabularyValue> result = apiInstance.getAttributeVocabularyValues(attributeFQN, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributeVocabularyValues");
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

[**List&lt;CatalogAdminsAttributeVocabularyValue&gt;**](CatalogAdminsAttributeVocabularyValue.md)

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
> CatalogAdminsAttributeCollection getAttributes(startIndex, pageSize, sortBy, filter, responseGroups)

Get product attributes

Get product attributes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      CatalogAdminsAttributeCollection result = apiInstance.getAttributes(startIndex, pageSize, sortBy, filter, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#getAttributes");
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
| **filter** | **String**|  | [optional] |
| **responseGroups** | **String**|  | [optional] |

### Return type

[**CatalogAdminsAttributeCollection**](CatalogAdminsAttributeCollection.md)

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
> CatalogAdminsAttribute updateAttribute(attributeFQN, catalogAdminsAttribute)

Update a product attribute



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    CatalogAdminsAttribute catalogAdminsAttribute = new CatalogAdminsAttribute(); // CatalogAdminsAttribute | 
    try {
      CatalogAdminsAttribute result = apiInstance.updateAttribute(attributeFQN, catalogAdminsAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#updateAttribute");
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
| **catalogAdminsAttribute** | [**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)|  | [optional] |

### Return type

[**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAttributeVocabularyValue"></a>
# **updateAttributeVocabularyValue**
> CatalogAdminsAttributeVocabularyValue updateAttributeVocabularyValue(attributeFQN, value, catalogAdminsAttributeVocabularyValue)

Update product attribute vocabulary value



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue = new CatalogAdminsAttributeVocabularyValue(); // CatalogAdminsAttributeVocabularyValue | 
    try {
      CatalogAdminsAttributeVocabularyValue result = apiInstance.updateAttributeVocabularyValue(attributeFQN, value, catalogAdminsAttributeVocabularyValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#updateAttributeVocabularyValue");
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
| **value** | **String**|  | |
| **catalogAdminsAttributeVocabularyValue** | [**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAttributeVocabularyValueLocalizedContent"></a>
# **updateAttributeVocabularyValueLocalizedContent**
> AttributeVocabularyValueLocalizedContent updateAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode, attributeVocabularyValueLocalizedContent)

Update product attribute vocabulary value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = new AttributeVocabularyValueLocalizedContent(); // AttributeVocabularyValueLocalizedContent | 
    try {
      AttributeVocabularyValueLocalizedContent result = apiInstance.updateAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode, attributeVocabularyValueLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#updateAttributeVocabularyValueLocalizedContent");
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
| **value** | **String**|  | |
| **localeCode** | **String**|  | |
| **attributeVocabularyValueLocalizedContent** | [**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)|  | [optional] |

### Return type

[**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAttributeVocabularyValueLocalizedContents"></a>
# **updateAttributeVocabularyValueLocalizedContents**
> List&lt;AttributeVocabularyValueLocalizedContent&gt; updateAttributeVocabularyValueLocalizedContents(attributeFQN, value, attributeVocabularyValueLocalizedContent)

Update product attribute vocabulary value localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    List<AttributeVocabularyValueLocalizedContent> attributeVocabularyValueLocalizedContent = Arrays.asList(); // List<AttributeVocabularyValueLocalizedContent> | 
    try {
      List<AttributeVocabularyValueLocalizedContent> result = apiInstance.updateAttributeVocabularyValueLocalizedContents(attributeFQN, value, attributeVocabularyValueLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#updateAttributeVocabularyValueLocalizedContents");
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
| **value** | **String**|  | |
| **attributeVocabularyValueLocalizedContent** | [**List&lt;AttributeVocabularyValueLocalizedContent&gt;**](AttributeVocabularyValueLocalizedContent.md)|  | [optional] |

### Return type

[**List&lt;AttributeVocabularyValueLocalizedContent&gt;**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAttributeVocabularyValues"></a>
# **updateAttributeVocabularyValues**
> List&lt;CatalogAdminsAttributeVocabularyValue&gt; updateAttributeVocabularyValues(attributeFQN, catalogAdminsAttributeVocabularyValue)

Update product attribute vocabulary values



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    List<CatalogAdminsAttributeVocabularyValue> catalogAdminsAttributeVocabularyValue = Arrays.asList(); // List<CatalogAdminsAttributeVocabularyValue> | 
    try {
      List<CatalogAdminsAttributeVocabularyValue> result = apiInstance.updateAttributeVocabularyValues(attributeFQN, catalogAdminsAttributeVocabularyValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#updateAttributeVocabularyValues");
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
| **catalogAdminsAttributeVocabularyValue** | [**List&lt;CatalogAdminsAttributeVocabularyValue&gt;**](CatalogAdminsAttributeVocabularyValue.md)|  | [optional] |

### Return type

[**List&lt;CatalogAdminsAttributeVocabularyValue&gt;**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateLocalizedContent"></a>
# **updateLocalizedContent**
> CatalogAdminsAttributeLocalizedContent updateLocalizedContent(attributeFQN, localeCode, catalogAdminsAttributeLocalizedContent)

Update product attribute localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent = new CatalogAdminsAttributeLocalizedContent(); // CatalogAdminsAttributeLocalizedContent | 
    try {
      CatalogAdminsAttributeLocalizedContent result = apiInstance.updateLocalizedContent(attributeFQN, localeCode, catalogAdminsAttributeLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#updateLocalizedContent");
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
| **localeCode** | **String**|  | |
| **catalogAdminsAttributeLocalizedContent** | [**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateLocalizedContents"></a>
# **updateLocalizedContents**
> List&lt;CatalogAdminsAttributeLocalizedContent&gt; updateLocalizedContents(attributeFQN, catalogAdminsAttributeLocalizedContent)

Update product attribute localized content



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductAttributesApi;

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    List<CatalogAdminsAttributeLocalizedContent> catalogAdminsAttributeLocalizedContent = Arrays.asList(); // List<CatalogAdminsAttributeLocalizedContent> | 
    try {
      List<CatalogAdminsAttributeLocalizedContent> result = apiInstance.updateLocalizedContents(attributeFQN, catalogAdminsAttributeLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductAttributesApi#updateLocalizedContents");
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
| **catalogAdminsAttributeLocalizedContent** | [**List&lt;CatalogAdminsAttributeLocalizedContent&gt;**](CatalogAdminsAttributeLocalizedContent.md)|  | [optional] |

### Return type

[**List&lt;CatalogAdminsAttributeLocalizedContent&gt;**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

