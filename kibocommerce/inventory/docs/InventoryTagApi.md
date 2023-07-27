# InventoryTagApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTag**](InventoryTagApi.md#createTag) | **POST** /commerce/inventory/v1/tagCategory/{tag_category_name}/tag | Create Tag |
| [**deleteTag**](InventoryTagApi.md#deleteTag) | **DELETE** /commerce/inventory/v1/tagCategory/{tag_category_name}/tag/{tag_value} | Delete Tag |
| [**getTag**](InventoryTagApi.md#getTag) | **GET** /commerce/inventory/v1/tagCategory/{tag_category_name}/tag/{tag_value} | Get Tag |
| [**updateTag**](InventoryTagApi.md#updateTag) | **PUT** /commerce/inventory/v1/tagCategory/{tag_category_name}/tag/{tag_value} | Update Tag |


<a name="createTag"></a>
# **createTag**
> InventoryTag createTag(xVolTenant, tagCategoryName, inventoryTag)

Create Tag

Create a tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

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

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    InventoryTag inventoryTag = new InventoryTag(); // InventoryTag | Request create or modify Tag
    try {
      InventoryTag result = apiInstance.createTag(xVolTenant, tagCategoryName, inventoryTag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagApi#createTag");
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
| **inventoryTag** | [**InventoryTag**](InventoryTag.md)| Request create or modify Tag | |

### Return type

[**InventoryTag**](InventoryTag.md)

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

<a name="deleteTag"></a>
# **deleteTag**
> DeletedCountResponse deleteTag(xVolTenant, tagCategoryName, tagValue)

Delete Tag

Delete a Tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

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

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    String tagValue = "tagValue_example"; // String | Tag Value
    try {
      DeletedCountResponse result = apiInstance.deleteTag(xVolTenant, tagCategoryName, tagValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagApi#deleteTag");
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
| **tagValue** | **String**| Tag Value | |

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
| **404** | Tag Not Found |  -  |

<a name="getTag"></a>
# **getTag**
> InventoryTag getTag(xVolTenant, tagCategoryName, tagValue)

Get Tag

Get a tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

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

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    String tagValue = "tagValue_example"; // String | Tag Value
    try {
      InventoryTag result = apiInstance.getTag(xVolTenant, tagCategoryName, tagValue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagApi#getTag");
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
| **tagValue** | **String**| Tag Value | |

### Return type

[**InventoryTag**](InventoryTag.md)

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

<a name="updateTag"></a>
# **updateTag**
> InventoryTag updateTag(xVolTenant, tagCategoryName, tagValue, inventoryTag)

Update Tag

Update the designated tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

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

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    String tagValue = "tagValue_example"; // String | Tag Value
    InventoryTag inventoryTag = new InventoryTag(); // InventoryTag | Request create or modify Tag
    try {
      InventoryTag result = apiInstance.updateTag(xVolTenant, tagCategoryName, tagValue, inventoryTag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryTagApi#updateTag");
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
| **tagValue** | **String**| Tag Value | |
| **inventoryTag** | [**InventoryTag**](InventoryTag.md)| Request create or modify Tag | |

### Return type

[**InventoryTag**](InventoryTag.md)

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

