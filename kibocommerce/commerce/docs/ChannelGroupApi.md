# ChannelGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChannelGroup**](ChannelGroupApi.md#createChannelGroup) | **POST** /commerce/channelgroups | Creates Channel Group. |
| [**deleteChannelGroup**](ChannelGroupApi.md#deleteChannelGroup) | **DELETE** /commerce/channelgroups/{code} | Delete Channel Group |
| [**getChannelGroup**](ChannelGroupApi.md#getChannelGroup) | **GET** /commerce/channelgroups/{code} | Get Channel Group |
| [**getChannelGroups**](ChannelGroupApi.md#getChannelGroups) | **GET** /commerce/channelgroups | Get Channel Groups |
| [**updateChannelGroup**](ChannelGroupApi.md#updateChannelGroup) | **PUT** /commerce/channelgroups/{code} | Updates Channel Group. |


<a name="createChannelGroup"></a>
# **createChannelGroup**
> ChannelGroup createChannelGroup(channelGroup)

Creates Channel Group.

Creates a new channel group.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ChannelGroupApi;

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

    ChannelGroupApi apiInstance = new ChannelGroupApi(defaultClient);
    ChannelGroup channelGroup = new ChannelGroup(); // ChannelGroup | All properties of the channel group to place.
    try {
      ChannelGroup result = apiInstance.createChannelGroup(channelGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelGroupApi#createChannelGroup");
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
| **channelGroup** | [**ChannelGroup**](ChannelGroup.md)| All properties of the channel group to place. | [optional] |

### Return type

[**ChannelGroup**](ChannelGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteChannelGroup"></a>
# **deleteChannelGroup**
> deleteChannelGroup(code)

Delete Channel Group

Deletes a channel grop specified by group code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ChannelGroupApi;

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

    ChannelGroupApi apiInstance = new ChannelGroupApi(defaultClient);
    String code = "code_example"; // String | ID of the channel to update.
    try {
      apiInstance.deleteChannelGroup(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelGroupApi#deleteChannelGroup");
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
| **code** | **String**| ID of the channel to update. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChannelGroup"></a>
# **getChannelGroup**
> ChannelGroup getChannelGroup(code)

Get Channel Group

Retrieves the details of an channel group specified by the code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ChannelGroupApi;

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

    ChannelGroupApi apiInstance = new ChannelGroupApi(defaultClient);
    String code = "code_example"; // String | Unique identifier of the channel whose details you want.
    try {
      ChannelGroup result = apiInstance.getChannelGroup(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelGroupApi#getChannelGroup");
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
| **code** | **String**| Unique identifier of the channel whose details you want. | |

### Return type

[**ChannelGroup**](ChannelGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChannelGroups"></a>
# **getChannelGroups**
> ChannelGroupCollection getChannelGroups(startIndex, pageSize, sortBy, filter)

Get Channel Groups

Retrieves a list of channel groups according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ChannelGroupApi;

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

    ChannelGroupApi apiInstance = new ChannelGroupApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,               gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      ChannelGroupCollection result = apiInstance.getChannelGroups(startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelGroupApi#getChannelGroups");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals,               gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |

### Return type

[**ChannelGroupCollection**](ChannelGroupCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateChannelGroup"></a>
# **updateChannelGroup**
> ChannelGroup updateChannelGroup(code, channelGroup)

Updates Channel Group.

Updates a specific channel group.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.ChannelGroupApi;

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

    ChannelGroupApi apiInstance = new ChannelGroupApi(defaultClient);
    String code = "code_example"; // String | ID of the channel to update.
    ChannelGroup channelGroup = new ChannelGroup(); // ChannelGroup | All properties of the channel group to place.
    try {
      ChannelGroup result = apiInstance.updateChannelGroup(code, channelGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelGroupApi#updateChannelGroup");
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
| **code** | **String**| ID of the channel to update. | |
| **channelGroup** | [**ChannelGroup**](ChannelGroup.md)| All properties of the channel group to place. | [optional] |

### Return type

[**ChannelGroup**](ChannelGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

