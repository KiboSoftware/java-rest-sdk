# SearchMerchandizingRulesApi

All URIs are relative to *http://https:/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**previewSearchMerchandizingRule**](SearchMerchandizingRulesApi.md#previewSearchMerchandizingRule) | **POST** /commerce/catalog/storefront/searchmerchandizingrules/previewsearchmerchandizingrule | Preview search merchandizing rule |


<a name="previewSearchMerchandizingRule"></a>
# **previewSearchMerchandizingRule**
> Object previewSearchMerchandizingRule(searchMerchandizingRuleParameters)

Preview search merchandizing rule

Preview search results with given SearchMerchandizingRule object

### Example
```java
// Import classes:
import com.kibocommerce.sdk.catalogstorefront.ApiClient;
import com.kibocommerce.sdk.catalogstorefront.ApiException;
import com.kibocommerce.sdk.catalogstorefront.Configuration;
import com.kibocommerce.sdk.catalogstorefront.auth.*;
import com.kibocommerce.sdk.catalogstorefront.models.*;
import com.kibocommerce.sdk.catalogstorefront.api.SearchMerchandizingRulesApi;

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

    SearchMerchandizingRulesApi apiInstance = new SearchMerchandizingRulesApi(defaultClient);
    SearchMerchandizingRuleParameters searchMerchandizingRuleParameters = new SearchMerchandizingRuleParameters(); // SearchMerchandizingRuleParameters | 
    try {
      Object result = apiInstance.previewSearchMerchandizingRule(searchMerchandizingRuleParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchMerchandizingRulesApi#previewSearchMerchandizingRule");
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
| **searchMerchandizingRuleParameters** | [**SearchMerchandizingRuleParameters**](SearchMerchandizingRuleParameters.md)|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth), [clientOauth2](../README.md#clientOauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

