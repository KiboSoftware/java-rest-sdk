# ProductAttributesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAttribute**](ProductAttributesApi.md#addAttribute) | **POST** /commerce/catalog/admin/attributedefinition/attributes | Add Product Attribute |
| [**addAttributeVocabularyValue**](ProductAttributesApi.md#addAttributeVocabularyValue) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Add Vocabulary Value |
| [**addAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#addAttributeVocabularyValueLocalizedContent) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Add Vocabulary Value Localized Content |
| [**addLocalizedContent**](ProductAttributesApi.md#addLocalizedContent) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Add Localized Content |
| [**deleteAttribute**](ProductAttributesApi.md#deleteAttribute) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Delete Product Attribute |
| [**deleteAttributeVocabularyValue**](ProductAttributesApi.md#deleteAttributeVocabularyValue) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Delete Vocabulary Value |
| [**deleteAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#deleteAttributeVocabularyValueLocalizedContent) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Delete Vocabulary Value Localized Content by Locale Code |
| [**deleteLocalizedContent**](ProductAttributesApi.md#deleteLocalizedContent) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Delete Localized Content by Locale Code |
| [**getAttribute**](ProductAttributesApi.md#getAttribute) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Get Product Attribute |
| [**getAttributeLocalizedContent**](ProductAttributesApi.md#getAttributeLocalizedContent) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Get Localized Content by Locale Code |
| [**getAttributeLocalizedContents**](ProductAttributesApi.md#getAttributeLocalizedContents) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Get Localized Content |
| [**getAttributeTypeRules**](ProductAttributesApi.md#getAttributeTypeRules) | **GET** /commerce/catalog/admin/attributedefinition/attributes/typerules | Get Attribute Type Rules |
| [**getAttributeVocabularyValue**](ProductAttributesApi.md#getAttributeVocabularyValue) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Get Vocabulary Value |
| [**getAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#getAttributeVocabularyValueLocalizedContent) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Get Vocabulary Value Localized Content by Locale Code |
| [**getAttributeVocabularyValueLocalizedContents**](ProductAttributesApi.md#getAttributeVocabularyValueLocalizedContents) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Get Vocabulary Value Localized Content |
| [**getAttributeVocabularyValues**](ProductAttributesApi.md#getAttributeVocabularyValues) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Vocabulary Values |
| [**getAttributes**](ProductAttributesApi.md#getAttributes) | **GET** /commerce/catalog/admin/attributedefinition/attributes | Get Product Attributes. |
| [**updateAttribute**](ProductAttributesApi.md#updateAttribute) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Update Product Attribute |
| [**updateAttributeVocabularyValue**](ProductAttributesApi.md#updateAttributeVocabularyValue) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Update Vocabulary Value |
| [**updateAttributeVocabularyValueLocalizedContent**](ProductAttributesApi.md#updateAttributeVocabularyValueLocalizedContent) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Update Vocabulary Value Localized Content by Locale Code |
| [**updateAttributeVocabularyValueLocalizedContents**](ProductAttributesApi.md#updateAttributeVocabularyValueLocalizedContents) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Update Vocabulary Value Localized Content |
| [**updateAttributeVocabularyValues**](ProductAttributesApi.md#updateAttributeVocabularyValues) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Update Vocabulary Values |
| [**updateLocalizedContent**](ProductAttributesApi.md#updateLocalizedContent) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Update Localized Content by Locale Code |
| [**updateLocalizedContents**](ProductAttributesApi.md#updateLocalizedContents) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Update Localized Content |


<a name="addAttribute"></a>
# **addAttribute**
> CatalogAdminsAttribute addAttribute(responseFields, catalogAdminsAttribute)

Add Product Attribute

Create a new attribute. The attribute name, attribute type, input type, and data type are required. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsAttribute catalogAdminsAttribute = new CatalogAdminsAttribute(); // CatalogAdminsAttribute | 
    try {
      CatalogAdminsAttribute result = apiInstance.addAttribute(responseFields, catalogAdminsAttribute);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttribute** | [**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)|  | [optional] |

### Return type

[**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addAttributeVocabularyValue"></a>
# **addAttributeVocabularyValue**
> CatalogAdminsAttributeVocabularyValue addAttributeVocabularyValue(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue)

Add Vocabulary Value

Creates product attribute vocabulary values

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue = new CatalogAdminsAttributeVocabularyValue(); // CatalogAdminsAttributeVocabularyValue | 
    try {
      CatalogAdminsAttributeVocabularyValue result = apiInstance.addAttributeVocabularyValue(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttributeVocabularyValue** | [**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addAttributeVocabularyValueLocalizedContent"></a>
# **addAttributeVocabularyValueLocalizedContent**
> AttributeVocabularyValueLocalizedContent addAttributeVocabularyValueLocalizedContent(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent)

Add Vocabulary Value Localized Content

Creates vocabulary value localized content

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = new AttributeVocabularyValueLocalizedContent(); // AttributeVocabularyValueLocalizedContent | 
    try {
      AttributeVocabularyValueLocalizedContent result = apiInstance.addAttributeVocabularyValueLocalizedContent(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **attributeVocabularyValueLocalizedContent** | [**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)|  | [optional] |

### Return type

[**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addLocalizedContent"></a>
# **addLocalizedContent**
> CatalogAdminsAttributeLocalizedContent addLocalizedContent(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent)

Add Localized Content

Creates product attribute localized content

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent = new CatalogAdminsAttributeLocalizedContent(); // CatalogAdminsAttributeLocalizedContent | 
    try {
      CatalogAdminsAttributeLocalizedContent result = apiInstance.addLocalizedContent(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttributeLocalizedContent** | [**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteAttribute"></a>
# **deleteAttribute**
> deleteAttribute(attributeFQN)

Delete Product Attribute

Deletes a product attribute by its FQN

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteAttributeVocabularyValue"></a>
# **deleteAttributeVocabularyValue**
> deleteAttributeVocabularyValue(attributeFQN, value)

Delete Vocabulary Value

Deletes a product attribute vocabulary value

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteAttributeVocabularyValueLocalizedContent"></a>
# **deleteAttributeVocabularyValueLocalizedContent**
> deleteAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode)

Delete Vocabulary Value Localized Content by Locale Code

Delete product attribute vocabulary value localized content by its locale code

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteLocalizedContent"></a>
# **deleteLocalizedContent**
> deleteLocalizedContent(attributeFQN, localeCode)

Delete Localized Content by Locale Code

Deletes localized content by its locale code

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttribute"></a>
# **getAttribute**
> CatalogAdminsAttribute getAttribute(attributeFQN, responseGroups, responseFields)

Get Product Attribute

Retrieves a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsAttribute result = apiInstance.getAttribute(attributeFQN, responseGroups, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributeLocalizedContent"></a>
# **getAttributeLocalizedContent**
> CatalogAdminsAttributeLocalizedContent getAttributeLocalizedContent(attributeFQN, localeCode, responseFields)

Get Localized Content by Locale Code

Retrieves localized content by its locale code

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsAttributeLocalizedContent result = apiInstance.getAttributeLocalizedContent(attributeFQN, localeCode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributeLocalizedContents"></a>
# **getAttributeLocalizedContents**
> List&lt;CatalogAdminsAttributeLocalizedContent&gt; getAttributeLocalizedContents(attributeFQN, responseFields)

Get Localized Content

Retrieves product attribute localized content

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CatalogAdminsAttributeLocalizedContent> result = apiInstance.getAttributeLocalizedContents(attributeFQN, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CatalogAdminsAttributeLocalizedContent&gt;**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributeTypeRules"></a>
# **getAttributeTypeRules**
> AttributeTypeRuleCollection getAttributeTypeRules(startIndex, pageSize, sortBy, filter, responseFields)

Get Attribute Type Rules

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AttributeTypeRuleCollection result = apiInstance.getAttributeTypeRules(startIndex, pageSize, sortBy, filter, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AttributeTypeRuleCollection**](AttributeTypeRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributeVocabularyValue"></a>
# **getAttributeVocabularyValue**
> CatalogAdminsAttributeVocabularyValue getAttributeVocabularyValue(attributeFQN, value, responseFields)

Get Vocabulary Value

Retrieves a product attribute vocabulary value

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsAttributeVocabularyValue result = apiInstance.getAttributeVocabularyValue(attributeFQN, value, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributeVocabularyValueLocalizedContent"></a>
# **getAttributeVocabularyValueLocalizedContent**
> AttributeVocabularyValueLocalizedContent getAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode, responseFields)

Get Vocabulary Value Localized Content by Locale Code

Get product attribute vocabulary value localized content by its locale code

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AttributeVocabularyValueLocalizedContent result = apiInstance.getAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAttributeVocabularyValueLocalizedContents"></a>
# **getAttributeVocabularyValueLocalizedContents**
> List&lt;AttributeVocabularyValueLocalizedContent&gt; getAttributeVocabularyValueLocalizedContents(attributeFQN, value, responseFields)

Get Vocabulary Value Localized Content

Retrieves vocabulary value localized content

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<AttributeVocabularyValueLocalizedContent> result = apiInstance.getAttributeVocabularyValueLocalizedContents(attributeFQN, value, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;AttributeVocabularyValueLocalizedContent&gt;**](AttributeVocabularyValueLocalizedContent.md)

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
> List&lt;CatalogAdminsAttributeVocabularyValue&gt; getAttributeVocabularyValues(attributeFQN, responseGroups, responseFields)

Get Vocabulary Values

Retrieves product attribute vocabulary values

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CatalogAdminsAttributeVocabularyValue> result = apiInstance.getAttributeVocabularyValues(attributeFQN, responseGroups, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;CatalogAdminsAttributeVocabularyValue&gt;**](CatalogAdminsAttributeVocabularyValue.md)

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
> CatalogAdminsAttributeCollection getAttributes(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get Product Attributes.

Get product attributes. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsAttributeCollection result = apiInstance.getAttributes(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsAttributeCollection**](CatalogAdminsAttributeCollection.md)

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
> CatalogAdminsAttribute updateAttribute(attributeFQN, responseFields, catalogAdminsAttribute)

Update Product Attribute

Updates a product attribute by its FQN. This current version of the Attributes API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access attribute data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsAttribute catalogAdminsAttribute = new CatalogAdminsAttribute(); // CatalogAdminsAttribute | 
    try {
      CatalogAdminsAttribute result = apiInstance.updateAttribute(attributeFQN, responseFields, catalogAdminsAttribute);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttribute** | [**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)|  | [optional] |

### Return type

[**CatalogAdminsAttribute**](CatalogAdminsAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateAttributeVocabularyValue"></a>
# **updateAttributeVocabularyValue**
> CatalogAdminsAttributeVocabularyValue updateAttributeVocabularyValue(attributeFQN, value, responseFields, catalogAdminsAttributeVocabularyValue)

Update Vocabulary Value

Updates a product attribute vocabulary value

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue = new CatalogAdminsAttributeVocabularyValue(); // CatalogAdminsAttributeVocabularyValue | 
    try {
      CatalogAdminsAttributeVocabularyValue result = apiInstance.updateAttributeVocabularyValue(attributeFQN, value, responseFields, catalogAdminsAttributeVocabularyValue);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttributeVocabularyValue** | [**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeVocabularyValue**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateAttributeVocabularyValueLocalizedContent"></a>
# **updateAttributeVocabularyValueLocalizedContent**
> AttributeVocabularyValueLocalizedContent updateAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode, responseFields, attributeVocabularyValueLocalizedContent)

Update Vocabulary Value Localized Content by Locale Code

Update product attribute vocabulary value localized content by its locale code

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AttributeVocabularyValueLocalizedContent attributeVocabularyValueLocalizedContent = new AttributeVocabularyValueLocalizedContent(); // AttributeVocabularyValueLocalizedContent | 
    try {
      AttributeVocabularyValueLocalizedContent result = apiInstance.updateAttributeVocabularyValueLocalizedContent(attributeFQN, value, localeCode, responseFields, attributeVocabularyValueLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **attributeVocabularyValueLocalizedContent** | [**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)|  | [optional] |

### Return type

[**AttributeVocabularyValueLocalizedContent**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateAttributeVocabularyValueLocalizedContents"></a>
# **updateAttributeVocabularyValueLocalizedContents**
> List&lt;AttributeVocabularyValueLocalizedContent&gt; updateAttributeVocabularyValueLocalizedContents(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent)

Update Vocabulary Value Localized Content

Updates vocabulary value localized content

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String value = "value_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<AttributeVocabularyValueLocalizedContent> attributeVocabularyValueLocalizedContent = Arrays.asList(); // List<AttributeVocabularyValueLocalizedContent> | 
    try {
      List<AttributeVocabularyValueLocalizedContent> result = apiInstance.updateAttributeVocabularyValueLocalizedContents(attributeFQN, value, responseFields, attributeVocabularyValueLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **attributeVocabularyValueLocalizedContent** | [**List&lt;AttributeVocabularyValueLocalizedContent&gt;**](AttributeVocabularyValueLocalizedContent.md)|  | [optional] |

### Return type

[**List&lt;AttributeVocabularyValueLocalizedContent&gt;**](AttributeVocabularyValueLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateAttributeVocabularyValues"></a>
# **updateAttributeVocabularyValues**
> List&lt;CatalogAdminsAttributeVocabularyValue&gt; updateAttributeVocabularyValues(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue)

Update Vocabulary Values

Updates product attribute vocabulary values

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CatalogAdminsAttributeVocabularyValue> catalogAdminsAttributeVocabularyValue = Arrays.asList(); // List<CatalogAdminsAttributeVocabularyValue> | 
    try {
      List<CatalogAdminsAttributeVocabularyValue> result = apiInstance.updateAttributeVocabularyValues(attributeFQN, responseFields, catalogAdminsAttributeVocabularyValue);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttributeVocabularyValue** | [**List&lt;CatalogAdminsAttributeVocabularyValue&gt;**](CatalogAdminsAttributeVocabularyValue.md)|  | [optional] |

### Return type

[**List&lt;CatalogAdminsAttributeVocabularyValue&gt;**](CatalogAdminsAttributeVocabularyValue.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateLocalizedContent"></a>
# **updateLocalizedContent**
> CatalogAdminsAttributeLocalizedContent updateLocalizedContent(attributeFQN, localeCode, responseFields, catalogAdminsAttributeLocalizedContent)

Update Localized Content by Locale Code

Updates localized content by its locale code

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String localeCode = "localeCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsAttributeLocalizedContent catalogAdminsAttributeLocalizedContent = new CatalogAdminsAttributeLocalizedContent(); // CatalogAdminsAttributeLocalizedContent | 
    try {
      CatalogAdminsAttributeLocalizedContent result = apiInstance.updateLocalizedContent(attributeFQN, localeCode, responseFields, catalogAdminsAttributeLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttributeLocalizedContent** | [**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)|  | [optional] |

### Return type

[**CatalogAdminsAttributeLocalizedContent**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateLocalizedContents"></a>
# **updateLocalizedContents**
> List&lt;CatalogAdminsAttributeLocalizedContent&gt; updateLocalizedContents(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent)

Update Localized Content

Updates product attribute localized content

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

    ProductAttributesApi apiInstance = new ProductAttributesApi(defaultClient);
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<CatalogAdminsAttributeLocalizedContent> catalogAdminsAttributeLocalizedContent = Arrays.asList(); // List<CatalogAdminsAttributeLocalizedContent> | 
    try {
      List<CatalogAdminsAttributeLocalizedContent> result = apiInstance.updateLocalizedContents(attributeFQN, responseFields, catalogAdminsAttributeLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsAttributeLocalizedContent** | [**List&lt;CatalogAdminsAttributeLocalizedContent&gt;**](CatalogAdminsAttributeLocalizedContent.md)|  | [optional] |

### Return type

[**List&lt;CatalogAdminsAttributeLocalizedContent&gt;**](CatalogAdminsAttributeLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

