# AdminGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAdminGroup**](AdminGroupApi.md#addAdminGroup) | **POST** /platform/adminuser/groups | Add Admin Group |
| [**addUsers**](AdminGroupApi.md#addUsers) | **POST** /platform/adminuser/groups/{groupCode}/addusers | Add Users to Admin Group |
| [**deleteAdminGroup**](AdminGroupApi.md#deleteAdminGroup) | **DELETE** /platform/adminuser/groups/{groupCode} | Delete Admin Group |
| [**getAdminGroup**](AdminGroupApi.md#getAdminGroup) | **GET** /platform/adminuser/groups/{groupCode} | Get Admin Group |
| [**getAdminGroups**](AdminGroupApi.md#getAdminGroups) | **GET** /platform/adminuser/groups | Get Admin Groups |
| [**removeUsers**](AdminGroupApi.md#removeUsers) | **POST** /platform/adminuser/groups/{groupCode}/removeusers | Remove Users from Admin Group |
| [**updateAdminGroup**](AdminGroupApi.md#updateAdminGroup) | **PUT** /platform/adminuser/groups/{groupCode} | Update Admin Group |


<a name="addAdminGroup"></a>
# **addAdminGroup**
> AdminGroup addAdminGroup(responseFields, adminGroup)

Add Admin Group

Adds an admin group

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AdminGroup adminGroup = new AdminGroup(); // AdminGroup | 
    try {
      AdminGroup result = apiInstance.addAdminGroup(responseFields, adminGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminGroupApi#addAdminGroup");
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
| **adminGroup** | [**AdminGroup**](AdminGroup.md)|  | [optional] |

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addUsers"></a>
# **addUsers**
> AdminGroup addUsers(groupCode, responseFields, requestBody)

Add Users to Admin Group

Add users to admin group

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      AdminGroup result = apiInstance.addUsers(groupCode, responseFields, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminGroupApi#addUsers");
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
| **groupCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteAdminGroup"></a>
# **deleteAdminGroup**
> deleteAdminGroup(groupCode)

Delete Admin Group

Deletes an Admin Group

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | 
    try {
      apiInstance.deleteAdminGroup(groupCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminGroupApi#deleteAdminGroup");
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
| **groupCode** | **String**|  | |

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

<a name="getAdminGroup"></a>
# **getAdminGroup**
> AdminGroup getAdminGroup(groupCode, responseFields)

Get Admin Group

Gets an Admin group by id

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | groupCode
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AdminGroup result = apiInstance.getAdminGroup(groupCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminGroupApi#getAdminGroup");
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
| **groupCode** | **String**| groupCode | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAdminGroups"></a>
# **getAdminGroups**
> AdminGroupCollection getAdminGroups(startIndex, pageSize, sortBy, filter, responseFields)

Get Admin Groups

Gets a collection of user groups

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AdminGroupCollection result = apiInstance.getAdminGroups(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminGroupApi#getAdminGroups");
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
| **pageSize** | **Integer**|  | [optional] [default to 100] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AdminGroupCollection**](AdminGroupCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeUsers"></a>
# **removeUsers**
> removeUsers(groupCode, responseFields, requestBody)

Remove Users from Admin Group

Remove users from admin group

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.removeUsers(groupCode, responseFields, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminGroupApi#removeUsers");
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
| **groupCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

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

<a name="updateAdminGroup"></a>
# **updateAdminGroup**
> AdminGroup updateAdminGroup(groupCode, responseFields, adminGroup)

Update Admin Group

Update an existing adminGroup

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AdminGroup adminGroup = new AdminGroup(); // AdminGroup | 
    try {
      AdminGroup result = apiInstance.updateAdminGroup(groupCode, responseFields, adminGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminGroupApi#updateAdminGroup");
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
| **groupCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **adminGroup** | [**AdminGroup**](AdminGroup.md)|  | [optional] |

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

