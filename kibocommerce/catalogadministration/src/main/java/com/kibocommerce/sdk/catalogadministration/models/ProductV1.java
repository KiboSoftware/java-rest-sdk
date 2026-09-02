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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsBundledProduct;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDiscount;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductCollectionInfo;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductInventoryInfo;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductOption;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductPrice;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductPricingBehaviorInfo;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductProperty;
import com.kibocommerce.sdk.catalogadministration.models.CommerceRuntimeMeasurement;
import com.kibocommerce.sdk.catalogadministration.models.ProductCollectionProduct;
import com.kibocommerce.sdk.catalogadministration.models.ProductExtra;
import com.kibocommerce.sdk.catalogadministration.models.ProductImageGroup;
import com.kibocommerce.sdk.catalogadministration.models.ProductInCatalogInfoV1;
import com.kibocommerce.sdk.catalogadministration.models.ProductLocalizedContent;
import com.kibocommerce.sdk.catalogadministration.models.ProductLocalizedSEOContent;
import com.kibocommerce.sdk.catalogadministration.models.ProductPublishingInfo;
import com.kibocommerce.sdk.catalogadministration.models.ProductSupplierInfo;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationOption;
import com.kibocommerce.sdk.catalogadministration.models.SlicingSettings;
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
 * Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.
 */
@ApiModel(description = "Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductV1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLICABLE_DISCOUNTS = "applicableDiscounts";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_DISCOUNTS)
  private List<CatalogAdminsDiscount> applicableDiscounts = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_BASE_PRODUCT_CODE = "baseProductCode";
  @SerializedName(SERIALIZED_NAME_BASE_PRODUCT_CODE)
  private String baseProductCode;

  public static final String SERIALIZED_NAME_BUNDLED_PRODUCTS = "bundledProducts";
  @SerializedName(SERIALIZED_NAME_BUNDLED_PRODUCTS)
  private List<CatalogAdminsBundledProduct> bundledProducts = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ProductLocalizedContent content;

  public static final String SERIALIZED_NAME_EXTRAS = "extras";
  @SerializedName(SERIALIZED_NAME_EXTRAS)
  private List<ProductExtra> extras = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_TYPES_SUPPORTED = "fulfillmentTypesSupported";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_TYPES_SUPPORTED)
  private List<String> fulfillmentTypesSupported = null;

  public static final String SERIALIZED_NAME_HAS_CONFIGURABLE_OPTIONS = "hasConfigurableOptions";
  @SerializedName(SERIALIZED_NAME_HAS_CONFIGURABLE_OPTIONS)
  private Boolean hasConfigurableOptions;

  public static final String SERIALIZED_NAME_HAS_STAND_ALONE_OPTIONS = "hasStandAloneOptions";
  @SerializedName(SERIALIZED_NAME_HAS_STAND_ALONE_OPTIONS)
  private Boolean hasStandAloneOptions;

  public static final String SERIALIZED_NAME_INVENTORY_INFO = "inventoryInfo";
  @SerializedName(SERIALIZED_NAME_INVENTORY_INFO)
  private CatalogAdminsProductInventoryInfo inventoryInfo;

  public static final String SERIALIZED_NAME_IS_PACKAGED_STAND_ALONE = "isPackagedStandAlone";
  @SerializedName(SERIALIZED_NAME_IS_PACKAGED_STAND_ALONE)
  private Boolean isPackagedStandAlone;

  public static final String SERIALIZED_NAME_IS_RECURRING = "isRecurring";
  @SerializedName(SERIALIZED_NAME_IS_RECURRING)
  private Boolean isRecurring;

  public static final String SERIALIZED_NAME_IS_TAXABLE = "isTaxable";
  @SerializedName(SERIALIZED_NAME_IS_TAXABLE)
  private Boolean isTaxable;

  public static final String SERIALIZED_NAME_IS_VALID_FOR_PRODUCT_TYPE = "isValidForProductType";
  @SerializedName(SERIALIZED_NAME_IS_VALID_FOR_PRODUCT_TYPE)
  private Boolean isValidForProductType;

  public static final String SERIALIZED_NAME_IS_VARIATION = "isVariation";
  @SerializedName(SERIALIZED_NAME_IS_VARIATION)
  private Boolean isVariation;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<CatalogAdminsProductOption> options = null;

  public static final String SERIALIZED_NAME_PACKAGE_HEIGHT = "packageHeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_HEIGHT)
  private CommerceRuntimeMeasurement packageHeight;

  public static final String SERIALIZED_NAME_PACKAGE_LENGTH = "packageLength";
  @SerializedName(SERIALIZED_NAME_PACKAGE_LENGTH)
  private CommerceRuntimeMeasurement packageLength;

  public static final String SERIALIZED_NAME_PACKAGE_WEIGHT = "packageWeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WEIGHT)
  private CommerceRuntimeMeasurement packageWeight;

  public static final String SERIALIZED_NAME_PACKAGE_WIDTH = "packageWidth";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WIDTH)
  private CommerceRuntimeMeasurement packageWidth;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CatalogAdminsProductPrice price;

  public static final String SERIALIZED_NAME_PRICING_BEHAVIOR = "pricingBehavior";
  @SerializedName(SERIALIZED_NAME_PRICING_BEHAVIOR)
  private CatalogAdminsProductPricingBehaviorInfo pricingBehavior;

  public static final String SERIALIZED_NAME_PRIMARY_PRODUCT_COLLECTION_CODE = "primaryProductCollectionCode";
  @SerializedName(SERIALIZED_NAME_PRIMARY_PRODUCT_COLLECTION_CODE)
  private String primaryProductCollectionCode;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PRODUCT_COLLECTION_PRODUCTS = "productCollectionProducts";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COLLECTION_PRODUCTS)
  private List<ProductCollectionProduct> productCollectionProducts = null;

  public static final String SERIALIZED_NAME_PRODUCT_COLLECTIONS = "productCollections";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COLLECTIONS)
  private List<CatalogAdminsProductCollectionInfo> productCollections = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE_GROUPS = "productImageGroups";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE_GROUPS)
  private List<ProductImageGroup> productImageGroups = null;

  public static final String SERIALIZED_NAME_PRODUCT_IN_CATALOGS = "productInCatalogs";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IN_CATALOGS)
  private List<ProductInCatalogInfoV1> productInCatalogs = null;

  public static final String SERIALIZED_NAME_PRODUCT_SEQUENCE = "productSequence";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SEQUENCE)
  private Integer productSequence;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE_ID = "productTypeId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE_ID)
  private Integer productTypeId;

  public static final String SERIALIZED_NAME_PRODUCT_USAGE = "productUsage";
  @SerializedName(SERIALIZED_NAME_PRODUCT_USAGE)
  private String productUsage;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<CatalogAdminsProductProperty> properties = null;

  public static final String SERIALIZED_NAME_PUBLISHING_INFO = "publishingInfo";
  @SerializedName(SERIALIZED_NAME_PUBLISHING_INFO)
  private ProductPublishingInfo publishingInfo;

  public static final String SERIALIZED_NAME_SEO_CONTENT = "seoContent";
  @SerializedName(SERIALIZED_NAME_SEO_CONTENT)
  private ProductLocalizedSEOContent seoContent;

  public static final String SERIALIZED_NAME_SHIPPING_CLASS_ID = "shippingClassId";
  @SerializedName(SERIALIZED_NAME_SHIPPING_CLASS_ID)
  private Integer shippingClassId;

  public static final String SERIALIZED_NAME_SLICING_SETTINGS = "slicingSettings";
  @SerializedName(SERIALIZED_NAME_SLICING_SETTINGS)
  private SlicingSettings slicingSettings;

  public static final String SERIALIZED_NAME_STAND_ALONE_PACKAGE_TYPE = "standAlonePackageType";
  @SerializedName(SERIALIZED_NAME_STAND_ALONE_PACKAGE_TYPE)
  private String standAlonePackageType;

  public static final String SERIALIZED_NAME_SUPPLIER_INFO = "supplierInfo";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_INFO)
  private ProductSupplierInfo supplierInfo;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_VARIATION_KEY = "variationKey";
  @SerializedName(SERIALIZED_NAME_VARIATION_KEY)
  private String variationKey;

  public static final String SERIALIZED_NAME_VARIATION_OPTIONS = "variationOptions";
  @SerializedName(SERIALIZED_NAME_VARIATION_OPTIONS)
  private List<ProductVariationOption> variationOptions = null;

  public ProductV1() {
  }

  public ProductV1 applicableDiscounts(List<CatalogAdminsDiscount> applicableDiscounts) {
    
    this.applicableDiscounts = applicableDiscounts;
    return this;
  }

  public ProductV1 addApplicableDiscountsItem(CatalogAdminsDiscount applicableDiscountsItem) {
    if (this.applicableDiscounts == null) {
      this.applicableDiscounts = new ArrayList<>();
    }
    this.applicableDiscounts.add(applicableDiscountsItem);
    return this;
  }

   /**
   * Read only. List of discounts that are available for a product.
   * @return applicableDiscounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only. List of discounts that are available for a product.")

  public List<CatalogAdminsDiscount> getApplicableDiscounts() {
    return applicableDiscounts;
  }


  public void setApplicableDiscounts(List<CatalogAdminsDiscount> applicableDiscounts) {
    this.applicableDiscounts = applicableDiscounts;
  }


  public ProductV1 auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public ProductV1 baseProductCode(String baseProductCode) {
    
    this.baseProductCode = baseProductCode;
    return this;
  }

   /**
   * This is the base product ProductCode of a product that is a variation. It is read-only and only populated for products that are variations of a configurable base product.
   * @return baseProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the base product ProductCode of a product that is a variation. It is read-only and only populated for products that are variations of a configurable base product.")

  public String getBaseProductCode() {
    return baseProductCode;
  }


  public void setBaseProductCode(String baseProductCode) {
    this.baseProductCode = baseProductCode;
  }


  public ProductV1 bundledProducts(List<CatalogAdminsBundledProduct> bundledProducts) {
    
    this.bundledProducts = bundledProducts;
    return this;
  }

  public ProductV1 addBundledProductsItem(CatalogAdminsBundledProduct bundledProductsItem) {
    if (this.bundledProducts == null) {
      this.bundledProducts = new ArrayList<>();
    }
    this.bundledProducts.add(bundledProductsItem);
    return this;
  }

   /**
   * list of other products that are included in a BundleProduct This requires that the ProductUsage be set to Bundle
   * @return bundledProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of other products that are included in a BundleProduct This requires that the ProductUsage be set to Bundle")

  public List<CatalogAdminsBundledProduct> getBundledProducts() {
    return bundledProducts;
  }


  public void setBundledProducts(List<CatalogAdminsBundledProduct> bundledProducts) {
    this.bundledProducts = bundledProducts;
  }


  public ProductV1 content(ProductLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductLocalizedContent getContent() {
    return content;
  }


  public void setContent(ProductLocalizedContent content) {
    this.content = content;
  }


  public ProductV1 extras(List<ProductExtra> extras) {
    
    this.extras = extras;
    return this;
  }

  public ProductV1 addExtrasItem(ProductExtra extrasItem) {
    if (this.extras == null) {
      this.extras = new ArrayList<>();
    }
    this.extras.add(extrasItem);
    return this;
  }

   /**
   * The Extras defined in the product Type that are currently assigned to this product
   * @return extras
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Extras defined in the product Type that are currently assigned to this product")

  public List<ProductExtra> getExtras() {
    return extras;
  }


  public void setExtras(List<ProductExtra> extras) {
    this.extras = extras;
  }


  public ProductV1 fulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
    
    this.fulfillmentTypesSupported = fulfillmentTypesSupported;
    return this;
  }

  public ProductV1 addFulfillmentTypesSupportedItem(String fulfillmentTypesSupportedItem) {
    if (this.fulfillmentTypesSupported == null) {
      this.fulfillmentTypesSupported = new ArrayList<>();
    }
    this.fulfillmentTypesSupported.add(fulfillmentTypesSupportedItem);
    return this;
  }

   /**
   * Indicates the fulfillment types the product supports.
   * @return fulfillmentTypesSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the fulfillment types the product supports.")

  public List<String> getFulfillmentTypesSupported() {
    return fulfillmentTypesSupported;
  }


  public void setFulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
    this.fulfillmentTypesSupported = fulfillmentTypesSupported;
  }


  public ProductV1 hasConfigurableOptions(Boolean hasConfigurableOptions) {
    
    this.hasConfigurableOptions = hasConfigurableOptions;
    return this;
  }

   /**
   * Read only. If true, this product has configurable options. The product is not purchasable until the shopper selects options that resolve to a product variation. System-supplied and read-only.
   * @return hasConfigurableOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only. If true, this product has configurable options. The product is not purchasable until the shopper selects options that resolve to a product variation. System-supplied and read-only.")

  public Boolean getHasConfigurableOptions() {
    return hasConfigurableOptions;
  }


  public void setHasConfigurableOptions(Boolean hasConfigurableOptions) {
    this.hasConfigurableOptions = hasConfigurableOptions;
  }


  public ProductV1 hasStandAloneOptions(Boolean hasStandAloneOptions) {
    
    this.hasStandAloneOptions = hasStandAloneOptions;
    return this;
  }

   /**
   * Read only. If true, the product has stand-alone options that a shopper may select. System-supplied and read-only.
   * @return hasStandAloneOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only. If true, the product has stand-alone options that a shopper may select. System-supplied and read-only.")

  public Boolean getHasStandAloneOptions() {
    return hasStandAloneOptions;
  }


  public void setHasStandAloneOptions(Boolean hasStandAloneOptions) {
    this.hasStandAloneOptions = hasStandAloneOptions;
  }


  public ProductV1 inventoryInfo(CatalogAdminsProductInventoryInfo inventoryInfo) {
    
    this.inventoryInfo = inventoryInfo;
    return this;
  }

   /**
   * Get inventoryInfo
   * @return inventoryInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsProductInventoryInfo getInventoryInfo() {
    return inventoryInfo;
  }


  public void setInventoryInfo(CatalogAdminsProductInventoryInfo inventoryInfo) {
    this.inventoryInfo = inventoryInfo;
  }


  public ProductV1 isPackagedStandAlone(Boolean isPackagedStandAlone) {
    
    this.isPackagedStandAlone = isPackagedStandAlone;
    return this;
  }

   /**
   * Does this product need to be packaged on its own
   * @return isPackagedStandAlone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Does this product need to be packaged on its own")

  public Boolean getIsPackagedStandAlone() {
    return isPackagedStandAlone;
  }


  public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
    this.isPackagedStandAlone = isPackagedStandAlone;
  }


  public ProductV1 isRecurring(Boolean isRecurring) {
    
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * If true, the product can be purchased or fulfilled at regular intervals, for example, monthly billing or a subscription.
   * @return isRecurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the product can be purchased or fulfilled at regular intervals, for example, monthly billing or a subscription.")

  public Boolean getIsRecurring() {
    return isRecurring;
  }


  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }


  public ProductV1 isTaxable(Boolean isTaxable) {
    
    this.isTaxable = isTaxable;
    return this;
  }

   /**
   * If true, the product is subject to tax.
   * @return isTaxable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the product is subject to tax.")

  public Boolean getIsTaxable() {
    return isTaxable;
  }


  public void setIsTaxable(Boolean isTaxable) {
    this.isTaxable = isTaxable;
  }


  public ProductV1 isValidForProductType(Boolean isValidForProductType) {
    
    this.isValidForProductType = isValidForProductType;
    return this;
  }

   /**
   * Read only flag that indicates if the product meets the product type constraints (All adminRequired attributes have a valid value)
   * @return isValidForProductType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only flag that indicates if the product meets the product type constraints (All adminRequired attributes have a valid value)")

  public Boolean getIsValidForProductType() {
    return isValidForProductType;
  }


  public void setIsValidForProductType(Boolean isValidForProductType) {
    this.isValidForProductType = isValidForProductType;
  }


  public ProductV1 isVariation(Boolean isVariation) {
    
    this.isVariation = isVariation;
    return this;
  }

   /**
   * Read only. If true, this is a product variation of a product with configurable options. System-supplied and read-only.
   * @return isVariation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only. If true, this is a product variation of a product with configurable options. System-supplied and read-only.")

  public Boolean getIsVariation() {
    return isVariation;
  }


  public void setIsVariation(Boolean isVariation) {
    this.isVariation = isVariation;
  }


  public ProductV1 masterCatalogId(Integer masterCatalogId) {
    
    this.masterCatalogId = masterCatalogId;
    return this;
  }

   /**
   * Identifier of the Master Catalog that this product is a member of. System-supplied and read-only
   * @return masterCatalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the Master Catalog that this product is a member of. System-supplied and read-only")

  public Integer getMasterCatalogId() {
    return masterCatalogId;
  }


  public void setMasterCatalogId(Integer masterCatalogId) {
    this.masterCatalogId = masterCatalogId;
  }


  public ProductV1 options(List<CatalogAdminsProductOption> options) {
    
    this.options = options;
    return this;
  }

  public ProductV1 addOptionsItem(CatalogAdminsProductOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The Options defined in the product Type that are currently assigned to this product
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Options defined in the product Type that are currently assigned to this product")

  public List<CatalogAdminsProductOption> getOptions() {
    return options;
  }


  public void setOptions(List<CatalogAdminsProductOption> options) {
    this.options = options;
  }


  public ProductV1 packageHeight(CommerceRuntimeMeasurement packageHeight) {
    
    this.packageHeight = packageHeight;
    return this;
  }

   /**
   * Get packageHeight
   * @return packageHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageHeight() {
    return packageHeight;
  }


  public void setPackageHeight(CommerceRuntimeMeasurement packageHeight) {
    this.packageHeight = packageHeight;
  }


  public ProductV1 packageLength(CommerceRuntimeMeasurement packageLength) {
    
    this.packageLength = packageLength;
    return this;
  }

   /**
   * Get packageLength
   * @return packageLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageLength() {
    return packageLength;
  }


  public void setPackageLength(CommerceRuntimeMeasurement packageLength) {
    this.packageLength = packageLength;
  }


  public ProductV1 packageWeight(CommerceRuntimeMeasurement packageWeight) {
    
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * Get packageWeight
   * @return packageWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageWeight() {
    return packageWeight;
  }


  public void setPackageWeight(CommerceRuntimeMeasurement packageWeight) {
    this.packageWeight = packageWeight;
  }


  public ProductV1 packageWidth(CommerceRuntimeMeasurement packageWidth) {
    
    this.packageWidth = packageWidth;
    return this;
  }

   /**
   * Get packageWidth
   * @return packageWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageWidth() {
    return packageWidth;
  }


  public void setPackageWidth(CommerceRuntimeMeasurement packageWidth) {
    this.packageWidth = packageWidth;
  }


  public ProductV1 price(CatalogAdminsProductPrice price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsProductPrice getPrice() {
    return price;
  }


  public void setPrice(CatalogAdminsProductPrice price) {
    this.price = price;
  }


  public ProductV1 pricingBehavior(CatalogAdminsProductPricingBehaviorInfo pricingBehavior) {
    
    this.pricingBehavior = pricingBehavior;
    return this;
  }

   /**
   * Get pricingBehavior
   * @return pricingBehavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsProductPricingBehaviorInfo getPricingBehavior() {
    return pricingBehavior;
  }


  public void setPricingBehavior(CatalogAdminsProductPricingBehaviorInfo pricingBehavior) {
    this.pricingBehavior = pricingBehavior;
  }


  public ProductV1 primaryProductCollectionCode(String primaryProductCollectionCode) {
    
    this.primaryProductCollectionCode = primaryProductCollectionCode;
    return this;
  }

   /**
   * When this product belongs to a product collection this is the product id for the primary collection.
   * @return primaryProductCollectionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When this product belongs to a product collection this is the product id for the primary collection.")

  public String getPrimaryProductCollectionCode() {
    return primaryProductCollectionCode;
  }


  public void setPrimaryProductCollectionCode(String primaryProductCollectionCode) {
    this.primaryProductCollectionCode = primaryProductCollectionCode;
  }


  public ProductV1 productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Merchant-created code identifier associated with the product, for example, a SKU or product item number.
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant-created code identifier associated with the product, for example, a SKU or product item number.")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ProductV1 productCollectionProducts(List<ProductCollectionProduct> productCollectionProducts) {
    
    this.productCollectionProducts = productCollectionProducts;
    return this;
  }

  public ProductV1 addProductCollectionProductsItem(ProductCollectionProduct productCollectionProductsItem) {
    if (this.productCollectionProducts == null) {
      this.productCollectionProducts = new ArrayList<>();
    }
    this.productCollectionProducts.add(productCollectionProductsItem);
    return this;
  }

   /**
   * list of other products that are members of a ProductCollection This requires that the ProductUsage be set to Collection
   * @return productCollectionProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of other products that are members of a ProductCollection This requires that the ProductUsage be set to Collection")

  public List<ProductCollectionProduct> getProductCollectionProducts() {
    return productCollectionProducts;
  }


  public void setProductCollectionProducts(List<ProductCollectionProduct> productCollectionProducts) {
    this.productCollectionProducts = productCollectionProducts;
  }


  public ProductV1 productCollections(List<CatalogAdminsProductCollectionInfo> productCollections) {
    
    this.productCollections = productCollections;
    return this;
  }

  public ProductV1 addProductCollectionsItem(CatalogAdminsProductCollectionInfo productCollectionsItem) {
    if (this.productCollections == null) {
      this.productCollections = new ArrayList<>();
    }
    this.productCollections.add(productCollectionsItem);
    return this;
  }

   /**
   * List of Mozu.ProductAdmin.Contracts.ProductCollectionInfo that this product belongs to
   * @return productCollections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Mozu.ProductAdmin.Contracts.ProductCollectionInfo that this product belongs to")

  public List<CatalogAdminsProductCollectionInfo> getProductCollections() {
    return productCollections;
  }


  public void setProductCollections(List<CatalogAdminsProductCollectionInfo> productCollections) {
    this.productCollections = productCollections;
  }


  public ProductV1 productImageGroups(List<ProductImageGroup> productImageGroups) {
    
    this.productImageGroups = productImageGroups;
    return this;
  }

  public ProductV1 addProductImageGroupsItem(ProductImageGroup productImageGroupsItem) {
    if (this.productImageGroups == null) {
      this.productImageGroups = new ArrayList<>();
    }
    this.productImageGroups.add(productImageGroupsItem);
    return this;
  }

   /**
   * List of the image groups this product uses. Image groups are used to map different images to different product options. If the product doesn&#39;t have options then all images will be in the default image group.
   * @return productImageGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the image groups this product uses. Image groups are used to map different images to different product options. If the product doesn't have options then all images will be in the default image group.")

  public List<ProductImageGroup> getProductImageGroups() {
    return productImageGroups;
  }


  public void setProductImageGroups(List<ProductImageGroup> productImageGroups) {
    this.productImageGroups = productImageGroups;
  }


  public ProductV1 productInCatalogs(List<ProductInCatalogInfoV1> productInCatalogs) {
    
    this.productInCatalogs = productInCatalogs;
    return this;
  }

  public ProductV1 addProductInCatalogsItem(ProductInCatalogInfoV1 productInCatalogsItem) {
    if (this.productInCatalogs == null) {
      this.productInCatalogs = new ArrayList<>();
    }
    this.productInCatalogs.add(productInCatalogsItem);
    return this;
  }

   /**
   * Catalog specific info for each catalog a product is valid in. There should always be one or more entries here.
   * @return productInCatalogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Catalog specific info for each catalog a product is valid in. There should always be one or more entries here.")

  public List<ProductInCatalogInfoV1> getProductInCatalogs() {
    return productInCatalogs;
  }


  public void setProductInCatalogs(List<ProductInCatalogInfoV1> productInCatalogs) {
    this.productInCatalogs = productInCatalogs;
  }


  public ProductV1 productSequence(Integer productSequence) {
    
    this.productSequence = productSequence;
    return this;
  }

   /**
   * System generated monotonically increasing sequence
   * @return productSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "System generated monotonically increasing sequence")

  public Integer getProductSequence() {
    return productSequence;
  }


  public void setProductSequence(Integer productSequence) {
    this.productSequence = productSequence;
  }


  public ProductV1 productTypeId(Integer productTypeId) {
    
    this.productTypeId = productTypeId;
    return this;
  }

   /**
   * Unique identifier of the productType of the product. Refers to a valid ProductType that was previously created with the ProductType resource.
   * @return productTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the productType of the product. Refers to a valid ProductType that was previously created with the ProductType resource.")

  public Integer getProductTypeId() {
    return productTypeId;
  }


  public void setProductTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
  }


  public ProductV1 productUsage(String productUsage) {
    
    this.productUsage = productUsage;
    return this;
  }

   /**
   * Indicates the usage type of this product. Must be one of the values in ProductUsageConst.
   * @return productUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the usage type of this product. Must be one of the values in ProductUsageConst.")

  public String getProductUsage() {
    return productUsage;
  }


  public void setProductUsage(String productUsage) {
    this.productUsage = productUsage;
  }


  public ProductV1 properties(List<CatalogAdminsProductProperty> properties) {
    
    this.properties = properties;
    return this;
  }

  public ProductV1 addPropertiesItem(CatalogAdminsProductProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The Properties defined in the product Type that are currently assigned to this product
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Properties defined in the product Type that are currently assigned to this product")

  public List<CatalogAdminsProductProperty> getProperties() {
    return properties;
  }


  public void setProperties(List<CatalogAdminsProductProperty> properties) {
    this.properties = properties;
  }


  public ProductV1 publishingInfo(ProductPublishingInfo publishingInfo) {
    
    this.publishingInfo = publishingInfo;
    return this;
  }

   /**
   * Get publishingInfo
   * @return publishingInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductPublishingInfo getPublishingInfo() {
    return publishingInfo;
  }


  public void setPublishingInfo(ProductPublishingInfo publishingInfo) {
    this.publishingInfo = publishingInfo;
  }


  public ProductV1 seoContent(ProductLocalizedSEOContent seoContent) {
    
    this.seoContent = seoContent;
    return this;
  }

   /**
   * Get seoContent
   * @return seoContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductLocalizedSEOContent getSeoContent() {
    return seoContent;
  }


  public void setSeoContent(ProductLocalizedSEOContent seoContent) {
    this.seoContent = seoContent;
  }


  public ProductV1 shippingClassId(Integer shippingClassId) {
    
    this.shippingClassId = shippingClassId;
    return this;
  }

   /**
   * Get shippingClassId
   * @return shippingClassId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShippingClassId() {
    return shippingClassId;
  }


  public void setShippingClassId(Integer shippingClassId) {
    this.shippingClassId = shippingClassId;
  }


  public ProductV1 slicingSettings(SlicingSettings slicingSettings) {
    
    this.slicingSettings = slicingSettings;
    return this;
  }

   /**
   * Get slicingSettings
   * @return slicingSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SlicingSettings getSlicingSettings() {
    return slicingSettings;
  }


  public void setSlicingSettings(SlicingSettings slicingSettings) {
    this.slicingSettings = slicingSettings;
  }


  public ProductV1 standAlonePackageType(String standAlonePackageType) {
    
    this.standAlonePackageType = standAlonePackageType;
    return this;
  }

   /**
   * When packaged alone this is the package type
   * @return standAlonePackageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When packaged alone this is the package type")

  public String getStandAlonePackageType() {
    return standAlonePackageType;
  }


  public void setStandAlonePackageType(String standAlonePackageType) {
    this.standAlonePackageType = standAlonePackageType;
  }


  public ProductV1 supplierInfo(ProductSupplierInfo supplierInfo) {
    
    this.supplierInfo = supplierInfo;
    return this;
  }

   /**
   * Get supplierInfo
   * @return supplierInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductSupplierInfo getSupplierInfo() {
    return supplierInfo;
  }


  public void setSupplierInfo(ProductSupplierInfo supplierInfo) {
    this.supplierInfo = supplierInfo;
  }


  public ProductV1 upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * UPC code of the product.
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UPC code of the product.")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }


  public ProductV1 variationKey(String variationKey) {
    
    this.variationKey = variationKey;
    return this;
  }

   /**
   * Read only. If IsVariation true, thish provides a unique key to manage the variation of the base product.
   * @return variationKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only. If IsVariation true, thish provides a unique key to manage the variation of the base product.")

  public String getVariationKey() {
    return variationKey;
  }


  public void setVariationKey(String variationKey) {
    this.variationKey = variationKey;
  }


  public ProductV1 variationOptions(List<ProductVariationOption> variationOptions) {
    
    this.variationOptions = variationOptions;
    return this;
  }

  public ProductV1 addVariationOptionsItem(ProductVariationOption variationOptionsItem) {
    if (this.variationOptions == null) {
      this.variationOptions = new ArrayList<>();
    }
    this.variationOptions.add(variationOptionsItem);
    return this;
  }

   /**
   * Read only List of variations that exist for a product. This is only populated when IsVariation is true. To get the list of options, the GET request must include the VariationOptions response group.
   * @return variationOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only List of variations that exist for a product. This is only populated when IsVariation is true. To get the list of options, the GET request must include the VariationOptions response group.")

  public List<ProductVariationOption> getVariationOptions() {
    return variationOptions;
  }


  public void setVariationOptions(List<ProductVariationOption> variationOptions) {
    this.variationOptions = variationOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductV1 productV1 = (ProductV1) o;
    return Objects.equals(this.applicableDiscounts, productV1.applicableDiscounts) &&
        Objects.equals(this.auditInfo, productV1.auditInfo) &&
        Objects.equals(this.baseProductCode, productV1.baseProductCode) &&
        Objects.equals(this.bundledProducts, productV1.bundledProducts) &&
        Objects.equals(this.content, productV1.content) &&
        Objects.equals(this.extras, productV1.extras) &&
        Objects.equals(this.fulfillmentTypesSupported, productV1.fulfillmentTypesSupported) &&
        Objects.equals(this.hasConfigurableOptions, productV1.hasConfigurableOptions) &&
        Objects.equals(this.hasStandAloneOptions, productV1.hasStandAloneOptions) &&
        Objects.equals(this.inventoryInfo, productV1.inventoryInfo) &&
        Objects.equals(this.isPackagedStandAlone, productV1.isPackagedStandAlone) &&
        Objects.equals(this.isRecurring, productV1.isRecurring) &&
        Objects.equals(this.isTaxable, productV1.isTaxable) &&
        Objects.equals(this.isValidForProductType, productV1.isValidForProductType) &&
        Objects.equals(this.isVariation, productV1.isVariation) &&
        Objects.equals(this.masterCatalogId, productV1.masterCatalogId) &&
        Objects.equals(this.options, productV1.options) &&
        Objects.equals(this.packageHeight, productV1.packageHeight) &&
        Objects.equals(this.packageLength, productV1.packageLength) &&
        Objects.equals(this.packageWeight, productV1.packageWeight) &&
        Objects.equals(this.packageWidth, productV1.packageWidth) &&
        Objects.equals(this.price, productV1.price) &&
        Objects.equals(this.pricingBehavior, productV1.pricingBehavior) &&
        Objects.equals(this.primaryProductCollectionCode, productV1.primaryProductCollectionCode) &&
        Objects.equals(this.productCode, productV1.productCode) &&
        Objects.equals(this.productCollectionProducts, productV1.productCollectionProducts) &&
        Objects.equals(this.productCollections, productV1.productCollections) &&
        Objects.equals(this.productImageGroups, productV1.productImageGroups) &&
        Objects.equals(this.productInCatalogs, productV1.productInCatalogs) &&
        Objects.equals(this.productSequence, productV1.productSequence) &&
        Objects.equals(this.productTypeId, productV1.productTypeId) &&
        Objects.equals(this.productUsage, productV1.productUsage) &&
        Objects.equals(this.properties, productV1.properties) &&
        Objects.equals(this.publishingInfo, productV1.publishingInfo) &&
        Objects.equals(this.seoContent, productV1.seoContent) &&
        Objects.equals(this.shippingClassId, productV1.shippingClassId) &&
        Objects.equals(this.slicingSettings, productV1.slicingSettings) &&
        Objects.equals(this.standAlonePackageType, productV1.standAlonePackageType) &&
        Objects.equals(this.supplierInfo, productV1.supplierInfo) &&
        Objects.equals(this.upc, productV1.upc) &&
        Objects.equals(this.variationKey, productV1.variationKey) &&
        Objects.equals(this.variationOptions, productV1.variationOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableDiscounts, auditInfo, baseProductCode, bundledProducts, content, extras, fulfillmentTypesSupported, hasConfigurableOptions, hasStandAloneOptions, inventoryInfo, isPackagedStandAlone, isRecurring, isTaxable, isValidForProductType, isVariation, masterCatalogId, options, packageHeight, packageLength, packageWeight, packageWidth, price, pricingBehavior, primaryProductCollectionCode, productCode, productCollectionProducts, productCollections, productImageGroups, productInCatalogs, productSequence, productTypeId, productUsage, properties, publishingInfo, seoContent, shippingClassId, slicingSettings, standAlonePackageType, supplierInfo, upc, variationKey, variationOptions);
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
    sb.append("class ProductV1 {\n");
    sb.append("    applicableDiscounts: ").append(toIndentedString(applicableDiscounts)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    baseProductCode: ").append(toIndentedString(baseProductCode)).append("\n");
    sb.append("    bundledProducts: ").append(toIndentedString(bundledProducts)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    fulfillmentTypesSupported: ").append(toIndentedString(fulfillmentTypesSupported)).append("\n");
    sb.append("    hasConfigurableOptions: ").append(toIndentedString(hasConfigurableOptions)).append("\n");
    sb.append("    hasStandAloneOptions: ").append(toIndentedString(hasStandAloneOptions)).append("\n");
    sb.append("    inventoryInfo: ").append(toIndentedString(inventoryInfo)).append("\n");
    sb.append("    isPackagedStandAlone: ").append(toIndentedString(isPackagedStandAlone)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    isTaxable: ").append(toIndentedString(isTaxable)).append("\n");
    sb.append("    isValidForProductType: ").append(toIndentedString(isValidForProductType)).append("\n");
    sb.append("    isVariation: ").append(toIndentedString(isVariation)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    packageHeight: ").append(toIndentedString(packageHeight)).append("\n");
    sb.append("    packageLength: ").append(toIndentedString(packageLength)).append("\n");
    sb.append("    packageWeight: ").append(toIndentedString(packageWeight)).append("\n");
    sb.append("    packageWidth: ").append(toIndentedString(packageWidth)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingBehavior: ").append(toIndentedString(pricingBehavior)).append("\n");
    sb.append("    primaryProductCollectionCode: ").append(toIndentedString(primaryProductCollectionCode)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productCollectionProducts: ").append(toIndentedString(productCollectionProducts)).append("\n");
    sb.append("    productCollections: ").append(toIndentedString(productCollections)).append("\n");
    sb.append("    productImageGroups: ").append(toIndentedString(productImageGroups)).append("\n");
    sb.append("    productInCatalogs: ").append(toIndentedString(productInCatalogs)).append("\n");
    sb.append("    productSequence: ").append(toIndentedString(productSequence)).append("\n");
    sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
    sb.append("    productUsage: ").append(toIndentedString(productUsage)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    publishingInfo: ").append(toIndentedString(publishingInfo)).append("\n");
    sb.append("    seoContent: ").append(toIndentedString(seoContent)).append("\n");
    sb.append("    shippingClassId: ").append(toIndentedString(shippingClassId)).append("\n");
    sb.append("    slicingSettings: ").append(toIndentedString(slicingSettings)).append("\n");
    sb.append("    standAlonePackageType: ").append(toIndentedString(standAlonePackageType)).append("\n");
    sb.append("    supplierInfo: ").append(toIndentedString(supplierInfo)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    variationKey: ").append(toIndentedString(variationKey)).append("\n");
    sb.append("    variationOptions: ").append(toIndentedString(variationOptions)).append("\n");
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
    openapiFields.add("applicableDiscounts");
    openapiFields.add("auditInfo");
    openapiFields.add("baseProductCode");
    openapiFields.add("bundledProducts");
    openapiFields.add("content");
    openapiFields.add("extras");
    openapiFields.add("fulfillmentTypesSupported");
    openapiFields.add("hasConfigurableOptions");
    openapiFields.add("hasStandAloneOptions");
    openapiFields.add("inventoryInfo");
    openapiFields.add("isPackagedStandAlone");
    openapiFields.add("isRecurring");
    openapiFields.add("isTaxable");
    openapiFields.add("isValidForProductType");
    openapiFields.add("isVariation");
    openapiFields.add("masterCatalogId");
    openapiFields.add("options");
    openapiFields.add("packageHeight");
    openapiFields.add("packageLength");
    openapiFields.add("packageWeight");
    openapiFields.add("packageWidth");
    openapiFields.add("price");
    openapiFields.add("pricingBehavior");
    openapiFields.add("primaryProductCollectionCode");
    openapiFields.add("productCode");
    openapiFields.add("productCollectionProducts");
    openapiFields.add("productCollections");
    openapiFields.add("productImageGroups");
    openapiFields.add("productInCatalogs");
    openapiFields.add("productSequence");
    openapiFields.add("productTypeId");
    openapiFields.add("productUsage");
    openapiFields.add("properties");
    openapiFields.add("publishingInfo");
    openapiFields.add("seoContent");
    openapiFields.add("shippingClassId");
    openapiFields.add("slicingSettings");
    openapiFields.add("standAlonePackageType");
    openapiFields.add("supplierInfo");
    openapiFields.add("upc");
    openapiFields.add("variationKey");
    openapiFields.add("variationOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductV1 is not found in the empty JSON string", ProductV1.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductV1.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("applicableDiscounts") != null && !jsonObj.get("applicableDiscounts").isJsonNull()) {
        JsonArray jsonArrayapplicableDiscounts = jsonObj.getAsJsonArray("applicableDiscounts");
        if (jsonArrayapplicableDiscounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("applicableDiscounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `applicableDiscounts` to be an array in the JSON string but got `%s`", jsonObj.get("applicableDiscounts").toString()));
          }

          // validate the optional field `applicableDiscounts` (array)
          for (int i = 0; i < jsonArrayapplicableDiscounts.size(); i++) {
            CatalogAdminsDiscount.validateJsonObject(jsonArrayapplicableDiscounts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("baseProductCode") != null && !jsonObj.get("baseProductCode").isJsonNull()) && !jsonObj.get("baseProductCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseProductCode").toString()));
      }
      if (jsonObj.get("bundledProducts") != null && !jsonObj.get("bundledProducts").isJsonNull()) {
        JsonArray jsonArraybundledProducts = jsonObj.getAsJsonArray("bundledProducts");
        if (jsonArraybundledProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bundledProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bundledProducts` to be an array in the JSON string but got `%s`", jsonObj.get("bundledProducts").toString()));
          }

          // validate the optional field `bundledProducts` (array)
          for (int i = 0; i < jsonArraybundledProducts.size(); i++) {
            CatalogAdminsBundledProduct.validateJsonObject(jsonArraybundledProducts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        ProductLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      if (jsonObj.get("extras") != null && !jsonObj.get("extras").isJsonNull()) {
        JsonArray jsonArrayextras = jsonObj.getAsJsonArray("extras");
        if (jsonArrayextras != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extras").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extras` to be an array in the JSON string but got `%s`", jsonObj.get("extras").toString()));
          }

          // validate the optional field `extras` (array)
          for (int i = 0; i < jsonArrayextras.size(); i++) {
            ProductExtra.validateJsonObject(jsonArrayextras.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("fulfillmentTypesSupported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentTypesSupported` to be an array in the JSON string but got `%s`", jsonObj.get("fulfillmentTypesSupported").toString()));
      }
      // validate the optional field `inventoryInfo`
      if (jsonObj.get("inventoryInfo") != null && !jsonObj.get("inventoryInfo").isJsonNull()) {
        CatalogAdminsProductInventoryInfo.validateJsonObject(jsonObj.getAsJsonObject("inventoryInfo"));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            CatalogAdminsProductOption.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `packageHeight`
      if (jsonObj.get("packageHeight") != null && !jsonObj.get("packageHeight").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageHeight"));
      }
      // validate the optional field `packageLength`
      if (jsonObj.get("packageLength") != null && !jsonObj.get("packageLength").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageLength"));
      }
      // validate the optional field `packageWeight`
      if (jsonObj.get("packageWeight") != null && !jsonObj.get("packageWeight").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageWeight"));
      }
      // validate the optional field `packageWidth`
      if (jsonObj.get("packageWidth") != null && !jsonObj.get("packageWidth").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageWidth"));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CatalogAdminsProductPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
      // validate the optional field `pricingBehavior`
      if (jsonObj.get("pricingBehavior") != null && !jsonObj.get("pricingBehavior").isJsonNull()) {
        CatalogAdminsProductPricingBehaviorInfo.validateJsonObject(jsonObj.getAsJsonObject("pricingBehavior"));
      }
      if ((jsonObj.get("primaryProductCollectionCode") != null && !jsonObj.get("primaryProductCollectionCode").isJsonNull()) && !jsonObj.get("primaryProductCollectionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryProductCollectionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryProductCollectionCode").toString()));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if (jsonObj.get("productCollectionProducts") != null && !jsonObj.get("productCollectionProducts").isJsonNull()) {
        JsonArray jsonArrayproductCollectionProducts = jsonObj.getAsJsonArray("productCollectionProducts");
        if (jsonArrayproductCollectionProducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productCollectionProducts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productCollectionProducts` to be an array in the JSON string but got `%s`", jsonObj.get("productCollectionProducts").toString()));
          }

          // validate the optional field `productCollectionProducts` (array)
          for (int i = 0; i < jsonArrayproductCollectionProducts.size(); i++) {
            ProductCollectionProduct.validateJsonObject(jsonArrayproductCollectionProducts.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("productCollections") != null && !jsonObj.get("productCollections").isJsonNull()) {
        JsonArray jsonArrayproductCollections = jsonObj.getAsJsonArray("productCollections");
        if (jsonArrayproductCollections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productCollections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productCollections` to be an array in the JSON string but got `%s`", jsonObj.get("productCollections").toString()));
          }

          // validate the optional field `productCollections` (array)
          for (int i = 0; i < jsonArrayproductCollections.size(); i++) {
            CatalogAdminsProductCollectionInfo.validateJsonObject(jsonArrayproductCollections.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("productImageGroups") != null && !jsonObj.get("productImageGroups").isJsonNull()) {
        JsonArray jsonArrayproductImageGroups = jsonObj.getAsJsonArray("productImageGroups");
        if (jsonArrayproductImageGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productImageGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productImageGroups` to be an array in the JSON string but got `%s`", jsonObj.get("productImageGroups").toString()));
          }

          // validate the optional field `productImageGroups` (array)
          for (int i = 0; i < jsonArrayproductImageGroups.size(); i++) {
            ProductImageGroup.validateJsonObject(jsonArrayproductImageGroups.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("productInCatalogs") != null && !jsonObj.get("productInCatalogs").isJsonNull()) {
        JsonArray jsonArrayproductInCatalogs = jsonObj.getAsJsonArray("productInCatalogs");
        if (jsonArrayproductInCatalogs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productInCatalogs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productInCatalogs` to be an array in the JSON string but got `%s`", jsonObj.get("productInCatalogs").toString()));
          }

          // validate the optional field `productInCatalogs` (array)
          for (int i = 0; i < jsonArrayproductInCatalogs.size(); i++) {
            ProductInCatalogInfoV1.validateJsonObject(jsonArrayproductInCatalogs.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("productUsage") != null && !jsonObj.get("productUsage").isJsonNull()) && !jsonObj.get("productUsage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productUsage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productUsage").toString()));
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            CatalogAdminsProductProperty.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `publishingInfo`
      if (jsonObj.get("publishingInfo") != null && !jsonObj.get("publishingInfo").isJsonNull()) {
        ProductPublishingInfo.validateJsonObject(jsonObj.getAsJsonObject("publishingInfo"));
      }
      // validate the optional field `seoContent`
      if (jsonObj.get("seoContent") != null && !jsonObj.get("seoContent").isJsonNull()) {
        ProductLocalizedSEOContent.validateJsonObject(jsonObj.getAsJsonObject("seoContent"));
      }
      // validate the optional field `slicingSettings`
      if (jsonObj.get("slicingSettings") != null && !jsonObj.get("slicingSettings").isJsonNull()) {
        SlicingSettings.validateJsonObject(jsonObj.getAsJsonObject("slicingSettings"));
      }
      if ((jsonObj.get("standAlonePackageType") != null && !jsonObj.get("standAlonePackageType").isJsonNull()) && !jsonObj.get("standAlonePackageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standAlonePackageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standAlonePackageType").toString()));
      }
      // validate the optional field `supplierInfo`
      if (jsonObj.get("supplierInfo") != null && !jsonObj.get("supplierInfo").isJsonNull()) {
        ProductSupplierInfo.validateJsonObject(jsonObj.getAsJsonObject("supplierInfo"));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("variationKey") != null && !jsonObj.get("variationKey").isJsonNull()) && !jsonObj.get("variationKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variationKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variationKey").toString()));
      }
      if (jsonObj.get("variationOptions") != null && !jsonObj.get("variationOptions").isJsonNull()) {
        JsonArray jsonArrayvariationOptions = jsonObj.getAsJsonArray("variationOptions");
        if (jsonArrayvariationOptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variationOptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variationOptions` to be an array in the JSON string but got `%s`", jsonObj.get("variationOptions").toString()));
          }

          // validate the optional field `variationOptions` (array)
          for (int i = 0; i < jsonArrayvariationOptions.size(); i++) {
            ProductVariationOption.validateJsonObject(jsonArrayvariationOptions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductV1.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductV1>() {
           @Override
           public void write(JsonWriter out, ProductV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductV1
  * @throws IOException if the JSON string is invalid with respect to ProductV1
  */
  public static ProductV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductV1.class);
  }

 /**
  * Convert an instance of ProductV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

