# ShipmentPackagesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteShipmentPackage**](ShipmentPackagesApi.md#deleteShipmentPackage) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/{packageId} | deleteShipmentPackage |
| [**deleteShipmentPackages**](ShipmentPackagesApi.md#deleteShipmentPackages) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/bulk | deleteShipmentPackages |
| [**newPackage**](ShipmentPackagesApi.md#newPackage) | **POST** /commerce/shipments/{shipmentNumber}/packages | New Package |
| [**newPackages**](ShipmentPackagesApi.md#newPackages) | **POST** /commerce/shipments/{shipmentNumber}/packages/bulk | Create New Packages |
| [**receivePackageById**](ShipmentPackagesApi.md#receivePackageById) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId}/received | receivePackageById |
| [**receivePackageByTrackingNumber**](ShipmentPackagesApi.md#receivePackageByTrackingNumber) | **PUT** /commerce/shipments/packages/received/{search} | receivePackageByTrackingNumber |
| [**removeShippingInformation**](ShipmentPackagesApi.md#removeShippingInformation) | **DELETE** /commerce/shipments/{shipmentNumber}/packages/bulk/shipping | removeShippingInformation |
| [**saveMultiPieceShipmentPackages**](ShipmentPackagesApi.md#saveMultiPieceShipmentPackages) | **PUT** /commerce/shipments/{shipmentNumber}/packages/mps | saveMultiPieceShipmentPackages |
| [**updatePackage**](ShipmentPackagesApi.md#updatePackage) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId} | Update Package |
| [**validatePackageItemsAndReceive**](ShipmentPackagesApi.md#validatePackageItemsAndReceive) | **PUT** /commerce/shipments/{shipmentNumber}/packages/{packageId}/validateReceipt | validatePackageItemsAndReceive |


<a name="deleteShipmentPackage"></a>
# **deleteShipmentPackage**
> deleteShipmentPackage(packageId, shipmentNumber, ifMatch)

deleteShipmentPackage

Delete an existing shipment package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | packageId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      apiInstance.deleteShipmentPackage(packageId, shipmentNumber, ifMatch);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#deleteShipmentPackage");
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
| **packageId** | **String**| packageId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="deleteShipmentPackages"></a>
# **deleteShipmentPackages**
> EntityModelOfShipment deleteShipmentPackages(shipmentNumber, ifMatch)

deleteShipmentPackages

Delete shipment packages in bulk.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.deleteShipmentPackages(shipmentNumber, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#deleteShipmentPackages");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="newPackage"></a>
# **newPackage**
> EntityModelOfShipment newPackage(shipmentNumber, packageDto, ifMatch)

New Package

Create a new shipment package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FulfillmentAPIPackage packageDto = new FulfillmentAPIPackage(); // FulfillmentAPIPackage | packageDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.newPackage(shipmentNumber, packageDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#newPackage");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **packageDto** | [**FulfillmentAPIPackage**](FulfillmentAPIPackage.md)| packageDto | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

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

<a name="newPackages"></a>
# **newPackages**
> EntityModelOfShipment newPackages(shipmentNumber, packageDtoList, ifMatch)

Create New Packages

Create new shipment packages in bulk.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    List<FulfillmentAPIPackage> packageDtoList = Arrays.asList(); // List<FulfillmentAPIPackage> | packageDtoList
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.newPackages(shipmentNumber, packageDtoList, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#newPackages");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **packageDtoList** | [**List&lt;FulfillmentAPIPackage&gt;**](FulfillmentAPIPackage.md)| packageDtoList | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

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

<a name="receivePackageById"></a>
# **receivePackageById**
> EntityModelOfShipment receivePackageById(packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite)

receivePackageById

receivePackageById

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | packageId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.receivePackageById(packageId, shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#receivePackageById");
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
| **packageId** | **String**| packageId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Package Received |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | packageId does not exist on this shipment |  -  |
| **409** | Package has already been received, or the transfer shipment has not yet shipped from its source location |  -  |

<a name="receivePackageByTrackingNumber"></a>
# **receivePackageByTrackingNumber**
> EntityModelOfShipment receivePackageByTrackingNumber(search, xVolTenant, ifMatch, xVolSite)

receivePackageByTrackingNumber

receivePackageByTrackingNumber

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    String search = "search_example"; // String | search
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.receivePackageByTrackingNumber(search, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#receivePackageByTrackingNumber");
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
| **search** | **String**| search | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Package Received |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Tracking number does not match any package on any receivable shipment |  -  |
| **409** | Package has already been received, or the transfer shipment has not yet shipped from its source location |  -  |

<a name="removeShippingInformation"></a>
# **removeShippingInformation**
> EntityModelOfShipment removeShippingInformation(shipmentNumber, xVolTenant, ifMatch, xVolSite)

removeShippingInformation

removeShippingInformation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.removeShippingInformation(shipmentNumber, xVolTenant, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#removeShippingInformation");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="saveMultiPieceShipmentPackages"></a>
# **saveMultiPieceShipmentPackages**
> EntityModelOfShipment saveMultiPieceShipmentPackages(shipmentNumber, xVolTenant, saveMpsPackagesRequest, ifMatch, xVolSite)

saveMultiPieceShipmentPackages

saveMultiPieceShipmentPackages

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    SaveMpsPackagesRequest saveMpsPackagesRequest = new SaveMpsPackagesRequest(); // SaveMpsPackagesRequest | saveMpsPackagesRequestDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.saveMultiPieceShipmentPackages(shipmentNumber, xVolTenant, saveMpsPackagesRequest, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#saveMultiPieceShipmentPackages");
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
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **saveMpsPackagesRequest** | [**SaveMpsPackagesRequest**](SaveMpsPackagesRequest.md)| saveMpsPackagesRequestDto | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

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

<a name="updatePackage"></a>
# **updatePackage**
> EntityModelOfShipment updatePackage(packageId, shipmentNumber, packageDto, ifMatch)

Update Package

Update an existing shipment package.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | packageId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    FulfillmentAPIPackage packageDto = new FulfillmentAPIPackage(); // FulfillmentAPIPackage | packageDto
    String ifMatch = "ifMatch_example"; // String | If-Match
    try {
      EntityModelOfShipment result = apiInstance.updatePackage(packageId, shipmentNumber, packageDto, ifMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#updatePackage");
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
| **packageId** | **String**| packageId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **packageDto** | [**FulfillmentAPIPackage**](FulfillmentAPIPackage.md)| packageDto | |
| **ifMatch** | **String**| If-Match | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

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

<a name="validatePackageItemsAndReceive"></a>
# **validatePackageItemsAndReceive**
> EntityModelOfShipment validatePackageItemsAndReceive(packageId, shipmentNumber, xVolTenant, validatePackageReceipt, ifMatch, xVolSite)

validatePackageItemsAndReceive

validatePackageItemsAndReceive

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentPackagesApi apiInstance = new ShipmentPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | packageId
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    Integer xVolTenant = 56; // Integer | 
    ValidatePackageReceipt validatePackageReceipt = new ValidatePackageReceipt(); // ValidatePackageReceipt | request
    String ifMatch = "ifMatch_example"; // String | If-Match
    Integer xVolSite = 56; // Integer | 
    try {
      EntityModelOfShipment result = apiInstance.validatePackageItemsAndReceive(packageId, shipmentNumber, xVolTenant, validatePackageReceipt, ifMatch, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentPackagesApi#validatePackageItemsAndReceive");
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
| **packageId** | **String**| packageId | |
| **shipmentNumber** | **Integer**| shipmentNumber | |
| **xVolTenant** | **Integer**|  | |
| **validatePackageReceipt** | [**ValidatePackageReceipt**](ValidatePackageReceipt.md)| request | |
| **ifMatch** | **String**| If-Match | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**EntityModelOfShipment**](EntityModelOfShipment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Package Validated And Received |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | packageId does not exist on this shipment, or a lineId does not belong to the package |  -  |
| **409** | Package has already been received, or the transfer shipment has not yet shipped from its source location |  -  |

