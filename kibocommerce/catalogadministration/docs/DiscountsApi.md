# DiscountsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDiscount**](DiscountsApi.md#createDiscount) | **POST** /commerce/catalog/admin/discounts | Create Discount |
| [**deleteDiscount**](DiscountsApi.md#deleteDiscount) | **DELETE** /commerce/catalog/admin/discounts/{discountId} | Delete Discount |
| [**generateRandomCoupon**](DiscountsApi.md#generateRandomCoupon) | **GET** /commerce/catalog/admin/discounts/generate-random-coupon | Generate Random Coupon |
| [**getDiscount**](DiscountsApi.md#getDiscount) | **GET** /commerce/catalog/admin/discounts/{discountId} | Get Discount |
| [**getDiscountContent**](DiscountsApi.md#getDiscountContent) | **GET** /commerce/catalog/admin/discounts/{discountId}/content | Get Discount Content |
| [**getDiscountTarget**](DiscountsApi.md#getDiscountTarget) | **GET** /commerce/catalog/admin/discounts/{discountId}/target | Get Discount Target |
| [**getDiscounts**](DiscountsApi.md#getDiscounts) | **GET** /commerce/catalog/admin/discounts | Get Discounts |
| [**getTags**](DiscountsApi.md#getTags) | **GET** /commerce/catalog/admin/discounts/{discountId}/tags | Get Discount Tags |
| [**updateDiscount**](DiscountsApi.md#updateDiscount) | **PUT** /commerce/catalog/admin/discounts/{discountId} | Update Discount |
| [**updateDiscountContent**](DiscountsApi.md#updateDiscountContent) | **PUT** /commerce/catalog/admin/discounts/{discountId}/content | Update Discount Content |
| [**updateDiscountTags**](DiscountsApi.md#updateDiscountTags) | **PUT** /commerce/catalog/admin/discounts/tags | Update Discount Tags |
| [**updateDiscountTarget**](DiscountsApi.md#updateDiscountTarget) | **PUT** /commerce/catalog/admin/discounts/{discountId}/target | Update Discount Target |
| [**validateDiscountExpression**](DiscountsApi.md#validateDiscountExpression) | **POST** /commerce/catalog/admin/discounts/expressions/validate | Validate Discount Expression |


<a name="createDiscount"></a>
# **createDiscount**
> CatalogAdminsDiscount createDiscount(tagCode, responseFields, catalogAdminsDiscount)

Create Discount

Creates a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String tagCode = "tagCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsDiscount catalogAdminsDiscount = new CatalogAdminsDiscount(); // CatalogAdminsDiscount | Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type.
    try {
      CatalogAdminsDiscount result = apiInstance.createDiscount(tagCode, responseFields, catalogAdminsDiscount);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsDiscount** | [**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)| Properties of the discount to create. Required properties: Content.Name, AmountType, StartDate, and Target.Type. | [optional] |

### Return type

[**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteDiscount"></a>
# **deleteDiscount**
> deleteDiscount(discountId)

Delete Discount

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="generateRandomCoupon"></a>
# **generateRandomCoupon**
> String generateRandomCoupon(responseFields)

Generate Random Coupon

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      String result = apiInstance.generateRandomCoupon(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDiscount"></a>
# **getDiscount**
> CatalogAdminsDiscount getDiscount(discountId, responseFields)

Get Discount

Retrieves the details of a single discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsDiscount result = apiInstance.getDiscount(discountId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDiscountContent"></a>
# **getDiscountContent**
> DiscountLocalizedContent getDiscountContent(discountId, responseFields)

Get Discount Content

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      DiscountLocalizedContent result = apiInstance.getDiscountContent(discountId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**DiscountLocalizedContent**](DiscountLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDiscountTarget"></a>
# **getDiscountTarget**
> CatalogAdminsDiscountTarget getDiscountTarget(discountId, responseFields)

Get Discount Target

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsDiscountTarget result = apiInstance.getDiscountTarget(discountId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsDiscountTarget**](CatalogAdminsDiscountTarget.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDiscounts"></a>
# **getDiscounts**
> CatalogAdminsDiscountCollection getDiscounts(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get Discounts

Retrieves a list of discounts according to any specified filter criteria and sort options. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;. 

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer startIndex = 0; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 0; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsDiscountCollection result = apiInstance.getDiscounts(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsDiscountCollection**](CatalogAdminsDiscountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTags"></a>
# **getTags**
> TagCollection getTags(discountId, responseFields)

Get Discount Tags

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      TagCollection result = apiInstance.getTags(discountId, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**TagCollection**](TagCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDiscount"></a>
# **updateDiscount**
> CatalogAdminsDiscount updateDiscount(discountId, responseFields, catalogAdminsDiscount)

Update Discount

Modifies a discount. This current version of the Discounts API includes localizedContent to support &lt;a href&#x3D;\&quot;/pages/catalog-structure#multi-locale-catalogs\&quot;&gt;multi-locale catalogs&lt;/a&gt;, which was not present in the previous API model. If you were a client prior to May 2024 and have upgraded your implementation to support this feature, you can still access discount data that has not yet been rewritten to the new model by providing an x-api-version header set to \&quot;1\&quot;.

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsDiscount catalogAdminsDiscount = new CatalogAdminsDiscount(); // CatalogAdminsDiscount | Properties of the discount to update.              Required properties: Content.Name, AmountType, StartDate, and Target.Type.              Any unspecified properties are set to null and boolean variables are set to false.
    try {
      CatalogAdminsDiscount result = apiInstance.updateDiscount(discountId, responseFields, catalogAdminsDiscount);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsDiscount** | [**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)| Properties of the discount to update.              Required properties: Content.Name, AmountType, StartDate, and Target.Type.              Any unspecified properties are set to null and boolean variables are set to false. | [optional] |

### Return type

[**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDiscountContent"></a>
# **updateDiscountContent**
> DiscountLocalizedContent updateDiscountContent(discountId, responseFields, discountLocalizedContent)

Update Discount Content

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DiscountLocalizedContent discountLocalizedContent = new DiscountLocalizedContent(); // DiscountLocalizedContent | New Name and/or LocaleCode. Properties of the content to update. Required property: Name.
    try {
      DiscountLocalizedContent result = apiInstance.updateDiscountContent(discountId, responseFields, discountLocalizedContent);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **discountLocalizedContent** | [**DiscountLocalizedContent**](DiscountLocalizedContent.md)| New Name and/or LocaleCode. Properties of the content to update. Required property: Name. | [optional] |

### Return type

[**DiscountLocalizedContent**](DiscountLocalizedContent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDiscountTags"></a>
# **updateDiscountTags**
> DiscountTagCollection updateDiscountTags(responseFields, discountTag)

Update Discount Tags

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<DiscountTag> discountTag = Arrays.asList(); // List<DiscountTag> | 
    try {
      DiscountTagCollection result = apiInstance.updateDiscountTags(responseFields, discountTag);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **discountTag** | [**List&lt;DiscountTag&gt;**](DiscountTag.md)|  | [optional] |

### Return type

[**DiscountTagCollection**](DiscountTagCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateDiscountTarget"></a>
# **updateDiscountTarget**
> CatalogAdminsDiscountTarget updateDiscountTarget(discountId, responseFields, catalogAdminsDiscountTarget)

Update Discount Target

Modifies properties of the discount target, for example, the dollar amount, or percentage off the price.

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer discountId = 56; // Integer | Unique identifier of the discount. System-supplied and read-only.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsDiscountTarget catalogAdminsDiscountTarget = new CatalogAdminsDiscountTarget(); // CatalogAdminsDiscountTarget | Properties of the discount target to modify.              Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false.
    try {
      CatalogAdminsDiscountTarget result = apiInstance.updateDiscountTarget(discountId, responseFields, catalogAdminsDiscountTarget);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsDiscountTarget** | [**CatalogAdminsDiscountTarget**](CatalogAdminsDiscountTarget.md)| Properties of the discount target to modify.              Required properties: Target.Type. Any unspecified properties are set to null and boolean variables to false. | [optional] |

### Return type

[**CatalogAdminsDiscountTarget**](CatalogAdminsDiscountTarget.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="validateDiscountExpression"></a>
# **validateDiscountExpression**
> ExpressionValidationResult validateDiscountExpression(responseFields, catalogAdminsDiscount)

Validate Discount Expression

Validate a discount expression.

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

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsDiscount catalogAdminsDiscount = new CatalogAdminsDiscount(); // CatalogAdminsDiscount | 
    try {
      ExpressionValidationResult result = apiInstance.validateDiscountExpression(responseFields, catalogAdminsDiscount);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#validateDiscountExpression");
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
| **catalogAdminsDiscount** | [**CatalogAdminsDiscount**](CatalogAdminsDiscount.md)|  | [optional] |

### Return type

[**ExpressionValidationResult**](ExpressionValidationResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

