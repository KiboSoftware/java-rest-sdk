# DeveloperAdminAuthTicketApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeveloperUserAuthTicket**](DeveloperAdminAuthTicketApi.md#createDeveloperUserAuthTicket) | **POST** /platform/developer/authtickets | Create Developer User Auth Ticket |
| [**deleteUserAuthTicket**](DeveloperAdminAuthTicketApi.md#deleteUserAuthTicket) | **DELETE** /platform/developer/authtickets | Delete User Auth Ticket |
| [**refreshDeveloperAuthTicket**](DeveloperAdminAuthTicketApi.md#refreshDeveloperAuthTicket) | **PUT** /platform/developer/authtickets | Refresh Developer Auth Ticket |


<a name="createDeveloperUserAuthTicket"></a>
# **createDeveloperUserAuthTicket**
> DeveloperAdminUserAuthTicket createDeveloperUserAuthTicket(developerAccountId, userAuthInfo)

Create Developer User Auth Ticket

Authenticates a user for a particular tenant given a set of user credentials adn a tenantId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.DeveloperAdminAuthTicketApi;

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

    DeveloperAdminAuthTicketApi apiInstance = new DeveloperAdminAuthTicketApi(defaultClient);
    Integer developerAccountId = 56; // Integer | The users developer account Id
    UserAuthInfo userAuthInfo = new UserAuthInfo(); // UserAuthInfo | User's email address and password.
    try {
      DeveloperAdminUserAuthTicket result = apiInstance.createDeveloperUserAuthTicket(developerAccountId, userAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAdminAuthTicketApi#createDeveloperUserAuthTicket");
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
| **developerAccountId** | **Integer**| The users developer account Id | [optional] |
| **userAuthInfo** | [**UserAuthInfo**](UserAuthInfo.md)| User&#39;s email address and password. | [optional] |

### Return type

[**DeveloperAdminUserAuthTicket**](DeveloperAdminUserAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
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
import com.kibocommerce.sdk.adminuser.api.DeveloperAdminAuthTicketApi;

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

    DeveloperAdminAuthTicketApi apiInstance = new DeveloperAdminAuthTicketApi(defaultClient);
    String refreshToken = "refreshToken_example"; // String | The refresh token to delete.
    try {
      apiInstance.deleteUserAuthTicket(refreshToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAdminAuthTicketApi#deleteUserAuthTicket");
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

<a name="refreshDeveloperAuthTicket"></a>
# **refreshDeveloperAuthTicket**
> DeveloperAdminUserAuthTicket refreshDeveloperAuthTicket(developerAccountId, developerAdminUserAuthTicket)

Refresh Developer Auth Ticket

Reauthenticates the current user for a different tenant. If the user does not have access to the tenant, the operation fails.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.adminuser.ApiClient;
import com.kibocommerce.sdk.adminuser.ApiException;
import com.kibocommerce.sdk.adminuser.Configuration;
import com.kibocommerce.sdk.adminuser.auth.*;
import com.kibocommerce.sdk.adminuser.models.*;
import com.kibocommerce.sdk.adminuser.api.DeveloperAdminAuthTicketApi;

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

    DeveloperAdminAuthTicketApi apiInstance = new DeveloperAdminAuthTicketApi(defaultClient);
    Integer developerAccountId = 56; // Integer | The users developer account Id
    DeveloperAdminUserAuthTicket developerAdminUserAuthTicket = new DeveloperAdminUserAuthTicket(); // DeveloperAdminUserAuthTicket | An existing valid auth ticket containing the refresh token.
    try {
      DeveloperAdminUserAuthTicket result = apiInstance.refreshDeveloperAuthTicket(developerAccountId, developerAdminUserAuthTicket);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAdminAuthTicketApi#refreshDeveloperAuthTicket");
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
| **developerAccountId** | **Integer**| The users developer account Id | [optional] |
| **developerAdminUserAuthTicket** | [**DeveloperAdminUserAuthTicket**](DeveloperAdminUserAuthTicket.md)| An existing valid auth ticket containing the refresh token. | [optional] |

### Return type

[**DeveloperAdminUserAuthTicket**](DeveloperAdminUserAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

