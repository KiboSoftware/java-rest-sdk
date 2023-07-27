# WishlistApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItemToWishlist**](WishlistApi.md#addItemToWishlist) | **POST** /commerce/wishlists/{wishlistId}/items | Add Item To Wishlist |
| [**createWishlist**](WishlistApi.md#createWishlist) | **POST** /commerce/wishlists | Create Wishlist |
| [**deleteWishlist**](WishlistApi.md#deleteWishlist) | **DELETE** /commerce/wishlists/{wishlistId} | Deletes Wishlist |
| [**deleteWishlistItem**](WishlistApi.md#deleteWishlistItem) | **DELETE** /commerce/wishlists/{wishlistId}/items/{wishlistItemId} | Delete Wishlist Item |
| [**getWishlist**](WishlistApi.md#getWishlist) | **GET** /commerce/wishlists/{wishlistId} | Get Wishlist |
| [**getWishlistByName**](WishlistApi.md#getWishlistByName) | **GET** /commerce/wishlists/customers/{customerAccountId}/{wishlistName} | Get Wishlist By Name |
| [**getWishlistItem**](WishlistApi.md#getWishlistItem) | **GET** /commerce/wishlists/{wishlistId}/items/{wishlistItemId} | Get Wishlist Item |
| [**getWishlistItems**](WishlistApi.md#getWishlistItems) | **GET** /commerce/wishlists/{wishlistId}/items | Get Wishlist Items |
| [**getWishlistItemsByWishlistName**](WishlistApi.md#getWishlistItemsByWishlistName) | **GET** /commerce/wishlists/customers/{customerAccountId}/{wishlistName}/items | Get Wishlist Items By WishlistName |
| [**getWishlists**](WishlistApi.md#getWishlists) | **GET** /commerce/wishlists | Get Wishlists |
| [**removeAllWishlistItems**](WishlistApi.md#removeAllWishlistItems) | **DELETE** /commerce/wishlists/{wishlistId}/items | Remove All Wishlist Items |
| [**updateWishlist**](WishlistApi.md#updateWishlist) | **PUT** /commerce/wishlists/{wishlistId} | Update Wishlist |
| [**updateWishlistItem**](WishlistApi.md#updateWishlistItem) | **PUT** /commerce/wishlists/{wishlistId}/items/{wishlistItemId} | Update Wishlist Item |
| [**updateWishlistItemQuantity**](WishlistApi.md#updateWishlistItemQuantity) | **PUT** /commerce/wishlists/{wishlistId}/items/{wishlistItemId}/{quantity} | Update Wishlist Item Quantity |


<a name="addItemToWishlist"></a>
# **addItemToWishlist**
> WishlistItem addItemToWishlist(wishlistId, wishlistItem)

Add Item To Wishlist

Adds an item to the wishlist of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    WishlistItem wishlistItem = new WishlistItem(); // WishlistItem | 
    try {
      WishlistItem result = apiInstance.addItemToWishlist(wishlistId, wishlistItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#addItemToWishlist");
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
| **wishlistId** | **String**|  | |
| **wishlistItem** | [**WishlistItem**](WishlistItem.md)|  | [optional] |

### Return type

[**WishlistItem**](WishlistItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createWishlist"></a>
# **createWishlist**
> Wishlist createWishlist(wishlist)

Create Wishlist

Create wishlist.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    Wishlist wishlist = new Wishlist(); // Wishlist | 
    try {
      Wishlist result = apiInstance.createWishlist(wishlist);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#createWishlist");
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
| **wishlist** | [**Wishlist**](Wishlist.md)|  | [optional] |

### Return type

[**Wishlist**](Wishlist.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteWishlist"></a>
# **deleteWishlist**
> deleteWishlist(wishlistId)

Deletes Wishlist

Deletes a wishlist specified by wishlist Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    try {
      apiInstance.deleteWishlist(wishlistId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#deleteWishlist");
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
| **wishlistId** | **String**|  | |

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

<a name="deleteWishlistItem"></a>
# **deleteWishlistItem**
> deleteWishlistItem(wishlistId, wishlistItemId)

Delete Wishlist Item

Delete/remove wishlist item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    String wishlistItemId = "wishlistItemId_example"; // String | 
    try {
      apiInstance.deleteWishlistItem(wishlistId, wishlistItemId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#deleteWishlistItem");
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
| **wishlistId** | **String**|  | |
| **wishlistItemId** | **String**|  | |

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

<a name="getWishlist"></a>
# **getWishlist**
> Wishlist getWishlist(wishlistId)

Get Wishlist

Retrieves the details of a wishlist specified by the wishlist ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    try {
      Wishlist result = apiInstance.getWishlist(wishlistId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#getWishlist");
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
| **wishlistId** | **String**|  | |

### Return type

[**Wishlist**](Wishlist.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getWishlistByName"></a>
# **getWishlistByName**
> Wishlist getWishlistByName(customerAccountId, wishlistName)

Get Wishlist By Name

Retrieves wishlist by name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    Integer customerAccountId = 56; // Integer | 
    String wishlistName = "wishlistName_example"; // String | 
    try {
      Wishlist result = apiInstance.getWishlistByName(customerAccountId, wishlistName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#getWishlistByName");
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
| **customerAccountId** | **Integer**|  | |
| **wishlistName** | **String**|  | |

### Return type

[**Wishlist**](Wishlist.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getWishlistItem"></a>
# **getWishlistItem**
> WishlistItem getWishlistItem(wishlistId, wishlistItemId)

Get Wishlist Item

Retrieves an individual wishlist item from a wishlist.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    String wishlistItemId = "wishlistItemId_example"; // String | 
    try {
      WishlistItem result = apiInstance.getWishlistItem(wishlistId, wishlistItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#getWishlistItem");
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
| **wishlistId** | **String**|  | |
| **wishlistItemId** | **String**|  | |

### Return type

[**WishlistItem**](WishlistItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getWishlistItems"></a>
# **getWishlistItems**
> WishlistItemCollection getWishlistItems(wishlistId, startIndex, pageSize, sortBy, filter)

Get Wishlist Items

Returns a listing of wishlists.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      WishlistItemCollection result = apiInstance.getWishlistItems(wishlistId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#getWishlistItems");
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
| **wishlistId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**WishlistItemCollection**](WishlistItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getWishlistItemsByWishlistName"></a>
# **getWishlistItemsByWishlistName**
> WishlistItemCollection getWishlistItemsByWishlistName(customerAccountId, wishlistName, startIndex, pageSize, sortBy, filter)

Get Wishlist Items By WishlistName

Returns a listing of wishlists.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    Integer customerAccountId = 56; // Integer | 
    String wishlistName = "wishlistName_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      WishlistItemCollection result = apiInstance.getWishlistItemsByWishlistName(customerAccountId, wishlistName, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#getWishlistItemsByWishlistName");
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
| **customerAccountId** | **Integer**|  | |
| **wishlistName** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**WishlistItemCollection**](WishlistItemCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getWishlists"></a>
# **getWishlists**
> WishlistCollection getWishlists(startIndex, pageSize, sortBy, filter, q, qLimit)

Get Wishlists

Retrieves a list of wishlists according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,               gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | Text to perform a search on
    Integer qLimit = 56; // Integer | Limit of the records to include in a search, used for global search
    try {
      WishlistCollection result = apiInstance.getWishlists(startIndex, pageSize, sortBy, filter, q, qLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#getWishlists");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals,               gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**| Text to perform a search on | [optional] |
| **qLimit** | **Integer**| Limit of the records to include in a search, used for global search | [optional] |

### Return type

[**WishlistCollection**](WishlistCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeAllWishlistItems"></a>
# **removeAllWishlistItems**
> Wishlist removeAllWishlistItems(wishlistId)

Remove All Wishlist Items

Clears all items in the wishlist.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    try {
      Wishlist result = apiInstance.removeAllWishlistItems(wishlistId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#removeAllWishlistItems");
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
| **wishlistId** | **String**|  | |

### Return type

[**Wishlist**](Wishlist.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateWishlist"></a>
# **updateWishlist**
> Wishlist updateWishlist(wishlistId, wishlist)

Update Wishlist

Updates a wishlist specified by wishlist Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    Wishlist wishlist = new Wishlist(); // Wishlist | 
    try {
      Wishlist result = apiInstance.updateWishlist(wishlistId, wishlist);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#updateWishlist");
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
| **wishlistId** | **String**|  | |
| **wishlist** | [**Wishlist**](Wishlist.md)|  | [optional] |

### Return type

[**Wishlist**](Wishlist.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateWishlistItem"></a>
# **updateWishlistItem**
> WishlistItem updateWishlistItem(wishlistId, wishlistItemId, wishlistItem)

Update Wishlist Item

Updates a wishlist item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    String wishlistItemId = "wishlistItemId_example"; // String | 
    WishlistItem wishlistItem = new WishlistItem(); // WishlistItem | 
    try {
      WishlistItem result = apiInstance.updateWishlistItem(wishlistId, wishlistItemId, wishlistItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#updateWishlistItem");
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
| **wishlistId** | **String**|  | |
| **wishlistItemId** | **String**|  | |
| **wishlistItem** | [**WishlistItem**](WishlistItem.md)|  | [optional] |

### Return type

[**WishlistItem**](WishlistItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateWishlistItemQuantity"></a>
# **updateWishlistItemQuantity**
> WishlistItem updateWishlistItemQuantity(wishlistId, wishlistItemId, quantity)

Update Wishlist Item Quantity

Updates the quantity of an item in the wishlist.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.WishlistApi;

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

    WishlistApi apiInstance = new WishlistApi(defaultClient);
    String wishlistId = "wishlistId_example"; // String | 
    String wishlistItemId = "wishlistItemId_example"; // String | 
    Integer quantity = 56; // Integer | 
    try {
      WishlistItem result = apiInstance.updateWishlistItemQuantity(wishlistId, wishlistItemId, quantity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WishlistApi#updateWishlistItemQuantity");
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
| **wishlistId** | **String**|  | |
| **wishlistItemId** | **String**|  | |
| **quantity** | **Integer**|  | |

### Return type

[**WishlistItem**](WishlistItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

