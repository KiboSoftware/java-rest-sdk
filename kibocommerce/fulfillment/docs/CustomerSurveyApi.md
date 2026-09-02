# CustomerSurveyApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSurvey**](CustomerSurveyApi.md#createSurvey) | **POST** /commerce/shipments/{shipmentNumber}/surveys | createSurvey |
| [**getSurvey**](CustomerSurveyApi.md#getSurvey) | **GET** /commerce/shipments/surveys/{id} | Get Customer Survey |
| [**getSurveys**](CustomerSurveyApi.md#getSurveys) | **GET** /commerce/shipments/{shipmentNumber}/surveys | getSurveys |


<a name="createSurvey"></a>
# **createSurvey**
> EntityModelOfCustomerSurvey createSurvey(shipmentNumber, customerSurveyDto)

createSurvey

Create a customer survey for a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    CustomerSurveyApi apiInstance = new CustomerSurveyApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    CustomerSurvey customerSurveyDto = new CustomerSurvey(); // CustomerSurvey | customerSurveyDto
    try {
      EntityModelOfCustomerSurvey result = apiInstance.createSurvey(shipmentNumber, customerSurveyDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSurveyApi#createSurvey");
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
| **customerSurveyDto** | [**CustomerSurvey**](CustomerSurvey.md)| customerSurveyDto | |

### Return type

[**EntityModelOfCustomerSurvey**](EntityModelOfCustomerSurvey.md)

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

<a name="getSurvey"></a>
# **getSurvey**
> EntityModelOfCustomerSurvey getSurvey(id)

Get Customer Survey

Get a specific customer survey by ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    CustomerSurveyApi apiInstance = new CustomerSurveyApi(defaultClient);
    String id = "id_example"; // String | id
    try {
      EntityModelOfCustomerSurvey result = apiInstance.getSurvey(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSurveyApi#getSurvey");
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
| **id** | **String**| id | |

### Return type

[**EntityModelOfCustomerSurvey**](EntityModelOfCustomerSurvey.md)

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

<a name="getSurveys"></a>
# **getSurveys**
> CollectionModelOfEntityModelOfCustomerSurvey getSurveys(shipmentNumber)

getSurveys

Get the customer surveys of a shipment.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    CustomerSurveyApi apiInstance = new CustomerSurveyApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      CollectionModelOfEntityModelOfCustomerSurvey result = apiInstance.getSurveys(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSurveyApi#getSurveys");
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

### Return type

[**CollectionModelOfEntityModelOfCustomerSurvey**](CollectionModelOfEntityModelOfCustomerSurvey.md)

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

