# solrschemamanager

Kibo ProductRuntime Service
- API version: v1

<div id=\"overview_CATALOG_ADMIN\">
            <h2>CATALOG ADMINISTRATION</h2>
            <p>The Catalog Administration APIs are a collection of resources for configuring the catalogs and products offered to your shoppers, including
                discounts and coupon sets, faceting, price lists, and different types or variations of products. See the
                <a href=\"/concept-guides/catalog\">Catalog user guides</a>
                for information about the related features in the Unified Commerce Admin.</p>
            <p>Use the <strong>Attributes</strong> resource to manage localization and attribute configurations for your catalogs. This current version of the Attributes API includes localizedContent to
                support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If
                you were a client prior to May 2024 and have upgraded your implementation to support this feature,
                you can still access attribute data that has not yet been rewritten to the new model by providing
                an x-api-version header set to \"1\". </p>
            <p>Use the <strong>Categories</strong> resource to organize products and control where they appear on the storefront. Create
                and maintain a hierarchy of categories and subcategories where the site will store properties. This current version of the Categories API includes localizedContent to
                support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If
                you were a client prior to May 2024 and have upgraded your implementation to support this feature,
                you can still access category data that has not yet been rewritten to the new model by providing
                an x-api-version header set to \"1\". </p>
            <p>Use the <strong>Coupon Sets</strong> resource to view and create coupon sets. You can use coupon sets to group multiple
                coupon codes together and associate them with one or more discounts.</p>
            <p>Use the <strong>Currency</strong> resource to manage the currency localization rules and exchange rates for any of the
                currencies that are supported for placing orders in.</p>
            <p>Use the <strong>Discounts</strong> and <strong>Discount Settings</strong> resources to define and manage discounts to apply to products, product categories, or
                orders. This current version of the Discounts API includes localizedContent to
                support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If
                you were a client prior to May 2024 and have upgraded your implementation to support this feature,
                you can still access discount data that has not yet been rewritten to the new model by providing
                an x-api-version header set to \"1\". </p>
            <p>Use the <strong>Facets</strong> resource to manage the facets shoppers use to filter product display results on a
                storefront. Facets can include categories, product attributes, or prices, and use either a range of
                values or discrete values.</p>
            <p>Use the <strong>Master Catalog</strong> resource to view details of the master catalogs associated with a tenant and to
                manage the product publishing mode for each master catalog.</p>
            <p>Use the <strong>Price Lists</strong> resources to view and create price lists. You can use price lists to override the
                catalog pricing of products for specific customer segments and/or sites.</p>
            <p>Use the <strong>Products</strong>, <strong>Product Types/Extras/Options/Properties</strong>, and <strong>Product Sort Definitions</strong> resources to create new product definitions in the master catalog and determine which
                catalogs will feature products. This current version of the Products API includes localizedContent to
                support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If
                you were a client prior to May 2024 and have upgraded your implementation to support this feature,
                you can still access product data that has not yet been rewritten to the new model by providing
                an x-api-version header set to \"1\".</p>
            <p>Use the <strong>Publishing</strong> resource to publish pending product updates together as part of a set.</p>
            <p>Use the <strong>Search</strong> resource to manage all settings and options for providing product search on your site, as
                well as search tuning rules.</p>
        </div>


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.kibocommerce</groupId>
  <artifactId>solrschemamanager</artifactId>
  <version>3.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'solrschemamanager' jar has been published to maven central.
    mavenLocal()       // Needed if the 'solrschemamanager' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.kibocommerce:solrschemamanager:3.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/solrschemamanager-3.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.kibocommerce.sdk.solrschemamanager.ApiClient;
import com.kibocommerce.sdk.solrschemamanager.ApiException;
import com.kibocommerce.sdk.solrschemamanager.Configuration;
import com.kibocommerce.sdk.solrschemamanager.auth.*;
import com.kibocommerce.sdk.solrschemamanager.models.*;
import com.kibocommerce.sdk.solrschemamanager.api.FieldTypeDefinitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    FieldTypeDefinitionApi apiInstance = new FieldTypeDefinitionApi(defaultClient);
    String language = "language_example"; // String | 
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    try {
      List<FieldTypeDefinitionRepositoryEntry> result = apiInstance.getFieldTypeDefinitions(language, responseFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldTypeDefinitionApi#getFieldTypeDefinitions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://https:/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FieldTypeDefinitionApi* | [**getFieldTypeDefinitions**](docs/FieldTypeDefinitionApi.md#getFieldTypeDefinitions) | **GET** /commerce/catalog/admin/searchSchema/fieldTypes/{language} | Get Field Type Definitions
*SchemaDefinitionApi* | [**getSchemaDefinition**](docs/SchemaDefinitionApi.md#getSchemaDefinition) | **GET** /commerce/catalog/admin/searchSchema/definition/{language} | Get Schema Definition
*SchemaDefinitionApi* | [**listSchemaDefinitions**](docs/SchemaDefinitionApi.md#listSchemaDefinitions) | **GET** /commerce/catalog/admin/searchSchema/definition | List Schema Definitions
*SchemaDefinitionApi* | [**publish**](docs/SchemaDefinitionApi.md#publish) | **POST** /commerce/catalog/admin/searchSchema/definition/{language}/publish | Publish
*SchemaDefinitionApi* | [**revert**](docs/SchemaDefinitionApi.md#revert) | **POST** /commerce/catalog/admin/searchSchema/definition/{language}/revert | Revert
*SchemaDefinitionApi* | [**updateSchemaDefinition**](docs/SchemaDefinitionApi.md#updateSchemaDefinition) | **PUT** /commerce/catalog/admin/searchSchema/definition/{language} | Update Schema Definition
*StopWordsApi* | [**downLoadStopWords**](docs/StopWordsApi.md#downLoadStopWords) | **GET** /commerce/catalog/admin/searchSchema/stopwords/{language} | Get Stopwords
*StopWordsApi* | [**uploadStopWords**](docs/StopWordsApi.md#uploadStopWords) | **PUT** /commerce/catalog/admin/searchSchema/stopwords/{language} | Add Stopwords
*SuggestDefinitionApi* | [**downLoadSuggest**](docs/SuggestDefinitionApi.md#downLoadSuggest) | **GET** /commerce/catalog/admin/searchSchema/suggest/{language} | Downloads the suggest file for the site
*SuggestDefinitionApi* | [**getSuggestSettings**](docs/SuggestDefinitionApi.md#getSuggestSettings) | **GET** /commerce/catalog/admin/searchSchema/suggest/settings/{language} | Gets the suggester settings for the site
*SuggestDefinitionApi* | [**updateSuggestSettings**](docs/SuggestDefinitionApi.md#updateSuggestSettings) | **PUT** /commerce/catalog/admin/searchSchema/suggest/settings/{language} | Updates the suggester settings for the site
*SuggestDefinitionApi* | [**uploadSuggest**](docs/SuggestDefinitionApi.md#uploadSuggest) | **PUT** /commerce/catalog/admin/searchSchema/suggest/{language} | Uploads a suggest file for the site in tab separated format)
*SynonymApi* | [**listSynonyms**](docs/SynonymApi.md#listSynonyms) | **GET** /commerce/catalog/admin/searchSchema/synonyms | List Synonyms
*SynonymApi* | [**updateSynonyms**](docs/SynonymApi.md#updateSynonyms) | **POST** /commerce/catalog/admin/searchSchema/synonyms/reload | Update Synonyms


## Documentation for Models

 - [AdminUserAuditInfo](docs/AdminUserAuditInfo.md)
 - [AttributeVocabularyValueLocalizedContent](docs/AttributeVocabularyValueLocalizedContent.md)
 - [CatalogAdminsAttributeVocabularyValue](docs/CatalogAdminsAttributeVocabularyValue.md)
 - [CatalogAdminsBundledProduct](docs/CatalogAdminsBundledProduct.md)
 - [CatalogAdminsDiscount](docs/CatalogAdminsDiscount.md)
 - [CatalogAdminsDiscountCondition](docs/CatalogAdminsDiscountCondition.md)
 - [CatalogAdminsDiscountTarget](docs/CatalogAdminsDiscountTarget.md)
 - [CatalogAdminsProduct](docs/CatalogAdminsProduct.md)
 - [CatalogAdminsProductImageGroup](docs/CatalogAdminsProductImageGroup.md)
 - [CatalogAdminsProductImageGroupTag](docs/CatalogAdminsProductImageGroupTag.md)
 - [CatalogAdminsProductPrice](docs/CatalogAdminsProductPrice.md)
 - [CatalogAdminsTargetedShippingMethod](docs/CatalogAdminsTargetedShippingMethod.md)
 - [CatalogAdminsTargetedShippingZone](docs/CatalogAdminsTargetedShippingZone.md)
 - [CatalogAdminsThresholdMessage](docs/CatalogAdminsThresholdMessage.md)
 - [CategoryDiscountCondition](docs/CategoryDiscountCondition.md)
 - [DiscountLocalizedContent](docs/DiscountLocalizedContent.md)
 - [FieldTypeDefinitionRepositoryEntry](docs/FieldTypeDefinitionRepositoryEntry.md)
 - [PricingRuntimeCustomerSegment](docs/PricingRuntimeCustomerSegment.md)
 - [ProductCategory](docs/ProductCategory.md)
 - [ProductExtraValueDeltaPrice](docs/ProductExtraValueDeltaPrice.md)
 - [ProductInCatalogInfo](docs/ProductInCatalogInfo.md)
 - [ProductLocalizedContent](docs/ProductLocalizedContent.md)
 - [SchemaDefinition](docs/SchemaDefinition.md)
 - [SchemaDefinitionField](docs/SchemaDefinitionField.md)
 - [SpellingSchemaDefinitionField](docs/SpellingSchemaDefinitionField.md)
 - [Suggester](docs/Suggester.md)
 - [ThresholdMessageLocalizedContent](docs/ThresholdMessageLocalizedContent.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



