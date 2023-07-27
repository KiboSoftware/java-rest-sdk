# CouponSetsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCouponSet**](CouponSetsApi.md#addCouponSet) | **POST** /commerce/catalog/admin/couponsets | Add coupon set |
| [**addCoupons**](CouponSetsApi.md#addCoupons) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes | Add coupons |
| [**assignDiscount**](CouponSetsApi.md#assignDiscount) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts | Assign discount |
| [**deleteCoupon**](CouponSetsApi.md#deleteCoupon) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode} | Delete coupon |
| [**deleteCouponSet**](CouponSetsApi.md#deleteCouponSet) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode} | Delete coupon set |
| [**deleteCoupons**](CouponSetsApi.md#deleteCoupons) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/remove | Delete coupons |
| [**getAssignedDiscounts**](CouponSetsApi.md#getAssignedDiscounts) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts | Get assigned discounts |
| [**getCoupon**](CouponSetsApi.md#getCoupon) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode} | Get coupon |
| [**getCouponSet**](CouponSetsApi.md#getCouponSet) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode} | Get coupon set |
| [**getCouponSets**](CouponSetsApi.md#getCouponSets) | **GET** /commerce/catalog/admin/couponsets | Get coupon sets |
| [**getCoupons**](CouponSetsApi.md#getCoupons) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes | Get coupons |
| [**getUniqueCouponSetCode**](CouponSetsApi.md#getUniqueCouponSetCode) | **GET** /commerce/catalog/admin/couponsets/unique-code | Get unique coupon set code |
| [**unAssignDiscount**](CouponSetsApi.md#unAssignDiscount) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts/{discountId} | UnAssign discount |
| [**updateCouponSet**](CouponSetsApi.md#updateCouponSet) | **PUT** /commerce/catalog/admin/couponsets/{couponSetCode} | Update coupon set |
| [**validateUniqueCouponSetCode**](CouponSetsApi.md#validateUniqueCouponSetCode) | **POST** /commerce/catalog/admin/couponsets/validate-unique-code | Validate unique coupon set code |


<a name="addCouponSet"></a>
# **addCouponSet**
> CouponSet addCouponSet(couponSet)

Add coupon set

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    CouponSet couponSet = new CouponSet(); // CouponSet | 
    try {
      CouponSet result = apiInstance.addCouponSet(couponSet);
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
| **couponSet** | [**CouponSet**](CouponSet.md)|  | [optional] |

### Return type

[**CouponSet**](CouponSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addCoupons"></a>
# **addCoupons**
> addCoupons(couponSetCode, coupon)

Add coupons



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    List<Coupon> coupon = Arrays.asList(); // List<Coupon> | 
    try {
      apiInstance.addCoupons(couponSetCode, coupon);
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
| **coupon** | [**List&lt;Coupon&gt;**](Coupon.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="assignDiscount"></a>
# **assignDiscount**
> assignDiscount(couponSetCode, assignedDiscount)

Assign discount



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    AssignedDiscount assignedDiscount = new AssignedDiscount(); // AssignedDiscount | 
    try {
      apiInstance.assignDiscount(couponSetCode, assignedDiscount);
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
| **assignedDiscount** | [**AssignedDiscount**](AssignedDiscount.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(couponSetCode, couponCode)

Delete coupon



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCouponSet"></a>
# **deleteCouponSet**
> deleteCouponSet(couponSetCode)

Delete coupon set



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteCoupons"></a>
# **deleteCoupons**
> deleteCoupons(couponSetCode, requestBody)

Delete coupons



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      apiInstance.deleteCoupons(couponSetCode, requestBody);
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
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAssignedDiscounts"></a>
# **getAssignedDiscounts**
> List&lt;AssignedDiscount&gt; getAssignedDiscounts(couponSetCode)

Get assigned discounts



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    try {
      List<AssignedDiscount> result = apiInstance.getAssignedDiscounts(couponSetCode);
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

### Return type

[**List&lt;AssignedDiscount&gt;**](AssignedDiscount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCoupon"></a>
# **getCoupon**
> Coupon getCoupon(couponSetCode, couponCode, includeCounts, responseGroups)

Get coupon



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    String couponCode = "couponCode_example"; // String | 
    Boolean includeCounts = false; // Boolean | 
    String responseGroups = "responseGroups_example"; // String | 
    try {
      Coupon result = apiInstance.getCoupon(couponSetCode, couponCode, includeCounts, responseGroups);
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

### Return type

[**Coupon**](Coupon.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCouponSet"></a>
# **getCouponSet**
> CouponSet getCouponSet(couponSetCode, includeCounts, responseGroups)

Get coupon set

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | CouponSetCode for the requested CouponSet
    Boolean includeCounts = false; // Boolean | Include the redemption counts and coupon counts
    String responseGroups = "responseGroups_example"; // String | \"counts\" includes the number of redemptions, coupon codes, and assigned discounts.
    try {
      CouponSet result = apiInstance.getCouponSet(couponSetCode, includeCounts, responseGroups);
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

### Return type

[**CouponSet**](CouponSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCouponSets"></a>
# **getCouponSets**
> CouponSetCollection getCouponSets(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups)

Get coupon sets

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeCounts = false; // Boolean | Include coupon and redemption counts
    String responseGroups = "responseGroups_example"; // String | \"counts\" returns discount and couponCode counts
    try {
      CouponSetCollection result = apiInstance.getCouponSets(startIndex, pageSize, sortBy, filter, includeCounts, responseGroups);
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

### Return type

[**CouponSetCollection**](CouponSetCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCoupons"></a>
# **getCoupons**
> CouponCollection getCoupons(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups)

Get coupons

Returns a paged collection of Coupons

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    Integer startIndex = 0; // Integer | 
    Integer pageSize = 0; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    Boolean includeCounts = false; // Boolean | Includes coupon redemption counts
    String responseGroups = "responseGroups_example"; // String | counts
    try {
      CouponCollection result = apiInstance.getCoupons(couponSetCode, startIndex, pageSize, sortBy, filter, includeCounts, responseGroups);
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

### Return type

[**CouponCollection**](CouponCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUniqueCouponSetCode"></a>
# **getUniqueCouponSetCode**
> String getUniqueCouponSetCode()

Get unique coupon set code

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    try {
      String result = apiInstance.getUniqueCouponSetCode();
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

<a name="unAssignDiscount"></a>
# **unAssignDiscount**
> unAssignDiscount(couponSetCode, discountId)

UnAssign discount



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCouponSet"></a>
# **updateCouponSet**
> CouponSet updateCouponSet(couponSetCode, couponSet)

Update coupon set

Update a CouponSet.     You can not update the Code or ID once the set is created.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String couponSetCode = "couponSetCode_example"; // String | 
    CouponSet couponSet = new CouponSet(); // CouponSet | 
    try {
      CouponSet result = apiInstance.updateCouponSet(couponSetCode, couponSet);
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
| **couponSet** | [**CouponSet**](CouponSet.md)|  | [optional] |

### Return type

[**CouponSet**](CouponSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="validateUniqueCouponSetCode"></a>
# **validateUniqueCouponSetCode**
> validateUniqueCouponSetCode(code)

Validate unique coupon set code

 Tests code for uniqueness and validity.

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    CouponSetsApi apiInstance = new CouponSetsApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      apiInstance.validateUniqueCouponSetCode(code);
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
| **code** | **String**|  | [optional] |

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

