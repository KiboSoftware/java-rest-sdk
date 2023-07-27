# InventoryApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregate**](InventoryApi.md#aggregate) | **POST** /commerce/inventory/v5/inventory/aggregate | Aggregate |
| [**postQueryInventory**](InventoryApi.md#postQueryInventory) | **POST** /commerce/inventory/v5/inventory | Post Query Inventory |


<a name="aggregate"></a>
# **aggregate**
> List&lt;AggregateResponse&gt; aggregate(xVolTenant, aggregateRequest, xVolSite)

Aggregate

Aggregates Inventory

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryApi;

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

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    AggregateRequest aggregateRequest = new AggregateRequest(); // AggregateRequest | Request to aggregate inventory
    Integer xVolSite = 56; // Integer | Site ID
    try {
      List<AggregateResponse> result = apiInstance.aggregate(xVolTenant, aggregateRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#aggregate");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **aggregateRequest** | [**AggregateRequest**](AggregateRequest.md)| Request to aggregate inventory | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**List&lt;AggregateResponse&gt;**](AggregateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="postQueryInventory"></a>
# **postQueryInventory**
> List&lt;InventoryInventoryResponse&gt; postQueryInventory(xVolTenant, inventoryRequest, xVolSite)

Post Query Inventory

Queries for specified inventory at given location

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.auth.*;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryApi;

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

    InventoryApi apiInstance = new InventoryApi(defaultClient);
    Integer xVolTenant = 56; // Integer | Tenant ID
    InventoryRequest inventoryRequest = new InventoryRequest(); // InventoryRequest | Request to get inventory
    Integer xVolSite = 56; // Integer | Site ID
    try {
      List<InventoryInventoryResponse> result = apiInstance.postQueryInventory(xVolTenant, inventoryRequest, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryApi#postQueryInventory");
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
| **xVolTenant** | **Integer**| Tenant ID | |
| **inventoryRequest** | [**InventoryRequest**](InventoryRequest.md)| Request to get inventory | |
| **xVolSite** | **Integer**| Site ID | [optional] |

### Return type

[**List&lt;InventoryInventoryResponse&gt;**](InventoryInventoryResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

