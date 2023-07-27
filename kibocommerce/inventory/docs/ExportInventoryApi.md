# ExportInventoryApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExportSettings**](ExportInventoryApi.md#createExportSettings) | **POST** /commerce/inventory/v1/export/create | Create Export Settings |
| [**createExportSettingsFTP**](ExportInventoryApi.md#createExportSettingsFTP) | **POST** /commerce/inventory/v1/export/ftp/create | Create Export Settings FTP |
| [**createExportSettingsS3**](ExportInventoryApi.md#createExportSettingsS3) | **POST** /commerce/inventory/v1/export/s3/create | Create Export Settings S3 |
| [**deleteExportSettings**](ExportInventoryApi.md#deleteExportSettings) | **DELETE** /commerce/inventory/v1/export/{exportSettingsName} | Delete Export Settings |
| [**deleteExportSettingsFTP**](ExportInventoryApi.md#deleteExportSettingsFTP) | **DELETE** /commerce/inventory/v1/export/ftp/{exportSettingsName}/{exportSettingsFTPName} | Delete Export Settings FTP |
| [**deleteExportSettingsS3**](ExportInventoryApi.md#deleteExportSettingsS3) | **DELETE** /commerce/inventory/v1/export/s3/{exportSettingsName}/{exportSettingsS3Name} | Delete Export Settings S3 |
| [**getExportSettings**](ExportInventoryApi.md#getExportSettings) | **GET** /commerce/inventory/v1/export | Get Export Settings |
| [**runExport**](ExportInventoryApi.md#runExport) | **POST** /commerce/inventory/v1/export | Run Export |
| [**updateExportSettings**](ExportInventoryApi.md#updateExportSettings) | **POST** /commerce/inventory/v1/export/update | Update Export Settings |
| [**updateExportSettingsFTP**](ExportInventoryApi.md#updateExportSettingsFTP) | **POST** /commerce/inventory/v1/export/ftp/update | Update Export Settings FTP |
| [**updateExportSettingsS3**](ExportInventoryApi.md#updateExportSettingsS3) | **POST** /commerce/inventory/v1/export/s3/update | Update Export Settings S3 |


<a name="createExportSettings"></a>
# **createExportSettings**
> ExportSettingsResponse createExportSettings(xVolTenant, createExportSettingsRequest)

Create Export Settings

Create an Export Settings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    CreateExportSettingsRequest createExportSettingsRequest = new CreateExportSettingsRequest(); // CreateExportSettingsRequest | Request to create a new Export Settings
    try {
      ExportSettingsResponse result = apiInstance.createExportSettings(xVolTenant, createExportSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#createExportSettings");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **createExportSettingsRequest** | [**CreateExportSettingsRequest**](CreateExportSettingsRequest.md)| Request to create a new Export Settings | |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Service Error |  -  |

<a name="createExportSettingsFTP"></a>
# **createExportSettingsFTP**
> ExportSettingsResponse createExportSettingsFTP(xVolTenant, createExportSettingsFTPRequest)

Create Export Settings FTP

Create an Export Settings FTP

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    CreateExportSettingsFTPRequest createExportSettingsFTPRequest = new CreateExportSettingsFTPRequest(); // CreateExportSettingsFTPRequest | Request to create a new Export Settings FTP
    try {
      ExportSettingsResponse result = apiInstance.createExportSettingsFTP(xVolTenant, createExportSettingsFTPRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#createExportSettingsFTP");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **createExportSettingsFTPRequest** | [**CreateExportSettingsFTPRequest**](CreateExportSettingsFTPRequest.md)| Request to create a new Export Settings FTP | |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Service Error |  -  |

<a name="createExportSettingsS3"></a>
# **createExportSettingsS3**
> ExportSettingsResponse createExportSettingsS3(xVolTenant, createExportSettingsS3Request)

Create Export Settings S3

Create an Export Settings S3

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    CreateExportSettingsS3Request createExportSettingsS3Request = new CreateExportSettingsS3Request(); // CreateExportSettingsS3Request | Request to create a new Export Settings S3
    try {
      ExportSettingsResponse result = apiInstance.createExportSettingsS3(xVolTenant, createExportSettingsS3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#createExportSettingsS3");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **createExportSettingsS3Request** | [**CreateExportSettingsS3Request**](CreateExportSettingsS3Request.md)| Request to create a new Export Settings S3 | |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Service Error |  -  |

<a name="deleteExportSettings"></a>
# **deleteExportSettings**
> DeletedCountResponse deleteExportSettings(xVolTenant, exportSettingsName)

Delete Export Settings

Deletes an Export Settings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    try {
      DeletedCountResponse result = apiInstance.deleteExportSettings(xVolTenant, exportSettingsName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#deleteExportSettings");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **exportSettingsName** | **String**| Export Settings Name | |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="deleteExportSettingsFTP"></a>
# **deleteExportSettingsFTP**
> DeletedCountResponse deleteExportSettingsFTP(xVolTenant, exportSettingsName, exportSettingsFTPName)

Delete Export Settings FTP

Deletes an Export Settings FTP. Not specifying exportSettingsFTPID deletes ALL ftp settings for the specified export settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    String exportSettingsFTPName = "exportSettingsFTPName_example"; // String | Export Settings FTP Name
    try {
      DeletedCountResponse result = apiInstance.deleteExportSettingsFTP(xVolTenant, exportSettingsName, exportSettingsFTPName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#deleteExportSettingsFTP");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **exportSettingsName** | **String**| Export Settings Name | |
| **exportSettingsFTPName** | **String**| Export Settings FTP Name | [optional] |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="deleteExportSettingsS3"></a>
# **deleteExportSettingsS3**
> DeletedCountResponse deleteExportSettingsS3(xVolTenant, exportSettingsName, exportSettingsS3Name)

Delete Export Settings S3

Deletes an Export Settings S3. Not specifying exportSettingsS3ID deletes ALL s3 settings for the specified export settings.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    String exportSettingsS3Name = "exportSettingsS3Name_example"; // String | Export Settings S3 Name
    try {
      DeletedCountResponse result = apiInstance.deleteExportSettingsS3(xVolTenant, exportSettingsName, exportSettingsS3Name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#deleteExportSettingsS3");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **exportSettingsName** | **String**| Export Settings Name | |
| **exportSettingsS3Name** | **String**| Export Settings S3 Name | [optional] |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="getExportSettings"></a>
# **getExportSettings**
> List&lt;GetExportSettingsResponse&gt; getExportSettings(xVolTenant, exportSettingsName)

Get Export Settings

Get an export settings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    try {
      List<GetExportSettingsResponse> result = apiInstance.getExportSettings(xVolTenant, exportSettingsName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#getExportSettings");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **exportSettingsName** | **String**| Export Settings Name | |

### Return type

[**List&lt;GetExportSettingsResponse&gt;**](GetExportSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Export Setting Not Found |  -  |

<a name="runExport"></a>
# **runExport**
> ExportInventoryResponse runExport(xVolTenant, exportInventoryRequest)

Run Export

Run Export Settings Job

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    ExportInventoryRequest exportInventoryRequest = new ExportInventoryRequest(); // ExportInventoryRequest | Request to run an inventory export
    try {
      ExportInventoryResponse result = apiInstance.runExport(xVolTenant, exportInventoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#runExport");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **exportInventoryRequest** | [**ExportInventoryRequest**](ExportInventoryRequest.md)| Request to run an inventory export | |

### Return type

[**ExportInventoryResponse**](ExportInventoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Service Error |  -  |

<a name="updateExportSettings"></a>
# **updateExportSettings**
> UpdateExportSettingsResponse updateExportSettings(xVolTenant, updateExportSettingsRequest)

Update Export Settings

Update an Export Settings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    UpdateExportSettingsRequest updateExportSettingsRequest = new UpdateExportSettingsRequest(); // UpdateExportSettingsRequest | Request to update an existing Export Settings
    try {
      UpdateExportSettingsResponse result = apiInstance.updateExportSettings(xVolTenant, updateExportSettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#updateExportSettings");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **updateExportSettingsRequest** | [**UpdateExportSettingsRequest**](UpdateExportSettingsRequest.md)| Request to update an existing Export Settings | |

### Return type

[**UpdateExportSettingsResponse**](UpdateExportSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | No Settings Found |  -  |
| **500** | Internal Service Error |  -  |

<a name="updateExportSettingsFTP"></a>
# **updateExportSettingsFTP**
> UpdateExportSettingsFTPResponse updateExportSettingsFTP(xVolTenant, updateExportSettingsFTPRequest)

Update Export Settings FTP

Update an Export Settings FTP

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    UpdateExportSettingsFTPRequest updateExportSettingsFTPRequest = new UpdateExportSettingsFTPRequest(); // UpdateExportSettingsFTPRequest | Request to update an existing Export Settings FTP
    try {
      UpdateExportSettingsFTPResponse result = apiInstance.updateExportSettingsFTP(xVolTenant, updateExportSettingsFTPRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#updateExportSettingsFTP");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **updateExportSettingsFTPRequest** | [**UpdateExportSettingsFTPRequest**](UpdateExportSettingsFTPRequest.md)| Request to update an existing Export Settings FTP | |

### Return type

[**UpdateExportSettingsFTPResponse**](UpdateExportSettingsFTPResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | No Settings Found |  -  |
| **500** | Internal Service Error |  -  |

<a name="updateExportSettingsS3"></a>
# **updateExportSettingsS3**
> UpdateExportSettingsS3Response updateExportSettingsS3(xVolTenant, updateExportSettingsS3Request)

Update Export Settings S3

Update an Export Settings S3

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

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

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    UpdateExportSettingsS3Request updateExportSettingsS3Request = new UpdateExportSettingsS3Request(); // UpdateExportSettingsS3Request | Request to update an existing Export Settings S3
    try {
      UpdateExportSettingsS3Response result = apiInstance.updateExportSettingsS3(xVolTenant, updateExportSettingsS3Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportInventoryApi#updateExportSettingsS3");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **updateExportSettingsS3Request** | [**UpdateExportSettingsS3Request**](UpdateExportSettingsS3Request.md)| Request to update an existing Export Settings S3 | |

### Return type

[**UpdateExportSettingsS3Response**](UpdateExportSettingsS3Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | No Settings Found |  -  |
| **500** | Internal Service Error |  -  |

