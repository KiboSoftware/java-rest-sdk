# ReservationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateReservation**](ReservationApi.md#activateReservation) | **PUT** /commerce/reservation/{reservationId}/activate | Activate Reservation |
| [**addItem**](ReservationApi.md#addItem) | **POST** /commerce/reservation/{reservationId}/items | Add Item |
| [**closeReservation**](ReservationApi.md#closeReservation) | **PUT** /commerce/reservation/{reservationId}/close | Close Reservation |
| [**convertToOrderReservation**](ReservationApi.md#convertToOrderReservation) | **POST** /commerce/reservation/{reservationId}/converttoorderreservation | Convert To Order Reservation |
| [**createReservation**](ReservationApi.md#createReservation) | **POST** /commerce/reservation | Create Reservation |
| [**deleteReservation**](ReservationApi.md#deleteReservation) | **DELETE** /commerce/reservation/{reservationId} | Delete Reservation |
| [**getAllocationStatus**](ReservationApi.md#getAllocationStatus) | **GET** /commerce/reservation/{reservationId}/getallocationstatus | Get Allocation Status |
| [**getReservationById**](ReservationApi.md#getReservationById) | **GET** /commerce/reservation/{reservationId} | Get Reservation By Id |
| [**getReservationSummary**](ReservationApi.md#getReservationSummary) | **GET** /commerce/reservation/summary | Get Reservation Summary |
| [**getReservations**](ReservationApi.md#getReservations) | **GET** /commerce/reservation | Get Reservations |
| [**getReservationsByCartId**](ReservationApi.md#getReservationsByCartId) | **GET** /commerce/reservation/cart/{cartId} | Get Reservations By Cart Id |
| [**removeItem**](ReservationApi.md#removeItem) | **DELETE** /commerce/reservation/{reservationId}/items/{reservationItemId} | Remove Item |
| [**updateItemQuantity**](ReservationApi.md#updateItemQuantity) | **PUT** /commerce/reservation/{reservationId}/items/{reservationItemId}/quantity/{quantity} | Update Item Quantity |
| [**updateReservation**](ReservationApi.md#updateReservation) | **PUT** /commerce/reservation/{reservationId} | Update Reservation |
| [**updateReservationItem**](ReservationApi.md#updateReservationItem) | **PUT** /commerce/reservation/{reservationId}/items/{reservationItemId} | Update Reservation Item |
| [**updateTimer**](ReservationApi.md#updateTimer) | **PUT** /commerce/reservation/{reservationId}/updatetimer | Update Timer |
| [**updateZipCode**](ReservationApi.md#updateZipCode) | **POST** /commerce/reservation/{reservationId}/zipcode/{zipCode} | Update Zip Code |


<a name="activateReservation"></a>
# **activateReservation**
> Reservati activateReservation(reservationId, responseFields)

Activate Reservation

Activate a reservation. Kibo does not recommend using this API, as it is intended for internal use.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Reservati result = apiInstance.activateReservation(reservationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#activateReservation");
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
| **reservationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="addItem"></a>
# **addItem**
> Reservati addItem(reservationId, zipCode, runSynchronous, responseFields, reservationItem)

Add Item

Add an item to a reservation. Set runSynchronous to \&quot;true\&quot; to perform this call synchronously with better performance time.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String zipCode = "zipCode_example"; // String | 
    Boolean runSynchronous = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReservationItem reservationItem = new ReservationItem(); // ReservationItem | 
    try {
      Reservati result = apiInstance.addItem(reservationId, zipCode, runSynchronous, responseFields, reservationItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#addItem");
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
| **reservationId** | **String**|  | |
| **zipCode** | **String**|  | [optional] |
| **runSynchronous** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **reservationItem** | [**ReservationItem**](ReservationItem.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="closeReservation"></a>
# **closeReservation**
> Reservati closeReservation(reservationId, responseFields)

Close Reservation

Close a reservation. Kibo does not recommend using this API, as it is intended for internal use.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Reservati result = apiInstance.closeReservation(reservationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#closeReservation");
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
| **reservationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="convertToOrderReservation"></a>
# **convertToOrderReservation**
> Reservati convertToOrderReservation(reservationId, responseFields, orderReservati)

Convert To Order Reservation

Converts a reservation associated with a cart to an order reservation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    OrderReservati orderReservati = new OrderReservati(); // OrderReservati | 
    try {
      Reservati result = apiInstance.convertToOrderReservation(reservationId, responseFields, orderReservati);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#convertToOrderReservation");
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
| **reservationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **orderReservati** | [**OrderReservati**](OrderReservati.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createReservation"></a>
# **createReservation**
> Reservati createReservation(runSynchronous, responseFields, reservati)

Create Reservation

Creates a new reservation. Set runSynchronous to \&quot;true\&quot; to perform this call synchronously with better performance time.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    Boolean runSynchronous = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Reservati reservati = new Reservati(); // Reservati | 
    try {
      Reservati result = apiInstance.createReservation(runSynchronous, responseFields, reservati);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#createReservation");
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
| **runSynchronous** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **reservati** | [**Reservati**](Reservati.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteReservation"></a>
# **deleteReservation**
> deleteReservation(reservationId, runSynchronous)

Delete Reservation

Delete a reservation. Set runSynchronous to \&quot;true\&quot; to perform this call synchronously with better performance time.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    Boolean runSynchronous = false; // Boolean | 
    try {
      apiInstance.deleteReservation(reservationId, runSynchronous);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#deleteReservation");
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
| **reservationId** | **String**|  | |
| **runSynchronous** | **Boolean**|  | [optional] [default to false] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAllocationStatus"></a>
# **getAllocationStatus**
> Map&lt;String, String&gt; getAllocationStatus(reservationId, responseFields)

Get Allocation Status

Get Allocation Status

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Map<String, String> result = apiInstance.getAllocationStatus(reservationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#getAllocationStatus");
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
| **reservationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReservationById"></a>
# **getReservationById**
> Reservati getReservationById(reservationId, responseFields)

Get Reservation By Id

Get a specific reservation by its ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Reservati result = apiInstance.getReservationById(reservationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#getReservationById");
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
| **reservationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReservationSummary"></a>
# **getReservationSummary**
> ReservationAggregateSummary getReservationSummary(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields)

Get Reservation Summary

Get Reservation Summary

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationAggregateSummary result = apiInstance.getReservationSummary(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#getReservationSummary");
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
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReservationAggregateSummary**](ReservationAggregateSummary.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **413** | Content Too Large |  -  |

<a name="getReservations"></a>
# **getReservations**
> getReservations(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields)

Get Reservations

Get all reservations.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      apiInstance.getReservations(startIndex, pageSize, sortBy, filter, q, qLimit, responseFields);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#getReservations");
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
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getReservationsByCartId"></a>
# **getReservationsByCartId**
> ReservationCollecti getReservationsByCartId(cartId, startIndex, pageSize, sortBy, filter, q, qLimit, responseFields)

Get Reservations By Cart Id

Get reservations based on the Cart ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ReservationCollecti result = apiInstance.getReservationsByCartId(cartId, startIndex, pageSize, sortBy, filter, q, qLimit, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#getReservationsByCartId");
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
| **cartId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **q** | **String**|  | [optional] |
| **qLimit** | **Integer**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ReservationCollecti**](ReservationCollecti.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeItem"></a>
# **removeItem**
> Reservati removeItem(reservationId, reservationItemId)

Remove Item

Remove an item from a reservation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String reservationItemId = "reservationItemId_example"; // String | 
    try {
      Reservati result = apiInstance.removeItem(reservationId, reservationItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#removeItem");
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
| **reservationId** | **String**|  | |
| **reservationItemId** | **String**|  | |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateItemQuantity"></a>
# **updateItemQuantity**
> Reservati updateItemQuantity(reservationId, reservationItemId, quantity, runSynchronous, responseFields, fulfillmentInf)

Update Item Quantity

Update a reservation item&#39;s quantity. Set runSynchronous to \&quot;true\&quot; to perform this call synchronously with better performance time.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String reservationItemId = "reservationItemId_example"; // String | 
    Integer quantity = 56; // Integer | 
    Boolean runSynchronous = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FulfillmentInf fulfillmentInf = new FulfillmentInf(); // FulfillmentInf | 
    try {
      Reservati result = apiInstance.updateItemQuantity(reservationId, reservationItemId, quantity, runSynchronous, responseFields, fulfillmentInf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#updateItemQuantity");
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
| **reservationId** | **String**|  | |
| **reservationItemId** | **String**|  | |
| **quantity** | **Integer**|  | |
| **runSynchronous** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **fulfillmentInf** | [**FulfillmentInf**](FulfillmentInf.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateReservation"></a>
# **updateReservation**
> Reservati updateReservation(reservationId, responseFields, reservati)

Update Reservation

Update an existing reservation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    Reservati reservati = new Reservati(); // Reservati | 
    try {
      Reservati result = apiInstance.updateReservation(reservationId, responseFields, reservati);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#updateReservation");
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
| **reservationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **reservati** | [**Reservati**](Reservati.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateReservationItem"></a>
# **updateReservationItem**
> Reservati updateReservationItem(reservationId, reservationItemId, zipCode, runSynchronous, responseFields, reservationItem)

Update Reservation Item

Updates a reservation item. Set runSynchronous to \&quot;true\&quot; to perform this call synchronously with better performance time.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String reservationItemId = "reservationItemId_example"; // String | 
    String zipCode = "zipCode_example"; // String | 
    Boolean runSynchronous = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ReservationItem reservationItem = new ReservationItem(); // ReservationItem | 
    try {
      Reservati result = apiInstance.updateReservationItem(reservationId, reservationItemId, zipCode, runSynchronous, responseFields, reservationItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#updateReservationItem");
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
| **reservationId** | **String**|  | |
| **reservationItemId** | **String**|  | |
| **zipCode** | **String**|  | [optional] |
| **runSynchronous** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **reservationItem** | [**ReservationItem**](ReservationItem.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateTimer"></a>
# **updateTimer**
> Reservati updateTimer(reservationId, responseFields)

Update Timer

Restart the expiration timer of a reservation.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Reservati result = apiInstance.updateTimer(reservationId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#updateTimer");
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
| **reservationId** | **String**|  | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateZipCode"></a>
# **updateZipCode**
> Reservati updateZipCode(reservationId, zipCode, runSynchronous, responseFields, reservationWebAPIOrderAttribute)

Update Zip Code

Update the zip code of a reservation. Set runSynchronous to \&quot;true\&quot; to perform this call synchronously with better performance time.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reservation.ApiClient;
import com.kibocommerce.sdk.reservation.ApiException;
import com.kibocommerce.sdk.reservation.Configuration;
import com.kibocommerce.sdk.reservation.auth.*;
import com.kibocommerce.sdk.reservation.models.*;
import com.kibocommerce.sdk.reservation.api.ReservationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String zipCode = "zipCode_example"; // String | 
    Boolean runSynchronous = false; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    List<ReservationWebAPIOrderAttribute> reservationWebAPIOrderAttribute = Arrays.asList(); // List<ReservationWebAPIOrderAttribute> | 
    try {
      Reservati result = apiInstance.updateZipCode(reservationId, zipCode, runSynchronous, responseFields, reservationWebAPIOrderAttribute);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReservationApi#updateZipCode");
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
| **reservationId** | **String**|  | |
| **zipCode** | **String**|  | |
| **runSynchronous** | **Boolean**|  | [optional] [default to false] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **reservationWebAPIOrderAttribute** | [**List&lt;ReservationWebAPIOrderAttribute&gt;**](ReservationWebAPIOrderAttribute.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

