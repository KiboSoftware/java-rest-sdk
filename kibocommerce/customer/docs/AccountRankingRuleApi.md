# AccountRankingRuleApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomerRule**](AccountRankingRuleApi.md#createCustomerRule) | **POST** /commerce/rules/customer | Create Customer Rule |
| [**deleteCustomerRule**](AccountRankingRuleApi.md#deleteCustomerRule) | **DELETE** /commerce/rules/customer/{code} | Delete Customer Rule (with cross-service validation) |
| [**evaluateCustomerRules**](AccountRankingRuleApi.md#evaluateCustomerRules) | **POST** /commerce/rules/customer/evaluate/{customerAccountId} | Evaluate Customer Rules |
| [**getCustomerRule**](AccountRankingRuleApi.md#getCustomerRule) | **GET** /commerce/rules/customer/{code} | Get Customer Rule by Code |
| [**getCustomerRuleUsages**](AccountRankingRuleApi.md#getCustomerRuleUsages) | **GET** /commerce/rules/customer/{code}/usages | Get Customer Rule Usages by Code |
| [**getCustomerRules**](AccountRankingRuleApi.md#getCustomerRules) | **GET** /commerce/rules/customer | Get All Customer Rules |
| [**updateCustomerRule**](AccountRankingRuleApi.md#updateCustomerRule) | **PUT** /commerce/rules/customer/{code} | Update Customer Rule |


<a name="createCustomerRule"></a>
# **createCustomerRule**
> AccountRankingRule createCustomerRule(responseFields, accountRankingRule)

Create Customer Rule

Create Customer Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AccountRankingRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountRankingRuleApi apiInstance = new AccountRankingRuleApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AccountRankingRule accountRankingRule = new AccountRankingRule(); // AccountRankingRule | 
    try {
      AccountRankingRule result = apiInstance.createCustomerRule(responseFields, accountRankingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRankingRuleApi#createCustomerRule");
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
| **accountRankingRule** | [**AccountRankingRule**](AccountRankingRule.md)|  | [optional] |

### Return type

[**AccountRankingRule**](AccountRankingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCustomerRule"></a>
# **deleteCustomerRule**
> deleteCustomerRule(code)

Delete Customer Rule (with cross-service validation)

Delete Customer Rule (with cross-service validation)

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AccountRankingRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountRankingRuleApi apiInstance = new AccountRankingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.deleteCustomerRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRankingRuleApi#deleteCustomerRule");
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

<a name="evaluateCustomerRules"></a>
# **evaluateCustomerRules**
> List&lt;AccountRankingRule&gt; evaluateCustomerRules(customerAccountId, responseFields, evaluateAccountRankingRuleRequest)

Evaluate Customer Rules

Evaluate Customer Rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AccountRankingRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountRankingRuleApi apiInstance = new AccountRankingRuleApi(defaultClient);
    Integer customerAccountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    EvaluateAccountRankingRuleRequest evaluateAccountRankingRuleRequest = new EvaluateAccountRankingRuleRequest(); // EvaluateAccountRankingRuleRequest | 
    try {
      List<AccountRankingRule> result = apiInstance.evaluateCustomerRules(customerAccountId, responseFields, evaluateAccountRankingRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRankingRuleApi#evaluateCustomerRules");
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
| **customerAccountId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **evaluateAccountRankingRuleRequest** | [**EvaluateAccountRankingRuleRequest**](EvaluateAccountRankingRuleRequest.md)|  | [optional] |

### Return type

[**List&lt;AccountRankingRule&gt;**](AccountRankingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCustomerRule"></a>
# **getCustomerRule**
> AccountRankingRule getCustomerRule(code, responseFields)

Get Customer Rule by Code

Get Customer Rule by Code

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AccountRankingRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountRankingRuleApi apiInstance = new AccountRankingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AccountRankingRule result = apiInstance.getCustomerRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRankingRuleApi#getCustomerRule");
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

### Return type

[**AccountRankingRule**](AccountRankingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCustomerRuleUsages"></a>
# **getCustomerRuleUsages**
> List&lt;CustomerRuleUsage&gt; getCustomerRuleUsages(code, responseFields)

Get Customer Rule Usages by Code

Get Customer Rule Usages by Code

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AccountRankingRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountRankingRuleApi apiInstance = new AccountRankingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<CustomerRuleUsage> result = apiInstance.getCustomerRuleUsages(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRankingRuleApi#getCustomerRuleUsages");
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

### Return type

[**List&lt;CustomerRuleUsage&gt;**](CustomerRuleUsage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCustomerRules"></a>
# **getCustomerRules**
> AccountRankingRuleCollection getCustomerRules(startIndex, pageSize, sortBy, filter, responseFields)

Get All Customer Rules

Get All Customer Rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AccountRankingRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountRankingRuleApi apiInstance = new AccountRankingRuleApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = ""; // String | 
    String filter = ""; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AccountRankingRuleCollection result = apiInstance.getCustomerRules(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRankingRuleApi#getCustomerRules");
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
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **sortBy** | **String**|  | [optional] [default to ] |
| **filter** | **String**|  | [optional] [default to ] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AccountRankingRuleCollection**](AccountRankingRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCustomerRule"></a>
# **updateCustomerRule**
> AccountRankingRule updateCustomerRule(code, responseFields, accountRankingRule)

Update Customer Rule

Update Customer Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.AccountRankingRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AccountRankingRuleApi apiInstance = new AccountRankingRuleApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AccountRankingRule accountRankingRule = new AccountRankingRule(); // AccountRankingRule | 
    try {
      AccountRankingRule result = apiInstance.updateCustomerRule(code, responseFields, accountRankingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountRankingRuleApi#updateCustomerRule");
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
| **accountRankingRule** | [**AccountRankingRule**](AccountRankingRule.md)|  | [optional] |

### Return type

[**AccountRankingRule**](AccountRankingRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

