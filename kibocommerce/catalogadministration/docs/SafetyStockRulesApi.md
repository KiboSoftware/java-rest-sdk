# SafetyStockRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSafetyStockRule**](SafetyStockRulesApi.md#createSafetyStockRule) | **POST** /commerce/rules/safetystock | Create Safety Stock Rule |
| [**deleteSafetyStockRule**](SafetyStockRulesApi.md#deleteSafetyStockRule) | **DELETE** /commerce/rules/safetystock/{code} | Delete Safety Stock Rule |
| [**getSafetyStockRule**](SafetyStockRulesApi.md#getSafetyStockRule) | **GET** /commerce/rules/safetystock/{code} | Get Safety Stock Rule by Code |
| [**getSafetyStockRules**](SafetyStockRulesApi.md#getSafetyStockRules) | **GET** /commerce/rules/safetystock | Get Safety Stock Rules |
| [**updateRank**](SafetyStockRulesApi.md#updateRank) | **PUT** /commerce/rules/safetystock/{code}/rank | Update Safety Stock Rule Rank |
| [**updateSafetyStockRule**](SafetyStockRulesApi.md#updateSafetyStockRule) | **PUT** /commerce/rules/safetystock/{code} | Update Safety Stock Rule |


<a name="createSafetyStockRule"></a>
# **createSafetyStockRule**
> SafetyStockRule createSafetyStockRule(responseFields, safetyStockRule)

Create Safety Stock Rule

Creates a new &lt;a href&#x3D;\&quot;/pages/safety-stock-rules\&quot;&gt;safety stock rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SafetyStockRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SafetyStockRulesApi apiInstance = new SafetyStockRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SafetyStockRule safetyStockRule = new SafetyStockRule(); // SafetyStockRule | The safety stock rule to create.
    try {
      SafetyStockRule result = apiInstance.createSafetyStockRule(responseFields, safetyStockRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafetyStockRulesApi#createSafetyStockRule");
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
| **safetyStockRule** | [**SafetyStockRule**](SafetyStockRule.md)| The safety stock rule to create. | [optional] |

### Return type

[**SafetyStockRule**](SafetyStockRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteSafetyStockRule"></a>
# **deleteSafetyStockRule**
> deleteSafetyStockRule(code)

Delete Safety Stock Rule

Deletes a &lt;a href&#x3D;\&quot;/pages/safety-stock-rules\&quot;&gt;safety stock rule&lt;/a&gt; by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SafetyStockRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SafetyStockRulesApi apiInstance = new SafetyStockRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the safety stock rule to delete.
    try {
      apiInstance.deleteSafetyStockRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafetyStockRulesApi#deleteSafetyStockRule");
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
| **code** | **String**| The code of the safety stock rule to delete. | |

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

<a name="getSafetyStockRule"></a>
# **getSafetyStockRule**
> SafetyStockRule getSafetyStockRule(code, responseFields)

Get Safety Stock Rule by Code

Gets &lt;a href&#x3D;\&quot;/pages/safety-stock-rules\&quot;&gt;safety stock rule details&lt;/a&gt; by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SafetyStockRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SafetyStockRulesApi apiInstance = new SafetyStockRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the safety stock rule.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SafetyStockRule result = apiInstance.getSafetyStockRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafetyStockRulesApi#getSafetyStockRule");
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
| **code** | **String**| The code of the safety stock rule. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**SafetyStockRule**](SafetyStockRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSafetyStockRules"></a>
# **getSafetyStockRules**
> SafetyStockRuleCollection getSafetyStockRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get Safety Stock Rules

Gets a collection of &lt;a href&#x3D;\&quot;/pages/safety-stock-rules\&quot;&gt;safety stock rules&lt;/a&gt; according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SafetyStockRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SafetyStockRulesApi apiInstance = new SafetyStockRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | The start index for pagination.
    Integer pageSize = 0; // Integer | The page size for pagination.
    String sortBy = "sortBy_example"; // String | The sort by parameter.
    String filter = "filter_example"; // String | The filter parameter.
    String responseGroups = "responseGroups_example"; // String | The response groups parameter.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      SafetyStockRuleCollection result = apiInstance.getSafetyStockRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafetyStockRulesApi#getSafetyStockRules");
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

[**SafetyStockRuleCollection**](SafetyStockRuleCollection.md)

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

Update Safety Stock Rule Rank

Updates the rank for a &lt;a href&#x3D;\&quot;/pages/safety-stock-rules\&quot;&gt;safety stock rule&lt;/a&gt; and rearranges the ranks of all other rules accordingly.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SafetyStockRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SafetyStockRulesApi apiInstance = new SafetyStockRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | 
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafetyStockRulesApi#updateRank");
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

<a name="updateSafetyStockRule"></a>
# **updateSafetyStockRule**
> SafetyStockRule updateSafetyStockRule(code, responseFields, safetyStockRule)

Update Safety Stock Rule

Updates an existing &lt;a href&#x3D;\&quot;/pages/safety-stock-rules\&quot;&gt;safety stock rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.SafetyStockRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SafetyStockRulesApi apiInstance = new SafetyStockRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the safety stock rule to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    SafetyStockRule safetyStockRule = new SafetyStockRule(); // SafetyStockRule | The updated safety stock rule.
    try {
      SafetyStockRule result = apiInstance.updateSafetyStockRule(code, responseFields, safetyStockRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafetyStockRulesApi#updateSafetyStockRule");
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
| **code** | **String**| The code of the safety stock rule to update. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **safetyStockRule** | [**SafetyStockRule**](SafetyStockRule.md)| The updated safety stock rule. | [optional] |

### Return type

[**SafetyStockRule**](SafetyStockRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

