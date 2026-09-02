# ShipmentRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createShipmentRule**](ShipmentRulesApi.md#createShipmentRule) | **POST** /commerce/rules/shipment | Create shipment rule |
| [**deleteShipmentRule**](ShipmentRulesApi.md#deleteShipmentRule) | **DELETE** /commerce/rules/shipment/{code} | Delete shipment rule |
| [**getShipmentRule**](ShipmentRulesApi.md#getShipmentRule) | **GET** /commerce/rules/shipment/{code} | Get shipment rule by code |
| [**getShipmentRules**](ShipmentRulesApi.md#getShipmentRules) | **GET** /commerce/rules/shipment | Get shipment rules |
| [**parseShipmentExpression**](ShipmentRulesApi.md#parseShipmentExpression) | **POST** /commerce/rules/shipment/expression/parse | Parse Shipment Expression |
| [**updateShipmentRule**](ShipmentRulesApi.md#updateShipmentRule) | **PUT** /commerce/rules/shipment/{code} | Update shipment rule |


<a name="createShipmentRule"></a>
# **createShipmentRule**
> ShipmentRule createShipmentRule(responseFields, shipmentRule)

Create shipment rule

Creates a new shipment rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentRulesApi apiInstance = new ShipmentRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentRule shipmentRule = new ShipmentRule(); // ShipmentRule | The shipment rule to create.
    try {
      ShipmentRule result = apiInstance.createShipmentRule(responseFields, shipmentRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentRulesApi#createShipmentRule");
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentRule** | [**ShipmentRule**](ShipmentRule.md)| The shipment rule to create. | [optional] |

### Return type

[**ShipmentRule**](ShipmentRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteShipmentRule"></a>
# **deleteShipmentRule**
> deleteShipmentRule(code)

Delete shipment rule

Delete a shipment rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentRulesApi apiInstance = new ShipmentRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the rule to delete.
    try {
      apiInstance.deleteShipmentRule(code);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentRulesApi#deleteShipmentRule");
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
| **code** | **String**| The code of the rule to delete. | |

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

<a name="getShipmentRule"></a>
# **getShipmentRule**
> ShipmentRule getShipmentRule(code, responseFields)

Get shipment rule by code

Retrieves the details of a single shipment rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentRulesApi apiInstance = new ShipmentRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the rule.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ShipmentRule result = apiInstance.getShipmentRule(code, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentRulesApi#getShipmentRule");
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
| **code** | **String**| The code of the rule. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ShipmentRule**](ShipmentRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getShipmentRules"></a>
# **getShipmentRules**
> ShipmentRuleCollection getShipmentRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields)

Get shipment rules

Retrieves a list of shipment rules.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentRulesApi apiInstance = new ShipmentRulesApi(defaultClient);
    Integer startIndex = 0; // Integer | The start index.
    Integer pageSize = 0; // Integer | The page size.
    String sortBy = "sortBy_example"; // String | The sort by.
    String filter = "filter_example"; // String | The filter.
    String responseGroups = "responseGroups_example"; // String | The response groups.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ShipmentRuleCollection result = apiInstance.getShipmentRules(startIndex, pageSize, sortBy, filter, responseGroups, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentRulesApi#getShipmentRules");
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
| **startIndex** | **Integer**| The start index. | [optional] [default to 0] |
| **pageSize** | **Integer**| The page size. | [optional] [default to 0] |
| **sortBy** | **String**| The sort by. | [optional] |
| **filter** | **String**| The filter. | [optional] |
| **responseGroups** | **String**| The response groups. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**ShipmentRuleCollection**](ShipmentRuleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="parseShipmentExpression"></a>
# **parseShipmentExpression**
> String parseShipmentExpression(fulfillmentLocationCode, responseFields, catalogAdminsDynamicExpression)

Parse Shipment Expression

Parses a shipment expression and returns the query string for retrieving shipments that match the criteria.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentRulesApi apiInstance = new ShipmentRulesApi(defaultClient);
    String fulfillmentLocationCode = "fulfillmentLocationCode_example"; // String | The fulfillment location code to filter by.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsDynamicExpression catalogAdminsDynamicExpression = new CatalogAdminsDynamicExpression(); // CatalogAdminsDynamicExpression | The dynamic expression to parse.
    try {
      String result = apiInstance.parseShipmentExpression(fulfillmentLocationCode, responseFields, catalogAdminsDynamicExpression);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentRulesApi#parseShipmentExpression");
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
| **fulfillmentLocationCode** | **String**| The fulfillment location code to filter by. | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsDynamicExpression** | [**CatalogAdminsDynamicExpression**](CatalogAdminsDynamicExpression.md)| The dynamic expression to parse. | [optional] |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateShipmentRule"></a>
# **updateShipmentRule**
> ShipmentRule updateShipmentRule(code, responseFields, shipmentRule)

Update shipment rule

Update an existing shipment rule.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.ShipmentRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShipmentRulesApi apiInstance = new ShipmentRulesApi(defaultClient);
    String code = "code_example"; // String | The code of the rule to update.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    ShipmentRule shipmentRule = new ShipmentRule(); // ShipmentRule | The updated shipment rule.
    try {
      ShipmentRule result = apiInstance.updateShipmentRule(code, responseFields, shipmentRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentRulesApi#updateShipmentRule");
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
| **code** | **String**| The code of the rule to update. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **shipmentRule** | [**ShipmentRule**](ShipmentRule.md)| The updated shipment rule. | [optional] |

### Return type

[**ShipmentRule**](ShipmentRule.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

