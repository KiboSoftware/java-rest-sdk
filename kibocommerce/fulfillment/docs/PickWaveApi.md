# PickWaveApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closePickWaveUsingPUT**](PickWaveApi.md#closePickWaveUsingPUT) | **PUT** /commerce/pickwaves/{pickWaveNumber}/closed | Close Pick Wave |
| [**createPickWaveUsingPOST**](PickWaveApi.md#createPickWaveUsingPOST) | **POST** /commerce/pickwaves | Create Pick Wave |
| [**getOpenPickWavesUsingGET**](PickWaveApi.md#getOpenPickWavesUsingGET) | **GET** /commerce/pickwaves/open/{fulfillmentLocationCode} | Get Open Pick Waves |
| [**getPickWaveDetailsUsingGET**](PickWaveApi.md#getPickWaveDetailsUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/pickWaveDetails | Get Pick Wave Details |
| [**getPickWaveUsingGET**](PickWaveApi.md#getPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber} | Get Pick Wave |
| [**getShipmentsInPickWaveUsingGET**](PickWaveApi.md#getShipmentsInPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/shipments | Get Shipments in Pick Wave |
| [**renderOrderPickSheetsUsingGET**](PickWaveApi.md#renderOrderPickSheetsUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/order-pick-sheets/html | Render Pick Wave Order Sheets |
| [**renderPickWaveUsingGET**](PickWaveApi.md#renderPickWaveUsingGET) | **GET** /commerce/pickwaves/{pickWaveNumber}/rendition/html | Render Pick Wave |


<a name="closePickWaveUsingPUT"></a>
# **closePickWaveUsingPUT**
> EntityModelOfPickWave closePickWaveUsingPUT(pickWaveNumber, closePickWave)

Close Pick Wave

Close Pick Wave

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    ClosePickWave closePickWave = new ClosePickWave(); // ClosePickWave | 
    try {
      EntityModelOfPickWave result = apiInstance.closePickWaveUsingPUT(pickWaveNumber, closePickWave);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#closePickWaveUsingPUT");
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
| **pickWaveNumber** | **Integer**| pickWaveNumber | |
| **closePickWave** | [**ClosePickWave**](ClosePickWave.md)|  | [optional] |

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

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

<a name="createPickWaveUsingPOST"></a>
# **createPickWaveUsingPOST**
> EntityModelOfPickWave createPickWaveUsingPOST(createPickWave)

Create Pick Wave

Create Pick Wave

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    CreatePickWave createPickWave = new CreatePickWave(); // CreatePickWave | 
    try {
      EntityModelOfPickWave result = apiInstance.createPickWaveUsingPOST(createPickWave);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#createPickWaveUsingPOST");
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
| **createPickWave** | [**CreatePickWave**](CreatePickWave.md)|  | [optional] |

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

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

<a name="getOpenPickWavesUsingGET"></a>
# **getOpenPickWavesUsingGET**
> CollectionModelOfPickWave getOpenPickWavesUsingGET(fulfillmentLocationCode, shipmentType, userId, userDisplayName)

Get Open Pick Waves

Get Open Pick Waves

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
    String shipmentType = "shipmentType_example"; // String | shipmentType
    String userId = "userId_example"; // String | userId
    String userDisplayName = "userDisplayName_example"; // String | userDisplayName
    try {
      CollectionModelOfPickWave result = apiInstance.getOpenPickWavesUsingGET(fulfillmentLocationCode, shipmentType, userId, userDisplayName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getOpenPickWavesUsingGET");
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
| **shipmentType** | **String**| shipmentType | [optional] |
| **userId** | **String**| userId | [optional] |
| **userDisplayName** | **String**| userDisplayName | [optional] |

### Return type

[**CollectionModelOfPickWave**](CollectionModelOfPickWave.md)

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

<a name="getPickWaveDetailsUsingGET"></a>
# **getPickWaveDetailsUsingGET**
> EntityModelOfPickWaveDetail getPickWaveDetailsUsingGET(pickWaveNumber, sortContentsByLocator)

Get Pick Wave Details

Get Pick Wave Details

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    String sortContentsByLocator = "sortContentsByLocator_example"; // String | sortContentsByLocator
    try {
      EntityModelOfPickWaveDetail result = apiInstance.getPickWaveDetailsUsingGET(pickWaveNumber, sortContentsByLocator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getPickWaveDetailsUsingGET");
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
| **pickWaveNumber** | **Integer**| pickWaveNumber | |
| **sortContentsByLocator** | **String**| sortContentsByLocator | [optional] |

### Return type

[**EntityModelOfPickWaveDetail**](EntityModelOfPickWaveDetail.md)

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

<a name="getPickWaveUsingGET"></a>
# **getPickWaveUsingGET**
> EntityModelOfPickWave getPickWaveUsingGET(pickWaveNumber, sortContents)

Get Pick Wave

Get Pick Wave

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    String sortContents = "sortContents_example"; // String | 
    try {
      EntityModelOfPickWave result = apiInstance.getPickWaveUsingGET(pickWaveNumber, sortContents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getPickWaveUsingGET");
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
| **pickWaveNumber** | **Integer**| pickWaveNumber | |
| **sortContents** | **String**|  | [optional] |

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

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

<a name="getShipmentsInPickWaveUsingGET"></a>
# **getShipmentsInPickWaveUsingGET**
> CollectionModelOfShipment getShipmentsInPickWaveUsingGET(pickWaveNumber)

Get Shipments in Pick Wave

Get Shipments in Pick Wave

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    try {
      CollectionModelOfShipment result = apiInstance.getShipmentsInPickWaveUsingGET(pickWaveNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getShipmentsInPickWaveUsingGET");
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
| **pickWaveNumber** | **Integer**| pickWaveNumber | |

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

<a name="renderOrderPickSheetsUsingGET"></a>
# **renderOrderPickSheetsUsingGET**
> EntityModelOfstring renderOrderPickSheetsUsingGET(pickWaveNumber)

Render Pick Wave Order Sheets

Render pick wave order pick sheets in HTML format for printing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    try {
      EntityModelOfstring result = apiInstance.renderOrderPickSheetsUsingGET(pickWaveNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#renderOrderPickSheetsUsingGET");
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
| **pickWaveNumber** | **Integer**| pickWaveNumber | |

### Return type

[**EntityModelOfstring**](EntityModelOfstring.md)

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

<a name="renderPickWaveUsingGET"></a>
# **renderPickWaveUsingGET**
> EntityModelOfstring renderPickWaveUsingGET(pickWaveNumber, printPickWave, printPackingLists, printSingleOrderSheets)

Render Pick Wave

Render pick wave in HTML format for printing

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

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

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    Boolean printPickWave = true; // Boolean | printPickWave
    Boolean printPackingLists = true; // Boolean | printPackingLists
    Boolean printSingleOrderSheets = true; // Boolean | printSingleOrderSheets
    try {
      EntityModelOfstring result = apiInstance.renderPickWaveUsingGET(pickWaveNumber, printPickWave, printPackingLists, printSingleOrderSheets);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#renderPickWaveUsingGET");
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
| **pickWaveNumber** | **Integer**| pickWaveNumber | |
| **printPickWave** | **Boolean**| printPickWave | [optional] |
| **printPackingLists** | **Boolean**| printPackingLists | [optional] |
| **printSingleOrderSheets** | **Boolean**| printSingleOrderSheets | [optional] |

### Return type

[**EntityModelOfstring**](EntityModelOfstring.md)

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

