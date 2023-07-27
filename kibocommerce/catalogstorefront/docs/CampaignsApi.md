# CampaignsApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /commerce/catalog/storefront/campaigns/{campaignId} | Get a search campaign |
| [**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /commerce/catalog/storefront/campaigns/all | Get search campaigns |


<a name="getCampaign"></a>
# **getCampaign**
> CampaignResult getCampaign(campaignId)

Get a search campaign

Get a specific campaign by campaign id.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.CampaignsApi;

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

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      CampaignResult result = apiInstance.getCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getCampaign");
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
| **campaignId** | **String**|  | |

### Return type

[**CampaignResult**](CampaignResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCampaigns"></a>
# **getCampaigns**
> List&lt;CampaignResult&gt; getCampaigns()

Get search campaigns

Get list of Search campaigns.

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.CampaignsApi;

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

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    try {
      List<CampaignResult> result = apiInstance.getCampaigns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getCampaigns");
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

[**List&lt;CampaignResult&gt;**](CampaignResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

