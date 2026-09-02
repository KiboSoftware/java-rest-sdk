# FacetsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFacet**](FacetsApi.md#addFacet) | **POST** /commerce/catalog/admin/facets | Add Facet |
| [**deleteFacetById**](FacetsApi.md#deleteFacetById) | **DELETE** /commerce/catalog/admin/facets/{facetId} | Delete Facet |
| [**getFacet**](FacetsApi.md#getFacet) | **GET** /commerce/catalog/admin/facets/{facetId} | Get Facet |
| [**getFacetCategoryList**](FacetsApi.md#getFacetCategoryList) | **GET** /commerce/catalog/admin/facets/category | Get Facet Category List |
| [**getFacetCategoryListLegacy**](FacetsApi.md#getFacetCategoryListLegacy) | **GET** /commerce/catalog/admin/facets/category/{categoryId} | Get Facet Category List (Legacy) |
| [**getFacets**](FacetsApi.md#getFacets) | **GET** /commerce/catalog/admin/facets | Get facets |
| [**updateFacet**](FacetsApi.md#updateFacet) | **PUT** /commerce/catalog/admin/facets/{facetId} | Update Facet |
| [**updateFacetSet**](FacetsApi.md#updateFacetSet) | **POST** /commerce/catalog/admin/facets/set/edit | Update Facet Set |


<a name="addFacet"></a>
# **addFacet**
> CatalogAdminsFacet addFacet(responseFields, catalogAdminsFacet)

Add Facet

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsFacet catalogAdminsFacet = new CatalogAdminsFacet(); // CatalogAdminsFacet | 
    try {
      CatalogAdminsFacet result = apiInstance.addFacet(responseFields, catalogAdminsFacet);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsFacet** | [**CatalogAdminsFacet**](CatalogAdminsFacet.md)|  | [optional] |

### Return type

[**CatalogAdminsFacet**](CatalogAdminsFacet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="deleteFacetById"></a>
# **deleteFacetById**
> deleteFacetById(facetId)

Delete Facet

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

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFacet"></a>
# **getFacet**
> CatalogAdminsFacet getFacet(facetId, validate, responseFields)

Get Facet

Retrieves the details of a Facet definition.

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer facetId = 56; // Integer | 
    Boolean validate = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      CatalogAdminsFacet result = apiInstance.getFacet(facetId, validate, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**CatalogAdminsFacet**](CatalogAdminsFacet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFacetCategoryList"></a>
# **getFacetCategoryList**
> FacetSet getFacetCategoryList(categoryId, categoryCode, includeAvailable, validate, responseFields)

Get Facet Category List

Retrieves a list of configured, and optionally available, Facet configurations for the specified category.

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    String categoryCode = "categoryCode_example"; // String | 
    Boolean includeAvailable = true; // Boolean | 
    Boolean validate = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FacetSet result = apiInstance.getFacetCategoryList(categoryId, categoryCode, includeAvailable, validate, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FacetSet**](FacetSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFacetCategoryListLegacy"></a>
# **getFacetCategoryListLegacy**
> FacetSet getFacetCategoryListLegacy(categoryId, includeAvailable, validate, responseFields)

Get Facet Category List (Legacy)

Retrieves a list of configured, and optionally available, Facet configurations for the specified category. 

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    Boolean includeAvailable = true; // Boolean | 
    Boolean validate = true; // Boolean | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FacetSet result = apiInstance.getFacetCategoryListLegacy(categoryId, includeAvailable, validate, responseFields);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FacetSet**](FacetSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getFacets"></a>
# **getFacets**
> FacetCollection getFacets(responseFields)

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      FacetCollection result = apiInstance.getFacets(responseFields);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |

### Return type

[**FacetCollection**](FacetCollection.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateFacet"></a>
# **updateFacet**
> CatalogAdminsFacet updateFacet(facetId, responseFields, catalogAdminsFacet)

Update Facet

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer facetId = 56; // Integer | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    CatalogAdminsFacet catalogAdminsFacet = new CatalogAdminsFacet(); // CatalogAdminsFacet | 
    try {
      CatalogAdminsFacet result = apiInstance.updateFacet(facetId, responseFields, catalogAdminsFacet);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **catalogAdminsFacet** | [**CatalogAdminsFacet**](CatalogAdminsFacet.md)|  | [optional] |

### Return type

[**CatalogAdminsFacet**](CatalogAdminsFacet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateFacetSet"></a>
# **updateFacetSet**
> FacetSet updateFacetSet(categoryId, categoryCode, responseFields, facetSet)

Update Facet Set

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

    FacetsApi apiInstance = new FacetsApi(defaultClient);
    Integer categoryId = 56; // Integer | 
    String categoryCode = "categoryCode_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    FacetSet facetSet = new FacetSet(); // FacetSet | 
    try {
      FacetSet result = apiInstance.updateFacetSet(categoryId, categoryCode, responseFields, facetSet);
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
| **responseFields** | **String**| limits which fields are returned in the response body | [optional] |
| **facetSet** | [**FacetSet**](FacetSet.md)|  | [optional] |

### Return type

[**FacetSet**](FacetSet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

