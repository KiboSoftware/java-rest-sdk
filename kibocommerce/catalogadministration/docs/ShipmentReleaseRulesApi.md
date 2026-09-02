# ShipmentReleaseRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRule**](ShipmentReleaseRulesApi.md#createRule) | **POST** /commerce/rules/shipmentrelease | Create shipment release rule |
| [**deleteRule**](ShipmentReleaseRulesApi.md#deleteRule) | **DELETE** /commerce/rules/shipmentrelease/{code} | Delete shipment release rule |
| [**getRule**](ShipmentReleaseRulesApi.md#getRule) | **GET** /commerce/rules/shipmentrelease/{code} | Get shipment release rule by code |
| [**getRules**](ShipmentReleaseRulesApi.md#getRules) | **GET** /commerce/rules/shipmentrelease | Get shipment release rules |
| [**updateRank**](ShipmentReleaseRulesApi.md#updateRank) | **PUT** /commerce/rules/shipmentrelease/{code}/rank | Update shipment release rule rank |
| [**updateRule**](ShipmentReleaseRulesApi.md#updateRule) | **PUT** /commerce/rules/shipmentrelease/{code} | Update shipment release rule |


<a name="createRule"></a>
# **createRule**
> ShipmentReleaseRule createRule(responseFields, shipmentReleaseRule)

Create shipment release rule

Creates a new shipment release rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentReleaseRulesApi apiInstance = new ShipmentReleaseRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentReleaseRule shipmentReleaseRule = new ShipmentReleaseRule(); // ShipmentReleaseRule | 
    try {
      ShipmentReleaseRule result = apiInstance.createRule(responseFields, shipmentReleaseRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseRulesApi#createRule");
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
| **shipmentReleaseRule** | [**ShipmentReleaseRule**](ShipmentReleaseRule.md)|  | [optional] |

### Return type

[**ShipmentReleaseRule**](ShipmentReleaseRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(code)

Delete shipment release rule

Deletes a shipment release rule by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentReleaseRulesApi apiInstance = new ShipmentReleaseRulesApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.deleteRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseRulesApi#deleteRule");
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

<a name="getRule"></a>
# **getRule**
> ShipmentReleaseRule getRule(code, responseFields)

Get shipment release rule by code

Gets a shipment release rule details by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentReleaseRulesApi apiInstance = new ShipmentReleaseRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ShipmentReleaseRule result = apiInstance.getRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseRulesApi#getRule");
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

[**ShipmentReleaseRule**](ShipmentReleaseRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRules"></a>
# **getRules**
> ShipmentReleaseRuleCollection getRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get shipment release rules

Gets a collection of shipment release rules according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentReleaseRulesApi apiInstance = new ShipmentReleaseRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ShipmentReleaseRuleCollection result = apiInstance.getRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseRulesApi#getRules");
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

[**ShipmentReleaseRuleCollection**](ShipmentReleaseRuleCollection.md)

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

Update shipment release rule rank

Updates the rank for a shipment release rule and rearranges the ranks of all other rules accordingly.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentReleaseRulesApi apiInstance = new ShipmentReleaseRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | 
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseRulesApi#updateRank");
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

<a name="updateRule"></a>
# **updateRule**
> ShipmentReleaseRule updateRule(code, responseFields, shipmentReleaseRule)

Update shipment release rule

Updates an existing shipment release rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentReleaseRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentReleaseRulesApi apiInstance = new ShipmentReleaseRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentReleaseRule shipmentReleaseRule = new ShipmentReleaseRule(); // ShipmentReleaseRule | 
    try {
      ShipmentReleaseRule result = apiInstance.updateRule(code, responseFields, shipmentReleaseRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentReleaseRulesApi#updateRule");
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
| **shipmentReleaseRule** | [**ShipmentReleaseRule**](ShipmentReleaseRule.md)|  | [optional] |

### Return type

[**ShipmentReleaseRule**](ShipmentReleaseRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

