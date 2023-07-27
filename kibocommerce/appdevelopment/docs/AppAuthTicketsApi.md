# AppAuthTicketsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticateApp**](AppAuthTicketsApi.md#authenticateApp) | **POST** /platform/applications/authtickets | App Authenticate |
| [**deleteAppAuthTicket**](AppAuthTicketsApi.md#deleteAppAuthTicket) | **DELETE** /platform/applications/authtickets/{refreshToken} | Delete App Auth Ticket |
| [**oauthAuthenticateApp**](AppAuthTicketsApi.md#oauthAuthenticateApp) | **POST** /platform/applications/authtickets/oauth | Oauth Authenticate App |
| [**refreshAppAuthTicket**](AppAuthTicketsApi.md#refreshAppAuthTicket) | **PUT** /platform/applications/authtickets/refresh-ticket | Refresh App Auth Ticket |


<a name="authenticateApp"></a>
# **authenticateApp**
> AuthTicket authenticateApp(appAuthInfo)

App Authenticate

Authenticates an application using shared secret and application id. The method returns a set of authentication tokens used to manage application authentication.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppAuthTicketsApi;

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

    AppAuthTicketsApi apiInstance = new AppAuthTicketsApi(defaultClient);
    AppAuthInfo appAuthInfo = new AppAuthInfo(); // AppAuthInfo | 
    try {
      AuthTicket result = apiInstance.authenticateApp(appAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppAuthTicketsApi#authenticateApp");
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
| **appAuthInfo** | [**AppAuthInfo**](AppAuthInfo.md)|  | [optional] |

### Return type

[**AuthTicket**](AuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteAppAuthTicket"></a>
# **deleteAppAuthTicket**
> deleteAppAuthTicket(refreshToken)

Delete App Auth Ticket

This method is used to expire an application&#39;s current refresh token which   will force the application to reauthenticate once the current access token expires.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppAuthTicketsApi;

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

    AppAuthTicketsApi apiInstance = new AppAuthTicketsApi(defaultClient);
    String refreshToken = "refreshToken_example"; // String | 
    try {
      apiInstance.deleteAppAuthTicket(refreshToken);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppAuthTicketsApi#deleteAppAuthTicket");
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
| **refreshToken** | **String**|  | |

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

<a name="oauthAuthenticateApp"></a>
# **oauthAuthenticateApp**
> OAuthAccessTokenResponse oauthAuthenticateApp(oauthAuthRequest)

Oauth Authenticate App

Oauth Authenticate App

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppAuthTicketsApi;

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

    AppAuthTicketsApi apiInstance = new AppAuthTicketsApi(defaultClient);
    OauthAuthRequest oauthAuthRequest = new OauthAuthRequest(); // OauthAuthRequest | 
    try {
      OAuthAccessTokenResponse result = apiInstance.oauthAuthenticateApp(oauthAuthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppAuthTicketsApi#oauthAuthenticateApp");
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
| **oauthAuthRequest** | [**OauthAuthRequest**](OauthAuthRequest.md)|  | [optional] |

### Return type

[**OAuthAccessTokenResponse**](OAuthAccessTokenResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="refreshAppAuthTicket"></a>
# **refreshAppAuthTicket**
> AuthTicket refreshAppAuthTicket(authTicketRequest)

Refresh App Auth Ticket

Returns the AppAuthTicket with a refreshed AccessToken

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppAuthTicketsApi;

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

    AppAuthTicketsApi apiInstance = new AppAuthTicketsApi(defaultClient);
    AuthTicketRequest authTicketRequest = new AuthTicketRequest(); // AuthTicketRequest | 
    try {
      AuthTicket result = apiInstance.refreshAppAuthTicket(authTicketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppAuthTicketsApi#refreshAppAuthTicket");
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
| **authTicketRequest** | [**AuthTicketRequest**](AuthTicketRequest.md)|  | [optional] |

### Return type

[**AuthTicket**](AuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

