# MasterCatalogPublishSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMasterCatalog**](MasterCatalogPublishSettingsApi.md#getMasterCatalog) | **GET** /commerce/catalog/admin/mastercatalogs/{masterCatalogId} | Get master catalog |
| [**getMasterCatalogs**](MasterCatalogPublishSettingsApi.md#getMasterCatalogs) | **GET** /commerce/catalog/admin/mastercatalogs | Get master catalogs |
| [**updateMasterCatalog**](MasterCatalogPublishSettingsApi.md#updateMasterCatalog) | **PUT** /commerce/catalog/admin/mastercatalogs/{masterCatalogId} | Update master catalog |


<a name="getMasterCatalog"></a>
# **getMasterCatalog**
> CatalogAdminsMasterCatalog getMasterCatalog(masterCatalogId)

Get master catalog

Get a MasterCatalog

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.MasterCatalogPublishSettingsApi;

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

    MasterCatalogPublishSettingsApi apiInstance = new MasterCatalogPublishSettingsApi(defaultClient);
    Integer masterCatalogId = 56; // Integer | 
    try {
      CatalogAdminsMasterCatalog result = apiInstance.getMasterCatalog(masterCatalogId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MasterCatalogPublishSettingsApi#getMasterCatalog");
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
| **masterCatalogId** | **Integer**|  | |

### Return type

[**CatalogAdminsMasterCatalog**](CatalogAdminsMasterCatalog.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getMasterCatalogs"></a>
# **getMasterCatalogs**
> MasterCatalogCollection getMasterCatalogs()

Get master catalogs



### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.MasterCatalogPublishSettingsApi;

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

    MasterCatalogPublishSettingsApi apiInstance = new MasterCatalogPublishSettingsApi(defaultClient);
    try {
      MasterCatalogCollection result = apiInstance.getMasterCatalogs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MasterCatalogPublishSettingsApi#getMasterCatalogs");
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

[**MasterCatalogCollection**](MasterCatalogCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateMasterCatalog"></a>
# **updateMasterCatalog**
> CatalogAdminsMasterCatalog updateMasterCatalog(masterCatalogId, catalogAdminsMasterCatalog)

Update master catalog

Update the publishingMode of a MasterCatalog

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.MasterCatalogPublishSettingsApi;

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

    MasterCatalogPublishSettingsApi apiInstance = new MasterCatalogPublishSettingsApi(defaultClient);
    Integer masterCatalogId = 56; // Integer | 
    CatalogAdminsMasterCatalog catalogAdminsMasterCatalog = new CatalogAdminsMasterCatalog(); // CatalogAdminsMasterCatalog | 
    try {
      CatalogAdminsMasterCatalog result = apiInstance.updateMasterCatalog(masterCatalogId, catalogAdminsMasterCatalog);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MasterCatalogPublishSettingsApi#updateMasterCatalog");
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
| **masterCatalogId** | **Integer**|  | |
| **catalogAdminsMasterCatalog** | [**CatalogAdminsMasterCatalog**](CatalogAdminsMasterCatalog.md)|  | [optional] |

### Return type

[**CatalogAdminsMasterCatalog**](CatalogAdminsMasterCatalog.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

