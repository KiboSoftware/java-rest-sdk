# CustomerAccountApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAccount**](CustomerAccountApi.md#addAccount) | **POST** /commerce/customer/accounts | Add Account |
| [**addAccountAndLogin**](CustomerAccountApi.md#addAccountAndLogin) | **POST** /commerce/customer/accounts/Add-Account-And-Login | Add Account And Login |
| [**addAccountAttribute**](CustomerAccountApi.md#addAccountAttribute) | **POST** /commerce/customer/accounts/{accountId}/attributes | Add Account Attribute |
| [**addAccountCard**](CustomerAccountApi.md#addAccountCard) | **POST** /commerce/customer/accounts/{accountId}/cards | Add Account Card |
| [**addAccountContact**](CustomerAccountApi.md#addAccountContact) | **POST** /commerce/customer/accounts/{accountId}/contacts | Add Account Contact |
| [**addAccountContactList**](CustomerAccountApi.md#addAccountContactList) | **PUT** /commerce/customer/accounts/{accountId}/contacts | Add Account Contact List |
| [**addAccountNote**](CustomerAccountApi.md#addAccountNote) | **POST** /commerce/customer/accounts/{accountId}/notes | Add Account Note |
| [**addAccounts**](CustomerAccountApi.md#addAccounts) | **POST** /commerce/customer/accounts/Bulk | Add Accounts |
| [**addLoginToExistingCustomer**](CustomerAccountApi.md#addLoginToExistingCustomer) | **POST** /commerce/customer/accounts/{accountId}/Create-Login | Add Login To Existing Customer |
| [**addTransaction**](CustomerAccountApi.md#addTransaction) | **POST** /commerce/customer/accounts/{accountId}/transactions | Add Transaction |
| [**changePassword**](CustomerAccountApi.md#changePassword) | **POST** /commerce/customer/accounts/{accountId}/Change-Password | Change Password |
| [**changePasswords**](CustomerAccountApi.md#changePasswords) | **POST** /commerce/customer/accounts/Change-Passwords | Change Passwords |
| [**createCustomerPurchaseOrderAccount**](CustomerAccountApi.md#createCustomerPurchaseOrderAccount) | **POST** /commerce/customer/accounts/{accountId}/purchaseOrderAccount | Create Customer Purchase Order Account |
| [**createPurchaseOrderTransaction**](CustomerAccountApi.md#createPurchaseOrderTransaction) | **POST** /commerce/customer/accounts/{accountId}/PurchaseOrderTransaction | Create Purchase Order Transaction |
| [**deleteAccount**](CustomerAccountApi.md#deleteAccount) | **DELETE** /commerce/customer/accounts/{accountId} | Delete Account |
| [**deleteAccountAttribute**](CustomerAccountApi.md#deleteAccountAttribute) | **DELETE** /commerce/customer/accounts/{accountId}/attributes/{attributeFQN} | Delete Account Attribute |
| [**deleteAccountCard**](CustomerAccountApi.md#deleteAccountCard) | **DELETE** /commerce/customer/accounts/{accountId}/cards/{cardId} | Delete Account Card |
| [**deleteAccountContact**](CustomerAccountApi.md#deleteAccountContact) | **DELETE** /commerce/customer/accounts/{accountId}/contacts/{contactId} | Delete Account Contact |
| [**deleteAccountNote**](CustomerAccountApi.md#deleteAccountNote) | **DELETE** /commerce/customer/accounts/{accountId}/notes/{noteId} | Delete Account Note |
| [**getAccount**](CustomerAccountApi.md#getAccount) | **GET** /commerce/customer/accounts/{accountId} | Get Account |
| [**getAccountAttribute**](CustomerAccountApi.md#getAccountAttribute) | **GET** /commerce/customer/accounts/{accountId}/attributes/{attributeFQN} | Get Account Attribute |
| [**getAccountAttributes**](CustomerAccountApi.md#getAccountAttributes) | **GET** /commerce/customer/accounts/{accountId}/attributes | Get Account Attributes |
| [**getAccountAuditLog**](CustomerAccountApi.md#getAccountAuditLog) | **GET** /commerce/customer/accounts/{accountId}/AuditLog/Entries | Get Account Audit Log |
| [**getAccountCard**](CustomerAccountApi.md#getAccountCard) | **GET** /commerce/customer/accounts/{accountId}/cards/{cardId} | Get Account Card |
| [**getAccountCards**](CustomerAccountApi.md#getAccountCards) | **GET** /commerce/customer/accounts/{accountId}/cards | Get Account Cards |
| [**getAccountContact**](CustomerAccountApi.md#getAccountContact) | **GET** /commerce/customer/accounts/{accountId}/contacts/{contactId} | Get Account Contact |
| [**getAccountContacts**](CustomerAccountApi.md#getAccountContacts) | **GET** /commerce/customer/accounts/{accountId}/contacts | Get Account Contacts |
| [**getAccountNote**](CustomerAccountApi.md#getAccountNote) | **GET** /commerce/customer/accounts/{accountId}/notes/{noteId} | Get Account Note |
| [**getAccountNotes**](CustomerAccountApi.md#getAccountNotes) | **GET** /commerce/customer/accounts/{accountId}/notes | Get Account Notes |
| [**getAccountSegments**](CustomerAccountApi.md#getAccountSegments) | **GET** /commerce/customer/accounts/{accountId}/segments | Get Account Segments |
| [**getAccounts**](CustomerAccountApi.md#getAccounts) | **GET** /commerce/customer/accounts | Get Accounts |
| [**getCurrentAccount**](CustomerAccountApi.md#getCurrentAccount) | **GET** /commerce/customer/accounts/current | Retrieves the details of a the current logged in customer account |
| [**getCustomerPurchaseOrderAccount**](CustomerAccountApi.md#getCustomerPurchaseOrderAccount) | **GET** /commerce/customer/accounts/{accountId}/purchaseOrderAccount | Gets a customer&#39;s purchase order account. |
| [**getCustomerPurchaseOrderTransactions**](CustomerAccountApi.md#getCustomerPurchaseOrderTransactions) | **GET** /commerce/customer/accounts/{accountId}/PurchaseOrderTransaction | Get Customer Purchase Order Transactions |
| [**getCustomersPurchaseOrderAccounts**](CustomerAccountApi.md#getCustomersPurchaseOrderAccounts) | **POST** /commerce/customer/accounts/purchaseOrderAccounts | Get Customers Purchase Order Accounts |
| [**getLoginState**](CustomerAccountApi.md#getLoginState) | **GET** /commerce/customer/accounts/{accountId}/loginstate | Get Login State |
| [**getLoginStateByEmailAddress**](CustomerAccountApi.md#getLoginStateByEmailAddress) | **POST** /commerce/customer/accounts/loginstatebyemailaddress | Get Login State By Email Address |
| [**getLoginStateByUserName**](CustomerAccountApi.md#getLoginStateByUserName) | **POST** /commerce/customer/accounts/loginstatebyusername | Get Login State By UserName |
| [**getTransactions**](CustomerAccountApi.md#getTransactions) | **GET** /commerce/customer/accounts/{accountId}/transactions | Get Transactions |
| [**recomputeCustomerLifetimeValue**](CustomerAccountApi.md#recomputeCustomerLifetimeValue) | **POST** /commerce/customer/accounts/{accountId}/recomputelifetimevalue | Recompute Customer Lifetime Value |
| [**removeTransaction**](CustomerAccountApi.md#removeTransaction) | **DELETE** /commerce/customer/accounts/{accountId}/transactions/{transactionId} | Remove Transaction |
| [**resetPassword**](CustomerAccountApi.md#resetPassword) | **POST** /commerce/customer/accounts/Reset-Password | Reset Password |
| [**setLoginLocked**](CustomerAccountApi.md#setLoginLocked) | **POST** /commerce/customer/accounts/{accountId}/Set-Login-Locked | Set Login Locked |
| [**setPasswordChangeRequired**](CustomerAccountApi.md#setPasswordChangeRequired) | **POST** /commerce/customer/accounts/{accountId}/Set-Password-Change-Required | Set Password Change Required |
| [**updateAccount**](CustomerAccountApi.md#updateAccount) | **PUT** /commerce/customer/accounts/{accountId} | Update Account |
| [**updateAccountAttribute**](CustomerAccountApi.md#updateAccountAttribute) | **PUT** /commerce/customer/accounts/{accountId}/attributes/{attributeFQN} | Update Account Attribute |
| [**updateAccountCard**](CustomerAccountApi.md#updateAccountCard) | **PUT** /commerce/customer/accounts/{accountId}/cards/{cardId} | Update Account Card |
| [**updateAccountContact**](CustomerAccountApi.md#updateAccountContact) | **PUT** /commerce/customer/accounts/{accountId}/contacts/{contactId} | Update Account Contact |
| [**updateAccountNote**](CustomerAccountApi.md#updateAccountNote) | **PUT** /commerce/customer/accounts/{accountId}/notes/{noteId} | Update Account Note |
| [**updateCustomerPurchaseOrderAccount**](CustomerAccountApi.md#updateCustomerPurchaseOrderAccount) | **PUT** /commerce/customer/accounts/{accountId}/purchaseOrderAccount | Update Customer Purchase Order Account |
| [**updateForgottenPassword**](CustomerAccountApi.md#updateForgottenPassword) | **POST** /commerce/customer/accounts/Update-Forgotten-Password | Update Forgotten Password |


<a name="addAccount"></a>
# **addAccount**
> CustomerAccount addAccount(customerAccount)

Add Account

Creates a new customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    CustomerAccount customerAccount = new CustomerAccount(); // CustomerAccount | Properties of the new customer account to create.
    try {
      CustomerAccount result = apiInstance.addAccount(customerAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccount");
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
| **customerAccount** | [**CustomerAccount**](CustomerAccount.md)| Properties of the new customer account to create. | [optional] |

### Return type

[**CustomerAccount**](CustomerAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAccountAndLogin"></a>
# **addAccountAndLogin**
> CustomerAuthTicket addAccountAndLogin(customerAccountAndAuthInfo)

Add Account And Login

Adds a customer to the account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    CustomerAccountAndAuthInfo customerAccountAndAuthInfo = new CustomerAccountAndAuthInfo(); // CustomerAccountAndAuthInfo | 
    try {
      CustomerAuthTicket result = apiInstance.addAccountAndLogin(customerAccountAndAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccountAndLogin");
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
| **customerAccountAndAuthInfo** | [**CustomerAccountAndAuthInfo**](CustomerAccountAndAuthInfo.md)|  | [optional] |

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

<a name="addAccountAttribute"></a>
# **addAccountAttribute**
> CustomerAttribute addAccountAttribute(accountId, userId, customerAttribute)

Add Account Attribute

Adds a new account attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | 
    CustomerAttribute customerAttribute = new CustomerAttribute(); // CustomerAttribute | 
    try {
      CustomerAttribute result = apiInstance.addAccountAttribute(accountId, userId, customerAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccountAttribute");
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
| **userId** | **String**|  | [optional] |
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

<a name="addAccountCard"></a>
# **addAccountCard**
> Card addAccountCard(accountId, card)

Add Account Card

Creates a card on the specific customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    Card card = new Card(); // Card | 
    try {
      Card result = apiInstance.addAccountCard(accountId, card);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccountCard");
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
| **card** | [**Card**](Card.md)|  | [optional] |

### Return type

[**Card**](Card.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAccountContact"></a>
# **addAccountContact**
> CustomerContact addAccountContact(accountId, customerContact)

Add Account Contact

Creates a new CustomerContact for a customer account, for example, a new shipping address.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account to contain the new CustomerContact.
    CustomerContact customerContact = new CustomerContact(); // CustomerContact | Properties of the new CustomerContact. Required properties: CustomerContact.Email, ContactType.
    try {
      CustomerContact result = apiInstance.addAccountContact(accountId, customerContact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccountContact");
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
| **accountId** | **Integer**| Unique identifier of the customer account to contain the new CustomerContact. | |
| **customerContact** | [**CustomerContact**](CustomerContact.md)| Properties of the new CustomerContact. Required properties: CustomerContact.Email, ContactType. | [optional] |

### Return type

[**CustomerContact**](CustomerContact.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAccountContactList"></a>
# **addAccountContactList**
> CustomerContactCollection addAccountContactList(accountId, customerContact)

Add Account Contact List

Creates a new CustomerContacts for a customer account in bulk to support adding multiple contacts in a multi-ship scenario.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account to contain the new CustomerContact.
    List<CustomerContact> customerContact = Arrays.asList(); // List<CustomerContact> | List of CustomerContact objects : Properties of each new CustomerContact. Required properties: CustomerContact.Email, ContactType.
    try {
      CustomerContactCollection result = apiInstance.addAccountContactList(accountId, customerContact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccountContactList");
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
| **accountId** | **Integer**| Unique identifier of the customer account to contain the new CustomerContact. | |
| **customerContact** | [**List&lt;CustomerContact&gt;**](CustomerContact.md)| List of CustomerContact objects : Properties of each new CustomerContact. Required properties: CustomerContact.Email, ContactType. | [optional] |

### Return type

[**CustomerContactCollection**](CustomerContactCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAccountNote"></a>
# **addAccountNote**
> CustomerNote addAccountNote(accountId, customerNote)

Add Account Note

Adds a new note to the specified customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account for which to create the note.
    CustomerNote customerNote = new CustomerNote(); // CustomerNote | Contents of the new note.
    try {
      CustomerNote result = apiInstance.addAccountNote(accountId, customerNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccountNote");
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
| **accountId** | **Integer**| Unique identifier of the customer account for which to create the note. | |
| **customerNote** | [**CustomerNote**](CustomerNote.md)| Contents of the new note. | [optional] |

### Return type

[**CustomerNote**](CustomerNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addAccounts"></a>
# **addAccounts**
> CustomerAccountCollection addAccounts(customerAccountAndAuthInfo)

Add Accounts

Creates multiple new shopper accounts for a specified site. Allows you to create a number of new shopper accounts at one time.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    List<CustomerAccountAndAuthInfo> customerAccountAndAuthInfo = Arrays.asList(); // List<CustomerAccountAndAuthInfo> | 
    try {
      CustomerAccountCollection result = apiInstance.addAccounts(customerAccountAndAuthInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addAccounts");
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
| **customerAccountAndAuthInfo** | [**List&lt;CustomerAccountAndAuthInfo&gt;**](CustomerAccountAndAuthInfo.md)|  | [optional] |

### Return type

[**CustomerAccountCollection**](CustomerAccountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addLoginToExistingCustomer"></a>
# **addLoginToExistingCustomer**
> CustomerAuthTicket addLoginToExistingCustomer(accountId, customerLoginInfo)

Add Login To Existing Customer

Creates a login for an existing customer and logs them in automatically.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    CustomerLoginInfo customerLoginInfo = new CustomerLoginInfo(); // CustomerLoginInfo | 
    try {
      CustomerAuthTicket result = apiInstance.addLoginToExistingCustomer(accountId, customerLoginInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addLoginToExistingCustomer");
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
| **customerLoginInfo** | [**CustomerLoginInfo**](CustomerLoginInfo.md)|  | [optional] |

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

<a name="addTransaction"></a>
# **addTransaction**
> Transaction addTransaction(accountId, transaction)

Add Transaction

Add a transaction on customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    Transaction transaction = new Transaction(); // Transaction | 
    try {
      Transaction result = apiInstance.addTransaction(accountId, transaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#addTransaction");
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
| **transaction** | [**Transaction**](Transaction.md)|  | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="changePassword"></a>
# **changePassword**
> changePassword(accountId, unlockAccount, userId, customerPasswordInfo)

Change Password

Changes a shopper&#39;s password.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the shopper for whom to change the password.
    Boolean unlockAccount = false; // Boolean | inidicates that the account should be unlocked on a successful password change.
    String userId = "userId_example"; // String | 
    CustomerPasswordInfo customerPasswordInfo = new CustomerPasswordInfo(); // CustomerPasswordInfo | Old password and new password.
    try {
      apiInstance.changePassword(accountId, unlockAccount, userId, customerPasswordInfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#changePassword");
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
| **accountId** | **Integer**| Unique identifier of the shopper for whom to change the password. | |
| **unlockAccount** | **Boolean**| inidicates that the account should be unlocked on a successful password change. | [optional] [default to false] |
| **userId** | **String**|  | [optional] |
| **customerPasswordInfo** | [**CustomerPasswordInfo**](CustomerPasswordInfo.md)| Old password and new password. | [optional] |

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

<a name="changePasswords"></a>
# **changePasswords**
> ChangePasswordResultCollection changePasswords(accountPasswordInfoCollection)

Change Passwords

Changes a collection of shopper passwords

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    AccountPasswordInfoCollection accountPasswordInfoCollection = new AccountPasswordInfoCollection(); // AccountPasswordInfoCollection | The collection of AccountPasswordInfo which are to be processed
    try {
      ChangePasswordResultCollection result = apiInstance.changePasswords(accountPasswordInfoCollection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#changePasswords");
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
| **accountPasswordInfoCollection** | [**AccountPasswordInfoCollection**](AccountPasswordInfoCollection.md)| The collection of AccountPasswordInfo which are to be processed | [optional] |

### Return type

[**ChangePasswordResultCollection**](ChangePasswordResultCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createCustomerPurchaseOrderAccount"></a>
# **createCustomerPurchaseOrderAccount**
> CustomerPurchaseOrderAccount createCustomerPurchaseOrderAccount(accountId, customerPurchaseOrderAccount)

Create Customer Purchase Order Account

Creates a customer&#39;s purchase order account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account.
    CustomerPurchaseOrderAccount customerPurchaseOrderAccount = new CustomerPurchaseOrderAccount(); // CustomerPurchaseOrderAccount | 
    try {
      CustomerPurchaseOrderAccount result = apiInstance.createCustomerPurchaseOrderAccount(accountId, customerPurchaseOrderAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#createCustomerPurchaseOrderAccount");
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
| **accountId** | **Integer**| Unique identifier of the account. | |
| **customerPurchaseOrderAccount** | [**CustomerPurchaseOrderAccount**](CustomerPurchaseOrderAccount.md)|  | [optional] |

### Return type

[**CustomerPurchaseOrderAccount**](CustomerPurchaseOrderAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createPurchaseOrderTransaction"></a>
# **createPurchaseOrderTransaction**
> PurchaseOrderTransaction createPurchaseOrderTransaction(accountId, purchaseOrderTransaction)

Create Purchase Order Transaction

Creates a purchase order transaction log (for public api use).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account.
    PurchaseOrderTransaction purchaseOrderTransaction = new PurchaseOrderTransaction(); // PurchaseOrderTransaction | transaction log that needs to be created
    try {
      PurchaseOrderTransaction result = apiInstance.createPurchaseOrderTransaction(accountId, purchaseOrderTransaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#createPurchaseOrderTransaction");
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
| **accountId** | **Integer**| Unique identifier of the customer account. | |
| **purchaseOrderTransaction** | [**PurchaseOrderTransaction**](PurchaseOrderTransaction.md)| transaction log that needs to be created | [optional] |

### Return type

[**PurchaseOrderTransaction**](PurchaseOrderTransaction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(accountId)

Delete Account

Deletes a customer account. A customer account cannot be deleted if any orders exist, past or present.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account to delete.
    try {
      apiInstance.deleteAccount(accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#deleteAccount");
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
| **accountId** | **Integer**| Unique identifier of the customer account to delete. | |

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

<a name="deleteAccountAttribute"></a>
# **deleteAccountAttribute**
> deleteAccountAttribute(accountId, attributeFQN, userId)

Delete Account Attribute

Deletes an account attribute specified by attributeFQN.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String attributeFQN = "attributeFQN_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      apiInstance.deleteAccountAttribute(accountId, attributeFQN, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#deleteAccountAttribute");
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
| **userId** | **String**|  | [optional] |

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

<a name="deleteAccountCard"></a>
# **deleteAccountCard**
> deleteAccountCard(accountId, cardId)

Delete Account Card

Removes a card from the specified customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String cardId = "cardId_example"; // String | 
    try {
      apiInstance.deleteAccountCard(accountId, cardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#deleteAccountCard");
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
| **cardId** | **String**|  | |

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

<a name="deleteAccountContact"></a>
# **deleteAccountContact**
> deleteAccountContact(accountId, contactId)

Delete Account Contact

Deletes a CustomerContact for the specified customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose CustomerContact you want to delete.
    Integer contactId = 56; // Integer | 
    try {
      apiInstance.deleteAccountContact(accountId, contactId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#deleteAccountContact");
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
| **accountId** | **Integer**| Unique identifier of the customer account whose CustomerContact you want to delete. | |
| **contactId** | **Integer**|  | |

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

<a name="deleteAccountNote"></a>
# **deleteAccountNote**
> deleteAccountNote(accountId, noteId)

Delete Account Note

Removes a note from the specified customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account that contains the note you want to delete.
    Integer noteId = 56; // Integer | Unique identifier of the note to delete.
    try {
      apiInstance.deleteAccountNote(accountId, noteId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#deleteAccountNote");
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
| **accountId** | **Integer**| Unique identifier of the customer account that contains the note you want to delete. | |
| **noteId** | **Integer**| Unique identifier of the note to delete. | |

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

<a name="getAccount"></a>
# **getAccount**
> CustomerAccount getAccount(accountId, responseGroups, userId)

Get Account

Retrieves the details of a customer account specified by its unique identifier.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose details you want to retrieve.
    String responseGroups = "responseGroups_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      CustomerAccount result = apiInstance.getAccount(accountId, responseGroups, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccount");
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
| **accountId** | **Integer**| Unique identifier of the customer account whose details you want to retrieve. | |
| **responseGroups** | **String**|  | [optional] |
| **userId** | **String**|  | [optional] |

### Return type

[**CustomerAccount**](CustomerAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountAttribute"></a>
# **getAccountAttribute**
> CustomerAttribute getAccountAttribute(accountId, attributeFQN, userId)

Get Account Attribute

Retrieves the contents of a particular attribute attached to a specified account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account that contains the attribute to retrieve.
    String attributeFQN = "attributeFQN_example"; // String | Fully qualified name of the attribute that you want to retrieve.
    String userId = "userId_example"; // String | 
    try {
      CustomerAttribute result = apiInstance.getAccountAttribute(accountId, attributeFQN, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountAttribute");
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
| **accountId** | **Integer**| Unique identifier of the account that contains the attribute to retrieve. | |
| **attributeFQN** | **String**| Fully qualified name of the attribute that you want to retrieve. | |
| **userId** | **String**|  | [optional] |

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

<a name="getAccountAttributes"></a>
# **getAccountAttributes**
> CustomerAttributeCollection getAccountAttributes(accountId, startIndex, pageSize, sortBy, filter, userId)

Get Account Attributes

Retrieves a collection of account attributes according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose notes you want to retrieve.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 20; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = ""; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = ""; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String userId = "userId_example"; // String | 
    try {
      CustomerAttributeCollection result = apiInstance.getAccountAttributes(accountId, startIndex, pageSize, sortBy, filter, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountAttributes");
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
| **userId** | **String**|  | [optional] |

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

<a name="getAccountAuditLog"></a>
# **getAccountAuditLog**
> CustomerAuditEntryCollection getAccountAuditLog(accountId, startIndex, pageSize, sortBy, filter)

Get Account Audit Log

Get Account Audit Log

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      CustomerAuditEntryCollection result = apiInstance.getAccountAuditLog(accountId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountAuditLog");
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
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**CustomerAuditEntryCollection**](CustomerAuditEntryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountCard"></a>
# **getAccountCard**
> Card getAccountCard(accountId, cardId)

Get Account Card

Retrieves a card for the specified customer account and card ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String cardId = "cardId_example"; // String | 
    try {
      Card result = apiInstance.getAccountCard(accountId, cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountCard");
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
| **cardId** | **String**|  | |

### Return type

[**Card**](Card.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountCards"></a>
# **getAccountCards**
> CardCollection getAccountCards(accountId)

Get Account Cards

Retrieves a list of cards for the specified customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    try {
      CardCollection result = apiInstance.getAccountCards(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountCards");
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

### Return type

[**CardCollection**](CardCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountContact"></a>
# **getAccountContact**
> CustomerContact getAccountContact(accountId, contactId, userId)

Get Account Contact

Retrieves the specified CustomerContact for a customer account, for example, a billing or shipping CustomerContact.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose CustomerContact information you want to retrieve.
    Integer contactId = 56; // Integer | Unique identifier of the CustomerContact whose details you want to retrieve.
    String userId = "userId_example"; // String | If provided, the primary markings on the contact will be based on the user's preferred primary overrides
    try {
      CustomerContact result = apiInstance.getAccountContact(accountId, contactId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountContact");
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
| **accountId** | **Integer**| Unique identifier of the customer account whose CustomerContact information you want to retrieve. | |
| **contactId** | **Integer**| Unique identifier of the CustomerContact whose details you want to retrieve. | |
| **userId** | **String**| If provided, the primary markings on the contact will be based on the user&#39;s preferred primary overrides | [optional] |

### Return type

[**CustomerContact**](CustomerContact.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountContacts"></a>
# **getAccountContacts**
> CustomerContactCollection getAccountContacts(accountId, startIndex, pageSize, sortBy, filter, userId)

Get Account Contacts

Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose CustomerContact information you want to retrieve.
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String userId = "userId_example"; // String | If provided, the primary markings on the contacts will be based on the user's preferred primary overrides
    try {
      CustomerContactCollection result = apiInstance.getAccountContacts(accountId, startIndex, pageSize, sortBy, filter, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountContacts");
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
| **accountId** | **Integer**| Unique identifier of the customer account whose CustomerContact information you want to retrieve. | |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **userId** | **String**| If provided, the primary markings on the contacts will be based on the user&#39;s preferred primary overrides | [optional] |

### Return type

[**CustomerContactCollection**](CustomerContactCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountNote"></a>
# **getAccountNote**
> CustomerNote getAccountNote(accountId, noteId)

Get Account Note

Retrieves the contents of a particular note attached to a specified customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account that contains the note to retrieve.
    Integer noteId = 56; // Integer | Unique identifier of a particular note that you want to retrieve.
    try {
      CustomerNote result = apiInstance.getAccountNote(accountId, noteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountNote");
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
| **accountId** | **Integer**| Unique identifier of the customer account that contains the note to retrieve. | |
| **noteId** | **Integer**| Unique identifier of a particular note that you want to retrieve. | |

### Return type

[**CustomerNote**](CustomerNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountNotes"></a>
# **getAccountNotes**
> CustomerNoteCollection getAccountNotes(accountId, startIndex, pageSize, sortBy, filter)

Get Account Notes

Retrieves a list of notes added to a customer account according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose notes you want to retrieve.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 20; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = ""; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = ""; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      CustomerNoteCollection result = apiInstance.getAccountNotes(accountId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountNotes");
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

[**CustomerNoteCollection**](CustomerNoteCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccountSegments"></a>
# **getAccountSegments**
> CustomerSegmentCollection getAccountSegments(accountId, startIndex, pageSize, sortBy, filter)

Get Account Segments

Retrieves a list of segments for the specified account according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account for which you want the list of groups.
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 20; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = ""; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order.               Optional.
    String filter = ""; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    try {
      CustomerSegmentCollection result = apiInstance.getAccountSegments(accountId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccountSegments");
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
| **accountId** | **Integer**| Unique identifier of the account for which you want the list of groups. | |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 20] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order.               Optional. | [optional] [default to ] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] [default to ] |

### Return type

[**CustomerSegmentCollection**](CustomerSegmentCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAccounts"></a>
# **getAccounts**
> CustomerAccountCollection getAccounts(startIndex, pageSize, sortBy, filter, fields, q, qLimit, isAnonymous, responseGroups)

Get Accounts

Retrieves a list of customer accounts according to any filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.                            For example, applications can filter on UserId to get the single record of the current customer.
    Integer pageSize = 0; // Integer | We added this test to demo new publishing @test@. Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String fields = "fields_example"; // String | 
    String q = "q_example"; // String | a quick filter which will search a predefined set of fields for a match
    Integer qLimit = 56; // Integer | 
    Boolean isAnonymous = true; // Boolean | 
    String responseGroups = "responseGroups_example"; // String | Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional.
    try {
      CustomerAccountCollection result = apiInstance.getAccounts(startIndex, pageSize, sortBy, filter, fields, q, qLimit, isAnonymous, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getAccounts");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional.                            For example, applications can filter on UserId to get the single record of the current customer. | [optional] [default to 0] |
| **pageSize** | **Integer**| We added this test to demo new publishing @test@. Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **fields** | **String**|  | [optional] |
| **q** | **String**| a quick filter which will search a predefined set of fields for a match | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **isAnonymous** | **Boolean**|  | [optional] |
| **responseGroups** | **String**| Used to refine the default information returned from a request. To reduce amount of customer account information returned, use the valid response groups: Contacts, CustomerAccountNotes, and OrderSummary. Optional. | [optional] |

### Return type

[**CustomerAccountCollection**](CustomerAccountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCurrentAccount"></a>
# **getCurrentAccount**
> CustomerAccount getCurrentAccount(responseGroups)

Retrieves the details of a the current logged in customer account

Retrieves the details of a the current logged in customer account

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    String responseGroups = "responseGroups_example"; // String | 
    try {
      CustomerAccount result = apiInstance.getCurrentAccount(responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getCurrentAccount");
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
| **responseGroups** | **String**|  | [optional] |

### Return type

[**CustomerAccount**](CustomerAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCustomerPurchaseOrderAccount"></a>
# **getCustomerPurchaseOrderAccount**
> CustomerPurchaseOrderAccount getCustomerPurchaseOrderAccount(accountId)

Gets a customer&#39;s purchase order account.

Gets a customer&#39;s purchase order account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account.
    try {
      CustomerPurchaseOrderAccount result = apiInstance.getCustomerPurchaseOrderAccount(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getCustomerPurchaseOrderAccount");
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
| **accountId** | **Integer**| Unique identifier of the account. | |

### Return type

[**CustomerPurchaseOrderAccount**](CustomerPurchaseOrderAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCustomerPurchaseOrderTransactions"></a>
# **getCustomerPurchaseOrderTransactions**
> PurchaseOrderTransactionCollection getCustomerPurchaseOrderTransactions(accountId, startIndex, pageSize, sortBy, filter)

Get Customer Purchase Order Transactions

Gets a collection of Purchase order transaction logs associated with a customer account id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Customer Account Id for which transaction logs need to be retreived
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 20; // Integer | Used to page results from a query.               Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = ""; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | 
    try {
      PurchaseOrderTransactionCollection result = apiInstance.getCustomerPurchaseOrderTransactions(accountId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getCustomerPurchaseOrderTransactions");
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
| **accountId** | **Integer**| Customer Account Id for which transaction logs need to be retreived | |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query.               Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 20] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] [default to ] |
| **filter** | **String**|  | [optional] |

### Return type

[**PurchaseOrderTransactionCollection**](PurchaseOrderTransactionCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCustomersPurchaseOrderAccounts"></a>
# **getCustomersPurchaseOrderAccounts**
> CustomerPurchaseOrderAccountCollection getCustomersPurchaseOrderAccounts(startIndex, pageSize, sortBy, accountType)

Get Customers Purchase Order Accounts

Gets a collection of customer purchase order accounts.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = ""; // String | 
    String accountType = "B2C"; // String | 
    try {
      CustomerPurchaseOrderAccountCollection result = apiInstance.getCustomersPurchaseOrderAccounts(startIndex, pageSize, sortBy, accountType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getCustomersPurchaseOrderAccounts");
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
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **sortBy** | **String**|  | [optional] [default to ] |
| **accountType** | **String**|  | [optional] [default to B2C] |

### Return type

[**CustomerPurchaseOrderAccountCollection**](CustomerPurchaseOrderAccountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLoginState"></a>
# **getLoginState**
> LoginState getLoginState(accountId, userId)

Get Login State

Retrieves the log-in status details of a shopper specified by account Id and user Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String userId = "userId_example"; // String | EmailAddress of the customer whose details you want to view.
    try {
      LoginState result = apiInstance.getLoginState(accountId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getLoginState");
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
| **userId** | **String**| EmailAddress of the customer whose details you want to view. | [optional] |

### Return type

[**LoginState**](LoginState.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLoginStateByEmailAddress"></a>
# **getLoginStateByEmailAddress**
> LoginState getLoginStateByEmailAddress(emailAddress, customerSetCode)

Get Login State By Email Address

Retrieves the log-in status details of a shopper specified by emailAdress.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    String customerSetCode = "customerSetCode_example"; // String | 
    try {
      LoginState result = apiInstance.getLoginStateByEmailAddress(emailAddress, customerSetCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getLoginStateByEmailAddress");
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
| **customerSetCode** | **String**|  | [optional] |

### Return type

[**LoginState**](LoginState.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getLoginStateByUserName"></a>
# **getLoginStateByUserName**
> LoginState getLoginStateByUserName(userName, customerSetCode)

Get Login State By UserName

Retrieves the log-in status details of a shopper specified by userName.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    String userName = "userName_example"; // String | Unique userName of the customer whose details you want to view.
    String customerSetCode = "customerSetCode_example"; // String | 
    try {
      LoginState result = apiInstance.getLoginStateByUserName(userName, customerSetCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getLoginStateByUserName");
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
| **userName** | **String**| Unique userName of the customer whose details you want to view. | [optional] |
| **customerSetCode** | **String**|  | [optional] |

### Return type

[**LoginState**](LoginState.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTransactions"></a>
# **getTransactions**
> List&lt;Transaction&gt; getTransactions(accountId)

Get Transactions

Gets the list of transactions on customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    try {
      List<Transaction> result = apiInstance.getTransactions(accountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#getTransactions");
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

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="recomputeCustomerLifetimeValue"></a>
# **recomputeCustomerLifetimeValue**
> recomputeCustomerLifetimeValue(accountId)

Recompute Customer Lifetime Value

Triggers event to recompute customer lifetime value.  The lifetime value may not immediately be recalculated, but enters a queue.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    try {
      apiInstance.recomputeCustomerLifetimeValue(accountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#recomputeCustomerLifetimeValue");
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

<a name="removeTransaction"></a>
# **removeTransaction**
> removeTransaction(accountId, transactionId)

Remove Transaction

Removes a transaction on customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String transactionId = "transactionId_example"; // String | 
    try {
      apiInstance.removeTransaction(accountId, transactionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#removeTransaction");
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
| **transactionId** | **String**|  | |

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
> resetPassword(customerResetPasswordInfo)

Reset Password

Resets the password for a shopper specified by username or emailAddress.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    CustomerResetPasswordInfo customerResetPasswordInfo = new CustomerResetPasswordInfo(); // CustomerResetPasswordInfo | Username or EmailAddress of the shopper who has requested a password reset.
    try {
      apiInstance.resetPassword(customerResetPasswordInfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#resetPassword");
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
| **customerResetPasswordInfo** | [**CustomerResetPasswordInfo**](CustomerResetPasswordInfo.md)| Username or EmailAddress of the shopper who has requested a password reset. | [optional] |

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

<a name="setLoginLocked"></a>
# **setLoginLocked**
> setLoginLocked(accountId, userId, body)

Set Login Locked

Sets a flag indicating whether the customers login is locked or unlocked.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | The customer account id to operate on.
    String userId = "userId_example"; // String | 
    Boolean body = true; // Boolean | True for locking the login. False for unlocking the login (default).
    try {
      apiInstance.setLoginLocked(accountId, userId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#setLoginLocked");
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
| **accountId** | **Integer**| The customer account id to operate on. | |
| **userId** | **String**|  | [optional] |
| **body** | **Boolean**| True for locking the login. False for unlocking the login (default). | [optional] |

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

<a name="setPasswordChangeRequired"></a>
# **setPasswordChangeRequired**
> setPasswordChangeRequired(accountId, userId, body)

Set Password Change Required

Sets a flag indicating whether the customers must change their password before logging in again.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | The customer account id to operate on.
    String userId = "userId_example"; // String | 
    Boolean body = true; // Boolean | 
    try {
      apiInstance.setPasswordChangeRequired(accountId, userId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#setPasswordChangeRequired");
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
| **accountId** | **Integer**| The customer account id to operate on. | |
| **userId** | **String**|  | [optional] |
| **body** | **Boolean**|  | [optional] |

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

<a name="updateAccount"></a>
# **updateAccount**
> CustomerAccount updateAccount(accountId, customerAccount)

Update Account

Modifies an existing customer account, for example, to change the primary billing contact or change whether to accept marketing material.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account.
    CustomerAccount customerAccount = new CustomerAccount(); // CustomerAccount | Properties of the customer account to update.
    try {
      CustomerAccount result = apiInstance.updateAccount(accountId, customerAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#updateAccount");
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
| **accountId** | **Integer**| Unique identifier of the customer account. | |
| **customerAccount** | [**CustomerAccount**](CustomerAccount.md)| Properties of the customer account to update. | [optional] |

### Return type

[**CustomerAccount**](CustomerAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAccountAttribute"></a>
# **updateAccountAttribute**
> CustomerAttribute updateAccountAttribute(accountId, attributeFQN, userId, customerAttribute)

Update Account Attribute

Modifies an existing attribute for an account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account whose attribute you want to modify.
    String attributeFQN = "attributeFQN_example"; // String | 
    String userId = "userId_example"; // String | 
    CustomerAttribute customerAttribute = new CustomerAttribute(); // CustomerAttribute | The new content to replace the existing attribute.
    try {
      CustomerAttribute result = apiInstance.updateAccountAttribute(accountId, attributeFQN, userId, customerAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#updateAccountAttribute");
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
| **userId** | **String**|  | [optional] |
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

<a name="updateAccountCard"></a>
# **updateAccountCard**
> Card updateAccountCard(accountId, cardId, card)

Update Account Card

Updates a card on the specific customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | 
    String cardId = "cardId_example"; // String | 
    Card card = new Card(); // Card | 
    try {
      Card result = apiInstance.updateAccountCard(accountId, cardId, card);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#updateAccountCard");
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
| **cardId** | **String**|  | |
| **card** | [**Card**](Card.md)|  | [optional] |

### Return type

[**Card**](Card.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAccountContact"></a>
# **updateAccountContact**
> CustomerContact updateAccountContact(accountId, contactId, userId, customerContact)

Update Account Contact

Updates a CustomerContact for a specified customer account, for example to update addresses or change which CustomerContact is the primary CustomerContact for billing.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose CustomerContact information you want to update.
    Integer contactId = 56; // Integer | 
    String userId = "userId_example"; // String | If provided, the primary markings on the contact will be stored as the user's preferred primary override
    CustomerContact customerContact = new CustomerContact(); // CustomerContact | 
    try {
      CustomerContact result = apiInstance.updateAccountContact(accountId, contactId, userId, customerContact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#updateAccountContact");
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
| **accountId** | **Integer**| Unique identifier of the customer account whose CustomerContact information you want to update. | |
| **contactId** | **Integer**|  | |
| **userId** | **String**| If provided, the primary markings on the contact will be stored as the user&#39;s preferred primary override | [optional] |
| **customerContact** | [**CustomerContact**](CustomerContact.md)|  | [optional] |

### Return type

[**CustomerContact**](CustomerContact.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateAccountNote"></a>
# **updateAccountNote**
> CustomerNote updateAccountNote(accountId, noteId, customerNote)

Update Account Note

Modifies an existing note for a customer account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the customer account whose note you want to modify.
    Integer noteId = 56; // Integer | Unique identifier of the note to update.
    CustomerNote customerNote = new CustomerNote(); // CustomerNote | The new content to replace the existing note.
    try {
      CustomerNote result = apiInstance.updateAccountNote(accountId, noteId, customerNote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#updateAccountNote");
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
| **accountId** | **Integer**| Unique identifier of the customer account whose note you want to modify. | |
| **noteId** | **Integer**| Unique identifier of the note to update. | |
| **customerNote** | [**CustomerNote**](CustomerNote.md)| The new content to replace the existing note. | [optional] |

### Return type

[**CustomerNote**](CustomerNote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCustomerPurchaseOrderAccount"></a>
# **updateCustomerPurchaseOrderAccount**
> CustomerPurchaseOrderAccount updateCustomerPurchaseOrderAccount(accountId, customerPurchaseOrderAccount)

Update Customer Purchase Order Account

Updates a customer&#39;s purchase order account.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    Integer accountId = 56; // Integer | Unique identifier of the account.
    CustomerPurchaseOrderAccount customerPurchaseOrderAccount = new CustomerPurchaseOrderAccount(); // CustomerPurchaseOrderAccount | 
    try {
      CustomerPurchaseOrderAccount result = apiInstance.updateCustomerPurchaseOrderAccount(accountId, customerPurchaseOrderAccount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#updateCustomerPurchaseOrderAccount");
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
| **accountId** | **Integer**| Unique identifier of the account. | |
| **customerPurchaseOrderAccount** | [**CustomerPurchaseOrderAccount**](CustomerPurchaseOrderAccount.md)|  | [optional] |

### Return type

[**CustomerPurchaseOrderAccount**](CustomerPurchaseOrderAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateForgottenPassword"></a>
# **updateForgottenPassword**
> updateForgottenPassword(confirmationInfo)

Update Forgotten Password

Updates the password for a shopper who has requested a password change and provided the new password and confirmation code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.customer.ApiClient;
import com.kibocommerce.sdk.customer.ApiException;
import com.kibocommerce.sdk.customer.Configuration;
import com.kibocommerce.sdk.customer.auth.*;
import com.kibocommerce.sdk.customer.models.*;
import com.kibocommerce.sdk.customer.api.CustomerAccountApi;

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

    CustomerAccountApi apiInstance = new CustomerAccountApi(defaultClient);
    ConfirmationInfo confirmationInfo = new ConfirmationInfo(); // ConfirmationInfo | Properties of the confirmation code. Required properties: UserName, NewPassword, and ConfirmationCode.
    try {
      apiInstance.updateForgottenPassword(confirmationInfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerAccountApi#updateForgottenPassword");
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
| **confirmationInfo** | [**ConfirmationInfo**](ConfirmationInfo.md)| Properties of the confirmation code. Required properties: UserName, NewPassword, and ConfirmationCode. | [optional] |

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

