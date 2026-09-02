# CheckoutSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addThirdPartyPaymentWorkflow**](CheckoutSettingsApi.md#addThirdPartyPaymentWorkflow) | **PUT** /commerce/settings/checkout/paymentsettings/thirdpartyworkflows | Add Third Party Payment Workflow |
| [**deleteThirdPartyPaymentWorkflow**](CheckoutSettingsApi.md#deleteThirdPartyPaymentWorkflow) | **DELETE** /commerce/settings/checkout/paymentsettings/thirdpartyworkflows/{fullyQualifiedName} | Delete Third Party Payment Workflow |
| [**getCheckoutSettings**](CheckoutSettingsApi.md#getCheckoutSettings) | **GET** /commerce/settings/checkout | Get Checkout Settings |
| [**getCustomerCheckoutSettings**](CheckoutSettingsApi.md#getCustomerCheckoutSettings) | **GET** /commerce/settings/checkout/customercheckoutsettings | Get Customer Checkout Settings |
| [**getThirdPartyPaymentWorkflowWithValues**](CheckoutSettingsApi.md#getThirdPartyPaymentWorkflowWithValues) | **GET** /commerce/settings/checkout/paymentsettings/thirdpartyworkflow/{fullyQualifiedName} | Get Third Party Payment Workflow With Values |
| [**getThirdPartyPaymentWorkflows**](CheckoutSettingsApi.md#getThirdPartyPaymentWorkflows) | **GET** /commerce/settings/checkout/paymentsettings/thirdpartyworkflows | Get Third Party Payment Workflows |
| [**updateCustomerCheckoutSettings**](CheckoutSettingsApi.md#updateCustomerCheckoutSettings) | **PUT** /commerce/settings/checkout/customercheckoutsettings | Update Customer Checkout Settings |


<a name="addThirdPartyPaymentWorkflow"></a>
# **addThirdPartyPaymentWorkflow**
> addThirdPartyPaymentWorkflow(responseFields, externalPaymentWorkflowDefinition)

Add Third Party Payment Workflow

Adds a third party payment workflow definition. A third-party payment workflow is a definition of a process by which a third-party payment provider (such as Amazon Payments or PayPal Express) interacts with the Unified eCommerce platform.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CheckoutSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutSettingsApi apiInstance = new CheckoutSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = new ExternalPaymentWorkflowDefinition(); // ExternalPaymentWorkflowDefinition | 
    try {
      apiInstance.addThirdPartyPaymentWorkflow(responseFields, externalPaymentWorkflowDefinition);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSettingsApi#addThirdPartyPaymentWorkflow");
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
| **externalPaymentWorkflowDefinition** | [**ExternalPaymentWorkflowDefinition**](ExternalPaymentWorkflowDefinition.md)|  | [optional] |

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

<a name="deleteThirdPartyPaymentWorkflow"></a>
# **deleteThirdPartyPaymentWorkflow**
> deleteThirdPartyPaymentWorkflow(fullyQualifiedName)

Delete Third Party Payment Workflow

Deletes a third party payment workflow definition defined for the site

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CheckoutSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutSettingsApi apiInstance = new CheckoutSettingsApi(defaultClient);
    String fullyQualifiedName = "fullyQualifiedName_example"; // String | 
    try {
      apiInstance.deleteThirdPartyPaymentWorkflow(fullyQualifiedName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSettingsApi#deleteThirdPartyPaymentWorkflow");
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
| **fullyQualifiedName** | **String**|  | |

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

<a name="getCheckoutSettings"></a>
# **getCheckoutSettings**
> CheckoutSettings getCheckoutSettings(responseFields)

Get Checkout Settings

Retrieves all checkout settings defined for the site: Payment settings, such as the payment gateway ID and credentials,supported credit cards,Customer Checkout settings whether login is required and any custom attributes; and Order Processing settings, such as when payment is authorized and captured, and any custom attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CheckoutSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutSettingsApi apiInstance = new CheckoutSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CheckoutSettings result = apiInstance.getCheckoutSettings(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSettingsApi#getCheckoutSettings");
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

[**CheckoutSettings**](CheckoutSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCustomerCheckoutSettings"></a>
# **getCustomerCheckoutSettings**
> CustomerCheckoutSettings getCustomerCheckoutSettings(responseFields)

Get Customer Checkout Settings

Retrieves existing customer checkout settings including the checkout type, which determines whether the customer must be logged in when placing an order. Also lists any custom customer checkout attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CheckoutSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutSettingsApi apiInstance = new CheckoutSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CustomerCheckoutSettings result = apiInstance.getCustomerCheckoutSettings(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSettingsApi#getCustomerCheckoutSettings");
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

[**CustomerCheckoutSettings**](CustomerCheckoutSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getThirdPartyPaymentWorkflowWithValues"></a>
# **getThirdPartyPaymentWorkflowWithValues**
> ExternalPaymentWorkflowDefinition getThirdPartyPaymentWorkflowWithValues(fullyQualifiedName, responseFields)

Get Third Party Payment Workflow With Values

Gets a third party payment workflow specified by workflow definition. A third-party payment workflow is a definition of a process by which a third-party payment provider (such as Amazon Payments or PayPal Express) interacts with the Unified eCommerce platform.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CheckoutSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutSettingsApi apiInstance = new CheckoutSettingsApi(defaultClient);
    String fullyQualifiedName = "fullyQualifiedName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ExternalPaymentWorkflowDefinition result = apiInstance.getThirdPartyPaymentWorkflowWithValues(fullyQualifiedName, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSettingsApi#getThirdPartyPaymentWorkflowWithValues");
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
| **fullyQualifiedName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ExternalPaymentWorkflowDefinition**](ExternalPaymentWorkflowDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getThirdPartyPaymentWorkflows"></a>
# **getThirdPartyPaymentWorkflows**
> List&lt;ExternalPaymentWorkflowDefinition&gt; getThirdPartyPaymentWorkflows(responseFields)

Get Third Party Payment Workflows

Retrieves list of external payment workflow definitions. A third-party payment workflow is a definition of a process by which a third-party payment provider (such as Amazon Payments or PayPal Express) interacts with the Unified eCommerce platform.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CheckoutSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutSettingsApi apiInstance = new CheckoutSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ExternalPaymentWorkflowDefinition> result = apiInstance.getThirdPartyPaymentWorkflows(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSettingsApi#getThirdPartyPaymentWorkflows");
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

[**List&lt;ExternalPaymentWorkflowDefinition&gt;**](ExternalPaymentWorkflowDefinition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateCustomerCheckoutSettings"></a>
# **updateCustomerCheckoutSettings**
> CustomerCheckoutSettings updateCustomerCheckoutSettings(responseFields, customerCheckoutSettings)

Update Customer Checkout Settings

Modifies existing customer checkout settings. When a shopper starts the process of checking out,the Checkout Service checks these settings to render the checkout page.This is where you can specify whether shoppers must be logged in &#39;LoginRequired&#39; or not &#39;LoginOptional&#39; to checkout. You can also update your own customer checkout requirements, for example, to add a tracking code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.settings.ApiClient;
import com.kibocommerce.sdk.settings.ApiException;
import com.kibocommerce.sdk.settings.Configuration;
import com.kibocommerce.sdk.settings.auth.*;
import com.kibocommerce.sdk.settings.models.*;
import com.kibocommerce.sdk.settings.api.CheckoutSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CheckoutSettingsApi apiInstance = new CheckoutSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CustomerCheckoutSettings customerCheckoutSettings = new CustomerCheckoutSettings(); // CustomerCheckoutSettings | Properties of the customer checkout settings to update.
    try {
      CustomerCheckoutSettings result = apiInstance.updateCustomerCheckoutSettings(responseFields, customerCheckoutSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSettingsApi#updateCustomerCheckoutSettings");
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
| **customerCheckoutSettings** | [**CustomerCheckoutSettings**](CustomerCheckoutSettings.md)| Properties of the customer checkout settings to update. | [optional] |

### Return type

[**CustomerCheckoutSettings**](CustomerCheckoutSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

