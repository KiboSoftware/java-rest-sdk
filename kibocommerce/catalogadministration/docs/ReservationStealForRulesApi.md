# ReservationStealForRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReservationStealForRule**](ReservationStealForRulesApi.md#createReservationStealForRule) | **POST** /commerce/rules/reservationstealfor | Create reservation steal-for rule |
| [**deleteReservationStealForRule**](ReservationStealForRulesApi.md#deleteReservationStealForRule) | **DELETE** /commerce/rules/reservationstealfor/{code} | Delete reservation steal-for rule |
| [**getReservationStealForRule**](ReservationStealForRulesApi.md#getReservationStealForRule) | **GET** /commerce/rules/reservationstealfor/{code} | Get reservation steal-for rule by code |
| [**getReservationStealForRules**](ReservationStealForRulesApi.md#getReservationStealForRules) | **GET** /commerce/rules/reservationstealfor | Get reservation steal-for rules |
| [**updateRank**](ReservationStealForRulesApi.md#updateRank) | **PUT** /commerce/rules/reservationstealfor/{code}/rank | Update reservation steal-for rule rank |
| [**updateReservationStealForRule**](ReservationStealForRulesApi.md#updateReservationStealForRule) | **PUT** /commerce/rules/reservationstealfor/{code} | Update reservation steal-for rule |


<a name="createReservationStealForRule"></a>
# **createReservationStealForRule**
> ReservationStealForRule createReservationStealForRule(responseFields, reservationStealForRule)

Create reservation steal-for rule

Creates a new reservation steal-for rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationStealForRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationStealForRulesApi apiInstance = new ReservationStealForRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReservationStealForRule reservationStealForRule = new ReservationStealForRule(); // ReservationStealForRule | 
    try {
      ReservationStealForRule result = apiInstance.createReservationStealForRule(responseFields, reservationStealForRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationStealForRulesApi#createReservationStealForRule");
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
| **reservationStealForRule** | [**ReservationStealForRule**](ReservationStealForRule.md)|  | [optional] |

### Return type

[**ReservationStealForRule**](ReservationStealForRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteReservationStealForRule"></a>
# **deleteReservationStealForRule**
> deleteReservationStealForRule(code)

Delete reservation steal-for rule

Permanently deletes a reservation steal-for rule (FR-013 hard delete).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationStealForRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationStealForRulesApi apiInstance = new ReservationStealForRulesApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.deleteReservationStealForRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationStealForRulesApi#deleteReservationStealForRule");
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

<a name="getReservationStealForRule"></a>
# **getReservationStealForRule**
> ReservationStealForRule getReservationStealForRule(code, responseFields)

Get reservation steal-for rule by code

Gets a reservation steal-for rule by its unique code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationStealForRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationStealForRulesApi apiInstance = new ReservationStealForRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationStealForRule result = apiInstance.getReservationStealForRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationStealForRulesApi#getReservationStealForRule");
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

[**ReservationStealForRule**](ReservationStealForRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReservationStealForRules"></a>
# **getReservationStealForRules**
> ReservationStealForRuleCollection getReservationStealForRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get reservation steal-for rules

Gets a collection of reservation steal-for rules according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationStealForRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationStealForRulesApi apiInstance = new ReservationStealForRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationStealForRuleCollection result = apiInstance.getReservationStealForRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationStealForRulesApi#getReservationStealForRules");
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

[**ReservationStealForRuleCollection**](ReservationStealForRuleCollection.md)

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

Update reservation steal-for rule rank

Updates the rank for a reservation steal-for rule and atomically reorders all other rules of this type in the current master catalog.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationStealForRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationStealForRulesApi apiInstance = new ReservationStealForRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | 
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationStealForRulesApi#updateRank");
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

<a name="updateReservationStealForRule"></a>
# **updateReservationStealForRule**
> ReservationStealForRule updateReservationStealForRule(code, responseFields, reservationStealForRule)

Update reservation steal-for rule

Updates an existing reservation steal-for rule with full replacement semantics (FR-009).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationStealForRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationStealForRulesApi apiInstance = new ReservationStealForRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReservationStealForRule reservationStealForRule = new ReservationStealForRule(); // ReservationStealForRule | 
    try {
      ReservationStealForRule result = apiInstance.updateReservationStealForRule(code, responseFields, reservationStealForRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationStealForRulesApi#updateReservationStealForRule");
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
| **reservationStealForRule** | [**ReservationStealForRule**](ReservationStealForRule.md)|  | [optional] |

### Return type

[**ReservationStealForRule**](ReservationStealForRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

