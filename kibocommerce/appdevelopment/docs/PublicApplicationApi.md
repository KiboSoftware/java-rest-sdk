# PublicApplicationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePackageFile**](PublicApplicationApi.md#deletePackageFile) | **DELETE** /platform/developer/packages/{applicationKey}/files/{filepath} | Delete Package File |
| [**getAppPackageNames**](PublicApplicationApi.md#getAppPackageNames) | **GET** /platform/developer/applications/{applicationKey}/packagenames | Get App Package Names |
| [**getAppVersions**](PublicApplicationApi.md#getAppVersions) | **GET** /platform/developer/applications/versions/{nsAndAppId} | Get App Versions |
| [**getPackageFileMetadata**](PublicApplicationApi.md#getPackageFileMetadata) | **GET** /platform/developer/packages/{applicationKey}/filemetadata/{filepath} | Get Package File Metadata |
| [**getPackageMetadata**](PublicApplicationApi.md#getPackageMetadata) | **GET** /platform/developer/packages/{applicationKey}/metadata | Get Package Metadata |
| [**renamePackageFile**](PublicApplicationApi.md#renamePackageFile) | **POST** /platform/developer/packages/{applicationKey}/files_rename | Rename Package File |
| [**upsertPackageFile**](PublicApplicationApi.md#upsertPackageFile) | **POST** /platform/developer/packages/{applicationKey}/files/{filepath} | Upsert Package File |


<a name="deletePackageFile"></a>
# **deletePackageFile**
> deletePackageFile(applicationKey, filepath)

Delete Package File



### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PublicApplicationApi;

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String filepath = "filepath_example"; // String | 
    try {
      apiInstance.deletePackageFile(applicationKey, filepath);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApplicationApi#deletePackageFile");
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
| **filepath** | **String**|  | |

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

<a name="getAppPackageNames"></a>
# **getAppPackageNames**
> PackageNamesCollection getAppPackageNames(applicationKey)

Get App Package Names



### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PublicApplicationApi;

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    try {
      PackageNamesCollection result = apiInstance.getAppPackageNames(applicationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApplicationApi#getAppPackageNames");
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

[**PackageNamesCollection**](PackageNamesCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAppVersions"></a>
# **getAppVersions**
> ApplicationVersionsCollection getAppVersions(nsAndAppId)

Get App Versions



### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PublicApplicationApi;

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String nsAndAppId = "nsAndAppId_example"; // String | 
    try {
      ApplicationVersionsCollection result = apiInstance.getAppVersions(nsAndAppId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApplicationApi#getAppVersions");
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
| **nsAndAppId** | **String**|  | |

### Return type

[**ApplicationVersionsCollection**](ApplicationVersionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPackageFileMetadata"></a>
# **getPackageFileMetadata**
> FileMetadata getPackageFileMetadata(applicationKey, filepath)

Get Package File Metadata



### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PublicApplicationApi;

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String filepath = "filepath_example"; // String | 
    try {
      FileMetadata result = apiInstance.getPackageFileMetadata(applicationKey, filepath);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApplicationApi#getPackageFileMetadata");
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
| **filepath** | **String**|  | |

### Return type

[**FileMetadata**](FileMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPackageMetadata"></a>
# **getPackageMetadata**
> FolderMetadata getPackageMetadata(applicationKey)

Get Package Metadata



### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PublicApplicationApi;

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    try {
      FolderMetadata result = apiInstance.getPackageMetadata(applicationKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApplicationApi#getPackageMetadata");
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

[**FolderMetadata**](FolderMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="renamePackageFile"></a>
# **renamePackageFile**
> FileMetadata renamePackageFile(applicationKey, renameInfo)

Rename Package File



### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PublicApplicationApi;

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    RenameInfo renameInfo = new RenameInfo(); // RenameInfo | 
    try {
      FileMetadata result = apiInstance.renamePackageFile(applicationKey, renameInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApplicationApi#renamePackageFile");
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
| **renameInfo** | [**RenameInfo**](RenameInfo.md)|  | [optional] |

### Return type

[**FileMetadata**](FileMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="upsertPackageFile"></a>
# **upsertPackageFile**
> FileMetadata upsertPackageFile(applicationKey, filepath, lastModifiedTime)

Upsert Package File



### Example
```java
// Import classes:
import com.kibocommerce.sdk.appdevelopment.ApiClient;
import com.kibocommerce.sdk.appdevelopment.ApiException;
import com.kibocommerce.sdk.appdevelopment.Configuration;
import com.kibocommerce.sdk.appdevelopment.auth.*;
import com.kibocommerce.sdk.appdevelopment.models.*;
import com.kibocommerce.sdk.appdevelopment.api.PublicApplicationApi;

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String filepath = "filepath_example"; // String | 
    String lastModifiedTime = "lastModifiedTime_example"; // String | 
    try {
      FileMetadata result = apiInstance.upsertPackageFile(applicationKey, filepath, lastModifiedTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApplicationApi#upsertPackageFile");
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
| **filepath** | **String**|  | |
| **lastModifiedTime** | **String**|  | [optional] |

### Return type

[**FileMetadata**](FileMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

