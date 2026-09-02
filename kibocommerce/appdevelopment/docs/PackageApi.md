# PackageApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clonePackage**](PackageApi.md#clonePackage) | **POST** /platform/appdev/apppackages/{applicationKey}/clone/{packageName} | Clone Package |
| [**createNewCorePackage**](PackageApi.md#createNewCorePackage) | **POST** /platform/appdev/apppackages/create | Create New Core Package |
| [**createPackage**](PackageApi.md#createPackage) | **POST** /platform/appdev/apppackages/project | Create Package |
| [**getApplicationSummaryChildren**](PackageApi.md#getApplicationSummaryChildren) | **GET** /platform/appdev/apppackages/apps/{appId} | Get Application Summary Children |
| [**getApplicationSummaryParents**](PackageApi.md#getApplicationSummaryParents) | **GET** /platform/appdev/apppackages/collection | Get Application Summary Parents |
| [**getPackage**](PackageApi.md#getPackage) | **GET** /platform/appdev/apppackages/{applicationKey} | Get Package |
| [**getPackageBehaviors**](PackageApi.md#getPackageBehaviors) | **GET** /platform/appdev/apppackages/{packageId}/behaviors | Get Package Behaviors |
| [**getPackages**](PackageApi.md#getPackages) | **GET** /platform/appdev/apppackages/applications/{applicationKey}/packages | Get Packages |
| [**updatePackage**](PackageApi.md#updatePackage) | **PUT** /platform/appdev/apppackages/{applicationKey} | Update Package |
| [**updatePackageBehaviors**](PackageApi.md#updatePackageBehaviors) | **POST** /platform/appdev/apppackages/{packageId}/behaviors | Update Package Behaviors |


<a name="clonePackage"></a>
# **clonePackage**
> AppDevPackage clonePackage(applicationKey, packageName, responseFields)

Clone Package

Use this operation to clone an existing package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String packageName = "packageName_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AppDevPackage result = apiInstance.clonePackage(applicationKey, packageName, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#clonePackage");
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
| **applicationKey** | **String**|  | |
| **packageName** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createNewCorePackage"></a>
# **createNewCorePackage**
> AppDevPackage createNewCorePackage(responseFields, packageRequest)

Create New Core Package

Save as new version of the application core with only a release package included.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    PackageRequest packageRequest = new PackageRequest(); // PackageRequest | 
    try {
      AppDevPackage result = apiInstance.createNewCorePackage(responseFields, packageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#createNewCorePackage");
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
| **packageRequest** | [**PackageRequest**](PackageRequest.md)|  | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createPackage"></a>
# **createPackage**
> AppDevPackage createPackage(projectId, responseFields, appDevPackage)

Create Package

Create a new application package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    Integer projectId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AppDevPackage appDevPackage = new AppDevPackage(); // AppDevPackage | 
    try {
      AppDevPackage result = apiInstance.createPackage(projectId, responseFields, appDevPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#createPackage");
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
| **projectId** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **appDevPackage** | [**AppDevPackage**](AppDevPackage.md)|  | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getApplicationSummaryChildren"></a>
# **getApplicationSummaryChildren**
> List&lt;ApplicationSummary&gt; getApplicationSummaryChildren(appId, responseFields)

Get Application Summary Children

Get a list of application summaries.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String appId = "appId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<ApplicationSummary> result = apiInstance.getApplicationSummaryChildren(appId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#getApplicationSummaryChildren");
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
| **appId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;ApplicationSummary&gt;**](ApplicationSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getApplicationSummaryParents"></a>
# **getApplicationSummaryParents**
> ApplicationSummaryCollection getApplicationSummaryParents(startIndex, pageSize, sortBy, filter, responseFields)

Get Application Summary Parents

Get a collection of application summaries.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ApplicationSummaryCollection result = apiInstance.getApplicationSummaryParents(startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#getApplicationSummaryParents");
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
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ApplicationSummaryCollection**](ApplicationSummaryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPackage"></a>
# **getPackage**
> AppDevPackage getPackage(applicationKey, includeChildren, skipDevAccountCheck, includeNonCertifiedPackages, responseFields)

Get Package

Retrieve a package and its associated application.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    Boolean includeChildren = false; // Boolean | 
    Boolean skipDevAccountCheck = false; // Boolean | 
    Boolean includeNonCertifiedPackages = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AppDevPackage result = apiInstance.getPackage(applicationKey, includeChildren, skipDevAccountCheck, includeNonCertifiedPackages, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#getPackage");
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
| **applicationKey** | **String**|  | |
| **includeChildren** | **Boolean**|  | [optional] [default to false] |
| **skipDevAccountCheck** | **Boolean**|  | [optional] [default to false] |
| **includeNonCertifiedPackages** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPackageBehaviors"></a>
# **getPackageBehaviors**
> BehaviorCategoryBehaviorCollection getPackageBehaviors(packageId, responseFields)

Get Package Behaviors

Retrieve a list of application package behaviors.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    Integer packageId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BehaviorCategoryBehaviorCollection result = apiInstance.getPackageBehaviors(packageId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#getPackageBehaviors");
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
| **packageId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BehaviorCategoryBehaviorCollection**](BehaviorCategoryBehaviorCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPackages"></a>
# **getPackages**
> PackageCollection getPackages(applicationKey, startIndex, pageSize, sortBy, filter, responseFields)

Get Packages

Use this operation to retieve all packages for a given applicationKey.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 50; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PackageCollection result = apiInstance.getPackages(applicationKey, startIndex, pageSize, sortBy, filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#getPackages");
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
| **applicationKey** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 50] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PackageCollection**](PackageCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePackage"></a>
# **updatePackage**
> AppDevPackage updatePackage(applicationKey, responseFields, appDevPackage)

Update Package

Update an application package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AppDevPackage appDevPackage = new AppDevPackage(); // AppDevPackage | 
    try {
      AppDevPackage result = apiInstance.updatePackage(applicationKey, responseFields, appDevPackage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#updatePackage");
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
| **applicationKey** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **appDevPackage** | [**AppDevPackage**](AppDevPackage.md)|  | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updatePackageBehaviors"></a>
# **updatePackageBehaviors**
> BehaviorCategoryBehaviorCollection updatePackageBehaviors(packageId, responseFields, applicationBehavior)

Update Package Behaviors

Update a package&#39;s behaviors.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PackageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    Integer packageId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ApplicationBehavior> applicationBehavior = Arrays.asList(); // List<ApplicationBehavior> | 
    try {
      BehaviorCategoryBehaviorCollection result = apiInstance.updatePackageBehaviors(packageId, responseFields, applicationBehavior);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#updatePackageBehaviors");
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
| **packageId** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **applicationBehavior** | [**List&lt;ApplicationBehavior&gt;**](ApplicationBehavior.md)|  | [optional] |

### Return type

[**BehaviorCategoryBehaviorCollection**](BehaviorCategoryBehaviorCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

