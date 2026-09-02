# ReturnRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReturnRule**](ReturnRulesApi.md#createReturnRule) | **POST** /commerce/rules/return | Create Return Rule |
| [**deleteReturnRule**](ReturnRulesApi.md#deleteReturnRule) | **DELETE** /commerce/rules/return/{code} | Delete Return Rule |
| [**getReturnRule**](ReturnRulesApi.md#getReturnRule) | **GET** /commerce/rules/return/{code} | Get Return Rule by Code |
| [**getReturnRules**](ReturnRulesApi.md#getReturnRules) | **GET** /commerce/rules/return | Get Return Rules |
| [**updateRank**](ReturnRulesApi.md#updateRank) | **PUT** /commerce/rules/return/{code}/rank | Update Return Rule Rank |
| [**updateReturnRule**](ReturnRulesApi.md#updateReturnRule) | **PUT** /commerce/rules/return/{code} | Update Return Rule |


<a name="createReturnRule"></a>
# **createReturnRule**
> ReturnRule createReturnRule(responseFields, returnRule)

Create Return Rule

Creates a new &lt;a href&#x3D;\&quot;/pages/return-rules\&quot;&gt;return rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReturnRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReturnRulesApi apiInstance = new ReturnRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReturnRule returnRule = new ReturnRule(); // ReturnRule | 
    try {
      ReturnRule result = apiInstance.createReturnRule(responseFields, returnRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRulesApi#createReturnRule");
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
| **returnRule** | [**ReturnRule**](ReturnRule.md)|  | [optional] |

### Return type

[**ReturnRule**](ReturnRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteReturnRule"></a>
# **deleteReturnRule**
> deleteReturnRule(code)

Delete Return Rule

Deletes a &lt;a href&#x3D;\&quot;/pages/return-rules\&quot;&gt;return rule&lt;/a&gt; by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReturnRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReturnRulesApi apiInstance = new ReturnRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the Return rule to delete.
    try {
      apiInstance.deleteReturnRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRulesApi#deleteReturnRule");
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
| **code** | **String**| The code of the Return rule to delete. | |

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

<a name="getReturnRule"></a>
# **getReturnRule**
> ReturnRule getReturnRule(code, responseFields)

Get Return Rule by Code

Gets &lt;a href&#x3D;\&quot;/pages/return-rules\&quot;&gt;return rule details&lt;/a&gt; by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReturnRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReturnRulesApi apiInstance = new ReturnRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the Return rule.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReturnRule result = apiInstance.getReturnRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRulesApi#getReturnRule");
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
| **code** | **String**| The code of the Return rule. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReturnRule**](ReturnRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReturnRules"></a>
# **getReturnRules**
> ReturnRuleCollection getReturnRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get Return Rules

Gets a collection of &lt;a href&#x3D;\&quot;/pages/return-rules\&quot;&gt;return rules&lt;/a&gt; according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReturnRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReturnRulesApi apiInstance = new ReturnRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | The start index for pagination.
    Integer pageSize = 0; // Integer | The page size for pagination.
    String sortBy = "sortBy_example"; // String | The sort by parameter.
    String filter = "filter_example"; // String | The filter parameter.
    String responseGroups = "responseGroups_example"; // String | The response groups parameter.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReturnRuleCollection result = apiInstance.getReturnRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRulesApi#getReturnRules");
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

[**ReturnRuleCollection**](ReturnRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateRank"></a>
# **updateRank**
> updateRank(code, responseFields, updateRankRequest)

Update Return Rule Rank

Updates the rank for a &lt;a href&#x3D;\&quot;/pages/return-rules\&quot;&gt;return rule&lt;/a&gt; and rearranges the ranks of all other rules accordingly.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReturnRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReturnRulesApi apiInstance = new ReturnRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | 
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRulesApi#updateRank");
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

<a name="updateReturnRule"></a>
# **updateReturnRule**
> ReturnRule updateReturnRule(code, responseFields, returnRule)

Update Return Rule

Updates an existing &lt;a href&#x3D;\&quot;/pages/return-rules\&quot;&gt;return rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReturnRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReturnRulesApi apiInstance = new ReturnRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the Return rule to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReturnRule returnRule = new ReturnRule(); // ReturnRule | 
    try {
      ReturnRule result = apiInstance.updateReturnRule(code, responseFields, returnRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnRulesApi#updateReturnRule");
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
| **code** | **String**| The code of the Return rule to update. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **returnRule** | [**ReturnRule**](ReturnRule.md)|  | [optional] |

### Return type

[**ReturnRule**](ReturnRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

