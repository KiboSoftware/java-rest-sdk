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
> Reservati activateReservation(reservationId)

Activate Reservation

Activate Reservation

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    try {
      Reservati result = apiInstance.activateReservation(reservationId);
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

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="addItem"></a>
# **addItem**
> Reservati addItem(reservationId, zipCode, reservationItem)

Add Item

Add Item

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String zipCode = "zipCode_example"; // String | 
    ReservationItem reservationItem = new ReservationItem(); // ReservationItem | 
    try {
      Reservati result = apiInstance.addItem(reservationId, zipCode, reservationItem);
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
| **reservationItem** | [**ReservationItem**](ReservationItem.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="closeReservation"></a>
# **closeReservation**
> Reservati closeReservation(reservationId)

Close Reservation

Close Reservation

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    try {
      Reservati result = apiInstance.closeReservation(reservationId);
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

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="convertToOrderReservation"></a>
# **convertToOrderReservation**
> Reservati convertToOrderReservation(reservationId, orderReservati)

Convert To Order Reservation

Convert To Order Reservation

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    OrderReservati orderReservati = new OrderReservati(); // OrderReservati | 
    try {
      Reservati result = apiInstance.convertToOrderReservation(reservationId, orderReservati);
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
| **orderReservati** | [**OrderReservati**](OrderReservati.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createReservation"></a>
# **createReservation**
> Reservati createReservation(reservati)

Create Reservation

Create Reservation

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    Reservati reservati = new Reservati(); // Reservati | 
    try {
      Reservati result = apiInstance.createReservation(reservati);
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
| **reservati** | [**Reservati**](Reservati.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteReservation"></a>
# **deleteReservation**
> deleteReservation(reservationId)

Delete Reservation

Delete Reservation

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    try {
      apiInstance.deleteReservation(reservationId);
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

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAllocationStatus"></a>
# **getAllocationStatus**
> Map&lt;String, String&gt; getAllocationStatus(reservationId)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    try {
      Map<String, String> result = apiInstance.getAllocationStatus(reservationId);
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

### Return type

**Map&lt;String, String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReservationById"></a>
# **getReservationById**
> Reservati getReservationById(reservationId)

Get Reservation By Id

Get Reservation By Id

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    try {
      Reservati result = apiInstance.getReservationById(reservationId);
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

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReservations"></a>
# **getReservations**
> Reservati getReservations()

Get Reservations

Get Reservations

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    try {
      Reservati result = apiInstance.getReservations();
      System.out.println(result);
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
This endpoint does not need any parameter.

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReservationsByCartId"></a>
# **getReservationsByCartId**
> ReservationCollecti getReservationsByCartId(cartId, startIndex, pageSize, sortBy, filter, q, qLimit)

Get Reservations By Cart Id

Get Reservations By Cart Id

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String cartId = "cartId_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    String q = "q_example"; // String | 
    Integer qLimit = 56; // Integer | 
    try {
      ReservationCollecti result = apiInstance.getReservationsByCartId(cartId, startIndex, pageSize, sortBy, filter, q, qLimit);
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

### Return type

[**ReservationCollecti**](ReservationCollecti.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeItem"></a>
# **removeItem**
> Reservati removeItem(reservationId, reservationItemId)

Remove Item

Remove Item

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

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

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateItemQuantity"></a>
# **updateItemQuantity**
> Reservati updateItemQuantity(reservationId, reservationItemId, quantity)

Update Item Quantity

Update Item Quantity

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String reservationItemId = "reservationItemId_example"; // String | 
    Integer quantity = 56; // Integer | 
    try {
      Reservati result = apiInstance.updateItemQuantity(reservationId, reservationItemId, quantity);
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

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateReservation"></a>
# **updateReservation**
> Reservati updateReservation(reservationId, reservati)

Update Reservation

Update Reservation

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    Reservati reservati = new Reservati(); // Reservati | 
    try {
      Reservati result = apiInstance.updateReservation(reservationId, reservati);
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
| **reservati** | [**Reservati**](Reservati.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateReservationItem"></a>
# **updateReservationItem**
> Reservati updateReservationItem(reservationId, reservationItemId, zipCode, reservationItem)

Update Reservation Item

Update Reservation Item

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String reservationItemId = "reservationItemId_example"; // String | 
    String zipCode = "zipCode_example"; // String | 
    ReservationItem reservationItem = new ReservationItem(); // ReservationItem | 
    try {
      Reservati result = apiInstance.updateReservationItem(reservationId, reservationItemId, zipCode, reservationItem);
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
| **reservationItem** | [**ReservationItem**](ReservationItem.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateTimer"></a>
# **updateTimer**
> Reservati updateTimer(reservationId)

Update Timer

Update Timer

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    try {
      Reservati result = apiInstance.updateTimer(reservationId);
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

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateZipCode"></a>
# **updateZipCode**
> Reservati updateZipCode(reservationId, zipCode, reservationWebAPIOrderAttribute)

Update Zip Code

Update Zip Code

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReservationApi apiInstance = new ReservationApi(defaultClient);
    String reservationId = "reservationId_example"; // String | 
    String zipCode = "zipCode_example"; // String | 
    List<ReservationWebAPIOrderAttribute> reservationWebAPIOrderAttribute = Arrays.asList(); // List<ReservationWebAPIOrderAttribute> | 
    try {
      Reservati result = apiInstance.updateZipCode(reservationId, zipCode, reservationWebAPIOrderAttribute);
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
| **reservationWebAPIOrderAttribute** | [**List&lt;ReservationWebAPIOrderAttribute&gt;**](ReservationWebAPIOrderAttribute.md)|  | [optional] |

### Return type

[**Reservati**](Reservati.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

