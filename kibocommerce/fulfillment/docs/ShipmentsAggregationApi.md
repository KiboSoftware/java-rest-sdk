# ShipmentsAggregationApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getShipmentsAggregation**](ShipmentsAggregationApi.md#getShipmentsAggregation) | **GET** /commerce/shipments/aggregation | getShipmentsAggregation |


<a name="getShipmentsAggregation"></a>
# **getShipmentsAggregation**
> ShipmentsAggregation getShipmentsAggregation(xVolTenant, aggregations, bypassSearchIndex, filter, isExpress, isLate, locationGroupCode, locationPagePageIndex, locationPagePageSize, locationPageSort, locations, page, pageSize, pickStatus, pickWaveType, pickable, quickSearch, shipmentTypePagePageIndex, shipmentTypePagePageSize, shipmentTypePageSort, shipmentTypes, slaCompliance, slaComplianceLevelPagePageIndex, slaComplianceLevelPagePageSize, slaComplianceLevelPageSort, slaComplianceLevels, slaDefinitionNumbers, slaPagePageIndex, slaPagePageSize, slaPageSort, sort, timePeriodUnit, timePeriodValue, workflowTaskName, workflowTaskNames, workflowTaskPagePageIndex, workflowTaskPagePageSize, workflowTaskPageSort, xVolSite)

getShipmentsAggregation

getShipmentsAggregation

### Example
```java
// Import classes:
import com.kibocommerce.sdk.fulfillment.ApiClient;
import com.kibocommerce.sdk.fulfillment.ApiException;
import com.kibocommerce.sdk.fulfillment.Configuration;
import com.kibocommerce.sdk.fulfillment.models.*;
import com.kibocommerce.sdk.fulfillment.api.ShipmentsAggregationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");

    ShipmentsAggregationApi apiInstance = new ShipmentsAggregationApi(defaultClient);
    Integer xVolTenant = 56; // Integer | 
    List<String> aggregations = Arrays.asList(); // List<String> | 
    Boolean bypassSearchIndex = true; // Boolean | 
    String filter = "filter_example"; // String | 
    Boolean isExpress = true; // Boolean | 
    Boolean isLate = true; // Boolean | 
    String locationGroupCode = "locationGroupCode_example"; // String | 
    Integer locationPagePageIndex = 56; // Integer | 
    Integer locationPagePageSize = 56; // Integer | 
    String locationPageSort = "locationPageSort_example"; // String | 
    List<String> locations = Arrays.asList(); // List<String> | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String pickStatus = "AVAILABLE"; // String | 
    String pickWaveType = "NORMAL"; // String | 
    Boolean pickable = true; // Boolean | 
    String quickSearch = "quickSearch_example"; // String | 
    Integer shipmentTypePagePageIndex = 56; // Integer | 
    Integer shipmentTypePagePageSize = 56; // Integer | 
    String shipmentTypePageSort = "shipmentTypePageSort_example"; // String | 
    List<String> shipmentTypes = Arrays.asList(); // List<String> | 
    String slaCompliance = "slaCompliance_example"; // String | 
    Integer slaComplianceLevelPagePageIndex = 56; // Integer | 
    Integer slaComplianceLevelPagePageSize = 56; // Integer | 
    String slaComplianceLevelPageSort = "slaComplianceLevelPageSort_example"; // String | 
    List<String> slaComplianceLevels = Arrays.asList(); // List<String> | 
    List<Integer> slaDefinitionNumbers = Arrays.asList(); // List<Integer> | 
    Integer slaPagePageIndex = 56; // Integer | 
    Integer slaPagePageSize = 56; // Integer | 
    String slaPageSort = "slaPageSort_example"; // String | 
    String sort = "sort_example"; // String | 
    String timePeriodUnit = "HOURS"; // String | 
    Integer timePeriodValue = 56; // Integer | 
    String workflowTaskName = "workflowTaskName_example"; // String | 
    List<String> workflowTaskNames = Arrays.asList(); // List<String> | 
    Integer workflowTaskPagePageIndex = 56; // Integer | 
    Integer workflowTaskPagePageSize = 56; // Integer | 
    String workflowTaskPageSort = "workflowTaskPageSort_example"; // String | 
    Integer xVolSite = 56; // Integer | 
    try {
      ShipmentsAggregation result = apiInstance.getShipmentsAggregation(xVolTenant, aggregations, bypassSearchIndex, filter, isExpress, isLate, locationGroupCode, locationPagePageIndex, locationPagePageSize, locationPageSort, locations, page, pageSize, pickStatus, pickWaveType, pickable, quickSearch, shipmentTypePagePageIndex, shipmentTypePagePageSize, shipmentTypePageSort, shipmentTypes, slaCompliance, slaComplianceLevelPagePageIndex, slaComplianceLevelPagePageSize, slaComplianceLevelPageSort, slaComplianceLevels, slaDefinitionNumbers, slaPagePageIndex, slaPagePageSize, slaPageSort, sort, timePeriodUnit, timePeriodValue, workflowTaskName, workflowTaskNames, workflowTaskPagePageIndex, workflowTaskPagePageSize, workflowTaskPageSort, xVolSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentsAggregationApi#getShipmentsAggregation");
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
| **xVolTenant** | **Integer**|  | |
| **aggregations** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **bypassSearchIndex** | **Boolean**|  | [optional] |
| **filter** | **String**|  | [optional] |
| **isExpress** | **Boolean**|  | [optional] |
| **isLate** | **Boolean**|  | [optional] |
| **locationGroupCode** | **String**|  | [optional] |
| **locationPagePageIndex** | **Integer**|  | [optional] |
| **locationPagePageSize** | **Integer**|  | [optional] |
| **locationPageSort** | **String**|  | [optional] |
| **locations** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **pickStatus** | **String**|  | [optional] [enum: AVAILABLE, IN_WAVE, PICKED, TRANSFER, COMPLETE] |
| **pickWaveType** | **String**|  | [optional] [enum: NORMAL, SINGLE, MULTIPLE] |
| **pickable** | **Boolean**|  | [optional] |
| **quickSearch** | **String**|  | [optional] |
| **shipmentTypePagePageIndex** | **Integer**|  | [optional] |
| **shipmentTypePagePageSize** | **Integer**|  | [optional] |
| **shipmentTypePageSort** | **String**|  | [optional] |
| **shipmentTypes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slaCompliance** | **String**|  | [optional] |
| **slaComplianceLevelPagePageIndex** | **Integer**|  | [optional] |
| **slaComplianceLevelPagePageSize** | **Integer**|  | [optional] |
| **slaComplianceLevelPageSort** | **String**|  | [optional] |
| **slaComplianceLevels** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **slaDefinitionNumbers** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **slaPagePageIndex** | **Integer**|  | [optional] |
| **slaPagePageSize** | **Integer**|  | [optional] |
| **slaPageSort** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **timePeriodUnit** | **String**|  | [optional] [enum: HOURS, DAYS, WEEKS, MONTHS, YEARS] |
| **timePeriodValue** | **Integer**|  | [optional] |
| **workflowTaskName** | **String**|  | [optional] |
| **workflowTaskNames** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **workflowTaskPagePageIndex** | **Integer**|  | [optional] |
| **workflowTaskPagePageSize** | **Integer**|  | [optional] |
| **workflowTaskPageSort** | **String**|  | [optional] |
| **xVolSite** | **Integer**|  | [optional] |

### Return type

[**ShipmentsAggregation**](ShipmentsAggregation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

