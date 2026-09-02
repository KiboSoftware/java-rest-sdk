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
| [**applyRoleToFutureChildrensAsync**](B2BAccountApi.md#applyRoleToFutureChildrensAsync) | **PUT** /commerce/customer/b2baccounts/roles/{roleId}/accounts/{accountId}/apply-to-future-children/{enabled} | Enable or disable role inheritance for future child accounts. |
| [**assignRoleToAccountAsync**](B2BAccountApi.md#assignRoleToAccountAsync) | **PUT** /commerce/customer/b2baccounts/roles/{roleId}/accounts/{accountId} | Assign a role to a specific account |
| [**changeParentAccount**](B2BAccountApi.md#changeParentAccount) | **POST** /commerce/customer/b2baccounts/{accountId}/changeparent/{parentAccountId} | Change Parent Account |
| [**createRoleAsync**](B2BAccountApi.md#createRoleAsync) | **POST** /commerce/customer/b2baccounts/roles | Create a new role and associate it with specified accounts. |
| [**deleteB2BAccountAttribute**](B2BAccountApi.md#deleteB2BAccountAttribute) | **DELETE** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Delete B2B Account Attribute |
| [**deleteB2BAccountPriorities**](B2BAccountApi.md#deleteB2BAccountPriorities) | **PUT** /commerce/customer/b2baccounts/priority/delete | Delete Account Priorities |
| [**deleteRoleAsync**](B2BAccountApi.md#deleteRoleAsync) | **DELETE** /commerce/customer/b2baccounts/roles/{roleId} | Delete role and all its account associations. |
| [**getAccountsByUser**](B2BAccountApi.md#getAccountsByUser) | **GET** /commerce/customer/b2baccounts/accountsbyuser | Get Accounts by User |
| [**getAccountsForSalesRep**](B2BAccountApi.md#getAccountsForSalesRep) | **GET** /commerce/customer/b2baccounts/salesrep/{userId} | Get Accounts For Sales Rep |
| [**getB2BAccount**](B2BAccountApi.md#getB2BAccount) | **GET** /commerce/customer/b2baccounts/{accountId} | Get B2B Account |
| [**getB2BAccountAttribute**](B2BAccountApi.md#getB2BAccountAttribute) | **GET** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Get B2B Account Attribute |
| [**getB2BAccountAttributes**](B2BAccountApi.md#getB2BAccountAttributes) | **GET** /commerce/customer/b2baccounts/{accountId}/attributes | Get B2B Account Attributes |
| [**getB2BAccountHierarchy**](B2BAccountApi.md#getB2BAccountHierarchy) | **GET** /commerce/customer/b2baccounts/{accountId}/hierarchy | Get B2B Account Hierarchy |
| [**getB2BAccountPriorities**](B2BAccountApi.md#getB2BAccountPriorities) | **GET** /commerce/customer/b2baccounts/priority/read | Get Account Priorities |
| [**getB2BAccounts**](B2BAccountApi.md#getB2BAccounts) | **GET** /commerce/customer/b2baccounts | Get B2B Accounts |
| [**getBehaviorCategories**](B2BAccountApi.md#getBehaviorCategories) | **GET** /commerce/customer/b2baccounts/behaviors/categories | Gets all the behavior categories for the b2b shopper |
| [**getBehaviors**](B2BAccountApi.md#getBehaviors) | **GET** /commerce/customer/b2baccounts/behaviors | Get Behaviors for b2b shopper |
| [**getRoleByRoleIdAsync**](B2BAccountApi.md#getRoleByRoleIdAsync) | **GET** /commerce/customer/b2baccounts/roles/{roleId} | Get role details by role ID, including associated account IDs |
| [**getRolesByAccountIdAsync**](B2BAccountApi.md#getRolesByAccountIdAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/roles | Get all roles available to the specified account |
| [**getUserBehaviors**](B2BAccountApi.md#getUserBehaviors) | **GET** /commerce/customer/b2baccounts/{accountId}/user/{userId}/behaviors | Get User Behaviors |
| [**getUserRolesAsync**](B2BAccountApi.md#getUserRolesAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles | Get User Roles Async |
| [**getUsersAsync**](B2BAccountApi.md#getUsersAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/users | Get Users Async |
| [**getUsersByRoleAsync**](B2BAccountApi.md#getUsersByRoleAsync) | **GET** /commerce/customer/b2baccounts/{accountId}/roles/{roleId}/users | Get Users By Role |
| [**removeRoleFromAccountAsync**](B2BAccountApi.md#removeRoleFromAccountAsync) | **DELETE** /commerce/customer/b2baccounts/roles/{roleId}/accounts/{accountId} | Remove a role from a specific account. |
| [**removeSalesRepFromB2BAccount**](B2BAccountApi.md#removeSalesRepFromB2BAccount) | **DELETE** /commerce/customer/b2baccounts/{accountId}/salesrep/{userId} | Remove Sales Rep From B2B Account |
| [**removeUser**](B2BAccountApi.md#removeUser) | **PUT** /commerce/customer/b2baccounts/{accountId}/user/{userId}/remove | Remove User |
| [**removeUserRoleAsync**](B2BAccountApi.md#removeUserRoleAsync) | **DELETE** /commerce/customer/b2baccounts/{accountId}/user/{userId}/roles/{roleId} | Remove User Role Async |
| [**updateAccount**](B2BAccountApi.md#updateAccount) | **PUT** /commerce/customer/b2baccounts/{accountId} | Update Account |
| [**updateB2BAccountAttribute**](B2BAccountApi.md#updateB2BAccountAttribute) | **PUT** /commerce/customer/b2baccounts/{accountId}/attributes/{attributeFQN} | Update B2B Account Attribute |
| [**updateB2BAccountPriorities**](B2BAccountApi.md#updateB2BAccountPriorities) | **PUT** /commerce/customer/b2baccounts/priority/update | Update Account Priorities |
| [**updateB2BAccountStatus**](B2BAccountApi.md#updateB2BAccountStatus) | **PUT** /commerce/customer/b2baccounts/{accountId}/status/{actionName} | Update B2B Account Status |
| [**updateRoleAsync**](B2BAccountApi.md#updateRoleAsync) | **PUT** /commerce/customer/b2baccounts/roles/{roleId} | Update existing role and its account associations. |
| [**updateSalesRepsOnB2BAccount**](B2BAccountApi.md#updateSalesRepsOnB2BAccount) | **PUT** /commerce/customer/b2baccounts/{accountId}/salesrep | Update Sales Reps On B2B Account |
| [**updateUser**](B2BAccountApi.md#updateUser) | **PUT** /commerce/customer/b2baccounts/{accountId}/user/{userId} | Update User |
| [**upgradeAccountsToB2B**](B2BAccountApi.md#upgradeAccountsToB2B) | **PUT** /commerce/customer/b2baccounts/upgradeaccounts | Upgrade B2C Accounts To B2B |


<a name="addAccount"></a>
# **addAccount**
> B2BAccount addAccount(responseFields, b2BAccount)

Add Account

Creates a new B2B account in the Pending Approval state. This account will not yet be active, as it requires a sales representative to be assigned (with .../b2baccounts/{accountId}/salesrep/{userId}) before it is approved (with .../b2baccounts/{accountId}/status/{actionName}).

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    B2BAccount b2BAccount = new B2BAccount(); // B2BAccount | Properties of the new B2B account to create.
    try {
      B2BAccount result = apiInstance.addAccount(responseFields, b2BAccount);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **b2BAccount** | [**B2BAccount**](B2BAccount.md)| Properties of the new B2B account to create. | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addB2BAccountAttribute"></a>
# **addB2BAccountAttribute**
> CustomerAttribute addB2BAccountAttribute(accountId, responseFields, customerAttribute)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerAttribute customerAttribute = new CustomerAttribute(); // CustomerAttribute | 
    try {
      CustomerAttribute result = apiInstance.addB2BAccountAttribute(accountId, responseFields, customerAttribute);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **customerAttribute** | [**CustomerAttribute**](CustomerAttribute.md)|  | [optional] |

### Return type

[**CustomerAttribute**](CustomerAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addSalesRepToB2BAccount"></a>
# **addSalesRepToB2BAccount**
> B2BAccount addSalesRepToB2BAccount(accountId, userId, responseFields)

Add Sales Rep To B2B Account

Adds a sales rep to a B2B account.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BAccount result = apiInstance.addSalesRepToB2BAccount(accountId, userId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addSalesRepsToB2BAccount"></a>
# **addSalesRepsToB2BAccount**
> B2BAccount addSalesRepsToB2BAccount(accountId, responseFields, requestBody)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      B2BAccount result = apiInstance.addSalesRepsToB2BAccount(accountId, responseFields, requestBody);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addUser"></a>
# **addUser**
> B2BUser addUser(accountId, responseFields, b2BUserAndAuthInfo)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    B2BUserAndAuthInfo b2BUserAndAuthInfo = new B2BUserAndAuthInfo(); // B2BUserAndAuthInfo | 
    try {
      B2BUser result = apiInstance.addUser(accountId, responseFields, b2BUserAndAuthInfo);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **b2BUserAndAuthInfo** | [**B2BUserAndAuthInfo**](B2BUserAndAuthInfo.md)|  | [optional] |

### Return type

[**B2BUser**](B2BUser.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addUserRoleAsync"></a>
# **addUserRoleAsync**
> addUserRoleAsync(accountId, userId, roleId, responseFields)

Add User Role Async

Add a role to B2B user. These roles include Admin, Purchaser, and Non-Purchaser.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | Unique identifier of the user who receives the role.
    Integer roleId = 56; // Integer | Unique identifier of the role to add.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.addUserRoleAsync(accountId, userId, roleId, responseFields);
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

<a name="applyRoleToFutureChildrensAsync"></a>
# **applyRoleToFutureChildrensAsync**
> applyRoleToFutureChildrensAsync(roleId, accountId, enabled, responseFields)

Enable or disable role inheritance for future child accounts.

This setting only affects future account creation and does not modify existing child accounts. The inheritance applies to all levels of the hierarchy (children, grandchildren, etc.). When enabled, the system will automatically assign this role to all future child accounts  and grandchildren created under the specified account in the hierarchy.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer roleId = 56; // Integer | Role ID
    Integer accountId = 56; // Integer | Account ID
    Boolean enabled = true; // Boolean | True to apply role to future children, false to disable
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.applyRoleToFutureChildrensAsync(roleId, accountId, enabled, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#applyRoleToFutureChildrensAsync");
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
| **roleId** | **Integer**| Role ID | |
| **accountId** | **Integer**| Account ID | |
| **enabled** | **Boolean**| True to apply role to future children, false to disable | |
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

<a name="assignRoleToAccountAsync"></a>
# **assignRoleToAccountAsync**
> assignRoleToAccountAsync(roleId, accountId, responseFields)

Assign a role to a specific account

Assign a role to a specific account.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer roleId = 56; // Integer | Role ID
    Integer accountId = 56; // Integer | Account ID
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.assignRoleToAccountAsync(roleId, accountId, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#assignRoleToAccountAsync");
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
| **roleId** | **Integer**| Role ID | |
| **accountId** | **Integer**| Account ID | |
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

<a name="changeParentAccount"></a>
# **changeParentAccount**
> B2BAccount changeParentAccount(accountId, parentAccountId, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account.
    Integer parentAccountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BAccount result = apiInstance.changeParentAccount(accountId, parentAccountId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createRoleAsync"></a>
# **createRoleAsync**
> B2BRole createRoleAsync(responseFields, b2BRole)

Create a new role and associate it with specified accounts.

Required fields: - Name: Role name (must be unique within tenant) - Behaviors: List of behavior IDs (at least one required) - AccountIds: List of account IDs to associate with role (at least one required)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    B2BRole b2BRole = new B2BRole(); // B2BRole | Role payload containing name, behaviors, and accountIds
    try {
      B2BRole result = apiInstance.createRoleAsync(responseFields, b2BRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#createRoleAsync");
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
| **b2BRole** | [**B2BRole**](B2BRole.md)| Role payload containing name, behaviors, and accountIds | [optional] |

### Return type

[**B2BRole**](B2BRole.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteB2BAccountPriorities"></a>
# **deleteB2BAccountPriorities**
> deleteB2BAccountPriorities(responseFields, requestBody)

Delete Account Priorities

Deletes the priorities of specified B2B accounts

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<Integer> requestBody = Arrays.asList(); // List<Integer> | The IDs of the accounts whose priorities are to be deleted.
    try {
      apiInstance.deleteB2BAccountPriorities(responseFields, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#deleteB2BAccountPriorities");
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
| **requestBody** | [**List&lt;Integer&gt;**](Integer.md)| The IDs of the accounts whose priorities are to be deleted. | [optional] |

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

<a name="deleteRoleAsync"></a>
# **deleteRoleAsync**
> deleteRoleAsync(roleId)

Delete role and all its account associations.

This operation will fail if any users are currently assigned to this role in any of the associated accounts.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer roleId = 56; // Integer | Role ID
    try {
      apiInstance.deleteRoleAsync(roleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#deleteRoleAsync");
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
| **roleId** | **Integer**| Role ID | |

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

<a name="getAccountsByUser"></a>
# **getAccountsByUser**
> List&lt;Integer&gt; getAccountsByUser(emailAddress, userName, getAllAccounts, responseFields)

Get Accounts by User

Retrieves account IDs of all active accounts that a user belongs to by username or email. If emailAddress and userName are both provided, the email address will be used. When getAllAccounts is set to true, all accounts will be returned regardless of the AccountStatus.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    String userName = "userName_example"; // String | 
    Boolean getAllAccounts = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<Integer> result = apiInstance.getAccountsByUser(emailAddress, userName, getAllAccounts, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getAccountsByUser");
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
| **userName** | **String**|  | [optional] |
| **getAllAccounts** | **Boolean**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**List&lt;Integer&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAccountsForSalesRep"></a>
# **getAccountsForSalesRep**
> List&lt;Integer&gt; getAccountsForSalesRep(userId, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String userId = "userId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<Integer> result = apiInstance.getAccountsForSalesRep(userId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**List&lt;Integer&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getB2BAccount"></a>
# **getB2BAccount**
> B2BAccount getB2BAccount(accountId, responseGroups, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account whose details you want to retrieve.
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BAccount result = apiInstance.getB2BAccount(accountId, responseGroups, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getB2BAccountAttribute"></a>
# **getB2BAccountAttribute**
> CustomerAttribute getB2BAccountAttribute(accountId, attributeFQN, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the b2b account that contains the attribute to retrieve.
    String attributeFQN = "attributeFQN_example"; // String | Fully qualified name of the attribute that you want to retrieve.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerAttribute result = apiInstance.getB2BAccountAttribute(accountId, attributeFQN, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerAttribute**](CustomerAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getB2BAccountAttributes"></a>
# **getB2BAccountAttributes**
> CustomerAttributeCollection getB2BAccountAttributes(accountId, startIndex, pageSize, sortBy, filter, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose notes you want to retrieve.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 20; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = ""; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = ""; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerAttributeCollection result = apiInstance.getB2BAccountAttributes(accountId, startIndex, pageSize, sortBy, filter, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerAttributeCollection**](CustomerAttributeCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getB2BAccountHierarchy"></a>
# **getB2BAccountHierarchy**
> B2BAccountHierarchyResult getB2BAccountHierarchy(accountId, responseGroups, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account whose account hierarchy you want to retrieve. This can be any account belonging to the same hierarchy.
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BAccountHierarchyResult result = apiInstance.getB2BAccountHierarchy(accountId, responseGroups, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BAccountHierarchyResult**](B2BAccountHierarchyResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getB2BAccountPriorities"></a>
# **getB2BAccountPriorities**
> AccountPriorityModel getB2BAccountPriorities(responseFields)

Get Account Priorities

Retrieves the priorities of B2B accounts

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AccountPriorityModel result = apiInstance.getB2BAccountPriorities(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getB2BAccountPriorities");
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

[**AccountPriorityModel**](AccountPriorityModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getB2BAccounts"></a>
# **getB2BAccounts**
> B2BAccountCollection getB2BAccounts(startIndex, pageSize, sortBy, filter, fields, q, qLimit, responseGroups, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.             For example, applications can filter on UserId to get the single record of the current customer.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String fields = "fields_example"; // String | 
    String q = "q_example"; // String | a quick filter which will search a predefined set of fields for a match
    Integer qLimit = 56; // Integer | 
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BAccountCollection result = apiInstance.getB2BAccounts(startIndex, pageSize, sortBy, filter, fields, q, qLimit, responseGroups, responseFields);
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional.             For example, applications can filter on UserId to get the single record of the current customer. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **fields** | **String**|  | [optional] |
| **q** | **String**| a quick filter which will search a predefined set of fields for a match | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **responseGroups** | **String**| Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BAccountCollection**](B2BAccountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBehaviorCategories"></a>
# **getBehaviorCategories**
> BehaviorCategoryCollection getBehaviorCategories(responseFields)

Gets all the behavior categories for the b2b shopper

Gets all the behavior categories for the b2b shopper

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BehaviorCategoryCollection result = apiInstance.getBehaviorCategories(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getBehaviorCategories");
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

[**BehaviorCategoryCollection**](BehaviorCategoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBehaviors"></a>
# **getBehaviors**
> BehaviorCollection getBehaviors(responseFields)

Get Behaviors for b2b shopper

Get Behaviors for b2b shopper

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BehaviorCollection result = apiInstance.getBehaviors(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getBehaviors");
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

[**BehaviorCollection**](BehaviorCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRoleByRoleIdAsync"></a>
# **getRoleByRoleIdAsync**
> B2BRole getRoleByRoleIdAsync(roleId, responseFields)

Get role details by role ID, including associated account IDs

Get role details by role ID, including associated account IDs.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer roleId = 56; // Integer | Role ID
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BRole result = apiInstance.getRoleByRoleIdAsync(roleId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getRoleByRoleIdAsync");
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
| **roleId** | **Integer**| Role ID | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BRole**](B2BRole.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getRolesByAccountIdAsync"></a>
# **getRolesByAccountIdAsync**
> B2BRoleCollection getRolesByAccountIdAsync(accountId, responseFields)

Get all roles available to the specified account

Get all roles available to the specified account.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | B2B account ID
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BRoleCollection result = apiInstance.getRolesByAccountIdAsync(accountId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getRolesByAccountIdAsync");
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
| **accountId** | **Integer**| B2B account ID | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BRoleCollection**](B2BRoleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserBehaviors"></a>
# **getUserBehaviors**
> List&lt;Integer&gt; getUserBehaviors(accountId, userId, responseFields)

Get User Behaviors

Gets shopper behaviors of the B2B user.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<Integer> result = apiInstance.getUserBehaviors(accountId, userId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getUserBehaviors");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**List&lt;Integer&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserRolesAsync"></a>
# **getUserRolesAsync**
> CustomerUserRoleCollection getUserRolesAsync(accountId, userId, responseFields)

Get User Roles Async

Retrieves all the roles for a specified user of a b2b account. These roles may include Admin, Purchaser, and Non-Purchaser.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | Unique identifier of the user.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerUserRoleCollection result = apiInstance.getUserRolesAsync(accountId, userId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CustomerUserRoleCollection**](CustomerUserRoleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUsersAsync"></a>
# **getUsersAsync**
> B2BUserCollection getUsersAsync(accountId, startIndex, pageSize, sortBy, filter, q, qLimit, responseGroups, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.             For example, applications can filter on UserId to get the single record of the current customer.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | a quick filter which will search a predefined set of fields for a match
    Integer qLimit = 56; // Integer | limit on quick filter which will search a predefined set of fields for a match
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BUserCollection result = apiInstance.getUsersAsync(accountId, startIndex, pageSize, sortBy, filter, q, qLimit, responseGroups, responseFields);
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional.             For example, applications can filter on UserId to get the single record of the current customer. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**| a quick filter which will search a predefined set of fields for a match | [optional] |
| **qLimit** | **Integer**| limit on quick filter which will search a predefined set of fields for a match | [optional] |
| **responseGroups** | **String**| Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BUserCollection**](B2BUserCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUsersByRoleAsync"></a>
# **getUsersByRoleAsync**
> List&lt;B2BUser&gt; getUsersByRoleAsync(accountId, roleId, responseFields)

Get Users By Role

Retrieves a list of users who have a specific role in a B2B account.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | The B2B account identifier
    Integer roleId = 56; // Integer | The role identifier
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<B2BUser> result = apiInstance.getUsersByRoleAsync(accountId, roleId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#getUsersByRoleAsync");
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
| **accountId** | **Integer**| The B2B account identifier | |
| **roleId** | **Integer**| The role identifier | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;B2BUser&gt;**](B2BUser.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeRoleFromAccountAsync"></a>
# **removeRoleFromAccountAsync**
> removeRoleFromAccountAsync(roleId, accountId)

Remove a role from a specific account.

This operation will fail if any users in the account are currently  assigned to this role.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer roleId = 56; // Integer | Role ID
    Integer accountId = 56; // Integer | Account ID
    try {
      apiInstance.removeRoleFromAccountAsync(roleId, accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#removeRoleFromAccountAsync");
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
| **roleId** | **Integer**| Role ID | |
| **accountId** | **Integer**| Account ID | |

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeUser"></a>
# **removeUser**
> removeUser(accountId, userId, responseFields)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.removeUser(accountId, userId, responseFields);
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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateAccount"></a>
# **updateAccount**
> B2BAccount updateAccount(accountId, responseFields, b2BAccount)

Update Account

Modifies an existing B2B account. If you want to update the users on an account, call the user-specific endpoints (such as &lt;a href&#x3D;\&quot;/api-reference/b2baccount/add-user\&quot;&gt;Add User&lt;/a&gt; and &lt;a href&#x3D;\&quot;api-reference/b2baccount/remove-user\&quot;&gt;Remove User&lt;/a&gt;) instead.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the B2B account.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    B2BAccount b2BAccount = new B2BAccount(); // B2BAccount | Properties of the B2B account to update.
    try {
      B2BAccount result = apiInstance.updateAccount(accountId, responseFields, b2BAccount);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **b2BAccount** | [**B2BAccount**](B2BAccount.md)| Properties of the B2B account to update. | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateB2BAccountAttribute"></a>
# **updateB2BAccountAttribute**
> CustomerAttribute updateB2BAccountAttribute(accountId, attributeFQN, responseFields, customerAttribute)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account whose attribute you want to modify.
    String attributeFQN = "attributeFQN_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerAttribute customerAttribute = new CustomerAttribute(); // CustomerAttribute | The new content to replace the existing attribute.
    try {
      CustomerAttribute result = apiInstance.updateB2BAccountAttribute(accountId, attributeFQN, responseFields, customerAttribute);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **customerAttribute** | [**CustomerAttribute**](CustomerAttribute.md)| The new content to replace the existing attribute. | [optional] |

### Return type

[**CustomerAttribute**](CustomerAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateB2BAccountPriorities"></a>
# **updateB2BAccountPriorities**
> AccountPriorityModel updateB2BAccountPriorities(responseFields, accountPriorityModel)

Update Account Priorities

Updates the priorities of B2B accounts. The Priority for blacklisted accounts will be set as -1.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AccountPriorityModel accountPriorityModel = new AccountPriorityModel(); // AccountPriorityModel | The account priorities to update.
    try {
      AccountPriorityModel result = apiInstance.updateB2BAccountPriorities(responseFields, accountPriorityModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#updateB2BAccountPriorities");
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
| **accountPriorityModel** | [**AccountPriorityModel**](AccountPriorityModel.md)| The account priorities to update. | [optional] |

### Return type

[**AccountPriorityModel**](AccountPriorityModel.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateB2BAccountStatus"></a>
# **updateB2BAccountStatus**
> B2BAccount updateB2BAccountStatus(accountId, actionName, responseFields)

Update B2B Account Status

Updates the status on B2B account by transitioning it between states with the approve, deny, enable, and disable actions. An account that has been newly requested will be in the Pending Approval state and can be approved or denied. An account that has been previously approved can be disabled to deactivate it, while a disabled or denied account can be reinstated by enabling or approving it.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String actionName = "actionName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      B2BAccount result = apiInstance.updateB2BAccountStatus(accountId, actionName, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateRoleAsync"></a>
# **updateRoleAsync**
> B2BRole updateRoleAsync(roleId, responseFields, b2BRole)

Update existing role and its account associations.

Required fields: - Name: Role name (must be unique within tenant) - Behaviors: List of behavior IDs (at least one required) - AccountIds: List of account IDs to associate with role (at least one required)  Note: This performs a complete replacement of account associations.

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer roleId = 56; // Integer | Role ID
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    B2BRole b2BRole = new B2BRole(); // B2BRole | Role payload containing name, behaviors, and accountIds
    try {
      B2BRole result = apiInstance.updateRoleAsync(roleId, responseFields, b2BRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling B2BAccountApi#updateRoleAsync");
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
| **roleId** | **Integer**| Role ID | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **b2BRole** | [**B2BRole**](B2BRole.md)| Role payload containing name, behaviors, and accountIds | [optional] |

### Return type

[**B2BRole**](B2BRole.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSalesRepsOnB2BAccount"></a>
# **updateSalesRepsOnB2BAccount**
> B2BAccount updateSalesRepsOnB2BAccount(accountId, responseFields, requestBody)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      B2BAccount result = apiInstance.updateSalesRepsOnB2BAccount(accountId, responseFields, requestBody);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**B2BAccount**](B2BAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateUser"></a>
# **updateUser**
> B2BUser updateUser(accountId, userId, responseFields, b2BUser)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    B2BUser b2BUser = new B2BUser(); // B2BUser | 
    try {
      B2BUser result = apiInstance.updateUser(accountId, userId, responseFields, b2BUser);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **b2BUser** | [**B2BUser**](B2BUser.md)|  | [optional] |

### Return type

[**B2BUser**](B2BUser.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="upgradeAccountsToB2B"></a>
# **upgradeAccountsToB2B**
> UpgradeToB2BAccountResponse upgradeAccountsToB2B(responseFields, requestBody)

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

    B2BAccountApi apiInstance = new B2BAccountApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<Integer> requestBody = Arrays.asList(); // List<Integer> | List of accountIds(integers)
    try {
      UpgradeToB2BAccountResponse result = apiInstance.upgradeAccountsToB2B(responseFields, requestBody);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;Integer&gt;**](Integer.md)| List of accountIds(integers) | [optional] |

### Return type

[**UpgradeToB2BAccountResponse**](UpgradeToB2BAccountResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

