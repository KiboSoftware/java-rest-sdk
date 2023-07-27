# AdminGroupApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAdminGroup**](AdminGroupApi.md#addAdminGroup) | **POST** /platform/adminuser/groups | Add a admin group |
| [**addUsers**](AdminGroupApi.md#addUsers) | **POST** /platform/adminuser/groups/{groupCode}/addusers | Add users to admin group |
| [**deleteAdminGroup**](AdminGroupApi.md#deleteAdminGroup) | **DELETE** /platform/adminuser/groups/{groupCode} | Deletes a Admin Group |
| [**getAdminGroup**](AdminGroupApi.md#getAdminGroup) | **GET** /platform/adminuser/groups/{groupCode} | Get Admin Group |
| [**getAdminGroups**](AdminGroupApi.md#getAdminGroups) | **GET** /platform/adminuser/groups | Get Admin Groups |
| [**removeUsers**](AdminGroupApi.md#removeUsers) | **POST** /platform/adminuser/groups/{groupCode}/removeusers | Remove users from admin group |
| [**updateAdminGroup**](AdminGroupApi.md#updateAdminGroup) | **PUT** /platform/adminuser/groups/{groupCode} | Update an existing adminGroup |


<a name="addAdminGroup"></a>
# **addAdminGroup**
> AdminGroup addAdminGroup(adminGroup)

Add a admin group

Add a admin group

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    AdminGroup adminGroup = new AdminGroup(); // AdminGroup | 
    try {
      AdminGroup result = apiInstance.addAdminGroup(adminGroup);
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
| **adminGroup** | [**AdminGroup**](AdminGroup.md)|  | [optional] |

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addUsers"></a>
# **addUsers**
> AdminGroup addUsers(groupCode, requestBody)

Add users to admin group

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      AdminGroup result = apiInstance.addUsers(groupCode, requestBody);
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteAdminGroup"></a>
# **deleteAdminGroup**
> deleteAdminGroup(groupCode)

Deletes a Admin Group

Deletes a Admin Group

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAdminGroup"></a>
# **getAdminGroup**
> AdminGroup getAdminGroup(groupCode)

Get Admin Group

Gets a Admin group by id

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | groupCode
    try {
      AdminGroup result = apiInstance.getAdminGroup(groupCode);
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

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAdminGroups"></a>
# **getAdminGroups**
> AdminGroupCollection getAdminGroups(startIndex, pageSize, sortBy, filter)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 100; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      AdminGroupCollection result = apiInstance.getAdminGroups(startIndex, pageSize, sortBy, filter);
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

### Return type

[**AdminGroupCollection**](AdminGroupCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeUsers"></a>
# **removeUsers**
> removeUsers(groupCode, requestBody)

Remove users from admin group

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.removeUsers(groupCode, requestBody);
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAdminGroup"></a>
# **updateAdminGroup**
> AdminGroup updateAdminGroup(groupCode, adminGroup)

Update an existing adminGroup

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    AdminGroupApi apiInstance = new AdminGroupApi(defaultClient);
    String groupCode = "groupCode_example"; // String | 
    AdminGroup adminGroup = new AdminGroup(); // AdminGroup | 
    try {
      AdminGroup result = apiInstance.updateAdminGroup(groupCode, adminGroup);
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
| **adminGroup** | [**AdminGroup**](AdminGroup.md)|  | [optional] |

### Return type

[**AdminGroup**](AdminGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

