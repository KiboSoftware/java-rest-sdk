# InventoryBinApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBin**](InventoryBinApi.md#createBin) | **POST** /commerce/inventory/v1/bin | Create Bin |
| [**getBinStatuses**](InventoryBinApi.md#getBinStatuses) | **GET** /commerce/inventory/v1/bin/binStatuses | Get Bin Statuses |
| [**getBinTypes**](InventoryBinApi.md#getBinTypes) | **GET** /commerce/inventory/v1/bin/binTypes | Get Bin Types |
| [**getBins**](InventoryBinApi.md#getBins) | **GET** /commerce/inventory/v1/bin | Get Bins |
| [**loadInventory**](InventoryBinApi.md#loadInventory) | **POST** /commerce/inventory/v1/bin/loadInventory | Load Inventory |
| [**searchBins**](InventoryBinApi.md#searchBins) | **POST** /commerce/inventory/v1/bin/searchInventory | Search Bins |
| [**updateBin**](InventoryBinApi.md#updateBin) | **POST** /commerce/inventory/v1/bin/{bin_id} | Update Bin |
| [**updateBins**](InventoryBinApi.md#updateBins) | **POST** /commerce/inventory/v1/bin/updateBins | Update Bins |


<a name="createBin"></a>
# **createBin**
> BinIDResponse createBin(createBinRequest)

Create Bin

Create a bin

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    CreateBinRequest createBinRequest = new CreateBinRequest(); // CreateBinRequest | Request to create a new bin
    try {
      BinIDResponse result = apiInstance.createBin(createBinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#createBin");
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
| **createBinRequest** | [**CreateBinRequest**](CreateBinRequest.md)| Request to create a new bin | |

### Return type

[**BinIDResponse**](BinIDResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="getBinStatuses"></a>
# **getBinStatuses**
> List&lt;BinStatusModel&gt; getBinStatuses()

Get Bin Statuses

Get list of bin statuses

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    try {
      List<BinStatusModel> result = apiInstance.getBinStatuses();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#getBinStatuses");
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

[**List&lt;BinStatusModel&gt;**](BinStatusModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="getBinTypes"></a>
# **getBinTypes**
> List&lt;BinTypeModel&gt; getBinTypes()

Get Bin Types

Get list of bin types

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    try {
      List<BinTypeModel> result = apiInstance.getBinTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#getBinTypes");
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

[**List&lt;BinTypeModel&gt;**](BinTypeModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="getBins"></a>
# **getBins**
> BinResponseModel getBins(locationID, searchTerm, perPage, page)

Get Bins

Get a list of bins

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    Long locationID = 56L; // Long | Id of location
    Long searchTerm = 56L; // Long | Term to match in bins
    Long perPage = 56L; // Long | Results per page
    Long page = 56L; // Long | Page to show
    try {
      BinResponseModel result = apiInstance.getBins(locationID, searchTerm, perPage, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#getBins");
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
| **locationID** | **Long**| Id of location | |
| **searchTerm** | **Long**| Term to match in bins | [optional] |
| **perPage** | **Long**| Results per page | [optional] |
| **page** | **Long**| Page to show | [optional] |

### Return type

[**BinResponseModel**](BinResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Bins Not Found |  -  |

<a name="loadInventory"></a>
# **loadInventory**
> LoadBinInventoryResponse loadInventory(loadBinInventoryRequest)

Load Inventory

Loads bin inventory for designated bins

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    LoadBinInventoryRequest loadBinInventoryRequest = new LoadBinInventoryRequest(); // LoadBinInventoryRequest | Request to load bin inventory
    try {
      LoadBinInventoryResponse result = apiInstance.loadInventory(loadBinInventoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#loadInventory");
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
| **loadBinInventoryRequest** | [**LoadBinInventoryRequest**](LoadBinInventoryRequest.md)| Request to load bin inventory | |

### Return type

[**LoadBinInventoryResponse**](LoadBinInventoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="searchBins"></a>
# **searchBins**
> BinSearchResponse searchBins(binSearchRequest)

Search Bins

Search bins for a inventory by bin name or any product identifier

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    BinSearchRequest binSearchRequest = new BinSearchRequest(); // BinSearchRequest | Request to allocate inventory
    try {
      BinSearchResponse result = apiInstance.searchBins(binSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#searchBins");
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
| **binSearchRequest** | [**BinSearchRequest**](BinSearchRequest.md)| Request to allocate inventory | |

### Return type

[**BinSearchResponse**](BinSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="updateBin"></a>
# **updateBin**
> Bin updateBin(binId, updateBinRequest)

Update Bin

Update the designated bin

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    Long binId = 56L; // Long | Id of bin to update
    UpdateBinRequest updateBinRequest = new UpdateBinRequest(); // UpdateBinRequest | Request to update a bin
    try {
      Bin result = apiInstance.updateBin(binId, updateBinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#updateBin");
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
| **binId** | **Long**| Id of bin to update | |
| **updateBinRequest** | [**UpdateBinRequest**](UpdateBinRequest.md)| Request to update a bin | |

### Return type

[**Bin**](Bin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateBins"></a>
# **updateBins**
> UpdateBinsResponse updateBins(updateBinsRequest)

Update Bins

Update the designated bins

### Example
```java
// Import classes:
import com.kibocommerce.sdk.inventory.ApiClient;
import com.kibocommerce.sdk.inventory.ApiException;
import com.kibocommerce.sdk.inventory.Configuration;
import com.kibocommerce.sdk.inventory.models.*;
import com.kibocommerce.sdk.inventory.api.InventoryBinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    InventoryBinApi apiInstance = new InventoryBinApi(defaultClient);
    UpdateBinsRequest updateBinsRequest = new UpdateBinsRequest(); // UpdateBinsRequest | Request to update multiple bins
    try {
      UpdateBinsResponse result = apiInstance.updateBins(updateBinsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InventoryBinApi#updateBins");
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
| **updateBinsRequest** | [**UpdateBinsRequest**](UpdateBinsRequest.md)| Request to update multiple bins | |

### Return type

[**UpdateBinsResponse**](UpdateBinsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

