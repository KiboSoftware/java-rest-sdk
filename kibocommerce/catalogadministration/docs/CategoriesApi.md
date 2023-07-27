# CategoriesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCategory**](CategoriesApi.md#addCategory) | **POST** /commerce/catalog/admin/categories | Add category |
| [**addCategoryAttribute**](CategoriesApi.md#addCategoryAttribute) | **POST** /commerce/catalog/admin/categories/{categoryId}/attributes | Add category attribute |
| [**addProductsToCategory**](CategoriesApi.md#addProductsToCategory) | **POST** /commerce/catalog/admin/categories/{categoryId}/add-products | Add products to category |
| [**deleteCategoryAttribute**](CategoriesApi.md#deleteCategoryAttribute) | **DELETE** /commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN} | Delete category attribute |
| [**deleteCategoryById**](CategoriesApi.md#deleteCategoryById) | **DELETE** /commerce/catalog/admin/categories/{categoryId} | Delete category |
| [**getCategories**](CategoriesApi.md#getCategories) | **GET** /commerce/catalog/admin/categories | Get categories |
| [**getCategory**](CategoriesApi.md#getCategory) | **GET** /commerce/catalog/admin/categories/{categoryId} | Get category |
| [**getCategoryAttribute**](CategoriesApi.md#getCategoryAttribute) | **GET** /commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN} | Get category attribute |
| [**getCategoryAttributes**](CategoriesApi.md#getCategoryAttributes) | **GET** /commerce/catalog/admin/categories/{categoryId}/attributes | Get category attributes |
| [**getChildCategories**](CategoriesApi.md#getChildCategories) | **GET** /commerce/catalog/admin/categories/{categoryId}/children | Get child categories |
| [**removeProductsFromCategory**](CategoriesApi.md#removeProductsFromCategory) | **POST** /commerce/catalog/admin/categories/{categoryId}/remove-products | Remove products from category |
| [**updateCategory**](CategoriesApi.md#updateCategory) | **PUT** /commerce/catalog/admin/categories/{categoryId} | Update category |
| [**updateCategoryAttribute**](CategoriesApi.md#updateCategoryAttribute) | **PUT** /commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN} | Update category attribute |
| [**validateDynamicExpression**](CategoriesApi.md#validateDynamicExpression) | **POST** /commerce/catalog/admin/categories/ValidateDynamicExpression | Validate dynamic category expression |
| [**validateRealTimeDynamicExpression**](CategoriesApi.md#validateRealTimeDynamicExpression) | **POST** /commerce/catalog/admin/categories/ValidateRealTimeDynamicExpression | Validate realtime dynamic category expression |


<a name="addCategory"></a>
# **addCategory**
> CatalogAdminsCategory addCategory(incrementSequence, useProvidedId, catalogAdminsCategory)

Add category

dds a new category to the catalog&#39;s category hierarchy. Specify a ParentCategoryID to determine where to locate the category in the hierarchy; if not specified it becomes a top-level category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Boolean incrementSequence = false; // Boolean | Sets the sequence number of the category to the current max sequence value plus 1 (e.g. 5 + 1 = 6)
    Boolean useProvidedId = false; // Boolean | If true, the provided Id value will be used as the CategoryId. If omitted or false, the system will generate a CategoryId
    CatalogAdminsCategory catalogAdminsCategory = new CatalogAdminsCategory(); // CatalogAdminsCategory | Properties of the new category. Required properties ParentCategoryID and Content.Name.
    try {
      CatalogAdminsCategory result = apiInstance.addCategory(incrementSequence, useProvidedId, catalogAdminsCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#addCategory");
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
| **incrementSequence** | **Boolean**| Sets the sequence number of the category to the current max sequence value plus 1 (e.g. 5 + 1 &#x3D; 6) | [optional] [default to false] |
| **useProvidedId** | **Boolean**| If true, the provided Id value will be used as the CategoryId. If omitted or false, the system will generate a CategoryId | [optional] [default to false] |
| **catalogAdminsCategory** | [**CatalogAdminsCategory**](CatalogAdminsCategory.md)| Properties of the new category. Required properties ParentCategoryID and Content.Name. | [optional] |

### Return type

[**CatalogAdminsCategory**](CatalogAdminsCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addCategoryAttribute"></a>
# **addCategoryAttribute**
> CatalogAdminsCategoryAttribute addCategoryAttribute(categoryId, catalogAdminsCategoryAttribute)

Add category attribute

Adds a new category attribute to the category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute = new CatalogAdminsCategoryAttribute(); // CatalogAdminsCategoryAttribute | 
    try {
      CatalogAdminsCategoryAttribute result = apiInstance.addCategoryAttribute(categoryId, catalogAdminsCategoryAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#addCategoryAttribute");
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
| **categoryId** | **Integer**|  | |
| **catalogAdminsCategoryAttribute** | [**CatalogAdminsCategoryAttribute**](CatalogAdminsCategoryAttribute.md)|  | [optional] |

### Return type

[**CatalogAdminsCategoryAttribute**](CatalogAdminsCategoryAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addProductsToCategory"></a>
# **addProductsToCategory**
> addProductsToCategory(categoryId, requestBody)

Add products to category

Adds the products in the provided product code list to the specified category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the category that you want produts added to.
    List<String> requestBody = Arrays.asList(); // List<String> | A list of products to be added to the category.
    try {
      apiInstance.addProductsToCategory(categoryId, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#addProductsToCategory");
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
| **categoryId** | **Integer**| Unique identifier of the category that you want produts added to. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| A list of products to be added to the category. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCategoryAttribute"></a>
# **deleteCategoryAttribute**
> deleteCategoryAttribute(categoryId, attributeFQN)

Delete category attribute

Deletes the category attribute specified by its attributeFQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteCategoryAttribute(categoryId, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#deleteCategoryAttribute");
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
| **categoryId** | **Integer**|  | |
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

<a name="deleteCategoryById"></a>
# **deleteCategoryById**
> deleteCategoryById(categoryId, cascadeDelete, forceDelete, reassignToParent)

Delete category

Deletes the category specified by its category ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the category that you want to delete.
    Boolean cascadeDelete = false; // Boolean | If true, any subcategories of a category are deleted when this category is deleted. Otherwise only the given category is deleted. Default is false.
    Boolean forceDelete = false; // Boolean | If true, category (and optionally subcategories) will be deleted even if there are products referecing them.  Default is false.
    Boolean reassignToParent = false; // Boolean | If true, and child categories of the given category will be reassigned to the parent of the given category. Only applies if cascadeDelete is false. Default is false.
    try {
      apiInstance.deleteCategoryById(categoryId, cascadeDelete, forceDelete, reassignToParent);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#deleteCategoryById");
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
| **categoryId** | **Integer**| Unique identifier of the category that you want to delete. | |
| **cascadeDelete** | **Boolean**| If true, any subcategories of a category are deleted when this category is deleted. Otherwise only the given category is deleted. Default is false. | [optional] [default to false] |
| **forceDelete** | **Boolean**| If true, category (and optionally subcategories) will be deleted even if there are products referecing them.  Default is false. | [optional] [default to false] |
| **reassignToParent** | **Boolean**| If true, and child categories of the given category will be reassigned to the parent of the given category. Only applies if cascadeDelete is false. Default is false. | [optional] [default to false] |

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

<a name="getCategories"></a>
# **getCategories**
> CatalogAdminsCategoryPagedCollection getCategories(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups)

Get categories

Retrieves a list of categories according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    Boolean includeAttributes = false; // Boolean | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      CatalogAdminsCategoryPagedCollection result = apiInstance.getCategories(startIndex, pageSize, sortBy, filter, includeAttributes, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategories");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. The default value is 0. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **includeAttributes** | **Boolean**|  | [optional] [default to false] |
| **responseGroups** | **String**|  | [optional] |

### Return type

[**CatalogAdminsCategoryPagedCollection**](CatalogAdminsCategoryPagedCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCategory"></a>
# **getCategory**
> CatalogAdminsCategory getCategory(categoryId, includeAttributes)

Get category

Retrieves the details of a single category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the category.
    Boolean includeAttributes = false; // Boolean | 
    try {
      CatalogAdminsCategory result = apiInstance.getCategory(categoryId, includeAttributes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategory");
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
| **categoryId** | **Integer**| Unique identifier of the category. | |
| **includeAttributes** | **Boolean**|  | [optional] [default to false] |

### Return type

[**CatalogAdminsCategory**](CatalogAdminsCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCategoryAttribute"></a>
# **getCategoryAttribute**
> CatalogAdminsCategoryAttribute getCategoryAttribute(categoryId, attributeFQN)

Get category attribute

Retrieves the details of a single category attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      CatalogAdminsCategoryAttribute result = apiInstance.getCategoryAttribute(categoryId, attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoryAttribute");
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
| **categoryId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |

### Return type

[**CatalogAdminsCategoryAttribute**](CatalogAdminsCategoryAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCategoryAttributes"></a>
# **getCategoryAttributes**
> CategoryAttributeCollection getCategoryAttributes(categoryId, startIndex, pageSize, sortBy, filter)

Get category attributes

Retrieves a list of category attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = ""; // String | 
    String filter = ""; // String | 
    try {
      CategoryAttributeCollection result = apiInstance.getCategoryAttributes(categoryId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategoryAttributes");
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
| **categoryId** | **Integer**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **sortBy** | **String**|  | [optional] [default to ] |
| **filter** | **String**|  | [optional] [default to ] |

### Return type

[**CategoryAttributeCollection**](CategoryAttributeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChildCategories"></a>
# **getChildCategories**
> CatalogAdminsCategoryCollection getChildCategories(categoryId)

Get child categories

Retrieves the immediate subcategories of a category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the category whose subcategories you want to get.
    try {
      CatalogAdminsCategoryCollection result = apiInstance.getChildCategories(categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getChildCategories");
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
| **categoryId** | **Integer**| Unique identifier of the category whose subcategories you want to get. | |

### Return type

[**CatalogAdminsCategoryCollection**](CatalogAdminsCategoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeProductsFromCategory"></a>
# **removeProductsFromCategory**
> removeProductsFromCategory(categoryId, requestBody)

Remove products from category

Removes the products in the provided product code list from the specified category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the category that you want products removed from.
    List<String> requestBody = Arrays.asList(); // List<String> | A list of products to be removed from the category.
    try {
      apiInstance.removeProductsFromCategory(categoryId, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#removeProductsFromCategory");
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
| **categoryId** | **Integer**| Unique identifier of the category that you want products removed from. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| A list of products to be removed from the category. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCategory"></a>
# **updateCategory**
> CatalogAdminsCategory updateCategory(categoryId, cascadeVisibility, catalogAdminsCategory)

Update category

Modifies a category such as moving it to another location in the category tree, or changing          whether it is visible on the storefront. This PUT replaces the existing resource, so be sure          to include all the information that you want to maintain for the category. Any unspecified          properties are set to null.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the category that you want to modify. Required.
    Boolean cascadeVisibility = false; // Boolean | If true, when changing the display option for the category, change it for all subcategories also. Optional.
    CatalogAdminsCategory catalogAdminsCategory = new CatalogAdminsCategory(); // CatalogAdminsCategory | Properties of the category that you want to modify. Required properties ParentCategoryID and Content.Name.
    try {
      CatalogAdminsCategory result = apiInstance.updateCategory(categoryId, cascadeVisibility, catalogAdminsCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#updateCategory");
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
| **categoryId** | **Integer**| Unique identifier of the category that you want to modify. Required. | |
| **cascadeVisibility** | **Boolean**| If true, when changing the display option for the category, change it for all subcategories also. Optional. | [optional] [default to false] |
| **catalogAdminsCategory** | [**CatalogAdminsCategory**](CatalogAdminsCategory.md)| Properties of the category that you want to modify. Required properties ParentCategoryID and Content.Name. | [optional] |

### Return type

[**CatalogAdminsCategory**](CatalogAdminsCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCategoryAttribute"></a>
# **updateCategoryAttribute**
> CatalogAdminsCategoryAttribute updateCategoryAttribute(categoryId, attributeFQN, catalogAdminsCategoryAttribute)

Update category attribute

Modifies the category attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    CatalogAdminsCategoryAttribute catalogAdminsCategoryAttribute = new CatalogAdminsCategoryAttribute(); // CatalogAdminsCategoryAttribute | 
    try {
      CatalogAdminsCategoryAttribute result = apiInstance.updateCategoryAttribute(categoryId, attributeFQN, catalogAdminsCategoryAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#updateCategoryAttribute");
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
| **categoryId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |
| **catalogAdminsCategoryAttribute** | [**CatalogAdminsCategoryAttribute**](CatalogAdminsCategoryAttribute.md)|  | [optional] |

### Return type

[**CatalogAdminsCategoryAttribute**](CatalogAdminsCategoryAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="validateDynamicExpression"></a>
# **validateDynamicExpression**
> DynamicExpression validateDynamicExpression(dynamicExpression)

Validate dynamic category expression



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    DynamicExpression dynamicExpression = new DynamicExpression(); // DynamicExpression | 
    try {
      DynamicExpression result = apiInstance.validateDynamicExpression(dynamicExpression);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#validateDynamicExpression");
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
| **dynamicExpression** | [**DynamicExpression**](DynamicExpression.md)|  | [optional] |

### Return type

[**DynamicExpression**](DynamicExpression.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="validateRealTimeDynamicExpression"></a>
# **validateRealTimeDynamicExpression**
> DynamicExpression validateRealTimeDynamicExpression(dynamicExpression)

Validate realtime dynamic category expression



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    DynamicExpression dynamicExpression = new DynamicExpression(); // DynamicExpression | 
    try {
      DynamicExpression result = apiInstance.validateRealTimeDynamicExpression(dynamicExpression);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#validateRealTimeDynamicExpression");
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
| **dynamicExpression** | [**DynamicExpression**](DynamicExpression.md)|  | [optional] |

### Return type

[**DynamicExpression**](DynamicExpression.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

