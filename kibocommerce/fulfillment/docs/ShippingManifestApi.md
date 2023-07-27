# ShippingManifestApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManifestUsingPOST**](ShippingManifestApi.md#createManifestUsingPOST) | **POST** /commerce/fulfillment/shipping/manifests | Create Manifest |
| [**getEligibleShipmentsUsingGET**](ShippingManifestApi.md#getEligibleShipmentsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/eligibleShipments | Get Eligible Shipments |
| [**getManifestUsingGET**](ShippingManifestApi.md#getManifestUsingGET) | **GET** /commerce/fulfillment/shipping/manifests/{manifestId} | Get Manifest |
| [**getManifestsUsingGET**](ShippingManifestApi.md#getManifestsUsingGET) | **GET** /commerce/fulfillment/shipping/manifests | Get Manifests |


<a name="createManifestUsingPOST"></a>
# **createManifestUsingPOST**
> EntityModelOfManifest createManifestUsingPOST(fulfillmentManifestRequest)

Create Manifest

Create Manifest

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShippingManifestApi;

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

    ShippingManifestApi apiInstance = new ShippingManifestApi(defaultClient);
    FulfillmentManifestRequest fulfillmentManifestRequest = new FulfillmentManifestRequest(); // FulfillmentManifestRequest | 
    try {
      EntityModelOfManifest result = apiInstance.createManifestUsingPOST(fulfillmentManifestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingManifestApi#createManifestUsingPOST");
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
| **fulfillmentManifestRequest** | [**FulfillmentManifestRequest**](FulfillmentManifestRequest.md)|  | [optional] |

### Return type

[**EntityModelOfManifest**](EntityModelOfManifest.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getEligibleShipmentsUsingGET"></a>
# **getEligibleShipmentsUsingGET**
> CollectionModelOfShipment getEligibleShipmentsUsingGET(fulfillmentLocationCode, carrier, fromDays)

Get Eligible Shipments

Get Eligible Shipments

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShippingManifestApi;

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

    ShippingManifestApi apiInstance = new ShippingManifestApi(defaultClient);
    String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
    String carrier = "carrier_example"; // String | carrier
    Integer fromDays = 56; // Integer | fromDays
    try {
      CollectionModelOfShipment result = apiInstance.getEligibleShipmentsUsingGET(fulfillmentLocationCode, carrier, fromDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingManifestApi#getEligibleShipmentsUsingGET");
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
| **fulfillmentLocationCode** | **String**| fulfillmentLocationCode | |
| **carrier** | **String**| carrier | |
| **fromDays** | **Integer**| fromDays | [optional] |

### Return type

[**CollectionModelOfShipment**](CollectionModelOfShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getManifestUsingGET"></a>
# **getManifestUsingGET**
> EntityModelOfManifest getManifestUsingGET(manifestId)

Get Manifest

Get Manifest

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShippingManifestApi;

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

    ShippingManifestApi apiInstance = new ShippingManifestApi(defaultClient);
    String manifestId = "manifestId_example"; // String | manifestId
    try {
      EntityModelOfManifest result = apiInstance.getManifestUsingGET(manifestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingManifestApi#getManifestUsingGET");
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
| **manifestId** | **String**| manifestId | |

### Return type

[**EntityModelOfManifest**](EntityModelOfManifest.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getManifestsUsingGET"></a>
# **getManifestsUsingGET**
> CollectionModelOfManifest getManifestsUsingGET(fulfillmentLocationCode, fromDays)

Get Manifests

Get Manifests

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShippingManifestApi;

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

    ShippingManifestApi apiInstance = new ShippingManifestApi(defaultClient);
    String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
    Integer fromDays = 56; // Integer | fromDays
    try {
      CollectionModelOfManifest result = apiInstance.getManifestsUsingGET(fulfillmentLocationCode, fromDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShippingManifestApi#getManifestsUsingGET");
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
| **fulfillmentLocationCode** | **String**| fulfillmentLocationCode | |
| **fromDays** | **Integer**| fromDays | [optional] |

### Return type

[**CollectionModelOfManifest**](CollectionModelOfManifest.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

