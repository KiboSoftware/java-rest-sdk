# SubscriptionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDeliveryAttemptSummaries**](SubscriptionApi.md#getDeliveryAttemptSummaries) | **GET** /event/push/subscriptions/{subscriptionId}/deliveryattempts | Get Delivery Attempt Summaries |
| [**getDeliveryAttemptSummariesAllSubscriptions**](SubscriptionApi.md#getDeliveryAttemptSummariesAllSubscriptions) | **GET** /event/push/subscriptions/deliveryattempts | Get Delivery Attempt Summaries All Subscriptions |
| [**getDeliveryAttemptSummary**](SubscriptionApi.md#getDeliveryAttemptSummary) | **GET** /event/push/subscriptions/{subscriptionId}/deliveryattempts/{processId} | Get Delivery Attempt Summary |
| [**getSubscriptions**](SubscriptionApi.md#getSubscriptions) | **GET** /event/push/subscriptions | Get Subscriptions |


<a name="getDeliveryAttemptSummaries"></a>
# **getDeliveryAttemptSummaries**
> EventDeliverySummaryCollection getDeliveryAttemptSummaries(subscriptionId, startIndex, pageSize, sortBy, filter)

Get Delivery Attempt Summaries

Get delivery attempts for the specified subscription

### Example
```java
// Import classes:
import com.kibocommerce.sdk.event.ApiClient;
import com.kibocommerce.sdk.event.ApiException;
import com.kibocommerce.sdk.event.Configuration;
import com.kibocommerce.sdk.event.auth.*;
import com.kibocommerce.sdk.event.models.*;
import com.kibocommerce.sdk.event.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | Subscription Identifier.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      EventDeliverySummaryCollection result = apiInstance.getDeliveryAttemptSummaries(subscriptionId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getDeliveryAttemptSummaries");
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
| **subscriptionId** | **String**| Subscription Identifier. | |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |

### Return type

[**EventDeliverySummaryCollection**](EventDeliverySummaryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDeliveryAttemptSummariesAllSubscriptions"></a>
# **getDeliveryAttemptSummariesAllSubscriptions**
> EventDeliverySummaryCollection getDeliveryAttemptSummariesAllSubscriptions(startIndex, pageSize, sortBy, filter)

Get Delivery Attempt Summaries All Subscriptions

Get delivery attempts

### Example
```java
// Import classes:
import com.kibocommerce.sdk.event.ApiClient;
import com.kibocommerce.sdk.event.ApiException;
import com.kibocommerce.sdk.event.Configuration;
import com.kibocommerce.sdk.event.auth.*;
import com.kibocommerce.sdk.event.models.*;
import com.kibocommerce.sdk.event.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      EventDeliverySummaryCollection result = apiInstance.getDeliveryAttemptSummariesAllSubscriptions(startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getDeliveryAttemptSummariesAllSubscriptions");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |

### Return type

[**EventDeliverySummaryCollection**](EventDeliverySummaryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDeliveryAttemptSummary"></a>
# **getDeliveryAttemptSummary**
> EventDeliverySummary getDeliveryAttemptSummary(subscriptionId, processId)

Get Delivery Attempt Summary

Get delivery attempt summary

### Example
```java
// Import classes:
import com.kibocommerce.sdk.event.ApiClient;
import com.kibocommerce.sdk.event.ApiException;
import com.kibocommerce.sdk.event.Configuration;
import com.kibocommerce.sdk.event.auth.*;
import com.kibocommerce.sdk.event.models.*;
import com.kibocommerce.sdk.event.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    String subscriptionId = "subscriptionId_example"; // String | 
    Integer processId = 56; // Integer | 
    try {
      EventDeliverySummary result = apiInstance.getDeliveryAttemptSummary(subscriptionId, processId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getDeliveryAttemptSummary");
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
| **subscriptionId** | **String**|  | |
| **processId** | **Integer**|  | |

### Return type

[**EventDeliverySummary**](EventDeliverySummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getSubscriptions"></a>
# **getSubscriptions**
> EventSubscriptionCollection getSubscriptions(startIndex, pageSize, sortBy, filter, responseGroups)

Get Subscriptions

Retrieves a list of events according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.event.ApiClient;
import com.kibocommerce.sdk.event.ApiException;
import com.kibocommerce.sdk.event.Configuration;
import com.kibocommerce.sdk.event.auth.*;
import com.kibocommerce.sdk.event.models.*;
import com.kibocommerce.sdk.event.api.SubscriptionApi;

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

    SubscriptionApi apiInstance = new SubscriptionApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseGroups = "responseGroups_example"; // String | Used to get more specific information from the request.  Available response groups: SubscribingSites.
    try {
      EventSubscriptionCollection result = apiInstance.getSubscriptions(startIndex, pageSize, sortBy, filter, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubscriptionApi#getSubscriptions");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **responseGroups** | **String**| Used to get more specific information from the request.  Available response groups: SubscribingSites. | [optional] |

### Return type

[**EventSubscriptionCollection**](EventSubscriptionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

