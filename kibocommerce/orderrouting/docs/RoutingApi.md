# RoutingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSampleRequestUsingGET**](RoutingApi.md#getSampleRequestUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/routing/samplerequest | getSampleRequest |
| [**getSuggestionLogUsingGET**](RoutingApi.md#getSuggestionLogUsingGET) | **GET** /commerce/orders/orderrouting/api/v1/routing/suggestionLog | getSuggestionLog |
| [**suggestCandidatesUsingPOST**](RoutingApi.md#suggestCandidatesUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/routing/candidates | suggestCandidates |
| [**suggestRoutingTestUsingPOST**](RoutingApi.md#suggestRoutingTestUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/routing/suggestionTest | suggestRoutingTest |
| [**suggestRoutingUsingPOST**](RoutingApi.md#suggestRoutingUsingPOST) | **POST** /commerce/orders/orderrouting/api/v1/routing/suggestion | suggestRouting |


<a name="getSampleRequestUsingGET"></a>
# **getSampleRequestUsingGET**
> SuggestionRequest getSampleRequestUsingGET(xVolSite, xVolTenant)

getSampleRequest

getSampleRequest

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    try {
      SuggestionRequest result = apiInstance.getSampleRequestUsingGET(xVolSite, xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#getSampleRequestUsingGET");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |

### Return type

[**SuggestionRequest**](SuggestionRequest.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getSuggestionLogUsingGET"></a>
# **getSuggestionLogUsingGET**
> List&lt;SuggestionLog&gt; getSuggestionLogUsingGET(xVolSite, xVolTenant, externalResponseID, orderID, responseID, suggestionID)

getSuggestionLog

getSuggestionLog

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    String externalResponseID = "externalResponseID_example"; // String | externalResponseID
    Integer orderID = 56; // Integer | orderID
    Integer responseID = 56; // Integer | responseID
    Integer suggestionID = 56; // Integer | suggestionID
    try {
      List<SuggestionLog> result = apiInstance.getSuggestionLogUsingGET(xVolSite, xVolTenant, externalResponseID, orderID, responseID, suggestionID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#getSuggestionLogUsingGET");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |
| **externalResponseID** | **String**| externalResponseID | [optional] |
| **orderID** | **Integer**| orderID | [optional] |
| **responseID** | **Integer**| responseID | [optional] |
| **suggestionID** | **Integer**| suggestionID | [optional] |

### Return type

[**List&lt;SuggestionLog&gt;**](SuggestionLog.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="suggestCandidatesUsingPOST"></a>
# **suggestCandidatesUsingPOST**
> CandidateSuggestionsResponse suggestCandidatesUsingPOST(xVolSite, xVolTenant, request)

suggestCandidates

suggestCandidates

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    CandidateSuggestionsRequest request = new CandidateSuggestionsRequest(); // CandidateSuggestionsRequest | request
    try {
      CandidateSuggestionsResponse result = apiInstance.suggestCandidatesUsingPOST(xVolSite, xVolTenant, request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#suggestCandidatesUsingPOST");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |
| **request** | [**CandidateSuggestionsRequest**](CandidateSuggestionsRequest.md)| request | |

### Return type

[**CandidateSuggestionsResponse**](CandidateSuggestionsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="suggestRoutingTestUsingPOST"></a>
# **suggestRoutingTestUsingPOST**
> SuggestionResponse suggestRoutingTestUsingPOST(xVolSite, xVolTenant, request, returnSuggestionLog)

suggestRoutingTest

suggestRoutingTest

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    SuggestionTestRequest request = new SuggestionTestRequest(); // SuggestionTestRequest | request
    Boolean returnSuggestionLog = true; // Boolean | returnSuggestionLog
    try {
      SuggestionResponse result = apiInstance.suggestRoutingTestUsingPOST(xVolSite, xVolTenant, request, returnSuggestionLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#suggestRoutingTestUsingPOST");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |
| **request** | [**SuggestionTestRequest**](SuggestionTestRequest.md)| request | |
| **returnSuggestionLog** | **Boolean**| returnSuggestionLog | [optional] [default to true] |

### Return type

[**SuggestionResponse**](SuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="suggestRoutingUsingPOST"></a>
# **suggestRoutingUsingPOST**
> SuggestionResponse suggestRoutingUsingPOST(xVolSite, xVolTenant, request, returnSuggestionLog)

suggestRouting

suggestRouting

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    RoutingApi apiInstance = new RoutingApi(defaultClient);
    Integer xVolSite = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | 
    SuggestionRequest request = new SuggestionRequest(); // SuggestionRequest | request
    Boolean returnSuggestionLog = false; // Boolean | returnSuggestionLog
    try {
      SuggestionResponse result = apiInstance.suggestRoutingUsingPOST(xVolSite, xVolTenant, request, returnSuggestionLog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RoutingApi#suggestRoutingUsingPOST");
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
| **xVolSite** | **Integer**|  | |
| **xVolTenant** | **Integer**|  | |
| **request** | [**SuggestionRequest**](SuggestionRequest.md)| request | |
| **returnSuggestionLog** | **Boolean**| returnSuggestionLog | [optional] [default to false] |

### Return type

[**SuggestionResponse**](SuggestionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

