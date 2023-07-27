# InventoryTagCategoryApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTagCategory**](InventoryTagCategoryApi.md#deleteTagCategory) | **DELETE** /commerce/inventory/v1/tagCategory/{tag_category_name} | Delete Tag Category |
| [**getTagCategory**](InventoryTagCategoryApi.md#getTagCategory) | **GET** /commerce/inventory/v1/tagCategory/{tag_category_name} | Get Tag Category |
| [**getTagCategoryAll**](InventoryTagCategoryApi.md#getTagCategoryAll) | **GET** /commerce/inventory/v1/tagCategory | Get Tag Category All |
| [**updateTagCategory**](InventoryTagCategoryApi.md#updateTagCategory) | **PUT** /commerce/inventory/v1/tagCategory/{tag_category_name} | Update Tag Category |


<a name="deleteTagCategory"></a>
# **deleteTagCategory**
> DeletedCountResponse deleteTagCategory(xVolTenant, tagCategoryName)

Delete Tag Category

Delete a Tag category

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagCategoryApi;

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

    InventoryTagCategoryApi apiInstance = new InventoryTagCategoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    try {
      DeletedCountResponse result = apiInstance.deleteTagCategory(xVolTenant, tagCategoryName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagCategoryApi#deleteTagCategory");
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
| **tagCategoryName** | **String**| Tag Category Name | |

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
| **404** | Tag category Not Found |  -  |

<a name="getTagCategory"></a>
# **getTagCategory**
> TagCategory getTagCategory(xVolTenant, tagCategoryName)

Get Tag Category

Get a tag category

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagCategoryApi;

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

    InventoryTagCategoryApi apiInstance = new InventoryTagCategoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    try {
      TagCategory result = apiInstance.getTagCategory(xVolTenant, tagCategoryName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagCategoryApi#getTagCategory");
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
| **tagCategoryName** | **String**| Tag Category Name | |

### Return type

[**TagCategory**](TagCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Tag Not Found |  -  |

<a name="getTagCategoryAll"></a>
# **getTagCategoryAll**
> List&lt;TagCategory&gt; getTagCategoryAll(xVolTenant)

Get Tag Category All

Get all tag categories for a tenant

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagCategoryApi;

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

    InventoryTagCategoryApi apiInstance = new InventoryTagCategoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    try {
      List<TagCategory> result = apiInstance.getTagCategoryAll(xVolTenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagCategoryApi#getTagCategoryAll");
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

### Return type

[**List&lt;TagCategory&gt;**](TagCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Tag Categories Not Found |  -  |

<a name="updateTagCategory"></a>
# **updateTagCategory**
> TagCategory updateTagCategory(xVolTenant, tagCategoryName, tagCategory)

Update Tag Category

Update the designated tag category

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagCategoryApi;

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

    InventoryTagCategoryApi apiInstance = new InventoryTagCategoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    TagCategory tagCategory = new TagCategory(); // TagCategory | Request create or modify Tag Categories
    try {
      TagCategory result = apiInstance.updateTagCategory(xVolTenant, tagCategoryName, tagCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagCategoryApi#updateTagCategory");
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
| **tagCategoryName** | **String**| Tag Category Name | |
| **tagCategory** | [**TagCategory**](TagCategory.md)| Request create or modify Tag Categories | |

### Return type

[**TagCategory**](TagCategory.md)

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
| **500** | Internal Server Error |  -  |

