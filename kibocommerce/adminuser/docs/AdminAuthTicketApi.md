# AdminAuthTicketApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserAuthTicket**](AdminAuthTicketApi.md#createUserAuthTicket) | **POST** /platform/adminuser/authtickets/tenants | Create User Auth Ticket |
| [**createUserAuthTicketWithWsFed**](AdminAuthTicketApi.md#createUserAuthTicketWithWsFed) | **POST** /platform/adminuser/authtickets/wsfed/auth/{id} | Create User Auth Ticket With Ws Fed |
| [**deleteUserAuthTicket**](AdminAuthTicketApi.md#deleteUserAuthTicket) | **DELETE** /platform/adminuser/authtickets | Delete User Auth Ticket |
| [**getWsFedChallengeUrl**](AdminAuthTicketApi.md#getWsFedChallengeUrl) | **GET** /platform/adminuser/authtickets/wsfed/challenge/{id} | Get Ws Fed Challenge Url |
| [**getWsFedSignOutUrl**](AdminAuthTicketApi.md#getWsFedSignOutUrl) | **GET** /platform/adminuser/authtickets/wsfed/SignOut/{id} | Get Ws Fed Sign Out Url |
| [**refreshAuthTicket**](AdminAuthTicketApi.md#refreshAuthTicket) | **PUT** /platform/adminuser/authtickets/tenants | Refresh Auth Ticket |


<a name="createUserAuthTicket"></a>
# **createUserAuthTicket**
> TenantAdminUserAuthTicket createUserAuthTicket(tenantId, userAuthInfo)

Create User Auth Ticket

Authenticates a user for a particular tenant given a set of user credentials adn a tenantId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminAuthTicketApi;

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

    AdminAuthTicketApi apiInstance = new AdminAuthTicketApi(defaultClient);
    Integer tenantId = 56; // Integer | Optional tenant Id parameter
    UserAuthInfo userAuthInfo = new UserAuthInfo(); // UserAuthInfo | User's email address and password.
    try {
      TenantAdminUserAuthTicket result = apiInstance.createUserAuthTicket(tenantId, userAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAuthTicketApi#createUserAuthTicket");
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
| **tenantId** | **Integer**| Optional tenant Id parameter | [optional] |
| **userAuthInfo** | [**UserAuthInfo**](UserAuthInfo.md)| User&#39;s email address and password. | [optional] |

### Return type

[**TenantAdminUserAuthTicket**](TenantAdminUserAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createUserAuthTicketWithWsFed"></a>
# **createUserAuthTicketWithWsFed**
> TenantAdminUserAuthTicket createUserAuthTicketWithWsFed(id, scopeid, scopeType)

Create User Auth Ticket With Ws Fed

Create User Auth Ticket With Ws Fed

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminAuthTicketApi;

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

    AdminAuthTicketApi apiInstance = new AdminAuthTicketApi(defaultClient);
    String id = "id_example"; // String | 
    Integer scopeid = 56; // Integer | 
    String scopeType = "scopeType_example"; // String | 
    try {
      TenantAdminUserAuthTicket result = apiInstance.createUserAuthTicketWithWsFed(id, scopeid, scopeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAuthTicketApi#createUserAuthTicketWithWsFed");
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
| **id** | **String**|  | |
| **scopeid** | **Integer**|  | [optional] |
| **scopeType** | **String**|  | [optional] |

### Return type

[**TenantAdminUserAuthTicket**](TenantAdminUserAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteUserAuthTicket"></a>
# **deleteUserAuthTicket**
> deleteUserAuthTicket(refreshToken)

Delete User Auth Ticket

Logs out a user by deleting the refresh token

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminAuthTicketApi;

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

    AdminAuthTicketApi apiInstance = new AdminAuthTicketApi(defaultClient);
    String refreshToken = "refreshToken_example"; // String | The refresh token to delete.
    try {
      apiInstance.deleteUserAuthTicket(refreshToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAuthTicketApi#deleteUserAuthTicket");
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
| **refreshToken** | **String**| The refresh token to delete. | [optional] |

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

<a name="getWsFedChallengeUrl"></a>
# **getWsFedChallengeUrl**
> String getWsFedChallengeUrl(id, scopeid, scopeType, redirect)

Get Ws Fed Challenge Url

Get Ws Fed Challenge Url

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminAuthTicketApi;

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

    AdminAuthTicketApi apiInstance = new AdminAuthTicketApi(defaultClient);
    String id = "id_example"; // String | 
    Integer scopeid = 56; // Integer | 
    String scopeType = "scopeType_example"; // String | 
    String redirect = "redirect_example"; // String | 
    try {
      String result = apiInstance.getWsFedChallengeUrl(id, scopeid, scopeType, redirect);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAuthTicketApi#getWsFedChallengeUrl");
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
| **id** | **String**|  | |
| **scopeid** | **Integer**|  | [optional] |
| **scopeType** | **String**|  | [optional] |
| **redirect** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getWsFedSignOutUrl"></a>
# **getWsFedSignOutUrl**
> String getWsFedSignOutUrl(id, redirect)

Get Ws Fed Sign Out Url

Get Ws Fed Sign Out Url

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminAuthTicketApi;

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

    AdminAuthTicketApi apiInstance = new AdminAuthTicketApi(defaultClient);
    String id = "id_example"; // String | 
    String redirect = "redirect_example"; // String | 
    try {
      String result = apiInstance.getWsFedSignOutUrl(id, redirect);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAuthTicketApi#getWsFedSignOutUrl");
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
| **id** | **String**|  | |
| **redirect** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="refreshAuthTicket"></a>
# **refreshAuthTicket**
> TenantAdminUserAuthTicket refreshAuthTicket(tenantId, tenantAdminUserAuthTicket)

Refresh Auth Ticket

Reauthenticates the current user for a different tenant. If the user does not have access to the tenant, the operation fails.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.AdminAuthTicketApi;

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

    AdminAuthTicketApi apiInstance = new AdminAuthTicketApi(defaultClient);
    Integer tenantId = 56; // Integer | The tenant to authenticate the user in
    TenantAdminUserAuthTicket tenantAdminUserAuthTicket = new TenantAdminUserAuthTicket(); // TenantAdminUserAuthTicket | An existing valid auth ticket containing the refresh token.
    try {
      TenantAdminUserAuthTicket result = apiInstance.refreshAuthTicket(tenantId, tenantAdminUserAuthTicket);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminAuthTicketApi#refreshAuthTicket");
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
| **tenantId** | **Integer**| The tenant to authenticate the user in | [optional] |
| **tenantAdminUserAuthTicket** | [**TenantAdminUserAuthTicket**](TenantAdminUserAuthTicket.md)| An existing valid auth ticket containing the refresh token. | [optional] |

### Return type

[**TenantAdminUserAuthTicket**](TenantAdminUserAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

