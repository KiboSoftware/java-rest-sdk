# CouponSetsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCouponSet**](CouponSetsApi.md#addCouponSet) | **POST** /commerce/catalog/admin/couponsets | Add Coupon Set |
| [**addCoupons**](CouponSetsApi.md#addCoupons) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes | Add Coupons |
| [**assignDiscount**](CouponSetsApi.md#assignDiscount) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts | Assign Discount to Coupon Set |
| [**deleteCoupon**](CouponSetsApi.md#deleteCoupon) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode} | Delete Coupon |
| [**deleteCouponSet**](CouponSetsApi.md#deleteCouponSet) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode} | Delete Coupon Set |
| [**deleteCoupons**](CouponSetsApi.md#deleteCoupons) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/remove | Delete Coupons |
| [**getAssignedDiscounts**](CouponSetsApi.md#getAssignedDiscounts) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts | Get Assigned Discounts |
| [**getCoupon**](CouponSetsApi.md#getCoupon) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode} | Get Coupon |
| [**getCouponSet**](CouponSetsApi.md#getCouponSet) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode} | Get Coupon Set |
| [**getCouponSets**](CouponSetsApi.md#getCouponSets) | **GET** /commerce/catalog/admin/couponsets | Get Coupon Sets |
| [**getCoupons**](CouponSetsApi.md#getCoupons) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes | Get Coupons |
| [**getUniqueCouponSetCode**](CouponSetsApi.md#getUniqueCouponSetCode) | **GET** /commerce/catalog/admin/couponsets/unique-code | Get Unique Coupon Set Code |
| [**unAssignDiscount**](CouponSetsApi.md#unAssignDiscount) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts/{discountId} | Unassign Discount from Coupon Set |
| [**updateCouponSet**](CouponSetsApi.md#updateCouponSet) | **PUT** /commerce/catalog/admin/couponsets/{couponSetCode} | Update Coupon Set |
| [**validateUniqueCouponSetCode**](CouponSetsApi.md#validateUniqueCouponSetCode) | **POST** /commerce/catalog/admin/couponsets/validate-unique-code | Validate Unique Coupon Set Code |


<a name="addCouponSet"></a>
# **addCouponSet**
> CouponSet addCouponSet(responseFields, couponSet)

Add Coupon Set

Adds a single CouponSet

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CouponSet couponSet = new CouponSet(); // CouponSet | 
    try {
      CouponSet result = apiInstance.addCouponSet(responseFields, couponSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#addCouponSet");
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
| **couponSet** | [**CouponSet**](CouponSet.md)|  | [optional] |

### Return type

[**CouponSet**](CouponSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addCoupons"></a>
# **addCoupons**
> addCoupons(couponSetCode, responseFields, coupon)

Add Coupons

Adds coupon codes to a coupon set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<Coupon> coupon = Arrays.asList(); // List<Coupon> | 
    try {
      apiInstance.addCoupons(couponSetCode, responseFields, coupon);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#addCoupons");
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
| **couponSetCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **coupon** | [**List&lt;Coupon&gt;**](Coupon.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="assignDiscount"></a>
# **assignDiscount**
> assignDiscount(couponSetCode, responseFields, assignedDiscount)

Assign Discount to Coupon Set

Assigns or associates an existing discount to a specified coupon set. Use the couponSetCode parameter to specify the coupon set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    AssignedDiscount assignedDiscount = new AssignedDiscount(); // AssignedDiscount | 
    try {
      apiInstance.assignDiscount(couponSetCode, responseFields, assignedDiscount);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#assignDiscount");
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
| **couponSetCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **assignedDiscount** | [**AssignedDiscount**](AssignedDiscount.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(couponSetCode, couponCode)

Delete Coupon

Deletes a single coupon by its coupon code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String couponCode = "couponCode_example"; // String | 
    try {
      apiInstance.deleteCoupon(couponSetCode, couponCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#deleteCoupon");
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
| **couponSetCode** | **String**|  | |
| **couponCode** | **String**|  | |

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

<a name="deleteCouponSet"></a>
# **deleteCouponSet**
> deleteCouponSet(couponSetCode)

Delete Coupon Set

Deletes a CouponSet.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    try {
      apiInstance.deleteCouponSet(couponSetCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#deleteCouponSet");
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
| **couponSetCode** | **String**|  | |

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

<a name="deleteCoupons"></a>
# **deleteCoupons**
> deleteCoupons(couponSetCode, responseFields, requestBody)

Delete Coupons

Deletes coupons from a coupon set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.deleteCoupons(couponSetCode, responseFields, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#deleteCoupons");
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
| **couponSetCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAssignedDiscounts"></a>
# **getAssignedDiscounts**
> List&lt;AssignedDiscount&gt; getAssignedDiscounts(couponSetCode, responseFields)

Get Assigned Discounts

Retrieves the discountIds of any assigned discounts for the specified coupon set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<AssignedDiscount> result = apiInstance.getAssignedDiscounts(couponSetCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#getAssignedDiscounts");
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
| **couponSetCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**List&lt;AssignedDiscount&gt;**](AssignedDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCoupon"></a>
# **getCoupon**
> Coupon getCoupon(couponSetCode, couponCode, includeCounts, responseGroups, responseFields)

Get Coupon

Retrieves a single coupon by its coupon code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String couponCode = "couponCode_example"; // String | 
    Boolean includeCounts = false; // Boolean | 
    String responseGroups = "responseGroups_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Coupon result = apiInstance.getCoupon(couponSetCode, couponCode, includeCounts, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#getCoupon");
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
| **couponSetCode** | **String**|  | |
| **couponCode** | **String**|  | |
| **includeCounts** | **Boolean**|  | [optional] [default to false] |
| **responseGroups** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCouponSet"></a>
# **getCouponSet**
> CouponSet getCouponSet(couponSetCode, includeCounts, responseGroups, responseFields)

Get Coupon Set

Returns a single CouponSet

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | CouponSetCode for the requested CouponSet
    Boolean includeCounts = false; // Boolean | Include the redemption counts and coupon counts
    String responseGroups = "responseGroups_example"; // String | \"counts\" includes the number of redemptions, coupon codes, and assigned discounts.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CouponSet result = apiInstance.getCouponSet(couponSetCode, includeCounts, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#getCouponSet");
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
| **couponSetCode** | **String**| CouponSetCode for the requested CouponSet | |
| **includeCounts** | **Boolean**| Include the redemption counts and coupon counts | [optional] [default to false] |
| **responseGroups** | **String**| \&quot;counts\&quot; includes the number of redemptions, coupon codes, and assigned discounts. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CouponSet**](CouponSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCouponSets"></a>
# **getCouponSets**
> CouponSetCollection getCouponSets(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields)

Get Coupon Sets

Returns a paged collection of CouponSets

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeCounts = false; // Boolean | Include coupon and redemption counts
    String responseGroups = "responseGroups_example"; // String | \"counts\" returns discount and couponCode counts
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CouponSetCollection result = apiInstance.getCouponSets(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#getCouponSets");
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
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **includeCounts** | **Boolean**| Include coupon and redemption counts | [optional] [default to false] |
| **responseGroups** | **String**| \&quot;counts\&quot; returns discount and couponCode counts | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CouponSetCollection**](CouponSetCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCoupons"></a>
# **getCoupons**
> CouponCollection getCoupons(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields)

Get Coupons

Returns a paged collection of Coupons.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeCounts = false; // Boolean | Includes coupon redemption counts
    String responseGroups = "responseGroups_example"; // String | counts
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CouponCollection result = apiInstance.getCoupons(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#getCoupons");
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
| **couponSetCode** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] [default to 0] |
| **pageSize** | **Integer**|  | [optional] [default to 0] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **includeCounts** | **Boolean**| Includes coupon redemption counts | [optional] [default to false] |
| **responseGroups** | **String**| counts | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CouponCollection**](CouponCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUniqueCouponSetCode"></a>
# **getUniqueCouponSetCode**
> String getUniqueCouponSetCode(responseFields)

Get Unique Coupon Set Code

Returns a random 4 character code that is unique as a coupon set code.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      String result = apiInstance.getUniqueCouponSetCode(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#getUniqueCouponSetCode");
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

<a name="unAssignDiscount"></a>
# **unAssignDiscount**
> unAssignDiscount(couponSetCode, discountId)

Unassign Discount from Coupon Set

Unassigns or disassociates the specified discount with the specified coupon set.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    Integer discountId = 56; // Integer | 
    try {
      apiInstance.unAssignDiscount(couponSetCode, discountId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#unAssignDiscount");
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
| **couponSetCode** | **String**|  | |
| **discountId** | **Integer**|  | |

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

<a name="updateCouponSet"></a>
# **updateCouponSet**
> CouponSet updateCouponSet(couponSetCode, responseFields, couponSet)

Update Coupon Set

Update a CouponSet. You can not update the Code or ID once the set is created.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CouponSet couponSet = new CouponSet(); // CouponSet | 
    try {
      CouponSet result = apiInstance.updateCouponSet(couponSetCode, responseFields, couponSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#updateCouponSet");
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
| **couponSetCode** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **couponSet** | [**CouponSet**](CouponSet.md)|  | [optional] |

### Return type

[**CouponSet**](CouponSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="validateUniqueCouponSetCode"></a>
# **validateUniqueCouponSetCode**
> validateUniqueCouponSetCode(responseFields, body)

Validate Unique Coupon Set Code

Tests a coupone set code for uniqueness and validity.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.CouponSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    String body = "body_example"; // String | 
    try {
      apiInstance.validateUniqueCouponSetCode(responseFields, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CouponSetsApi#validateUniqueCouponSetCode");
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
| **body** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

