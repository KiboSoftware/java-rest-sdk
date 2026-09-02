# CreditApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCredit**](CreditApi.md#addCredit) | **POST** /commerce/customer/credits | Add Credit |
| [**addTransaction**](CreditApi.md#addTransaction) | **POST** /commerce/customer/credits/{code}/transactions | Add Transaction |
| [**associateCreditToShopper**](CreditApi.md#associateCreditToShopper) | **PUT** /commerce/customer/credits/{code}/associate-to-shopper | Associate Credit To Shopper |
| [**deleteCredit**](CreditApi.md#deleteCredit) | **DELETE** /commerce/customer/credits/{code} | Delete credit |
| [**getAuditEntries**](CreditApi.md#getAuditEntries) | **GET** /commerce/customer/credits/{code}/auditentries | Get Audit Entries |
| [**getCredit**](CreditApi.md#getCredit) | **GET** /commerce/customer/credits/{code} | Get credit |
| [**getCredits**](CreditApi.md#getCredits) | **GET** /commerce/customer/credits | Get Credits |
| [**getTransactions**](CreditApi.md#getTransactions) | **GET** /commerce/customer/credits/{code}/transactions | Get Transactions |
| [**resendCreditCreatedEmail**](CreditApi.md#resendCreditCreatedEmail) | **PUT** /commerce/customer/credits/{code}/Resend-Email | Resend Credit Created Email |
| [**updateCredit**](CreditApi.md#updateCredit) | **PUT** /commerce/customer/credits/{code} | Update Credit |


<a name="addCredit"></a>
# **addCredit**
> CustomerCredit addCredit(userId, responseFields, customerCredit)

Add Credit

Adds credit to user account. Store credit can represent a static amount the customer can redeem at any of the tenant&#39;s sites, or a gift card registered for a customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String userId = "userId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerCredit customerCredit = new CustomerCredit(); // CustomerCredit | 
    try {
      CustomerCredit result = apiInstance.addCredit(userId, responseFields, customerCredit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#addCredit");
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
| **userId** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **customerCredit** | [**CustomerCredit**](CustomerCredit.md)|  | [optional] |

### Return type

[**CustomerCredit**](CustomerCredit.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addTransaction"></a>
# **addTransaction**
> CreditTransaction addTransaction(code, responseFields, creditTransaction)

Add Transaction

Adds a credit transaction.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CreditTransaction creditTransaction = new CreditTransaction(); // CreditTransaction | 
    try {
      CreditTransaction result = apiInstance.addTransaction(code, responseFields, creditTransaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#addTransaction");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **creditTransaction** | [**CreditTransaction**](CreditTransaction.md)|  | [optional] |

### Return type

[**CreditTransaction**](CreditTransaction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="associateCreditToShopper"></a>
# **associateCreditToShopper**
> CustomerCredit associateCreditToShopper(code, responseFields)

Associate Credit To Shopper

Maps credit to the shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerCredit result = apiInstance.associateCreditToShopper(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#associateCreditToShopper");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerCredit**](CustomerCredit.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCredit"></a>
# **deleteCredit**
> deleteCredit(code)

Delete credit

Deletes a credit.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.deleteCredit(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#deleteCredit");
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
| **code** | **String**|  | |

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

<a name="getAuditEntries"></a>
# **getAuditEntries**
> CreditAuditEntryCollection getAuditEntries(code, startIndex, pageSize, sortBy, filter, responseFields)

Get Audit Entries

Retrieves a list of audit entries according to any filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CreditAuditEntryCollection result = apiInstance.getAuditEntries(code, startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#getAuditEntries");
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
| **code** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CreditAuditEntryCollection**](CreditAuditEntryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCredit"></a>
# **getCredit**
> CustomerCredit getCredit(code, responseFields)

Get credit

Get credit specified by code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerCredit result = apiInstance.getCredit(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#getCredit");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerCredit**](CustomerCredit.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCredits"></a>
# **getCredits**
> CreditCollection getCredits(startIndex, pageSize, sortBy, filter, responseFields)

Get Credits

Retrieves a list of credit collection according to any filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CreditCollection result = apiInstance.getCredits(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#getCredits");
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
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CreditCollection**](CreditCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTransactions"></a>
# **getTransactions**
> CreditTransactionCollection getTransactions(code, startIndex, pageSize, sortBy, filter, responseFields)

Get Transactions

Gets credit transactions according to any filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CreditTransactionCollection result = apiInstance.getTransactions(code, startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#getTransactions");
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
| **code** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CreditTransactionCollection**](CreditTransactionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="resendCreditCreatedEmail"></a>
# **resendCreditCreatedEmail**
> resendCreditCreatedEmail(code, userId, responseFields)

Resend Credit Created Email

Resend email when credit is created.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    String userId = "userId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.resendCreditCreatedEmail(code, userId, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#resendCreditCreatedEmail");
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
| **code** | **String**|  | |
| **userId** | **String**|  | [optional] |
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

<a name="updateCredit"></a>
# **updateCredit**
> CustomerCredit updateCredit(code, responseFields, customerCredit)

Update Credit

Updates a credit specified by a credit code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CreditApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CreditApi apiInstance = new CreditApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerCredit customerCredit = new CustomerCredit(); // CustomerCredit | 
    try {
      CustomerCredit result = apiInstance.updateCredit(code, responseFields, customerCredit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditApi#updateCredit");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **customerCredit** | [**CustomerCredit**](CustomerCredit.md)|  | [optional] |

### Return type

[**CustomerCredit**](CustomerCredit.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

