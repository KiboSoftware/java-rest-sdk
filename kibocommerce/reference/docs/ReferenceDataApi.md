# ReferenceDataApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAddressSchema**](ReferenceDataApi.md#getAddressSchema) | **GET** /platform/reference/addressschema/{countryCode} | Get Address Schema |
| [**getAddressSchemas**](ReferenceDataApi.md#getAddressSchemas) | **GET** /platform/reference/addressschemas | Get Address Schemas |
| [**getBehavior**](ReferenceDataApi.md#getBehavior) | **GET** /platform/reference/behaviors/{behaviorId} | Retrieves the details of a behavior specified by its behavior ID |
| [**getBehaviorCategories**](ReferenceDataApi.md#getBehaviorCategories) | **GET** /platform/reference/behaviors/categories | Retrieves a list of all behavior categories |
| [**getBehaviorCategory**](ReferenceDataApi.md#getBehaviorCategory) | **GET** /platform/reference/behaviors/categories/{categoryId} | Retrieves the details of a behavior specified by its behavior ID |
| [**getBehaviors**](ReferenceDataApi.md#getBehaviors) | **GET** /platform/reference/behaviors | Retrieves a list of all behaviors |
| [**getContentLocales**](ReferenceDataApi.md#getContentLocales) | **GET** /platform/reference/contentLocales | Get the full list of Content Locales supported by the system |
| [**getCountries**](ReferenceDataApi.md#getCountries) | **GET** /platform/reference/countries | Get the full list of Countries supported by the system |
| [**getCountriesWithStates**](ReferenceDataApi.md#getCountriesWithStates) | **GET** /platform/reference/countrieswithstates | Get the full list of Countries supported by the system |
| [**getCurrencies**](ReferenceDataApi.md#getCurrencies) | **GET** /platform/reference/currencies | Get the full list of Currencies supported by the system |
| [**getStatesByCountry**](ReferenceDataApi.md#getStatesByCountry) | **GET** /platform/reference/countries/{countryCode}/states | Get states/provinces for a country by ISO 3166-1 alpha-2 country code via ArcGIS Living Atlas |
| [**getTimeZones**](ReferenceDataApi.md#getTimeZones) | **GET** /platform/reference/timezones | Get the full list of TimeZones supported by the system |
| [**getTopLevelDomains**](ReferenceDataApi.md#getTopLevelDomains) | **GET** /platform/reference/topleveldomains | Get a full list of the supported top level domains |
| [**getUnitsOfMeasure**](ReferenceDataApi.md#getUnitsOfMeasure) | **GET** /platform/reference/unitsofmeasure | Get a full list of the units of measure |


<a name="getAddressSchema"></a>
# **getAddressSchema**
> AddressSchema getAddressSchema(countryCode, responseFields)

Get Address Schema

Get Address Schema

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String countryCode = "US"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AddressSchema result = apiInstance.getAddressSchema(countryCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAddressSchema");
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
| **countryCode** | **String**|  | [default to US] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**AddressSchema**](AddressSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAddressSchemas"></a>
# **getAddressSchemas**
> AddressSchemaCollection getAddressSchemas(responseFields)

Get Address Schemas

Get Address Schemas

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      AddressSchemaCollection result = apiInstance.getAddressSchemas(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAddressSchemas");
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

### Return type

[**AddressSchemaCollection**](AddressSchemaCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBehavior"></a>
# **getBehavior**
> Behavior getBehavior(behaviorId, responseFields)

Retrieves the details of a behavior specified by its behavior ID

Retrieves the details of a behavior specified by its behavior ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    Integer behaviorId = 56; // Integer | Unique identifier of the behavior for which you want details.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      Behavior result = apiInstance.getBehavior(behaviorId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getBehavior");
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
| **behaviorId** | **Integer**| Unique identifier of the behavior for which you want details. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**Behavior**](Behavior.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBehaviorCategories"></a>
# **getBehaviorCategories**
> BehaviorCategoryCollection getBehaviorCategories(responseFields)

Retrieves a list of all behavior categories

Retrieves a list of all behavior categories.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BehaviorCategoryCollection result = apiInstance.getBehaviorCategories(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getBehaviorCategories");
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

### Return type

[**BehaviorCategoryCollection**](BehaviorCategoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBehaviorCategory"></a>
# **getBehaviorCategory**
> BehaviorCategory getBehaviorCategory(categoryId, responseFields)

Retrieves the details of a behavior specified by its behavior ID

Retrieves the details of a behavior specified by its behavior ID.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the behavior category for which you want details.
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BehaviorCategory result = apiInstance.getBehaviorCategory(categoryId, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getBehaviorCategory");
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
| **categoryId** | **Integer**| Unique identifier of the behavior category for which you want details. | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BehaviorCategory**](BehaviorCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getBehaviors"></a>
# **getBehaviors**
> BehaviorCollection getBehaviors(userType, responseFields)

Retrieves a list of all behaviors

Retrieves a list of all behaviors.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String userType = "userType_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      BehaviorCollection result = apiInstance.getBehaviors(userType, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getBehaviors");
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
| **userType** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**BehaviorCollection**](BehaviorCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getContentLocales"></a>
# **getContentLocales**
> ContentLocaleCollection getContentLocales(responseFields)

Get the full list of Content Locales supported by the system

Get the full list of Content Locales supported by the system

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      ContentLocaleCollection result = apiInstance.getContentLocales(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getContentLocales");
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

### Return type

[**ContentLocaleCollection**](ContentLocaleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCountries"></a>
# **getCountries**
> CountryCollection getCountries(responseFields)

Get the full list of Countries supported by the system

Get the full list of Countries supported by the system

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CountryCollection result = apiInstance.getCountries(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getCountries");
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

### Return type

[**CountryCollection**](CountryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCountriesWithStates"></a>
# **getCountriesWithStates**
> CountryWithStatesCollection getCountriesWithStates(responseFields)

Get the full list of Countries supported by the system

Get the full list of Countries supported by the system

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CountryWithStatesCollection result = apiInstance.getCountriesWithStates(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getCountriesWithStates");
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

### Return type

[**CountryWithStatesCollection**](CountryWithStatesCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCurrencies"></a>
# **getCurrencies**
> CurrencyCollection getCurrencies(responseFields)

Get the full list of Currencies supported by the system

Get the full list of Currencies supported by the system

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CurrencyCollection result = apiInstance.getCurrencies(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getCurrencies");
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

### Return type

[**CurrencyCollection**](CurrencyCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getStatesByCountry"></a>
# **getStatesByCountry**
> StateCollection getStatesByCountry(countryCode, responseFields)

Get states/provinces for a country by ISO 3166-1 alpha-2 country code via ArcGIS Living Atlas

Get states/provinces for a country by ISO 3166-1 alpha-2 country code via ArcGIS Living Atlas.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String countryCode = "countryCode_example"; // String | ISO 3166-1 alpha-2 country code (e.g. US, DE, GB)
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      StateCollection result = apiInstance.getStatesByCountry(countryCode, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getStatesByCountry");
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
| **countryCode** | **String**| ISO 3166-1 alpha-2 country code (e.g. US, DE, GB) | |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**StateCollection**](StateCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTimeZones"></a>
# **getTimeZones**
> TimeZoneCollection getTimeZones(responseFields)

Get the full list of TimeZones supported by the system

Get the full list of TimeZones supported by the system

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      TimeZoneCollection result = apiInstance.getTimeZones(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getTimeZones");
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

### Return type

[**TimeZoneCollection**](TimeZoneCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getTopLevelDomains"></a>
# **getTopLevelDomains**
> TopLevelDomainCollection getTopLevelDomains(responseFields)

Get a full list of the supported top level domains

Get a full list of the supported top level domains

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      TopLevelDomainCollection result = apiInstance.getTopLevelDomains(responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getTopLevelDomains");
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

### Return type

[**TopLevelDomainCollection**](TopLevelDomainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUnitsOfMeasure"></a>
# **getUnitsOfMeasure**
> UnitOfMeasureCollection getUnitsOfMeasure(filter, responseFields)

Get a full list of the units of measure

Get a full list of the units of measure

### Example
```java
// Import classes:
import com.kibocommerce.sdk.reference.ApiClient;
import com.kibocommerce.sdk.reference.ApiException;
import com.kibocommerce.sdk.reference.Configuration;
import com.kibocommerce.sdk.reference.auth.*;
import com.kibocommerce.sdk.reference.models.*;
import com.kibocommerce.sdk.reference.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String filter = "filter_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      UnitOfMeasureCollection result = apiInstance.getUnitsOfMeasure(filter, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getUnitsOfMeasure");
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
| **filter** | **String**|  | [optional] |
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**UnitOfMeasureCollection**](UnitOfMeasureCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

