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
| [**getProfiles**](ShippingProfileApi.md#getProfiles) | **GET** /commerce/shipping/admin/profiles | Get Shipping Profiles |
| [**getShippingInclusionRule**](ShippingProfileApi.md#getShippingInclusionRule) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id} | Get Shipping Inclusion Rule |
| [**getShippingInclusionRules**](ShippingProfileApi.md#getShippingInclusionRules) | **GET** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions | Get Shipping Inclusion Rules |
| [**getStates**](ShippingProfileApi.md#getStates) | **GET** /commerce/shipping/admin/profiles/{profilecode}/shippingstates | Get Configured Shipping States |
| [**updateOrderHandlingFeeRule**](ShippingProfileApi.md#updateOrderHandlingFeeRule) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/rules/orderhandlingfees/{id} | Update Order Handling Fee Rule |
| [**updateProductHandlingFeeRule**](ShippingProfileApi.md#updateProductHandlingFeeRule) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/rules/producthandlingfees/{id} | Update Product Handling Fee Rule |
| [**updateShippingInclusionRule**](ShippingProfileApi.md#updateShippingInclusionRule) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/rules/shippinginclusions/{id} | Update Shipping Inclusion Rule |
| [**updateStates**](ShippingProfileApi.md#updateStates) | **PUT** /commerce/shipping/admin/profiles/{profilecode}/shippingstates | Update States |


<a name="createOrderHandlingFeeRule"></a>
# **createOrderHandlingFeeRule**
> HandlingFeeRule createOrderHandlingFeeRule(profilecode, responseFields, handlingFeeRule)

Create Order Handling Fee Rule

Creates a new order handling fee rule

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.createOrderHandlingFeeRule(profilecode, responseFields, handlingFeeRule);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createProductHandlingFeeRule"></a>
# **createProductHandlingFeeRule**
> HandlingFeeRule createProductHandlingFeeRule(profilecode, responseFields, handlingFeeRule)

Create Product Handling Fee Rule

Creates a new product handling fee rule

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.createProductHandlingFeeRule(profilecode, responseFields, handlingFeeRule);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createShippingInclusionRule"></a>
# **createShippingInclusionRule**
> ShippingInclusionRule createShippingInclusionRule(profilecode, responseFields, shippingInclusionRule)

Create Shipping Inclusion Rule

Creates a new shipping inclusion rule

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShippingInclusionRule shippingInclusionRule = new ShippingInclusionRule(); // ShippingInclusionRule | 
    try {
      ShippingInclusionRule result = apiInstance.createShippingInclusionRule(profilecode, responseFields, shippingInclusionRule);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shippingInclusionRule** | [**ShippingInclusionRule**](ShippingInclusionRule.md)|  | [optional] |

### Return type

[**ShippingInclusionRule**](ShippingInclusionRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

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

Deletes an existing order handling fee rule

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

[bearerAuth](../README.md#bearerAuth)

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

Deletes an existing product handling fee rule

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

[bearerAuth](../README.md#bearerAuth)

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

Deletes an existing shipping inclusion rule

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderHandlingFeeRule"></a>
# **getOrderHandlingFeeRule**
> HandlingFeeRule getOrderHandlingFeeRule(profilecode, id, responseFields)

Get Order Handling Fee Rule

Retrieves an order handling fee rule by ID

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HandlingFeeRule result = apiInstance.getOrderHandlingFeeRule(profilecode, id, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrderHandlingFeeRules"></a>
# **getOrderHandlingFeeRules**
> HandlingFeeRuleCollection getOrderHandlingFeeRules(profilecode, fulfillmentMethod, responseFields)

Get Order Handling Fee Rules

Retrieve all order handling fee rules

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String fulfillmentMethod = "fulfillmentMethod_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HandlingFeeRuleCollection result = apiInstance.getOrderHandlingFeeRules(profilecode, fulfillmentMethod, responseFields);
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
| **fulfillmentMethod** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HandlingFeeRuleCollection**](HandlingFeeRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductHandlingFeeRule"></a>
# **getProductHandlingFeeRule**
> HandlingFeeRule getProductHandlingFeeRule(profilecode, id, responseFields)

Get Product Handling Fee Rule

Retrieves a product handling fee rule by ID

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HandlingFeeRule result = apiInstance.getProductHandlingFeeRule(profilecode, id, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProductHandlingFeeRules"></a>
# **getProductHandlingFeeRules**
> HandlingFeeRuleCollection getProductHandlingFeeRules(profilecode, fulfillmentMethod, responseFields)

Get Product Handling Fee Rules

Retrieves all product handling fee rules

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String fulfillmentMethod = "fulfillmentMethod_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      HandlingFeeRuleCollection result = apiInstance.getProductHandlingFeeRules(profilecode, fulfillmentMethod, responseFields);
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
| **fulfillmentMethod** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**HandlingFeeRuleCollection**](HandlingFeeRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getProfiles"></a>
# **getProfiles**
> ShippingProfileCollection getProfiles(responseFields)

Get Shipping Profiles

Get shipping profiles for the tenant/master catalog

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ShippingProfileCollection result = apiInstance.getProfiles(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ShippingProfileCollection**](ShippingProfileCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getShippingInclusionRule"></a>
# **getShippingInclusionRule**
> ShippingInclusionRule getShippingInclusionRule(profilecode, id, responseFields)

Get Shipping Inclusion Rule

Retrieves a shipping inclusion rule by ID

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ShippingInclusionRule result = apiInstance.getShippingInclusionRule(profilecode, id, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ShippingInclusionRule**](ShippingInclusionRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getShippingInclusionRules"></a>
# **getShippingInclusionRules**
> ShippingInclusionRuleCollection getShippingInclusionRules(profilecode, responseFields)

Get Shipping Inclusion Rules

Retrieves all shipping inclusion rules

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ShippingInclusionRuleCollection result = apiInstance.getShippingInclusionRules(profilecode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ShippingInclusionRuleCollection**](ShippingInclusionRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getStates"></a>
# **getStates**
> List&lt;ShippingStates&gt; getStates(profileCode, responseFields)

Get Configured Shipping States

Retrieves all configured shipping states

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profileCode = "profileCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ShippingStates> result = apiInstance.getStates(profileCode, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ShippingStates&gt;**](ShippingStates.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateOrderHandlingFeeRule"></a>
# **updateOrderHandlingFeeRule**
> HandlingFeeRule updateOrderHandlingFeeRule(profilecode, id, responseFields, handlingFeeRule)

Update Order Handling Fee Rule

Updates an existing order handling fee rule

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.updateOrderHandlingFeeRule(profilecode, id, responseFields, handlingFeeRule);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateProductHandlingFeeRule"></a>
# **updateProductHandlingFeeRule**
> HandlingFeeRule updateProductHandlingFeeRule(profilecode, id, responseFields, handlingFeeRule)

Update Product Handling Fee Rule

Updates an existing product handling fee rule

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    HandlingFeeRule handlingFeeRule = new HandlingFeeRule(); // HandlingFeeRule | 
    try {
      HandlingFeeRule result = apiInstance.updateProductHandlingFeeRule(profilecode, id, responseFields, handlingFeeRule);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **handlingFeeRule** | [**HandlingFeeRule**](HandlingFeeRule.md)|  | [optional] |

### Return type

[**HandlingFeeRule**](HandlingFeeRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateShippingInclusionRule"></a>
# **updateShippingInclusionRule**
> ShippingInclusionRule updateShippingInclusionRule(profilecode, id, responseFields, shippingInclusionRule)

Update Shipping Inclusion Rule

Updates an existing shipping inclusion rule

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String id = "id_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShippingInclusionRule shippingInclusionRule = new ShippingInclusionRule(); // ShippingInclusionRule | 
    try {
      ShippingInclusionRule result = apiInstance.updateShippingInclusionRule(profilecode, id, responseFields, shippingInclusionRule);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shippingInclusionRule** | [**ShippingInclusionRule**](ShippingInclusionRule.md)|  | [optional] |

### Return type

[**ShippingInclusionRule**](ShippingInclusionRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateStates"></a>
# **updateStates**
> List&lt;ShippingStates&gt; updateStates(profilecode, responseFields, shippingStates)

Update States

Updates the configured shipping states

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

    ShippingProfileApi apiInstance = new ShippingProfileApi(defaultClient);
    String profilecode = "profilecode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ShippingStates> shippingStates = Arrays.asList(); // List<ShippingStates> | 
    try {
      List<ShippingStates> result = apiInstance.updateStates(profilecode, responseFields, shippingStates);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shippingStates** | [**List&lt;ShippingStates&gt;**](ShippingStates.md)|  | [optional] |

### Return type

[**List&lt;ShippingStates&gt;**](ShippingStates.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

