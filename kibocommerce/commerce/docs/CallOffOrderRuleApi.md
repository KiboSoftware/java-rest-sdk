# CallOffOrderRuleApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRule**](CallOffOrderRuleApi.md#createRule) | **POST** /commerce/rules/callOffOrder | Creates a Call-Off Order Rule. The expression is validated and canonicalized |
| [**deleteRule**](CallOffOrderRuleApi.md#deleteRule) | **DELETE** /commerce/rules/callOffOrder/{code} | Hard-deletes a rule by code. v1 has no usage guard — |
| [**evaluateRule**](CallOffOrderRuleApi.md#evaluateRule) | **POST** /commerce/rules/callOffOrder/{code}/evaluate | Evaluates an enabled rule and returns the paged list of matching |
| [**getRule**](CallOffOrderRuleApi.md#getRule) | **GET** /commerce/rules/callOffOrder/{code} | Returns a single Call-Off Order Rule by its tenant-unique code |
| [**getSchema**](CallOffOrderRuleApi.md#getSchema) | **GET** /commerce/rules/callOffOrder/schema | Returns the authoring schema for Call-Off Order Rules: the complete set of |
| [**listRules**](CallOffOrderRuleApi.md#listRules) | **GET** /commerce/rules/callOffOrder | Lists Call-Off Order Rules for the current tenant with offset paging. |
| [**updateRule**](CallOffOrderRuleApi.md#updateRule) | **PUT** /commerce/rules/callOffOrder/{code} | Updates an existing rule. &#x60;code&#x60; is immutable — a body &#x60;code&#x60; that |


<a name="createRule"></a>
# **createRule**
> CallOffOrderRule createRule(responseFields, callOffOrderRule)

Creates a Call-Off Order Rule. The expression is validated and canonicalized

at save time; &#x60;code&#x60; auto-generates from &#x60;name&#x60; when omitted.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderRuleApi apiInstance = new CallOffOrderRuleApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrderRule callOffOrderRule = new CallOffOrderRule(); // CallOffOrderRule | The rule to create.
    try {
      CallOffOrderRule result = apiInstance.createRule(responseFields, callOffOrderRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderRuleApi#createRule");
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
| **callOffOrderRule** | [**CallOffOrderRule**](CallOffOrderRule.md)| The rule to create. | [optional] |

### Return type

[**CallOffOrderRule**](CallOffOrderRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Rule created. Returns 409 if a rule with the supplied code already exists or the expression failed validation. |  -  |

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(code)

Hard-deletes a rule by code. v1 has no usage guard —

deleting a rule that is still referenced by a workflow is the caller&#39;s responsibility.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderRuleApi apiInstance = new CallOffOrderRuleApi(defaultClient);
    String code = "code_example"; // String | The rule's tenant-unique code.
    try {
      apiInstance.deleteRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderRuleApi#deleteRule");
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
| **code** | **String**| The rule&#39;s tenant-unique code. | |

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
| **204** | Rule deleted. Returns 404 if no rule exists for the given code. |  -  |

<a name="evaluateRule"></a>
# **evaluateRule**
> CallOffOrderRuleEvalResponse evaluateRule(code, responseFields, callOffOrderRuleEvalRequest)

Evaluates an enabled rule and returns the paged list of matching

Call-Off Order ids. Optionally AND-composes the rule expression with a &#x60;statusFilter&#x60; to scope results to a single status.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderRuleApi apiInstance = new CallOffOrderRuleApi(defaultClient);
    String code = "code_example"; // String | The rule's tenant-unique code.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrderRuleEvalRequest callOffOrderRuleEvalRequest = new CallOffOrderRuleEvalRequest(); // CallOffOrderRuleEvalRequest | Optional `StatusFilter`, `PageSize`, and             `PageToken` for cursor-style paging.
    try {
      CallOffOrderRuleEvalResponse result = apiInstance.evaluateRule(code, responseFields, callOffOrderRuleEvalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderRuleApi#evaluateRule");
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
| **code** | **String**| The rule&#39;s tenant-unique code. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderRuleEvalRequest** | [**CallOffOrderRuleEvalRequest**](CallOffOrderRuleEvalRequest.md)| Optional &#x60;StatusFilter&#x60;, &#x60;PageSize&#x60;, and             &#x60;PageToken&#x60; for cursor-style paging. | [optional] |

### Return type

[**CallOffOrderRuleEvalResponse**](CallOffOrderRuleEvalResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | No enabled rule exists for the given code. |  -  |

<a name="getRule"></a>
# **getRule**
> CallOffOrderRule getRule(code, responseFields)

Returns a single Call-Off Order Rule by its tenant-unique code

Returns a single Call-Off Order Rule by its tenant-unique code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderRuleApi apiInstance = new CallOffOrderRuleApi(defaultClient);
    String code = "code_example"; // String | The rule's tenant-unique code (slug).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrderRule result = apiInstance.getRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderRuleApi#getRule");
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
| **code** | **String**| The rule&#39;s tenant-unique code (slug). | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrderRule**](CallOffOrderRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | No rule exists for the given code. |  -  |

<a name="getSchema"></a>
# **getSchema**
> CallOffOrderRuleSchema getSchema(responseFields)

Returns the authoring schema for Call-Off Order Rules: the complete set of

expression fields with their data types, allowed operators, nullability, enum values, and the dynamic-attribute slot pointing at the tenant&#39;s call-off attribute catalog. Reflection-driven from the validator&#39;s &#x60;[ExpressionContextProperty]&#x60; metadata so the UI and server stay in lockstep automatically.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderRuleApi apiInstance = new CallOffOrderRuleApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrderRuleSchema result = apiInstance.getSchema(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderRuleApi#getSchema");
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

[**CallOffOrderRuleSchema**](CallOffOrderRuleSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listRules"></a>
# **listRules**
> CallOffOrderRuleCollection listRules(startIndex, pageSize, sortBy, filter, responseFields)

Lists Call-Off Order Rules for the current tenant with offset paging.

Default sort is &#x60;createDate DESC&#x60;; sortBy accepts &#x60;createDate&#x60;, &#x60;updateDate&#x60;, &#x60;code&#x60;, &#x60;name&#x60;, &#x60;ruleType&#x60;. filter follows Kibo&#39;s standard filter syntax over &#x60;code&#x60;, &#x60;name&#x60;, &#x60;ruleType&#x60;, &#x60;enabled&#x60;, &#x60;createDate&#x60;, &#x60;updateDate&#x60;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderRuleApi apiInstance = new CallOffOrderRuleApi(defaultClient);
    Integer startIndex = 0; // Integer | Zero-based page offset. Defaults to 0.
    Integer pageSize = 20; // Integer | Maximum items returned. Defaults to 20.
    String sortBy = "sortBy_example"; // String | Optional sort expression, e.g. `createDate desc`.
    String filter = "filter_example"; // String | Optional filter expression, e.g. `enabled eq true`.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CallOffOrderRuleCollection result = apiInstance.listRules(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderRuleApi#listRules");
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
| **startIndex** | **Integer**| Zero-based page offset. Defaults to 0. | [optional] [default to 0] |
| **pageSize** | **Integer**| Maximum items returned. Defaults to 20. | [optional] [default to 20] |
| **sortBy** | **String**| Optional sort expression, e.g. &#x60;createDate desc&#x60;. | [optional] |
| **filter** | **String**| Optional filter expression, e.g. &#x60;enabled eq true&#x60;. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CallOffOrderRuleCollection**](CallOffOrderRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateRule"></a>
# **updateRule**
> CallOffOrderRule updateRule(code, responseFields, callOffOrderRule)

Updates an existing rule. &#x60;code&#x60; is immutable — a body &#x60;code&#x60; that

differs from the URL code is rejected. The expression is re-validated and the canonical &#x60;Text&#x60; regenerated from &#x60;Tree&#x60;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.CallOffOrderRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallOffOrderRuleApi apiInstance = new CallOffOrderRuleApi(defaultClient);
    String code = "code_example"; // String | The rule's tenant-unique code (immutable).
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CallOffOrderRule callOffOrderRule = new CallOffOrderRule(); // CallOffOrderRule | The updated rule.
    try {
      CallOffOrderRule result = apiInstance.updateRule(code, responseFields, callOffOrderRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallOffOrderRuleApi#updateRule");
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
| **code** | **String**| The rule&#39;s tenant-unique code (immutable). | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **callOffOrderRule** | [**CallOffOrderRule**](CallOffOrderRule.md)| The updated rule. | [optional] |

### Return type

[**CallOffOrderRule**](CallOffOrderRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Body code does not match URL code. Returns 404 if no rule exists for the given code. |  -  |

