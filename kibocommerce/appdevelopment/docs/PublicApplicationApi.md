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

Delete an existing package file.

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAppPackageNames"></a>
# **getAppPackageNames**
> PackageNamesCollection getAppPackageNames(applicationKey, responseFields)

Get App Package Names

Retrieve a list of application package names.

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PackageNamesCollection result = apiInstance.getAppPackageNames(applicationKey, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PackageNamesCollection**](PackageNamesCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAppVersions"></a>
# **getAppVersions**
> ApplicationVersionsCollection getAppVersions(nsAndAppId, responseFields)

Get App Versions

Retrieve a list of application versions.

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String nsAndAppId = "nsAndAppId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ApplicationVersionsCollection result = apiInstance.getAppVersions(nsAndAppId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ApplicationVersionsCollection**](ApplicationVersionsCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPackageFileMetadata"></a>
# **getPackageFileMetadata**
> FileMetadata getPackageFileMetadata(applicationKey, filepath, responseFields)

Get Package File Metadata

Retrieve all package file metadata.

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String filepath = "filepath_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FileMetadata result = apiInstance.getPackageFileMetadata(applicationKey, filepath, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FileMetadata**](FileMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPackageMetadata"></a>
# **getPackageMetadata**
> FolderMetadata getPackageMetadata(applicationKey, responseFields)

Get Package Metadata

Retrieve application package metadata.

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FolderMetadata result = apiInstance.getPackageMetadata(applicationKey, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FolderMetadata**](FolderMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="renamePackageFile"></a>
# **renamePackageFile**
> FileMetadata renamePackageFile(applicationKey, responseFields, renameInfo)

Rename Package File

Rename a package file.

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    RenameInfo renameInfo = new RenameInfo(); // RenameInfo | 
    try {
      FileMetadata result = apiInstance.renamePackageFile(applicationKey, responseFields, renameInfo);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **renameInfo** | [**RenameInfo**](RenameInfo.md)|  | [optional] |

### Return type

[**FileMetadata**](FileMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="upsertPackageFile"></a>
# **upsertPackageFile**
> FileMetadata upsertPackageFile(applicationKey, filepath, lastModifiedTime, responseFields)

Upsert Package File

Update and replace a package file.

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

    PublicApplicationApi apiInstance = new PublicApplicationApi(defaultClient);
    String applicationKey = "applicationKey_example"; // String | 
    String filepath = "filepath_example"; // String | 
    String lastModifiedTime = "lastModifiedTime_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FileMetadata result = apiInstance.upsertPackageFile(applicationKey, filepath, lastModifiedTime, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FileMetadata**](FileMetadata.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

