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
> ExportSettingsResponse createExportSettings(createExportSettingsRequest)

Create Export Settings

Creates entirely new export configurations for both FTP and S3 settings. This call allows you to specify all the values for the Export Settings object, such as file type and specific location groups or sites (which cannot be edited through FTP- or S3-specific endpoints). This is the initial setup request required to configure inventory export.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    CreateExportSettingsRequest createExportSettingsRequest = new CreateExportSettingsRequest(); // CreateExportSettingsRequest | Request to create a new Export Settings
    try {
      ExportSettingsResponse result = apiInstance.createExportSettings(createExportSettingsRequest);
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
| **createExportSettingsRequest** | [**CreateExportSettingsRequest**](CreateExportSettingsRequest.md)| Request to create a new Export Settings | |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

No authorization required

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
> ExportSettingsResponse createExportSettingsFTP(createExportSettingsFTPRequest)

Create Export Settings FTP

Creates new FTP settings and adds them to an existing Export Settings object, which may be useful if you want the export to go to a new endpoint instead of the one originally set up (or if the export needs to go to multiple endpoints). This call will not function unless you have performed the initial Create Export Settings request first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    CreateExportSettingsFTPRequest createExportSettingsFTPRequest = new CreateExportSettingsFTPRequest(); // CreateExportSettingsFTPRequest | Request to create a new Export Settings FTP
    try {
      ExportSettingsResponse result = apiInstance.createExportSettingsFTP(createExportSettingsFTPRequest);
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
| **createExportSettingsFTPRequest** | [**CreateExportSettingsFTPRequest**](CreateExportSettingsFTPRequest.md)| Request to create a new Export Settings FTP | |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

No authorization required

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
> ExportSettingsResponse createExportSettingsS3(createExportSettingsS3Request)

Create Export Settings S3

Creates new S3 settings and adds them to an existing Export Settings object, which may be useful if you want the export to go to a new endpoint instead of the one originally set up (or if the export needs to go to multiple endpoints). This call will not function unless you have performed the initial Create Export Settings request first.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    CreateExportSettingsS3Request createExportSettingsS3Request = new CreateExportSettingsS3Request(); // CreateExportSettingsS3Request | Request to create a new Export Settings S3
    try {
      ExportSettingsResponse result = apiInstance.createExportSettingsS3(createExportSettingsS3Request);
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
| **createExportSettingsS3Request** | [**CreateExportSettingsS3Request**](CreateExportSettingsS3Request.md)| Request to create a new Export Settings S3 | |

### Return type

[**ExportSettingsResponse**](ExportSettingsResponse.md)

### Authorization

No authorization required

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
> DeletedCountResponse deleteExportSettings(exportSettingsName)

Delete Export Settings

Deletes the entire Export Settings object, including any FTP or S3 configurations within it.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    try {
      DeletedCountResponse result = apiInstance.deleteExportSettings(exportSettingsName);
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
| **exportSettingsName** | **String**| Export Settings Name | |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

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
> DeletedCountResponse deleteExportSettingsFTP(exportSettingsName, exportSettingsFTPName)

Delete Export Settings FTP

Deletes the specified FTP settings object. Not specifying the FTP Name/ID will delete all FTP settings within the Export Settings. This will not delete the entire Export Settings object.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    String exportSettingsFTPName = "exportSettingsFTPName_example"; // String | Export Settings FTP Name
    try {
      DeletedCountResponse result = apiInstance.deleteExportSettingsFTP(exportSettingsName, exportSettingsFTPName);
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
| **exportSettingsName** | **String**| Export Settings Name | |
| **exportSettingsFTPName** | **String**| Export Settings FTP Name | |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

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
> DeletedCountResponse deleteExportSettingsS3(exportSettingsName, exportSettingsS3Name)

Delete Export Settings S3

Deletes the specified S3 settings object. Not specifying the S3 Name/ID will delete all S3 settings within the Export Settings. This will not delete the entire Export Settings object.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    String exportSettingsS3Name = "exportSettingsS3Name_example"; // String | Export Settings S3 Name
    try {
      DeletedCountResponse result = apiInstance.deleteExportSettingsS3(exportSettingsName, exportSettingsS3Name);
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
| **exportSettingsName** | **String**| Export Settings Name | |
| **exportSettingsS3Name** | **String**| Export Settings S3 Name | |

### Return type

[**DeletedCountResponse**](DeletedCountResponse.md)

### Authorization

No authorization required

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
> List&lt;GetExportSettingsResponse&gt; getExportSettings(exportSettingsName)

Get Export Settings

Get an export settings

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    String exportSettingsName = "exportSettingsName_example"; // String | Export Settings Name
    try {
      List<GetExportSettingsResponse> result = apiInstance.getExportSettings(exportSettingsName);
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
| **exportSettingsName** | **String**| Export Settings Name | [optional] |

### Return type

[**List&lt;GetExportSettingsResponse&gt;**](GetExportSettingsResponse.md)

### Authorization

No authorization required

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
> ExportInventoryResponse runExport(exportInventoryRequest)

Run Export

Run Export Settings Job

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    ExportInventoryRequest exportInventoryRequest = new ExportInventoryRequest(); // ExportInventoryRequest | Request to run an inventory export
    try {
      ExportInventoryResponse result = apiInstance.runExport(exportInventoryRequest);
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
| **exportInventoryRequest** | [**ExportInventoryRequest**](ExportInventoryRequest.md)| Request to run an inventory export | |

### Return type

[**ExportInventoryResponse**](ExportInventoryResponse.md)

### Authorization

No authorization required

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
> UpdateExportSettingsResponse updateExportSettings(updateExportSettingsRequest)

Update Export Settings

Updates the entire Export Settings object, including FTP and S3 configurations as well as file type and specific location groups or sites (which cannot be edited through FTP- or S3-specific endpoints).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    UpdateExportSettingsRequest updateExportSettingsRequest = new UpdateExportSettingsRequest(); // UpdateExportSettingsRequest | Request to update an existing Export Settings
    try {
      UpdateExportSettingsResponse result = apiInstance.updateExportSettings(updateExportSettingsRequest);
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
| **updateExportSettingsRequest** | [**UpdateExportSettingsRequest**](UpdateExportSettingsRequest.md)| Request to update an existing Export Settings | |

### Return type

[**UpdateExportSettingsResponse**](UpdateExportSettingsResponse.md)

### Authorization

No authorization required

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
> UpdateExportSettingsFTPResponse updateExportSettingsFTP(updateExportSettingsFTPRequest)

Update Export Settings FTP

Updates the FTP settings within an existing Export Settings object.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    UpdateExportSettingsFTPRequest updateExportSettingsFTPRequest = new UpdateExportSettingsFTPRequest(); // UpdateExportSettingsFTPRequest | Request to update an existing Export Settings FTP
    try {
      UpdateExportSettingsFTPResponse result = apiInstance.updateExportSettingsFTP(updateExportSettingsFTPRequest);
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
| **updateExportSettingsFTPRequest** | [**UpdateExportSettingsFTPRequest**](UpdateExportSettingsFTPRequest.md)| Request to update an existing Export Settings FTP | |

### Return type

[**UpdateExportSettingsFTPResponse**](UpdateExportSettingsFTPResponse.md)

### Authorization

No authorization required

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
> UpdateExportSettingsS3Response updateExportSettingsS3(updateExportSettingsS3Request)

Update Export Settings S3

Updates the S3 settings within an existing Export Settings object. Note that you cannot update location groups or sites with this request - you must use the full Update Export Settings request instead.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.ExportInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ExportInventoryApi apiInstance = new ExportInventoryApi(defaultClient);
    UpdateExportSettingsS3Request updateExportSettingsS3Request = new UpdateExportSettingsS3Request(); // UpdateExportSettingsS3Request | Request to update an existing Export Settings S3
    try {
      UpdateExportSettingsS3Response result = apiInstance.updateExportSettingsS3(updateExportSettingsS3Request);
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
| **updateExportSettingsS3Request** | [**UpdateExportSettingsS3Request**](UpdateExportSettingsS3Request.md)| Request to update an existing Export Settings S3 | |

### Return type

[**UpdateExportSettingsS3Response**](UpdateExportSettingsS3Response.md)

### Authorization

No authorization required

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

