# catalogadministration

Kibo Catalog Admin Services
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
  <artifactId>catalogadministration</artifactId>
  <version>3.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'catalogadministration' jar has been published to maven central.
    mavenLocal()       // Needed if the 'catalogadministration' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.kibocommerce:catalogadministration:3.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/catalogadministration-3.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.kibocommerce.sdk.catalogadministration.ApiClient;
import com.kibocommerce.sdk.catalogadministration.ApiException;
import com.kibocommerce.sdk.catalogadministration.Configuration;
import com.kibocommerce.sdk.catalogadministration.auth.*;
import com.kibocommerce.sdk.catalogadministration.models.*;
import com.kibocommerce.sdk.catalogadministration.api.BackorderRebalancingRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://https:/api");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BackorderRebalancingRulesApi apiInstance = new BackorderRebalancingRulesApi(defaultClient);
    String responseFields = "responseFields_example"; // String | limits which fields are returned in the response body
    BackorderRebalancingRule backorderRebalancingRule = new BackorderRebalancingRule(); // BackorderRebalancingRule | The rule to create. Code is auto-generated if omitted.
    try {
      BackorderRebalancingRule result = apiInstance.createRule(responseFields, backorderRebalancingRule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackorderRebalancingRulesApi#createRule");
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
*BackorderRebalancingRulesApi* | [**createRule**](docs/BackorderRebalancingRulesApi.md#createRule) | **POST** /commerce/rules/backorderrebalancing | Create back order rebalancing rule
*BackorderRebalancingRulesApi* | [**deleteRule**](docs/BackorderRebalancingRulesApi.md#deleteRule) | **DELETE** /commerce/rules/backorderrebalancing/{code} | Delete back order rebalancing rule
*BackorderRebalancingRulesApi* | [**getRule**](docs/BackorderRebalancingRulesApi.md#getRule) | **GET** /commerce/rules/backorderrebalancing/{code} | Get back order rebalancing rule by code
*BackorderRebalancingRulesApi* | [**getRules**](docs/BackorderRebalancingRulesApi.md#getRules) | **GET** /commerce/rules/backorderrebalancing | Get back order rebalancing rules
*BackorderRebalancingRulesApi* | [**updateRank**](docs/BackorderRebalancingRulesApi.md#updateRank) | **PUT** /commerce/rules/backorderrebalancing/{code}/rank | Update back order rebalancing rule rank
*BackorderRebalancingRulesApi* | [**updateRule**](docs/BackorderRebalancingRulesApi.md#updateRule) | **PUT** /commerce/rules/backorderrebalancing/{code} | Update back order rebalancing rule
*CallOffReleaseRulesApi* | [**createCallOffReleaseRule**](docs/CallOffReleaseRulesApi.md#createCallOffReleaseRule) | **POST** /commerce/rules/calloffrelease | Create call-off release rule
*CallOffReleaseRulesApi* | [**deleteCallOffReleaseRule**](docs/CallOffReleaseRulesApi.md#deleteCallOffReleaseRule) | **DELETE** /commerce/rules/calloffrelease/{code} | Delete call-off release rule
*CallOffReleaseRulesApi* | [**getCallOffReleaseRule**](docs/CallOffReleaseRulesApi.md#getCallOffReleaseRule) | **GET** /commerce/rules/calloffrelease/{code} | Get call-off release rule by code
*CallOffReleaseRulesApi* | [**getCallOffReleaseRules**](docs/CallOffReleaseRulesApi.md#getCallOffReleaseRules) | **GET** /commerce/rules/calloffrelease | Get call-off release rules
*CallOffReleaseRulesApi* | [**updateCallOffReleaseRule**](docs/CallOffReleaseRulesApi.md#updateCallOffReleaseRule) | **PUT** /commerce/rules/calloffrelease/{code} | Update call-off release rule
*CallOffReleaseRulesApi* | [**updateRank**](docs/CallOffReleaseRulesApi.md#updateRank) | **PUT** /commerce/rules/calloffrelease/{code}/rank | Update call-off release rule rank
*CategoriesApi* | [**addCategory**](docs/CategoriesApi.md#addCategory) | **POST** /commerce/catalog/admin/categories | Add Category
*CategoriesApi* | [**addCategoryAttribute**](docs/CategoriesApi.md#addCategoryAttribute) | **POST** /commerce/catalog/admin/categories/{categoryId}/attributes | Add Category Attribute
*CategoriesApi* | [**addProductsToCategory**](docs/CategoriesApi.md#addProductsToCategory) | **POST** /commerce/catalog/admin/categories/{categoryId}/add-products | Add Products to Category
*CategoriesApi* | [**deleteCategoryAttribute**](docs/CategoriesApi.md#deleteCategoryAttribute) | **DELETE** /commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN} | Delete Category Attribute
*CategoriesApi* | [**deleteCategoryById**](docs/CategoriesApi.md#deleteCategoryById) | **DELETE** /commerce/catalog/admin/categories/{categoryId} | Delete Category
*CategoriesApi* | [**getCategories**](docs/CategoriesApi.md#getCategories) | **GET** /commerce/catalog/admin/categories | Get Categories
*CategoriesApi* | [**getCategory**](docs/CategoriesApi.md#getCategory) | **GET** /commerce/catalog/admin/categories/{categoryId} | Get Category
*CategoriesApi* | [**getCategoryAttribute**](docs/CategoriesApi.md#getCategoryAttribute) | **GET** /commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN} | Get Category Attribute
*CategoriesApi* | [**getCategoryAttributes**](docs/CategoriesApi.md#getCategoryAttributes) | **GET** /commerce/catalog/admin/categories/{categoryId}/attributes | Get Category Attributes
*CategoriesApi* | [**getChildCategories**](docs/CategoriesApi.md#getChildCategories) | **GET** /commerce/catalog/admin/categories/{categoryId}/children | Get Child Categories
*CategoriesApi* | [**removeProductsFromCategory**](docs/CategoriesApi.md#removeProductsFromCategory) | **POST** /commerce/catalog/admin/categories/{categoryId}/remove-products | Remove Products from Category
*CategoriesApi* | [**searchCategoryAttributes**](docs/CategoriesApi.md#searchCategoryAttributes) | **GET** /commerce/catalog/admin/categories/searchCategoryAttributes | Search Category Attributes
*CategoriesApi* | [**updateCategory**](docs/CategoriesApi.md#updateCategory) | **PUT** /commerce/catalog/admin/categories/{categoryId} | Update Category
*CategoriesApi* | [**updateCategoryAttribute**](docs/CategoriesApi.md#updateCategoryAttribute) | **PUT** /commerce/catalog/admin/categories/{categoryId}/attributes/{attributeFQN} | Update Category Attribute
*CategoriesApi* | [**validateDynamicExpression**](docs/CategoriesApi.md#validateDynamicExpression) | **POST** /commerce/catalog/admin/categories/ValidateDynamicExpression | Validate Dynamic Category Expression
*CategoriesApi* | [**validateRealTimeDynamicExpression**](docs/CategoriesApi.md#validateRealTimeDynamicExpression) | **POST** /commerce/catalog/admin/categories/ValidateRealTimeDynamicExpression | Validate Realtime Dynamic Category Expression
*CategoryAttributeDefinitionApi* | [**createAttribute**](docs/CategoryAttributeDefinitionApi.md#createAttribute) | **POST** /commerce/catalog/admin/categoryattributedefinition/attributes | Create Attribute
*CategoryAttributeDefinitionApi* | [**getAttribute**](docs/CategoryAttributeDefinitionApi.md#getAttribute) | **GET** /commerce/catalog/admin/categoryattributedefinition/attributes/{attributeFQN} | Get Attribute
*CategoryAttributeDefinitionApi* | [**getAttributeVocabularyValues**](docs/CategoryAttributeDefinitionApi.md#getAttributeVocabularyValues) | **GET** /commerce/catalog/admin/categoryattributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Attribute Vocabulary Values
*CategoryAttributeDefinitionApi* | [**getAttributes**](docs/CategoryAttributeDefinitionApi.md#getAttributes) | **GET** /commerce/catalog/admin/categoryattributedefinition/attributes | Get Attributes
*CategoryAttributeDefinitionApi* | [**updateAttribute**](docs/CategoryAttributeDefinitionApi.md#updateAttribute) | **PUT** /commerce/catalog/admin/categoryattributedefinition/attributes/{attributeFQN} | Update Attribute
*CouponSetsApi* | [**addCouponSet**](docs/CouponSetsApi.md#addCouponSet) | **POST** /commerce/catalog/admin/couponsets | Add Coupon Set
*CouponSetsApi* | [**addCoupons**](docs/CouponSetsApi.md#addCoupons) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes | Add Coupons
*CouponSetsApi* | [**assignDiscount**](docs/CouponSetsApi.md#assignDiscount) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts | Assign Discount to Coupon Set
*CouponSetsApi* | [**deleteCoupon**](docs/CouponSetsApi.md#deleteCoupon) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode} | Delete Coupon
*CouponSetsApi* | [**deleteCouponSet**](docs/CouponSetsApi.md#deleteCouponSet) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode} | Delete Coupon Set
*CouponSetsApi* | [**deleteCoupons**](docs/CouponSetsApi.md#deleteCoupons) | **POST** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/remove | Delete Coupons
*CouponSetsApi* | [**getAssignedDiscounts**](docs/CouponSetsApi.md#getAssignedDiscounts) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts | Get Assigned Discounts
*CouponSetsApi* | [**getCoupon**](docs/CouponSetsApi.md#getCoupon) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes/{couponCode} | Get Coupon
*CouponSetsApi* | [**getCouponSet**](docs/CouponSetsApi.md#getCouponSet) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode} | Get Coupon Set
*CouponSetsApi* | [**getCouponSets**](docs/CouponSetsApi.md#getCouponSets) | **GET** /commerce/catalog/admin/couponsets | Get Coupon Sets
*CouponSetsApi* | [**getCoupons**](docs/CouponSetsApi.md#getCoupons) | **GET** /commerce/catalog/admin/couponsets/{couponSetCode}/couponcodes | Get Coupons
*CouponSetsApi* | [**getUniqueCouponSetCode**](docs/CouponSetsApi.md#getUniqueCouponSetCode) | **GET** /commerce/catalog/admin/couponsets/unique-code | Get Unique Coupon Set Code
*CouponSetsApi* | [**unAssignDiscount**](docs/CouponSetsApi.md#unAssignDiscount) | **DELETE** /commerce/catalog/admin/couponsets/{couponSetCode}/assigneddiscounts/{discountId} | Unassign Discount from Coupon Set
*CouponSetsApi* | [**updateCouponSet**](docs/CouponSetsApi.md#updateCouponSet) | **PUT** /commerce/catalog/admin/couponsets/{couponSetCode} | Update Coupon Set
*CouponSetsApi* | [**validateUniqueCouponSetCode**](docs/CouponSetsApi.md#validateUniqueCouponSetCode) | **POST** /commerce/catalog/admin/couponsets/validate-unique-code | Validate Unique Coupon Set Code
*CurrencyApi* | [**addCurrencyExchangeRates**](docs/CurrencyApi.md#addCurrencyExchangeRates) | **POST** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Update Currency Exchange Rates
*CurrencyApi* | [**addCurrencyLocalization**](docs/CurrencyApi.md#addCurrencyLocalization) | **POST** /commerce/catalog/admin/currency | Add Currency Localization
*CurrencyApi* | [**deleteCurrencyExchangeRate**](docs/CurrencyApi.md#deleteCurrencyExchangeRate) | **DELETE** /commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode} | Delete Currency Exchange Rate
*CurrencyApi* | [**deleteCurrencyLocalization**](docs/CurrencyApi.md#deleteCurrencyLocalization) | **DELETE** /commerce/catalog/admin/currency/{currencyCode} | Delete Currency Localization
*CurrencyApi* | [**getCurrencyExchangeRate**](docs/CurrencyApi.md#getCurrencyExchangeRate) | **GET** /commerce/catalog/admin/currency/{currencyCode}/exchangerates/{toCurrencyCode} | Get Currency Exchange Rate
*CurrencyApi* | [**getCurrencyExchangeRates**](docs/CurrencyApi.md#getCurrencyExchangeRates) | **GET** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Get Currency Exchange Rates
*CurrencyApi* | [**getCurrencyLocalization**](docs/CurrencyApi.md#getCurrencyLocalization) | **GET** /commerce/catalog/admin/currency/{currencyCode} | Get Currency Localization
*CurrencyApi* | [**getCurrencyLocalizations**](docs/CurrencyApi.md#getCurrencyLocalizations) | **GET** /commerce/catalog/admin/currency | Get Currency Localizations
*CurrencyApi* | [**updateCurrencyExchangeRates**](docs/CurrencyApi.md#updateCurrencyExchangeRates) | **PUT** /commerce/catalog/admin/currency/{currencyCode}/exchangerates | Bulk Update Currency Exchange Rates
*CurrencyApi* | [**updateCurrencyLocalization**](docs/CurrencyApi.md#updateCurrencyLocalization) | **PUT** /commerce/catalog/admin/currency/{currencyCode} | Update Currency Localization
*DiscountSettingsApi* | [**getDiscountSettings**](docs/DiscountSettingsApi.md#getDiscountSettings) | **GET** /commerce/catalog/admin/discountsettings/{catalogId} | Get Discount Settings
*DiscountSettingsApi* | [**updateDiscountSettings**](docs/DiscountSettingsApi.md#updateDiscountSettings) | **PUT** /commerce/catalog/admin/discountsettings/{catalogId} | Update Discount Settings
*DiscountsApi* | [**createDiscount**](docs/DiscountsApi.md#createDiscount) | **POST** /commerce/catalog/admin/discounts | Create Discount
*DiscountsApi* | [**deleteDiscount**](docs/DiscountsApi.md#deleteDiscount) | **DELETE** /commerce/catalog/admin/discounts/{discountId} | Delete Discount
*DiscountsApi* | [**generateRandomCoupon**](docs/DiscountsApi.md#generateRandomCoupon) | **GET** /commerce/catalog/admin/discounts/generate-random-coupon | Generate Random Coupon
*DiscountsApi* | [**getDiscount**](docs/DiscountsApi.md#getDiscount) | **GET** /commerce/catalog/admin/discounts/{discountId} | Get Discount
*DiscountsApi* | [**getDiscountContent**](docs/DiscountsApi.md#getDiscountContent) | **GET** /commerce/catalog/admin/discounts/{discountId}/content | Get Discount Content
*DiscountsApi* | [**getDiscountTarget**](docs/DiscountsApi.md#getDiscountTarget) | **GET** /commerce/catalog/admin/discounts/{discountId}/target | Get Discount Target
*DiscountsApi* | [**getDiscounts**](docs/DiscountsApi.md#getDiscounts) | **GET** /commerce/catalog/admin/discounts | Get Discounts
*DiscountsApi* | [**getTags**](docs/DiscountsApi.md#getTags) | **GET** /commerce/catalog/admin/discounts/{discountId}/tags | Get Discount Tags
*DiscountsApi* | [**updateDiscount**](docs/DiscountsApi.md#updateDiscount) | **PUT** /commerce/catalog/admin/discounts/{discountId} | Update Discount
*DiscountsApi* | [**updateDiscountContent**](docs/DiscountsApi.md#updateDiscountContent) | **PUT** /commerce/catalog/admin/discounts/{discountId}/content | Update Discount Content
*DiscountsApi* | [**updateDiscountTags**](docs/DiscountsApi.md#updateDiscountTags) | **PUT** /commerce/catalog/admin/discounts/tags | Update Discount Tags
*DiscountsApi* | [**updateDiscountTarget**](docs/DiscountsApi.md#updateDiscountTarget) | **PUT** /commerce/catalog/admin/discounts/{discountId}/target | Update Discount Target
*DiscountsApi* | [**validateDiscountExpression**](docs/DiscountsApi.md#validateDiscountExpression) | **POST** /commerce/catalog/admin/discounts/expressions/validate | Validate Discount Expression
*FacetsApi* | [**addFacet**](docs/FacetsApi.md#addFacet) | **POST** /commerce/catalog/admin/facets | Add Facet
*FacetsApi* | [**deleteFacetById**](docs/FacetsApi.md#deleteFacetById) | **DELETE** /commerce/catalog/admin/facets/{facetId} | Delete Facet
*FacetsApi* | [**getFacet**](docs/FacetsApi.md#getFacet) | **GET** /commerce/catalog/admin/facets/{facetId} | Get Facet
*FacetsApi* | [**getFacetCategoryList**](docs/FacetsApi.md#getFacetCategoryList) | **GET** /commerce/catalog/admin/facets/category | Get Facet Category List
*FacetsApi* | [**getFacetCategoryListLegacy**](docs/FacetsApi.md#getFacetCategoryListLegacy) | **GET** /commerce/catalog/admin/facets/category/{categoryId} | Get Facet Category List (Legacy)
*FacetsApi* | [**getFacets**](docs/FacetsApi.md#getFacets) | **GET** /commerce/catalog/admin/facets | Get facets
*FacetsApi* | [**updateFacet**](docs/FacetsApi.md#updateFacet) | **PUT** /commerce/catalog/admin/facets/{facetId} | Update Facet
*FacetsApi* | [**updateFacetSet**](docs/FacetsApi.md#updateFacetSet) | **POST** /commerce/catalog/admin/facets/set/edit | Update Facet Set
*FutureShipmentRebalancingRulesApi* | [**createRule**](docs/FutureShipmentRebalancingRulesApi.md#createRule) | **POST** /commerce/rules/futureshipmentrebalancing | Create future shipment rebalancing rule
*FutureShipmentRebalancingRulesApi* | [**deleteRule**](docs/FutureShipmentRebalancingRulesApi.md#deleteRule) | **DELETE** /commerce/rules/futureshipmentrebalancing/{code} | Delete future shipment rebalancing rule
*FutureShipmentRebalancingRulesApi* | [**getRule**](docs/FutureShipmentRebalancingRulesApi.md#getRule) | **GET** /commerce/rules/futureshipmentrebalancing/{code} | Get future shipment rebalancing rule by code
*FutureShipmentRebalancingRulesApi* | [**getRules**](docs/FutureShipmentRebalancingRulesApi.md#getRules) | **GET** /commerce/rules/futureshipmentrebalancing | Get future shipment rebalancing rules
*FutureShipmentRebalancingRulesApi* | [**updateRank**](docs/FutureShipmentRebalancingRulesApi.md#updateRank) | **PUT** /commerce/rules/futureshipmentrebalancing/{code}/rank | Update future shipment rebalancing rule rank
*FutureShipmentRebalancingRulesApi* | [**updateRule**](docs/FutureShipmentRebalancingRulesApi.md#updateRule) | **PUT** /commerce/rules/futureshipmentrebalancing/{code} | Update future shipment rebalancing rule
*MasterCatalogPublishSettingsApi* | [**getMasterCatalog**](docs/MasterCatalogPublishSettingsApi.md#getMasterCatalog) | **GET** /commerce/catalog/admin/mastercatalogs/{masterCatalogId} | Get Master Catalog
*MasterCatalogPublishSettingsApi* | [**getMasterCatalogs**](docs/MasterCatalogPublishSettingsApi.md#getMasterCatalogs) | **GET** /commerce/catalog/admin/mastercatalogs | Get Master Catalogs
*MasterCatalogPublishSettingsApi* | [**updateMasterCatalog**](docs/MasterCatalogPublishSettingsApi.md#updateMasterCatalog) | **PUT** /commerce/catalog/admin/mastercatalogs/{masterCatalogId} | Update Master Catalog
*PickWaveRuleEvaluateApi* | [**evaluatePickWaveRule**](docs/PickWaveRuleEvaluateApi.md#evaluatePickWaveRule) | **POST** /commerce/rules/pickwave/evaluate | Evaluate Pick Wave Rules
*PickWaveRulesApi* | [**createPickWaveRule**](docs/PickWaveRulesApi.md#createPickWaveRule) | **POST** /commerce/rules/pickwave | Create Pick Wave Rule
*PickWaveRulesApi* | [**deletePickWaveRule**](docs/PickWaveRulesApi.md#deletePickWaveRule) | **DELETE** /commerce/rules/pickwave/{code} | Delete Pick Wave Rule
*PickWaveRulesApi* | [**getPickWaveRule**](docs/PickWaveRulesApi.md#getPickWaveRule) | **GET** /commerce/rules/pickwave/{code} | Get Pick Wave Rule by Code
*PickWaveRulesApi* | [**getPickWaveRules**](docs/PickWaveRulesApi.md#getPickWaveRules) | **GET** /commerce/rules/pickwave | Get Pick Wave Rules
*PickWaveRulesApi* | [**updatePickWaveRule**](docs/PickWaveRulesApi.md#updatePickWaveRule) | **PUT** /commerce/rules/pickwave/{code} | Update Pick Wave Rule
*PriceListEntriesApi* | [**addPriceListEntry**](docs/PriceListEntriesApi.md#addPriceListEntry) | **POST** /commerce/catalog/admin/pricelists/{priceListCode}/entries | Add Price List Entry
*PriceListEntriesApi* | [**bulkAddPriceListEntries**](docs/PriceListEntriesApi.md#bulkAddPriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkaddentries | Bulk Add Price List Entries
*PriceListEntriesApi* | [**bulkDeletePriceListEntries**](docs/PriceListEntriesApi.md#bulkDeletePriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkdeleteentries | Bulk Delete Price List Entries
*PriceListEntriesApi* | [**bulkUpdatePriceListEntries**](docs/PriceListEntriesApi.md#bulkUpdatePriceListEntries) | **POST** /commerce/catalog/admin/pricelists/bulkupdateentries | Bulk Update Price List Entries.
*PriceListEntriesApi* | [**deletePriceListEntry**](docs/PriceListEntriesApi.md#deletePriceListEntry) | **DELETE** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Delete Price List Entry by Currency
*PriceListEntriesApi* | [**getPriceListEntries**](docs/PriceListEntriesApi.md#getPriceListEntries) | **GET** /commerce/catalog/admin/pricelists/{priceListCode}/entries | Get Price List Entries
*PriceListEntriesApi* | [**getPriceListEntry**](docs/PriceListEntriesApi.md#getPriceListEntry) | **GET** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Get Price List Entries by Currency
*PriceListEntriesApi* | [**updatePriceListEntry**](docs/PriceListEntriesApi.md#updatePriceListEntry) | **PUT** /commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode} | Update Price List Entry by Currency
*PriceListsApi* | [**addPriceList**](docs/PriceListsApi.md#addPriceList) | **POST** /commerce/catalog/admin/pricelists | Add Price List
*PriceListsApi* | [**deletePriceList**](docs/PriceListsApi.md#deletePriceList) | **DELETE** /commerce/catalog/admin/pricelists/{priceListCode} | Delete Price List
*PriceListsApi* | [**getPriceList**](docs/PriceListsApi.md#getPriceList) | **GET** /commerce/catalog/admin/pricelists/{priceListCode} | Get Price List
*PriceListsApi* | [**getPriceLists**](docs/PriceListsApi.md#getPriceLists) | **GET** /commerce/catalog/admin/pricelists | Get Price Lists
*PriceListsApi* | [**updatePriceList**](docs/PriceListsApi.md#updatePriceList) | **PUT** /commerce/catalog/admin/pricelists/{priceListCode} | Update Price List
*ProductAttributesApi* | [**addAttribute**](docs/ProductAttributesApi.md#addAttribute) | **POST** /commerce/catalog/admin/attributedefinition/attributes | Add Product Attribute
*ProductAttributesApi* | [**addAttributeVocabularyValue**](docs/ProductAttributesApi.md#addAttributeVocabularyValue) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Add Vocabulary Value
*ProductAttributesApi* | [**addAttributeVocabularyValueLocalizedContent**](docs/ProductAttributesApi.md#addAttributeVocabularyValueLocalizedContent) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Add Vocabulary Value Localized Content
*ProductAttributesApi* | [**addLocalizedContent**](docs/ProductAttributesApi.md#addLocalizedContent) | **POST** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Add Localized Content
*ProductAttributesApi* | [**deleteAttribute**](docs/ProductAttributesApi.md#deleteAttribute) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Delete Product Attribute
*ProductAttributesApi* | [**deleteAttributeVocabularyValue**](docs/ProductAttributesApi.md#deleteAttributeVocabularyValue) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Delete Vocabulary Value
*ProductAttributesApi* | [**deleteAttributeVocabularyValueLocalizedContent**](docs/ProductAttributesApi.md#deleteAttributeVocabularyValueLocalizedContent) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Delete Vocabulary Value Localized Content by Locale Code
*ProductAttributesApi* | [**deleteLocalizedContent**](docs/ProductAttributesApi.md#deleteLocalizedContent) | **DELETE** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Delete Localized Content by Locale Code
*ProductAttributesApi* | [**getAttribute**](docs/ProductAttributesApi.md#getAttribute) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Get Product Attribute
*ProductAttributesApi* | [**getAttributeLocalizedContent**](docs/ProductAttributesApi.md#getAttributeLocalizedContent) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Get Localized Content by Locale Code
*ProductAttributesApi* | [**getAttributeLocalizedContents**](docs/ProductAttributesApi.md#getAttributeLocalizedContents) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Get Localized Content
*ProductAttributesApi* | [**getAttributeTypeRules**](docs/ProductAttributesApi.md#getAttributeTypeRules) | **GET** /commerce/catalog/admin/attributedefinition/attributes/typerules | Get Attribute Type Rules
*ProductAttributesApi* | [**getAttributeVocabularyValue**](docs/ProductAttributesApi.md#getAttributeVocabularyValue) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Get Vocabulary Value
*ProductAttributesApi* | [**getAttributeVocabularyValueLocalizedContent**](docs/ProductAttributesApi.md#getAttributeVocabularyValueLocalizedContent) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Get Vocabulary Value Localized Content by Locale Code
*ProductAttributesApi* | [**getAttributeVocabularyValueLocalizedContents**](docs/ProductAttributesApi.md#getAttributeVocabularyValueLocalizedContents) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Get Vocabulary Value Localized Content
*ProductAttributesApi* | [**getAttributeVocabularyValues**](docs/ProductAttributesApi.md#getAttributeVocabularyValues) | **GET** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Get Vocabulary Values
*ProductAttributesApi* | [**getAttributes**](docs/ProductAttributesApi.md#getAttributes) | **GET** /commerce/catalog/admin/attributedefinition/attributes | Get Product Attributes.
*ProductAttributesApi* | [**updateAttribute**](docs/ProductAttributesApi.md#updateAttribute) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN} | Update Product Attribute
*ProductAttributesApi* | [**updateAttributeVocabularyValue**](docs/ProductAttributesApi.md#updateAttributeVocabularyValue) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value} | Update Vocabulary Value
*ProductAttributesApi* | [**updateAttributeVocabularyValueLocalizedContent**](docs/ProductAttributesApi.md#updateAttributeVocabularyValueLocalizedContent) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent/{localeCode} | Update Vocabulary Value Localized Content by Locale Code
*ProductAttributesApi* | [**updateAttributeVocabularyValueLocalizedContents**](docs/ProductAttributesApi.md#updateAttributeVocabularyValueLocalizedContents) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues/{value}/LocalizedContent | Update Vocabulary Value Localized Content
*ProductAttributesApi* | [**updateAttributeVocabularyValues**](docs/ProductAttributesApi.md#updateAttributeVocabularyValues) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/VocabularyValues | Update Vocabulary Values
*ProductAttributesApi* | [**updateLocalizedContent**](docs/ProductAttributesApi.md#updateLocalizedContent) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent/{localeCode} | Update Localized Content by Locale Code
*ProductAttributesApi* | [**updateLocalizedContents**](docs/ProductAttributesApi.md#updateLocalizedContents) | **PUT** /commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}/LocalizedContent | Update Localized Content
*ProductExtrasApi* | [**addExtra**](docs/ProductExtrasApi.md#addExtra) | **POST** /commerce/catalog/admin/products/{productCode}/Extras | Add Product Extra
*ProductExtrasApi* | [**addExtraValueLocalizedDeltaPrice**](docs/ProductExtrasApi.md#addExtraValueLocalizedDeltaPrice) | **POST** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Add Extra Localized Delta Price
*ProductExtrasApi* | [**deleteExtra**](docs/ProductExtrasApi.md#deleteExtra) | **DELETE** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Delete Product Extra
*ProductExtrasApi* | [**deleteExtraValueLocalizedDeltaPrice**](docs/ProductExtrasApi.md#deleteExtraValueLocalizedDeltaPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Delete Extra Localized Delta Price
*ProductExtrasApi* | [**getExtra**](docs/ProductExtrasApi.md#getExtra) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Get Product Extra
*ProductExtrasApi* | [**getExtraValueLocalizedDeltaPrice**](docs/ProductExtrasApi.md#getExtraValueLocalizedDeltaPrice) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Get Extra Localized Delta Price by Currency
*ProductExtrasApi* | [**getExtraValueLocalizedDeltaPrices**](docs/ProductExtrasApi.md#getExtraValueLocalizedDeltaPrices) | **GET** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Get Extra Localized Delta Price
*ProductExtrasApi* | [**getExtras**](docs/ProductExtrasApi.md#getExtras) | **GET** /commerce/catalog/admin/products/{productCode}/Extras | Get Product Extras
*ProductExtrasApi* | [**updateExtra**](docs/ProductExtrasApi.md#updateExtra) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN} | Update Product Extra
*ProductExtrasApi* | [**updateExtraValueLocalizedDeltaPrice**](docs/ProductExtrasApi.md#updateExtraValueLocalizedDeltaPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice/{currencyCode} | Update Extra Localized Delta Price by Currency
*ProductExtrasApi* | [**updateExtraValueLocalizedDeltaPrices**](docs/ProductExtrasApi.md#updateExtraValueLocalizedDeltaPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/Extras/{attributeFQN}/Values/{value}/localizedDeltaPrice | Update Extra Localized Delta Price
*ProductOptionsApi* | [**addOption**](docs/ProductOptionsApi.md#addOption) | **POST** /commerce/catalog/admin/products/{productCode}/Options | Add Product Option
*ProductOptionsApi* | [**deleteOption**](docs/ProductOptionsApi.md#deleteOption) | **DELETE** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Delete Product Option
*ProductOptionsApi* | [**getOption**](docs/ProductOptionsApi.md#getOption) | **GET** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Get Product Option
*ProductOptionsApi* | [**getOptions**](docs/ProductOptionsApi.md#getOptions) | **GET** /commerce/catalog/admin/products/{productCode}/Options | Get Product Options
*ProductOptionsApi* | [**updateOption**](docs/ProductOptionsApi.md#updateOption) | **PUT** /commerce/catalog/admin/products/{productCode}/Options/{attributeFQN} | Update Product Option
*ProductPropertiesApi* | [**addProperty**](docs/ProductPropertiesApi.md#addProperty) | **POST** /commerce/catalog/admin/products/{productCode}/Properties | Add Product Property
*ProductPropertiesApi* | [**addPropertyValueLocalizedContent**](docs/ProductPropertiesApi.md#addPropertyValueLocalizedContent) | **POST** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Add Product Property Localized Content
*ProductPropertiesApi* | [**deleteProperty**](docs/ProductPropertiesApi.md#deleteProperty) | **DELETE** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Delete Product Property
*ProductPropertiesApi* | [**deletePropertyValueLocalizedContent**](docs/ProductPropertiesApi.md#deletePropertyValueLocalizedContent) | **DELETE** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Delete Product Property Localized Content by Locale
*ProductPropertiesApi* | [**getProperties**](docs/ProductPropertiesApi.md#getProperties) | **GET** /commerce/catalog/admin/products/{productCode}/Properties | Get Product Properties
*ProductPropertiesApi* | [**getProperty**](docs/ProductPropertiesApi.md#getProperty) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Get Product Property
*ProductPropertiesApi* | [**getPropertyValueLocalizedContent**](docs/ProductPropertiesApi.md#getPropertyValueLocalizedContent) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Get Product Property Localized Content by Locale
*ProductPropertiesApi* | [**getPropertyValueLocalizedContents**](docs/ProductPropertiesApi.md#getPropertyValueLocalizedContents) | **GET** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Get Product Property Localized Contents
*ProductPropertiesApi* | [**updateProperty**](docs/ProductPropertiesApi.md#updateProperty) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN} | Update Product Property
*ProductPropertiesApi* | [**updatePropertyValueLocalizedContent**](docs/ProductPropertiesApi.md#updatePropertyValueLocalizedContent) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode} | Update Product Property Localized Content by Locale
*ProductPropertiesApi* | [**updatePropertyValueLocalizedContents**](docs/ProductPropertiesApi.md#updatePropertyValueLocalizedContents) | **PUT** /commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent | Update Product Property Localized Content
*ProductPublishingApi* | [**assignProductsToPublishSet**](docs/ProductPublishingApi.md#assignProductsToPublishSet) | **POST** /commerce/catalog/admin/publishing/publishsets | Assign Products to Publish Sets
*ProductPublishingApi* | [**deletePublishSet**](docs/ProductPublishingApi.md#deletePublishSet) | **DELETE** /commerce/catalog/admin/publishing/publishsets/{publishSetCode} | Delete Publish Set
*ProductPublishingApi* | [**getPublishSet**](docs/ProductPublishingApi.md#getPublishSet) | **GET** /commerce/catalog/admin/publishing/publishsets/{publishSetCode} | Get Publish Set
*ProductPublishingApi* | [**getPublishSets**](docs/ProductPublishingApi.md#getPublishSets) | **GET** /commerce/catalog/admin/publishing/publishsets | Get Publish Sets
*ProductPublishingApi* | [**publishDrafts**](docs/ProductPublishingApi.md#publishDrafts) | **POST** /commerce/catalog/admin/publishing/publishdrafts | Publish Draft Products
*ProductQuickEditApi* | [**updateProductInCatalog**](docs/ProductQuickEditApi.md#updateProductInCatalog) | **POST** /commerce/catalog/admin/quickedit/products/productincatalog | Quick Edit Product in Catalog
*ProductQuickEditApi* | [**updateProductProperties**](docs/ProductQuickEditApi.md#updateProductProperties) | **POST** /commerce/catalog/admin/quickedit/products/properties | Quick Edit Properties
*ProductQuickEditApi* | [**updateProductType**](docs/ProductQuickEditApi.md#updateProductType) | **POST** /commerce/catalog/admin/quickedit/products/producttype | Endpoint used to apply updates for product type
*ProductQuickEditApi* | [**updateProducts**](docs/ProductQuickEditApi.md#updateProducts) | **POST** /commerce/catalog/admin/quickedit/products | Quick Edit Products
*ProductRuleUsagesApi* | [**getProductRuleUsages**](docs/ProductRuleUsagesApi.md#getProductRuleUsages) | **GET** /commerce/rules/product/{code}/usages | Get Product Rule Usages
*ProductRulesApi* | [**createProductRule**](docs/ProductRulesApi.md#createProductRule) | **POST** /commerce/rules/product | Create Product Rule
*ProductRulesApi* | [**deleteProductRule**](docs/ProductRulesApi.md#deleteProductRule) | **DELETE** /commerce/rules/product/{code} | Delete Product Rules
*ProductRulesApi* | [**getExpressionFieldDefinitions**](docs/ProductRulesApi.md#getExpressionFieldDefinitions) | **GET** /commerce/rules/product/product-rule-fields | Get Expression Field Definition
*ProductRulesApi* | [**getProductRule**](docs/ProductRulesApi.md#getProductRule) | **GET** /commerce/rules/product/{code} | Get Product Rule by Code
*ProductRulesApi* | [**getProductRules**](docs/ProductRulesApi.md#getProductRules) | **GET** /commerce/rules/product | Get Product Rules
*ProductRulesApi* | [**updateProductRule**](docs/ProductRulesApi.md#updateProductRule) | **PUT** /commerce/rules/product/{code} | Update Product Rule
*ProductRulesApi* | [**validateExpression**](docs/ProductRulesApi.md#validateExpression) | **POST** /commerce/rules/product/validate | Validate Expression
*ProductTypesApi* | [**addExtra**](docs/ProductTypesApi.md#addExtra) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras | Add Product Type Extra
*ProductTypesApi* | [**addOption**](docs/ProductTypesApi.md#addOption) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options | Add Product Type Option
*ProductTypesApi* | [**addProductType**](docs/ProductTypesApi.md#addProductType) | **POST** /commerce/catalog/admin/attributedefinition/producttypes | Add Product Type
*ProductTypesApi* | [**addProperty**](docs/ProductTypesApi.md#addProperty) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties | Add Product Type Property
*ProductTypesApi* | [**addVariantProperty**](docs/ProductTypesApi.md#addVariantProperty) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties | Add Variant Product Type Property
*ProductTypesApi* | [**deleteExtra**](docs/ProductTypesApi.md#deleteExtra) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN} | Delete Product Type Extra
*ProductTypesApi* | [**deleteOption**](docs/ProductTypesApi.md#deleteOption) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN} | Delete Product Type Option
*ProductTypesApi* | [**deleteProductType**](docs/ProductTypesApi.md#deleteProductType) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId} | Delete Product Type
*ProductTypesApi* | [**deleteProperty**](docs/ProductTypesApi.md#deleteProperty) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN} | Delete Product Type Property
*ProductTypesApi* | [**deleteVariantProperty**](docs/ProductTypesApi.md#deleteVariantProperty) | **DELETE** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN} | Delete Variant Product Type Property
*ProductTypesApi* | [**generateProductVariations**](docs/ProductTypesApi.md#generateProductVariations) | **POST** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/variations | Generate Product Variations
*ProductTypesApi* | [**getExtra**](docs/ProductTypesApi.md#getExtra) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN} | Get Product Type Extra
*ProductTypesApi* | [**getExtras**](docs/ProductTypesApi.md#getExtras) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras | Get Product Type Extras
*ProductTypesApi* | [**getOption**](docs/ProductTypesApi.md#getOption) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN} | Get Product Type Option
*ProductTypesApi* | [**getOptions**](docs/ProductTypesApi.md#getOptions) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options | Get Product Type Options
*ProductTypesApi* | [**getProductType**](docs/ProductTypesApi.md#getProductType) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId} | Get Product Type
*ProductTypesApi* | [**getProductTypes**](docs/ProductTypesApi.md#getProductTypes) | **GET** /commerce/catalog/admin/attributedefinition/producttypes | Get Product Types
*ProductTypesApi* | [**getProperties**](docs/ProductTypesApi.md#getProperties) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties | Get Product Type Properties
*ProductTypesApi* | [**getProperty**](docs/ProductTypesApi.md#getProperty) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN} | Get Product Type Property
*ProductTypesApi* | [**getVariantProperties**](docs/ProductTypesApi.md#getVariantProperties) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties | Get Variant Product Type Properties
*ProductTypesApi* | [**getVariantProperty**](docs/ProductTypesApi.md#getVariantProperty) | **GET** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN} | Get Variant Product Type Property
*ProductTypesApi* | [**updateExtra**](docs/ProductTypesApi.md#updateExtra) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Extras/{attributeFQN} | Update Product Type Extra
*ProductTypesApi* | [**updateOption**](docs/ProductTypesApi.md#updateOption) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Options/{attributeFQN} | Update Product Type Option
*ProductTypesApi* | [**updateProductType**](docs/ProductTypesApi.md#updateProductType) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId} | Update Product Type
*ProductTypesApi* | [**updateProperty**](docs/ProductTypesApi.md#updateProperty) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/Properties/{attributeFQN} | Update Product Type Property
*ProductTypesApi* | [**updateVariantProperty**](docs/ProductTypesApi.md#updateVariantProperty) | **PUT** /commerce/catalog/admin/attributedefinition/producttypes/{productTypeId}/VariantProperties/{attributeFQN} | Update Variant Product Type Property
*ProductVariationsApi* | [**addProductVariationLocalizedDeltaPrice**](docs/ProductVariationsApi.md#addProductVariationLocalizedDeltaPrice) | **POST** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Add Product Variation Localized Delta Price
*ProductVariationsApi* | [**addProductVariationLocalizedPrice**](docs/ProductVariationsApi.md#addProductVariationLocalizedPrice) | **POST** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Add Product Variation Localized Price
*ProductVariationsApi* | [**deleteProductVariation**](docs/ProductVariationsApi.md#deleteProductVariation) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Delete Product Variation
*ProductVariationsApi* | [**deleteProductVariationLocalizedDeltaPrice**](docs/ProductVariationsApi.md#deleteProductVariationLocalizedDeltaPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Delete Product Variation Localized Delta Price
*ProductVariationsApi* | [**deleteProductVariationLocalizedPrice**](docs/ProductVariationsApi.md#deleteProductVariationLocalizedPrice) | **DELETE** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Delete Product Variation Localized Price by Currency
*ProductVariationsApi* | [**getProductVariation**](docs/ProductVariationsApi.md#getProductVariation) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Get Product Variation
*ProductVariationsApi* | [**getProductVariationLocalizedDeltaPrice**](docs/ProductVariationsApi.md#getProductVariationLocalizedDeltaPrice) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Get Product Variation Localized Delta Price
*ProductVariationsApi* | [**getProductVariationLocalizedDeltaPrices**](docs/ProductVariationsApi.md#getProductVariationLocalizedDeltaPrices) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Get Product Variation Localized Delta Prices
*ProductVariationsApi* | [**getProductVariationLocalizedPrice**](docs/ProductVariationsApi.md#getProductVariationLocalizedPrice) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Get Product Variation Localized Price by Currency
*ProductVariationsApi* | [**getProductVariationLocalizedPrices**](docs/ProductVariationsApi.md#getProductVariationLocalizedPrices) | **GET** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Get Product Variation Localized Prices
*ProductVariationsApi* | [**getProductVariations**](docs/ProductVariationsApi.md#getProductVariations) | **GET** /commerce/catalog/admin/products/{productCode}/variations | Get Product Variations
*ProductVariationsApi* | [**updateProductVariation**](docs/ProductVariationsApi.md#updateProductVariation) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey} | Update Product Variation
*ProductVariationsApi* | [**updateProductVariationLocalizedDeltaPrice**](docs/ProductVariationsApi.md#updateProductVariationLocalizedDeltaPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice/{currencyCode} | Update Product Variation Localized Delta Price
*ProductVariationsApi* | [**updateProductVariationLocalizedDeltaPrices**](docs/ProductVariationsApi.md#updateProductVariationLocalizedDeltaPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedDeltaPrice | Update Product Variation Localized Delta Prices
*ProductVariationsApi* | [**updateProductVariationLocalizedPrice**](docs/ProductVariationsApi.md#updateProductVariationLocalizedPrice) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice/{currencyCode} | Update Product Variation Localized Price by Currency
*ProductVariationsApi* | [**updateProductVariationLocalizedPrices**](docs/ProductVariationsApi.md#updateProductVariationLocalizedPrices) | **PUT** /commerce/catalog/admin/products/{productCode}/variations/{variationKey}/localizedPrice | Update Product Variation Localized Prices
*ProductVariationsApi* | [**updateProductVariations**](docs/ProductVariationsApi.md#updateProductVariations) | **PUT** /commerce/catalog/admin/products/{productCode}/variations | Update Product Variations
*ProductsApi* | [**addProduct**](docs/ProductsApi.md#addProduct) | **POST** /commerce/catalog/admin/products | Add Product
*ProductsApi* | [**addProductInCatalog**](docs/ProductsApi.md#addProductInCatalog) | **POST** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Add Product in Catalogs
*ProductsApi* | [**changeProductType**](docs/ProductsApi.md#changeProductType) | **POST** /commerce/catalog/admin/products/{productCode}/changeproducttype | Change product type.
*ProductsApi* | [**deleteProduct**](docs/ProductsApi.md#deleteProduct) | **DELETE** /commerce/catalog/admin/products/{productCode} | Delete Product
*ProductsApi* | [**deleteProductInCatalog**](docs/ProductsApi.md#deleteProductInCatalog) | **DELETE** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Delete Product in Catalog
*ProductsApi* | [**getProduct**](docs/ProductsApi.md#getProduct) | **GET** /commerce/catalog/admin/products/{productCode} | Get Product
*ProductsApi* | [**getProductInCatalog**](docs/ProductsApi.md#getProductInCatalog) | **GET** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Get Product in Catalog
*ProductsApi* | [**getProductInCatalogs**](docs/ProductsApi.md#getProductInCatalogs) | **GET** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Get Products in Catalogs
*ProductsApi* | [**getProducts**](docs/ProductsApi.md#getProducts) | **GET** /commerce/catalog/admin/products | Get Products
*ProductsApi* | [**renameProductCodes**](docs/ProductsApi.md#renameProductCodes) | **POST** /commerce/catalog/admin/products/Actions/RenameProductCodes | Rename Product Codes
*ProductsApi* | [**updateProduct**](docs/ProductsApi.md#updateProduct) | **PUT** /commerce/catalog/admin/products/{productCode} | Update Product
*ProductsApi* | [**updateProductInCatalog**](docs/ProductsApi.md#updateProductInCatalog) | **PUT** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs/{catalogId} | Update Product in Catalog
*ProductsApi* | [**updateProductInCatalogs**](docs/ProductsApi.md#updateProductInCatalogs) | **PUT** /commerce/catalog/admin/products/{productCode}/ProductInCatalogs | Update Product in Catalogs
*ProductsV1Api* | [**addProduct2**](docs/ProductsV1Api.md#addProduct2) | **POST** /commerce/catalog/admin/productsV1 | Add Product
*ProductsV1Api* | [**addProductInCatalog1**](docs/ProductsV1Api.md#addProductInCatalog1) | **POST** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs | Add Product in Catalogs
*ProductsV1Api* | [**getProduct5**](docs/ProductsV1Api.md#getProduct5) | **GET** /commerce/catalog/admin/productsV1/{productCode} | Get Product
*ProductsV1Api* | [**getProductInCatalog3**](docs/ProductsV1Api.md#getProductInCatalog3) | **GET** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs/{catalogId} | Get Product in Catalog
*ProductsV1Api* | [**getProductInCatalogs4**](docs/ProductsV1Api.md#getProductInCatalogs4) | **GET** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs | Get Products in Catalogs
*ProductsV1Api* | [**getProducts6**](docs/ProductsV1Api.md#getProducts6) | **GET** /commerce/catalog/admin/productsV1 | Get Products
*ProductsV1Api* | [**updateProduct9**](docs/ProductsV1Api.md#updateProduct9) | **PUT** /commerce/catalog/admin/productsV1/{productCode} | Update Product
*ProductsV1Api* | [**updateProductInCatalog7**](docs/ProductsV1Api.md#updateProductInCatalog7) | **PUT** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs/{catalogId} | Update Product in Catalog
*ProductsV1Api* | [**updateProductInCatalogs8**](docs/ProductsV1Api.md#updateProductInCatalogs8) | **PUT** /commerce/catalog/admin/productsV1/{productCode}/ProductInCatalogs | Update Products in Catalogs
*PublishingApi* | [**discardDrafts**](docs/PublishingApi.md#discardDrafts) | **POST** /commerce/catalog/admin/publishing/discarddrafts | Discard Drafts
*PurchaseLimitRulesApi* | [**createPurchaseLimitRule**](docs/PurchaseLimitRulesApi.md#createPurchaseLimitRule) | **POST** /commerce/rules/purchaselimit | Create Purchase Limit Rule
*PurchaseLimitRulesApi* | [**deletePurchaseLimitRule**](docs/PurchaseLimitRulesApi.md#deletePurchaseLimitRule) | **DELETE** /commerce/rules/purchaselimit/{code} | Delete Purchase Limit Rule
*PurchaseLimitRulesApi* | [**getPurchaseLimitRule**](docs/PurchaseLimitRulesApi.md#getPurchaseLimitRule) | **GET** /commerce/rules/purchaselimit/{code} | Get Purchase Limit Rule by Code
*PurchaseLimitRulesApi* | [**getPurchaseLimitRules**](docs/PurchaseLimitRulesApi.md#getPurchaseLimitRules) | **GET** /commerce/rules/purchaselimit | Get Purchase Limit Rules
*PurchaseLimitRulesApi* | [**updatePurchaseLimitRule**](docs/PurchaseLimitRulesApi.md#updatePurchaseLimitRule) | **PUT** /commerce/rules/purchaselimit/{code} | Update Purchase Limit Rule
*PurchaseLimitRulesApi* | [**updateRank**](docs/PurchaseLimitRulesApi.md#updateRank) | **PUT** /commerce/rules/purchaselimit/{code}/rank | Update Purchase Limit Rule Rank
*ReservationRulesApi* | [**createReservationRule**](docs/ReservationRulesApi.md#createReservationRule) | **POST** /commerce/rules/reservation | Create reservation rule
*ReservationRulesApi* | [**deleteReservationRule**](docs/ReservationRulesApi.md#deleteReservationRule) | **DELETE** /commerce/rules/reservation/{code} | Delete reservation rule
*ReservationRulesApi* | [**getReservationRule**](docs/ReservationRulesApi.md#getReservationRule) | **GET** /commerce/rules/reservation/{code} | Get reservation rule by code
*ReservationRulesApi* | [**getReservationRules**](docs/ReservationRulesApi.md#getReservationRules) | **GET** /commerce/rules/reservation | Get reservation rules
*ReservationRulesApi* | [**updateRank**](docs/ReservationRulesApi.md#updateRank) | **PUT** /commerce/rules/reservation/{code}/rank | Update reservation rule rank
*ReservationRulesApi* | [**updateReservationRule**](docs/ReservationRulesApi.md#updateReservationRule) | **PUT** /commerce/rules/reservation/{code} | Update reservation rule
*ReservationStealForRulesApi* | [**createReservationStealForRule**](docs/ReservationStealForRulesApi.md#createReservationStealForRule) | **POST** /commerce/rules/reservationstealfor | Create reservation steal-for rule
*ReservationStealForRulesApi* | [**deleteReservationStealForRule**](docs/ReservationStealForRulesApi.md#deleteReservationStealForRule) | **DELETE** /commerce/rules/reservationstealfor/{code} | Delete reservation steal-for rule
*ReservationStealForRulesApi* | [**getReservationStealForRule**](docs/ReservationStealForRulesApi.md#getReservationStealForRule) | **GET** /commerce/rules/reservationstealfor/{code} | Get reservation steal-for rule by code
*ReservationStealForRulesApi* | [**getReservationStealForRules**](docs/ReservationStealForRulesApi.md#getReservationStealForRules) | **GET** /commerce/rules/reservationstealfor | Get reservation steal-for rules
*ReservationStealForRulesApi* | [**updateRank**](docs/ReservationStealForRulesApi.md#updateRank) | **PUT** /commerce/rules/reservationstealfor/{code}/rank | Update reservation steal-for rule rank
*ReservationStealForRulesApi* | [**updateReservationStealForRule**](docs/ReservationStealForRulesApi.md#updateReservationStealForRule) | **PUT** /commerce/rules/reservationstealfor/{code} | Update reservation steal-for rule
*ReservationStealFromRulesApi* | [**createReservationStealFromRule**](docs/ReservationStealFromRulesApi.md#createReservationStealFromRule) | **POST** /commerce/rules/reservationstealfrom | Create reservation steal-from rule
*ReservationStealFromRulesApi* | [**deleteReservationStealFromRule**](docs/ReservationStealFromRulesApi.md#deleteReservationStealFromRule) | **DELETE** /commerce/rules/reservationstealfrom/{code} | Delete reservation steal-from rule
*ReservationStealFromRulesApi* | [**getReservationStealFromRule**](docs/ReservationStealFromRulesApi.md#getReservationStealFromRule) | **GET** /commerce/rules/reservationstealfrom/{code} | Get reservation steal-from rule by code
*ReservationStealFromRulesApi* | [**getReservationStealFromRules**](docs/ReservationStealFromRulesApi.md#getReservationStealFromRules) | **GET** /commerce/rules/reservationstealfrom | Get reservation steal-from rules
*ReservationStealFromRulesApi* | [**updateRank**](docs/ReservationStealFromRulesApi.md#updateRank) | **PUT** /commerce/rules/reservationstealfrom/{code}/rank | Update reservation steal-from rule rank
*ReservationStealFromRulesApi* | [**updateReservationStealFromRule**](docs/ReservationStealFromRulesApi.md#updateReservationStealFromRule) | **PUT** /commerce/rules/reservationstealfrom/{code} | Update reservation steal-from rule
*ReturnRulesApi* | [**createReturnRule**](docs/ReturnRulesApi.md#createReturnRule) | **POST** /commerce/rules/return | Create Return Rule
*ReturnRulesApi* | [**deleteReturnRule**](docs/ReturnRulesApi.md#deleteReturnRule) | **DELETE** /commerce/rules/return/{code} | Delete Return Rule
*ReturnRulesApi* | [**getReturnRule**](docs/ReturnRulesApi.md#getReturnRule) | **GET** /commerce/rules/return/{code} | Get Return Rule by Code
*ReturnRulesApi* | [**getReturnRules**](docs/ReturnRulesApi.md#getReturnRules) | **GET** /commerce/rules/return | Get Return Rules
*ReturnRulesApi* | [**updateRank**](docs/ReturnRulesApi.md#updateRank) | **PUT** /commerce/rules/return/{code}/rank | Update Return Rule Rank
*ReturnRulesApi* | [**updateReturnRule**](docs/ReturnRulesApi.md#updateReturnRule) | **PUT** /commerce/rules/return/{code} | Update Return Rule
*RulesEngineJobsApi* | [**createJob**](docs/RulesEngineJobsApi.md#createJob) | **POST** /commerce/rules/jobs | Create rules engine job
*SafetyStockRulesApi* | [**createSafetyStockRule**](docs/SafetyStockRulesApi.md#createSafetyStockRule) | **POST** /commerce/rules/safetystock | Create Safety Stock Rule
*SafetyStockRulesApi* | [**deleteSafetyStockRule**](docs/SafetyStockRulesApi.md#deleteSafetyStockRule) | **DELETE** /commerce/rules/safetystock/{code} | Delete Safety Stock Rule
*SafetyStockRulesApi* | [**getSafetyStockRule**](docs/SafetyStockRulesApi.md#getSafetyStockRule) | **GET** /commerce/rules/safetystock/{code} | Get Safety Stock Rule by Code
*SafetyStockRulesApi* | [**getSafetyStockRules**](docs/SafetyStockRulesApi.md#getSafetyStockRules) | **GET** /commerce/rules/safetystock | Get Safety Stock Rules
*SafetyStockRulesApi* | [**updateRank**](docs/SafetyStockRulesApi.md#updateRank) | **PUT** /commerce/rules/safetystock/{code}/rank | Update Safety Stock Rule Rank
*SafetyStockRulesApi* | [**updateSafetyStockRule**](docs/SafetyStockRulesApi.md#updateSafetyStockRule) | **PUT** /commerce/rules/safetystock/{code} | Update Safety Stock Rule
*SearchCategorySuggestSettingsApi* | [**deleteCategorySuggestSettings**](docs/SearchCategorySuggestSettingsApi.md#deleteCategorySuggestSettings) | **DELETE** /commerce/catalog/admin/search/{name}/categorysuggestsettings | Delete Category Suggest Settings
*SearchCategorySuggestSettingsApi* | [**getCategorySuggestSettings**](docs/SearchCategorySuggestSettingsApi.md#getCategorySuggestSettings) | **GET** /commerce/catalog/admin/search/{name}/categorysuggestsettings | Get Category Suggest Settings
*SearchCategorySuggestSettingsApi* | [**updateCategorySuggestSettings**](docs/SearchCategorySuggestSettingsApi.md#updateCategorySuggestSettings) | **PUT** /commerce/catalog/admin/search/{name}/categorysuggestsettings | Update Category Suggest Settings
*SearchListingSettingsApi* | [**deleteListingSettings**](docs/SearchListingSettingsApi.md#deleteListingSettings) | **DELETE** /commerce/catalog/admin/search/{name}/listingsettings | Delete Search Listing Settings
*SearchListingSettingsApi* | [**getListingSettings**](docs/SearchListingSettingsApi.md#getListingSettings) | **GET** /commerce/catalog/admin/search/{name}/listingsettings | Get Search Listing Settings
*SearchListingSettingsApi* | [**updateListingSettings**](docs/SearchListingSettingsApi.md#updateListingSettings) | **PUT** /commerce/catalog/admin/search/{name}/listingsettings | Update Search Listing Settings
*SearchMerchandizingRuleApi* | [**cloneSearchMerchandizingRule**](docs/SearchMerchandizingRuleApi.md#cloneSearchMerchandizingRule) | **GET** /commerce/catalog/admin/searchmerchandizingrules/{code}/clone | Clone Search Merchandizing Rule
*SearchMerchandizingRuleApi* | [**createSearchMerchandizingRule**](docs/SearchMerchandizingRuleApi.md#createSearchMerchandizingRule) | **POST** /commerce/catalog/admin/searchmerchandizingrules | Create Search Merchandizing Rule
*SearchMerchandizingRuleApi* | [**deleteSearchMerchandizingRule**](docs/SearchMerchandizingRuleApi.md#deleteSearchMerchandizingRule) | **DELETE** /commerce/catalog/admin/searchmerchandizingrules/{code} | Delete Search Merchandizing Rule
*SearchMerchandizingRuleApi* | [**getSearchMerchandizingRule**](docs/SearchMerchandizingRuleApi.md#getSearchMerchandizingRule) | **GET** /commerce/catalog/admin/searchmerchandizingrules/{code} | Get Search Merchandizing Rule
*SearchMerchandizingRuleApi* | [**getSearchMerchandizingRules**](docs/SearchMerchandizingRuleApi.md#getSearchMerchandizingRules) | **GET** /commerce/catalog/admin/searchmerchandizingrules | Get Search Merchandizing Rules
*SearchMerchandizingRuleApi* | [**updateSearchMerchandizingRule**](docs/SearchMerchandizingRuleApi.md#updateSearchMerchandizingRule) | **PUT** /commerce/catalog/admin/searchmerchandizingrules/{code} | Update Search Merchandizing Rule
*SearchProductSuggestSettingsApi* | [**deleteProductSuggestSettings**](docs/SearchProductSuggestSettingsApi.md#deleteProductSuggestSettings) | **DELETE** /commerce/catalog/admin/search/{name}/productsuggestsettings | Delete Product Suggest Settings
*SearchProductSuggestSettingsApi* | [**getProductSuggestSettings**](docs/SearchProductSuggestSettingsApi.md#getProductSuggestSettings) | **GET** /commerce/catalog/admin/search/{name}/productsuggestsettings | Get Product Suggest Settings
*SearchProductSuggestSettingsApi* | [**updateProductSuggestSettings**](docs/SearchProductSuggestSettingsApi.md#updateProductSuggestSettings) | **PUT** /commerce/catalog/admin/search/{name}/productsuggestsettings | Update Product Suggest Settings
*SearchRedirectApi* | [**addSearchRedirect**](docs/SearchRedirectApi.md#addSearchRedirect) | **POST** /commerce/catalog/admin/search/redirect | Add Search Redirect
*SearchRedirectApi* | [**deleteSearchRedirect**](docs/SearchRedirectApi.md#deleteSearchRedirect) | **DELETE** /commerce/catalog/admin/search/redirect/{redirectId} | Delete Search Redirect
*SearchRedirectApi* | [**getSearchRedirect**](docs/SearchRedirectApi.md#getSearchRedirect) | **GET** /commerce/catalog/admin/search/redirect/{redirectId} | Get Search Redirect
*SearchRedirectApi* | [**getSearchRedirects**](docs/SearchRedirectApi.md#getSearchRedirects) | **GET** /commerce/catalog/admin/search/redirect | Get Search Redirects
*SearchRedirectApi* | [**updateSearchRedirect**](docs/SearchRedirectApi.md#updateSearchRedirect) | **PUT** /commerce/catalog/admin/search/redirect/{redirectId} | Update Search Redirect
*SearchSettingsApi* | [**addSearchSetting**](docs/SearchSettingsApi.md#addSearchSetting) | **POST** /commerce/catalog/admin/search/settings | Add Search Settings
*SearchSettingsApi* | [**deleteSearchSetting**](docs/SearchSettingsApi.md#deleteSearchSetting) | **DELETE** /commerce/catalog/admin/search/settings/{name} | Delete Search Settings by Name
*SearchSettingsApi* | [**deleteSiteSearchSettings**](docs/SearchSettingsApi.md#deleteSiteSearchSettings) | **DELETE** /commerce/catalog/admin/search/{name}/sitesearchsettings | Delete Site Search Settings
*SearchSettingsApi* | [**getSearchSetting**](docs/SearchSettingsApi.md#getSearchSetting) | **GET** /commerce/catalog/admin/search/settings/{name} | Get Search Settings by Name
*SearchSettingsApi* | [**getSearchSettings**](docs/SearchSettingsApi.md#getSearchSettings) | **GET** /commerce/catalog/admin/search/settings | Get Search Settings
*SearchSettingsApi* | [**getSiteSearchSettings**](docs/SearchSettingsApi.md#getSiteSearchSettings) | **GET** /commerce/catalog/admin/search/{name}/sitesearchsettings | Get Site Search Settings
*SearchSettingsApi* | [**getSystemDefaultSettings**](docs/SearchSettingsApi.md#getSystemDefaultSettings) | **GET** /commerce/catalog/admin/search/settings/systemdefault | Get System Default Search Settings
*SearchSettingsApi* | [**updateSearchSetting**](docs/SearchSettingsApi.md#updateSearchSetting) | **PUT** /commerce/catalog/admin/search/settings/{name} | Update Search Settings by Name
*SearchSettingsApi* | [**updateSiteSearchSettings**](docs/SearchSettingsApi.md#updateSiteSearchSettings) | **PUT** /commerce/catalog/admin/search/{name}/sitesearchsettings | Update Site Search Settings
*SearchSettingsApi* | [**updateSpellCheck**](docs/SearchSettingsApi.md#updateSpellCheck) | **PUT** /commerce/catalog/admin/search/spellcheck | Update Spellcheck Settings
*SearchSynonymsApi* | [**addSynonymDefinition**](docs/SearchSynonymsApi.md#addSynonymDefinition) | **POST** /commerce/catalog/admin/search/synonyms | Add Synonym Definition
*SearchSynonymsApi* | [**deleteSynonymDefinition**](docs/SearchSynonymsApi.md#deleteSynonymDefinition) | **DELETE** /commerce/catalog/admin/search/synonyms/{synonymId} | Delete Synonym Definition
*SearchSynonymsApi* | [**getAllSynonymDefinitionCollectionsForMasterCatalog**](docs/SearchSynonymsApi.md#getAllSynonymDefinitionCollectionsForMasterCatalog) | **GET** /commerce/catalog/admin/search/master-catalog-synonym-definitions/{languageCode} | Get Synonym Definition Collections
*SearchSynonymsApi* | [**getSynonymDefinition**](docs/SearchSynonymsApi.md#getSynonymDefinition) | **GET** /commerce/catalog/admin/search/synonyms/{synonymId} | Get Synonym Definition
*SearchSynonymsApi* | [**getSynonymDefinitionCollection**](docs/SearchSynonymsApi.md#getSynonymDefinitionCollection) | **GET** /commerce/catalog/admin/search/synonym-definitions/{localeCode} | Get Synonym Definition Collection
*SearchSynonymsApi* | [**getSynonymDefinitions**](docs/SearchSynonymsApi.md#getSynonymDefinitions) | **GET** /commerce/catalog/admin/search/synonyms | Get Synonym Definitions
*SearchSynonymsApi* | [**updateSynonymDefinition**](docs/SearchSynonymsApi.md#updateSynonymDefinition) | **PUT** /commerce/catalog/admin/search/synonyms/{synonymId} | Update Synonym Definition
*SearchSynonymsApi* | [**updateSynonymDefinitionCollection**](docs/SearchSynonymsApi.md#updateSynonymDefinitionCollection) | **POST** /commerce/catalog/admin/search/synonym-definitions/{localeCode} | Add Synonym Definition Collection
*ShipmentReleaseRulesApi* | [**createRule**](docs/ShipmentReleaseRulesApi.md#createRule) | **POST** /commerce/rules/shipmentrelease | Create shipment release rule
*ShipmentReleaseRulesApi* | [**deleteRule**](docs/ShipmentReleaseRulesApi.md#deleteRule) | **DELETE** /commerce/rules/shipmentrelease/{code} | Delete shipment release rule
*ShipmentReleaseRulesApi* | [**getRule**](docs/ShipmentReleaseRulesApi.md#getRule) | **GET** /commerce/rules/shipmentrelease/{code} | Get shipment release rule by code
*ShipmentReleaseRulesApi* | [**getRules**](docs/ShipmentReleaseRulesApi.md#getRules) | **GET** /commerce/rules/shipmentrelease | Get shipment release rules
*ShipmentReleaseRulesApi* | [**updateRank**](docs/ShipmentReleaseRulesApi.md#updateRank) | **PUT** /commerce/rules/shipmentrelease/{code}/rank | Update shipment release rule rank
*ShipmentReleaseRulesApi* | [**updateRule**](docs/ShipmentReleaseRulesApi.md#updateRule) | **PUT** /commerce/rules/shipmentrelease/{code} | Update shipment release rule
*ShipmentRulesApi* | [**createShipmentRule**](docs/ShipmentRulesApi.md#createShipmentRule) | **POST** /commerce/rules/shipment | Create shipment rule
*ShipmentRulesApi* | [**deleteShipmentRule**](docs/ShipmentRulesApi.md#deleteShipmentRule) | **DELETE** /commerce/rules/shipment/{code} | Delete shipment rule
*ShipmentRulesApi* | [**getShipmentRule**](docs/ShipmentRulesApi.md#getShipmentRule) | **GET** /commerce/rules/shipment/{code} | Get shipment rule by code
*ShipmentRulesApi* | [**getShipmentRules**](docs/ShipmentRulesApi.md#getShipmentRules) | **GET** /commerce/rules/shipment | Get shipment rules
*ShipmentRulesApi* | [**parseShipmentExpression**](docs/ShipmentRulesApi.md#parseShipmentExpression) | **POST** /commerce/rules/shipment/expression/parse | Parse Shipment Expression
*ShipmentRulesApi* | [**updateShipmentRule**](docs/ShipmentRulesApi.md#updateShipmentRule) | **PUT** /commerce/rules/shipment/{code} | Update shipment rule
*TagApi* | [**createTag**](docs/TagApi.md#createTag) | **POST** /commerce/catalog/admin/tags | Create Tag
*TagApi* | [**deleteTag**](docs/TagApi.md#deleteTag) | **DELETE** /commerce/catalog/admin/tags/{tagCode} | Delete Tag
*TagApi* | [**getNodeTree**](docs/TagApi.md#getNodeTree) | **GET** /commerce/catalog/admin/tags/node/tree | Get Tag Collection as Tag Tree
*TagApi* | [**getTag**](docs/TagApi.md#getTag) | **GET** /commerce/catalog/admin/tags/{tagCode} | Get Tag
*TagApi* | [**getTags**](docs/TagApi.md#getTags) | **GET** /commerce/catalog/admin/tags | Get Tags
*TagApi* | [**updateTag**](docs/TagApi.md#updateTag) | **PUT** /commerce/catalog/admin/tags/{tagCode} | Update Tag


## Documentation for Models

 - [AdminUserAuditInfo](docs/AdminUserAuditInfo.md)
 - [AssignedDiscount](docs/AssignedDiscount.md)
 - [AttributeInProductType](docs/AttributeInProductType.md)
 - [AttributeInProductTypeDisplayInfo](docs/AttributeInProductTypeDisplayInfo.md)
 - [AttributeSearchSettings](docs/AttributeSearchSettings.md)
 - [AttributeTypeRule](docs/AttributeTypeRule.md)
 - [AttributeTypeRuleCollection](docs/AttributeTypeRuleCollection.md)
 - [AttributeVocabularyValueInProductType](docs/AttributeVocabularyValueInProductType.md)
 - [AttributeVocabularyValueLocalizedContent](docs/AttributeVocabularyValueLocalizedContent.md)
 - [BackorderRebalancingRule](docs/BackorderRebalancingRule.md)
 - [BackorderRebalancingRuleCollection](docs/BackorderRebalancingRuleCollection.md)
 - [BoostField](docs/BoostField.md)
 - [BoostValue](docs/BoostValue.md)
 - [CallOffReleaseRule](docs/CallOffReleaseRule.md)
 - [CallOffReleaseRuleCollection](docs/CallOffReleaseRuleCollection.md)
 - [CatalogAdminsActiveDateRange](docs/CatalogAdminsActiveDateRange.md)
 - [CatalogAdminsAttribute](docs/CatalogAdminsAttribute.md)
 - [CatalogAdminsAttributeCollection](docs/CatalogAdminsAttributeCollection.md)
 - [CatalogAdminsAttributeLocalizedContent](docs/CatalogAdminsAttributeLocalizedContent.md)
 - [CatalogAdminsAttributeMetadataItem](docs/CatalogAdminsAttributeMetadataItem.md)
 - [CatalogAdminsAttributeValidation](docs/CatalogAdminsAttributeValidation.md)
 - [CatalogAdminsAttributeVocabularyValue](docs/CatalogAdminsAttributeVocabularyValue.md)
 - [CatalogAdminsAttributeVocabularyValueDisplayInfo](docs/CatalogAdminsAttributeVocabularyValueDisplayInfo.md)
 - [CatalogAdminsBundledProduct](docs/CatalogAdminsBundledProduct.md)
 - [CatalogAdminsCategory](docs/CatalogAdminsCategory.md)
 - [CatalogAdminsCategoryAttribute](docs/CatalogAdminsCategoryAttribute.md)
 - [CatalogAdminsCategoryCollection](docs/CatalogAdminsCategoryCollection.md)
 - [CatalogAdminsCategoryPagedCollection](docs/CatalogAdminsCategoryPagedCollection.md)
 - [CatalogAdminsCurrencyExchangeRate](docs/CatalogAdminsCurrencyExchangeRate.md)
 - [CatalogAdminsCustomerSegment](docs/CatalogAdminsCustomerSegment.md)
 - [CatalogAdminsDiscount](docs/CatalogAdminsDiscount.md)
 - [CatalogAdminsDiscountCollection](docs/CatalogAdminsDiscountCollection.md)
 - [CatalogAdminsDiscountCondition](docs/CatalogAdminsDiscountCondition.md)
 - [CatalogAdminsDiscountTarget](docs/CatalogAdminsDiscountTarget.md)
 - [CatalogAdminsDynamicExpression](docs/CatalogAdminsDynamicExpression.md)
 - [CatalogAdminsExpression](docs/CatalogAdminsExpression.md)
 - [CatalogAdminsFacet](docs/CatalogAdminsFacet.md)
 - [CatalogAdminsMasterCatalog](docs/CatalogAdminsMasterCatalog.md)
 - [CatalogAdminsPriceList](docs/CatalogAdminsPriceList.md)
 - [CatalogAdminsProduct](docs/CatalogAdminsProduct.md)
 - [CatalogAdminsProductCollection](docs/CatalogAdminsProductCollection.md)
 - [CatalogAdminsProductCollectionInfo](docs/CatalogAdminsProductCollectionInfo.md)
 - [CatalogAdminsProductCollectionMemberKey](docs/CatalogAdminsProductCollectionMemberKey.md)
 - [CatalogAdminsProductCost](docs/CatalogAdminsProductCost.md)
 - [CatalogAdminsProductImageGroup](docs/CatalogAdminsProductImageGroup.md)
 - [CatalogAdminsProductImageGroupTag](docs/CatalogAdminsProductImageGroupTag.md)
 - [CatalogAdminsProductInventoryInfo](docs/CatalogAdminsProductInventoryInfo.md)
 - [CatalogAdminsProductOption](docs/CatalogAdminsProductOption.md)
 - [CatalogAdminsProductOptionValue](docs/CatalogAdminsProductOptionValue.md)
 - [CatalogAdminsProductPrice](docs/CatalogAdminsProductPrice.md)
 - [CatalogAdminsProductPricingBehaviorInfo](docs/CatalogAdminsProductPricingBehaviorInfo.md)
 - [CatalogAdminsProductProperty](docs/CatalogAdminsProductProperty.md)
 - [CatalogAdminsProductPropertyValue](docs/CatalogAdminsProductPropertyValue.md)
 - [CatalogAdminsProductRule](docs/CatalogAdminsProductRule.md)
 - [CatalogAdminsSearchMerchandizingRule](docs/CatalogAdminsSearchMerchandizingRule.md)
 - [CatalogAdminsSearchMerchandizingRuleCondition](docs/CatalogAdminsSearchMerchandizingRuleCondition.md)
 - [CatalogAdminsSearchMerchandizingRuleContext](docs/CatalogAdminsSearchMerchandizingRuleContext.md)
 - [CatalogAdminsSpellcheck](docs/CatalogAdminsSpellcheck.md)
 - [CatalogAdminsTag](docs/CatalogAdminsTag.md)
 - [CatalogAdminsTargetedCategory](docs/CatalogAdminsTargetedCategory.md)
 - [CatalogAdminsTargetedShippingMethod](docs/CatalogAdminsTargetedShippingMethod.md)
 - [CatalogAdminsTargetedShippingZone](docs/CatalogAdminsTargetedShippingZone.md)
 - [CatalogAdminsThresholdMessage](docs/CatalogAdminsThresholdMessage.md)
 - [CategoryAttributeCollection](docs/CategoryAttributeCollection.md)
 - [CategoryDiscountCondition](docs/CategoryDiscountCondition.md)
 - [CategoryLocalizedContent](docs/CategoryLocalizedContent.md)
 - [CategoryLocalizedImage](docs/CategoryLocalizedImage.md)
 - [ChangeProductTypeAction](docs/ChangeProductTypeAction.md)
 - [CollapseSettings](docs/CollapseSettings.md)
 - [CommerceRuntimeMeasurement](docs/CommerceRuntimeMeasurement.md)
 - [ContinuityRecurrenceSettings](docs/ContinuityRecurrenceSettings.md)
 - [Coupon](docs/Coupon.md)
 - [CouponCollection](docs/CouponCollection.md)
 - [CouponSet](docs/CouponSet.md)
 - [CouponSetCollection](docs/CouponSetCollection.md)
 - [CurrencyExchangeRateCollection](docs/CurrencyExchangeRateCollection.md)
 - [CurrencyLocalization](docs/CurrencyLocalization.md)
 - [CurrencyLocalizationCollection](docs/CurrencyLocalizationCollection.md)
 - [CustomProperty](docs/CustomProperty.md)
 - [CustomPropertyValues](docs/CustomPropertyValues.md)
 - [DiscountLocalizedContent](docs/DiscountLocalizedContent.md)
 - [DiscountSettings](docs/DiscountSettings.md)
 - [DiscountTag](docs/DiscountTag.md)
 - [DiscountTagCollection](docs/DiscountTagCollection.md)
 - [ExpressionValidationError](docs/ExpressionValidationError.md)
 - [ExpressionValidationResult](docs/ExpressionValidationResult.md)
 - [ExtensibleAttribute](docs/ExtensibleAttribute.md)
 - [ExtensibleAttributeCollection](docs/ExtensibleAttributeCollection.md)
 - [ExtensibleAttributeLocalizedContent](docs/ExtensibleAttributeLocalizedContent.md)
 - [ExtensibleAttributeMetadataItem](docs/ExtensibleAttributeMetadataItem.md)
 - [ExtensibleAttributeValidation](docs/ExtensibleAttributeValidation.md)
 - [ExtensibleAttributeValueLocalizedContent](docs/ExtensibleAttributeValueLocalizedContent.md)
 - [ExtensibleAttributeVocabularyValue](docs/ExtensibleAttributeVocabularyValue.md)
 - [FacetCollection](docs/FacetCollection.md)
 - [FacetRangeQuery](docs/FacetRangeQuery.md)
 - [FacetSet](docs/FacetSet.md)
 - [FacetSource](docs/FacetSource.md)
 - [FacetValidity](docs/FacetValidity.md)
 - [FieldValueBoost](docs/FieldValueBoost.md)
 - [FieldWeight](docs/FieldWeight.md)
 - [FutureShipmentRebalancingRule](docs/FutureShipmentRebalancingRule.md)
 - [FutureShipmentRebalancingRuleCollection](docs/FutureShipmentRebalancingRuleCollection.md)
 - [HttpValidationProblemDetails](docs/HttpValidationProblemDetails.md)
 - [HttpValidationProblemDetailsAllOf](docs/HttpValidationProblemDetailsAllOf.md)
 - [ListingSettings](docs/ListingSettings.md)
 - [MasterCatalogCollection](docs/MasterCatalogCollection.md)
 - [PickWaveEvalRequest](docs/PickWaveEvalRequest.md)
 - [PickWaveEvalResponseCollection](docs/PickWaveEvalResponseCollection.md)
 - [PickWaveEvalResponseItem](docs/PickWaveEvalResponseItem.md)
 - [PickWaveRule](docs/PickWaveRule.md)
 - [PickWaveRuleCollection](docs/PickWaveRuleCollection.md)
 - [PriceListBulkResult](docs/PriceListBulkResult.md)
 - [PriceListCollection](docs/PriceListCollection.md)
 - [PriceListEntry](docs/PriceListEntry.md)
 - [PriceListEntryCollection](docs/PriceListEntryCollection.md)
 - [PriceListEntryExtra](docs/PriceListEntryExtra.md)
 - [PriceListEntryFailure](docs/PriceListEntryFailure.md)
 - [PriceListEntryPrice](docs/PriceListEntryPrice.md)
 - [PricingRuntimeCustomerSegment](docs/PricingRuntimeCustomerSegment.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ProductCategory](docs/ProductCategory.md)
 - [ProductCodeRename](docs/ProductCodeRename.md)
 - [ProductCollectionProduct](docs/ProductCollectionProduct.md)
 - [ProductCollectionV1](docs/ProductCollectionV1.md)
 - [ProductDiscountCondition](docs/ProductDiscountCondition.md)
 - [ProductExtra](docs/ProductExtra.md)
 - [ProductExtraValue](docs/ProductExtraValue.md)
 - [ProductExtraValueDeltaPrice](docs/ProductExtraValueDeltaPrice.md)
 - [ProductImageGroup](docs/ProductImageGroup.md)
 - [ProductImageGroupTag](docs/ProductImageGroupTag.md)
 - [ProductInCatalogInfo](docs/ProductInCatalogInfo.md)
 - [ProductInCatalogInfoV1](docs/ProductInCatalogInfoV1.md)
 - [ProductInCatalogInfoV1PatchDocument](docs/ProductInCatalogInfoV1PatchDocument.md)
 - [ProductInCatalogInfoV1PatchOperation](docs/ProductInCatalogInfoV1PatchOperation.md)
 - [ProductInCatalogPatchAction](docs/ProductInCatalogPatchAction.md)
 - [ProductLocalizedContent](docs/ProductLocalizedContent.md)
 - [ProductLocalizedImage](docs/ProductLocalizedImage.md)
 - [ProductLocalizedSEOContent](docs/ProductLocalizedSEOContent.md)
 - [ProductPatchAction](docs/ProductPatchAction.md)
 - [ProductPropertyPatchAction](docs/ProductPropertyPatchAction.md)
 - [ProductPropertyPatchDocument](docs/ProductPropertyPatchDocument.md)
 - [ProductPropertyPatchOperation](docs/ProductPropertyPatchOperation.md)
 - [ProductPropertyValueLocalizedContent](docs/ProductPropertyValueLocalizedContent.md)
 - [ProductPublishingInfo](docs/ProductPublishingInfo.md)
 - [ProductRuleCode](docs/ProductRuleCode.md)
 - [ProductRuleCollection](docs/ProductRuleCollection.md)
 - [ProductRuleUsage](docs/ProductRuleUsage.md)
 - [ProductRuleUsageCollection](docs/ProductRuleUsageCollection.md)
 - [ProductSortDefinition](docs/ProductSortDefinition.md)
 - [ProductSortDefinitionPagedCollection](docs/ProductSortDefinitionPagedCollection.md)
 - [ProductSortExpression](docs/ProductSortExpression.md)
 - [ProductSortOverride](docs/ProductSortOverride.md)
 - [ProductSuggestSettings](docs/ProductSuggestSettings.md)
 - [ProductSuggestSettingsAllOf](docs/ProductSuggestSettingsAllOf.md)
 - [ProductSupplierInfo](docs/ProductSupplierInfo.md)
 - [ProductType](docs/ProductType.md)
 - [ProductTypeChangeRequest](docs/ProductTypeChangeRequest.md)
 - [ProductTypeChangeResponse](docs/ProductTypeChangeResponse.md)
 - [ProductTypeChangeValidationResult](docs/ProductTypeChangeValidationResult.md)
 - [ProductTypeCollection](docs/ProductTypeCollection.md)
 - [ProductV1](docs/ProductV1.md)
 - [ProductV1PatchDocument](docs/ProductV1PatchDocument.md)
 - [ProductV1PatchOperation](docs/ProductV1PatchOperation.md)
 - [ProductVariation](docs/ProductVariation.md)
 - [ProductVariationCollection](docs/ProductVariationCollection.md)
 - [ProductVariationDeltaPrice](docs/ProductVariationDeltaPrice.md)
 - [ProductVariationFixedPrice](docs/ProductVariationFixedPrice.md)
 - [ProductVariationOption](docs/ProductVariationOption.md)
 - [ProductVariationPagedCollection](docs/ProductVariationPagedCollection.md)
 - [ProductVariationProperty](docs/ProductVariationProperty.md)
 - [PublishSet](docs/PublishSet.md)
 - [PublishSetCollection](docs/PublishSetCollection.md)
 - [PublishingScope](docs/PublishingScope.md)
 - [PurchaseLimitRule](docs/PurchaseLimitRule.md)
 - [PurchaseLimitRuleCollection](docs/PurchaseLimitRuleCollection.md)
 - [QuickEditChangeProductTypeActions](docs/QuickEditChangeProductTypeActions.md)
 - [QuickEditChangeProductTypeResponse](docs/QuickEditChangeProductTypeResponse.md)
 - [QuickEditChangeProductTypeResult](docs/QuickEditChangeProductTypeResult.md)
 - [QuickEditChangeProductTypeResultAllOf](docs/QuickEditChangeProductTypeResultAllOf.md)
 - [QuickEditProductActions](docs/QuickEditProductActions.md)
 - [QuickEditProductInCatalogActions](docs/QuickEditProductInCatalogActions.md)
 - [QuickEditProductPropertyActions](docs/QuickEditProductPropertyActions.md)
 - [QuickEditResponse](docs/QuickEditResponse.md)
 - [QuickEditResult](docs/QuickEditResult.md)
 - [ReservationRule](docs/ReservationRule.md)
 - [ReservationRuleCollection](docs/ReservationRuleCollection.md)
 - [ReservationStealForRule](docs/ReservationStealForRule.md)
 - [ReservationStealForRuleCollection](docs/ReservationStealForRuleCollection.md)
 - [ReservationStealFromRule](docs/ReservationStealFromRule.md)
 - [ReservationStealFromRuleCollection](docs/ReservationStealFromRuleCollection.md)
 - [ReturnRule](docs/ReturnRule.md)
 - [ReturnRuleCollection](docs/ReturnRuleCollection.md)
 - [RulesEngineJobCreateRequest](docs/RulesEngineJobCreateRequest.md)
 - [RulesEngineJobCreateResponse](docs/RulesEngineJobCreateResponse.md)
 - [SafetyStockRule](docs/SafetyStockRule.md)
 - [SafetyStockRuleCollection](docs/SafetyStockRuleCollection.md)
 - [SearchMerchandizingBoostField](docs/SearchMerchandizingBoostField.md)
 - [SearchMerchandizingBoostType](docs/SearchMerchandizingBoostType.md)
 - [SearchMerchandizingBoostValueExpression](docs/SearchMerchandizingBoostValueExpression.md)
 - [SearchMerchandizingFieldValueBoost](docs/SearchMerchandizingFieldValueBoost.md)
 - [SearchMerchandizingFilter](docs/SearchMerchandizingFilter.md)
 - [SearchMerchandizingImpactItem](docs/SearchMerchandizingImpactItem.md)
 - [SearchMerchandizingRuleCollection](docs/SearchMerchandizingRuleCollection.md)
 - [SearchMerchandizingRuleField](docs/SearchMerchandizingRuleField.md)
 - [SearchMerchandizingRuleImpact](docs/SearchMerchandizingRuleImpact.md)
 - [SearchMerchandizingSortField](docs/SearchMerchandizingSortField.md)
 - [SearchRedirect](docs/SearchRedirect.md)
 - [SearchRedirectCollection](docs/SearchRedirectCollection.md)
 - [SearchSettings](docs/SearchSettings.md)
 - [SearchSettingsCollection](docs/SearchSettingsCollection.md)
 - [SearchTuningRule](docs/SearchTuningRule.md)
 - [SearchTuningRuleCollection](docs/SearchTuningRuleCollection.md)
 - [SearchTuningRuleFilter](docs/SearchTuningRuleFilter.md)
 - [SearchTuningRuleSortFields](docs/SearchTuningRuleSortFields.md)
 - [SearchType](docs/SearchType.md)
 - [ShipmentReleaseRule](docs/ShipmentReleaseRule.md)
 - [ShipmentReleaseRuleCollection](docs/ShipmentReleaseRuleCollection.md)
 - [ShipmentRule](docs/ShipmentRule.md)
 - [ShipmentRuleCode](docs/ShipmentRuleCode.md)
 - [ShipmentRuleCollection](docs/ShipmentRuleCollection.md)
 - [SiteSearchFieldWeight](docs/SiteSearchFieldWeight.md)
 - [SiteSearchFieldWeightAllOf](docs/SiteSearchFieldWeightAllOf.md)
 - [SiteSearchSettings](docs/SiteSearchSettings.md)
 - [SlicingSettings](docs/SlicingSettings.md)
 - [SpellcheckUpdate](docs/SpellcheckUpdate.md)
 - [StackingConfiguration](docs/StackingConfiguration.md)
 - [SuggestSettings](docs/SuggestSettings.md)
 - [SynonymDefinition](docs/SynonymDefinition.md)
 - [SynonymDefinitionCollection](docs/SynonymDefinitionCollection.md)
 - [SynonymDefinitionPagedCollection](docs/SynonymDefinitionPagedCollection.md)
 - [TagCollection](docs/TagCollection.md)
 - [TagNode](docs/TagNode.md)
 - [TagNodeTree](docs/TagNodeTree.md)
 - [TargetedProduct](docs/TargetedProduct.md)
 - [ThresholdMessageLocalizedContent](docs/ThresholdMessageLocalizedContent.md)
 - [TypoTolerance](docs/TypoTolerance.md)
 - [UpdateRankRequest](docs/UpdateRankRequest.md)
 - [VectorSearchSettings](docs/VectorSearchSettings.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



