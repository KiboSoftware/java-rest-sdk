# AppEventApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApplicationSubscription**](AppEventApi.md#createApplicationSubscription) | **POST** /platform/appdev/appsubscriptions/events | Create Application Subscription |
| [**deleteApplicationSubscription**](AppEventApi.md#deleteApplicationSubscription) | **DELETE** /platform/appdev/appsubscriptions/events/{applicationSubscriptionId} | Delete Application Subscription |
| [**getApplicationSubscription**](AppEventApi.md#getApplicationSubscription) | **GET** /platform/appdev/appsubscriptions/{subscriptionId} | Get Application Subscription |
| [**updateApplicationSubscription**](AppEventApi.md#updateApplicationSubscription) | **PUT** /platform/appdev/appsubscriptions/events | Update Application Subscription |


<a name="createApplicationSubscription"></a>
# **createApplicationSubscription**
> ApplicationSubscription createApplicationSubscription(responseFields, applicationSubscription)

Create Application Subscription

Create a new application event subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppEventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppEventApi apiInstance = new AppEventApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ApplicationSubscription applicationSubscription = new ApplicationSubscription(); // ApplicationSubscription | 
    try {
      ApplicationSubscription result = apiInstance.createApplicationSubscription(responseFields, applicationSubscription);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppEventApi#createApplicationSubscription");
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
| **applicationSubscription** | [**ApplicationSubscription**](ApplicationSubscription.md)|  | [optional] |

### Return type

[**ApplicationSubscription**](ApplicationSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteApplicationSubscription"></a>
# **deleteApplicationSubscription**
> deleteApplicationSubscription(applicationSubscriptionId)

Delete Application Subscription

Delete an application event subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppEventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppEventApi apiInstance = new AppEventApi(defaultClient);
    Integer applicationSubscriptionId = 56; // Integer | 
    try {
      apiInstance.deleteApplicationSubscription(applicationSubscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppEventApi#deleteApplicationSubscription");
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
| **applicationSubscriptionId** | **Integer**|  | |

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

<a name="getApplicationSubscription"></a>
# **getApplicationSubscription**
> ApplicationSubscription getApplicationSubscription(subscriptionId, responseFields)

Get Application Subscription

Get a specific application subscription by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppEventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppEventApi apiInstance = new AppEventApi(defaultClient);
    Integer subscriptionId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ApplicationSubscription result = apiInstance.getApplicationSubscription(subscriptionId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppEventApi#getApplicationSubscription");
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
| **subscriptionId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ApplicationSubscription**](ApplicationSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateApplicationSubscription"></a>
# **updateApplicationSubscription**
> ApplicationSubscription updateApplicationSubscription(responseFields, applicationSubscription)

Update Application Subscription

Update an existing application event subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppEventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppEventApi apiInstance = new AppEventApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ApplicationSubscription applicationSubscription = new ApplicationSubscription(); // ApplicationSubscription | 
    try {
      ApplicationSubscription result = apiInstance.updateApplicationSubscription(responseFields, applicationSubscription);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppEventApi#updateApplicationSubscription");
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
| **applicationSubscription** | [**ApplicationSubscription**](ApplicationSubscription.md)|  | [optional] |

### Return type

[**ApplicationSubscription**](ApplicationSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

