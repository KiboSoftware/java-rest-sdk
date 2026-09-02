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
import com.kibocommerce.sdk.catalogadministration.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDiscountCondition;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDiscountTarget;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsThresholdMessage;
import com.kibocommerce.sdk.catalogadministration.models.DiscountLocalizedContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * Allows you to define and manage discounts to apply to your products, product categories, or orders. The discounts can be a specified monetary amount off the price, percentage off the price, or for free shipping. You can create a coupon code that applies to the discount.
 */
@ApiModel(description = "Allows you to define and manage discounts to apply to your products, product categories, or orders. The discounts can be a specified monetary amount off the price, percentage off the price, or for free shipping. You can create a coupon code that applies to the discount.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsDiscount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_AMOUNT_TYPE = "amountType";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TYPE)
  private String amountType;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CAN_BE_DELETED = "canBeDeleted";
  @SerializedName(SERIALIZED_NAME_CAN_BE_DELETED)
  private Boolean canBeDeleted;

  public static final String SERIALIZED_NAME_CAN_BE_STACKED_UPON = "canBeStackedUpon";
  @SerializedName(SERIALIZED_NAME_CAN_BE_STACKED_UPON)
  private Boolean canBeStackedUpon;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private CatalogAdminsDiscountCondition conditions;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private DiscountLocalizedContent content;

  public static final String SERIALIZED_NAME_CURRENT_REDEMPTION_COUNT = "currentRedemptionCount";
  @SerializedName(SERIALIZED_NAME_CURRENT_REDEMPTION_COUNT)
  private Integer currentRedemptionCount;

  public static final String SERIALIZED_NAME_DOES_NOT_APPLY_TO_MULTI_SHIP_TO_ORDERS = "doesNotApplyToMultiShipToOrders";
  @SerializedName(SERIALIZED_NAME_DOES_NOT_APPLY_TO_MULTI_SHIP_TO_ORDERS)
  private Boolean doesNotApplyToMultiShipToOrders;

  public static final String SERIALIZED_NAME_DOES_NOT_APPLY_TO_PRODUCTS_WITH_SALE_PRICE = "doesNotApplyToProductsWithSalePrice";
  @SerializedName(SERIALIZED_NAME_DOES_NOT_APPLY_TO_PRODUCTS_WITH_SALE_PRICE)
  private Boolean doesNotApplyToProductsWithSalePrice;

  public static final String SERIALIZED_NAME_DOES_NOT_APPLY_TO_SALE_PRICE = "doesNotApplyToSalePrice";
  @SerializedName(SERIALIZED_NAME_DOES_NOT_APPLY_TO_SALE_PRICE)
  private Boolean doesNotApplyToSalePrice;

  public static final String SERIALIZED_NAME_HAS_PURCHASE_CONDITIONS = "hasPurchaseConditions";
  @SerializedName(SERIALIZED_NAME_HAS_PURCHASE_CONDITIONS)
  private Boolean hasPurchaseConditions;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INCLUDED_PRICE_LISTS = "includedPriceLists";
  @SerializedName(SERIALIZED_NAME_INCLUDED_PRICE_LISTS)
  private List<String> includedPriceLists = null;

  public static final String SERIALIZED_NAME_IS_BX_GX = "isBxGx";
  @SerializedName(SERIALIZED_NAME_IS_BX_GX)
  private Boolean isBxGx;

  public static final String SERIALIZED_NAME_IS_DISABLED = "isDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED)
  private Boolean isDisabled;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "isPublic";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_IS_SUBSCRIPTION_DISCOUNT = "isSubscriptionDiscount";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIPTION_DISCOUNT)
  private Boolean isSubscriptionDiscount;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_LOCALIZED_CONTENT = "localizedContent";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_CONTENT)
  private List<DiscountLocalizedContent> localizedContent = null;

  public static final String SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_ORDER = "maximumDiscountImpactPerOrder";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_ORDER)
  private Double maximumDiscountImpactPerOrder;

  public static final String SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_REDEMPTION = "maximumDiscountImpactPerRedemption";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_REDEMPTION)
  private Double maximumDiscountImpactPerRedemption;

  public static final String SERIALIZED_NAME_MAXIMUM_REDEMPTIONS_PER_ORDER = "maximumRedemptionsPerOrder";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_REDEMPTIONS_PER_ORDER)
  private Integer maximumRedemptionsPerOrder;

  public static final String SERIALIZED_NAME_MAXIMUM_USES_PER_USER = "maximumUsesPerUser";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_USES_PER_USER)
  private Integer maximumUsesPerUser;

  public static final String SERIALIZED_NAME_PREVENT_LINE_ITEM_SHIPPING_DISCOUNTS = "preventLineItemShippingDiscounts";
  @SerializedName(SERIALIZED_NAME_PREVENT_LINE_ITEM_SHIPPING_DISCOUNTS)
  private Boolean preventLineItemShippingDiscounts;

  public static final String SERIALIZED_NAME_PREVENT_ORDER_PRODUCT_DISCOUNTS = "preventOrderProductDiscounts";
  @SerializedName(SERIALIZED_NAME_PREVENT_ORDER_PRODUCT_DISCOUNTS)
  private Boolean preventOrderProductDiscounts;

  public static final String SERIALIZED_NAME_PREVENT_ORDER_SHIPPING_DISCOUNTS = "preventOrderShippingDiscounts";
  @SerializedName(SERIALIZED_NAME_PREVENT_ORDER_SHIPPING_DISCOUNTS)
  private Boolean preventOrderShippingDiscounts;

  public static final String SERIALIZED_NAME_PURCHASE_REQUIREMENT_TYPE = "purchaseRequirementType";
  @SerializedName(SERIALIZED_NAME_PURCHASE_REQUIREMENT_TYPE)
  private String purchaseRequirementType;

  public static final String SERIALIZED_NAME_REEVAL_FREE_ITEM_MIN_ORDER_POST_DISCOUNTS = "reevalFreeItemMinOrderPostDiscounts";
  @SerializedName(SERIALIZED_NAME_REEVAL_FREE_ITEM_MIN_ORDER_POST_DISCOUNTS)
  private Boolean reevalFreeItemMinOrderPostDiscounts;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_STACKING_LAYER = "stackingLayer";
  @SerializedName(SERIALIZED_NAME_STACKING_LAYER)
  private Integer stackingLayer;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TAG_CODES = "tagCodes";
  @SerializedName(SERIALIZED_NAME_TAG_CODES)
  private List<String> tagCodes = null;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private CatalogAdminsDiscountTarget target;

  public static final String SERIALIZED_NAME_THRESHOLD_MESSAGE = "thresholdMessage";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_MESSAGE)
  private CatalogAdminsThresholdMessage thresholdMessage;

  public CatalogAdminsDiscount() {
  }

  public CatalogAdminsDiscount amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   *     Amount of the discount, as a percentage or monetary amount, for example 15% or $15. Must be either null or greater than zero.
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "    Amount of the discount, as a percentage or monetary amount, for example 15% or $15. Must be either null or greater than zero.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public CatalogAdminsDiscount amountType(String amountType) {
    
    this.amountType = amountType;
    return this;
  }

   /**
   * Type of discount, which can be either a percentage off the price,  a specific monetary amount, or free.  Possible values:   Percentage   Amount   Free  FixedPrice
   * @return amountType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of discount, which can be either a percentage off the price,  a specific monetary amount, or free.  Possible values:   Percentage   Amount   Free  FixedPrice")

  public String getAmountType() {
    return amountType;
  }


  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }


  public CatalogAdminsDiscount auditInfo(AdminUserAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminUserAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AdminUserAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }


  public CatalogAdminsDiscount canBeDeleted(Boolean canBeDeleted) {
    
    this.canBeDeleted = canBeDeleted;
    return this;
  }

   /**
   * Signifies that the discount is not referenced and can be hard deleted
   * @return canBeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signifies that the discount is not referenced and can be hard deleted")

  public Boolean getCanBeDeleted() {
    return canBeDeleted;
  }


  public void setCanBeDeleted(Boolean canBeDeleted) {
    this.canBeDeleted = canBeDeleted;
  }


  public CatalogAdminsDiscount canBeStackedUpon(Boolean canBeStackedUpon) {
    
    this.canBeStackedUpon = canBeStackedUpon;
    return this;
  }

   /**
   * Indicates whether or not stacking is enabled for this discount
   * @return canBeStackedUpon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not stacking is enabled for this discount")

  public Boolean getCanBeStackedUpon() {
    return canBeStackedUpon;
  }


  public void setCanBeStackedUpon(Boolean canBeStackedUpon) {
    this.canBeStackedUpon = canBeStackedUpon;
  }


  public CatalogAdminsDiscount code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Indicates unique code for the discount, if not present Discount Id is used as a code.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates unique code for the discount, if not present Discount Id is used as a code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CatalogAdminsDiscount conditions(CatalogAdminsDiscountCondition conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsDiscountCondition getConditions() {
    return conditions;
  }


  public void setConditions(CatalogAdminsDiscountCondition conditions) {
    this.conditions = conditions;
  }


  public CatalogAdminsDiscount content(DiscountLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscountLocalizedContent getContent() {
    return content;
  }


  public void setContent(DiscountLocalizedContent content) {
    this.content = content;
  }


  public CatalogAdminsDiscount currentRedemptionCount(Integer currentRedemptionCount) {
    
    this.currentRedemptionCount = currentRedemptionCount;
    return this;
  }

   /**
   * How many times this discount has been redeemed. System-supplied and read-only.
   * @return currentRedemptionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many times this discount has been redeemed. System-supplied and read-only.")

  public Integer getCurrentRedemptionCount() {
    return currentRedemptionCount;
  }


  public void setCurrentRedemptionCount(Integer currentRedemptionCount) {
    this.currentRedemptionCount = currentRedemptionCount;
  }


  public CatalogAdminsDiscount doesNotApplyToMultiShipToOrders(Boolean doesNotApplyToMultiShipToOrders) {
    
    this.doesNotApplyToMultiShipToOrders = doesNotApplyToMultiShipToOrders;
    return this;
  }

   /**
   * Flag to allow or prevent application to multi-ship-to orders, Only applicable to shipping discounts.
   * @return doesNotApplyToMultiShipToOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag to allow or prevent application to multi-ship-to orders, Only applicable to shipping discounts.")

  public Boolean getDoesNotApplyToMultiShipToOrders() {
    return doesNotApplyToMultiShipToOrders;
  }


  public void setDoesNotApplyToMultiShipToOrders(Boolean doesNotApplyToMultiShipToOrders) {
    this.doesNotApplyToMultiShipToOrders = doesNotApplyToMultiShipToOrders;
  }


  public CatalogAdminsDiscount doesNotApplyToProductsWithSalePrice(Boolean doesNotApplyToProductsWithSalePrice) {
    
    this.doesNotApplyToProductsWithSalePrice = doesNotApplyToProductsWithSalePrice;
    return this;
  }

   /**
   * Determines whether or not a discount applies to a items with a sale price.  Applicable  on order and line item discounts.  For line items, when this is true, the discount will  be disqualified.  For order level discounts, when true, the discount will not be applied  to those items have a sale price.
   * @return doesNotApplyToProductsWithSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether or not a discount applies to a items with a sale price.  Applicable  on order and line item discounts.  For line items, when this is true, the discount will  be disqualified.  For order level discounts, when true, the discount will not be applied  to those items have a sale price.")

  public Boolean getDoesNotApplyToProductsWithSalePrice() {
    return doesNotApplyToProductsWithSalePrice;
  }


  public void setDoesNotApplyToProductsWithSalePrice(Boolean doesNotApplyToProductsWithSalePrice) {
    this.doesNotApplyToProductsWithSalePrice = doesNotApplyToProductsWithSalePrice;
  }


  public CatalogAdminsDiscount doesNotApplyToSalePrice(Boolean doesNotApplyToSalePrice) {
    
    this.doesNotApplyToSalePrice = doesNotApplyToSalePrice;
    return this;
  }

   /**
   * Determines if the discount should apply to sale price or regular price only. Discounts will apply to sale prices by default. Only applies to LineItem product discounts.
   * @return doesNotApplyToSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if the discount should apply to sale price or regular price only. Discounts will apply to sale prices by default. Only applies to LineItem product discounts.")

  public Boolean getDoesNotApplyToSalePrice() {
    return doesNotApplyToSalePrice;
  }


  public void setDoesNotApplyToSalePrice(Boolean doesNotApplyToSalePrice) {
    this.doesNotApplyToSalePrice = doesNotApplyToSalePrice;
  }


  public CatalogAdminsDiscount hasPurchaseConditions(Boolean hasPurchaseConditions) {
    
    this.hasPurchaseConditions = hasPurchaseConditions;
    return this;
  }

   /**
   * Indicates if this discount has purchase conditions that must be met before  the discount is applied
   * @return hasPurchaseConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if this discount has purchase conditions that must be met before  the discount is applied")

  public Boolean getHasPurchaseConditions() {
    return hasPurchaseConditions;
  }


  public void setHasPurchaseConditions(Boolean hasPurchaseConditions) {
    this.hasPurchaseConditions = hasPurchaseConditions;
  }


  public CatalogAdminsDiscount id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the discount. System-supplied and read-only.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the discount. System-supplied and read-only.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CatalogAdminsDiscount includedPriceLists(List<String> includedPriceLists) {
    
    this.includedPriceLists = includedPriceLists;
    return this;
  }

  public CatalogAdminsDiscount addIncludedPriceListsItem(String includedPriceListsItem) {
    if (this.includedPriceLists == null) {
      this.includedPriceLists = new ArrayList<>();
    }
    this.includedPriceLists.add(includedPriceListsItem);
    return this;
  }

   /**
   * Products receiving a price from a price list specified here or a child of a specified  price list can be discounted.
   * @return includedPriceLists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Products receiving a price from a price list specified here or a child of a specified  price list can be discounted.")

  public List<String> getIncludedPriceLists() {
    return includedPriceLists;
  }


  public void setIncludedPriceLists(List<String> includedPriceLists) {
    this.includedPriceLists = includedPriceLists;
  }


  public CatalogAdminsDiscount isBxGx(Boolean isBxGx) {
    
    this.isBxGx = isBxGx;
    return this;
  }

   /**
   * Readonly property indicating that the condition required purchase is the  same as the target items.  Used in BxGx and BoGo type discounts.
   * @return isBxGx
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Readonly property indicating that the condition required purchase is the  same as the target items.  Used in BxGx and BoGo type discounts.")

  public Boolean getIsBxGx() {
    return isBxGx;
  }


  public void setIsBxGx(Boolean isBxGx) {
    this.isBxGx = isBxGx;
  }


  public CatalogAdminsDiscount isDisabled(Boolean isDisabled) {
    
    this.isDisabled = isDisabled;
    return this;
  }

   /**
   * Signifies if the discount is disabled (Null is treated as false)
   * @return isDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signifies if the discount is disabled (Null is treated as false)")

  public Boolean getIsDisabled() {
    return isDisabled;
  }


  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }


  public CatalogAdminsDiscount isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Determines whether the discount is available for every shopper.
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the discount is available for every shopper.")

  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public CatalogAdminsDiscount isSubscriptionDiscount(Boolean isSubscriptionDiscount) {
    
    this.isSubscriptionDiscount = isSubscriptionDiscount;
    return this;
  }

   /**
   * Determines how discounts will be evaluated for subscription items and during continuity orders.
   * @return isSubscriptionDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines how discounts will be evaluated for subscription items and during continuity orders.")

  public Boolean getIsSubscriptionDiscount() {
    return isSubscriptionDiscount;
  }


  public void setIsSubscriptionDiscount(Boolean isSubscriptionDiscount) {
    this.isSubscriptionDiscount = isSubscriptionDiscount;
  }


  public CatalogAdminsDiscount labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public CatalogAdminsDiscount addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Indicates unique discount labels.
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates unique discount labels.")

  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public CatalogAdminsDiscount localizedContent(List<DiscountLocalizedContent> localizedContent) {
    
    this.localizedContent = localizedContent;
    return this;
  }

  public CatalogAdminsDiscount addLocalizedContentItem(DiscountLocalizedContent localizedContentItem) {
    if (this.localizedContent == null) {
      this.localizedContent = new ArrayList<>();
    }
    this.localizedContent.add(localizedContentItem);
    return this;
  }

   /**
   * Container for the language-specific name of the discount. You will have a container for each supported language (LocaleCode). This enables you to display the discount name in multiple languages yet manage it as a single discount internally.
   * @return localizedContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container for the language-specific name of the discount. You will have a container for each supported language (LocaleCode). This enables you to display the discount name in multiple languages yet manage it as a single discount internally.")

  public List<DiscountLocalizedContent> getLocalizedContent() {
    return localizedContent;
  }


  public void setLocalizedContent(List<DiscountLocalizedContent> localizedContent) {
    this.localizedContent = localizedContent;
  }


  public CatalogAdminsDiscount maximumDiscountImpactPerOrder(Double maximumDiscountImpactPerOrder) {
    
    this.maximumDiscountImpactPerOrder = maximumDiscountImpactPerOrder;
    return this;
  }

   /**
   * Maximum impact this discount can apply on a single order.  Must be either null or greater than zero.
   * minimum: 0
   * @return maximumDiscountImpactPerOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum impact this discount can apply on a single order.  Must be either null or greater than zero.")

  public Double getMaximumDiscountImpactPerOrder() {
    return maximumDiscountImpactPerOrder;
  }


  public void setMaximumDiscountImpactPerOrder(Double maximumDiscountImpactPerOrder) {
    this.maximumDiscountImpactPerOrder = maximumDiscountImpactPerOrder;
  }


  public CatalogAdminsDiscount maximumDiscountImpactPerRedemption(Double maximumDiscountImpactPerRedemption) {
    
    this.maximumDiscountImpactPerRedemption = maximumDiscountImpactPerRedemption;
    return this;
  }

   /**
   * Maximum impact this discount can apply on a single line item.  Must be either null or greater than zero.
   * minimum: 0
   * @return maximumDiscountImpactPerRedemption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum impact this discount can apply on a single line item.  Must be either null or greater than zero.")

  public Double getMaximumDiscountImpactPerRedemption() {
    return maximumDiscountImpactPerRedemption;
  }


  public void setMaximumDiscountImpactPerRedemption(Double maximumDiscountImpactPerRedemption) {
    this.maximumDiscountImpactPerRedemption = maximumDiscountImpactPerRedemption;
  }


  public CatalogAdminsDiscount maximumRedemptionsPerOrder(Integer maximumRedemptionsPerOrder) {
    
    this.maximumRedemptionsPerOrder = maximumRedemptionsPerOrder;
    return this;
  }

   /**
   * Maximum number of redemptions allowed per order. If null, defaults to unlimited.
   * minimum: 0
   * @return maximumRedemptionsPerOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of redemptions allowed per order. If null, defaults to unlimited.")

  public Integer getMaximumRedemptionsPerOrder() {
    return maximumRedemptionsPerOrder;
  }


  public void setMaximumRedemptionsPerOrder(Integer maximumRedemptionsPerOrder) {
    this.maximumRedemptionsPerOrder = maximumRedemptionsPerOrder;
  }


  public CatalogAdminsDiscount maximumUsesPerUser(Integer maximumUsesPerUser) {
    
    this.maximumUsesPerUser = maximumUsesPerUser;
    return this;
  }

   /**
   * Maximum number of times a user can redeem this discount.  Must be either null or greater than zero.
   * minimum: 0
   * @return maximumUsesPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of times a user can redeem this discount.  Must be either null or greater than zero.")

  public Integer getMaximumUsesPerUser() {
    return maximumUsesPerUser;
  }


  public void setMaximumUsesPerUser(Integer maximumUsesPerUser) {
    this.maximumUsesPerUser = maximumUsesPerUser;
  }


  public CatalogAdminsDiscount preventLineItemShippingDiscounts(Boolean preventLineItemShippingDiscounts) {
    
    this.preventLineItemShippingDiscounts = preventLineItemShippingDiscounts;
    return this;
  }

   /**
   * Prevents Line Item Shipping discounts from being applied when a Line Item Product   discount has been applied
   * @return preventLineItemShippingDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevents Line Item Shipping discounts from being applied when a Line Item Product   discount has been applied")

  public Boolean getPreventLineItemShippingDiscounts() {
    return preventLineItemShippingDiscounts;
  }


  public void setPreventLineItemShippingDiscounts(Boolean preventLineItemShippingDiscounts) {
    this.preventLineItemShippingDiscounts = preventLineItemShippingDiscounts;
  }


  public CatalogAdminsDiscount preventOrderProductDiscounts(Boolean preventOrderProductDiscounts) {
    
    this.preventOrderProductDiscounts = preventOrderProductDiscounts;
    return this;
  }

   /**
   * Prevents Order Product discounts from being applied when a Line Item Product   or Shipping discount has been applied
   * @return preventOrderProductDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevents Order Product discounts from being applied when a Line Item Product   or Shipping discount has been applied")

  public Boolean getPreventOrderProductDiscounts() {
    return preventOrderProductDiscounts;
  }


  public void setPreventOrderProductDiscounts(Boolean preventOrderProductDiscounts) {
    this.preventOrderProductDiscounts = preventOrderProductDiscounts;
  }


  public CatalogAdminsDiscount preventOrderShippingDiscounts(Boolean preventOrderShippingDiscounts) {
    
    this.preventOrderShippingDiscounts = preventOrderShippingDiscounts;
    return this;
  }

   /**
   * Prevents Order Shipping discounts from being applied when a Line Item Product/Shipping   or Order Product discount has been applied
   * @return preventOrderShippingDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prevents Order Shipping discounts from being applied when a Line Item Product/Shipping   or Order Product discount has been applied")

  public Boolean getPreventOrderShippingDiscounts() {
    return preventOrderShippingDiscounts;
  }


  public void setPreventOrderShippingDiscounts(Boolean preventOrderShippingDiscounts) {
    this.preventOrderShippingDiscounts = preventOrderShippingDiscounts;
  }


  public CatalogAdminsDiscount purchaseRequirementType(String purchaseRequirementType) {
    
    this.purchaseRequirementType = purchaseRequirementType;
    return this;
  }

   /**
   * The type of purchase requirement for this discount, either purchase conditions and targets which    Supports BoGo, and BxGx scenarios. Or Target only that only have a target and no purchase conditions
   * @return purchaseRequirementType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of purchase requirement for this discount, either purchase conditions and targets which    Supports BoGo, and BxGx scenarios. Or Target only that only have a target and no purchase conditions")

  public String getPurchaseRequirementType() {
    return purchaseRequirementType;
  }


  public void setPurchaseRequirementType(String purchaseRequirementType) {
    this.purchaseRequirementType = purchaseRequirementType;
  }


  public CatalogAdminsDiscount reevalFreeItemMinOrderPostDiscounts(Boolean reevalFreeItemMinOrderPostDiscounts) {
    
    this.reevalFreeItemMinOrderPostDiscounts = reevalFreeItemMinOrderPostDiscounts;
    return this;
  }

   /**
   * Enables post-order-discount minimum re-evaluation for eligible free-item discounts. Values null and false are treated as disabled.
   * @return reevalFreeItemMinOrderPostDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enables post-order-discount minimum re-evaluation for eligible free-item discounts. Values null and false are treated as disabled.")

  public Boolean getReevalFreeItemMinOrderPostDiscounts() {
    return reevalFreeItemMinOrderPostDiscounts;
  }


  public void setReevalFreeItemMinOrderPostDiscounts(Boolean reevalFreeItemMinOrderPostDiscounts) {
    this.reevalFreeItemMinOrderPostDiscounts = reevalFreeItemMinOrderPostDiscounts;
  }


  public CatalogAdminsDiscount scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope to which the discount applies, valid values are: Order, LineItem
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Scope to which the discount applies, valid values are: Order, LineItem")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public CatalogAdminsDiscount stackingLayer(Integer stackingLayer) {
    
    this.stackingLayer = stackingLayer;
    return this;
  }

   /**
   * Indicates which stacking layer this discount is a part of
   * @return stackingLayer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates which stacking layer this discount is a part of")

  public Integer getStackingLayer() {
    return stackingLayer;
  }


  public void setStackingLayer(Integer stackingLayer) {
    this.stackingLayer = stackingLayer;
  }


  public CatalogAdminsDiscount status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Discount status which can be \&quot;Active,\&quot; \&quot;Scheduled,\&quot; or \&quot;Expired.\&quot; System-supplied and read-only.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Discount status which can be \"Active,\" \"Scheduled,\" or \"Expired.\" System-supplied and read-only.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CatalogAdminsDiscount tagCodes(List<String> tagCodes) {
    
    this.tagCodes = tagCodes;
    return this;
  }

  public CatalogAdminsDiscount addTagCodesItem(String tagCodesItem) {
    if (this.tagCodes == null) {
      this.tagCodes = new ArrayList<>();
    }
    this.tagCodes.add(tagCodesItem);
    return this;
  }

   /**
   * System-supplied and read-only.
   * @return tagCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "System-supplied and read-only.")

  public List<String> getTagCodes() {
    return tagCodes;
  }


  public void setTagCodes(List<String> tagCodes) {
    this.tagCodes = tagCodes;
  }


  public CatalogAdminsDiscount target(CatalogAdminsDiscountTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CatalogAdminsDiscountTarget getTarget() {
    return target;
  }


  public void setTarget(CatalogAdminsDiscountTarget target) {
    this.target = target;
  }


  public CatalogAdminsDiscount thresholdMessage(CatalogAdminsThresholdMessage thresholdMessage) {
    
    this.thresholdMessage = thresholdMessage;
    return this;
  }

   /**
   * Get thresholdMessage
   * @return thresholdMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsThresholdMessage getThresholdMessage() {
    return thresholdMessage;
  }


  public void setThresholdMessage(CatalogAdminsThresholdMessage thresholdMessage) {
    this.thresholdMessage = thresholdMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsDiscount catalogAdminsDiscount = (CatalogAdminsDiscount) o;
    return Objects.equals(this.amount, catalogAdminsDiscount.amount) &&
        Objects.equals(this.amountType, catalogAdminsDiscount.amountType) &&
        Objects.equals(this.auditInfo, catalogAdminsDiscount.auditInfo) &&
        Objects.equals(this.canBeDeleted, catalogAdminsDiscount.canBeDeleted) &&
        Objects.equals(this.canBeStackedUpon, catalogAdminsDiscount.canBeStackedUpon) &&
        Objects.equals(this.code, catalogAdminsDiscount.code) &&
        Objects.equals(this.conditions, catalogAdminsDiscount.conditions) &&
        Objects.equals(this.content, catalogAdminsDiscount.content) &&
        Objects.equals(this.currentRedemptionCount, catalogAdminsDiscount.currentRedemptionCount) &&
        Objects.equals(this.doesNotApplyToMultiShipToOrders, catalogAdminsDiscount.doesNotApplyToMultiShipToOrders) &&
        Objects.equals(this.doesNotApplyToProductsWithSalePrice, catalogAdminsDiscount.doesNotApplyToProductsWithSalePrice) &&
        Objects.equals(this.doesNotApplyToSalePrice, catalogAdminsDiscount.doesNotApplyToSalePrice) &&
        Objects.equals(this.hasPurchaseConditions, catalogAdminsDiscount.hasPurchaseConditions) &&
        Objects.equals(this.id, catalogAdminsDiscount.id) &&
        Objects.equals(this.includedPriceLists, catalogAdminsDiscount.includedPriceLists) &&
        Objects.equals(this.isBxGx, catalogAdminsDiscount.isBxGx) &&
        Objects.equals(this.isDisabled, catalogAdminsDiscount.isDisabled) &&
        Objects.equals(this.isPublic, catalogAdminsDiscount.isPublic) &&
        Objects.equals(this.isSubscriptionDiscount, catalogAdminsDiscount.isSubscriptionDiscount) &&
        Objects.equals(this.labels, catalogAdminsDiscount.labels) &&
        Objects.equals(this.localizedContent, catalogAdminsDiscount.localizedContent) &&
        Objects.equals(this.maximumDiscountImpactPerOrder, catalogAdminsDiscount.maximumDiscountImpactPerOrder) &&
        Objects.equals(this.maximumDiscountImpactPerRedemption, catalogAdminsDiscount.maximumDiscountImpactPerRedemption) &&
        Objects.equals(this.maximumRedemptionsPerOrder, catalogAdminsDiscount.maximumRedemptionsPerOrder) &&
        Objects.equals(this.maximumUsesPerUser, catalogAdminsDiscount.maximumUsesPerUser) &&
        Objects.equals(this.preventLineItemShippingDiscounts, catalogAdminsDiscount.preventLineItemShippingDiscounts) &&
        Objects.equals(this.preventOrderProductDiscounts, catalogAdminsDiscount.preventOrderProductDiscounts) &&
        Objects.equals(this.preventOrderShippingDiscounts, catalogAdminsDiscount.preventOrderShippingDiscounts) &&
        Objects.equals(this.purchaseRequirementType, catalogAdminsDiscount.purchaseRequirementType) &&
        Objects.equals(this.reevalFreeItemMinOrderPostDiscounts, catalogAdminsDiscount.reevalFreeItemMinOrderPostDiscounts) &&
        Objects.equals(this.scope, catalogAdminsDiscount.scope) &&
        Objects.equals(this.stackingLayer, catalogAdminsDiscount.stackingLayer) &&
        Objects.equals(this.status, catalogAdminsDiscount.status) &&
        Objects.equals(this.tagCodes, catalogAdminsDiscount.tagCodes) &&
        Objects.equals(this.target, catalogAdminsDiscount.target) &&
        Objects.equals(this.thresholdMessage, catalogAdminsDiscount.thresholdMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountType, auditInfo, canBeDeleted, canBeStackedUpon, code, conditions, content, currentRedemptionCount, doesNotApplyToMultiShipToOrders, doesNotApplyToProductsWithSalePrice, doesNotApplyToSalePrice, hasPurchaseConditions, id, includedPriceLists, isBxGx, isDisabled, isPublic, isSubscriptionDiscount, labels, localizedContent, maximumDiscountImpactPerOrder, maximumDiscountImpactPerRedemption, maximumRedemptionsPerOrder, maximumUsesPerUser, preventLineItemShippingDiscounts, preventOrderProductDiscounts, preventOrderShippingDiscounts, purchaseRequirementType, reevalFreeItemMinOrderPostDiscounts, scope, stackingLayer, status, tagCodes, target, thresholdMessage);
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
    sb.append("class CatalogAdminsDiscount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    canBeDeleted: ").append(toIndentedString(canBeDeleted)).append("\n");
    sb.append("    canBeStackedUpon: ").append(toIndentedString(canBeStackedUpon)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    currentRedemptionCount: ").append(toIndentedString(currentRedemptionCount)).append("\n");
    sb.append("    doesNotApplyToMultiShipToOrders: ").append(toIndentedString(doesNotApplyToMultiShipToOrders)).append("\n");
    sb.append("    doesNotApplyToProductsWithSalePrice: ").append(toIndentedString(doesNotApplyToProductsWithSalePrice)).append("\n");
    sb.append("    doesNotApplyToSalePrice: ").append(toIndentedString(doesNotApplyToSalePrice)).append("\n");
    sb.append("    hasPurchaseConditions: ").append(toIndentedString(hasPurchaseConditions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includedPriceLists: ").append(toIndentedString(includedPriceLists)).append("\n");
    sb.append("    isBxGx: ").append(toIndentedString(isBxGx)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isSubscriptionDiscount: ").append(toIndentedString(isSubscriptionDiscount)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localizedContent: ").append(toIndentedString(localizedContent)).append("\n");
    sb.append("    maximumDiscountImpactPerOrder: ").append(toIndentedString(maximumDiscountImpactPerOrder)).append("\n");
    sb.append("    maximumDiscountImpactPerRedemption: ").append(toIndentedString(maximumDiscountImpactPerRedemption)).append("\n");
    sb.append("    maximumRedemptionsPerOrder: ").append(toIndentedString(maximumRedemptionsPerOrder)).append("\n");
    sb.append("    maximumUsesPerUser: ").append(toIndentedString(maximumUsesPerUser)).append("\n");
    sb.append("    preventLineItemShippingDiscounts: ").append(toIndentedString(preventLineItemShippingDiscounts)).append("\n");
    sb.append("    preventOrderProductDiscounts: ").append(toIndentedString(preventOrderProductDiscounts)).append("\n");
    sb.append("    preventOrderShippingDiscounts: ").append(toIndentedString(preventOrderShippingDiscounts)).append("\n");
    sb.append("    purchaseRequirementType: ").append(toIndentedString(purchaseRequirementType)).append("\n");
    sb.append("    reevalFreeItemMinOrderPostDiscounts: ").append(toIndentedString(reevalFreeItemMinOrderPostDiscounts)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    stackingLayer: ").append(toIndentedString(stackingLayer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tagCodes: ").append(toIndentedString(tagCodes)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    thresholdMessage: ").append(toIndentedString(thresholdMessage)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("amountType");
    openapiFields.add("auditInfo");
    openapiFields.add("canBeDeleted");
    openapiFields.add("canBeStackedUpon");
    openapiFields.add("code");
    openapiFields.add("conditions");
    openapiFields.add("content");
    openapiFields.add("currentRedemptionCount");
    openapiFields.add("doesNotApplyToMultiShipToOrders");
    openapiFields.add("doesNotApplyToProductsWithSalePrice");
    openapiFields.add("doesNotApplyToSalePrice");
    openapiFields.add("hasPurchaseConditions");
    openapiFields.add("id");
    openapiFields.add("includedPriceLists");
    openapiFields.add("isBxGx");
    openapiFields.add("isDisabled");
    openapiFields.add("isPublic");
    openapiFields.add("isSubscriptionDiscount");
    openapiFields.add("labels");
    openapiFields.add("localizedContent");
    openapiFields.add("maximumDiscountImpactPerOrder");
    openapiFields.add("maximumDiscountImpactPerRedemption");
    openapiFields.add("maximumRedemptionsPerOrder");
    openapiFields.add("maximumUsesPerUser");
    openapiFields.add("preventLineItemShippingDiscounts");
    openapiFields.add("preventOrderProductDiscounts");
    openapiFields.add("preventOrderShippingDiscounts");
    openapiFields.add("purchaseRequirementType");
    openapiFields.add("reevalFreeItemMinOrderPostDiscounts");
    openapiFields.add("scope");
    openapiFields.add("stackingLayer");
    openapiFields.add("status");
    openapiFields.add("tagCodes");
    openapiFields.add("target");
    openapiFields.add("thresholdMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amountType");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("target");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsDiscount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsDiscount is not found in the empty JSON string", CatalogAdminsDiscount.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsDiscount.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsDiscount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogAdminsDiscount.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("amountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amountType").toString()));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field `conditions`
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        CatalogAdminsDiscountCondition.validateJsonObject(jsonObj.getAsJsonObject("conditions"));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        DiscountLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("includedPriceLists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `includedPriceLists` to be an array in the JSON string but got `%s`", jsonObj.get("includedPriceLists").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      if (jsonObj.get("localizedContent") != null && !jsonObj.get("localizedContent").isJsonNull()) {
        JsonArray jsonArraylocalizedContent = jsonObj.getAsJsonArray("localizedContent");
        if (jsonArraylocalizedContent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("localizedContent").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `localizedContent` to be an array in the JSON string but got `%s`", jsonObj.get("localizedContent").toString()));
          }

          // validate the optional field `localizedContent` (array)
          for (int i = 0; i < jsonArraylocalizedContent.size(); i++) {
            DiscountLocalizedContent.validateJsonObject(jsonArraylocalizedContent.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("purchaseRequirementType") != null && !jsonObj.get("purchaseRequirementType").isJsonNull()) && !jsonObj.get("purchaseRequirementType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchaseRequirementType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchaseRequirementType").toString()));
      }
      if (!jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("tagCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagCodes` to be an array in the JSON string but got `%s`", jsonObj.get("tagCodes").toString()));
      }
      // validate the required field `target`
      CatalogAdminsDiscountTarget.validateJsonObject(jsonObj.getAsJsonObject("target"));
      // validate the optional field `thresholdMessage`
      if (jsonObj.get("thresholdMessage") != null && !jsonObj.get("thresholdMessage").isJsonNull()) {
        CatalogAdminsThresholdMessage.validateJsonObject(jsonObj.getAsJsonObject("thresholdMessage"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsDiscount>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsDiscount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsDiscount
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsDiscount
  */
  public static CatalogAdminsDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsDiscount.class);
  }

 /**
  * Convert an instance of CatalogAdminsDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

