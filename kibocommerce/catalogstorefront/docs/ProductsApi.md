# ProductsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontConfigureProduct**](ProductsApi.md#storefrontConfigureProduct) | **POST** /commerce/catalog/storefront/products/{productCode}/configure | Configures a variant product |
| [**storefrontGetProduct**](ProductsApi.md#storefrontGetProduct) | **GET** /commerce/catalog/storefront/products/{productCode} | Get a product |
| [**storefrontGetProductCosts**](ProductsApi.md#storefrontGetProductCosts) | **POST** /commerce/catalog/storefront/products/costs | Get costs for products |
| [**storefrontGetProductForIndexing**](ProductsApi.md#storefrontGetProductForIndexing) | **GET** /commerce/catalog/storefront/products/indexing/{productCode} | Get a product for indexing |
| [**storefrontGetProductInventories**](ProductsApi.md#storefrontGetProductInventories) | **POST** /commerce/catalog/storefront/products/locationinventory | Get location inventories for products |
| [**storefrontGetProductInventory**](ProductsApi.md#storefrontGetProductInventory) | **GET** /commerce/catalog/storefront/products/{productCode}/locationinventory | Get product inventory |
| [**storefrontGetProducts**](ProductsApi.md#storefrontGetProducts) | **GET** /commerce/catalog/storefront/products | Get a list of products |
| [**storefrontProductSubstitutions**](ProductsApi.md#storefrontProductSubstitutions) | **GET** /commerce/catalog/storefront/products/{productCode}/substitutions | Get product substitutions |
| [**storefrontValidateDiscounts**](ProductsApi.md#storefrontValidateDiscounts) | **POST** /commerce/catalog/storefront/products/{productCode}/validateDiscounts | Validates discounts for a product |
| [**storefrontValidateProduct**](ProductsApi.md#storefrontValidateProduct) | **POST** /commerce/catalog/storefront/products/{productCode}/validate | Validates a variant product |


<a name="storefrontConfigureProduct"></a>
# **storefrontConfigureProduct**
> ConfiguredProduct storefrontConfigureProduct(productCode, includeOptionDetails, skipInventoryCheck, quantity, purchaseLocation, variationProductCodeFilter, useSubscriptionPricing, subscriptionFrequency, productOptionSelections)

Configures a variant product

Creates a new product selection. A create occurs each time a shopper selects a product option as they configure a product. Once all the required product options are configured, the product can be added to a cart.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code for the product being configured, for example, a SKU. Max length: 30.
    Boolean includeOptionDetails = true; // Boolean | If true, the response returns product details such as. If false, returns a product summary such as the product name, price, and sale price.
    Boolean skipInventoryCheck = false; // Boolean | Determines whether or not to check inventory on an item when validating
    Integer quantity = 56; // Integer | Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified.
    String purchaseLocation = "purchaseLocation_example"; // String | 
    String variationProductCodeFilter = "variationProductCodeFilter_example"; // String | 
    Boolean useSubscriptionPricing = false; // Boolean | 
    String subscriptionFrequency = "subscriptionFrequency_example"; // String | 
    ProductOptionSelections productOptionSelections = new ProductOptionSelections(); // ProductOptionSelections | Shopper-selected options.
    try {
      ConfiguredProduct result = apiInstance.storefrontConfigureProduct(productCode, includeOptionDetails, skipInventoryCheck, quantity, purchaseLocation, variationProductCodeFilter, useSubscriptionPricing, subscriptionFrequency, productOptionSelections);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontConfigureProduct");
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
| **productOptionSelections** | [**ProductOptionSelections**](ProductOptionSelections.md)| Shopper-selected options. | [optional] |

### Return type

[**ConfiguredProduct**](ConfiguredProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetProduct"></a>
# **storefrontGetProduct**
> CatalogRuntimesProduct storefrontGetProduct(productCode, variationProductCode, responseGroups, allowInactive, skipInventoryCheck, supressOutOfStock404, quantity, acceptVariantProductCode, purchaseLocation, variationProductCodeFilter, sliceValue, includeAllImages, useSubscriptionPricing)

Get a product

Retrieves information about a single product given its product code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
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
    try {
      CatalogRuntimesProduct result = apiInstance.storefrontGetProduct(productCode, variationProductCode, responseGroups, allowInactive, skipInventoryCheck, supressOutOfStock404, quantity, acceptVariantProductCode, purchaseLocation, variationProductCodeFilter, sliceValue, includeAllImages, useSubscriptionPricing);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontGetProduct");
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

### Return type

[**CatalogRuntimesProduct**](CatalogRuntimesProduct.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetProductCosts"></a>
# **storefrontGetProductCosts**
> ProductCostCollection storefrontGetProductCosts(productCostQuery)

Get costs for products

Get costs for products

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    ProductCostQuery productCostQuery = new ProductCostQuery(); // ProductCostQuery | 
    try {
      ProductCostCollection result = apiInstance.storefrontGetProductCosts(productCostQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontGetProductCosts");
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
| **productCostQuery** | [**ProductCostQuery**](ProductCostQuery.md)|  | [optional] |

### Return type

[**ProductCostCollection**](ProductCostCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetProductForIndexing"></a>
# **storefrontGetProductForIndexing**
> ProductForIndexing storefrontGetProductForIndexing(productCode, responseGroups, productVersion, lastModifiedDate)

Get a product for indexing

Retrieves information about a single product given its product code for Mozu to index in the search engine

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Required. Merchant-created code associated with the product, for example, a SKU. Max length: 30.
    String responseGroups = "responseGroups_example"; // String | Optional. Response groups to be determined.
    Long productVersion = 56L; // Long | Optional. The current version of the product to use for latency checking.                If this instance of Product Runtime is configured to run against a replicated database node that has a lesser version than this value, it will read from the primary database node to prevent stale data.
    OffsetDateTime lastModifiedDate = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      ProductForIndexing result = apiInstance.storefrontGetProductForIndexing(productCode, responseGroups, productVersion, lastModifiedDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontGetProductForIndexing");
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
| **productVersion** | **Long**| Optional. The current version of the product to use for latency checking.                If this instance of Product Runtime is configured to run against a replicated database node that has a lesser version than this value, it will read from the primary database node to prevent stale data. | [optional] |
| **lastModifiedDate** | **OffsetDateTime**|  | [optional] |

### Return type

[**ProductForIndexing**](ProductForIndexing.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetProductInventories"></a>
# **storefrontGetProductInventories**
> LocationInventoryCollection storefrontGetProductInventories(locationInventoryQuery)

Get location inventories for products

Get location inventories for products

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    LocationInventoryQuery locationInventoryQuery = new LocationInventoryQuery(); // LocationInventoryQuery | 
    try {
      LocationInventoryCollection result = apiInstance.storefrontGetProductInventories(locationInventoryQuery);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontGetProductInventories");
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
| **locationInventoryQuery** | [**LocationInventoryQuery**](LocationInventoryQuery.md)|  | [optional] |

### Return type

[**LocationInventoryCollection**](LocationInventoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetProductInventory"></a>
# **storefrontGetProductInventory**
> LocationInventoryCollection storefrontGetProductInventory(productCode, locationCodes)

Get product inventory

Get product inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String locationCodes = "locationCodes_example"; // String | 
    try {
      LocationInventoryCollection result = apiInstance.storefrontGetProductInventory(productCode, locationCodes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontGetProductInventory");
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

### Return type

[**LocationInventoryCollection**](LocationInventoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontGetProducts"></a>
# **storefrontGetProducts**
> CatalogRuntimesProductCollection storefrontGetProducts(filter, startIndex, pageSize, sortBy, responseGroups, responseOptions, cursorMark, defaultSort, mid, includeAllImages, useSubscriptionPricing, includeProductDetailsOnlyProperty)

Get a list of products

Retrieves a list of products that appear on the storefront according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
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
    try {
      CatalogRuntimesProductCollection result = apiInstance.storefrontGetProducts(filter, startIndex, pageSize, sortBy, responseGroups, responseOptions, cursorMark, defaultSort, mid, includeAllImages, useSubscriptionPricing, includeProductDetailsOnlyProperty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontGetProducts");
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

### Return type

[**CatalogRuntimesProductCollection**](CatalogRuntimesProductCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontProductSubstitutions"></a>
# **storefrontProductSubstitutions**
> ProductSubstituteCollection storefrontProductSubstitutions(productCode)

Get product substitutions

Returns a list of up to 10 products that can be substituted for the provided product code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    try {
      ProductSubstituteCollection result = apiInstance.storefrontProductSubstitutions(productCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontProductSubstitutions");
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

### Return type

[**ProductSubstituteCollection**](ProductSubstituteCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontValidateDiscounts"></a>
# **storefrontValidateDiscounts**
> DiscountValidationSummary storefrontValidateDiscounts(productCode, variationProductCode, customerAccountId, allowInactive, skipInventoryCheck, discountSelections)

Validates discounts for a product

Validate if a collection of discounts is valid for a product.  This includes discounts that would normally be considered order level discounts.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String variationProductCode = "variationProductCode_example"; // String | 
    Integer customerAccountId = 56; // Integer | Customer Id may be set in the querystring or in the user claims bag if the caller context is a shopper.
    Boolean allowInactive = true; // Boolean | 
    Boolean skipInventoryCheck = false; // Boolean | 
    DiscountSelections discountSelections = new DiscountSelections(); // DiscountSelections | 
    try {
      DiscountValidationSummary result = apiInstance.storefrontValidateDiscounts(productCode, variationProductCode, customerAccountId, allowInactive, skipInventoryCheck, discountSelections);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontValidateDiscounts");
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
| **discountSelections** | [**DiscountSelections**](DiscountSelections.md)|  | [optional] |

### Return type

[**DiscountValidationSummary**](DiscountValidationSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="storefrontValidateProduct"></a>
# **storefrontValidateProduct**
> ProductValidationSummary storefrontValidateProduct(productCode, skipInventoryCheck, quantity, skipDefaults, purchaseLocation, useSubscriptionPricing, recalculateDynamicCategories, acceptVariantProductCode, productOptionSelections)

Validates a variant product

Validate the final state of shopper-selected options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productCode = "productCode_example"; // String | Merchant-created code of product being validated.
    Boolean skipInventoryCheck = false; // Boolean | Determines whether or not to check inventory on an item when validating
    Integer quantity = 56; // Integer | Optional.  If specified, will be used for returning pricing based on volume if applicable.  Defaults to 1 if not specified.
    Boolean skipDefaults = false; // Boolean | Determines whether or not to add configured default-extras on an item when validating
    String purchaseLocation = "purchaseLocation_example"; // String | 
    Boolean useSubscriptionPricing = false; // Boolean | 
    Boolean recalculateDynamicCategories = false; // Boolean | 
    Boolean acceptVariantProductCode = false; // Boolean | 
    ProductOptionSelections productOptionSelections = new ProductOptionSelections(); // ProductOptionSelections | Final state of shopper selected options.
    try {
      ProductValidationSummary result = apiInstance.storefrontValidateProduct(productCode, skipInventoryCheck, quantity, skipDefaults, purchaseLocation, useSubscriptionPricing, recalculateDynamicCategories, acceptVariantProductCode, productOptionSelections);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#storefrontValidateProduct");
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
| **productOptionSelections** | [**ProductOptionSelections**](ProductOptionSelections.md)| Final state of shopper selected options. | [optional] |

### Return type

[**ProductValidationSummary**](ProductValidationSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

