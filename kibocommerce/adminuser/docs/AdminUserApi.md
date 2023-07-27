# AdminUserApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserRole**](AdminUserApi.md#addUserRole) | **POST** /platform/adminuser/accounts/{userId}/roles/{roleId} | Add User Role |
| [**changePassword**](AdminUserApi.md#changePassword) | **POST** /platform/adminuser/accounts/{userId}/Change-Password | Changes a user&#39;s password |
| [**changeUserPassword**](AdminUserApi.md#changeUserPassword) | **POST** /platform/adminuser/accounts/{userId}/Change-User-Password | Change User Password |
| [**createUser**](AdminUserApi.md#createUser) | **POST** /platform/adminuser/accounts | Creates a new user |
| [**deleteUser**](AdminUserApi.md#deleteUser) | **DELETE** /platform/adminuser/accounts/{userId} | Delete User |
| [**getTenantScopesForUser**](AdminUserApi.md#getTenantScopesForUser) | **GET** /platform/adminuser/accounts/{userId}/tenants | Get tenant scope for users |
| [**getUser**](AdminUserApi.md#getUser) | **GET** /platform/adminuser/accounts/{userId} | Get User |
| [**getUserById**](AdminUserApi.md#getUserById) | **GET** /platform/adminuser/accounts/{userId}/userbyid | Get User By Id |
| [**getUserRoles**](AdminUserApi.md#getUserRoles) | **GET** /platform/adminuser/accounts/{userId}/roles | Get User Roles |
| [**getUsers**](AdminUserApi.md#getUsers) | **GET** /platform/adminuser/accounts | Get Users |
| [**removeUserRole**](AdminUserApi.md#removeUserRole) | **DELETE** /platform/adminuser/accounts/{userId}/roles/{roleId} | Remove User Role |
| [**resetPassword**](AdminUserApi.md#resetPassword) | **POST** /platform/adminuser/accounts/Reset-Password | Reset Password |
| [**unlockUser**](AdminUserApi.md#unlockUser) | **POST** /platform/adminuser/accounts/{userId}/unlock | Enables the user |
| [**updateUser**](AdminUserApi.md#updateUser) | **PUT** /platform/adminuser/accounts/{userId} | Update User |


<a name="addUserRole"></a>
# **addUserRole**
> addUserRole(userId, roleId)

Add User Role

Adds a role to the specified user&#39;s Admin account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user who receives the role.
    Integer roleId = 56; // Integer | Unique identifier of the role to add.
    try {
      apiInstance.addUserRole(userId, roleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#addUserRole");
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
| **userId** | **String**| Unique identifier of the user who receives the role. | |
| **roleId** | **Integer**| Unique identifier of the role to add. | |

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

<a name="changePassword"></a>
# **changePassword**
> changePassword(userId, adminUserPasswordInfo)

Changes a user&#39;s password



### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user for whom to change the password.
    AdminUserPasswordInfo adminUserPasswordInfo = new AdminUserPasswordInfo(); // AdminUserPasswordInfo | Old password and new password.
    try {
      apiInstance.changePassword(userId, adminUserPasswordInfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#changePassword");
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
| **userId** | **String**| Unique identifier of the user for whom to change the password. | |
| **adminUserPasswordInfo** | [**AdminUserPasswordInfo**](AdminUserPasswordInfo.md)| Old password and new password. | [optional] |

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

<a name="changeUserPassword"></a>
# **changeUserPassword**
> changeUserPassword(userId, changeUserPasswordInfo)

Change User Password

Changes a user&#39;s password to the provided new password

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user for whom to change the password.
    ChangeUserPasswordInfo changeUserPasswordInfo = new ChangeUserPasswordInfo(); // ChangeUserPasswordInfo | New password info for this user
    try {
      apiInstance.changeUserPassword(userId, changeUserPasswordInfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#changeUserPassword");
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
| **userId** | **String**| Unique identifier of the user for whom to change the password. | |
| **changeUserPasswordInfo** | [**ChangeUserPasswordInfo**](ChangeUserPasswordInfo.md)| New password info for this user | [optional] |

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

<a name="createUser"></a>
# **createUser**
> User createUser(user)

Creates a new user

Creates a new user

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    User user = new User(); // User | The user to be created
    try {
      User result = apiInstance.createUser(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#createUser");
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
| **user** | [**User**](User.md)| The user to be created | [optional] |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)

Delete User

Removes a user account from the site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user account to delete.
    try {
      apiInstance.deleteUser(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#deleteUser");
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
| **userId** | **String**| Unique identifier of the user account to delete. | |

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

<a name="getTenantScopesForUser"></a>
# **getTenantScopesForUser**
> TenantCollection getTenantScopesForUser(userId)

Get tenant scope for users

Get tenant scope for users

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      TenantCollection result = apiInstance.getTenantScopesForUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#getTenantScopesForUser");
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
| **userId** | **String**|  | |

### Return type

[**TenantCollection**](TenantCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUser"></a>
# **getUser**
> User getUser(userId)

Get User

Retrieves the details of a user specified by user ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user whose details you want to view.
    try {
      User result = apiInstance.getUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#getUser");
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
| **userId** | **String**| Unique identifier of the user whose details you want to view. | |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserById"></a>
# **getUserById**
> User getUserById(userId, responseGroups)

Get User By Id

Retrieves the details of a user specified by user ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user whose details you want to view.
    String responseGroups = "responseGroups_example"; // String | 
    try {
      User result = apiInstance.getUserById(userId, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#getUserById");
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
| **userId** | **String**| Unique identifier of the user whose details you want to view. | |
| **responseGroups** | **String**|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserRoles"></a>
# **getUserRoles**
> AdminUserUserRoleCollection getUserRoles(userId)

Get User Roles

Retrieves all the roles for a specified user on the specified tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user.
    try {
      AdminUserUserRoleCollection result = apiInstance.getUserRoles(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#getUserRoles");
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
| **userId** | **String**| Unique identifier of the user. | |

### Return type

[**AdminUserUserRoleCollection**](AdminUserUserRoleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUsers"></a>
# **getUsers**
> getUsers(emailAddress, startIndex, pageSize, sortBy, filter, responseGroups)

Get Users

Retrieves a list of Admin users for a specified site according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseGroups = "responseGroups_example"; // String | 
    try {
      apiInstance.getUsers(emailAddress, startIndex, pageSize, sortBy, filter, responseGroups);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#getUsers");
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
| **emailAddress** | **String**|  | [optional] |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **responseGroups** | **String**|  | [optional] |

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

<a name="removeUserRole"></a>
# **removeUserRole**
> removeUserRole(userId, roleId)

Remove User Role

Removes a role from the specified Admin account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user with the role to delete.
    Integer roleId = 56; // Integer | Unique identifer of the role to delete.
    try {
      apiInstance.removeUserRole(userId, roleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#removeUserRole");
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
| **userId** | **String**| Unique identifier of the user with the role to delete. | |
| **roleId** | **Integer**| Unique identifer of the role to delete. | |

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

<a name="resetPassword"></a>
# **resetPassword**
> resetPassword(adminUserResetPasswordInfo)

Reset Password

Resets the password for a user specified by email address.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    AdminUserResetPasswordInfo adminUserResetPasswordInfo = new AdminUserResetPasswordInfo(); // AdminUserResetPasswordInfo | Email address of the user who has requested a password reset.               Note that the site ID is passed in the request header.
    try {
      apiInstance.resetPassword(adminUserResetPasswordInfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#resetPassword");
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
| **adminUserResetPasswordInfo** | [**AdminUserResetPasswordInfo**](AdminUserResetPasswordInfo.md)| Email address of the user who has requested a password reset.               Note that the site ID is passed in the request header. | [optional] |

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

<a name="unlockUser"></a>
# **unlockUser**
> unlockUser(userId)

Enables the user



### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | The user id.
    try {
      apiInstance.unlockUser(userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#unlockUser");
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
| **userId** | **String**| The user id. | |

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

<a name="updateUser"></a>
# **updateUser**
> User updateUser(userId, user)

Update User

Modifies user information for a specified user.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminUserApi;

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

    AdminUserApi apiInstance = new AdminUserApi(defaultClient);
    String userId = "userId_example"; // String | Unique identifier of the user whose login information you want to change.
    User user = new User(); // User | Details of the new user account. Required properties: EmailAddress, FirstName, LastName, and Password. Note that the site ID is passed in the request header.
    try {
      User result = apiInstance.updateUser(userId, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminUserApi#updateUser");
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
| **userId** | **String**| Unique identifier of the user whose login information you want to change. | |
| **user** | [**User**](User.md)| Details of the new user account. Required properties: EmailAddress, FirstName, LastName, and Password. Note that the site ID is passed in the request header. | [optional] |

### Return type

[**User**](User.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

