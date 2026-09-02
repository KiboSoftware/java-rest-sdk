# InStockNotificationSubscriptionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addInStockNotificationSubscription**](InStockNotificationSubscriptionApi.md#addInStockNotificationSubscription) | **POST** /commerce/instocknotifications | Add In Stock Notification Subscription |
| [**deleteInStockNotificationSubscription**](InStockNotificationSubscriptionApi.md#deleteInStockNotificationSubscription) | **DELETE** /commerce/instocknotifications/{id} | Delete In Stock Notification Subscription |
| [**getInStockNotificationSubscription**](InStockNotificationSubscriptionApi.md#getInStockNotificationSubscription) | **GET** /commerce/instocknotifications/{id} | Get In Stock Notification Subscription |
| [**getInStockNotificationSubscriptions**](InStockNotificationSubscriptionApi.md#getInStockNotificationSubscriptions) | **GET** /commerce/instocknotifications | Get In Stock Notification Subscriptions |


<a name="addInStockNotificationSubscription"></a>
# **addInStockNotificationSubscription**
> InStockNotificationSubscription addInStockNotificationSubscription(responseFields, inStockNotificationSubscription)

Add In Stock Notification Subscription

Creates a new notification subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.InStockNotificationSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InStockNotificationSubscriptionApi apiInstance = new InStockNotificationSubscriptionApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    InStockNotificationSubscription inStockNotificationSubscription = new InStockNotificationSubscription(); // InStockNotificationSubscription | 
    try {
      InStockNotificationSubscription result = apiInstance.addInStockNotificationSubscription(responseFields, inStockNotificationSubscription);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InStockNotificationSubscriptionApi#addInStockNotificationSubscription");
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
| **inStockNotificationSubscription** | [**InStockNotificationSubscription**](InStockNotificationSubscription.md)|  | [optional] |

### Return type

[**InStockNotificationSubscription**](InStockNotificationSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteInStockNotificationSubscription"></a>
# **deleteInStockNotificationSubscription**
> deleteInStockNotificationSubscription(id)

Delete In Stock Notification Subscription

Deletes an in stock notification subscription.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.InStockNotificationSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InStockNotificationSubscriptionApi apiInstance = new InStockNotificationSubscriptionApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.deleteInStockNotificationSubscription(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling InStockNotificationSubscriptionApi#deleteInStockNotificationSubscription");
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
| **id** | **Integer**|  | |

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

<a name="getInStockNotificationSubscription"></a>
# **getInStockNotificationSubscription**
> InStockNotificationSubscription getInStockNotificationSubscription(id, responseFields)

Get In Stock Notification Subscription

Retrieves the details of an inventory back in stock notification.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.InStockNotificationSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InStockNotificationSubscriptionApi apiInstance = new InStockNotificationSubscriptionApi(defaultClient);
    Integer id = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      InStockNotificationSubscription result = apiInstance.getInStockNotificationSubscription(id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InStockNotificationSubscriptionApi#getInStockNotificationSubscription");
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
| **id** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**InStockNotificationSubscription**](InStockNotificationSubscription.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getInStockNotificationSubscriptions"></a>
# **getInStockNotificationSubscriptions**
> InStockNotificationSubscriptionCollection getInStockNotificationSubscriptions(startIndex, pageSize, sortBy, filter, responseFields)

Get In Stock Notification Subscriptions

Retrieves a list of inventory back in stock notification subscriptions according to any filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.InStockNotificationSubscriptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    InStockNotificationSubscriptionApi apiInstance = new InStockNotificationSubscriptionApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      InStockNotificationSubscriptionCollection result = apiInstance.getInStockNotificationSubscriptions(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InStockNotificationSubscriptionApi#getInStockNotificationSubscriptions");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**InStockNotificationSubscriptionCollection**](InStockNotificationSubscriptionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

