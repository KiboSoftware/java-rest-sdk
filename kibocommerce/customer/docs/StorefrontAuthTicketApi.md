# StorefrontAuthTicketApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnonymousShopperAuthTicket**](StorefrontAuthTicketApi.md#createAnonymousShopperAuthTicket) | **GET** /commerce/customer/authtickets/anonymousshopper | Create Anonymous Shopper Auth Ticket |
| [**createUserAuthTicket**](StorefrontAuthTicketApi.md#createUserAuthTicket) | **POST** /commerce/customer/authtickets | Create User Auth Ticket |
| [**refreshUserAuthTicket**](StorefrontAuthTicketApi.md#refreshUserAuthTicket) | **PUT** /commerce/customer/authtickets/refresh | Refresh User Auth Ticket |


<a name="createAnonymousShopperAuthTicket"></a>
# **createAnonymousShopperAuthTicket**
> CustomerAuthTicket createAnonymousShopperAuthTicket()

Create Anonymous Shopper Auth Ticket

Authenticates anonymous shopper for the site.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.StorefrontAuthTicketApi;

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    try {
      CustomerAuthTicket result = apiInstance.createAnonymousShopperAuthTicket();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#createAnonymousShopperAuthTicket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createUserAuthTicket"></a>
# **createUserAuthTicket**
> CustomerAuthTicket createUserAuthTicket(customerUserAuthInfo)

Create User Auth Ticket

Authenticates a user for a particular site given a set of user credentials.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.StorefrontAuthTicketApi;

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    CustomerUserAuthInfo customerUserAuthInfo = new CustomerUserAuthInfo(); // CustomerUserAuthInfo | User's email address and password.
    try {
      CustomerAuthTicket result = apiInstance.createUserAuthTicket(customerUserAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#createUserAuthTicket");
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
| **customerUserAuthInfo** | [**CustomerUserAuthInfo**](CustomerUserAuthInfo.md)| User&#39;s email address and password. | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="refreshUserAuthTicket"></a>
# **refreshUserAuthTicket**
> CustomerAuthTicket refreshUserAuthTicket(refreshToken)

Refresh User Auth Ticket

Refreshes a user&#39;s authentication.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.StorefrontAuthTicketApi;

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String refreshToken = "refreshToken_example"; // String | The user's refresh token.
    try {
      CustomerAuthTicket result = apiInstance.refreshUserAuthTicket(refreshToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#refreshUserAuthTicket");
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
| **refreshToken** | **String**| The user&#39;s refresh token. | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

