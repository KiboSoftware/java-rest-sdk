# PickWaveRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPickWaveRule**](PickWaveRulesApi.md#createPickWaveRule) | **POST** /commerce/rules/pickwave | Create Pick Wave Rule |
| [**deletePickWaveRule**](PickWaveRulesApi.md#deletePickWaveRule) | **DELETE** /commerce/rules/pickwave/{code} | Delete Pick Wave Rule |
| [**getPickWaveRule**](PickWaveRulesApi.md#getPickWaveRule) | **GET** /commerce/rules/pickwave/{code} | Get Pick Wave Rule by Code |
| [**getPickWaveRules**](PickWaveRulesApi.md#getPickWaveRules) | **GET** /commerce/rules/pickwave | Get Pick Wave Rules |
| [**updatePickWaveRule**](PickWaveRulesApi.md#updatePickWaveRule) | **PUT** /commerce/rules/pickwave/{code} | Update Pick Wave Rule |


<a name="createPickWaveRule"></a>
# **createPickWaveRule**
> PickWaveRule createPickWaveRule(responseFields, pickWaveRule)

Create Pick Wave Rule

Creates a new &lt;a href&#x3D;\&quot;/pages/pick-wave-rules\&quot;&gt;pick wave rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PickWaveRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PickWaveRulesApi apiInstance = new PickWaveRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PickWaveRule pickWaveRule = new PickWaveRule(); // PickWaveRule | 
    try {
      PickWaveRule result = apiInstance.createPickWaveRule(responseFields, pickWaveRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveRulesApi#createPickWaveRule");
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
| **pickWaveRule** | [**PickWaveRule**](PickWaveRule.md)|  | [optional] |

### Return type

[**PickWaveRule**](PickWaveRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deletePickWaveRule"></a>
# **deletePickWaveRule**
> deletePickWaveRule(code)

Delete Pick Wave Rule

Deletes a &lt;a href&#x3D;\&quot;/pages/pick-wave-rules\&quot;&gt;pick wave rule&lt;/a&gt; by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PickWaveRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PickWaveRulesApi apiInstance = new PickWaveRulesApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.deletePickWaveRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveRulesApi#deletePickWaveRule");
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

<a name="getPickWaveRule"></a>
# **getPickWaveRule**
> PickWaveRule getPickWaveRule(code, responseFields)

Get Pick Wave Rule by Code

Gets a &lt;a href&#x3D;\&quot;/pages/pick-wave-rules\&quot;&gt;pick wave rule&lt;/a&gt; details by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PickWaveRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PickWaveRulesApi apiInstance = new PickWaveRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PickWaveRule result = apiInstance.getPickWaveRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveRulesApi#getPickWaveRule");
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

[**PickWaveRule**](PickWaveRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPickWaveRules"></a>
# **getPickWaveRules**
> PickWaveRuleCollection getPickWaveRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get Pick Wave Rules

Gets a collection of &lt;a href&#x3D;\&quot;/pages/pick-wave-rules\&quot;&gt;pick wave rules&lt;/a&gt; according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PickWaveRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PickWaveRulesApi apiInstance = new PickWaveRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PickWaveRuleCollection result = apiInstance.getPickWaveRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveRulesApi#getPickWaveRules");
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

[**PickWaveRuleCollection**](PickWaveRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePickWaveRule"></a>
# **updatePickWaveRule**
> PickWaveRule updatePickWaveRule(code, responseFields, pickWaveRule)

Update Pick Wave Rule

Updates an existing &lt;a href&#x3D;\&quot;/pages/pick-wave-rules\&quot;&gt;pick wave rule&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.PickWaveRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PickWaveRulesApi apiInstance = new PickWaveRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PickWaveRule pickWaveRule = new PickWaveRule(); // PickWaveRule | 
    try {
      PickWaveRule result = apiInstance.updatePickWaveRule(code, responseFields, pickWaveRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveRulesApi#updatePickWaveRule");
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
| **pickWaveRule** | [**PickWaveRule**](PickWaveRule.md)|  | [optional] |

### Return type

[**PickWaveRule**](PickWaveRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

