# CustomerSegmentApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSegment**](CustomerSegmentApi.md#addSegment) | **POST** /commerce/customer/segments | Adds Segment |
| [**addSegmentAccounts**](CustomerSegmentApi.md#addSegmentAccounts) | **POST** /commerce/customer/segments/{id}/accounts | Add Segments Accounts |
| [**deleteSegment**](CustomerSegmentApi.md#deleteSegment) | **DELETE** /commerce/customer/segments/{id} | Delete Segment |
| [**getSegment**](CustomerSegmentApi.md#getSegment) | **GET** /commerce/customer/segments/{id} | Get Segment |
| [**getSegments**](CustomerSegmentApi.md#getSegments) | **GET** /commerce/customer/segments | Get Segments |
| [**removeSegmentAccount**](CustomerSegmentApi.md#removeSegmentAccount) | **DELETE** /commerce/customer/segments/{id}/accounts/{accountId} | Remove Segment Account |
| [**updateSegment**](CustomerSegmentApi.md#updateSegment) | **PUT** /commerce/customer/segments/{id} | Update Segment |


<a name="addSegment"></a>
# **addSegment**
> CustomerCustomerSegment addSegment(responseFields, customerCustomerSegment)

Adds Segment

Creates a new segment. Merchants create segments of customers, for example,  to offer discounts to particular groups or assign VIP status to a set of customers.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerSegmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerSegmentApi apiInstance = new CustomerSegmentApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerCustomerSegment customerCustomerSegment = new CustomerCustomerSegment(); // CustomerCustomerSegment | Name of the customer segment to create.
    try {
      CustomerCustomerSegment result = apiInstance.addSegment(responseFields, customerCustomerSegment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSegmentApi#addSegment");
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
| **customerCustomerSegment** | [**CustomerCustomerSegment**](CustomerCustomerSegment.md)| Name of the customer segment to create. | [optional] |

### Return type

[**CustomerCustomerSegment**](CustomerCustomerSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addSegmentAccounts"></a>
# **addSegmentAccounts**
> addSegmentAccounts(id, responseFields, requestBody)

Add Segments Accounts

Adds segments to an account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerSegmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerSegmentApi apiInstance = new CustomerSegmentApi(defaultClient);
    Integer id = 56; // Integer | Unique identifer of the segment.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<Integer> requestBody = Arrays.asList(); // List<Integer> | Unique identifiers of the accounts.
    try {
      apiInstance.addSegmentAccounts(id, responseFields, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSegmentApi#addSegmentAccounts");
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
| **id** | **Integer**| Unique identifer of the segment. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;Integer&gt;**](Integer.md)| Unique identifiers of the accounts. | [optional] |

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

<a name="deleteSegment"></a>
# **deleteSegment**
> deleteSegment(id)

Delete Segment

Deletes a segement specified by its unique code. Note that the group is deleted in all accounts that contain this segment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerSegmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerSegmentApi apiInstance = new CustomerSegmentApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.deleteSegment(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSegmentApi#deleteSegment");
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

<a name="getSegment"></a>
# **getSegment**
> CustomerCustomerSegment getSegment(id, responseFields)

Get Segment

Retrieves a segment specified the segment Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerSegmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerSegmentApi apiInstance = new CustomerSegmentApi(defaultClient);
    Integer id = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerCustomerSegment result = apiInstance.getSegment(id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSegmentApi#getSegment");
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

[**CustomerCustomerSegment**](CustomerCustomerSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSegments"></a>
# **getSegments**
> CustomerSegmentCollection getSegments(startIndex, pageSize, sortBy, filter, responseFields)

Get Segments

Retrieves a list of all segments defined for the site according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerSegmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerSegmentApi apiInstance = new CustomerSegmentApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 20; // Integer | Used to page results from a query.              Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = ""; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = ""; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerSegmentCollection result = apiInstance.getSegments(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSegmentApi#getSegments");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.              For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query.              Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 20] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] [default to ] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] [default to ] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerSegmentCollection**](CustomerSegmentCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeSegmentAccount"></a>
# **removeSegmentAccount**
> removeSegmentAccount(id, accountId)

Remove Segment Account

Removes single account from a segment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerSegmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerSegmentApi apiInstance = new CustomerSegmentApi(defaultClient);
    Integer id = 56; // Integer | Unique identifer of the segment.
    Integer accountId = 56; // Integer | Unique identifiers of the account.
    try {
      apiInstance.removeSegmentAccount(id, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSegmentApi#removeSegmentAccount");
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
| **id** | **Integer**| Unique identifer of the segment. | |
| **accountId** | **Integer**| Unique identifiers of the account. | |

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

<a name="updateSegment"></a>
# **updateSegment**
> CustomerCustomerSegment updateSegment(id, responseFields, customerCustomerSegment)

Update Segment

Update the code, name, or description of an existing segment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerSegmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CustomerSegmentApi apiInstance = new CustomerSegmentApi(defaultClient);
    Integer id = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerCustomerSegment customerCustomerSegment = new CustomerCustomerSegment(); // CustomerCustomerSegment | 
    try {
      CustomerCustomerSegment result = apiInstance.updateSegment(id, responseFields, customerCustomerSegment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSegmentApi#updateSegment");
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
| **customerCustomerSegment** | [**CustomerCustomerSegment**](CustomerCustomerSegment.md)|  | [optional] |

### Return type

[**CustomerCustomerSegment**](CustomerCustomerSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

