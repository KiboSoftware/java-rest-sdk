# RoutingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEddCalculationLog1**](RoutingApi.md#getEddCalculationLog1) | **GET** /commerce/orders/orderrouting/api/v1/routing/eddCalculationLog | Get Edd Calculation Log |
| [**getSampleRequest**](RoutingApi.md#getSampleRequest) | **GET** /commerce/orders/orderrouting/api/v1/routing/samplerequest | Get Sample Request |
| [**getSuggestionLog2**](RoutingApi.md#getSuggestionLog2) | **GET** /commerce/orders/orderrouting/api/v1/routing/suggestionLog | Get Suggestion Log |
| [**reverseLogisticsSuggestions**](RoutingApi.md#reverseLogisticsSuggestions) | **POST** /commerce/orders/orderrouting/api/v1/routing/reverseLogisticsSuggestion | Reverse Logistics Suggestions |
| [**suggestCandidates**](RoutingApi.md#suggestCandidates) | **POST** /commerce/orders/orderrouting/api/v1/routing/candidates | Suggest Candidates |
| [**suggestRouting**](RoutingApi.md#suggestRouting) | **POST** /commerce/orders/orderrouting/api/v1/routing/suggestion | Suggest Routing |
| [**suggestRoutingTest**](RoutingApi.md#suggestRoutingTest) | **POST** /commerce/orders/orderrouting/api/v1/routing/suggestionTest | Suggest Routing Test |


<a name="getEddCalculationLog1"></a>
# **getEddCalculationLog1**
> List&lt;Object&gt; getEddCalculationLog1(xVolTenant, xVolSite, eddCalculationLogID, orderID, suggestionID)

Get Edd Calculation Log

Get Edd Calculation Log

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.RoutingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    Integer eddCalculationLogID = 56; // Integer | 
    Integer orderID = 56; // Integer | 
    Integer suggestionID = 56; // Integer | 
    try {
      List<Object> result = apiInstance.getEddCalculationLog1(xVolTenant, xVolSite, eddCalculationLogID, orderID, suggestionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#getEddCalculationLog1");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **eddCalculationLogID** | **Integer**|  | [optional] |
| **orderID** | **Integer**|  | [optional] |
| **suggestionID** | **Integer**|  | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getSampleRequest"></a>
# **getSampleRequest**
> SuggestionRequest getSampleRequest()

Get Sample Request

Retrieves a sample request.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.RoutingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    try {
      SuggestionRequest result = apiInstance.getSampleRequest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#getSampleRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SuggestionRequest**](SuggestionRequest.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getSuggestionLog2"></a>
# **getSuggestionLog2**
> List&lt;Object&gt; getSuggestionLog2(xVolTenant, xVolSite, orderID, suggestionID, responseID, externalResponseID, returnID, includeReturnLogs)

Get Suggestion Log

Retrieves a log of routing suggestions for an order. You can also view suggestion logs through the &lt;a href&#x3D;\&quot;/pages/suggestion-logs-and-debug\&quot;&gt;Order Routing user interface&lt;/a&gt;.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.RoutingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    Integer orderID = 56; // Integer | 
    Integer suggestionID = 56; // Integer | 
    Integer responseID = 56; // Integer | 
    String externalResponseID = "externalResponseID_example"; // String | 
    Integer returnID = 56; // Integer | 
    Boolean includeReturnLogs = true; // Boolean | 
    try {
      List<Object> result = apiInstance.getSuggestionLog2(xVolTenant, xVolSite, orderID, suggestionID, responseID, externalResponseID, returnID, includeReturnLogs);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#getSuggestionLog2");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **orderID** | **Integer**|  | [optional] |
| **suggestionID** | **Integer**|  | [optional] |
| **responseID** | **Integer**|  | [optional] |
| **externalResponseID** | **String**|  | [optional] |
| **returnID** | **Integer**|  | [optional] |
| **includeReturnLogs** | **Boolean**|  | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="reverseLogisticsSuggestions"></a>
# **reverseLogisticsSuggestions**
> ReverseLogisticsSuggestionResponse reverseLogisticsSuggestions(xVolTenant, xVolSite, returnSuggestionRequest, returnSuggestionLog)

Reverse Logistics Suggestions

Reverse Logistics Suggestions

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.RoutingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    ReturnSuggestionRequest returnSuggestionRequest = new ReturnSuggestionRequest(); // ReturnSuggestionRequest | 
    Boolean returnSuggestionLog = false; // Boolean | 
    try {
      ReverseLogisticsSuggestionResponse result = apiInstance.reverseLogisticsSuggestions(xVolTenant, xVolSite, returnSuggestionRequest, returnSuggestionLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#reverseLogisticsSuggestions");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **returnSuggestionRequest** | [**ReturnSuggestionRequest**](ReturnSuggestionRequest.md)|  | |
| **returnSuggestionLog** | **Boolean**|  | [optional] [default to false] |

### Return type

[**ReverseLogisticsSuggestionResponse**](ReverseLogisticsSuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="suggestCandidates"></a>
# **suggestCandidates**
> CandidateSuggestionsResponse suggestCandidates(candidateSuggestionsRequest)

Suggest Candidates

Suggests the routing candidates for an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.RoutingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    CandidateSuggestionsRequest candidateSuggestionsRequest = new CandidateSuggestionsRequest(); // CandidateSuggestionsRequest | 
    try {
      CandidateSuggestionsResponse result = apiInstance.suggestCandidates(candidateSuggestionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#suggestCandidates");
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
| **candidateSuggestionsRequest** | [**CandidateSuggestionsRequest**](CandidateSuggestionsRequest.md)|  | |

### Return type

[**CandidateSuggestionsResponse**](CandidateSuggestionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="suggestRouting"></a>
# **suggestRouting**
> SuggestionResponse suggestRouting(xVolTenant, xVolSite, suggestionRequest, returnSuggestionLog)

Suggest Routing

Suggests the routing assignment for an order.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.RoutingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    SuggestionRequest suggestionRequest = new SuggestionRequest(); // SuggestionRequest | 
    Boolean returnSuggestionLog = false; // Boolean | 
    try {
      SuggestionResponse result = apiInstance.suggestRouting(xVolTenant, xVolSite, suggestionRequest, returnSuggestionLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#suggestRouting");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **suggestionRequest** | [**SuggestionRequest**](SuggestionRequest.md)|  | |
| **returnSuggestionLog** | **Boolean**|  | [optional] [default to false] |

### Return type

[**SuggestionResponse**](SuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="suggestRoutingTest"></a>
# **suggestRoutingTest**
> SuggestionResponse suggestRoutingTest(xVolTenant, xVolSite, suggestionTestRequest, returnSuggestionLog)

Suggest Routing Test

Tests the routing suggestion logic.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.RoutingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    SuggestionTestRequest suggestionTestRequest = new SuggestionTestRequest(); // SuggestionTestRequest | 
    Boolean returnSuggestionLog = true; // Boolean | 
    try {
      SuggestionResponse result = apiInstance.suggestRoutingTest(xVolTenant, xVolSite, suggestionTestRequest, returnSuggestionLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#suggestRoutingTest");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **suggestionTestRequest** | [**SuggestionTestRequest**](SuggestionTestRequest.md)|  | |
| **returnSuggestionLog** | **Boolean**|  | [optional] [default to true] |

### Return type

[**SuggestionResponse**](SuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

