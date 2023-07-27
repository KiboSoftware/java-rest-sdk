# CustomerSurveyApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSurveyUsingPOST**](CustomerSurveyApi.md#createSurveyUsingPOST) | **POST** /commerce/shipments/{shipmentNumber}/surveys | Create Survey |
| [**getSurveyUsingGET**](CustomerSurveyApi.md#getSurveyUsingGET) | **GET** /commerce/shipments/surveys/{id} | Get Survey |
| [**getSurveysUsingGET**](CustomerSurveyApi.md#getSurveysUsingGET) | **GET** /commerce/shipments/{shipmentNumber}/surveys | Get Surveys |


<a name="createSurveyUsingPOST"></a>
# **createSurveyUsingPOST**
> EntityModelOfCustomerSurvey createSurveyUsingPOST(shipmentNumber, customerSurvey)

Create Survey

Create Survey

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyApi;

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

    CustomerSurveyApi apiInstance = new CustomerSurveyApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    CustomerSurvey customerSurvey = new CustomerSurvey(); // CustomerSurvey | 
    try {
      EntityModelOfCustomerSurvey result = apiInstance.createSurveyUsingPOST(shipmentNumber, customerSurvey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSurveyApi#createSurveyUsingPOST");
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
| **customerSurvey** | [**CustomerSurvey**](CustomerSurvey.md)|  | [optional] |

### Return type

[**EntityModelOfCustomerSurvey**](EntityModelOfCustomerSurvey.md)

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

<a name="getSurveyUsingGET"></a>
# **getSurveyUsingGET**
> EntityModelOfCustomerSurvey getSurveyUsingGET(id)

Get Survey

Get Survey

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyApi;

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

    CustomerSurveyApi apiInstance = new CustomerSurveyApi(defaultClient);
    String id = "id_example"; // String | id
    try {
      EntityModelOfCustomerSurvey result = apiInstance.getSurveyUsingGET(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSurveyApi#getSurveyUsingGET");
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

<a name="getSurveysUsingGET"></a>
# **getSurveysUsingGET**
> CollectionModelOfEntityModelOfCustomerSurvey getSurveysUsingGET(shipmentNumber)

Get Surveys

Get Surveys

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.auth.*;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.CustomerSurveyApi;

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

    CustomerSurveyApi apiInstance = new CustomerSurveyApi(defaultClient);
    Integer shipmentNumber = 56; // Integer | shipmentNumber
    try {
      CollectionModelOfEntityModelOfCustomerSurvey result = apiInstance.getSurveysUsingGET(shipmentNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomerSurveyApi#getSurveysUsingGET");
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

