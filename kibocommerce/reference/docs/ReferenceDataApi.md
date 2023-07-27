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
| [**getTimeZones**](ReferenceDataApi.md#getTimeZones) | **GET** /platform/reference/timezones | Get the full list of TimeZones supported by the system |
| [**getTopLevelDomains**](ReferenceDataApi.md#getTopLevelDomains) | **GET** /platform/reference/topleveldomains | Get a full list of the supported top level domains |
| [**getUnitsOfMeasure**](ReferenceDataApi.md#getUnitsOfMeasure) | **GET** /platform/reference/unitsofmeasure | Get a full list of the units of measure |


<a name="getAddressSchema"></a>
# **getAddressSchema**
> AddressSchema getAddressSchema(countryCode)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String countryCode = "US"; // String | 
    try {
      AddressSchema result = apiInstance.getAddressSchema(countryCode);
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

### Return type

[**AddressSchema**](AddressSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAddressSchemas"></a>
# **getAddressSchemas**
> AddressSchemaCollection getAddressSchemas()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      AddressSchemaCollection result = apiInstance.getAddressSchemas();
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
This endpoint does not need any parameter.

### Return type

[**AddressSchemaCollection**](AddressSchemaCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getBehavior"></a>
# **getBehavior**
> Behavior getBehavior(behaviorId)

Retrieves the details of a behavior specified by its behavior ID



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    Integer behaviorId = 56; // Integer | Unique identifier of the behavior for which you want details.
    try {
      Behavior result = apiInstance.getBehavior(behaviorId);
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

### Return type

[**Behavior**](Behavior.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getBehaviorCategories"></a>
# **getBehaviorCategories**
> BehaviorCategoryCollection getBehaviorCategories()

Retrieves a list of all behavior categories



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      BehaviorCategoryCollection result = apiInstance.getBehaviorCategories();
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
This endpoint does not need any parameter.

### Return type

[**BehaviorCategoryCollection**](BehaviorCategoryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getBehaviorCategory"></a>
# **getBehaviorCategory**
> BehaviorCategory getBehaviorCategory(categoryId)

Retrieves the details of a behavior specified by its behavior ID



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    Integer categoryId = 56; // Integer | Unique identifier of the behavior category for which you want details.
    try {
      BehaviorCategory result = apiInstance.getBehaviorCategory(categoryId);
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

### Return type

[**BehaviorCategory**](BehaviorCategory.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getBehaviors"></a>
# **getBehaviors**
> BehaviorCollection getBehaviors(userType)

Retrieves a list of all behaviors



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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String userType = "userType_example"; // String | 
    try {
      BehaviorCollection result = apiInstance.getBehaviors(userType);
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

### Return type

[**BehaviorCollection**](BehaviorCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getContentLocales"></a>
# **getContentLocales**
> ContentLocaleCollection getContentLocales()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      ContentLocaleCollection result = apiInstance.getContentLocales();
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
This endpoint does not need any parameter.

### Return type

[**ContentLocaleCollection**](ContentLocaleCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCountries"></a>
# **getCountries**
> CountryCollection getCountries()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      CountryCollection result = apiInstance.getCountries();
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
This endpoint does not need any parameter.

### Return type

[**CountryCollection**](CountryCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCountriesWithStates"></a>
# **getCountriesWithStates**
> CountryWithStatesCollection getCountriesWithStates()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      CountryWithStatesCollection result = apiInstance.getCountriesWithStates();
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
This endpoint does not need any parameter.

### Return type

[**CountryWithStatesCollection**](CountryWithStatesCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCurrencies"></a>
# **getCurrencies**
> CurrencyCollection getCurrencies()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      CurrencyCollection result = apiInstance.getCurrencies();
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
This endpoint does not need any parameter.

### Return type

[**CurrencyCollection**](CurrencyCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTimeZones"></a>
# **getTimeZones**
> TimeZoneCollection getTimeZones()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      TimeZoneCollection result = apiInstance.getTimeZones();
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
This endpoint does not need any parameter.

### Return type

[**TimeZoneCollection**](TimeZoneCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getTopLevelDomains"></a>
# **getTopLevelDomains**
> TopLevelDomainCollection getTopLevelDomains()

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      TopLevelDomainCollection result = apiInstance.getTopLevelDomains();
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
This endpoint does not need any parameter.

### Return type

[**TopLevelDomainCollection**](TopLevelDomainCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUnitsOfMeasure"></a>
# **getUnitsOfMeasure**
> UnitOfMeasureCollection getUnitsOfMeasure(filter)

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

    // Configure OAuth2 access token for authorization: clientOauth2
    OAuth clientOauth2 = (OAuth) defaultClient.getAuthentication("clientOauth2");
    clientOauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String filter = "filter_example"; // String | 
    try {
      UnitOfMeasureCollection result = apiInstance.getUnitsOfMeasure(filter);
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

### Return type

[**UnitOfMeasureCollection**](UnitOfMeasureCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

