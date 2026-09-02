# BackorderRebalancingRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRule**](BackorderRebalancingRulesApi.md#createRule) | **POST** /commerce/rules/backorderrebalancing | Create back order rebalancing rule |
| [**deleteRule**](BackorderRebalancingRulesApi.md#deleteRule) | **DELETE** /commerce/rules/backorderrebalancing/{code} | Delete back order rebalancing rule |
| [**getRule**](BackorderRebalancingRulesApi.md#getRule) | **GET** /commerce/rules/backorderrebalancing/{code} | Get back order rebalancing rule by code |
| [**getRules**](BackorderRebalancingRulesApi.md#getRules) | **GET** /commerce/rules/backorderrebalancing | Get back order rebalancing rules |
| [**updateRank**](BackorderRebalancingRulesApi.md#updateRank) | **PUT** /commerce/rules/backorderrebalancing/{code}/rank | Update back order rebalancing rule rank |
| [**updateRule**](BackorderRebalancingRulesApi.md#updateRule) | **PUT** /commerce/rules/backorderrebalancing/{code} | Update back order rebalancing rule |


<a name="createRule"></a>
# **createRule**
> BackorderRebalancingRule createRule(responseFields, backorderRebalancingRule)

Create back order rebalancing rule

Creates a new back order rebalancing rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.BackorderRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BackorderRebalancingRulesApi apiInstance = new BackorderRebalancingRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BackorderRebalancingRule backorderRebalancingRule = new BackorderRebalancingRule(); // BackorderRebalancingRule | The rule to create. Code is auto-generated if omitted.
    try {
      BackorderRebalancingRule result = apiInstance.createRule(responseFields, backorderRebalancingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackorderRebalancingRulesApi#createRule");
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
| **backorderRebalancingRule** | [**BackorderRebalancingRule**](BackorderRebalancingRule.md)| The rule to create. Code is auto-generated if omitted. | [optional] |

### Return type

[**BackorderRebalancingRule**](BackorderRebalancingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Rule created successfully. |  -  |
| **400** | Validation failed. |  -  |
| **409** | Code already exists for this tenant. |  -  |

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(code)

Delete back order rebalancing rule

Deletes a back order rebalancing rule by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.BackorderRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BackorderRebalancingRulesApi apiInstance = new BackorderRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The rule code to delete.
    try {
      apiInstance.deleteRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackorderRebalancingRulesApi#deleteRule");
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
| **code** | **String**| The rule code to delete. | |

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
| **204** | Rule deleted successfully. |  -  |
| **404** | Rule not found. |  -  |

<a name="getRule"></a>
# **getRule**
> BackorderRebalancingRule getRule(code, responseFields)

Get back order rebalancing rule by code

Gets a back order rebalancing rule details by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.BackorderRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BackorderRebalancingRulesApi apiInstance = new BackorderRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The unique rule code.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BackorderRebalancingRule result = apiInstance.getRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackorderRebalancingRulesApi#getRule");
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
| **code** | **String**| The unique rule code. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BackorderRebalancingRule**](BackorderRebalancingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rule found. |  -  |
| **404** | Rule not found. |  -  |

<a name="getRules"></a>
# **getRules**
> BackorderRebalancingRuleCollection getRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get back order rebalancing rules

Gets a collection of back order rebalancing rules according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.BackorderRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BackorderRebalancingRulesApi apiInstance = new BackorderRebalancingRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | Zero-based start index for pagination.
    Integer pageSize = 0; // Integer | Number of items per page.
    String sortBy = "sortBy_example"; // String | Sort expression (e.g. 'rank asc').
    String filter = "filter_example"; // String | Filter expression (e.g. 'enabled eq true').
    String responseGroups = "responseGroups_example"; // String | Response groups (currently unused).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BackorderRebalancingRuleCollection result = apiInstance.getRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackorderRebalancingRulesApi#getRules");
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
| **startIndex** | **Integer**| Zero-based start index for pagination. | [optional] [default to 0] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 0] |
| **sortBy** | **String**| Sort expression (e.g. &#39;rank asc&#39;). | [optional] |
| **filter** | **String**| Filter expression (e.g. &#39;enabled eq true&#39;). | [optional] |
| **responseGroups** | **String**| Response groups (currently unused). | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BackorderRebalancingRuleCollection**](BackorderRebalancingRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rule collection returned successfully. |  -  |
| **412** | Feature not enabled for this tenant. |  -  |

<a name="updateRank"></a>
# **updateRank**
> updateRank(code, responseFields, updateRankRequest)

Update back order rebalancing rule rank

Updates the rank for a back order rebalancing rule and rearranges the ranks of all other rules accordingly.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.BackorderRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BackorderRebalancingRulesApi apiInstance = new BackorderRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The rule code whose rank to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | Contains OldRank and NewRank values.
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackorderRebalancingRulesApi#updateRank");
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
| **code** | **String**| The rule code whose rank to update. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **updateRankRequest** | [**UpdateRankRequest**](UpdateRankRequest.md)| Contains OldRank and NewRank values. | [optional] |

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
| **204** | Rank updated successfully. |  -  |
| **400** | OldRank or NewRank is invalid. |  -  |

<a name="updateRule"></a>
# **updateRule**
> BackorderRebalancingRule updateRule(code, responseFields, backorderRebalancingRule)

Update back order rebalancing rule

Updates an existing back order rebalancing rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.BackorderRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BackorderRebalancingRulesApi apiInstance = new BackorderRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The rule code to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BackorderRebalancingRule backorderRebalancingRule = new BackorderRebalancingRule(); // BackorderRebalancingRule | The updated rule. Code in body must match URL code.
    try {
      BackorderRebalancingRule result = apiInstance.updateRule(code, responseFields, backorderRebalancingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackorderRebalancingRulesApi#updateRule");
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
| **code** | **String**| The rule code to update. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **backorderRebalancingRule** | [**BackorderRebalancingRule**](BackorderRebalancingRule.md)| The updated rule. Code in body must match URL code. | [optional] |

### Return type

[**BackorderRebalancingRule**](BackorderRebalancingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rule updated successfully. |  -  |
| **400** | Validation failed. |  -  |
| **404** | Rule not found. |  -  |

