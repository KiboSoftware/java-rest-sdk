# DropShipApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDropShipInvoice**](DropShipApi.md#getDropShipInvoice) | **GET** /commerce/dropship/invoice/{shipmentNumber} | Generates an EDI 810 Invoice for the specified shipment |
| [**getDropShipPurchaseOrder**](DropShipApi.md#getDropShipPurchaseOrder) | **GET** /commerce/dropship/purchaseorder/{shipmentNumber} | Retrieve EDI 850 Purchase Order |
| [**translateDropshipShipment**](DropShipApi.md#translateDropshipShipment) | **GET** /commerce/dropship/translate/{shipmentNumber} | Translate Shipment |


<a name="getDropShipInvoice"></a>
# **getDropShipInvoice**
> TransactionSet810 getDropShipInvoice(shipmentNumber, responseFields)

Generates an EDI 810 Invoice for the specified shipment

Generates an EDI 810 Invoice for the specified shipment

### Example
```java
// Import classes:
import com.kibocommerce.sdk.dropship.ApiClient;
import com.kibocommerce.sdk.dropship.ApiException;
import com.kibocommerce.sdk.dropship.Configuration;
import com.kibocommerce.sdk.dropship.auth.*;
import com.kibocommerce.sdk.dropship.models.*;
import com.kibocommerce.sdk.dropship.api.DropShipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DropShipApi apiInstance = new DropShipApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | The shipment number to generate EDI 810 for
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      TransactionSet810 result = apiInstance.getDropShipInvoice(shipmentNumber, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DropShipApi#getDropShipInvoice");
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
| **shipmentNumber** | **Integer**| The shipment number to generate EDI 810 for | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**TransactionSet810**](TransactionSet810.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDropShipPurchaseOrder"></a>
# **getDropShipPurchaseOrder**
> TransactionSet getDropShipPurchaseOrder(shipmentNumber, responseFields)

Retrieve EDI 850 Purchase Order

Generates an EDI 850 Purchase Order (returned as JSON) for the specified shipment, resolving the vendor, contracted pricing, and ship-to address from the shipment&#39;s fulfillment location. See the &lt;a href&#x3D;\&quot;/developer-guides/dropship\&quot;&gt;Dropship Developer Guide&lt;/a&gt; for the complete segment mapping, validation rules, and workflow.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.dropship.ApiClient;
import com.kibocommerce.sdk.dropship.ApiException;
import com.kibocommerce.sdk.dropship.Configuration;
import com.kibocommerce.sdk.dropship.auth.*;
import com.kibocommerce.sdk.dropship.models.*;
import com.kibocommerce.sdk.dropship.api.DropShipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DropShipApi apiInstance = new DropShipApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | The shipment number to generate EDI 850 for
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      TransactionSet result = apiInstance.getDropShipPurchaseOrder(shipmentNumber, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DropShipApi#getDropShipPurchaseOrder");
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
| **shipmentNumber** | **Integer**| The shipment number to generate EDI 850 for | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**TransactionSet**](TransactionSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="translateDropshipShipment"></a>
# **translateDropshipShipment**
> TranslatedShipment translateDropshipShipment(shipmentNumber, responseFields)

Translate Shipment

Translates a shipment into a lightweight response containing vendor SKU mappings and contracted pricing per item. See the &lt;a href&#x3D;\&quot;/developer-guides/dropship\&quot;&gt;Dropship Developer Guide&lt;/a&gt; for field details and behavior.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.dropship.ApiClient;
import com.kibocommerce.sdk.dropship.ApiException;
import com.kibocommerce.sdk.dropship.Configuration;
import com.kibocommerce.sdk.dropship.auth.*;
import com.kibocommerce.sdk.dropship.models.*;
import com.kibocommerce.sdk.dropship.api.DropShipApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DropShipApi apiInstance = new DropShipApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | The shipment number to translate
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      TranslatedShipment result = apiInstance.translateDropshipShipment(shipmentNumber, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DropShipApi#translateDropshipShipment");
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
| **shipmentNumber** | **Integer**| The shipment number to translate | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**TranslatedShipment**](TranslatedShipment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

