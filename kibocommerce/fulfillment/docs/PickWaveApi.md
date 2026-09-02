# PickWaveApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**closePickWave**](PickWaveApi.md#closePickWave) | **PUT** /commerce/pickwaves/{pickWaveNumber}/closed | closePickWave |
| [**createPickWave**](PickWaveApi.md#createPickWave) | **POST** /commerce/pickwaves | createPickWave |
| [**createRuleBasedPickWave**](PickWaveApi.md#createRuleBasedPickWave) | **POST** /commerce/pickwaves/rule-based | createRuleBasedPickWave |
| [**getOpenPickWaves**](PickWaveApi.md#getOpenPickWaves) | **GET** /commerce/pickwaves/open/{fulfillmentLocationCode} | getOpenPickWaves |
| [**getPickWave**](PickWaveApi.md#getPickWave) | **GET** /commerce/pickwaves/{pickWaveNumber} | getPickWave |
| [**getPickWaveDetails**](PickWaveApi.md#getPickWaveDetails) | **GET** /commerce/pickwaves/{pickWaveNumber}/pickWaveDetails | getPickWaveDetails |
| [**getShipmentsInPickWave**](PickWaveApi.md#getShipmentsInPickWave) | **GET** /commerce/pickwaves/{pickWaveNumber}/shipments | getShipmentsInPickWave |
| [**isPickWaveEnabled**](PickWaveApi.md#isPickWaveEnabled) | **GET** /commerce/pickwaves/enabled/{locationCode} | isPickWaveEnabled |
| [**renderOrderPickSheets**](PickWaveApi.md#renderOrderPickSheets) | **GET** /commerce/pickwaves/{pickWaveNumber}/order-pick-sheets/html | Render Order Pick Sheets |
| [**renderPickWave**](PickWaveApi.md#renderPickWave) | **GET** /commerce/pickwaves/{pickWaveNumber}/rendition/html | renderPickWave |


<a name="closePickWave"></a>
# **closePickWave**
> EntityModelOfPickWave closePickWave(pickWaveNumber, closePickWaveDto)

closePickWave

Close an existing pick wave.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    ClosePickWave closePickWaveDto = new ClosePickWave(); // ClosePickWave | closePickWaveDto
    try {
      EntityModelOfPickWave result = apiInstance.closePickWave(pickWaveNumber, closePickWaveDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#closePickWave");
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
| **closePickWaveDto** | [**ClosePickWave**](ClosePickWave.md)| closePickWaveDto | |

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

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

<a name="createPickWave"></a>
# **createPickWave**
> EntityModelOfPickWave createPickWave(xVolTenant, createPickWaveDto, xVolSite)

createPickWave

Create a new pick wave.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    CreatePickWave createPickWaveDto = new CreatePickWave(); // CreatePickWave | createPickWaveDto
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPickWave result = apiInstance.createPickWave(xVolTenant, createPickWaveDto, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#createPickWave");
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
| **createPickWaveDto** | [**CreatePickWave**](CreatePickWave.md)| createPickWaveDto | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

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

<a name="createRuleBasedPickWave"></a>
# **createRuleBasedPickWave**
> EntityModelOfPickWave createRuleBasedPickWave(xVolTenant, createRuleBasedPickWave, xVolSite)

createRuleBasedPickWave

createRuleBasedPickWave

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    CreateRuleBasedPickWave createRuleBasedPickWave = new CreateRuleBasedPickWave(); // CreateRuleBasedPickWave | createRuleBasedPickWaveDto
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfPickWave result = apiInstance.createRuleBasedPickWave(xVolTenant, createRuleBasedPickWave, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#createRuleBasedPickWave");
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
| **createRuleBasedPickWave** | [**CreateRuleBasedPickWave**](CreateRuleBasedPickWave.md)| createRuleBasedPickWaveDto | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfPickWave**](EntityModelOfPickWave.md)

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

<a name="getOpenPickWaves"></a>
# **getOpenPickWaves**
> CollectionModelOfPickWave getOpenPickWaves(fulfillmentLocationCode, shipmentType, userDisplayName, userId)

getOpenPickWaves

Get a list of open pick waves at a specific location.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | fulfillmentLocationCode
    String shipmentType = "shipmentType_example"; // String | shipmentType
    String userDisplayName = "userDisplayName_example"; // String | userDisplayName
    String userId = "userId_example"; // String | userId
    try {
      CollectionModelOfPickWave result = apiInstance.getOpenPickWaves(fulfillmentLocationCode, shipmentType, userDisplayName, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getOpenPickWaves");
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
| **userDisplayName** | **String**| userDisplayName | [optional] |
| **userId** | **String**| userId | [optional] |

### Return type

[**CollectionModelOfPickWave**](CollectionModelOfPickWave.md)

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

<a name="getPickWave"></a>
# **getPickWave**
> EntityModelOfPickWave getPickWave(pickWaveNumber, sortContents)

getPickWave

Retrieve pick wave details by its ID number.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    String sortContents = "sortContents_example"; // String | 
    try {
      EntityModelOfPickWave result = apiInstance.getPickWave(pickWaveNumber, sortContents);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getPickWave");
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

<a name="getPickWaveDetails"></a>
# **getPickWaveDetails**
> EntityModelOfPickWaveDetail getPickWaveDetails(pickWaveNumber, sortContentsByLocator)

getPickWaveDetails

Get pick wave details for a specific wave.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    String sortContentsByLocator = "sortContentsByLocator_example"; // String | sortContentsByLocator
    try {
      EntityModelOfPickWaveDetail result = apiInstance.getPickWaveDetails(pickWaveNumber, sortContentsByLocator);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getPickWaveDetails");
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

<a name="getShipmentsInPickWave"></a>
# **getShipmentsInPickWave**
> CollectionModelOfShipment getShipmentsInPickWave(pickWaveNumber)

getShipmentsInPickWave

Get a list of shipments included in a pick wave.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    try {
      CollectionModelOfShipment result = apiInstance.getShipmentsInPickWave(pickWaveNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#getShipmentsInPickWave");
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

<a name="isPickWaveEnabled"></a>
# **isPickWaveEnabled**
> Boolean isPickWaveEnabled(locationCode, xVolTenant, xVolSite)

isPickWaveEnabled

isPickWaveEnabled

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    String locationCode = "locationCode_example"; // String | locationCode
    Integer xVolTenant = 56; // Integer | 
    Integer xVolSite = 56; // Integer | 
    try {
      Boolean result = apiInstance.isPickWaveEnabled(locationCode, xVolTenant, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#isPickWaveEnabled");
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
| **locationCode** | **String**| locationCode | |
| **xVolTenant** | **Integer**|  | |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

**Boolean**

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

<a name="renderOrderPickSheets"></a>
# **renderOrderPickSheets**
> EntityModelOfRenderedContent renderOrderPickSheets(pickWaveNumber)

Render Order Pick Sheets

Render order pick sheets in HTML.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    try {
      EntityModelOfRenderedContent result = apiInstance.renderOrderPickSheets(pickWaveNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#renderOrderPickSheets");
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

[**EntityModelOfRenderedContent**](EntityModelOfRenderedContent.md)

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

<a name="renderPickWave"></a>
# **renderPickWave**
> EntityModelOfRenderedContent renderPickWave(pickWaveNumber, printPackingLists, printPickWave, printSingleOrderSheets)

renderPickWave

Render pick wave information in HTML.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.PickWaveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    PickWaveApi apiInstance = new PickWaveApi(defaultClient);
    Integer pickWaveNumber = 56; // Integer | pickWaveNumber
    Boolean printPackingLists = true; // Boolean | printPackingLists
    Boolean printPickWave = true; // Boolean | printPickWave
    Boolean printSingleOrderSheets = true; // Boolean | printSingleOrderSheets
    try {
      EntityModelOfRenderedContent result = apiInstance.renderPickWave(pickWaveNumber, printPackingLists, printPickWave, printSingleOrderSheets);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickWaveApi#renderPickWave");
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
| **printPackingLists** | **Boolean**| printPackingLists | [optional] |
| **printPickWave** | **Boolean**| printPickWave | [optional] |
| **printSingleOrderSheets** | **Boolean**| printSingleOrderSheets | [optional] |

### Return type

[**EntityModelOfRenderedContent**](EntityModelOfRenderedContent.md)

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

