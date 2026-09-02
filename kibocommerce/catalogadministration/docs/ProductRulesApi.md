# ProductRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProductRule**](ProductRulesApi.md#createProductRule) | **POST** /commerce/rules/product | Create Product Rule |
| [**deleteProductRule**](ProductRulesApi.md#deleteProductRule) | **DELETE** /commerce/rules/product/{code} | Delete Product Rules |
| [**getExpressionFieldDefinitions**](ProductRulesApi.md#getExpressionFieldDefinitions) | **GET** /commerce/rules/product/product-rule-fields | Get Expression Field Definition |
| [**getProductRule**](ProductRulesApi.md#getProductRule) | **GET** /commerce/rules/product/{code} | Get Product Rule by Code |
| [**getProductRules**](ProductRulesApi.md#getProductRules) | **GET** /commerce/rules/product | Get Product Rules |
| [**updateProductRule**](ProductRulesApi.md#updateProductRule) | **PUT** /commerce/rules/product/{code} | Update Product Rule |
| [**validateExpression**](ProductRulesApi.md#validateExpression) | **POST** /commerce/rules/product/validate | Validate Expression |


<a name="createProductRule"></a>
# **createProductRule**
> CatalogAdminsProductRule createProductRule(responseFields, catalogAdminsProductRule)

Create Product Rule

Creates a new product rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRulesApi apiInstance = new ProductRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProductRule catalogAdminsProductRule = new CatalogAdminsProductRule(); // CatalogAdminsProductRule | The product rule to create.
    try {
      CatalogAdminsProductRule result = apiInstance.createProductRule(responseFields, catalogAdminsProductRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRulesApi#createProductRule");
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
| **catalogAdminsProductRule** | [**CatalogAdminsProductRule**](CatalogAdminsProductRule.md)| The product rule to create. | [optional] |

### Return type

[**CatalogAdminsProductRule**](CatalogAdminsProductRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteProductRule"></a>
# **deleteProductRule**
> deleteProductRule(code)

Delete Product Rules

Delete a product rules.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRulesApi apiInstance = new ProductRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the rule to delete.
    try {
      apiInstance.deleteProductRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRulesApi#deleteProductRule");
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
| **code** | **String**| The code of the rule to delete. | |

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

<a name="getExpressionFieldDefinitions"></a>
# **getExpressionFieldDefinitions**
> Object getExpressionFieldDefinitions(responseFields)

Get Expression Field Definition

Get expression field definition

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRulesApi apiInstance = new ProductRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Object result = apiInstance.getExpressionFieldDefinitions(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRulesApi#getExpressionFieldDefinitions");
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

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductRule"></a>
# **getProductRule**
> CatalogAdminsProductRule getProductRule(code, responseFields)

Get Product Rule by Code

Retrieves the details of a single product rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRulesApi apiInstance = new ProductRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the rule.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsProductRule result = apiInstance.getProductRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRulesApi#getProductRule");
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
| **code** | **String**| The code of the rule. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsProductRule**](CatalogAdminsProductRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getProductRules"></a>
# **getProductRules**
> ProductRuleCollection getProductRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get Product Rules

Retrieves a list of product rules according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRulesApi apiInstance = new ProductRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | The start index.
    Integer pageSize = 0; // Integer | The page size.
    String sortBy = "sortBy_example"; // String | The sort by.
    String filter = "filter_example"; // String | The filter.
    String responseGroups = "responseGroups_example"; // String | The response groups.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductRuleCollection result = apiInstance.getProductRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRulesApi#getProductRules");
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
| **startIndex** | **Integer**| The start index. | [optional] [default to 0] |
| **pageSize** | **Integer**| The page size. | [optional] [default to 0] |
| **sortBy** | **String**| The sort by. | [optional] |
| **filter** | **String**| The filter. | [optional] |
| **responseGroups** | **String**| The response groups. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductRuleCollection**](ProductRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateProductRule"></a>
# **updateProductRule**
> CatalogAdminsProductRule updateProductRule(code, responseFields, catalogAdminsProductRule)

Update Product Rule

Update an existing product rules.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRulesApi apiInstance = new ProductRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the rule to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsProductRule catalogAdminsProductRule = new CatalogAdminsProductRule(); // CatalogAdminsProductRule | The updated product rule.
    try {
      CatalogAdminsProductRule result = apiInstance.updateProductRule(code, responseFields, catalogAdminsProductRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRulesApi#updateProductRule");
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
| **code** | **String**| The code of the rule to update. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsProductRule** | [**CatalogAdminsProductRule**](CatalogAdminsProductRule.md)| The updated product rule. | [optional] |

### Return type

[**CatalogAdminsProductRule**](CatalogAdminsProductRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="validateExpression"></a>
# **validateExpression**
> CatalogAdminsDynamicExpression validateExpression(responseFields, catalogAdminsDynamicExpression)

Validate Expression

Validate the expression for a product rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ProductRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProductRulesApi apiInstance = new ProductRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsDynamicExpression catalogAdminsDynamicExpression = new CatalogAdminsDynamicExpression(); // CatalogAdminsDynamicExpression | The expression to validate.
    try {
      CatalogAdminsDynamicExpression result = apiInstance.validateExpression(responseFields, catalogAdminsDynamicExpression);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductRulesApi#validateExpression");
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
| **catalogAdminsDynamicExpression** | [**CatalogAdminsDynamicExpression**](CatalogAdminsDynamicExpression.md)| The expression to validate. | [optional] |

### Return type

[**CatalogAdminsDynamicExpression**](CatalogAdminsDynamicExpression.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

