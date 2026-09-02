# StorefrontAuthTicketApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnonymousShopperAuthTicket**](StorefrontAuthTicketApi.md#createAnonymousShopperAuthTicket) | **GET** /commerce/customer/authtickets/anonymousshopper | Create Anonymous Shopper Auth Ticket |
| [**createUserAuthTicket**](StorefrontAuthTicketApi.md#createUserAuthTicket) | **POST** /commerce/customer/authtickets | Create User Auth Ticket |
| [**generateAndSend2faOtp**](StorefrontAuthTicketApi.md#generateAndSend2faOtp) | **POST** /commerce/customer/authtickets/2fa/request | Generate 2FA Code |
| [**generateAndSendOtp**](StorefrontAuthTicketApi.md#generateAndSendOtp) | **POST** /commerce/customer/authtickets/otp/request | Generate OTP Code |
| [**impersonateCart**](StorefrontAuthTicketApi.md#impersonateCart) | **POST** /commerce/customer/authtickets/impersonatecart | Impersonate Cart |
| [**refreshUserAuthTicket**](StorefrontAuthTicketApi.md#refreshUserAuthTicket) | **PUT** /commerce/customer/authtickets/refresh | Refresh User Auth Ticket |
| [**validate2FAAndCreateAuthTicket**](StorefrontAuthTicketApi.md#validate2FAAndCreateAuthTicket) | **POST** /commerce/customer/authtickets/2fa/auth | Create Auth Ticket |
| [**validateOtpAndCreateAuthTicket**](StorefrontAuthTicketApi.md#validateOtpAndCreateAuthTicket) | **POST** /commerce/customer/authtickets/otp/auth | Validate OTP |


<a name="createAnonymousShopperAuthTicket"></a>
# **createAnonymousShopperAuthTicket**
> CustomerAuthTicket createAnonymousShopperAuthTicket(responseFields)

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerAuthTicket result = apiInstance.createAnonymousShopperAuthTicket(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createUserAuthTicket"></a>
# **createUserAuthTicket**
> CustomerAuthTicket createUserAuthTicket(responseFields, customerUserAuthInfo)

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerUserAuthInfo customerUserAuthInfo = new CustomerUserAuthInfo(); // CustomerUserAuthInfo | User's email address and password.
    try {
      CustomerAuthTicket result = apiInstance.createUserAuthTicket(responseFields, customerUserAuthInfo);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **customerUserAuthInfo** | [**CustomerUserAuthInfo**](CustomerUserAuthInfo.md)| User&#39;s email address and password. | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="generateAndSend2faOtp"></a>
# **generateAndSend2faOtp**
> generateAndSend2faOtp(responseFields)

Generate 2FA Code

Generates a 6-digit &lt;a href&#x3D;\&quot;/pages/customer-account-access\&quot;&gt;2FA code&lt;/a&gt; and sends it to the user&#39;s email

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.generateAndSend2faOtp(responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#generateAndSend2faOtp");
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

<a name="generateAndSendOtp"></a>
# **generateAndSendOtp**
> generateAndSendOtp(responseFields, otpRequest)

Generate OTP Code

Generates a 6-digit &lt;a href&#x3D;\&quot;/pages/customer-account-access\&quot;&gt;OTP&lt;/a&gt; code and sends it to the user&#39;s email

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OtpRequest otpRequest = new OtpRequest(); // OtpRequest | Request containing email address.
    try {
      apiInstance.generateAndSendOtp(responseFields, otpRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#generateAndSendOtp");
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
| **otpRequest** | [**OtpRequest**](OtpRequest.md)| Request containing email address. | [optional] |

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

<a name="impersonateCart"></a>
# **impersonateCart**
> CustomerAuthTicket impersonateCart(responseFields, cartAuthTicketRequest)

Impersonate Cart

Impersonates a cart.

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CartAuthTicketRequest cartAuthTicketRequest = new CartAuthTicketRequest(); // CartAuthTicketRequest | 
    try {
      CustomerAuthTicket result = apiInstance.impersonateCart(responseFields, cartAuthTicketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#impersonateCart");
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
| **cartAuthTicketRequest** | [**CartAuthTicketRequest**](CartAuthTicketRequest.md)|  | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="refreshUserAuthTicket"></a>
# **refreshUserAuthTicket**
> CustomerAuthTicket refreshUserAuthTicket(refreshToken, accountId, responseFields)

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String refreshToken = "refreshToken_example"; // String | The user's refresh token.
    Integer accountId = 56; // Integer | Account Id specifies the account for which the user requests an authentication token.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerAuthTicket result = apiInstance.refreshUserAuthTicket(refreshToken, accountId, responseFields);
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
| **accountId** | **Integer**| Account Id specifies the account for which the user requests an authentication token. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="validate2FAAndCreateAuthTicket"></a>
# **validate2FAAndCreateAuthTicket**
> CustomerAuthTicket validate2FAAndCreateAuthTicket(responseFields, authTicket2FAInfo)

Create Auth Ticket

Validates the &lt;a href&#x3D;\&quot;/pages/customer-account-access\&quot;&gt;2FA&lt;/a&gt; details provided by the user and creates an authentication ticket

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AuthTicket2FAInfo authTicket2FAInfo = new AuthTicket2FAInfo(); // AuthTicket2FAInfo | 
    try {
      CustomerAuthTicket result = apiInstance.validate2FAAndCreateAuthTicket(responseFields, authTicket2FAInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#validate2FAAndCreateAuthTicket");
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
| **authTicket2FAInfo** | [**AuthTicket2FAInfo**](AuthTicket2FAInfo.md)|  | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="validateOtpAndCreateAuthTicket"></a>
# **validateOtpAndCreateAuthTicket**
> CustomerAuthTicket validateOtpAndCreateAuthTicket(responseFields, authTicketOtpInfo)

Validate OTP

Validates the &lt;a href&#x3D;\&quot;/pages/customer-account-access\&quot;&gt;OTP details&lt;/a&gt; provided by the Admin and creates an authentication ticket

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

    StorefrontAuthTicketApi apiInstance = new StorefrontAuthTicketApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AuthTicketOtpInfo authTicketOtpInfo = new AuthTicketOtpInfo(); // AuthTicketOtpInfo | 
    try {
      CustomerAuthTicket result = apiInstance.validateOtpAndCreateAuthTicket(responseFields, authTicketOtpInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontAuthTicketApi#validateOtpAndCreateAuthTicket");
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
| **authTicketOtpInfo** | [**AuthTicketOtpInfo**](AuthTicketOtpInfo.md)|  | [optional] |

### Return type

[**CustomerAuthTicket**](CustomerAuthTicket.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

