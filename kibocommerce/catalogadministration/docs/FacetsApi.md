# FacetsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFacet**](FacetsApi.md#addFacet) | **POST** /commerce/catalog/admin/facets | Add facet |
| [**deleteFacetById**](FacetsApi.md#deleteFacetById) | **DELETE** /commerce/catalog/admin/facets/{facetId} | Delete facet |
| [**getFacet**](FacetsApi.md#getFacet) | **GET** /commerce/catalog/admin/facets/{facetId} | Get facet |
| [**getFacetCategoryList**](FacetsApi.md#getFacetCategoryList) | **GET** /commerce/catalog/admin/facets/category | Get facet category list |
| [**getFacetCategoryListLegacy**](FacetsApi.md#getFacetCategoryListLegacy) | **GET** /commerce/catalog/admin/facets/category/{categoryId} | Get facet category list (legacy) |
| [**getFacets**](FacetsApi.md#getFacets) | **GET** /commerce/catalog/admin/facets | Get facets |
| [**updateFacet**](FacetsApi.md#updateFacet) | **PUT** /commerce/catalog/admin/facets/{facetId} | Update facet |
| [**updateFacetSet**](FacetsApi.md#updateFacetSet) | **POST** /commerce/catalog/admin/facets/set/edit | Update facet |


<a name="addFacet"></a>
# **addFacet**
> CatalogAdminsFacet addFacet(catalogAdminsFacet)

Add facet

Adds a new Facet to a category in a catalog.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    CatalogAdminsFacet catalogAdminsFacet = new CatalogAdminsFacet(); // CatalogAdminsFacet | 
    try {
      CatalogAdminsFacet result = apiInstance.addFacet(catalogAdminsFacet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#addFacet");
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
| **catalogAdminsFacet** | [**CatalogAdminsFacet**](CatalogAdminsFacet.md)|  | [optional] |

### Return type

[**CatalogAdminsFacet**](CatalogAdminsFacet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="deleteFacetById"></a>
# **deleteFacetById**
> deleteFacetById(facetId)

Delete facet

Deletes the Facet definition from the store.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer facetId = 56; // Integer | 
    try {
      apiInstance.deleteFacetById(facetId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#deleteFacetById");
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
| **facetId** | **Integer**|  | |

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

<a name="getFacet"></a>
# **getFacet**
> CatalogAdminsFacet getFacet(facetId, validate)

Get facet

Retrieves the details of a Facet Definition

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer facetId = 56; // Integer | 
    Boolean validate = true; // Boolean | 
    try {
      CatalogAdminsFacet result = apiInstance.getFacet(facetId, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#getFacet");
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
| **facetId** | **Integer**|  | |
| **validate** | **Boolean**|  | [optional] |

### Return type

[**CatalogAdminsFacet**](CatalogAdminsFacet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFacetCategoryList"></a>
# **getFacetCategoryList**
> FacetSet getFacetCategoryList(categoryId, categoryCode, includeAvailable, validate)

Get facet category list

Retrieves a list of configured, and optionally available, Facet Configurations for the specified category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    String categoryCode = "categoryCode_example"; // String | 
    Boolean includeAvailable = true; // Boolean | 
    Boolean validate = true; // Boolean | 
    try {
      FacetSet result = apiInstance.getFacetCategoryList(categoryId, categoryCode, includeAvailable, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#getFacetCategoryList");
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
| **categoryId** | **Integer**|  | [optional] |
| **categoryCode** | **String**|  | [optional] |
| **includeAvailable** | **Boolean**|  | [optional] |
| **validate** | **Boolean**|  | [optional] |

### Return type

[**FacetSet**](FacetSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFacetCategoryListLegacy"></a>
# **getFacetCategoryListLegacy**
> FacetSet getFacetCategoryListLegacy(categoryId, includeAvailable, validate)

Get facet category list (legacy)

Retrieves a list of configured, and optionally available, Facet Configurations for the specified category.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    Boolean includeAvailable = true; // Boolean | 
    Boolean validate = true; // Boolean | 
    try {
      FacetSet result = apiInstance.getFacetCategoryListLegacy(categoryId, includeAvailable, validate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#getFacetCategoryListLegacy");
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
| **categoryId** | **Integer**|  | |
| **includeAvailable** | **Boolean**|  | [optional] |
| **validate** | **Boolean**|  | [optional] |

### Return type

[**FacetSet**](FacetSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getFacets"></a>
# **getFacets**
> FacetCollection getFacets()

Get facets

Retrieves the list of Facet Definition

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    try {
      FacetCollection result = apiInstance.getFacets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#getFacets");
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

[**FacetCollection**](FacetCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateFacet"></a>
# **updateFacet**
> CatalogAdminsFacet updateFacet(facetId, catalogAdminsFacet)

Update facet

Modifies a Facet definition.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer facetId = 56; // Integer | 
    CatalogAdminsFacet catalogAdminsFacet = new CatalogAdminsFacet(); // CatalogAdminsFacet | 
    try {
      CatalogAdminsFacet result = apiInstance.updateFacet(facetId, catalogAdminsFacet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#updateFacet");
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
| **facetId** | **Integer**|  | |
| **catalogAdminsFacet** | [**CatalogAdminsFacet**](CatalogAdminsFacet.md)|  | [optional] |

### Return type

[**CatalogAdminsFacet**](CatalogAdminsFacet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateFacetSet"></a>
# **updateFacetSet**
> FacetSet updateFacetSet(categoryId, categoryCode, facetSet)

Update facet

Modifies a Facet definition.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.FacetsApi;

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    String categoryCode = "categoryCode_example"; // String | 
    FacetSet facetSet = new FacetSet(); // FacetSet | 
    try {
      FacetSet result = apiInstance.updateFacetSet(categoryId, categoryCode, facetSet);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FacetsApi#updateFacetSet");
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
| **categoryId** | **Integer**|  | [optional] |
| **categoryCode** | **String**|  | [optional] |
| **facetSet** | [**FacetSet**](FacetSet.md)|  | [optional] |

### Return type

[**FacetSet**](FacetSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

