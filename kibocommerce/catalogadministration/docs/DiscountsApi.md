# DiscountsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDiscount**](DiscountsApi.md#createDiscount) | **POST** /commerce/catalog/admin/discounts | Create discount |
| [**deleteDiscount**](DiscountsApi.md#deleteDiscount) | **DELETE** /commerce/catalog/admin/discounts/{discountId} | Delete discount |
| [**generateRandomCoupon**](DiscountsApi.md#generateRandomCoupon) | **GET** /commerce/catalog/admin/discounts/generate-random-coupon | Generate a random coupon |
| [**getDiscount**](DiscountsApi.md#getDiscount) | **GET** /commerce/catalog/admin/discounts/{discountId} | Get discount |
| [**getDiscountContent**](DiscountsApi.md#getDiscountContent) | **GET** /commerce/catalog/admin/discounts/{discountId}/content | Get discount content |
| [**getDiscountTarget**](DiscountsApi.md#getDiscountTarget) | **GET** /commerce/catalog/admin/discounts/{discountId}/target | Get discount target |
| [**getDiscounts**](DiscountsApi.md#getDiscounts) | **GET** /commerce/catalog/admin/discounts | Get discounts |
| [**getTags**](DiscountsApi.md#getTags) | **GET** /commerce/catalog/admin/discounts/{discountId}/tags | Get tags for a discount |
| [**updateDiscount**](DiscountsApi.md#updateDiscount) | **PUT** /commerce/catalog/admin/discounts/{discountId} | Update discount |
| [**updateDiscountContent**](DiscountsApi.md#updateDiscountContent) | **PUT** /commerce/catalog/admin/discounts/{discountId}/content | Update discount content |
| [**updateDiscountTags**](DiscountsApi.md#updateDiscountTags) | **PUT** /commerce/catalog/admin/discounts/tags | Update discount tags |
| [**updateDiscountTarget**](DiscountsApi.md#updateDiscountTarget) | **PUT** /commerce/catalog/admin/discounts/{discountId}/target | Update discount target |


<a name="createDiscount"></a>
# **createDiscount**
> CatalogAdminsDiscount createDiscount(tagCode, catalogAdminsDiscount)

Create discount

Creates a discount.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String tagCode = "tagCode_example"; // String | 
    CatalogAdminsDiscount catalogAdminsDiscount = new CatalogAdminsDiscount(); // CatalogAdminsDiscount | Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type.
    try {
      CatalogAdminsDiscount result = apiInstance.createDiscount(tagCode, catalogAdminsDiscount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#createDiscount");
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
| **tagCode** | **String**|  | [optional] |
| **catalogAdminsDiscount** | [**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)| Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type. | [optional] |

### Return type

[**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteDiscount"></a>
# **deleteDiscount**
> deleteDiscount(discountId)

Delete discount

Deletes a discount specified by its discount ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    try {
      apiInstance.deleteDiscount(discountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#deleteDiscount");
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
| **discountId** | **Integer**| Unique identifier of the discount. System-supplied and read-only. | |

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

<a name="generateRandomCoupon"></a>
# **generateRandomCoupon**
> String generateRandomCoupon()

Generate a random coupon

Generates a random code for a coupon.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      String result = apiInstance.generateRandomCoupon();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#generateRandomCoupon");
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDiscount"></a>
# **getDiscount**
> CatalogAdminsDiscount getDiscount(discountId)

Get discount

Retrieves the details of a single discount.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    try {
      CatalogAdminsDiscount result = apiInstance.getDiscount(discountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getDiscount");
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
| **discountId** | **Integer**| Unique identifier of the discount. System-supplied and read-only. | |

### Return type

[**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDiscountContent"></a>
# **getDiscountContent**
> DiscountLocalizedContent getDiscountContent(discountId)

Get discount content

Retrieves the localized content specified for the specified discount.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    try {
      DiscountLocalizedContent result = apiInstance.getDiscountContent(discountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getDiscountContent");
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
| **discountId** | **Integer**| Unique identifier of the discount. System-supplied and read-only. | |

### Return type

[**DiscountLocalizedContent**](DiscountLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDiscountTarget"></a>
# **getDiscountTarget**
> CatalogAdminsDiscountTarget getDiscountTarget(discountId)

Get discount target

Retrieves the discount target, that is which products, categories, or shipping methods are eligible for the discount.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    try {
      CatalogAdminsDiscountTarget result = apiInstance.getDiscountTarget(discountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getDiscountTarget");
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
| **discountId** | **Integer**| Unique identifier of the discount. System-supplied and read-only. | |

### Return type

[**CatalogAdminsDiscountTarget**](CatalogAdminsDiscountTarget.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDiscounts"></a>
# **getDiscounts**
> DiscountCollection getDiscounts(startIndex, pageSize, sortBy, filter, responseGroups)

Get discounts

Retrieves a list of discounts according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseGroups = "responseGroups_example"; // String | 
    try {
      DiscountCollection result = apiInstance.getDiscounts(startIndex, pageSize, sortBy, filter, responseGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getDiscounts");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] [default to 0] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] [default to 0] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals, gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **responseGroups** | **String**|  | [optional] |

### Return type

[**DiscountCollection**](DiscountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTags"></a>
# **getTags**
> TagCollection getTags(discountId)

Get tags for a discount

Retrieves all tags associated to a discount

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | 
    try {
      TagCollection result = apiInstance.getTags(discountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getTags");
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
| **discountId** | **Integer**|  | |

### Return type

[**TagCollection**](TagCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDiscount"></a>
# **updateDiscount**
> CatalogAdminsDiscount updateDiscount(discountId, catalogAdminsDiscount)

Update discount

Modifies a discount.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    CatalogAdminsDiscount catalogAdminsDiscount = new CatalogAdminsDiscount(); // CatalogAdminsDiscount | Properties of the discount to update.               Required properties: Content.Name, AmountType, StartDate, and Target.Type.               Any unspecified properties are set to null and boolean variables are set to false.
    try {
      CatalogAdminsDiscount result = apiInstance.updateDiscount(discountId, catalogAdminsDiscount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#updateDiscount");
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
| **discountId** | **Integer**| Unique identifier of the discount. System-supplied and read-only. | |
| **catalogAdminsDiscount** | [**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)| Properties of the discount to update.               Required properties: Content.Name, AmountType, StartDate, and Target.Type.               Any unspecified properties are set to null and boolean variables are set to false. | [optional] |

### Return type

[**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDiscountContent"></a>
# **updateDiscountContent**
> DiscountLocalizedContent updateDiscountContent(discountId, discountLocalizedContent)

Update discount content

Modifies the localized content for the specified discount. Allows you to rename the discount without modifying any other discount properties.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    DiscountLocalizedContent discountLocalizedContent = new DiscountLocalizedContent(); // DiscountLocalizedContent | New Name and/or LocaleCode. Properties of the content to update. Required property: Name.
    try {
      DiscountLocalizedContent result = apiInstance.updateDiscountContent(discountId, discountLocalizedContent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#updateDiscountContent");
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
| **discountId** | **Integer**| Unique identifier of the discount. System-supplied and read-only. | |
| **discountLocalizedContent** | [**DiscountLocalizedContent**](DiscountLocalizedContent.md)| New Name and/or LocaleCode. Properties of the content to update. Required property: Name. | [optional] |

### Return type

[**DiscountLocalizedContent**](DiscountLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDiscountTags"></a>
# **updateDiscountTags**
> DiscountTagCollection updateDiscountTags(discountTag)

Update discount tags

Modifies tags of the discount. The original tags are overwritten.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    List<DiscountTag> discountTag = Arrays.asList(); // List<DiscountTag> | 
    try {
      DiscountTagCollection result = apiInstance.updateDiscountTags(discountTag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#updateDiscountTags");
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
| **discountTag** | [**List&lt;DiscountTag&gt;**](DiscountTag.md)|  | [optional] |

### Return type

[**DiscountTagCollection**](DiscountTagCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateDiscountTarget"></a>
# **updateDiscountTarget**
> CatalogAdminsDiscountTarget updateDiscountTarget(discountId, catalogAdminsDiscountTarget)

Update discount target

Modifies properties of the discount target, for example, the dollar amount, or precentage off the price.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.DiscountsApi;

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    CatalogAdminsDiscountTarget catalogAdminsDiscountTarget = new CatalogAdminsDiscountTarget(); // CatalogAdminsDiscountTarget | Properties of the discount target to modify.               Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false.
    try {
      CatalogAdminsDiscountTarget result = apiInstance.updateDiscountTarget(discountId, catalogAdminsDiscountTarget);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#updateDiscountTarget");
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
| **discountId** | **Integer**| Unique identifier of the discount. System-supplied and read-only. | |
| **catalogAdminsDiscountTarget** | [**CatalogAdminsDiscountTarget**](CatalogAdminsDiscountTarget.md)| Properties of the discount target to modify.               Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false. | [optional] |

### Return type

[**CatalogAdminsDiscountTarget**](CatalogAdminsDiscountTarget.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

