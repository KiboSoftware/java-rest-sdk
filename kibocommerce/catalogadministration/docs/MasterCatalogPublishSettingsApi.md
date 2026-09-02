# MasterCatalogPublishSettingsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMasterCatalog**](MasterCatalogPublishSettingsApi.md#getMasterCatalog) | **GET** /commerce/catalog/admin/mastercatalogs/{masterCatalogId} | Get Master Catalog |
| [**getMasterCatalogs**](MasterCatalogPublishSettingsApi.md#getMasterCatalogs) | **GET** /commerce/catalog/admin/mastercatalogs | Get Master Catalogs |
| [**updateMasterCatalog**](MasterCatalogPublishSettingsApi.md#updateMasterCatalog) | **PUT** /commerce/catalog/admin/mastercatalogs/{masterCatalogId} | Update Master Catalog |


<a name="getMasterCatalog"></a>
# **getMasterCatalog**
> CatalogAdminsMasterCatalog getMasterCatalog(masterCatalogId, responseFields)

Get Master Catalog

Retrieves a specific master catalog by its Id.

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

    MasterCatalogPublishSettingsApi apiInstance = new MasterCatalogPublishSettingsApi(defaultClient);
    Integer masterCatalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsMasterCatalog result = apiInstance.getMasterCatalog(masterCatalogId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsMasterCatalog**](CatalogAdminsMasterCatalog.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getMasterCatalogs"></a>
# **getMasterCatalogs**
> MasterCatalogCollection getMasterCatalogs(responseFields)

Get Master Catalogs

Retrieves all master catalogs.

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

    MasterCatalogPublishSettingsApi apiInstance = new MasterCatalogPublishSettingsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      MasterCatalogCollection result = apiInstance.getMasterCatalogs(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**MasterCatalogCollection**](MasterCatalogCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateMasterCatalog"></a>
# **updateMasterCatalog**
> CatalogAdminsMasterCatalog updateMasterCatalog(masterCatalogId, responseFields, catalogAdminsMasterCatalog)

Update Master Catalog

Update the publishing mode of a master catalog

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

    MasterCatalogPublishSettingsApi apiInstance = new MasterCatalogPublishSettingsApi(defaultClient);
    Integer masterCatalogId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsMasterCatalog catalogAdminsMasterCatalog = new CatalogAdminsMasterCatalog(); // CatalogAdminsMasterCatalog | 
    try {
      CatalogAdminsMasterCatalog result = apiInstance.updateMasterCatalog(masterCatalogId, responseFields, catalogAdminsMasterCatalog);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsMasterCatalog** | [**CatalogAdminsMasterCatalog**](CatalogAdminsMasterCatalog.md)|  | [optional] |

### Return type

[**CatalogAdminsMasterCatalog**](CatalogAdminsMasterCatalog.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

