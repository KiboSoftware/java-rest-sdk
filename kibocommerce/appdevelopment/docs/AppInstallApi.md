# AppInstallApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApp**](AppInstallApi.md#getApp) | **GET** /platform/appdev/appinstall/application/entitlement/{applicationEntitlementId} | Get Application |
| [**getApps**](AppInstallApi.md#getApps) | **GET** /platform/appdev/appinstall/application/entitlement | Get Applications |
| [**getEntitlementsByApplication**](AppInstallApi.md#getEntitlementsByApplication) | **GET** /platform/appdev/appinstall/applicationversion/{applicationId}/entitlements | Get Entitlements By Application |
| [**getEntitlementsByTenant**](AppInstallApi.md#getEntitlementsByTenant) | **GET** /platform/appdev/appinstall/tenant/{tenantId}/entitlements | Get Entitlements By Tenant |
| [**installApp**](AppInstallApi.md#installApp) | **POST** /platform/appdev/appinstall/application/entitlement | Install Application |
| [**installAppToProductionTenant**](AppInstallApi.md#installAppToProductionTenant) | **POST** /platform/appdev/appinstall/toproductiontenant | Install App To Production Tenant |


<a name="getApp"></a>
# **getApp**
> ApplicationEntitlement getApp(applicationEntitlementId, responseFields)

Get Application

Get a specific application entitlement by  ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppInstallApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppInstallApi apiInstance = new AppInstallApi(defaultClient);
    Integer applicationEntitlementId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ApplicationEntitlement result = apiInstance.getApp(applicationEntitlementId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppInstallApi#getApp");
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
| **applicationEntitlementId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ApplicationEntitlement**](ApplicationEntitlement.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getApps"></a>
# **getApps**
> List&lt;ApplicationEntitlement&gt; getApps(responseFields)

Get Applications

Get a list of installed applications.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppInstallApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppInstallApi apiInstance = new AppInstallApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ApplicationEntitlement> result = apiInstance.getApps(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppInstallApi#getApps");
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

[**List&lt;ApplicationEntitlement&gt;**](ApplicationEntitlement.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getEntitlementsByApplication"></a>
# **getEntitlementsByApplication**
> List&lt;ApplicationEntitlement&gt; getEntitlementsByApplication(applicationId, responseFields)

Get Entitlements By Application

Retrieve a list of entitlements for a specific application.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppInstallApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppInstallApi apiInstance = new AppInstallApi(defaultClient);
    Integer applicationId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ApplicationEntitlement> result = apiInstance.getEntitlementsByApplication(applicationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppInstallApi#getEntitlementsByApplication");
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
| **applicationId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ApplicationEntitlement&gt;**](ApplicationEntitlement.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getEntitlementsByTenant"></a>
# **getEntitlementsByTenant**
> List&lt;ApplicationEntitlement&gt; getEntitlementsByTenant(tenantId, responseFields)

Get Entitlements By Tenant

Get a list of applicaiton entitlements by tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppInstallApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppInstallApi apiInstance = new AppInstallApi(defaultClient);
    Integer tenantId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ApplicationEntitlement> result = apiInstance.getEntitlementsByTenant(tenantId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppInstallApi#getEntitlementsByTenant");
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
| **tenantId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ApplicationEntitlement&gt;**](ApplicationEntitlement.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="installApp"></a>
# **installApp**
> ApplicationEntitlement installApp(responseFields, applicationEntitlement)

Install Application

Install an application entitlement.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppInstallApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppInstallApi apiInstance = new AppInstallApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ApplicationEntitlement applicationEntitlement = new ApplicationEntitlement(); // ApplicationEntitlement | 
    try {
      ApplicationEntitlement result = apiInstance.installApp(responseFields, applicationEntitlement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppInstallApi#installApp");
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
| **applicationEntitlement** | [**ApplicationEntitlement**](ApplicationEntitlement.md)|  | [optional] |

### Return type

[**ApplicationEntitlement**](ApplicationEntitlement.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="installAppToProductionTenant"></a>
# **installAppToProductionTenant**
> ApplicationEntitlement installAppToProductionTenant(responseFields, applicationEntitlement)

Install App To Production Tenant

Install an application to a production tenant.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.AppInstallApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AppInstallApi apiInstance = new AppInstallApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ApplicationEntitlement applicationEntitlement = new ApplicationEntitlement(); // ApplicationEntitlement | 
    try {
      ApplicationEntitlement result = apiInstance.installAppToProductionTenant(responseFields, applicationEntitlement);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppInstallApi#installAppToProductionTenant");
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
| **applicationEntitlement** | [**ApplicationEntitlement**](ApplicationEntitlement.md)|  | [optional] |

### Return type

[**ApplicationEntitlement**](ApplicationEntitlement.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

