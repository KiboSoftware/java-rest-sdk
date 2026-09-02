# DiscountsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storefrontFindItemDiscounts**](DiscountsApi.md#storefrontFindItemDiscounts) | **POST** /commerce/catalog/storefront/discounts/products | Get Item Discounts |
| [**storefrontFindOrderDiscounts**](DiscountsApi.md#storefrontFindOrderDiscounts) | **POST** /commerce/catalog/storefront/discounts/orders | Get Order Level Discounts |
| [**storefrontGetAutoAddTarget**](DiscountsApi.md#storefrontGetAutoAddTarget) | **GET** /commerce/catalog/storefront/discounts/autoaddtarget/{discountId} | Get Auto Add Target |
| [**storefrontGetDiscountByCouponCode**](DiscountsApi.md#storefrontGetDiscountByCouponCode) | **GET** /commerce/catalog/storefront/discounts/couponCode/{couponCode} | Get Discount by Coupon Code |
| [**storefrontGetDiscountById**](DiscountsApi.md#storefrontGetDiscountById) | **GET** /commerce/catalog/storefront/discounts/id/{id} | Get Discount by ID |
| [**storefrontGetDiscountByLabel**](DiscountsApi.md#storefrontGetDiscountByLabel) | **GET** /commerce/catalog/storefront/discounts/label/{label} | Get Discounts by Label |
| [**storefrontGetDiscountByLabel1**](DiscountsApi.md#storefrontGetDiscountByLabel1) | **GET** /commerce/catalog/storefront/discounts/secure/label/{label} | Get Secure Discounts by Label |
| [**storefrontGetItemDiscounts**](DiscountsApi.md#storefrontGetItemDiscounts) | **GET** /commerce/catalog/storefront/discounts/products/{productCode} | Get Item Discounts by Product |
| [**storefrontGetPublicDiscountByCode**](DiscountsApi.md#storefrontGetPublicDiscountByCode) | **GET** /commerce/catalog/storefront/discounts/code/{code} | Get Discount by Code |
| [**storefrontSecureGetDiscountByCode**](DiscountsApi.md#storefrontSecureGetDiscountByCode) | **GET** /commerce/catalog/storefront/discounts/secure/code/{code} | Get Secure Discount by Code |
| [**storefrontSecureGetDiscountByCouponCode**](DiscountsApi.md#storefrontSecureGetDiscountByCouponCode) | **GET** /commerce/catalog/storefront/discounts/secure/couponCode/{couponCode} | Get Secure Discount by Coupon Code |
| [**storefrontSecureGetDiscountById**](DiscountsApi.md#storefrontSecureGetDiscountById) | **GET** /commerce/catalog/storefront/discounts/secure/id/{id} | Get Secure Discount by ID |


<a name="storefrontFindItemDiscounts"></a>
# **storefrontFindItemDiscounts**
> FindDiscountsResponse storefrontFindItemDiscounts(responseFields, findItemDiscountsRequest)

Get Item Discounts

Retrieves a list of discounts that appear on the storefront according to specified filter criteria.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FindItemDiscountsRequest findItemDiscountsRequest = new FindItemDiscountsRequest(); // FindItemDiscountsRequest | 
    try {
      FindDiscountsResponse result = apiInstance.storefrontFindItemDiscounts(responseFields, findItemDiscountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontFindItemDiscounts");
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
| **findItemDiscountsRequest** | [**FindItemDiscountsRequest**](FindItemDiscountsRequest.md)|  | [optional] |

### Return type

[**FindDiscountsResponse**](FindDiscountsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontFindOrderDiscounts"></a>
# **storefrontFindOrderDiscounts**
> List&lt;FindDiscountsResponse&gt; storefrontFindOrderDiscounts(responseFields, findOrderDiscountsRequest)

Get Order Level Discounts

Retrieves a list of order level discounts that appear on the storefront according to specified filter criteria.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FindOrderDiscountsRequest findOrderDiscountsRequest = new FindOrderDiscountsRequest(); // FindOrderDiscountsRequest | 
    try {
      List<FindDiscountsResponse> result = apiInstance.storefrontFindOrderDiscounts(responseFields, findOrderDiscountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontFindOrderDiscounts");
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
| **findOrderDiscountsRequest** | [**FindOrderDiscountsRequest**](FindOrderDiscountsRequest.md)|  | [optional] |

### Return type

[**List&lt;FindDiscountsResponse&gt;**](FindDiscountsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetAutoAddTarget"></a>
# **storefrontGetAutoAddTarget**
> AutoAddDiscountTarget storefrontGetAutoAddTarget(discountId, responseFields)

Get Auto Add Target

Retrieves the auto add target for the specified discountId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

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
      AutoAddDiscountTarget result = apiInstance.storefrontGetAutoAddTarget(discountId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontGetAutoAddTarget");
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

[**AutoAddDiscountTarget**](AutoAddDiscountTarget.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetDiscountByCouponCode"></a>
# **storefrontGetDiscountByCouponCode**
> PricingRuntimeDiscount storefrontGetDiscountByCouponCode(couponCode, responseFields)

Get Discount by Coupon Code

Retrieves a discount by coupon code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String couponCode = "couponCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscount result = apiInstance.storefrontGetDiscountByCouponCode(couponCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontGetDiscountByCouponCode");
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
| **couponCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscount**](PricingRuntimeDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetDiscountById"></a>
# **storefrontGetDiscountById**
> PricingRuntimeDiscount storefrontGetDiscountById(id, responseFields)

Get Discount by ID

Retrieves a discount by discountId.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer id = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscount result = apiInstance.storefrontGetDiscountById(id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontGetDiscountById");
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
| **id** | **Integer**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscount**](PricingRuntimeDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetDiscountByLabel"></a>
# **storefrontGetDiscountByLabel**
> PricingRuntimeDiscountCollection storefrontGetDiscountByLabel(label, responseFields)

Get Discounts by Label

Retrieves a list of discounts by label.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String label = "label_example"; // String | The label of the discount.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscountCollection result = apiInstance.storefrontGetDiscountByLabel(label, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontGetDiscountByLabel");
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
| **label** | **String**| The label of the discount. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscountCollection**](PricingRuntimeDiscountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetDiscountByLabel1"></a>
# **storefrontGetDiscountByLabel1**
> PricingRuntimeDiscountCollection storefrontGetDiscountByLabel1(label, responseFields)

Get Secure Discounts by Label

Retrieves non-public discounts by label. These can only be accessed by users with the Discount Read behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String label = "label_example"; // String | The label of the discount.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscountCollection result = apiInstance.storefrontGetDiscountByLabel1(label, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontGetDiscountByLabel1");
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
| **label** | **String**| The label of the discount. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscountCollection**](PricingRuntimeDiscountCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetItemDiscounts"></a>
# **storefrontGetItemDiscounts**
> FindDiscountsResponse storefrontGetItemDiscounts(productCode, responseFields)

Get Item Discounts by Product

Retrieves a list of discounts that appear on the storefront according to specified filter criteria.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String productCode = "productCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FindDiscountsResponse result = apiInstance.storefrontGetItemDiscounts(productCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontGetItemDiscounts");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FindDiscountsResponse**](FindDiscountsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontGetPublicDiscountByCode"></a>
# **storefrontGetPublicDiscountByCode**
> PricingRuntimeDiscount storefrontGetPublicDiscountByCode(code, responseFields)

Get Discount by Code

Retrieves a discount by discount code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String code = "code_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscount result = apiInstance.storefrontGetPublicDiscountByCode(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontGetPublicDiscountByCode");
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
| **code** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscount**](PricingRuntimeDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontSecureGetDiscountByCode"></a>
# **storefrontSecureGetDiscountByCode**
> PricingRuntimeDiscount storefrontSecureGetDiscountByCode(code, responseFields)

Get Secure Discount by Code

Retrieves a non-public discount by discount code. These can only be accessed by users with the Discount Read behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String code = "code_example"; // String | The discount code
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscount result = apiInstance.storefrontSecureGetDiscountByCode(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontSecureGetDiscountByCode");
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
| **code** | **String**| The discount code | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscount**](PricingRuntimeDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontSecureGetDiscountByCouponCode"></a>
# **storefrontSecureGetDiscountByCouponCode**
> PricingRuntimeDiscount storefrontSecureGetDiscountByCouponCode(couponCode, responseFields)

Get Secure Discount by Coupon Code

Retrieves a non-public discount by coupon code. These can only be accessed by users with the Discount Read behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String couponCode = "couponCode_example"; // String | The coupon code of the discount
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscount result = apiInstance.storefrontSecureGetDiscountByCouponCode(couponCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontSecureGetDiscountByCouponCode");
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
| **couponCode** | **String**| The coupon code of the discount | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscount**](PricingRuntimeDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="storefrontSecureGetDiscountById"></a>
# **storefrontSecureGetDiscountById**
> PricingRuntimeDiscount storefrontSecureGetDiscountById(id, responseFields)

Get Secure Discount by ID

Retrieves a non-public discount by discountId. These can only be accessed by users with the Discount Read behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.pricingstorefront.ApiClient;
import com.kibocommerce.sdk.pricingstorefront.ApiException;
import com.kibocommerce.sdk.pricingstorefront.Configuration;
import com.kibocommerce.sdk.pricingstorefront.auth.*;
import com.kibocommerce.sdk.pricingstorefront.models.*;
import com.kibocommerce.sdk.pricingstorefront.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    Integer id = 56; // Integer | The ID of the discount
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      PricingRuntimeDiscount result = apiInstance.storefrontSecureGetDiscountById(id, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#storefrontSecureGetDiscountById");
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
| **id** | **Integer**| The ID of the discount | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**PricingRuntimeDiscount**](PricingRuntimeDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

