# OrderRoutingSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFilterAttribute**](OrderRoutingSettingsApi.md#deleteFilterAttribute) | **DELETE** /commerce/orders/orderrouting/api/v1/settings/filterAttributes/{attributeName} | Delete Filter Attribute |
| [**deleteSettings**](OrderRoutingSettingsApi.md#deleteSettings) | **DELETE** /commerce/orders/orderrouting/api/v1/settings | Delete Order Routing Settings |
| [**getFilterAttribute**](OrderRoutingSettingsApi.md#getFilterAttribute) | **GET** /commerce/orders/orderrouting/api/v1/settings/filterAttributes/{attributeName} | Get Filter Attribute |
| [**getFilterAttributes**](OrderRoutingSettingsApi.md#getFilterAttributes) | **GET** /commerce/orders/orderrouting/api/v1/settings/filterAttributes | Get Filter Attributes |
| [**getSettings**](OrderRoutingSettingsApi.md#getSettings) | **GET** /commerce/orders/orderrouting/api/v1/settings | Get Order Routing Settings |
| [**saveFilterAttribute**](OrderRoutingSettingsApi.md#saveFilterAttribute) | **PUT** /commerce/orders/orderrouting/api/v1/settings/filterAttributes | Save Filter Attribute |
| [**saveSettings**](OrderRoutingSettingsApi.md#saveSettings) | **PUT** /commerce/orders/orderrouting/api/v1/settings | Save Order Routing Settings |


<a name="deleteFilterAttribute"></a>
# **deleteFilterAttribute**
> FilterAttribute deleteFilterAttribute(attributeName, xVolTenant, xVolSite)

Delete Filter Attribute

Deletes a filter attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingSettingsApi apiInstance = new OrderRoutingSettingsApi(defaultClient);
    String attributeName = "attributeName_example"; // String | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      FilterAttribute result = apiInstance.deleteFilterAttribute(attributeName, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingSettingsApi#deleteFilterAttribute");
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
| **attributeName** | **String**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |

### Return type

[**FilterAttribute**](FilterAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="deleteSettings"></a>
# **deleteSettings**
> Boolean deleteSettings(tenantID, xVolTenant, xVolSite, siteID)

Delete Order Routing Settings

Remove order routing settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingSettingsApi apiInstance = new OrderRoutingSettingsApi(defaultClient);
    Integer tenantID = 56; // Integer | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    Integer siteID = 56; // Integer | 
    try {
      Boolean result = apiInstance.deleteSettings(tenantID, xVolTenant, xVolSite, siteID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingSettingsApi#deleteSettings");
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
| **tenantID** | **Integer**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **siteID** | **Integer**|  | [optional] |

### Return type

**Boolean**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getFilterAttribute"></a>
# **getFilterAttribute**
> FilterAttribute getFilterAttribute(attributeName, xVolTenant, xVolSite)

Get Filter Attribute

Retrieve an order routing filter attribute based on its name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingSettingsApi apiInstance = new OrderRoutingSettingsApi(defaultClient);
    String attributeName = "attributeName_example"; // String | 
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    try {
      FilterAttribute result = apiInstance.getFilterAttribute(attributeName, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingSettingsApi#getFilterAttribute");
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
| **attributeName** | **String**|  | |
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |

### Return type

[**FilterAttribute**](FilterAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getFilterAttributes"></a>
# **getFilterAttributes**
> List&lt;FilterAttribute&gt; getFilterAttributes()

Get Filter Attributes

Retrieves a list of order routing filter attributes.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingSettingsApi apiInstance = new OrderRoutingSettingsApi(defaultClient);
    try {
      List<FilterAttribute> result = apiInstance.getFilterAttributes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingSettingsApi#getFilterAttributes");
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

[**List&lt;FilterAttribute&gt;**](FilterAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="getSettings"></a>
# **getSettings**
> OrderRoutingSettings getSettings(xVolTenant, xVolSite, tenantID, siteID, getDefaults)

Get Order Routing Settings

Retrieve a list of order routing settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingSettingsApi apiInstance = new OrderRoutingSettingsApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    Integer tenantID = 56; // Integer | 
    Integer siteID = 56; // Integer | 
    Boolean getDefaults = true; // Boolean | 
    try {
      OrderRoutingSettings result = apiInstance.getSettings(xVolTenant, xVolSite, tenantID, siteID, getDefaults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingSettingsApi#getSettings");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **tenantID** | **Integer**|  | [optional] |
| **siteID** | **Integer**|  | [optional] |
| **getDefaults** | **Boolean**|  | [optional] [default to true] |

### Return type

[**OrderRoutingSettings**](OrderRoutingSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="saveFilterAttribute"></a>
# **saveFilterAttribute**
> FilterAttribute saveFilterAttribute(xVolTenant, xVolSite, filterAttribute)

Save Filter Attribute

Saves an order routing filter attribute.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingSettingsApi apiInstance = new OrderRoutingSettingsApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant
    Integer xVolSite = 56; // Integer | Site
    FilterAttribute filterAttribute = new FilterAttribute(); // FilterAttribute | 
    try {
      FilterAttribute result = apiInstance.saveFilterAttribute(xVolTenant, xVolSite, filterAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingSettingsApi#saveFilterAttribute");
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
| **xVolTenant** | **Integer**| Tenant | |
| **xVolSite** | **Integer**| Site | |
| **filterAttribute** | [**FilterAttribute**](FilterAttribute.md)|  | |

### Return type

[**FilterAttribute**](FilterAttribute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

<a name="saveSettings"></a>
# **saveSettings**
> OrderRoutingSettings saveSettings(orderRoutingSettings)

Save Order Routing Settings

Save order routing settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.orderrouting.ApiClient;
import com.kibocommerce.sdk.orderrouting.ApiException;
import com.kibocommerce.sdk.orderrouting.Configuration;
import com.kibocommerce.sdk.orderrouting.auth.*;
import com.kibocommerce.sdk.orderrouting.models.*;
import com.kibocommerce.sdk.orderrouting.api.OrderRoutingSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    OrderRoutingSettingsApi apiInstance = new OrderRoutingSettingsApi(defaultClient);
    OrderRoutingSettings orderRoutingSettings = new OrderRoutingSettings(); // OrderRoutingSettings | 
    try {
      OrderRoutingSettings result = apiInstance.saveSettings(orderRoutingSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderRoutingSettingsApi#saveSettings");
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
| **orderRoutingSettings** | [**OrderRoutingSettings**](OrderRoutingSettings.md)|  | |

### Return type

[**OrderRoutingSettings**](OrderRoutingSettings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **410** | Gone |  -  |
| **500** | Internal Server Error |  -  |

