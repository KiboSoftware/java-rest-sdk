/*
 * Kibo Catalog Admin Services
 * <div id=\"overview_CATALOG_ADMIN\">             <h2>CATALOG ADMINISTRATION</h2>             <p>The Catalog Administration APIs are a collection of resources for configuring the catalogs and products offered to your shoppers, including                 discounts and coupon sets, faceting, price lists, and different types or variations of products. See the                 <a href=\"/concept-guides/catalog\">Catalog user guides</a>                 for information about the related features in the Unified Commerce Admin.</p>             <p>Use the <strong>Attributes</strong> resource to manage localization and attribute configurations for your catalogs. This current version of the Attributes API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access attribute data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Categories</strong> resource to organize products and control where they appear on the storefront. Create                 and maintain a hierarchy of categories and subcategories where the site will store properties. This current version of the Categories API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access category data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Coupon Sets</strong> resource to view and create coupon sets. You can use coupon sets to group multiple                 coupon codes together and associate them with one or more discounts.</p>             <p>Use the <strong>Currency</strong> resource to manage the currency localization rules and exchange rates for any of the                 currencies that are supported for placing orders in.</p>             <p>Use the <strong>Discounts</strong> and <strong>Discount Settings</strong> resources to define and manage discounts to apply to products, product categories, or                 orders. This current version of the Discounts API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access discount data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Facets</strong> resource to manage the facets shoppers use to filter product display results on a                 storefront. Facets can include categories, product attributes, or prices, and use either a range of                 values or discrete values.</p>             <p>Use the <strong>Master Catalog</strong> resource to view details of the master catalogs associated with a tenant and to                 manage the product publishing mode for each master catalog.</p>             <p>Use the <strong>Price Lists</strong> resources to view and create price lists. You can use price lists to override the                 catalog pricing of products for specific customer segments and/or sites.</p>             <p>Use the <strong>Products</strong>, <strong>Product Types/Extras/Options/Properties</strong>, and <strong>Product Sort Definitions</strong> resources to create new product definitions in the master catalog and determine which                 catalogs will feature products. This current version of the Products API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access product data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\".</p>             <p>Use the <strong>Publishing</strong> resource to publish pending product updates together as part of a set.</p>             <p>Use the <strong>Search</strong> resource to manage all settings and options for providing product search on your site, as                 well as search tuning rules.</p>         </div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsCustomerSegment;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDynamicExpression;
import com.kibocommerce.sdk.catalogadministration.models.CategoryDiscountCondition;
import com.kibocommerce.sdk.catalogadministration.models.ContinuityRecurrenceSettings;
import com.kibocommerce.sdk.catalogadministration.models.ProductDiscountCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kibocommerce.sdk.common.JSON;

/**
 * Specifies constraints that must be satified for a discount to be applied to a target. Constraints are Anded together
 */
@ApiModel(description = "Specifies constraints that must be satified for a discount to be applied to a target. Constraints are Anded together")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsDiscountCondition implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CATEGORIES_TO_EXCLUDE_FROM_MIN_ORDER_TOTAL = "categoriesToExcludeFromMinOrderTotal";
  @SerializedName(SERIALIZED_NAME_CATEGORIES_TO_EXCLUDE_FROM_MIN_ORDER_TOTAL)
  private List<CategoryDiscountCondition> categoriesToExcludeFromMinOrderTotal = null;

  public static final String SERIALIZED_NAME_CONTINUITY_RECURRENCE_SETTINGS = "continuityRecurrenceSettings";
  @SerializedName(SERIALIZED_NAME_CONTINUITY_RECURRENCE_SETTINGS)
  private ContinuityRecurrenceSettings continuityRecurrenceSettings;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_CUSTOMER_SEGMENTS = "customerSegments";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SEGMENTS)
  private List<CatalogAdminsCustomerSegment> customerSegments = null;

  public static final String SERIALIZED_NAME_EXCLUDED_CATEGORIES = "excludedCategories";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_CATEGORIES)
  private List<CategoryDiscountCondition> excludedCategories = null;

  public static final String SERIALIZED_NAME_EXCLUDED_PRODUCTS = "excludedProducts";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_PRODUCTS)
  private List<ProductDiscountCondition> excludedProducts = null;

  public static final String SERIALIZED_NAME_EXCLUSIVE_LOCATION_CODES = "exclusiveLocationCodes";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_LOCATION_CODES)
  private List<String> exclusiveLocationCodes = null;

  public static final String SERIALIZED_NAME_EXCLUSIVE_SITE_IDS = "exclusiveSiteIds";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_SITE_IDS)
  private List<Integer> exclusiveSiteIds = null;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private CatalogAdminsDynamicExpression expression;

  public static final String SERIALIZED_NAME_INCLUDED_CATEGORIES = "includedCategories";
  @SerializedName(SERIALIZED_NAME_INCLUDED_CATEGORIES)
  private List<CategoryDiscountCondition> includedCategories = null;

  public static final String SERIALIZED_NAME_INCLUDED_PAYMENT_WORKFLOWS = "includedPaymentWorkflows";
  @SerializedName(SERIALIZED_NAME_INCLUDED_PAYMENT_WORKFLOWS)
  private List<String> includedPaymentWorkflows = null;

  public static final String SERIALIZED_NAME_INCLUDED_PRODUCTS = "includedProducts";
  @SerializedName(SERIALIZED_NAME_INCLUDED_PRODUCTS)
  private List<ProductDiscountCondition> includedProducts = null;

  public static final String SERIALIZED_NAME_MAX_REDEMPTION_COUNT = "maxRedemptionCount";
  @SerializedName(SERIALIZED_NAME_MAX_REDEMPTION_COUNT)
  private Integer maxRedemptionCount;

  public static final String SERIALIZED_NAME_MAXIMUM_ORDER_AMOUNT = "maximumOrderAmount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_ORDER_AMOUNT)
  private Double maximumOrderAmount;

  public static final String SERIALIZED_NAME_MIN_DISTINCT_PRODUCTS_REQUIRED = "minDistinctProductsRequired";
  @SerializedName(SERIALIZED_NAME_MIN_DISTINCT_PRODUCTS_REQUIRED)
  private Integer minDistinctProductsRequired;

  public static final String SERIALIZED_NAME_MIN_TOTAL_ORDER_QUANTITY = "minTotalOrderQuantity";
  @SerializedName(SERIALIZED_NAME_MIN_TOTAL_ORDER_QUANTITY)
  private Integer minTotalOrderQuantity;

  public static final String SERIALIZED_NAME_MINIMUM_CATEGORY_SUBTOTAL_BEFORE_DISCOUNTS = "minimumCategorySubtotalBeforeDiscounts";
  @SerializedName(SERIALIZED_NAME_MINIMUM_CATEGORY_SUBTOTAL_BEFORE_DISCOUNTS)
  private Double minimumCategorySubtotalBeforeDiscounts;

  public static final String SERIALIZED_NAME_MINIMUM_LIFETIME_VALUE_AMOUNT = "minimumLifetimeValueAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_LIFETIME_VALUE_AMOUNT)
  private Double minimumLifetimeValueAmount;

  public static final String SERIALIZED_NAME_MINIMUM_ORDER_AMOUNT = "minimumOrderAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ORDER_AMOUNT)
  private Double minimumOrderAmount;

  public static final String SERIALIZED_NAME_MINIMUM_QUANTITY_PRODUCTS_REQUIRED_IN_CATEGORIES = "minimumQuantityProductsRequiredInCategories";
  @SerializedName(SERIALIZED_NAME_MINIMUM_QUANTITY_PRODUCTS_REQUIRED_IN_CATEGORIES)
  private Integer minimumQuantityProductsRequiredInCategories;

  public static final String SERIALIZED_NAME_MINIMUM_QUANTITY_REQUIRED_PRODUCTS = "minimumQuantityRequiredProducts";
  @SerializedName(SERIALIZED_NAME_MINIMUM_QUANTITY_REQUIRED_PRODUCTS)
  private Integer minimumQuantityRequiredProducts;

  public static final String SERIALIZED_NAME_MINIMUM_REQUIRED_QUANTITY_PER_REDEMPTION = "minimumRequiredQuantityPerRedemption";
  @SerializedName(SERIALIZED_NAME_MINIMUM_REQUIRED_QUANTITY_PER_REDEMPTION)
  private Integer minimumRequiredQuantityPerRedemption;

  public static final String SERIALIZED_NAME_PRICING_CONTEXT = "pricingContext";
  @SerializedName(SERIALIZED_NAME_PRICING_CONTEXT)
  private String pricingContext;

  public static final String SERIALIZED_NAME_PRODUCTS_TO_EXCLUDE_FROM_MIN_ORDER_TOTAL = "productsToExcludeFromMinOrderTotal";
  @SerializedName(SERIALIZED_NAME_PRODUCTS_TO_EXCLUDE_FROM_MIN_ORDER_TOTAL)
  private List<ProductDiscountCondition> productsToExcludeFromMinOrderTotal = null;

  public static final String SERIALIZED_NAME_REQUIRES_AUTHENTICATED_USER = "requiresAuthenticatedUser";
  @SerializedName(SERIALIZED_NAME_REQUIRES_AUTHENTICATED_USER)
  private Boolean requiresAuthenticatedUser;

  public static final String SERIALIZED_NAME_REQUIRES_COUPON = "requiresCoupon";
  @SerializedName(SERIALIZED_NAME_REQUIRES_COUPON)
  private Boolean requiresCoupon;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_VALID_FULFILLMENT_METHODS = "validFulfillmentMethods";
  @SerializedName(SERIALIZED_NAME_VALID_FULFILLMENT_METHODS)
  private List<String> validFulfillmentMethods = null;

  public static final String SERIALIZED_NAME_VALID_SUBSCRIPTION_CONTINUITY_ORDINALS = "validSubscriptionContinuityOrdinals";
  @SerializedName(SERIALIZED_NAME_VALID_SUBSCRIPTION_CONTINUITY_ORDINALS)
  private List<Integer> validSubscriptionContinuityOrdinals = null;

  public static final String SERIALIZED_NAME_VALID_SUBSCRIPTION_FREQUENCIES = "validSubscriptionFrequencies";
  @SerializedName(SERIALIZED_NAME_VALID_SUBSCRIPTION_FREQUENCIES)
  private List<String> validSubscriptionFrequencies = null;

  public CatalogAdminsDiscountCondition() {
  }

  public CatalogAdminsDiscountCondition categoriesToExcludeFromMinOrderTotal(List<CategoryDiscountCondition> categoriesToExcludeFromMinOrderTotal) {
    
    this.categoriesToExcludeFromMinOrderTotal = categoriesToExcludeFromMinOrderTotal;
    return this;
  }

  public CatalogAdminsDiscountCondition addCategoriesToExcludeFromMinOrderTotalItem(CategoryDiscountCondition categoriesToExcludeFromMinOrderTotalItem) {
    if (this.categoriesToExcludeFromMinOrderTotal == null) {
      this.categoriesToExcludeFromMinOrderTotal = new ArrayList<>();
    }
    this.categoriesToExcludeFromMinOrderTotal.add(categoriesToExcludeFromMinOrderTotalItem);
    return this;
  }

   /**
   * List of categories to discount. When a discount applies to a category, all products in the category are discounted.
   * @return categoriesToExcludeFromMinOrderTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of categories to discount. When a discount applies to a category, all products in the category are discounted.")

  public List<CategoryDiscountCondition> getCategoriesToExcludeFromMinOrderTotal() {
    return categoriesToExcludeFromMinOrderTotal;
  }


  public void setCategoriesToExcludeFromMinOrderTotal(List<CategoryDiscountCondition> categoriesToExcludeFromMinOrderTotal) {
    this.categoriesToExcludeFromMinOrderTotal = categoriesToExcludeFromMinOrderTotal;
  }


  public CatalogAdminsDiscountCondition continuityRecurrenceSettings(ContinuityRecurrenceSettings continuityRecurrenceSettings) {
    
    this.continuityRecurrenceSettings = continuityRecurrenceSettings;
    return this;
  }

   /**
   * Get continuityRecurrenceSettings
   * @return continuityRecurrenceSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContinuityRecurrenceSettings getContinuityRecurrenceSettings() {
    return continuityRecurrenceSettings;
  }


  public void setContinuityRecurrenceSettings(ContinuityRecurrenceSettings continuityRecurrenceSettings) {
    this.continuityRecurrenceSettings = continuityRecurrenceSettings;
  }


  public CatalogAdminsDiscountCondition couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Code of the coupon associated with the discount (if a coupon code is required). The merchant can supply the code or the system can generate it.
   * @return couponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code of the coupon associated with the discount (if a coupon code is required). The merchant can supply the code or the system can generate it.")

  public String getCouponCode() {
    return couponCode;
  }


  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public CatalogAdminsDiscountCondition customerSegments(List<CatalogAdminsCustomerSegment> customerSegments) {
    
    this.customerSegments = customerSegments;
    return this;
  }

  public CatalogAdminsDiscountCondition addCustomerSegmentsItem(CatalogAdminsCustomerSegment customerSegmentsItem) {
    if (this.customerSegments == null) {
      this.customerSegments = new ArrayList<>();
    }
    this.customerSegments.add(customerSegmentsItem);
    return this;
  }

   /**
   * List of customer groups for which the discount applies
   * @return customerSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of customer groups for which the discount applies")

  public List<CatalogAdminsCustomerSegment> getCustomerSegments() {
    return customerSegments;
  }


  public void setCustomerSegments(List<CatalogAdminsCustomerSegment> customerSegments) {
    this.customerSegments = customerSegments;
  }


  public CatalogAdminsDiscountCondition excludedCategories(List<CategoryDiscountCondition> excludedCategories) {
    
    this.excludedCategories = excludedCategories;
    return this;
  }

  public CatalogAdminsDiscountCondition addExcludedCategoriesItem(CategoryDiscountCondition excludedCategoriesItem) {
    if (this.excludedCategories == null) {
      this.excludedCategories = new ArrayList<>();
    }
    this.excludedCategories.add(excludedCategoriesItem);
    return this;
  }

   /**
   * List of categories to discount. When a discount applies to a category, all products in the category are discounted.
   * @return excludedCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of categories to discount. When a discount applies to a category, all products in the category are discounted.")

  public List<CategoryDiscountCondition> getExcludedCategories() {
    return excludedCategories;
  }


  public void setExcludedCategories(List<CategoryDiscountCondition> excludedCategories) {
    this.excludedCategories = excludedCategories;
  }


  public CatalogAdminsDiscountCondition excludedProducts(List<ProductDiscountCondition> excludedProducts) {
    
    this.excludedProducts = excludedProducts;
    return this;
  }

  public CatalogAdminsDiscountCondition addExcludedProductsItem(ProductDiscountCondition excludedProductsItem) {
    if (this.excludedProducts == null) {
      this.excludedProducts = new ArrayList<>();
    }
    this.excludedProducts.add(excludedProductsItem);
    return this;
  }

   /**
   * List of products that are eligible for the discount.
   * @return excludedProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of products that are eligible for the discount.")

  public List<ProductDiscountCondition> getExcludedProducts() {
    return excludedProducts;
  }


  public void setExcludedProducts(List<ProductDiscountCondition> excludedProducts) {
    this.excludedProducts = excludedProducts;
  }


  public CatalogAdminsDiscountCondition exclusiveLocationCodes(List<String> exclusiveLocationCodes) {
    
    this.exclusiveLocationCodes = exclusiveLocationCodes;
    return this;
  }

  public CatalogAdminsDiscountCondition addExclusiveLocationCodesItem(String exclusiveLocationCodesItem) {
    if (this.exclusiveLocationCodes == null) {
      this.exclusiveLocationCodes = new ArrayList<>();
    }
    this.exclusiveLocationCodes.add(exclusiveLocationCodesItem);
    return this;
  }

   /**
   * List of locations where the item/order should be fulfilled for the discount to be valid.
   * @return exclusiveLocationCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of locations where the item/order should be fulfilled for the discount to be valid.")

  public List<String> getExclusiveLocationCodes() {
    return exclusiveLocationCodes;
  }


  public void setExclusiveLocationCodes(List<String> exclusiveLocationCodes) {
    this.exclusiveLocationCodes = exclusiveLocationCodes;
  }


  public CatalogAdminsDiscountCondition exclusiveSiteIds(List<Integer> exclusiveSiteIds) {
    
    this.exclusiveSiteIds = exclusiveSiteIds;
    return this;
  }

  public CatalogAdminsDiscountCondition addExclusiveSiteIdsItem(Integer exclusiveSiteIdsItem) {
    if (this.exclusiveSiteIds == null) {
      this.exclusiveSiteIds = new ArrayList<>();
    }
    this.exclusiveSiteIds.add(exclusiveSiteIdsItem);
    return this;
  }

   /**
   * The discount condition for site Ids, if present the discount will be applied only to these sites. If not present discount will work for all sites in a catalog.
   * @return exclusiveSiteIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The discount condition for site Ids, if present the discount will be applied only to these sites. If not present discount will work for all sites in a catalog.")

  public List<Integer> getExclusiveSiteIds() {
    return exclusiveSiteIds;
  }


  public void setExclusiveSiteIds(List<Integer> exclusiveSiteIds) {
    this.exclusiveSiteIds = exclusiveSiteIds;
  }


  public CatalogAdminsDiscountCondition expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Date when the discount expires. Default is null (no expiration date).
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the discount expires. Default is null (no expiration date).")

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public CatalogAdminsDiscountCondition expression(CatalogAdminsDynamicExpression expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsDynamicExpression getExpression() {
    return expression;
  }


  public void setExpression(CatalogAdminsDynamicExpression expression) {
    this.expression = expression;
  }


  public CatalogAdminsDiscountCondition includedCategories(List<CategoryDiscountCondition> includedCategories) {
    
    this.includedCategories = includedCategories;
    return this;
  }

  public CatalogAdminsDiscountCondition addIncludedCategoriesItem(CategoryDiscountCondition includedCategoriesItem) {
    if (this.includedCategories == null) {
      this.includedCategories = new ArrayList<>();
    }
    this.includedCategories.add(includedCategoriesItem);
    return this;
  }

   /**
   * List of categories that must be purchased in order for the discount to be valid.
   * @return includedCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of categories that must be purchased in order for the discount to be valid.")

  public List<CategoryDiscountCondition> getIncludedCategories() {
    return includedCategories;
  }


  public void setIncludedCategories(List<CategoryDiscountCondition> includedCategories) {
    this.includedCategories = includedCategories;
  }


  public CatalogAdminsDiscountCondition includedPaymentWorkflows(List<String> includedPaymentWorkflows) {
    
    this.includedPaymentWorkflows = includedPaymentWorkflows;
    return this;
  }

  public CatalogAdminsDiscountCondition addIncludedPaymentWorkflowsItem(String includedPaymentWorkflowsItem) {
    if (this.includedPaymentWorkflows == null) {
      this.includedPaymentWorkflows = new ArrayList<>();
    }
    this.includedPaymentWorkflows.add(includedPaymentWorkflowsItem);
    return this;
  }

   /**
   * List of payment types that trigger this discount to be valid.
   * @return includedPaymentWorkflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of payment types that trigger this discount to be valid.")

  public List<String> getIncludedPaymentWorkflows() {
    return includedPaymentWorkflows;
  }


  public void setIncludedPaymentWorkflows(List<String> includedPaymentWorkflows) {
    this.includedPaymentWorkflows = includedPaymentWorkflows;
  }


  public CatalogAdminsDiscountCondition includedProducts(List<ProductDiscountCondition> includedProducts) {
    
    this.includedProducts = includedProducts;
    return this;
  }

  public CatalogAdminsDiscountCondition addIncludedProductsItem(ProductDiscountCondition includedProductsItem) {
    if (this.includedProducts == null) {
      this.includedProducts = new ArrayList<>();
    }
    this.includedProducts.add(includedProductsItem);
    return this;
  }

   /**
   * List of products that are eligible for the discount.
   * @return includedProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of products that are eligible for the discount.")

  public List<ProductDiscountCondition> getIncludedProducts() {
    return includedProducts;
  }


  public void setIncludedProducts(List<ProductDiscountCondition> includedProducts) {
    this.includedProducts = includedProducts;
  }


  public CatalogAdminsDiscountCondition maxRedemptionCount(Integer maxRedemptionCount) {
    
    this.maxRedemptionCount = maxRedemptionCount;
    return this;
  }

   /**
   * Maximum number of times that the discount can be redeemed. Default is null (no limit to discount redemptions).
   * minimum: 0
   * @return maxRedemptionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of times that the discount can be redeemed. Default is null (no limit to discount redemptions).")

  public Integer getMaxRedemptionCount() {
    return maxRedemptionCount;
  }


  public void setMaxRedemptionCount(Integer maxRedemptionCount) {
    this.maxRedemptionCount = maxRedemptionCount;
  }


  public CatalogAdminsDiscountCondition maximumOrderAmount(Double maximumOrderAmount) {
    
    this.maximumOrderAmount = maximumOrderAmount;
    return this;
  }

   /**
   * Only applies to order. Maximum order subtotal after discounts in order for the associated discount to be applied
   * @return maximumOrderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only applies to order. Maximum order subtotal after discounts in order for the associated discount to be applied")

  public Double getMaximumOrderAmount() {
    return maximumOrderAmount;
  }


  public void setMaximumOrderAmount(Double maximumOrderAmount) {
    this.maximumOrderAmount = maximumOrderAmount;
  }


  public CatalogAdminsDiscountCondition minDistinctProductsRequired(Integer minDistinctProductsRequired) {
    
    this.minDistinctProductsRequired = minDistinctProductsRequired;
    return this;
  }

   /**
   * The minimum number of distinct products on the order Not a quantity calculation.
   * @return minDistinctProductsRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum number of distinct products on the order Not a quantity calculation.")

  public Integer getMinDistinctProductsRequired() {
    return minDistinctProductsRequired;
  }


  public void setMinDistinctProductsRequired(Integer minDistinctProductsRequired) {
    this.minDistinctProductsRequired = minDistinctProductsRequired;
  }


  public CatalogAdminsDiscountCondition minTotalOrderQuantity(Integer minTotalOrderQuantity) {
    
    this.minTotalOrderQuantity = minTotalOrderQuantity;
    return this;
  }

   /**
   * The order must contain at least this total quantity of items for the discount to apply. You must buy a combined quantity of at least x amount.
   * @return minTotalOrderQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order must contain at least this total quantity of items for the discount to apply. You must buy a combined quantity of at least x amount.")

  public Integer getMinTotalOrderQuantity() {
    return minTotalOrderQuantity;
  }


  public void setMinTotalOrderQuantity(Integer minTotalOrderQuantity) {
    this.minTotalOrderQuantity = minTotalOrderQuantity;
  }


  public CatalogAdminsDiscountCondition minimumCategorySubtotalBeforeDiscounts(Double minimumCategorySubtotalBeforeDiscounts) {
    
    this.minimumCategorySubtotalBeforeDiscounts = minimumCategorySubtotalBeforeDiscounts;
    return this;
  }

   /**
   * Minimum amount that must be purchased in the combined categories defined in  IncludedCategories.  Amount is calculated before discounting. Not used if IncludedCategories is empty.
   * @return minimumCategorySubtotalBeforeDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum amount that must be purchased in the combined categories defined in  IncludedCategories.  Amount is calculated before discounting. Not used if IncludedCategories is empty.")

  public Double getMinimumCategorySubtotalBeforeDiscounts() {
    return minimumCategorySubtotalBeforeDiscounts;
  }


  public void setMinimumCategorySubtotalBeforeDiscounts(Double minimumCategorySubtotalBeforeDiscounts) {
    this.minimumCategorySubtotalBeforeDiscounts = minimumCategorySubtotalBeforeDiscounts;
  }


  public CatalogAdminsDiscountCondition minimumLifetimeValueAmount(Double minimumLifetimeValueAmount) {
    
    this.minimumLifetimeValueAmount = minimumLifetimeValueAmount;
    return this;
  }

   /**
   * Minimum lifetime value amount required for this discount to apply
   * @return minimumLifetimeValueAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum lifetime value amount required for this discount to apply")

  public Double getMinimumLifetimeValueAmount() {
    return minimumLifetimeValueAmount;
  }


  public void setMinimumLifetimeValueAmount(Double minimumLifetimeValueAmount) {
    this.minimumLifetimeValueAmount = minimumLifetimeValueAmount;
  }


  public CatalogAdminsDiscountCondition minimumOrderAmount(Double minimumOrderAmount) {
    
    this.minimumOrderAmount = minimumOrderAmount;
    return this;
  }

   /**
   * Only applies to order. Minimum order subtotal after discounts in order for the associated discount to be applied
   * @return minimumOrderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only applies to order. Minimum order subtotal after discounts in order for the associated discount to be applied")

  public Double getMinimumOrderAmount() {
    return minimumOrderAmount;
  }


  public void setMinimumOrderAmount(Double minimumOrderAmount) {
    this.minimumOrderAmount = minimumOrderAmount;
  }


  public CatalogAdminsDiscountCondition minimumQuantityProductsRequiredInCategories(Integer minimumQuantityProductsRequiredInCategories) {
    
    this.minimumQuantityProductsRequiredInCategories = minimumQuantityProductsRequiredInCategories;
    return this;
  }

   /**
   * Minimum quantity of products in the categories specified in IncludedCategories that must be purchased to qualify for the associated discount. Defaults to 1 if  null and IncludedCategories has values
   * minimum: 0
   * @return minimumQuantityProductsRequiredInCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum quantity of products in the categories specified in IncludedCategories that must be purchased to qualify for the associated discount. Defaults to 1 if  null and IncludedCategories has values")

  public Integer getMinimumQuantityProductsRequiredInCategories() {
    return minimumQuantityProductsRequiredInCategories;
  }


  public void setMinimumQuantityProductsRequiredInCategories(Integer minimumQuantityProductsRequiredInCategories) {
    this.minimumQuantityProductsRequiredInCategories = minimumQuantityProductsRequiredInCategories;
  }


  public CatalogAdminsDiscountCondition minimumQuantityRequiredProducts(Integer minimumQuantityRequiredProducts) {
    
    this.minimumQuantityRequiredProducts = minimumQuantityRequiredProducts;
    return this;
  }

   /**
   * Minimum quantity of products in the specified IncludedProducts that must be purchased to qualify for the associated discount. Defaults to 1 if  null and IncludedProducts has values.
   * minimum: 0
   * @return minimumQuantityRequiredProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum quantity of products in the specified IncludedProducts that must be purchased to qualify for the associated discount. Defaults to 1 if  null and IncludedProducts has values.")

  public Integer getMinimumQuantityRequiredProducts() {
    return minimumQuantityRequiredProducts;
  }


  public void setMinimumQuantityRequiredProducts(Integer minimumQuantityRequiredProducts) {
    this.minimumQuantityRequiredProducts = minimumQuantityRequiredProducts;
  }


  public CatalogAdminsDiscountCondition minimumRequiredQuantityPerRedemption(Integer minimumRequiredQuantityPerRedemption) {
    
    this.minimumRequiredQuantityPerRedemption = minimumRequiredQuantityPerRedemption;
    return this;
  }

   /**
   * Defines a minimum quantity that is required for a target only discount
   * @return minimumRequiredQuantityPerRedemption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines a minimum quantity that is required for a target only discount")

  public Integer getMinimumRequiredQuantityPerRedemption() {
    return minimumRequiredQuantityPerRedemption;
  }


  public void setMinimumRequiredQuantityPerRedemption(Integer minimumRequiredQuantityPerRedemption) {
    this.minimumRequiredQuantityPerRedemption = minimumRequiredQuantityPerRedemption;
  }


  public CatalogAdminsDiscountCondition pricingContext(String pricingContext) {
    
    this.pricingContext = pricingContext;
    return this;
  }

   /**
   * The pricing context must match on this value for the discount to apply. This only matters for tenants that use subscription products
   * @return pricingContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pricing context must match on this value for the discount to apply. This only matters for tenants that use subscription products")

  public String getPricingContext() {
    return pricingContext;
  }


  public void setPricingContext(String pricingContext) {
    this.pricingContext = pricingContext;
  }


  public CatalogAdminsDiscountCondition productsToExcludeFromMinOrderTotal(List<ProductDiscountCondition> productsToExcludeFromMinOrderTotal) {
    
    this.productsToExcludeFromMinOrderTotal = productsToExcludeFromMinOrderTotal;
    return this;
  }

  public CatalogAdminsDiscountCondition addProductsToExcludeFromMinOrderTotalItem(ProductDiscountCondition productsToExcludeFromMinOrderTotalItem) {
    if (this.productsToExcludeFromMinOrderTotal == null) {
      this.productsToExcludeFromMinOrderTotal = new ArrayList<>();
    }
    this.productsToExcludeFromMinOrderTotal.add(productsToExcludeFromMinOrderTotalItem);
    return this;
  }

   /**
   * List of products that are eligible for the discount.
   * @return productsToExcludeFromMinOrderTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of products that are eligible for the discount.")

  public List<ProductDiscountCondition> getProductsToExcludeFromMinOrderTotal() {
    return productsToExcludeFromMinOrderTotal;
  }


  public void setProductsToExcludeFromMinOrderTotal(List<ProductDiscountCondition> productsToExcludeFromMinOrderTotal) {
    this.productsToExcludeFromMinOrderTotal = productsToExcludeFromMinOrderTotal;
  }


  public CatalogAdminsDiscountCondition requiresAuthenticatedUser(Boolean requiresAuthenticatedUser) {
    
    this.requiresAuthenticatedUser = requiresAuthenticatedUser;
    return this;
  }

   /**
   * Determines is this discount can be used by an anonymous user  Defaults to false to allow discounts for anonymous users.
   * @return requiresAuthenticatedUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines is this discount can be used by an anonymous user  Defaults to false to allow discounts for anonymous users.")

  public Boolean getRequiresAuthenticatedUser() {
    return requiresAuthenticatedUser;
  }


  public void setRequiresAuthenticatedUser(Boolean requiresAuthenticatedUser) {
    this.requiresAuthenticatedUser = requiresAuthenticatedUser;
  }


  public CatalogAdminsDiscountCondition requiresCoupon(Boolean requiresCoupon) {
    
    this.requiresCoupon = requiresCoupon;
    return this;
  }

   /**
   * If true, the shopper needs to enter a coupon code to redeem the discount.
   * @return requiresCoupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the shopper needs to enter a coupon code to redeem the discount.")

  public Boolean getRequiresCoupon() {
    return requiresCoupon;
  }


  public void setRequiresCoupon(Boolean requiresCoupon) {
    this.requiresCoupon = requiresCoupon;
  }


  public CatalogAdminsDiscountCondition startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date when the discount can goes into effect, in the format yyyy-mm-dd.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the discount can goes into effect, in the format yyyy-mm-dd.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CatalogAdminsDiscountCondition validFulfillmentMethods(List<String> validFulfillmentMethods) {
    
    this.validFulfillmentMethods = validFulfillmentMethods;
    return this;
  }

  public CatalogAdminsDiscountCondition addValidFulfillmentMethodsItem(String validFulfillmentMethodsItem) {
    if (this.validFulfillmentMethods == null) {
      this.validFulfillmentMethods = new ArrayList<>();
    }
    this.validFulfillmentMethods.add(validFulfillmentMethodsItem);
    return this;
  }

   /**
   * The discount condition for fulfillment methods, if present the discount will be applied only to these fulfillment methods. This must be a value defined in FulfillmentMethodConst below.
   * @return validFulfillmentMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The discount condition for fulfillment methods, if present the discount will be applied only to these fulfillment methods. This must be a value defined in FulfillmentMethodConst below.")

  public List<String> getValidFulfillmentMethods() {
    return validFulfillmentMethods;
  }


  public void setValidFulfillmentMethods(List<String> validFulfillmentMethods) {
    this.validFulfillmentMethods = validFulfillmentMethods;
  }


  public CatalogAdminsDiscountCondition validSubscriptionContinuityOrdinals(List<Integer> validSubscriptionContinuityOrdinals) {
    
    this.validSubscriptionContinuityOrdinals = validSubscriptionContinuityOrdinals;
    return this;
  }

  public CatalogAdminsDiscountCondition addValidSubscriptionContinuityOrdinalsItem(Integer validSubscriptionContinuityOrdinalsItem) {
    if (this.validSubscriptionContinuityOrdinals == null) {
      this.validSubscriptionContinuityOrdinals = new ArrayList<>();
    }
    this.validSubscriptionContinuityOrdinals.add(validSubscriptionContinuityOrdinalsItem);
    return this;
  }

   /**
   * Ordinals at which a continuity order should receive the discount.
   * @return validSubscriptionContinuityOrdinals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ordinals at which a continuity order should receive the discount.")

  public List<Integer> getValidSubscriptionContinuityOrdinals() {
    return validSubscriptionContinuityOrdinals;
  }


  public void setValidSubscriptionContinuityOrdinals(List<Integer> validSubscriptionContinuityOrdinals) {
    this.validSubscriptionContinuityOrdinals = validSubscriptionContinuityOrdinals;
  }


  public CatalogAdminsDiscountCondition validSubscriptionFrequencies(List<String> validSubscriptionFrequencies) {
    
    this.validSubscriptionFrequencies = validSubscriptionFrequencies;
    return this;
  }

  public CatalogAdminsDiscountCondition addValidSubscriptionFrequenciesItem(String validSubscriptionFrequenciesItem) {
    if (this.validSubscriptionFrequencies == null) {
      this.validSubscriptionFrequencies = new ArrayList<>();
    }
    this.validSubscriptionFrequencies.add(validSubscriptionFrequenciesItem);
    return this;
  }

   /**
   * List of subscription frequencies to which the discount will apply.
   * @return validSubscriptionFrequencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of subscription frequencies to which the discount will apply.")

  public List<String> getValidSubscriptionFrequencies() {
    return validSubscriptionFrequencies;
  }


  public void setValidSubscriptionFrequencies(List<String> validSubscriptionFrequencies) {
    this.validSubscriptionFrequencies = validSubscriptionFrequencies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsDiscountCondition catalogAdminsDiscountCondition = (CatalogAdminsDiscountCondition) o;
    return Objects.equals(this.categoriesToExcludeFromMinOrderTotal, catalogAdminsDiscountCondition.categoriesToExcludeFromMinOrderTotal) &&
        Objects.equals(this.continuityRecurrenceSettings, catalogAdminsDiscountCondition.continuityRecurrenceSettings) &&
        Objects.equals(this.couponCode, catalogAdminsDiscountCondition.couponCode) &&
        Objects.equals(this.customerSegments, catalogAdminsDiscountCondition.customerSegments) &&
        Objects.equals(this.excludedCategories, catalogAdminsDiscountCondition.excludedCategories) &&
        Objects.equals(this.excludedProducts, catalogAdminsDiscountCondition.excludedProducts) &&
        Objects.equals(this.exclusiveLocationCodes, catalogAdminsDiscountCondition.exclusiveLocationCodes) &&
        Objects.equals(this.exclusiveSiteIds, catalogAdminsDiscountCondition.exclusiveSiteIds) &&
        Objects.equals(this.expirationDate, catalogAdminsDiscountCondition.expirationDate) &&
        Objects.equals(this.expression, catalogAdminsDiscountCondition.expression) &&
        Objects.equals(this.includedCategories, catalogAdminsDiscountCondition.includedCategories) &&
        Objects.equals(this.includedPaymentWorkflows, catalogAdminsDiscountCondition.includedPaymentWorkflows) &&
        Objects.equals(this.includedProducts, catalogAdminsDiscountCondition.includedProducts) &&
        Objects.equals(this.maxRedemptionCount, catalogAdminsDiscountCondition.maxRedemptionCount) &&
        Objects.equals(this.maximumOrderAmount, catalogAdminsDiscountCondition.maximumOrderAmount) &&
        Objects.equals(this.minDistinctProductsRequired, catalogAdminsDiscountCondition.minDistinctProductsRequired) &&
        Objects.equals(this.minTotalOrderQuantity, catalogAdminsDiscountCondition.minTotalOrderQuantity) &&
        Objects.equals(this.minimumCategorySubtotalBeforeDiscounts, catalogAdminsDiscountCondition.minimumCategorySubtotalBeforeDiscounts) &&
        Objects.equals(this.minimumLifetimeValueAmount, catalogAdminsDiscountCondition.minimumLifetimeValueAmount) &&
        Objects.equals(this.minimumOrderAmount, catalogAdminsDiscountCondition.minimumOrderAmount) &&
        Objects.equals(this.minimumQuantityProductsRequiredInCategories, catalogAdminsDiscountCondition.minimumQuantityProductsRequiredInCategories) &&
        Objects.equals(this.minimumQuantityRequiredProducts, catalogAdminsDiscountCondition.minimumQuantityRequiredProducts) &&
        Objects.equals(this.minimumRequiredQuantityPerRedemption, catalogAdminsDiscountCondition.minimumRequiredQuantityPerRedemption) &&
        Objects.equals(this.pricingContext, catalogAdminsDiscountCondition.pricingContext) &&
        Objects.equals(this.productsToExcludeFromMinOrderTotal, catalogAdminsDiscountCondition.productsToExcludeFromMinOrderTotal) &&
        Objects.equals(this.requiresAuthenticatedUser, catalogAdminsDiscountCondition.requiresAuthenticatedUser) &&
        Objects.equals(this.requiresCoupon, catalogAdminsDiscountCondition.requiresCoupon) &&
        Objects.equals(this.startDate, catalogAdminsDiscountCondition.startDate) &&
        Objects.equals(this.validFulfillmentMethods, catalogAdminsDiscountCondition.validFulfillmentMethods) &&
        Objects.equals(this.validSubscriptionContinuityOrdinals, catalogAdminsDiscountCondition.validSubscriptionContinuityOrdinals) &&
        Objects.equals(this.validSubscriptionFrequencies, catalogAdminsDiscountCondition.validSubscriptionFrequencies);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoriesToExcludeFromMinOrderTotal, continuityRecurrenceSettings, couponCode, customerSegments, excludedCategories, excludedProducts, exclusiveLocationCodes, exclusiveSiteIds, expirationDate, expression, includedCategories, includedPaymentWorkflows, includedProducts, maxRedemptionCount, maximumOrderAmount, minDistinctProductsRequired, minTotalOrderQuantity, minimumCategorySubtotalBeforeDiscounts, minimumLifetimeValueAmount, minimumOrderAmount, minimumQuantityProductsRequiredInCategories, minimumQuantityRequiredProducts, minimumRequiredQuantityPerRedemption, pricingContext, productsToExcludeFromMinOrderTotal, requiresAuthenticatedUser, requiresCoupon, startDate, validFulfillmentMethods, validSubscriptionContinuityOrdinals, validSubscriptionFrequencies);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogAdminsDiscountCondition {\n");
    sb.append("    categoriesToExcludeFromMinOrderTotal: ").append(toIndentedString(categoriesToExcludeFromMinOrderTotal)).append("\n");
    sb.append("    continuityRecurrenceSettings: ").append(toIndentedString(continuityRecurrenceSettings)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    customerSegments: ").append(toIndentedString(customerSegments)).append("\n");
    sb.append("    excludedCategories: ").append(toIndentedString(excludedCategories)).append("\n");
    sb.append("    excludedProducts: ").append(toIndentedString(excludedProducts)).append("\n");
    sb.append("    exclusiveLocationCodes: ").append(toIndentedString(exclusiveLocationCodes)).append("\n");
    sb.append("    exclusiveSiteIds: ").append(toIndentedString(exclusiveSiteIds)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    includedCategories: ").append(toIndentedString(includedCategories)).append("\n");
    sb.append("    includedPaymentWorkflows: ").append(toIndentedString(includedPaymentWorkflows)).append("\n");
    sb.append("    includedProducts: ").append(toIndentedString(includedProducts)).append("\n");
    sb.append("    maxRedemptionCount: ").append(toIndentedString(maxRedemptionCount)).append("\n");
    sb.append("    maximumOrderAmount: ").append(toIndentedString(maximumOrderAmount)).append("\n");
    sb.append("    minDistinctProductsRequired: ").append(toIndentedString(minDistinctProductsRequired)).append("\n");
    sb.append("    minTotalOrderQuantity: ").append(toIndentedString(minTotalOrderQuantity)).append("\n");
    sb.append("    minimumCategorySubtotalBeforeDiscounts: ").append(toIndentedString(minimumCategorySubtotalBeforeDiscounts)).append("\n");
    sb.append("    minimumLifetimeValueAmount: ").append(toIndentedString(minimumLifetimeValueAmount)).append("\n");
    sb.append("    minimumOrderAmount: ").append(toIndentedString(minimumOrderAmount)).append("\n");
    sb.append("    minimumQuantityProductsRequiredInCategories: ").append(toIndentedString(minimumQuantityProductsRequiredInCategories)).append("\n");
    sb.append("    minimumQuantityRequiredProducts: ").append(toIndentedString(minimumQuantityRequiredProducts)).append("\n");
    sb.append("    minimumRequiredQuantityPerRedemption: ").append(toIndentedString(minimumRequiredQuantityPerRedemption)).append("\n");
    sb.append("    pricingContext: ").append(toIndentedString(pricingContext)).append("\n");
    sb.append("    productsToExcludeFromMinOrderTotal: ").append(toIndentedString(productsToExcludeFromMinOrderTotal)).append("\n");
    sb.append("    requiresAuthenticatedUser: ").append(toIndentedString(requiresAuthenticatedUser)).append("\n");
    sb.append("    requiresCoupon: ").append(toIndentedString(requiresCoupon)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    validFulfillmentMethods: ").append(toIndentedString(validFulfillmentMethods)).append("\n");
    sb.append("    validSubscriptionContinuityOrdinals: ").append(toIndentedString(validSubscriptionContinuityOrdinals)).append("\n");
    sb.append("    validSubscriptionFrequencies: ").append(toIndentedString(validSubscriptionFrequencies)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("categoriesToExcludeFromMinOrderTotal");
    openapiFields.add("continuityRecurrenceSettings");
    openapiFields.add("couponCode");
    openapiFields.add("customerSegments");
    openapiFields.add("excludedCategories");
    openapiFields.add("excludedProducts");
    openapiFields.add("exclusiveLocationCodes");
    openapiFields.add("exclusiveSiteIds");
    openapiFields.add("expirationDate");
    openapiFields.add("expression");
    openapiFields.add("includedCategories");
    openapiFields.add("includedPaymentWorkflows");
    openapiFields.add("includedProducts");
    openapiFields.add("maxRedemptionCount");
    openapiFields.add("maximumOrderAmount");
    openapiFields.add("minDistinctProductsRequired");
    openapiFields.add("minTotalOrderQuantity");
    openapiFields.add("minimumCategorySubtotalBeforeDiscounts");
    openapiFields.add("minimumLifetimeValueAmount");
    openapiFields.add("minimumOrderAmount");
    openapiFields.add("minimumQuantityProductsRequiredInCategories");
    openapiFields.add("minimumQuantityRequiredProducts");
    openapiFields.add("minimumRequiredQuantityPerRedemption");
    openapiFields.add("pricingContext");
    openapiFields.add("productsToExcludeFromMinOrderTotal");
    openapiFields.add("requiresAuthenticatedUser");
    openapiFields.add("requiresCoupon");
    openapiFields.add("startDate");
    openapiFields.add("validFulfillmentMethods");
    openapiFields.add("validSubscriptionContinuityOrdinals");
    openapiFields.add("validSubscriptionFrequencies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsDiscountCondition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsDiscountCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsDiscountCondition is not found in the empty JSON string", CatalogAdminsDiscountCondition.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsDiscountCondition.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsDiscountCondition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("categoriesToExcludeFromMinOrderTotal") != null && !jsonObj.get("categoriesToExcludeFromMinOrderTotal").isJsonNull()) {
        JsonArray jsonArraycategoriesToExcludeFromMinOrderTotal = jsonObj.getAsJsonArray("categoriesToExcludeFromMinOrderTotal");
        if (jsonArraycategoriesToExcludeFromMinOrderTotal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("categoriesToExcludeFromMinOrderTotal").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `categoriesToExcludeFromMinOrderTotal` to be an array in the JSON string but got `%s`", jsonObj.get("categoriesToExcludeFromMinOrderTotal").toString()));
          }

          // validate the optional field `categoriesToExcludeFromMinOrderTotal` (array)
          for (int i = 0; i < jsonArraycategoriesToExcludeFromMinOrderTotal.size(); i++) {
            CategoryDiscountCondition.validateJsonObject(jsonArraycategoriesToExcludeFromMinOrderTotal.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `continuityRecurrenceSettings`
      if (jsonObj.get("continuityRecurrenceSettings") != null && !jsonObj.get("continuityRecurrenceSettings").isJsonNull()) {
        ContinuityRecurrenceSettings.validateJsonObject(jsonObj.getAsJsonObject("continuityRecurrenceSettings"));
      }
      if ((jsonObj.get("couponCode") != null && !jsonObj.get("couponCode").isJsonNull()) && !jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
      if (jsonObj.get("customerSegments") != null && !jsonObj.get("customerSegments").isJsonNull()) {
        JsonArray jsonArraycustomerSegments = jsonObj.getAsJsonArray("customerSegments");
        if (jsonArraycustomerSegments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customerSegments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customerSegments` to be an array in the JSON string but got `%s`", jsonObj.get("customerSegments").toString()));
          }

          // validate the optional field `customerSegments` (array)
          for (int i = 0; i < jsonArraycustomerSegments.size(); i++) {
            CatalogAdminsCustomerSegment.validateJsonObject(jsonArraycustomerSegments.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("excludedCategories") != null && !jsonObj.get("excludedCategories").isJsonNull()) {
        JsonArray jsonArrayexcludedCategories = jsonObj.getAsJsonArray("excludedCategories");
        if (jsonArrayexcludedCategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excludedCategories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excludedCategories` to be an array in the JSON string but got `%s`", jsonObj.get("excludedCategories").toString()));
          }

          // validate the optional field `excludedCategories` (array)
          for (int i = 0; i < jsonArrayexcludedCategories.size(); i++) {
            CategoryDiscountCondition.validateJsonObject(jsonArrayexcludedCategories.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("excludedProducts") != null && !jsonObj.get("excludedProducts").isJsonNull()) {
        JsonArray jsonArrayexcludedProducts = jsonObj.getAsJsonArray("excludedProducts");
        if (jsonArrayexcludedProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excludedProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excludedProducts` to be an array in the JSON string but got `%s`", jsonObj.get("excludedProducts").toString()));
          }

          // validate the optional field `excludedProducts` (array)
          for (int i = 0; i < jsonArrayexcludedProducts.size(); i++) {
            ProductDiscountCondition.validateJsonObject(jsonArrayexcludedProducts.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("exclusiveLocationCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclusiveLocationCodes` to be an array in the JSON string but got `%s`", jsonObj.get("exclusiveLocationCodes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("exclusiveSiteIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclusiveSiteIds` to be an array in the JSON string but got `%s`", jsonObj.get("exclusiveSiteIds").toString()));
      }
      // validate the optional field `expression`
      if (jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) {
        CatalogAdminsDynamicExpression.validateJsonObject(jsonObj.getAsJsonObject("expression"));
      }
      if (jsonObj.get("includedCategories") != null && !jsonObj.get("includedCategories").isJsonNull()) {
        JsonArray jsonArrayincludedCategories = jsonObj.getAsJsonArray("includedCategories");
        if (jsonArrayincludedCategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("includedCategories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `includedCategories` to be an array in the JSON string but got `%s`", jsonObj.get("includedCategories").toString()));
          }

          // validate the optional field `includedCategories` (array)
          for (int i = 0; i < jsonArrayincludedCategories.size(); i++) {
            CategoryDiscountCondition.validateJsonObject(jsonArrayincludedCategories.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("includedPaymentWorkflows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedPaymentWorkflows` to be an array in the JSON string but got `%s`", jsonObj.get("includedPaymentWorkflows").toString()));
      }
      if (jsonObj.get("includedProducts") != null && !jsonObj.get("includedProducts").isJsonNull()) {
        JsonArray jsonArrayincludedProducts = jsonObj.getAsJsonArray("includedProducts");
        if (jsonArrayincludedProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("includedProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `includedProducts` to be an array in the JSON string but got `%s`", jsonObj.get("includedProducts").toString()));
          }

          // validate the optional field `includedProducts` (array)
          for (int i = 0; i < jsonArrayincludedProducts.size(); i++) {
            ProductDiscountCondition.validateJsonObject(jsonArrayincludedProducts.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("pricingContext") != null && !jsonObj.get("pricingContext").isJsonNull()) && !jsonObj.get("pricingContext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricingContext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricingContext").toString()));
      }
      if (jsonObj.get("productsToExcludeFromMinOrderTotal") != null && !jsonObj.get("productsToExcludeFromMinOrderTotal").isJsonNull()) {
        JsonArray jsonArrayproductsToExcludeFromMinOrderTotal = jsonObj.getAsJsonArray("productsToExcludeFromMinOrderTotal");
        if (jsonArrayproductsToExcludeFromMinOrderTotal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productsToExcludeFromMinOrderTotal").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productsToExcludeFromMinOrderTotal` to be an array in the JSON string but got `%s`", jsonObj.get("productsToExcludeFromMinOrderTotal").toString()));
          }

          // validate the optional field `productsToExcludeFromMinOrderTotal` (array)
          for (int i = 0; i < jsonArrayproductsToExcludeFromMinOrderTotal.size(); i++) {
            ProductDiscountCondition.validateJsonObject(jsonArrayproductsToExcludeFromMinOrderTotal.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("validFulfillmentMethods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validFulfillmentMethods` to be an array in the JSON string but got `%s`", jsonObj.get("validFulfillmentMethods").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("validSubscriptionContinuityOrdinals").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validSubscriptionContinuityOrdinals` to be an array in the JSON string but got `%s`", jsonObj.get("validSubscriptionContinuityOrdinals").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("validSubscriptionFrequencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validSubscriptionFrequencies` to be an array in the JSON string but got `%s`", jsonObj.get("validSubscriptionFrequencies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsDiscountCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsDiscountCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsDiscountCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsDiscountCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsDiscountCondition>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsDiscountCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsDiscountCondition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsDiscountCondition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsDiscountCondition
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsDiscountCondition
  */
  public static CatalogAdminsDiscountCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsDiscountCondition.class);
  }

 /**
  * Convert an instance of CatalogAdminsDiscountCondition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

