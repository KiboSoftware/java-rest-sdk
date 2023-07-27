# QuoteApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addItemToQuote**](QuoteApi.md#addItemToQuote) | **POST** /commerce/quotes/{quoteId}/items | Add Item To Quote |
| [**applyCoupon**](QuoteApi.md#applyCoupon) | **PUT** /commerce/quotes/{quoteId}/coupons/{couponCode} | Apply Coupon |
| [**copyQuote**](QuoteApi.md#copyQuote) | **POST** /commerce/quotes/{quoteId}/copy | Copy quote |
| [**create**](QuoteApi.md#create) | **POST** /commerce/quotes/{quoteId}/comments | Create Comment |
| [**createQuote**](QuoteApi.md#createQuote) | **POST** /commerce/quotes | Create quote |
| [**createQuoteFromCart**](QuoteApi.md#createQuoteFromCart) | **POST** /commerce/quotes/create/{cartId} | Create Quote From Cart |
| [**deleteQuote**](QuoteApi.md#deleteQuote) | **DELETE** /commerce/quotes/{quoteId} | Delete Quote |
| [**deleteQuoteItem**](QuoteApi.md#deleteQuoteItem) | **DELETE** /commerce/quotes/{quoteId}/items/{quoteItemId} | Delete Quote Item |
| [**get**](QuoteApi.md#get) | **GET** /commerce/quotes/{quoteId}/comments/{commentId} | Get Quote Comment |
| [**getAll**](QuoteApi.md#getAll) | **GET** /commerce/quotes/{quoteId}/comments | Get All Quote Comments |
| [**getAvailableShippingMethods**](QuoteApi.md#getAvailableShippingMethods) | **GET** /commerce/quotes/{quoteId}/shippingMethods | Get Available Shipping Methods |
| [**getQuote**](QuoteApi.md#getQuote) | **GET** /commerce/quotes/{quoteId} | Get Quote |
| [**getQuoteByName**](QuoteApi.md#getQuoteByName) | **GET** /commerce/quotes/customers/{customerAccountId}/{quoteName} | Get Quote By Name |
| [**getQuoteItem**](QuoteApi.md#getQuoteItem) | **GET** /commerce/quotes/{quoteId}/items/{quoteItemId} | Get Quote Item |
| [**getQuoteItems**](QuoteApi.md#getQuoteItems) | **GET** /commerce/quotes/{quoteId}/items | Get Quote Items |
| [**getQuoteItemsByQuoteName**](QuoteApi.md#getQuoteItemsByQuoteName) | **GET** /commerce/quotes/customers/{customerAccountId}/{quoteName}/items | Get Quote Items By Quote Name |
| [**getQuotes**](QuoteApi.md#getQuotes) | **GET** /commerce/quotes | Get Quotes |
| [**removeCoupon**](QuoteApi.md#removeCoupon) | **DELETE** /commerce/quotes/{quoteId}/coupons/{couponCode} | Remove Coupon |
| [**removeCoupons**](QuoteApi.md#removeCoupons) | **DELETE** /commerce/quotes/{quoteId}/coupons | Remove Coupons |
| [**sendQuoteEmail**](QuoteApi.md#sendQuoteEmail) | **POST** /commerce/quotes/{quoteId}/email | Send Quote Email |
| [**updateFulfillmentInfo**](QuoteApi.md#updateFulfillmentInfo) | **POST** /commerce/quotes/{quoteId}/fulfillmentInfo | Update Fulfillment Info |
| [**updateItemFulfillment**](QuoteApi.md#updateItemFulfillment) | **PUT** /commerce/quotes/{quoteId}/items/{quoteItemId}/fulfillment | Update Item Fulfillment |
| [**updateItemProductPrice**](QuoteApi.md#updateItemProductPrice) | **PUT** /commerce/quotes/{quoteId}/items/{quoteItemId}/price/{price} | Update Item Product Price |
| [**updateItemQuantity**](QuoteApi.md#updateItemQuantity) | **PUT** /commerce/quotes/{quoteId}/items/{quoteItemId}/quantity/{quantity} | Update Item Quantity |
| [**updateQuote**](QuoteApi.md#updateQuote) | **PUT** /commerce/quotes/{quoteId} | Update Quote |
| [**updateQuoteAdjustments**](QuoteApi.md#updateQuoteAdjustments) | **POST** /commerce/quotes/{quoteId}/adjustments | Update Quote Adjustments |


<a name="addItemToQuote"></a>
# **addItemToQuote**
> Quote addItemToQuote(quoteId, updateMode, commerceRuntimeOrderItem)

Add Item To Quote

Adds an item to the Quote of the current shopper.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    CommerceRuntimeOrderItem commerceRuntimeOrderItem = new CommerceRuntimeOrderItem(); // CommerceRuntimeOrderItem | 
    try {
      Quote result = apiInstance.addItemToQuote(quoteId, updateMode, commerceRuntimeOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#addItemToQuote");
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
| **quoteId** | **String**|  | |
| **updateMode** | **String**|  | [optional] |
| **commerceRuntimeOrderItem** | [**CommerceRuntimeOrderItem**](CommerceRuntimeOrderItem.md)|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="applyCoupon"></a>
# **applyCoupon**
> Quote applyCoupon(quoteId, couponCode, updateMode)

Apply Coupon

Apply a coupon to the quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote with which to associate the coupon.
    String couponCode = "couponCode_example"; // String | Coupon code that the customer supplies to get the discounted price.
    String updateMode = "updateMode_example"; // String | 
    try {
      Quote result = apiInstance.applyCoupon(quoteId, couponCode, updateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#applyCoupon");
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
| **quoteId** | **String**| Unique identifier of the quote with which to associate the coupon. | |
| **couponCode** | **String**| Coupon code that the customer supplies to get the discounted price. | |
| **updateMode** | **String**|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="copyQuote"></a>
# **copyQuote**
> Quote copyQuote(quoteId)

Copy quote

Copies a source quote and creates a new quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | 
    try {
      Quote result = apiInstance.copyQuote(quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#copyQuote");
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
| **quoteId** | **String**|  | |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="create"></a>
# **create**
> QuoteComment create(quoteId, updateMode, quoteComment)

Create Comment

Create a comment on a specific quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote whose comments you want to get.
    String updateMode = "updateMode_example"; // String | 
    QuoteComment quoteComment = new QuoteComment(); // QuoteComment | Comment which wanted to add on a quote.
    try {
      QuoteComment result = apiInstance.create(quoteId, updateMode, quoteComment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#create");
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
| **quoteId** | **String**| Unique identifier of the quote whose comments you want to get. | |
| **updateMode** | **String**|  | [optional] |
| **quoteComment** | [**QuoteComment**](QuoteComment.md)| Comment which wanted to add on a quote. | [optional] |

### Return type

[**QuoteComment**](QuoteComment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createQuote"></a>
# **createQuote**
> Quote createQuote(quote)

Create quote

Creates a new B2B quote. With quotes, buyers can request an estimate based on a list of products they are interested in. Sellers can evaluate these requests and make adjustments to pricing, discounts, or other criteria before the buyer chooses whether to place the order or not. Comments can be left on the quote to communicate during this negotiation process.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    Quote quote = new Quote(); // Quote | 
    try {
      Quote result = apiInstance.createQuote(quote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#createQuote");
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
| **quote** | [**Quote**](Quote.md)|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createQuoteFromCart"></a>
# **createQuoteFromCart**
> Quote createQuoteFromCart(cartId, updateMode)

Create Quote From Cart

Creates a new quote from an existing cart, that is, when the customer chooses to initate quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String cartId = "cartId_example"; // String | Unique identifier of the cart. This is the original cart ID expressed as a GUID.
    String updateMode = "updateMode_example"; // String | 
    try {
      Quote result = apiInstance.createQuoteFromCart(cartId, updateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#createQuoteFromCart");
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
| **cartId** | **String**| Unique identifier of the cart. This is the original cart ID expressed as a GUID. | |
| **updateMode** | **String**|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteQuote"></a>
# **deleteQuote**
> deleteQuote(quoteId, draft)

Delete Quote

Deletes the quote specified by quote Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | 
    Boolean draft = true; // Boolean | 
    try {
      apiInstance.deleteQuote(quoteId, draft);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#deleteQuote");
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
| **quoteId** | **String**|  | |
| **draft** | **Boolean**|  | [optional] |

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

<a name="deleteQuoteItem"></a>
# **deleteQuoteItem**
> deleteQuoteItem(quoteId, quoteItemId, updateMode)

Delete Quote Item

Delete Quote Item

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | 
    String quoteItemId = "quoteItemId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    try {
      apiInstance.deleteQuoteItem(quoteId, quoteItemId, updateMode);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#deleteQuoteItem");
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
| **quoteId** | **String**|  | |
| **quoteItemId** | **String**|  | |
| **updateMode** | **String**|  | [optional] |

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

<a name="get"></a>
# **get**
> QuoteComment get(quoteId, commentId, draft)

Get Quote Comment

Retrieves a specific quote comment from an quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote whose comments you want to get.
    String commentId = "commentId_example"; // String | Unique identifier of the comment whose text you want to get.
    Boolean draft = true; // Boolean | 
    try {
      QuoteComment result = apiInstance.get(quoteId, commentId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#get");
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
| **quoteId** | **String**| Unique identifier of the quote whose comments you want to get. | |
| **commentId** | **String**| Unique identifier of the comment whose text you want to get. | |
| **draft** | **Boolean**|  | [optional] |

### Return type

[**QuoteComment**](QuoteComment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAll"></a>
# **getAll**
> QuoteComment getAll(quoteId)

Get All Quote Comments

Retrieves all quote comments from an quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote whose comments you want to get.
    try {
      QuoteComment result = apiInstance.getAll(quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getAll");
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
| **quoteId** | **String**| Unique identifier of the quote whose comments you want to get. | |

### Return type

[**QuoteComment**](QuoteComment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAvailableShippingMethods"></a>
# **getAvailableShippingMethods**
> List&lt;CommerceRuntimeShippingRate&gt; getAvailableShippingMethods(quoteId, draft)

Get Available Shipping Methods

Retrieves available shipping methods for quotes. Typically used to display available shipping method options on the quote page.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote whose shipping methods you want to get.
    Boolean draft = true; // Boolean | 
    try {
      List<CommerceRuntimeShippingRate> result = apiInstance.getAvailableShippingMethods(quoteId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getAvailableShippingMethods");
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
| **quoteId** | **String**| Unique identifier of the quote whose shipping methods you want to get. | |
| **draft** | **Boolean**|  | [optional] |

### Return type

[**List&lt;CommerceRuntimeShippingRate&gt;**](CommerceRuntimeShippingRate.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getQuote"></a>
# **getQuote**
> Quote getQuote(quoteId, draft)

Get Quote

Retrieves the details of a quote specified by the quote ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote whose details you want.
    Boolean draft = true; // Boolean | 
    try {
      Quote result = apiInstance.getQuote(quoteId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getQuote");
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
| **quoteId** | **String**| Unique identifier of the quote whose details you want. | |
| **draft** | **Boolean**|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getQuoteByName"></a>
# **getQuoteByName**
> Quote getQuoteByName(customerAccountId, quoteName, draft)

Get Quote By Name

Retrieves quote by its name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    Integer customerAccountId = 56; // Integer | 
    String quoteName = "quoteName_example"; // String | 
    Boolean draft = true; // Boolean | 
    try {
      Quote result = apiInstance.getQuoteByName(customerAccountId, quoteName, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getQuoteByName");
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
| **customerAccountId** | **Integer**|  | |
| **quoteName** | **String**|  | |
| **draft** | **Boolean**|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getQuoteItem"></a>
# **getQuoteItem**
> CommerceRuntimeOrderItem getQuoteItem(quoteId, quoteItemId, draft)

Get Quote Item

Retrieves an individual Quote item from a Quote specified by quote Id and quote item Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | 
    String quoteItemId = "quoteItemId_example"; // String | 
    Boolean draft = true; // Boolean | 
    try {
      CommerceRuntimeOrderItem result = apiInstance.getQuoteItem(quoteId, quoteItemId, draft);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getQuoteItem");
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
| **quoteId** | **String**|  | |
| **quoteItemId** | **String**|  | |
| **draft** | **Boolean**|  | [optional] |

### Return type

[**CommerceRuntimeOrderItem**](CommerceRuntimeOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getQuoteItems"></a>
# **getQuoteItems**
> List&lt;CommerceRuntimeOrderItem&gt; getQuoteItems(quoteId, startIndex, pageSize, sortBy, filter)

Get Quote Items

Returns a listing of Quotes

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      List<CommerceRuntimeOrderItem> result = apiInstance.getQuoteItems(quoteId, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getQuoteItems");
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
| **quoteId** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**List&lt;CommerceRuntimeOrderItem&gt;**](CommerceRuntimeOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getQuoteItemsByQuoteName"></a>
# **getQuoteItemsByQuoteName**
> List&lt;CommerceRuntimeOrderItem&gt; getQuoteItemsByQuoteName(customerAccountId, quoteName, startIndex, pageSize, sortBy, filter)

Get Quote Items By Quote Name

Gets the quote specified by the quote name.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    Integer customerAccountId = 56; // Integer | 
    String quoteName = "quoteName_example"; // String | 
    Integer startIndex = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String sortBy = "sortBy_example"; // String | 
    String filter = "filter_example"; // String | 
    try {
      List<CommerceRuntimeOrderItem> result = apiInstance.getQuoteItemsByQuoteName(customerAccountId, quoteName, startIndex, pageSize, sortBy, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getQuoteItemsByQuoteName");
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
| **customerAccountId** | **Integer**|  | |
| **quoteName** | **String**|  | |
| **startIndex** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **sortBy** | **String**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**List&lt;CommerceRuntimeOrderItem&gt;**](CommerceRuntimeOrderItem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getQuotes"></a>
# **getQuotes**
> QuoteCollection getQuotes(startIndex, pageSize, sortBy, filter, q, qLimit)

Get Quotes

Retrieves a list of B2B Quotes according to any specified filter criteria and sort options.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    Integer startIndex = 56; // Integer | Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex=3. The default value is 0. Optional.
    Integer pageSize = 56; // Integer | Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional.
    String sortBy = "sortBy_example"; // String | The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional.
    String filter = "filter_example"; // String | A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals,               gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
    String q = "q_example"; // String | Text to perform a search on
    Integer qLimit = 56; // Integer | Limit of the records to include in a search, used for global search
    try {
      QuoteCollection result = apiInstance.getQuotes(startIndex, pageSize, sortBy, filter, q, qLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#getQuotes");
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
| **startIndex** | **Integer**| Used to page results from a query. Indicates the zero-based offset in the complete result set where the returned entities begin.               For example, with a PageSize of 25, to get the 51st through the 75th items, startIndex&#x3D;3. The default value is 0. Optional. | [optional] |
| **pageSize** | **Integer**| Used to page results from a query. Indicates the maximum number of entities to return from a query. The default value is 20 and the maximum value is 200. Optional. | [optional] |
| **sortBy** | **String**| The element to sort the results by and the order in which the results appear. Either ascending (a-z) or descending (z-a) order. Optional. | [optional] |
| **filter** | **String**| A set of filter expressions representing the search parameters for a query: eq&#x3D;equals, ne&#x3D;not equals, gt&#x3D;greater than, lt &#x3D; less than or equals,               gt &#x3D; greater than or equals, lt &#x3D; less than or equals, sw &#x3D; starts with, or cont &#x3D; contains. Optional. | [optional] |
| **q** | **String**| Text to perform a search on | [optional] |
| **qLimit** | **Integer**| Limit of the records to include in a search, used for global search | [optional] |

### Return type

[**QuoteCollection**](QuoteCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeCoupon"></a>
# **removeCoupon**
> Quote removeCoupon(quoteId, couponCode, updateMode)

Remove Coupon

Removes a coupon that had been previously applied to the Quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the Quote with the coupon you want to remove.
    String couponCode = "couponCode_example"; // String | Coupon code to remove.
    String updateMode = "updateMode_example"; // String | 
    try {
      Quote result = apiInstance.removeCoupon(quoteId, couponCode, updateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#removeCoupon");
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
| **quoteId** | **String**| Unique identifier of the Quote with the coupon you want to remove. | |
| **couponCode** | **String**| Coupon code to remove. | |
| **updateMode** | **String**|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeCoupons"></a>
# **removeCoupons**
> Quote removeCoupons(quoteId, updateMode)

Remove Coupons

Removes all coupons that had been previously applied to the Quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the Quote with the coupon you want to remove.
    String updateMode = "updateMode_example"; // String | 
    try {
      Quote result = apiInstance.removeCoupons(quoteId, updateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#removeCoupons");
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
| **quoteId** | **String**| Unique identifier of the Quote with the coupon you want to remove. | |
| **updateMode** | **String**|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="sendQuoteEmail"></a>
# **sendQuoteEmail**
> sendQuoteEmail(quoteId, requestBody)

Send Quote Email

Send Quote email to provided email addresses or email mentioned on the quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote.
    List<String> requestBody = Arrays.asList(); // List<String> | optional list of email addresses
    try {
      apiInstance.sendQuoteEmail(quoteId, requestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#sendQuoteEmail");
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
| **quoteId** | **String**| Unique identifier of the quote. | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| optional list of email addresses | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateFulfillmentInfo"></a>
# **updateFulfillmentInfo**
> Quote updateFulfillmentInfo(quoteId, updateMode, fulfillmentInfo)

Update Fulfillment Info

Updates the fulfillmentInfo of quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote you want to update.
    String updateMode = "updateMode_example"; // String | 
    FulfillmentInfo fulfillmentInfo = new FulfillmentInfo(); // FulfillmentInfo | 
    try {
      Quote result = apiInstance.updateFulfillmentInfo(quoteId, updateMode, fulfillmentInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#updateFulfillmentInfo");
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
| **quoteId** | **String**| Unique identifier of the quote you want to update. | |
| **updateMode** | **String**|  | [optional] |
| **fulfillmentInfo** | [**FulfillmentInfo**](FulfillmentInfo.md)|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateItemFulfillment"></a>
# **updateItemFulfillment**
> Quote updateItemFulfillment(quoteId, quoteItemId, updateMode, commerceRuntimeOrderItem)

Update Item Fulfillment

Updates the fulfillment method and/or location of an individual quote item in the quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote.
    String quoteItemId = "quoteItemId_example"; // String | Unique identifier of the quote item.
    String updateMode = "updateMode_example"; // String | 
    CommerceRuntimeOrderItem commerceRuntimeOrderItem = new CommerceRuntimeOrderItem(); // CommerceRuntimeOrderItem | The quote item containing fulfillment information to update.
    try {
      Quote result = apiInstance.updateItemFulfillment(quoteId, quoteItemId, updateMode, commerceRuntimeOrderItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#updateItemFulfillment");
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
| **quoteId** | **String**| Unique identifier of the quote. | |
| **quoteItemId** | **String**| Unique identifier of the quote item. | |
| **updateMode** | **String**|  | [optional] |
| **commerceRuntimeOrderItem** | [**CommerceRuntimeOrderItem**](CommerceRuntimeOrderItem.md)| The quote item containing fulfillment information to update. | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateItemProductPrice"></a>
# **updateItemProductPrice**
> Quote updateItemProductPrice(quoteId, quoteItemId, price, updateMode)

Update Item Product Price

Overrides the price of an individual quote item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote.
    String quoteItemId = "quoteItemId_example"; // String | Unique identifier of the quote item.
    Double price = 3.4D; // Double | New Price for the specified quote item.
    String updateMode = "updateMode_example"; // String | 
    try {
      Quote result = apiInstance.updateItemProductPrice(quoteId, quoteItemId, price, updateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#updateItemProductPrice");
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
| **quoteId** | **String**| Unique identifier of the quote. | |
| **quoteItemId** | **String**| Unique identifier of the quote item. | |
| **price** | **Double**| New Price for the specified quote item. | |
| **updateMode** | **String**|  | [optional] |

### Return type

[**Quote**](Quote.md)

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
> Quote updateItemQuantity(quoteId, quoteItemId, quantity, updateMode)

Update Item Quantity

Updates the quantity of an individual Quote item.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote.
    String quoteItemId = "quoteItemId_example"; // String | Unique identifier of the quote item.
    Integer quantity = 56; // Integer | New quantity for the specified quote item.
    String updateMode = "updateMode_example"; // String | 
    try {
      Quote result = apiInstance.updateItemQuantity(quoteId, quoteItemId, quantity, updateMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#updateItemQuantity");
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
| **quoteId** | **String**| Unique identifier of the quote. | |
| **quoteItemId** | **String**| Unique identifier of the quote item. | |
| **quantity** | **Integer**| New quantity for the specified quote item. | |
| **updateMode** | **String**|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateQuote"></a>
# **updateQuote**
> Quote updateQuote(quoteId, updateMode, quote)

Update Quote

Updates a quote specified by quote Id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | 
    String updateMode = "updateMode_example"; // String | 
    Quote quote = new Quote(); // Quote | 
    try {
      Quote result = apiInstance.updateQuote(quoteId, updateMode, quote);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#updateQuote");
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
| **quoteId** | **String**|  | |
| **updateMode** | **String**|  | [optional] |
| **quote** | [**Quote**](Quote.md)|  | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateQuoteAdjustments"></a>
# **updateQuoteAdjustments**
> Quote updateQuoteAdjustments(quoteId, updateMode, quoteAdjustment)

Update Quote Adjustments

Set product, shipping, and handling adjustments on the specified quote.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.commerce.ApiClient;
import com.kibocommerce.sdk.commerce.ApiException;
import com.kibocommerce.sdk.commerce.Configuration;
import com.kibocommerce.sdk.commerce.auth.*;
import com.kibocommerce.sdk.commerce.models.*;
import com.kibocommerce.sdk.commerce.api.QuoteApi;

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

    QuoteApi apiInstance = new QuoteApi(defaultClient);
    String quoteId = "quoteId_example"; // String | Unique identifier of the quote.
    String updateMode = "updateMode_example"; // String | 
    QuoteAdjustment quoteAdjustment = new QuoteAdjustment(); // QuoteAdjustment | Adjustments to be added to the quote.
    try {
      Quote result = apiInstance.updateQuoteAdjustments(quoteId, updateMode, quoteAdjustment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteApi#updateQuoteAdjustments");
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
| **quoteId** | **String**| Unique identifier of the quote. | |
| **updateMode** | **String**|  | [optional] |
| **quoteAdjustment** | [**QuoteAdjustment**](QuoteAdjustment.md)| Adjustments to be added to the quote. | [optional] |

### Return type

[**Quote**](Quote.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

