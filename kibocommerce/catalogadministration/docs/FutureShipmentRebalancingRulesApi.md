# FutureShipmentRebalancingRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRule**](FutureShipmentRebalancingRulesApi.md#createRule) | **POST** /commerce/rules/futureshipmentrebalancing | Create future shipment rebalancing rule |
| [**deleteRule**](FutureShipmentRebalancingRulesApi.md#deleteRule) | **DELETE** /commerce/rules/futureshipmentrebalancing/{code} | Delete future shipment rebalancing rule |
| [**getRule**](FutureShipmentRebalancingRulesApi.md#getRule) | **GET** /commerce/rules/futureshipmentrebalancing/{code} | Get future shipment rebalancing rule by code |
| [**getRules**](FutureShipmentRebalancingRulesApi.md#getRules) | **GET** /commerce/rules/futureshipmentrebalancing | Get future shipment rebalancing rules |
| [**updateRank**](FutureShipmentRebalancingRulesApi.md#updateRank) | **PUT** /commerce/rules/futureshipmentrebalancing/{code}/rank | Update future shipment rebalancing rule rank |
| [**updateRule**](FutureShipmentRebalancingRulesApi.md#updateRule) | **PUT** /commerce/rules/futureshipmentrebalancing/{code} | Update future shipment rebalancing rule |


<a name="createRule"></a>
# **createRule**
> FutureShipmentRebalancingRule createRule(responseFields, futureShipmentRebalancingRule)

Create future shipment rebalancing rule

Creates a new future shipment rebalancing rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FutureShipmentRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FutureShipmentRebalancingRulesApi apiInstance = new FutureShipmentRebalancingRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FutureShipmentRebalancingRule futureShipmentRebalancingRule = new FutureShipmentRebalancingRule(); // FutureShipmentRebalancingRule | The rule to create. Code is auto-generated if omitted.
    try {
      FutureShipmentRebalancingRule result = apiInstance.createRule(responseFields, futureShipmentRebalancingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentRebalancingRulesApi#createRule");
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
| **futureShipmentRebalancingRule** | [**FutureShipmentRebalancingRule**](FutureShipmentRebalancingRule.md)| The rule to create. Code is auto-generated if omitted. | [optional] |

### Return type

[**FutureShipmentRebalancingRule**](FutureShipmentRebalancingRule.md)

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

Delete future shipment rebalancing rule

Deletes a future shipment rebalancing rule by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FutureShipmentRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FutureShipmentRebalancingRulesApi apiInstance = new FutureShipmentRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The rule code to delete.
    try {
      apiInstance.deleteRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentRebalancingRulesApi#deleteRule");
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
> FutureShipmentRebalancingRule getRule(code, responseFields)

Get future shipment rebalancing rule by code

Gets a future shipment rebalancing rule details by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FutureShipmentRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FutureShipmentRebalancingRulesApi apiInstance = new FutureShipmentRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The unique rule code.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FutureShipmentRebalancingRule result = apiInstance.getRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentRebalancingRulesApi#getRule");
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

[**FutureShipmentRebalancingRule**](FutureShipmentRebalancingRule.md)

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
> FutureShipmentRebalancingRuleCollection getRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get future shipment rebalancing rules

Gets a collection of future shipment rebalancing rules according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FutureShipmentRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FutureShipmentRebalancingRulesApi apiInstance = new FutureShipmentRebalancingRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | Zero-based start index for pagination.
    Integer pageSize = 0; // Integer | Number of items per page.
    String sortBy = "sortBy_example"; // String | Sort expression (e.g. 'rank asc').
    String filter = "filter_example"; // String | Filter expression (e.g. 'enabled eq true').
    String responseGroups = "responseGroups_example"; // String | Response groups (currently unused).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FutureShipmentRebalancingRuleCollection result = apiInstance.getRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentRebalancingRulesApi#getRules");
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

[**FutureShipmentRebalancingRuleCollection**](FutureShipmentRebalancingRuleCollection.md)

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

Update future shipment rebalancing rule rank

Updates the rank for a future shipment rebalancing rule and rearranges the ranks of all other rules accordingly.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FutureShipmentRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FutureShipmentRebalancingRulesApi apiInstance = new FutureShipmentRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The rule code whose rank to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | Contains OldRank and NewRank values.
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentRebalancingRulesApi#updateRank");
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
> FutureShipmentRebalancingRule updateRule(code, responseFields, futureShipmentRebalancingRule)

Update future shipment rebalancing rule

Updates an existing future shipment rebalancing rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FutureShipmentRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FutureShipmentRebalancingRulesApi apiInstance = new FutureShipmentRebalancingRulesApi(defaultClient);
    String code = "code_example"; // String | The rule code to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FutureShipmentRebalancingRule futureShipmentRebalancingRule = new FutureShipmentRebalancingRule(); // FutureShipmentRebalancingRule | The updated rule. Code in body must match URL code.
    try {
      FutureShipmentRebalancingRule result = apiInstance.updateRule(code, responseFields, futureShipmentRebalancingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FutureShipmentRebalancingRulesApi#updateRule");
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
| **futureShipmentRebalancingRule** | [**FutureShipmentRebalancingRule**](FutureShipmentRebalancingRule.md)| The updated rule. Code in body must match URL code. | [optional] |

### Return type

[**FutureShipmentRebalancingRule**](FutureShipmentRebalancingRule.md)

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

