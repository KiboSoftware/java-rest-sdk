# ManifestApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManifest**](ManifestApi.md#createManifest) | **POST** /commerce/fulfillment/shipping/manifests | createManifest |
| [**getEligibleShipments**](ManifestApi.md#getEligibleShipments) | **GET** /commerce/fulfillment/shipping/manifests/eligibleShipments | getEligibleShipments |
| [**getManifest**](ManifestApi.md#getManifest) | **GET** /commerce/fulfillment/shipping/manifests/{manifestId} | getManifest |
| [**getManifests**](ManifestApi.md#getManifests) | **GET** /commerce/fulfillment/shipping/manifests | getManifests |


<a name="createManifest"></a>
# **createManifest**
> EntityModelOfManifest createManifest(xVolTenant, manifestRequestDto, xVolSite)

createManifest

Generate a shipping manifest.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ManifestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ManifestApi apiInstance = new ManifestApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    ManifestRequest manifestRequestDto = new ManifestRequest(); // ManifestRequest | manifestRequestDto
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfManifest result = apiInstance.createManifest(xVolTenant, manifestRequestDto, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestApi#createManifest");
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
| **xVolTenant** | **Integer**|  | |
| **manifestRequestDto** | [**ManifestRequest**](ManifestRequest.md)| manifestRequestDto | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfManifest**](EntityModelOfManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getEligibleShipments"></a>
# **getEligibleShipments**
> CollectionModelOfShipment getEligibleShipments(carrier, fulfillmentLocationCode, fromDays)

getEligibleShipments

Retrieve a list of shipments eligible for shipping manifests.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ManifestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ManifestApi apiInstance = new ManifestApi(defaultClient);
    String carrier = "carrier_example"; // String | carrier
    String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
    Integer fromDays = 56; // Integer | fromDays
    try {
      CollectionModelOfShipment result = apiInstance.getEligibleShipments(carrier, fulfillmentLocationCode, fromDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestApi#getEligibleShipments");
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
| **carrier** | **String**| carrier | |
| **fulfillmentLocationCode** | **String**| fulfillmentLocationCode | |
| **fromDays** | **Integer**| fromDays | [optional] |

### Return type

[**CollectionModelOfShipment**](CollectionModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getManifest"></a>
# **getManifest**
> EntityModelOfManifest getManifest(manifestId)

getManifest

Retrieve a shipping manifest by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ManifestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ManifestApi apiInstance = new ManifestApi(defaultClient);
    String manifestId = "manifestId_example"; // String | manifestId
    try {
      EntityModelOfManifest result = apiInstance.getManifest(manifestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestApi#getManifest");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="getManifests"></a>
# **getManifests**
> CollectionModelOfManifest getManifests(fulfillmentLocationCode, fromDays)

getManifests

Retrieve shipping manifests.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ManifestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ManifestApi apiInstance = new ManifestApi(defaultClient);
    String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
    Integer fromDays = 56; // Integer | fromDays
    try {
      CollectionModelOfManifest result = apiInstance.getManifests(fulfillmentLocationCode, fromDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManifestApi#getManifests");
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

