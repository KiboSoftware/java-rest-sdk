# B2BAccountApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAccount**](B2BAccountApi.md#addAccount) | **POST** /commerce/customer/b2baccounts | Add Account |
| [**addB2BAccountAttribute**](B2BAccountApi.md#addB2BAccountAttribute) | **POST** /commerce/customer/b2baccounts/{accountId}/attributes | Add B2B Account tAttribute |
| [**addSalesRepToB2BAccount**](B2BAccountApi.md#addSalesRepToB2BAccount) | **POST** /commerce/customer/b2baccounts/{accountId}/salesrep/{userId} | Add Sales Rep To B2B Account |
| [**addSalesRepsToB2BAccount**](B2BAccountApi.md#addSalesRepsToB2BAccount) | **POST** /commerce/customer/b2baccounts/{accountId}/addsalesreps | Add Sales Reps To B2B Account |
| [**addUser**](B2BAccountApi.md#addUser) | **POST** /commerce/customer/b2baccounts/{accountId}/user | Add User |
| [**addUserRoleAsync**](B2BAccountApi.md#addUserRoleAsync) | **POST** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles/{roleId} | Add User Role Async |
| [**changeParentAccount**](B2BAccountApi.md#changeParentAccount) | **POST** /commerce/customer/b2baccounts/{accountId}/changeparent/{parentAccountId} | Change Parent Account |
| [**deleteB2BAccountAttribute**](B2BAccountApi.md#deleteB2BAccountAttribute) | **DELETE** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Delete B2B Account Attribute |
| [**getAccountsForSalesRep**](B2BAccountApi.md#getAccountsForSalesRep) | **GET** /commerce/customer/b2baccounts/salesrep/{userId} | Get Accounts For Sales Rep |
| [**getB2BAccount**](B2BAccountApi.md#getB2BAccount) | **GET** /commerce/customer/b2baccounts/{accountId} | Get B2B Account |
| [**getB2BAccountAttribute**](B2BAccountApi.md#getB2BAccountAttribute) | **GET** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Get B2B Account Attribute |
| [**getB2BAccountAttributes**](B2BAccountApi.md#getB2BAccountAttributes) | **GET** /commerce/customer/b2baccounts/{accountId}/attributes | Get B2B Account Attributes |
| [**getB2BAccountHierarchy**](B2BAccountApi.md#getB2BAccountHierarchy) | **GET** /commerce/customer/b2baccounts/{accountId}/hierarchy | Get B2B Account Hierarchy |
| [**getB2BAccounts**](B2BAccountApi.md#getB2BAccounts) | **GET** /commerce/customer/b2baccounts | Get B2B Accounts |
| [**getUserRolesAsync**](B2BAccountApi.md#getUserRolesAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles | Get User Roles Async |
| [**getUsersAsync**](B2BAccountApi.md#getUsersAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/users | Get Users Async |
| [**removeSalesRepFromB2BAccount**](B2BAccountApi.md#removeSalesRepFromB2BAccount) | **DELETE** /commerce/customer/b2baccounts/{accountId}/salesrep/{userId} | Remove Sales Rep From B2B Account |
| [**removeUser**](B2BAccountApi.md#removeUser) | **PUT** /commerce/customer/b2baccounts/{accountId}/user/{userId}/remove | Remove User |
| [**removeUserRoleAsync**](B2BAccountApi.md#removeUserRoleAsync) | **DELETE** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles/{roleId} | Remove User Role Async |
| [**updateAccount**](B2BAccountApi.md#updateAccount) | **PUT** /commerce/customer/b2baccounts/{accountId} | Update Account |
| [**updateB2BAccountAttribute**](B2BAccountApi.md#updateB2BAccountAttribute) | **PUT** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Update B2B Account Attribute |
| [**updateB2BAccountStatus**](B2BAccountApi.md#updateB2BAccountStatus) | **PUT** /commerce/customer/b2baccounts/{accountId}/status/{actionName} | Update B2B Account Status |
| [**updateSalesRepsOnB2BAccount**](B2BAccountApi.md#updateSalesRepsOnB2BAccount) | **PUT** /commerce/customer/b2baccounts/{accountId}/salesrep | Update Sales Reps On B2B Account |
| [**updateUser**](B2BAccountApi.md#updateUser) | **PUT** /commerce/customer/b2baccounts/{accountId}/user/{userId} | Update User |
| [**upgradeAccountsToB2B**](B2BAccountApi.md#upgradeAccountsToB2B) | **PUT** /commerce/customer/b2baccounts/upgradeaccounts | Upgrade B2C Accounts To B2B |


<a name="addAccount"></a>
# **addAccount**
> B2BAccount addAccount(b2BAccount)

Add Account

Creates a new B2B account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    B2BAccount b2BAccount = new B2BAccount(); // B2BAccount | Properties of the new B2B account to create.
    try {
      B2BAccount result = apiInstance.addAccount(b2BAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#addAccount");
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
| **b2BAccount** | [**B2BAccount**](B2BAccount.md)| Properties of the new B2B account to create. | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addB2BAccountAttribute"></a>
# **addB2BAccountAttribute**
> CustomerAttribute addB2BAccountAttribute(accountId, customerAttribute)

Add B2B Account tAttribute

Add a customer attribute to the B2B account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    CustomerAttribute customerAttribute = new CustomerAttribute(); // CustomerAttribute | 
    try {
      CustomerAttribute result = apiInstance.addB2BAccountAttribute(accountId, customerAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#addB2BAccountAttribute");
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
| **accountId** | **Integer**|  | |
| **customerAttribute** | [**CustomerAttribute**](CustomerAttribute.md)|  | [optional] |

### Return type

[**CustomerAttribute**](CustomerAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addSalesRepToB2BAccount"></a>
# **addSalesRepToB2BAccount**
> B2BAccount addSalesRepToB2BAccount(accountId, userId)

Add Sales Rep To B2B Account

Add Sales Rep To B2B Account

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    try {
      B2BAccount result = apiInstance.addSalesRepToB2BAccount(accountId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#addSalesRepToB2BAccount");
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
| **accountId** | **Integer**|  | |
| **userId** | **String**|  | |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addSalesRepsToB2BAccount"></a>
# **addSalesRepsToB2BAccount**
> B2BAccount addSalesRepsToB2BAccount(accountId, requestBody)

Add Sales Reps To B2B Account

Adds lists of sales reps to a B2B account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      B2BAccount result = apiInstance.addSalesRepsToB2BAccount(accountId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#addSalesRepsToB2BAccount");
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
| **accountId** | **Integer**|  | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addUser"></a>
# **addUser**
> B2BUser addUser(accountId, b2BUserAndAuthInfo)

Add User

Adds user to B2B account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    B2BUserAndAuthInfo b2BUserAndAuthInfo = new B2BUserAndAuthInfo(); // B2BUserAndAuthInfo | 
    try {
      B2BUser result = apiInstance.addUser(accountId, b2BUserAndAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#addUser");
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
| **accountId** | **Integer**|  | |
| **b2BUserAndAuthInfo** | [**B2BUserAndAuthInfo**](B2BUserAndAuthInfo.md)|  | [optional] |

### Return type

[**B2BUser**](B2BUser.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addUserRoleAsync"></a>
# **addUserRoleAsync**
> addUserRoleAsync(accountId, userId, roleId)

Add User Role Async

Add a role to B2B user.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | Unique identifier of the user who receives the role.
    Integer roleId = 56; // Integer | Unique identifier of the role to add.
    try {
      apiInstance.addUserRoleAsync(accountId, userId, roleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#addUserRoleAsync");
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
| **accountId** | **Integer**|  | |
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

<a name="changeParentAccount"></a>
# **changeParentAccount**
> B2BAccount changeParentAccount(accountId, parentAccountId)

Change Parent Account

Change the B2B parent account for an existing B2B account that belongs to an account hierarchy.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account.
    Integer parentAccountId = 56; // Integer | 
    try {
      B2BAccount result = apiInstance.changeParentAccount(accountId, parentAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#changeParentAccount");
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
| **accountId** | **Integer**| Unique identifier of the B2B account. | |
| **parentAccountId** | **Integer**|  | |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteB2BAccountAttribute"></a>
# **deleteB2BAccountAttribute**
> deleteB2BAccountAttribute(accountId, attributeFQN)

Delete B2B Account Attribute

Deletes a specific customer attribute specified by attributeFQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    try {
      apiInstance.deleteB2BAccountAttribute(accountId, attributeFQN);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#deleteB2BAccountAttribute");
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
| **accountId** | **Integer**|  | |
| **attributeFQN** | **String**|  | |

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

<a name="getAccountsForSalesRep"></a>
# **getAccountsForSalesRep**
> List&lt;Integer&gt; getAccountsForSalesRep(userId)

Get Accounts For Sales Rep

Gets list of accounts for the B2B sales rep account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String userId = "userId_example"; // String | 
    try {
      List<Integer> result = apiInstance.getAccountsForSalesRep(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getAccountsForSalesRep");
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

**List&lt;Integer&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getB2BAccount"></a>
# **getB2BAccount**
> B2BAccount getB2BAccount(accountId, responseGroups)

Get B2B Account

Retrieves the details of a B2B account specified by its unique identifier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account whose details you want to retrieve.
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    try {
      B2BAccount result = apiInstance.getB2BAccount(accountId, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getB2BAccount");
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
| **accountId** | **Integer**| Unique identifier of the B2B account whose details you want to retrieve. | |
| **responseGroups** | **String**| Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional. | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getB2BAccountAttribute"></a>
# **getB2BAccountAttribute**
> CustomerAttribute getB2BAccountAttribute(accountId, attributeFQN)

Get B2B Account Attribute

Retrieves the contents of a particular attribute attached to a specified account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the b2b account that contains the attribute to retrieve.
    String attributeFQN = "attributeFQN_example"; // String | Fully qualified name of the attribute that you want to retrieve.
    try {
      CustomerAttribute result = apiInstance.getB2BAccountAttribute(accountId, attributeFQN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getB2BAccountAttribute");
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
| **accountId** | **Integer**| Unique identifier of the b2b account that contains the attribute to retrieve. | |
| **attributeFQN** | **String**| Fully qualified name of the attribute that you want to retrieve. | |

### Return type

[**CustomerAttribute**](CustomerAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getB2BAccountAttributes"></a>
# **getB2BAccountAttributes**
> CustomerAttributeCollection getB2BAccountAttributes(accountId, startIndex, pageSize, sortBy, filter)

Get B2B Account Attributes

Retrieves a list of notes added to an account according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose notes you want to retrieve.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 20; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = ""; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = ""; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      CustomerAttributeCollection result = apiInstance.getB2BAccountAttributes(accountId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getB2BAccountAttributes");
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
| **accountId** | **Integer**| Unique identifier of the customer account whose notes you want to retrieve. | |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 20] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] [default to ] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] [default to ] |

### Return type

[**CustomerAttributeCollection**](CustomerAttributeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getB2BAccountHierarchy"></a>
# **getB2BAccountHierarchy**
> B2BAccountHierarchyResult getB2BAccountHierarchy(accountId, responseGroups)

Get B2B Account Hierarchy

Retrieves the account hierarchy for a B2B account specified by its unique identifier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account whose account hierarchy you want to retrieve. This can be any account belonging to the same hierarchy.
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    try {
      B2BAccountHierarchyResult result = apiInstance.getB2BAccountHierarchy(accountId, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getB2BAccountHierarchy");
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
| **accountId** | **Integer**| Unique identifier of the B2B account whose account hierarchy you want to retrieve. This can be any account belonging to the same hierarchy. | |
| **responseGroups** | **String**| Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional. | [optional] |

### Return type

[**B2BAccountHierarchyResult**](B2BAccountHierarchyResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getB2BAccounts"></a>
# **getB2BAccounts**
> B2BAccountCollection getB2BAccounts(startIndex, pageSize, sortBy, filter, fields, q, qLimit, responseGroups)

Get B2B Accounts

Retrieves a list of B2B accounts according to any filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.              For example, applications can filter on UserId to get the single record of the current customer.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String fields = "fields_example"; // String | 
    String q = "q_example"; // String | a quick filter which will search a predefined set of fields for a match
    Integer qLimit = 56; // Integer | 
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    try {
      B2BAccountCollection result = apiInstance.getB2BAccounts(startIndex, pageSize, sortBy, filter, fields, q, qLimit, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getB2BAccounts");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional.              For example, applications can filter on UserId to get the single record of the current customer. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **fields** | **String**|  | [optional] |
| **q** | **String**| a quick filter which will search a predefined set of fields for a match | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **responseGroups** | **String**| Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional. | [optional] |

### Return type

[**B2BAccountCollection**](B2BAccountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserRolesAsync"></a>
# **getUserRolesAsync**
> CustomerUserRoleCollection getUserRolesAsync(accountId, userId)

Get User Roles Async

Retrieves all the roles for a specified user of a b2b account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | Unique identifier of the user.
    try {
      CustomerUserRoleCollection result = apiInstance.getUserRolesAsync(accountId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getUserRolesAsync");
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
| **accountId** | **Integer**|  | |
| **userId** | **String**| Unique identifier of the user. | |

### Return type

[**CustomerUserRoleCollection**](CustomerUserRoleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUsersAsync"></a>
# **getUsersAsync**
> B2BUserCollection getUsersAsync(accountId, startIndex, pageSize, sortBy, filter, q, qLimit, responseGroups)

Get Users Async

Retrieves a list of user for a B2B account according to any filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.              For example, applications can filter on UserId to get the single record of the current customer.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | a quick filter which will search a predefined set of fields for a match
    Integer qLimit = 56; // Integer | limit on quick filter which will search a predefined set of fields for a match
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    try {
      B2BUserCollection result = apiInstance.getUsersAsync(accountId, startIndex, pageSize, sortBy, filter, q, qLimit, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getUsersAsync");
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
| **accountId** | **Integer**|  | |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional.              For example, applications can filter on UserId to get the single record of the current customer. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**| a quick filter which will search a predefined set of fields for a match | [optional] |
| **qLimit** | **Integer**| limit on quick filter which will search a predefined set of fields for a match | [optional] |
| **responseGroups** | **String**| Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional. | [optional] |

### Return type

[**B2BUserCollection**](B2BUserCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeSalesRepFromB2BAccount"></a>
# **removeSalesRepFromB2BAccount**
> B2BAccount removeSalesRepFromB2BAccount(accountId, userId)

Remove Sales Rep From B2B Account

Removes a specific sales rep from B2B account .

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    try {
      B2BAccount result = apiInstance.removeSalesRepFromB2BAccount(accountId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#removeSalesRepFromB2BAccount");
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
| **accountId** | **Integer**|  | |
| **userId** | **String**|  | |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeUser"></a>
# **removeUser**
> removeUser(accountId, userId)

Remove User

Removes a B2B user from an account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    try {
      apiInstance.removeUser(accountId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#removeUser");
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
| **accountId** | **Integer**|  | |
| **userId** | **String**|  | |

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

<a name="removeUserRoleAsync"></a>
# **removeUserRoleAsync**
> removeUserRoleAsync(accountId, userId, roleId)

Remove User Role Async

Removes a role from the specified user.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | Unique identifier of the user with the role to delete.
    Integer roleId = 56; // Integer | Unique identifer of the role to delete.
    try {
      apiInstance.removeUserRoleAsync(accountId, userId, roleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#removeUserRoleAsync");
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
| **accountId** | **Integer**|  | |
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

<a name="updateAccount"></a>
# **updateAccount**
> B2BAccount updateAccount(accountId, b2BAccount)

Update Account

Modifies an existing B2B account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account.
    B2BAccount b2BAccount = new B2BAccount(); // B2BAccount | Properties of the B2B account to update.
    try {
      B2BAccount result = apiInstance.updateAccount(accountId, b2BAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#updateAccount");
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
| **accountId** | **Integer**| Unique identifier of the B2B account. | |
| **b2BAccount** | [**B2BAccount**](B2BAccount.md)| Properties of the B2B account to update. | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateB2BAccountAttribute"></a>
# **updateB2BAccountAttribute**
> CustomerAttribute updateB2BAccountAttribute(accountId, attributeFQN, customerAttribute)

Update B2B Account Attribute

Modifies an existing attribute for a b2b account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account whose attribute you want to modify.
    String attributeFQN = "attributeFQN_example"; // String | 
    CustomerAttribute customerAttribute = new CustomerAttribute(); // CustomerAttribute | The new content to replace the existing attribute.
    try {
      CustomerAttribute result = apiInstance.updateB2BAccountAttribute(accountId, attributeFQN, customerAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#updateB2BAccountAttribute");
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
| **accountId** | **Integer**| Unique identifier of the account whose attribute you want to modify. | |
| **attributeFQN** | **String**|  | |
| **customerAttribute** | [**CustomerAttribute**](CustomerAttribute.md)| The new content to replace the existing attribute. | [optional] |

### Return type

[**CustomerAttribute**](CustomerAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateB2BAccountStatus"></a>
# **updateB2BAccountStatus**
> B2BAccount updateB2BAccountStatus(accountId, actionName)

Update B2B Account Status

Updates the status on B2B account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String actionName = "actionName_example"; // String | 
    try {
      B2BAccount result = apiInstance.updateB2BAccountStatus(accountId, actionName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#updateB2BAccountStatus");
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
| **accountId** | **Integer**|  | |
| **actionName** | **String**|  | |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateSalesRepsOnB2BAccount"></a>
# **updateSalesRepsOnB2BAccount**
> B2BAccount updateSalesRepsOnB2BAccount(accountId, requestBody)

Update Sales Reps On B2B Account

Updates list of  sales reps on a B2B account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      B2BAccount result = apiInstance.updateSalesRepsOnB2BAccount(accountId, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#updateSalesRepsOnB2BAccount");
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
| **accountId** | **Integer**|  | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateUser"></a>
# **updateUser**
> B2BUser updateUser(accountId, userId, b2BUser)

Update User

Updates a B2B user specified by user Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    B2BUser b2BUser = new B2BUser(); // B2BUser | 
    try {
      B2BUser result = apiInstance.updateUser(accountId, userId, b2BUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#updateUser");
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
| **accountId** | **Integer**|  | |
| **userId** | **String**|  | |
| **b2BUser** | [**B2BUser**](B2BUser.md)|  | [optional] |

### Return type

[**B2BUser**](B2BUser.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="upgradeAccountsToB2B"></a>
# **upgradeAccountsToB2B**
> UpgradeToB2BAccountResponse upgradeAccountsToB2B(requestBody)

Upgrade B2C Accounts To B2B

Upgrades bulk B2C accounts to B2B

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.B2BAccountApi;

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    List<Integer> requestBody = Arrays.asList(); // List<Integer> | List of accountIds(integers)
    try {
      UpgradeToB2BAccountResponse result = apiInstance.upgradeAccountsToB2B(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#upgradeAccountsToB2B");
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
| **requestBody** | [**List&lt;Integer&gt;**](Integer.md)| List of accountIds(integers) | [optional] |

### Return type

[**UpgradeToB2BAccountResponse**](UpgradeToB2BAccountResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

