# PackageApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clonePackage**](PackageApi.md#clonePackage) | **POST** /platform/appdev/apppackages/{applicationKey}/clone/{packageName} | Clone Package |
| [**createNewCorePackage**](PackageApi.md#createNewCorePackage) | **POST** /platform/appdev/apppackages/create | Create New Core Package |
| [**createPackage**](PackageApi.md#createPackage) | **POST** /platform/appdev/apppackages/project | Create Package |
| [**deletePackage**](PackageApi.md#deletePackage) | **DELETE** /platform/appdev/apppackages/{applicationKey} | Delete Package |
| [**getAllPackages**](PackageApi.md#getAllPackages) | **GET** /platform/appdev/apppackages | Get All Packages |
| [**getApplicationSummaryChildren**](PackageApi.md#getApplicationSummaryChildren) | **GET** /platform/appdev/apppackages/apps/{appId} | Get Application Summary Children |
| [**getApplicationSummaryParents**](PackageApi.md#getApplicationSummaryParents) | **GET** /platform/appdev/apppackages/collection | Get Application Summary Parents |
| [**getPackage**](PackageApi.md#getPackage) | **GET** /platform/appdev/apppackages/{applicationKey} | Get Package |
| [**getPackages**](PackageApi.md#getPackages) | **GET** /platform/appdev/apppackages/applications/{applicationKey}/packages | Get Packages |
| [**updatePackage**](PackageApi.md#updatePackage) | **PUT** /platform/appdev/apppackages/{applicationKey} | Update Package |


<a name="clonePackage"></a>
# **clonePackage**
> AppDevPackage clonePackage(applicationKey, packageName)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String packageName = "packageName_example"; // String | 
    try {
      AppDevPackage result = apiInstance.clonePackage(applicationKey, packageName);
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

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createNewCorePackage"></a>
# **createNewCorePackage**
> AppDevPackage createNewCorePackage(packageRequest)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    PackageRequest packageRequest = new PackageRequest(); // PackageRequest | 
    try {
      AppDevPackage result = apiInstance.createNewCorePackage(packageRequest);
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
| **packageRequest** | [**PackageRequest**](PackageRequest.md)|  | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createPackage"></a>
# **createPackage**
> AppDevPackage createPackage(projectId, appDevPackage)

Create Package



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    Integer projectId = 56; // Integer | 
    AppDevPackage appDevPackage = new AppDevPackage(); // AppDevPackage | 
    try {
      AppDevPackage result = apiInstance.createPackage(projectId, appDevPackage);
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
| **appDevPackage** | [**AppDevPackage**](AppDevPackage.md)|  | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deletePackage"></a>
# **deletePackage**
> deletePackage(applicationKey)

Delete Package

Use thi operatin to logically delete a package.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    try {
      apiInstance.deletePackage(applicationKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#deletePackage");
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

<a name="getAllPackages"></a>
# **getAllPackages**
> PackageSummaryCollection getAllPackages(startIndex, pageSize, sortBy, filter)

Get All Packages

Get all packages for a given Developer Account.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      PackageSummaryCollection result = apiInstance.getAllPackages(startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#getAllPackages");
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

### Return type

[**PackageSummaryCollection**](PackageSummaryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getApplicationSummaryChildren"></a>
# **getApplicationSummaryChildren**
> List&lt;ApplicationSummary&gt; getApplicationSummaryChildren(appId)

Get Application Summary Children



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      List<ApplicationSummary> result = apiInstance.getApplicationSummaryChildren(appId);
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

### Return type

[**List&lt;ApplicationSummary&gt;**](ApplicationSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getApplicationSummaryParents"></a>
# **getApplicationSummaryParents**
> ApplicationSummaryCollection getApplicationSummaryParents(startIndex, pageSize, sortBy, filter)

Get Application Summary Parents



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 20; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      ApplicationSummaryCollection result = apiInstance.getApplicationSummaryParents(startIndex, pageSize, sortBy, filter);
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

### Return type

[**ApplicationSummaryCollection**](ApplicationSummaryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPackage"></a>
# **getPackage**
> AppDevPackage getPackage(applicationKey, includeChildren, skipDevAccountCheck)

Get Package

Use this operation to retrieve the package for the requested  package and its associated application core information.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    Boolean includeChildren = false; // Boolean | 
    Boolean skipDevAccountCheck = false; // Boolean | 
    try {
      AppDevPackage result = apiInstance.getPackage(applicationKey, includeChildren, skipDevAccountCheck);
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

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPackages"></a>
# **getPackages**
> PackageCollection getPackages(applicationKey, startIndex, pageSize, sortBy, filter)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 50; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      PackageCollection result = apiInstance.getPackages(applicationKey, startIndex, pageSize, sortBy, filter);
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

### Return type

[**PackageCollection**](PackageCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updatePackage"></a>
# **updatePackage**
> AppDevPackage updatePackage(applicationKey, appDevPackage)

Update Package



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    PackageApi apiInstance = new PackageApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    AppDevPackage appDevPackage = new AppDevPackage(); // AppDevPackage | 
    try {
      AppDevPackage result = apiInstance.updatePackage(applicationKey, appDevPackage);
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
| **appDevPackage** | [**AppDevPackage**](AppDevPackage.md)|  | [optional] |

### Return type

[**AppDevPackage**](AppDevPackage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

