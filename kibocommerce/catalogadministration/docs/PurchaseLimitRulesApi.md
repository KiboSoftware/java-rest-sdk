# PurchaseLimitRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPurchaseLimitRule**](PurchaseLimitRulesApi.md#createPurchaseLimitRule) | **POST** /commerce/rules/purchaselimit | Create Purchase Limit Rule |
| [**deletePurchaseLimitRule**](PurchaseLimitRulesApi.md#deletePurchaseLimitRule) | **DELETE** /commerce/rules/purchaselimit/{code} | Delete Purchase Limit Rule |
| [**getPurchaseLimitRule**](PurchaseLimitRulesApi.md#getPurchaseLimitRule) | **GET** /commerce/rules/purchaselimit/{code} | Get Purchase Limit Rule by Code |
| [**getPurchaseLimitRules**](PurchaseLimitRulesApi.md#getPurchaseLimitRules) | **GET** /commerce/rules/purchaselimit | Get Purchase Limit Rules |
| [**updatePurchaseLimitRule**](PurchaseLimitRulesApi.md#updatePurchaseLimitRule) | **PUT** /commerce/rules/purchaselimit/{code} | Update Purchase Limit Rule |
| [**updateRank**](PurchaseLimitRulesApi.md#updateRank) | **PUT** /commerce/rules/purchaselimit/{code}/rank | Update Purchase Limit Rule Rank |


<a name="createPurchaseLimitRule"></a>
# **createPurchaseLimitRule**
> PurchaseLimitRule createPurchaseLimitRule(responseFields, purchaseLimitRule)

Create Purchase Limit Rule

Creates a new &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PurchaseLimitRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PurchaseLimitRulesApi apiInstance = new PurchaseLimitRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PurchaseLimitRule purchaseLimitRule = new PurchaseLimitRule(); // PurchaseLimitRule | 
    try {
      PurchaseLimitRule result = apiInstance.createPurchaseLimitRule(responseFields, purchaseLimitRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseLimitRulesApi#createPurchaseLimitRule");
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
| **purchaseLimitRule** | [**PurchaseLimitRule**](PurchaseLimitRule.md)|  | [optional] |

### Return type

[**PurchaseLimitRule**](PurchaseLimitRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deletePurchaseLimitRule"></a>
# **deletePurchaseLimitRule**
> deletePurchaseLimitRule(code)

Delete Purchase Limit Rule

Deletes a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PurchaseLimitRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PurchaseLimitRulesApi apiInstance = new PurchaseLimitRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the purchase limit rule to delete.
    try {
      apiInstance.deletePurchaseLimitRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseLimitRulesApi#deletePurchaseLimitRule");
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
| **code** | **String**| The code of the purchase limit rule to delete. | |

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

<a name="getPurchaseLimitRule"></a>
# **getPurchaseLimitRule**
> PurchaseLimitRule getPurchaseLimitRule(code, responseFields)

Get Purchase Limit Rule by Code

Gets &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; details by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PurchaseLimitRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PurchaseLimitRulesApi apiInstance = new PurchaseLimitRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the purchase limit rule.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PurchaseLimitRule result = apiInstance.getPurchaseLimitRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseLimitRulesApi#getPurchaseLimitRule");
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
| **code** | **String**| The code of the purchase limit rule. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PurchaseLimitRule**](PurchaseLimitRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPurchaseLimitRules"></a>
# **getPurchaseLimitRules**
> PurchaseLimitRuleCollection getPurchaseLimitRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get Purchase Limit Rules

Gets a collection of &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rules&lt;/a&gt; according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PurchaseLimitRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PurchaseLimitRulesApi apiInstance = new PurchaseLimitRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | The start index for pagination.
    Integer pageSize = 0; // Integer | The page size for pagination.
    String sortBy = "sortBy_example"; // String | The sort by parameter.
    String filter = "filter_example"; // String | The filter parameter.
    String responseGroups = "responseGroups_example"; // String | The response groups parameter.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PurchaseLimitRuleCollection result = apiInstance.getPurchaseLimitRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseLimitRulesApi#getPurchaseLimitRules");
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
| **startIndex** | **Integer**| The start index for pagination. | [optional] [default to 0] |
| **pageSize** | **Integer**| The page size for pagination. | [optional] [default to 0] |
| **sortBy** | **String**| The sort by parameter. | [optional] |
| **filter** | **String**| The filter parameter. | [optional] |
| **responseGroups** | **String**| The response groups parameter. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PurchaseLimitRuleCollection**](PurchaseLimitRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePurchaseLimitRule"></a>
# **updatePurchaseLimitRule**
> PurchaseLimitRule updatePurchaseLimitRule(code, responseFields, purchaseLimitRule)

Update Purchase Limit Rule

Updates an existing &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PurchaseLimitRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PurchaseLimitRulesApi apiInstance = new PurchaseLimitRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the purchase limit rule to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PurchaseLimitRule purchaseLimitRule = new PurchaseLimitRule(); // PurchaseLimitRule | The updated purchase limit rule.
    try {
      PurchaseLimitRule result = apiInstance.updatePurchaseLimitRule(code, responseFields, purchaseLimitRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseLimitRulesApi#updatePurchaseLimitRule");
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
| **code** | **String**| The code of the purchase limit rule to update. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **purchaseLimitRule** | [**PurchaseLimitRule**](PurchaseLimitRule.md)| The updated purchase limit rule. | [optional] |

### Return type

[**PurchaseLimitRule**](PurchaseLimitRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateRank"></a>
# **updateRank**
> updateRank(code, responseFields, updateRankRequest)

Update Purchase Limit Rule Rank

Updates the rank for a &lt;a href&#x3D;\&quot;/pages/purchase-limit-rules\&quot;&gt;purchase limit rule&lt;/a&gt; and rearranges the ranks of all other rules accordingly.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PurchaseLimitRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PurchaseLimitRulesApi apiInstance = new PurchaseLimitRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | 
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling PurchaseLimitRulesApi#updateRank");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **updateRankRequest** | [**UpdateRankRequest**](UpdateRankRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

