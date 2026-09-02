# RateShoppingApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecommendedRates**](RateShoppingApi.md#getRecommendedRates) | **POST** /commerce/rate-shopping/recommend | Get recommended shipping rates |


<a name="getRecommendedRates"></a>
# **getRecommendedRates**
> EntityModelOfRateShoppingResponseDto getRecommendedRates(shipmentNumber, xVolTenant, packageId, shipDate, xVolSite, rateShoppingRequestDto)

Get recommended shipping rates

Retrieves recommended shipping rates from configured carriers for the provided shipment details

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.RateShoppingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    RateShoppingApi apiInstance = new RateShoppingApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | Shipment number
    Integer xVolTenant = 56; // Integer | 
    String packageId = "packageId_example"; // String | Package ID
    OffsetDateTime shipDate = OffsetDateTime.now(); // OffsetDateTime | Ship Date
    Integer xVolSite = 56; // Integer | 
    RateShoppingRequestDto rateShoppingRequestDto = new RateShoppingRequestDto(); // RateShoppingRequestDto | Rate shopping request
    try {
      EntityModelOfRateShoppingResponseDto result = apiInstance.getRecommendedRates(shipmentNumber, xVolTenant, packageId, shipDate, xVolSite, rateShoppingRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RateShoppingApi#getRecommendedRates");
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
| **shipmentNumber** | **Integer**| Shipment number | |
| **xVolTenant** | **Integer**|  | |
| **packageId** | **String**| Package ID | [optional] |
| **shipDate** | **OffsetDateTime**| Ship Date | [optional] |
| **xVolSite** | **Integer**|  | [optional] |
| **rateShoppingRequestDto** | [**RateShoppingRequestDto**](RateShoppingRequestDto.md)| Rate shopping request | [optional] |

### Return type

[**EntityModelOfRateShoppingResponseDto**](EntityModelOfRateShoppingResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rates retrieved successfully |  -  |
| **201** | Created |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation error |  -  |
| **500** | Internal server error |  -  |

