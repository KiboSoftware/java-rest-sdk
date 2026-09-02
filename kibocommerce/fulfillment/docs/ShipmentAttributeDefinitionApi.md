# ShipmentAttributeDefinitionApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAttributeVocabularyValues**](ShipmentAttributeDefinitionApi.md#getAttributeVocabularyValues) | **GET** /commerce/shipments/attributedefinition/attributes/{attributeFQN}/vocabularyValues | Get attribute vocabulary values |
| [**getShipmentAttribute**](ShipmentAttributeDefinitionApi.md#getShipmentAttribute) | **GET** /commerce/shipments/attributedefinition/attributes/{attributeFQN} | Get single shipment attribute definition |
| [**getShipmentAttributes**](ShipmentAttributeDefinitionApi.md#getShipmentAttributes) | **GET** /commerce/shipments/attributedefinition/attributes | Get shipment attribute definitions |
| [**getShipmentLineAttributes**](ShipmentAttributeDefinitionApi.md#getShipmentLineAttributes) | **GET** /commerce/shipments/attributedefinition/items/attributes | Get shipment line item attribute definitions |


<a name="getAttributeVocabularyValues"></a>
# **getAttributeVocabularyValues**
> CollectionModelOfAttributeVocabularyValue getAttributeVocabularyValues(attributeFQN, xVolTenant, responseFields, responseGroups, xVolSite)

Get attribute vocabulary values

Retrieves vocabulary values for a specific attribute (if it has predefined values). Requires Order Read or Order Ship permissions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributeDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributeDefinitionApi apiInstance = new ShipmentAttributeDefinitionApi(defaultClient);
    String attributeFQN = "shipment.customField1"; // String | Fully qualified name of the attribute
    Integer xVolTenant = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | Specific fields to include in response
    String responseGroups = "responseGroups_example"; // String | Response groups for selective field inclusion
    Integer xVolSite = 56; // Integer | 
    try {
      CollectionModelOfAttributeVocabularyValue result = apiInstance.getAttributeVocabularyValues(attributeFQN, xVolTenant, responseFields, responseGroups, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributeDefinitionApi#getAttributeVocabularyValues");
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
| **attributeFQN** | **String**| Fully qualified name of the attribute | |
| **xVolTenant** | **Integer**|  | |
| **responseFields** | **String**| Specific fields to include in response | [optional] |
| **responseGroups** | **String**| Response groups for selective field inclusion | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**CollectionModelOfAttributeVocabularyValue**](CollectionModelOfAttributeVocabularyValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved vocabulary values |  -  |
| **400** | Invalid attribute FQN |  -  |
| **401** | Unauthorized - authentication required |  -  |
| **403** | Forbidden - insufficient permissions (requires Order Read or Order Ship) |  -  |
| **404** | Attribute not found or has no vocabulary values |  -  |
| **500** | Internal server error |  -  |

<a name="getShipmentAttribute"></a>
# **getShipmentAttribute**
> FulfillmentAPIAttribute getShipmentAttribute(attributeFQN, xVolTenant, responseFields, responseGroups, xVolSite)

Get single shipment attribute definition

Retrieves a specific shipment attribute definition by its fully qualified name. Requires Order Read or Order Ship permissions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributeDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributeDefinitionApi apiInstance = new ShipmentAttributeDefinitionApi(defaultClient);
    String attributeFQN = "shipment.customField1"; // String | Fully qualified name of the attribute
    Integer xVolTenant = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | Specific fields to include in response
    String responseGroups = "responseGroups_example"; // String | Response groups for selective field inclusion
    Integer xVolSite = 56; // Integer | 
    try {
      FulfillmentAPIAttribute result = apiInstance.getShipmentAttribute(attributeFQN, xVolTenant, responseFields, responseGroups, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributeDefinitionApi#getShipmentAttribute");
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
| **attributeFQN** | **String**| Fully qualified name of the attribute | |
| **xVolTenant** | **Integer**|  | |
| **responseFields** | **String**| Specific fields to include in response | [optional] |
| **responseGroups** | **String**| Response groups for selective field inclusion | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**FulfillmentAPIAttribute**](FulfillmentAPIAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved attribute |  -  |
| **400** | Invalid attribute FQN |  -  |
| **401** | Unauthorized - authentication required |  -  |
| **403** | Forbidden - insufficient permissions (requires Order Read or Order Ship) |  -  |
| **404** | Attribute not found |  -  |
| **500** | Internal server error |  -  |

<a name="getShipmentAttributes"></a>
# **getShipmentAttributes**
> FulfillmentAPIAttributeCollection getShipmentAttributes(xVolTenant, filter, pageSize, responseFields, responseGroups, sortBy, startIndex, xVolSite)

Get shipment attribute definitions

Retrieves shipment attribute definitions with optional filtering and pagination. Requires Order Read or Order Ship permissions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributeDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributeDefinitionApi apiInstance = new ShipmentAttributeDefinitionApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | Filter criteria for attributes
    Integer pageSize = 0; // Integer | Number of items per page (0 = all)
    String responseFields = "responseFields_example"; // String | Specific fields to include in response
    String responseGroups = "responseGroups_example"; // String | Response groups for selective field inclusion
    String sortBy = "adminName asc"; // String | Sort field and direction
    Integer startIndex = 0; // Integer | Starting index for pagination
    Integer xVolSite = 56; // Integer | 
    try {
      FulfillmentAPIAttributeCollection result = apiInstance.getShipmentAttributes(xVolTenant, filter, pageSize, responseFields, responseGroups, sortBy, startIndex, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributeDefinitionApi#getShipmentAttributes");
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
| **filter** | **String**| Filter criteria for attributes | [optional] |
| **pageSize** | **Integer**| Number of items per page (0 &#x3D; all) | [optional] [default to 0] |
| **responseFields** | **String**| Specific fields to include in response | [optional] |
| **responseGroups** | **String**| Response groups for selective field inclusion | [optional] |
| **sortBy** | **String**| Sort field and direction | [optional] |
| **startIndex** | **Integer**| Starting index for pagination | [optional] [default to 0] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**FulfillmentAPIAttributeCollection**](FulfillmentAPIAttributeCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved attributes |  -  |
| **400** | Invalid request parameters |  -  |
| **401** | Unauthorized - authentication required |  -  |
| **403** | Forbidden - insufficient permissions (requires Order Read or Order Ship) |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a name="getShipmentLineAttributes"></a>
# **getShipmentLineAttributes**
> FulfillmentAPIAttributeCollection getShipmentLineAttributes(xVolTenant, filter, pageSize, responseFields, responseGroups, sortBy, startIndex, xVolSite)

Get shipment line item attribute definitions

Retrieves shipment line item attribute definitions with optional filtering and pagination. Requires Order Read or Order Ship permissions.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentAttributeDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentAttributeDefinitionApi apiInstance = new ShipmentAttributeDefinitionApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    String filter = "filter_example"; // String | Filter criteria for attributes
    Integer pageSize = 0; // Integer | Number of items per page (0 = all)
    String responseFields = "responseFields_example"; // String | Specific fields to include in response
    String responseGroups = "responseGroups_example"; // String | Response groups for selective field inclusion
    String sortBy = "adminName asc"; // String | Sort field and direction
    Integer startIndex = 0; // Integer | Starting index for pagination
    Integer xVolSite = 56; // Integer | 
    try {
      FulfillmentAPIAttributeCollection result = apiInstance.getShipmentLineAttributes(xVolTenant, filter, pageSize, responseFields, responseGroups, sortBy, startIndex, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentAttributeDefinitionApi#getShipmentLineAttributes");
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
| **filter** | **String**| Filter criteria for attributes | [optional] |
| **pageSize** | **Integer**| Number of items per page (0 &#x3D; all) | [optional] [default to 0] |
| **responseFields** | **String**| Specific fields to include in response | [optional] |
| **responseGroups** | **String**| Response groups for selective field inclusion | [optional] |
| **sortBy** | **String**| Sort field and direction | [optional] |
| **startIndex** | **Integer**| Starting index for pagination | [optional] [default to 0] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**FulfillmentAPIAttributeCollection**](FulfillmentAPIAttributeCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved line item attributes |  -  |
| **400** | Invalid request parameters |  -  |
| **401** | Unauthorized - authentication required |  -  |
| **403** | Forbidden - insufficient permissions (requires Order Read or Order Ship) |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

