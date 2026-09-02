# StorefrontProductsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontConfigureProduct**](StorefrontProductsApi.md#storefrontConfigureProduct) | **POST** /commerce/catalog/storefront/products/{productCode}/configure | Configure Variation Product |
| [**storefrontGetProduct**](StorefrontProductsApi.md#storefrontGetProduct) | **GET** /commerce/catalog/storefront/products/{productCode} | Get Product |
| [**storefrontGetProductCosts**](StorefrontProductsApi.md#storefrontGetProductCosts) | **POST** /commerce/catalog/storefront/products/costs | Get Product Costs |
| [**storefrontGetProductForIndexing**](StorefrontProductsApi.md#storefrontGetProductForIndexing) | **GET** /commerce/catalog/storefront/products/indexing/{productCode} | Get Product for Indexing |
| [**storefrontGetProductInventories**](StorefrontProductsApi.md#storefrontGetProductInventories) | **POST** /commerce/catalog/storefront/products/locationinventory | Get location inventories for a list of products |
| [**storefrontGetProductInventory**](StorefrontProductsApi.md#storefrontGetProductInventory) | **GET** /commerce/catalog/storefront/products/{productCode}/locationinventory | Get Location Inventory |
| [**storefrontGetProducts**](StorefrontProductsApi.md#storefrontGetProducts) | **GET** /commerce/catalog/storefront/products | Get Products |
| [**storefrontProductSubstitutions**](StorefrontProductsApi.md#storefrontProductSubstitutions) | **GET** /commerce/catalog/storefront/products/{productCode}/substitutions | Get Product Substitutions |
| [**storefrontValidateDiscounts**](StorefrontProductsApi.md#storefrontValidateDiscounts) | **POST** /commerce/catalog/storefront/products/{productCode}/validateDiscounts | Validate Discounts |
| [**storefrontValidateProduct**](StorefrontProductsApi.md#storefrontValidateProduct) | **POST** /commerce/catalog/storefront/products/{productCode}/validate | Validate Variant Product |


<a name="storefrontConfigureProduct"></a>
# **storefrontConfigureProduct**
> ConfiguredProduct storefrontConfigureProduct(productCode, includeOptionDetails, skipInventoryCheck, quantity, purchaseLocation, variationProductCodeFilter, useSubscriptionPricing, subscriptionFrequency, customerSegments, responseFields, productOptionSelections)

Configure Variation Product

Configure a new product selection. This occurs each time a shopper selects a product option as they configure a product. Once all the required product options are configured, the product can be added to a cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code for the product being configured, for example, a SKU. Max length: 30.
    Boolean includeOptionDetails = true; // Boolean | If true, the response returns product details such as. If false, returns a product summary such as the product name, price, and sale price.
    Boolean skipInventoryCheck = false; // Boolean | Determines whether or not to check inventory on an item when validating
    Integer quantity = 56; // Integer | Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified.
    String purchaseLocation = "purchaseLocation_example"; // String | 
    String variationProductCodeFilter = "variationProductCodeFilter_example"; // String | 
    Boolean useSubscriptionPricing = false; // Boolean | 
    String subscriptionFrequency = "subscriptionFrequency_example"; // String | 
    String customerSegments = "customerSegments_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductOptionSelections productOptionSelections = new ProductOptionSelections(); // ProductOptionSelections | Shopper-selected options.
    try {
      ConfiguredProduct result = apiInstance.storefrontConfigureProduct(productCode, includeOptionDetails, skipInventoryCheck, quantity, purchaseLocation, variationProductCodeFilter, useSubscriptionPricing, subscriptionFrequency, customerSegments, responseFields, productOptionSelections);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontConfigureProduct");
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
| **productCode** | **String**| Merchant-created code for the product being configured, for example, a SKU. Max length: 30. | |
| **includeOptionDetails** | **Boolean**| If true, the response returns product details such as. If false, returns a product summary such as the product name, price, and sale price. | [optional] |
| **skipInventoryCheck** | **Boolean**| Determines whether or not to check inventory on an item when validating | [optional] [default to false] |
| **quantity** | **Integer**| Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified. | [optional] |
| **purchaseLocation** | **String**|  | [optional] |
| **variationProductCodeFilter** | **String**|  | [optional] |
| **useSubscriptionPricing** | **Boolean**|  | [optional] [default to false] |
| **subscriptionFrequency** | **String**|  | [optional] |
| **customerSegments** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productOptionSelections** | [**ProductOptionSelections**](ProductOptionSelections.md)| Shopper-selected options. | [optional] |

### Return type

[**ConfiguredProduct**](ConfiguredProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetProduct"></a>
# **storefrontGetProduct**
> CatalogRuntimesProduct storefrontGetProduct(productCode, variationProductCode, responseGroups, allowInactive, skipInventoryCheck, supressOutOfStock404, quantity, acceptVariantProductCode, purchaseLocation, variationProductCodeFilter, sliceValue, includeAllImages, useSubscriptionPricing, customerSegments, responseFields)

Get Product

Retrieves information about a single product given its product code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Required. Merchant-created code associated with the product, for example, a SKU. Max length: 30.
    String variationProductCode = "variationProductCode_example"; // String | Optional. Merchant-created code associated with a specific product variation. Max length: #.
    String responseGroups = "responseGroups_example"; // String | Optional. Response groups to be determined.
    Boolean allowInactive = true; // Boolean | Optional. If true, return a product if it is located but inactive.
    Boolean skipInventoryCheck = false; // Boolean | Determines whether or not to check inventory on an item when validating
    Boolean supressOutOfStock404 = false; // Boolean | Optional. If true, will still return the product, even if product is out of stock and the out of stock behavior is set to “Hide Product in Store”. If false or omitted, the same product will return a 404 not found. Suppressing the 404 not found is useful for site SEO.
    Integer quantity = 56; // Integer | Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified.
    Boolean acceptVariantProductCode = false; // Boolean | 
    String purchaseLocation = "purchaseLocation_example"; // String | 
    String variationProductCodeFilter = "variationProductCodeFilter_example"; // String | 
    String sliceValue = "sliceValue_example"; // String | 
    Boolean includeAllImages = false; // Boolean | 
    Boolean useSubscriptionPricing = false; // Boolean | 
    String customerSegments = "customerSegments_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogRuntimesProduct result = apiInstance.storefrontGetProduct(productCode, variationProductCode, responseGroups, allowInactive, skipInventoryCheck, supressOutOfStock404, quantity, acceptVariantProductCode, purchaseLocation, variationProductCodeFilter, sliceValue, includeAllImages, useSubscriptionPricing, customerSegments, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontGetProduct");
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
| **productCode** | **String**| Required. Merchant-created code associated with the product, for example, a SKU. Max length: 30. | |
| **variationProductCode** | **String**| Optional. Merchant-created code associated with a specific product variation. Max length: #. | [optional] |
| **responseGroups** | **String**| Optional. Response groups to be determined. | [optional] |
| **allowInactive** | **Boolean**| Optional. If true, return a product if it is located but inactive. | [optional] |
| **skipInventoryCheck** | **Boolean**| Determines whether or not to check inventory on an item when validating | [optional] [default to false] |
| **supressOutOfStock404** | **Boolean**| Optional. If true, will still return the product, even if product is out of stock and the out of stock behavior is set to “Hide Product in Store”. If false or omitted, the same product will return a 404 not found. Suppressing the 404 not found is useful for site SEO. | [optional] [default to false] |
| **quantity** | **Integer**| Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified. | [optional] |
| **acceptVariantProductCode** | **Boolean**|  | [optional] [default to false] |
| **purchaseLocation** | **String**|  | [optional] |
| **variationProductCodeFilter** | **String**|  | [optional] |
| **sliceValue** | **String**|  | [optional] |
| **includeAllImages** | **Boolean**|  | [optional] [default to false] |
| **useSubscriptionPricing** | **Boolean**|  | [optional] [default to false] |
| **customerSegments** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogRuntimesProduct**](CatalogRuntimesProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetProductCosts"></a>
# **storefrontGetProductCosts**
> ProductCostCollection storefrontGetProductCosts(responseFields, productCostQuery)

Get Product Costs

Get costs for products. This cost is the amount the merchant pays for the product—it is not the price that the shopper sees on the storefront (which is usually higher).

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductCostQuery productCostQuery = new ProductCostQuery(); // ProductCostQuery | 
    try {
      ProductCostCollection result = apiInstance.storefrontGetProductCosts(responseFields, productCostQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontGetProductCosts");
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
| **productCostQuery** | [**ProductCostQuery**](ProductCostQuery.md)|  | [optional] |

### Return type

[**ProductCostCollection**](ProductCostCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetProductForIndexing"></a>
# **storefrontGetProductForIndexing**
> ProductForIndexing storefrontGetProductForIndexing(productCode, responseGroups, productVersion, lastModifiedDate, responseFields)

Get Product for Indexing

Retrieves information about a single product given its product code for Mozu to index in the search engine

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Required. Merchant-created code associated with the product, for example, a SKU. Max length: 30.
    String responseGroups = "responseGroups_example"; // String | Optional. Response groups to be determined.
    Long productVersion = 56L; // Long | Optional. The current version of the product to use for latency checking.               If this instance of Product Runtime is configured to run against a replicated database node that has a lesser version than this value, it will read from the primary database node to prevent stale data.
    OffsetDateTime lastModifiedDate = OffsetDateTime.now(); // OffsetDateTime | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductForIndexing result = apiInstance.storefrontGetProductForIndexing(productCode, responseGroups, productVersion, lastModifiedDate, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontGetProductForIndexing");
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
| **productCode** | **String**| Required. Merchant-created code associated with the product, for example, a SKU. Max length: 30. | |
| **responseGroups** | **String**| Optional. Response groups to be determined. | [optional] |
| **productVersion** | **Long**| Optional. The current version of the product to use for latency checking.               If this instance of Product Runtime is configured to run against a replicated database node that has a lesser version than this value, it will read from the primary database node to prevent stale data. | [optional] |
| **lastModifiedDate** | **OffsetDateTime**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductForIndexing**](ProductForIndexing.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetProductInventories"></a>
# **storefrontGetProductInventories**
> LocationInventoryCollection storefrontGetProductInventories(responseFields, locationInventoryQuery)

Get location inventories for a list of products

Get location inventories for a list of products

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    LocationInventoryQuery locationInventoryQuery = new LocationInventoryQuery(); // LocationInventoryQuery | 
    try {
      LocationInventoryCollection result = apiInstance.storefrontGetProductInventories(responseFields, locationInventoryQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontGetProductInventories");
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
| **locationInventoryQuery** | [**LocationInventoryQuery**](LocationInventoryQuery.md)|  | [optional] |

### Return type

[**LocationInventoryCollection**](LocationInventoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetProductInventory"></a>
# **storefrontGetProductInventory**
> LocationInventoryCollection storefrontGetProductInventory(productCode, locationCodes, includeFutureInventory, includeSegmentedInventory, serialNumber, condition, responseFields)

Get Location Inventory

Get product inventory. You can provide up to a maximum of 200 product codes and 200 location codes in the endpoint by default.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String locationCodes = "locationCodes_example"; // String | 
    Boolean includeFutureInventory = false; // Boolean | 
    Boolean includeSegmentedInventory = false; // Boolean | 
    String serialNumber = "serialNumber_example"; // String | 
    String condition = "condition_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      LocationInventoryCollection result = apiInstance.storefrontGetProductInventory(productCode, locationCodes, includeFutureInventory, includeSegmentedInventory, serialNumber, condition, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontGetProductInventory");
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
| **productCode** | **String**|  | |
| **locationCodes** | **String**|  | [optional] |
| **includeFutureInventory** | **Boolean**|  | [optional] [default to false] |
| **includeSegmentedInventory** | **Boolean**|  | [optional] [default to false] |
| **serialNumber** | **String**|  | [optional] |
| **condition** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**LocationInventoryCollection**](LocationInventoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetProducts"></a>
# **storefrontGetProducts**
> CatalogRuntimesProductCollection storefrontGetProducts(filter, startIndex, pageSize, sortBy, responseGroups, responseOptions, cursorMark, defaultSort, mid, includeAllImages, useSubscriptionPricing, includeProductDetailsOnlyProperty, collapse, customerSegments, responseFields)

Get Products

Retrieves a list of products that appear on the storefront according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String filter = "filter_example"; // String | Optional. A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than, gt = greater than or equals, le = less than or equals, sw = starts with, or cont = contains.
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a pageSize of 25, to get the 51st through the 75th items, startIndex=3. Default value: 0.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a single query. Default value: 20. Maximum value: 200.
    String sortBy = "sortBy_example"; // String | Optional. Sort the results by and the order in which the results appear. Either ascending order (a-z) which accepts 'asc' or 'ASC' or descending order (z-a) which accepts 'desc' or 'DESC'. The sortBy parameter follows an available property. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc.
    String responseGroups = "responseGroups_example"; // String | Optional. Response groups to be determined.
    String responseOptions = "responseOptions_example"; // String | 
    String cursorMark = "cursorMark_example"; // String | Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null.
    String defaultSort = "defaultSort_example"; // String | 
    String mid = "mid_example"; // String | 
    Boolean includeAllImages = false; // Boolean | Optional. If true return all images instead of default images.
    Boolean useSubscriptionPricing = false; // Boolean | 
    Boolean includeProductDetailsOnlyProperty = false; // Boolean | 
    Boolean collapse = false; // Boolean | 
    String customerSegments = "customerSegments_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogRuntimesProductCollection result = apiInstance.storefrontGetProducts(filter, startIndex, pageSize, sortBy, responseGroups, responseOptions, cursorMark, defaultSort, mid, includeAllImages, useSubscriptionPricing, includeProductDetailsOnlyProperty, collapse, customerSegments, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontGetProducts");
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
| **filter** | **String**| Optional. A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than, gt &#x3D; greater than or equals, le &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. | [optional] |
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a pageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. Default value: 0. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a single query. Default value: 20. Maximum value: 200. | [optional] |
| **sortBy** | **String**| Optional. Sort the results by and the order in which the results appear. Either ascending order (a-z) which accepts &#39;asc&#39; or &#39;ASC&#39; or descending order (z-a) which accepts &#39;desc&#39; or &#39;DESC&#39;. The sortBy parameter follows an available property. For example, to sort the results by “ID” ascending then by “CreateDate” descending, use: id asc,createdate desc. | [optional] |
| **responseGroups** | **String**| Optional. Response groups to be determined. | [optional] |
| **responseOptions** | **String**|  | [optional] |
| **cursorMark** | **String**| Pass in * to begin a deep page operation. The response will include a nextCursorMark value. Pass this into the next call. Continue with this pattern until nextCursorMark is null. | [optional] |
| **defaultSort** | **String**|  | [optional] |
| **mid** | **String**|  | [optional] |
| **includeAllImages** | **Boolean**| Optional. If true return all images instead of default images. | [optional] [default to false] |
| **useSubscriptionPricing** | **Boolean**|  | [optional] [default to false] |
| **includeProductDetailsOnlyProperty** | **Boolean**|  | [optional] [default to false] |
| **collapse** | **Boolean**|  | [optional] [default to false] |
| **customerSegments** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogRuntimesProductCollection**](CatalogRuntimesProductCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontProductSubstitutions"></a>
# **storefrontProductSubstitutions**
> ProductSubstituteCollection storefrontProductSubstitutions(productCode, preferredProductCode, responseFields)

Get Product Substitutions

Returns a list of up to 10 products that can be substituted for the provided product code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String preferredProductCode = "preferredProductCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ProductSubstituteCollection result = apiInstance.storefrontProductSubstitutions(productCode, preferredProductCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontProductSubstitutions");
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
| **productCode** | **String**|  | |
| **preferredProductCode** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ProductSubstituteCollection**](ProductSubstituteCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontValidateDiscounts"></a>
# **storefrontValidateDiscounts**
> DiscountValidationSummary storefrontValidateDiscounts(productCode, variationProductCode, customerAccountId, allowInactive, skipInventoryCheck, responseFields, discountSelections)

Validate Discounts

Validate if a collection of discounts is valid for a product.  This includes discounts that would normally be considered order level discounts.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationProductCode = "variationProductCode_example"; // String | 
    Integer customerAccountId = 56; // Integer | Customer Id may be set in the querystring or in the user claims bag if the caller context is a shopper.
    Boolean allowInactive = true; // Boolean | 
    Boolean skipInventoryCheck = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    DiscountSelections discountSelections = new DiscountSelections(); // DiscountSelections | 
    try {
      DiscountValidationSummary result = apiInstance.storefrontValidateDiscounts(productCode, variationProductCode, customerAccountId, allowInactive, skipInventoryCheck, responseFields, discountSelections);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontValidateDiscounts");
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
| **productCode** | **String**|  | |
| **variationProductCode** | **String**|  | [optional] |
| **customerAccountId** | **Integer**| Customer Id may be set in the querystring or in the user claims bag if the caller context is a shopper. | [optional] |
| **allowInactive** | **Boolean**|  | [optional] |
| **skipInventoryCheck** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **discountSelections** | [**DiscountSelections**](DiscountSelections.md)|  | [optional] |

### Return type

[**DiscountValidationSummary**](DiscountValidationSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontValidateProduct"></a>
# **storefrontValidateProduct**
> ProductValidationSummary storefrontValidateProduct(productCode, skipInventoryCheck, quantity, skipDefaults, purchaseLocation, useSubscriptionPricing, recalculateDynamicCategories, acceptVariantProductCode, responseFields, productOptionSelections)

Validate Variant Product

Validate the final state of shopper-selected options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.StorefrontProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    StorefrontProductsApi apiInstance = new StorefrontProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code of product being validated.
    Boolean skipInventoryCheck = false; // Boolean | Determines whether or not to check inventory on an item when validating
    Integer quantity = 56; // Integer | Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified.
    Boolean skipDefaults = false; // Boolean | Determines whether or not to add configured default-extras on an item when validating
    String purchaseLocation = "purchaseLocation_example"; // String | 
    Boolean useSubscriptionPricing = false; // Boolean | 
    Boolean recalculateDynamicCategories = false; // Boolean | 
    Boolean acceptVariantProductCode = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ProductOptionSelections productOptionSelections = new ProductOptionSelections(); // ProductOptionSelections | Final state of shopper selected options.
    try {
      ProductValidationSummary result = apiInstance.storefrontValidateProduct(productCode, skipInventoryCheck, quantity, skipDefaults, purchaseLocation, useSubscriptionPricing, recalculateDynamicCategories, acceptVariantProductCode, responseFields, productOptionSelections);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontProductsApi#storefrontValidateProduct");
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
| **productCode** | **String**| Merchant-created code of product being validated. | |
| **skipInventoryCheck** | **Boolean**| Determines whether or not to check inventory on an item when validating | [optional] [default to false] |
| **quantity** | **Integer**| Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified. | [optional] |
| **skipDefaults** | **Boolean**| Determines whether or not to add configured default-extras on an item when validating | [optional] [default to false] |
| **purchaseLocation** | **String**|  | [optional] |
| **useSubscriptionPricing** | **Boolean**|  | [optional] [default to false] |
| **recalculateDynamicCategories** | **Boolean**|  | [optional] [default to false] |
| **acceptVariantProductCode** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **productOptionSelections** | [**ProductOptionSelections**](ProductOptionSelections.md)| Final state of shopper selected options. | [optional] |

### Return type

[**ProductValidationSummary**](ProductValidationSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

