# ReservationRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReservationRule**](ReservationRulesApi.md#createReservationRule) | **POST** /commerce/rules/reservation | Create reservation rule |
| [**deleteReservationRule**](ReservationRulesApi.md#deleteReservationRule) | **DELETE** /commerce/rules/reservation/{code} | Delete reservation rule |
| [**getReservationRule**](ReservationRulesApi.md#getReservationRule) | **GET** /commerce/rules/reservation/{code} | Get reservation rule by code |
| [**getReservationRules**](ReservationRulesApi.md#getReservationRules) | **GET** /commerce/rules/reservation | Get reservation rules |
| [**updateRank**](ReservationRulesApi.md#updateRank) | **PUT** /commerce/rules/reservation/{code}/rank | Update reservation rule rank |
| [**updateReservationRule**](ReservationRulesApi.md#updateReservationRule) | **PUT** /commerce/rules/reservation/{code} | Update reservation rule |


<a name="createReservationRule"></a>
# **createReservationRule**
> ReservationRule createReservationRule(responseFields, reservationRule)

Create reservation rule

Creates a new reservation rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReservationRule reservationRule = new ReservationRule(); // ReservationRule | 
    try {
      ReservationRule result = apiInstance.createReservationRule(responseFields, reservationRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#createReservationRule");
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
| **reservationRule** | [**ReservationRule**](ReservationRule.md)|  | [optional] |

### Return type

[**ReservationRule**](ReservationRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteReservationRule"></a>
# **deleteReservationRule**
> deleteReservationRule(code)

Delete reservation rule

Permanently deletes a reservation rule (FR-013 hard delete).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.deleteReservationRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#deleteReservationRule");
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

<a name="getReservationRule"></a>
# **getReservationRule**
> ReservationRule getReservationRule(code, responseFields)

Get reservation rule by code

Gets a reservation rule by its unique code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationRule result = apiInstance.getReservationRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#getReservationRule");
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

[**ReservationRule**](ReservationRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReservationRules"></a>
# **getReservationRules**
> ReservationRuleCollection getReservationRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get reservation rules

Gets a collection of reservation rules according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationRuleCollection result = apiInstance.getReservationRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#getReservationRules");
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

[**ReservationRuleCollection**](ReservationRuleCollection.md)

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

Update reservation rule rank

Updates the rank for a reservation rule and atomically reorders all other rules in the current master catalog.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    UpdateRankRequest updateRankRequest = new UpdateRankRequest(); // UpdateRankRequest | 
    try {
      apiInstance.updateRank(code, responseFields, updateRankRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#updateRank");
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

<a name="updateReservationRule"></a>
# **updateReservationRule**
> ReservationRule updateReservationRule(code, responseFields, reservationRule)

Update reservation rule

Updates an existing reservation rule with full replacement semantics (FR-009).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ReservationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationRulesApi apiInstance = new ReservationRulesApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReservationRule reservationRule = new ReservationRule(); // ReservationRule | 
    try {
      ReservationRule result = apiInstance.updateReservationRule(code, responseFields, reservationRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationRulesApi#updateReservationRule");
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
| **reservationRule** | [**ReservationRule**](ReservationRule.md)|  | [optional] |

### Return type

[**ReservationRule**](ReservationRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

