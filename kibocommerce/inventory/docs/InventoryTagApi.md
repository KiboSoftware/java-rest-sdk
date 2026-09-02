# InventoryTagApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTag**](InventoryTagApi.md#createTag) | **POST** /commerce/inventory/v1/tagCategory/{tagCategoryName}/tag | Create Tag |
| [**deleteTag**](InventoryTagApi.md#deleteTag) | **DELETE** /commerce/inventory/v1/tagCategory/{tagCategoryName}/tag/{tagValue} | Delete Tag |
| [**getTag**](InventoryTagApi.md#getTag) | **GET** /commerce/inventory/v1/tagCategory/{tagCategoryName}/tag/{tagValue} | Get Tag |
| [**updateTag**](InventoryTagApi.md#updateTag) | **PUT** /commerce/inventory/v1/tagCategory/{tagCategoryName}/tag/{tagValue} | Update Tag |


<a name="createTag"></a>
# **createTag**
> InventoryTag createTag(tagCategoryName, inventoryTag)

Create Tag

Create a tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    InventoryTag inventoryTag = new InventoryTag(); // InventoryTag | Request create or modify Tag
    try {
      InventoryTag result = apiInstance.createTag(tagCategoryName, inventoryTag);
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
| **tagCategoryName** | **String**| Tag Category Name | |
| **inventoryTag** | [**InventoryTag**](InventoryTag.md)| Request create or modify Tag | |

### Return type

[**InventoryTag**](InventoryTag.md)

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

<a name="deleteTag"></a>
# **deleteTag**
> DeletedCountResponse deleteTag(tagCategoryName, tagValue)

Delete Tag

Delete a Tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    String tagValue = "tagValue_example"; // String | Tag Value
    try {
      DeletedCountResponse result = apiInstance.deleteTag(tagCategoryName, tagValue);
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
| **tagCategoryName** | **String**| Tag Category Name | |
| **tagValue** | **String**| Tag Value | |

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
| **404** | Tag Not Found |  -  |

<a name="getTag"></a>
# **getTag**
> InventoryTag getTag(tagCategoryName, tagValue)

Get Tag

Get a tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    String tagValue = "tagValue_example"; // String | Tag Value
    try {
      InventoryTag result = apiInstance.getTag(tagCategoryName, tagValue);
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
| **tagCategoryName** | **String**| Tag Category Name | |
| **tagValue** | **String**| Tag Value | |

### Return type

[**InventoryTag**](InventoryTag.md)

### Authorization

No authorization required

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
> InventoryTag updateTag(tagCategoryName, tagValue, inventoryTag)

Update Tag

Update the designated tag

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryTagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryTagApi apiInstance = new InventoryTagApi(defaultClient);
    String tagCategoryName = "tagCategoryName_example"; // String | Tag Category Name
    String tagValue = "tagValue_example"; // String | Tag Value
    InventoryTag inventoryTag = new InventoryTag(); // InventoryTag | Request create or modify Tag
    try {
      InventoryTag result = apiInstance.updateTag(tagCategoryName, tagValue, inventoryTag);
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
| **tagCategoryName** | **String**| Tag Category Name | |
| **tagValue** | **String**| Tag Value | |
| **inventoryTag** | [**InventoryTag**](InventoryTag.md)| Request create or modify Tag | |

### Return type

[**InventoryTag**](InventoryTag.md)

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
| **500** | Internal Server Error |  -  |

