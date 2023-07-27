# ShippingProfileApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrderHandlingFeeRule**](ShippingProfileApi.md#createOrderHandlingFeeRule) | **POST** /commerce/shipping/admin/profiles/{profilecode}/rules/orderhandlingfees | Create Order Handling Fee Rule |
| [**createProductHandlingFeeRule**](ShippingProfileApi.md#createProductHandlingFeeRule) | **POST** /commerce/shipping/admin/profiles/{profilecode}/rules/producthandlingfees | Create Product Handling Fee Rule |
| [**createShippingInclusionRule**](ShippingProfileApi.md#createShippingInclusionRule) | **POST** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions | Create Shipping Inclusion Rule |
| [**deleteOrderHandlingFeeRule**](ShippingProfileApi.md#deleteOrderHandlingFeeRule) | **DELETE** /commerce/shipping/admin/profiles/{profilecode}/rules/orderhandlingfees/{id} | Delete Order Handling Fee Rule |
| [**deleteProductHandlingFeeRule**](ShippingProfileApi.md#deleteProductHandlingFeeRule) | **DELETE** /commerce/shipping/admin/profiles/{profilecode}/rules/producthandlingfees/{id} | Delete Product Handling Fee Rule |
| [**deleteShippingInclusionRule**](ShippingProfileApi.md#deleteShippingInclusionRule) | **DELETE** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id} | Delete Shipping Inclusion Rule |
| [**getOrderHandlingFeeRule**](ShippingProfileApi.md#getOrderHandlingFeeRule) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/orderhandlingfees/{id} | Get Order Handling Fee Rule |
| [**getOrderHandlingFeeRules**](ShippingProfileApi.md#getOrderHandlingFeeRules) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/orderhandlingfees | Get Order Handling Fee Rules |
| [**getProductHandlingFeeRule**](ShippingProfileApi.md#getProductHandlingFeeRule) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/producthandlingfees/{id} | Get Product Handling Fee Rule |
| [**getProductHandlingFeeRules**](ShippingProfileApi.md#getProductHandlingFeeRules) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/producthandlingfees | Get Product Handling Fee Rules |
| [**getProfiles**](ShippingProfileApi.md#getProfiles) | **GET** /commerce/shipping/admin/profiles | Get Shipping Profiles for the Tenant/Master Catalog |
| [**getShippingInclusionRule**](ShippingProfileApi.md#getShippingInclusionRule) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id} | Get Shipping Inclusion Rule |
| [**getShippingInclusionRules**](ShippingProfileApi.md#getShippingInclusionRules) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions | Get Shipping Inclusion Rules |
| [**getStates**](ShippingProfileApi.md#getStates) | **GET** /commerce/shipping/admin/profiles/{profilecode}/shippingstates | Get Configured Shipping States |
| [**updateOrderHandlingFeeRule**](ShippingProfileApi.md#updateOrderHandlingFeeRule) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/rules/orderhandlingfees/{id} | Update Order Handling Fee Rule |
| [**updateProductHandlingFeeRule**](ShippingProfileApi.md#updateProductHandlingFeeRule) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/rules/producthandlingfees/{id} | Update Product Handling Fee Rule |
| [**updateShippingInclusionRule**](ShippingProfileApi.md#updateShippingInclusionRule) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id} | Update Shipping Inclusion Rule |
| [**updateStates**](ShippingProfileApi.md#updateStates) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/shippingstates | Update States |


<a name="createOrderHandlingFeeRule"></a>
# **createOrderHandlingFeeRule**
> HandlingFeeRule createOrderHandlingFeeRule(profilecode, handlingFeeRule)

Create Order Handling Fee Rule

Create Order Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.createOrderHandlingFeeRule(profilecode, handlingFeeRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#createOrderHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createProductHandlingFeeRule"></a>
# **createProductHandlingFeeRule**
> HandlingFeeRule createProductHandlingFeeRule(profilecode, handlingFeeRule)

Create Product Handling Fee Rule

Create Product Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.createProductHandlingFeeRule(profilecode, handlingFeeRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#createProductHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createShippingInclusionRule"></a>
# **createShippingInclusionRule**
> ShippingInclusionRule createShippingInclusionRule(profilecode, shippingInclusionRule)

Create Shipping Inclusion Rule

Create Shipping Inclusion Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    ShippingInclusionRule shippingInclusionRule = new ShippingInclusionRule(); // ShippingInclusionRule | 
    try {
      ShippingInclusionRule result = apiInstance.createShippingInclusionRule(profilecode, shippingInclusionRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#createShippingInclusionRule");
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
| **profilecode** | **String**|  | |
| **shippingInclusionRule** | [**ShippingInclusionRule**](ShippingInclusionRule.md)|  | [optional] |

### Return type

[**ShippingInclusionRule**](ShippingInclusionRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteOrderHandlingFeeRule"></a>
# **deleteOrderHandlingFeeRule**
> ShippingAdminHttpResponseMessage deleteOrderHandlingFeeRule(profilecode, id)

Delete Order Handling Fee Rule

Delete Order Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    try {
      ShippingAdminHttpResponseMessage result = apiInstance.deleteOrderHandlingFeeRule(profilecode, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#deleteOrderHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**ShippingAdminHttpResponseMessage**](ShippingAdminHttpResponseMessage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteProductHandlingFeeRule"></a>
# **deleteProductHandlingFeeRule**
> deleteProductHandlingFeeRule(profilecode, id)

Delete Product Handling Fee Rule

Delete Product Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteProductHandlingFeeRule(profilecode, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#deleteProductHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |

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

<a name="deleteShippingInclusionRule"></a>
# **deleteShippingInclusionRule**
> deleteShippingInclusionRule(profilecode, id)

Delete Shipping Inclusion Rule

Delete Shipping Inclusion Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteShippingInclusionRule(profilecode, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#deleteShippingInclusionRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |

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

<a name="getOrderHandlingFeeRule"></a>
# **getOrderHandlingFeeRule**
> HandlingFeeRule getOrderHandlingFeeRule(profilecode, id)

Get Order Handling Fee Rule

Get Order Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    try {
      HandlingFeeRule result = apiInstance.getOrderHandlingFeeRule(profilecode, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getOrderHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderHandlingFeeRules"></a>
# **getOrderHandlingFeeRules**
> HandlingFeeRuleCollection getOrderHandlingFeeRules(profilecode)

Get Order Handling Fee Rules

Get Order Handling Fee Rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    try {
      HandlingFeeRuleCollection result = apiInstance.getOrderHandlingFeeRules(profilecode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getOrderHandlingFeeRules");
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
| **profilecode** | **String**|  | |

### Return type

[**HandlingFeeRuleCollection**](HandlingFeeRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductHandlingFeeRule"></a>
# **getProductHandlingFeeRule**
> HandlingFeeRule getProductHandlingFeeRule(profilecode, id)

Get Product Handling Fee Rule

Get Product Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    try {
      HandlingFeeRule result = apiInstance.getProductHandlingFeeRule(profilecode, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getProductHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductHandlingFeeRules"></a>
# **getProductHandlingFeeRules**
> HandlingFeeRuleCollection getProductHandlingFeeRules(profilecode)

Get Product Handling Fee Rules

Get Product Handling Fee Rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    try {
      HandlingFeeRuleCollection result = apiInstance.getProductHandlingFeeRules(profilecode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getProductHandlingFeeRules");
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
| **profilecode** | **String**|  | |

### Return type

[**HandlingFeeRuleCollection**](HandlingFeeRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProfiles"></a>
# **getProfiles**
> ShippingProfileCollection getProfiles()

Get Shipping Profiles for the Tenant/Master Catalog

Get Shipping Profiles for the Tenant/Master Catalog

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    try {
      ShippingProfileCollection result = apiInstance.getProfiles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getProfiles");
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

[**ShippingProfileCollection**](ShippingProfileCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getShippingInclusionRule"></a>
# **getShippingInclusionRule**
> ShippingInclusionRule getShippingInclusionRule(profilecode, id)

Get Shipping Inclusion Rule

Get Shipping Inclusion Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    try {
      ShippingInclusionRule result = apiInstance.getShippingInclusionRule(profilecode, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getShippingInclusionRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**ShippingInclusionRule**](ShippingInclusionRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getShippingInclusionRules"></a>
# **getShippingInclusionRules**
> ShippingInclusionRuleCollection getShippingInclusionRules(profilecode)

Get Shipping Inclusion Rules

Get Shipping Inclusion Rules

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    try {
      ShippingInclusionRuleCollection result = apiInstance.getShippingInclusionRules(profilecode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getShippingInclusionRules");
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
| **profilecode** | **String**|  | |

### Return type

[**ShippingInclusionRuleCollection**](ShippingInclusionRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getStates"></a>
# **getStates**
> List&lt;ShippingStates&gt; getStates(profileCode)

Get Configured Shipping States



### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profileCode = "profileCode_example"; // String | 
    try {
      List<ShippingStates> result = apiInstance.getStates(profileCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#getStates");
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
| **profileCode** | **String**|  | |

### Return type

[**List&lt;ShippingStates&gt;**](ShippingStates.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateOrderHandlingFeeRule"></a>
# **updateOrderHandlingFeeRule**
> HandlingFeeRule updateOrderHandlingFeeRule(profilecode, id, handlingFeeRule)

Update Order Handling Fee Rule

Update Order Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.updateOrderHandlingFeeRule(profilecode, id, handlingFeeRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#updateOrderHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductHandlingFeeRule"></a>
# **updateProductHandlingFeeRule**
> HandlingFeeRule updateProductHandlingFeeRule(profilecode, id, handlingFeeRule)

Update Product Handling Fee Rule

Update Product Handling Fee Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.updateProductHandlingFeeRule(profilecode, id, handlingFeeRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#updateProductHandlingFeeRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateShippingInclusionRule"></a>
# **updateShippingInclusionRule**
> ShippingInclusionRule updateShippingInclusionRule(profilecode, id, shippingInclusionRule)

Update Shipping Inclusion Rule

Update Shipping Inclusion Rule

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    ShippingInclusionRule shippingInclusionRule = new ShippingInclusionRule(); // ShippingInclusionRule | 
    try {
      ShippingInclusionRule result = apiInstance.updateShippingInclusionRule(profilecode, id, shippingInclusionRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#updateShippingInclusionRule");
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
| **profilecode** | **String**|  | |
| **id** | **String**|  | |
| **shippingInclusionRule** | [**ShippingInclusionRule**](ShippingInclusionRule.md)|  | [optional] |

### Return type

[**ShippingInclusionRule**](ShippingInclusionRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateStates"></a>
# **updateStates**
> List&lt;ShippingStates&gt; updateStates(profilecode, shippingStates)

Update States

Update States

### Example
```java
// Import classes:
import com.kibocommerce.sdk.shippingadmin.ApiClient;
import com.kibocommerce.sdk.shippingadmin.ApiException;
import com.kibocommerce.sdk.shippingadmin.Configuration;
import com.kibocommerce.sdk.shippingadmin.auth.*;
import com.kibocommerce.sdk.shippingadmin.models.*;
import com.kibocommerce.sdk.shippingadmin.api.ShippingProfileApi;

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    List<ShippingStates> shippingStates = Arrays.asList(); // List<ShippingStates> | 
    try {
      List<ShippingStates> result = apiInstance.updateStates(profilecode, shippingStates);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingProfileApi#updateStates");
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
| **profilecode** | **String**|  | |
| **shippingStates** | [**List&lt;ShippingStates&gt;**](ShippingStates.md)|  | [optional] |

### Return type

[**List&lt;ShippingStates&gt;**](ShippingStates.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

