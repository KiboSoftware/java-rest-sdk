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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsActiveDateRange;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductPrice;
import com.kibocommerce.sdk.catalogadministration.models.ProductCategory;
import com.kibocommerce.sdk.catalogadministration.models.ProductLocalizedContent;
import com.kibocommerce.sdk.catalogadministration.models.ProductLocalizedSEOContent;
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
 * Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.
 */
@ApiModel(description = "Use the Products resource to create and manage products for your store. You can create products with options that a shopper configures (such as a T-shirt color and size). The system can manage inventory for all combinations of your product options, and can calculate tax and shipping costs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductInCatalogInfoV1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVE_DATE_RANGE = "activeDateRange";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DATE_RANGE)
  private CatalogAdminsActiveDateRange activeDateRange;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ProductLocalizedContent content;

  public static final String SERIALIZED_NAME_DATE_FIRST_AVAILABLE_IN_CATALOG = "dateFirstAvailableInCatalog";
  @SerializedName(SERIALIZED_NAME_DATE_FIRST_AVAILABLE_IN_CATALOG)
  private OffsetDateTime dateFirstAvailableInCatalog;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_CONTENT_OVERRIDDEN = "isContentOverridden";
  @SerializedName(SERIALIZED_NAME_IS_CONTENT_OVERRIDDEN)
  private Boolean isContentOverridden;

  public static final String SERIALIZED_NAME_IS_PRICE_OVERRIDDEN = "isPriceOverridden";
  @SerializedName(SERIALIZED_NAME_IS_PRICE_OVERRIDDEN)
  private Boolean isPriceOverridden;

  public static final String SERIALIZED_NAME_IS_S_E_O_CONTENT_OVERRIDDEN = "isSEOContentOverridden";
  @SerializedName(SERIALIZED_NAME_IS_S_E_O_CONTENT_OVERRIDDEN)
  private Boolean isSEOContentOverridden;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CatalogAdminsProductPrice price;

  public static final String SERIALIZED_NAME_PRIMARY_PRODUCT_CATEGORY = "primaryProductCategory";
  @SerializedName(SERIALIZED_NAME_PRIMARY_PRODUCT_CATEGORY)
  private ProductCategory primaryProductCategory;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORIES = "productCategories";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORIES)
  private List<ProductCategory> productCategories = null;

  public static final String SERIALIZED_NAME_SEO_CONTENT = "seoContent";
  @SerializedName(SERIALIZED_NAME_SEO_CONTENT)
  private ProductLocalizedSEOContent seoContent;

  public ProductInCatalogInfoV1() {
  }

  public ProductInCatalogInfoV1 activeDateRange(CatalogAdminsActiveDateRange activeDateRange) {
    
    this.activeDateRange = activeDateRange;
    return this;
  }

   /**
   * Get activeDateRange
   * @return activeDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsActiveDateRange getActiveDateRange() {
    return activeDateRange;
  }


  public void setActiveDateRange(CatalogAdminsActiveDateRange activeDateRange) {
    this.activeDateRange = activeDateRange;
  }


  public ProductInCatalogInfoV1 auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public ProductInCatalogInfoV1 catalogId(Integer catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * The CatalogId of the catalog that the product is associated with (The catalog must a valid catalog within the MasterCatalog that the product belongs to)
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CatalogId of the catalog that the product is associated with (The catalog must a valid catalog within the MasterCatalog that the product belongs to)")

  public Integer getCatalogId() {
    return catalogId;
  }


  public void setCatalogId(Integer catalogId) {
    this.catalogId = catalogId;
  }


  public ProductInCatalogInfoV1 content(ProductLocalizedContent content) {
    
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


  public ProductInCatalogInfoV1 dateFirstAvailableInCatalog(OffsetDateTime dateFirstAvailableInCatalog) {
    
    this.dateFirstAvailableInCatalog = dateFirstAvailableInCatalog;
    return this;
  }

   /**
   * Date this product was first Available for sale in the catalog. This is utilized in expressions that reference DaysInCatloag.
   * @return dateFirstAvailableInCatalog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this product was first Available for sale in the catalog. This is utilized in expressions that reference DaysInCatloag.")

  public OffsetDateTime getDateFirstAvailableInCatalog() {
    return dateFirstAvailableInCatalog;
  }


  public void setDateFirstAvailableInCatalog(OffsetDateTime dateFirstAvailableInCatalog) {
    this.dateFirstAvailableInCatalog = dateFirstAvailableInCatalog;
  }


  public ProductInCatalogInfoV1 isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * If true, the product is marked as available for sale in the catalog. Setting a product to IsActive &#x3D; false will prevent it from being shown on the customer facing storefront.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the product is marked as available for sale in the catalog. Setting a product to IsActive = false will prevent it from being shown on the customer facing storefront.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ProductInCatalogInfoV1 isContentOverridden(Boolean isContentOverridden) {
    
    this.isContentOverridden = isContentOverridden;
    return this;
  }

   /**
   * If true, the content for this product is overridden in the catalog. If false, the MasterCatalog level content will be used for the product.
   * @return isContentOverridden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the content for this product is overridden in the catalog. If false, the MasterCatalog level content will be used for the product.")

  public Boolean getIsContentOverridden() {
    return isContentOverridden;
  }


  public void setIsContentOverridden(Boolean isContentOverridden) {
    this.isContentOverridden = isContentOverridden;
  }


  public ProductInCatalogInfoV1 isPriceOverridden(Boolean isPriceOverridden) {
    
    this.isPriceOverridden = isPriceOverridden;
    return this;
  }

   /**
   * If true, the price for this product is overridden in the catalog. If false, the MasterCatalog level price will be used for the product.
   * @return isPriceOverridden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the price for this product is overridden in the catalog. If false, the MasterCatalog level price will be used for the product.")

  public Boolean getIsPriceOverridden() {
    return isPriceOverridden;
  }


  public void setIsPriceOverridden(Boolean isPriceOverridden) {
    this.isPriceOverridden = isPriceOverridden;
  }


  public ProductInCatalogInfoV1 isSEOContentOverridden(Boolean isSEOContentOverridden) {
    
    this.isSEOContentOverridden = isSEOContentOverridden;
    return this;
  }

   /**
   * If true, the SEO content for this product is overridden in the catalog. If false, the MasterCatalog level SEO content will be used for the product.
   * @return isSEOContentOverridden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the SEO content for this product is overridden in the catalog. If false, the MasterCatalog level SEO content will be used for the product.")

  public Boolean getIsSEOContentOverridden() {
    return isSEOContentOverridden;
  }


  public void setIsSEOContentOverridden(Boolean isSEOContentOverridden) {
    this.isSEOContentOverridden = isSEOContentOverridden;
  }


  public ProductInCatalogInfoV1 price(CatalogAdminsProductPrice price) {
    
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


  public ProductInCatalogInfoV1 primaryProductCategory(ProductCategory primaryProductCategory) {
    
    this.primaryProductCategory = primaryProductCategory;
    return this;
  }

   /**
   * Get primaryProductCategory
   * @return primaryProductCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductCategory getPrimaryProductCategory() {
    return primaryProductCategory;
  }


  public void setPrimaryProductCategory(ProductCategory primaryProductCategory) {
    this.primaryProductCategory = primaryProductCategory;
  }


  public ProductInCatalogInfoV1 productCategories(List<ProductCategory> productCategories) {
    
    this.productCategories = productCategories;
    return this;
  }

  public ProductInCatalogInfoV1 addProductCategoriesItem(ProductCategory productCategoriesItem) {
    if (this.productCategories == null) {
      this.productCategories = new ArrayList<>();
    }
    this.productCategories.add(productCategoriesItem);
    return this;
  }

   /**
   * Categories to which the product belongs for this catalog.
   * @return productCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Categories to which the product belongs for this catalog.")

  public List<ProductCategory> getProductCategories() {
    return productCategories;
  }


  public void setProductCategories(List<ProductCategory> productCategories) {
    this.productCategories = productCategories;
  }


  public ProductInCatalogInfoV1 seoContent(ProductLocalizedSEOContent seoContent) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInCatalogInfoV1 productInCatalogInfoV1 = (ProductInCatalogInfoV1) o;
    return Objects.equals(this.activeDateRange, productInCatalogInfoV1.activeDateRange) &&
        Objects.equals(this.auditInfo, productInCatalogInfoV1.auditInfo) &&
        Objects.equals(this.catalogId, productInCatalogInfoV1.catalogId) &&
        Objects.equals(this.content, productInCatalogInfoV1.content) &&
        Objects.equals(this.dateFirstAvailableInCatalog, productInCatalogInfoV1.dateFirstAvailableInCatalog) &&
        Objects.equals(this.isActive, productInCatalogInfoV1.isActive) &&
        Objects.equals(this.isContentOverridden, productInCatalogInfoV1.isContentOverridden) &&
        Objects.equals(this.isPriceOverridden, productInCatalogInfoV1.isPriceOverridden) &&
        Objects.equals(this.isSEOContentOverridden, productInCatalogInfoV1.isSEOContentOverridden) &&
        Objects.equals(this.price, productInCatalogInfoV1.price) &&
        Objects.equals(this.primaryProductCategory, productInCatalogInfoV1.primaryProductCategory) &&
        Objects.equals(this.productCategories, productInCatalogInfoV1.productCategories) &&
        Objects.equals(this.seoContent, productInCatalogInfoV1.seoContent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDateRange, auditInfo, catalogId, content, dateFirstAvailableInCatalog, isActive, isContentOverridden, isPriceOverridden, isSEOContentOverridden, price, primaryProductCategory, productCategories, seoContent);
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
    sb.append("class ProductInCatalogInfoV1 {\n");
    sb.append("    activeDateRange: ").append(toIndentedString(activeDateRange)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    dateFirstAvailableInCatalog: ").append(toIndentedString(dateFirstAvailableInCatalog)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isContentOverridden: ").append(toIndentedString(isContentOverridden)).append("\n");
    sb.append("    isPriceOverridden: ").append(toIndentedString(isPriceOverridden)).append("\n");
    sb.append("    isSEOContentOverridden: ").append(toIndentedString(isSEOContentOverridden)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    primaryProductCategory: ").append(toIndentedString(primaryProductCategory)).append("\n");
    sb.append("    productCategories: ").append(toIndentedString(productCategories)).append("\n");
    sb.append("    seoContent: ").append(toIndentedString(seoContent)).append("\n");
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
    openapiFields.add("activeDateRange");
    openapiFields.add("auditInfo");
    openapiFields.add("catalogId");
    openapiFields.add("content");
    openapiFields.add("dateFirstAvailableInCatalog");
    openapiFields.add("isActive");
    openapiFields.add("isContentOverridden");
    openapiFields.add("isPriceOverridden");
    openapiFields.add("isSEOContentOverridden");
    openapiFields.add("price");
    openapiFields.add("primaryProductCategory");
    openapiFields.add("productCategories");
    openapiFields.add("seoContent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductInCatalogInfoV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductInCatalogInfoV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductInCatalogInfoV1 is not found in the empty JSON string", ProductInCatalogInfoV1.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductInCatalogInfoV1.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductInCatalogInfoV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `activeDateRange`
      if (jsonObj.get("activeDateRange") != null && !jsonObj.get("activeDateRange").isJsonNull()) {
        CatalogAdminsActiveDateRange.validateJsonObject(jsonObj.getAsJsonObject("activeDateRange"));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        ProductLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CatalogAdminsProductPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
      // validate the optional field `primaryProductCategory`
      if (jsonObj.get("primaryProductCategory") != null && !jsonObj.get("primaryProductCategory").isJsonNull()) {
        ProductCategory.validateJsonObject(jsonObj.getAsJsonObject("primaryProductCategory"));
      }
      if (jsonObj.get("productCategories") != null && !jsonObj.get("productCategories").isJsonNull()) {
        JsonArray jsonArrayproductCategories = jsonObj.getAsJsonArray("productCategories");
        if (jsonArrayproductCategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productCategories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productCategories` to be an array in the JSON string but got `%s`", jsonObj.get("productCategories").toString()));
          }

          // validate the optional field `productCategories` (array)
          for (int i = 0; i < jsonArrayproductCategories.size(); i++) {
            ProductCategory.validateJsonObject(jsonArrayproductCategories.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `seoContent`
      if (jsonObj.get("seoContent") != null && !jsonObj.get("seoContent").isJsonNull()) {
        ProductLocalizedSEOContent.validateJsonObject(jsonObj.getAsJsonObject("seoContent"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductInCatalogInfoV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductInCatalogInfoV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductInCatalogInfoV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductInCatalogInfoV1.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductInCatalogInfoV1>() {
           @Override
           public void write(JsonWriter out, ProductInCatalogInfoV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductInCatalogInfoV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductInCatalogInfoV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductInCatalogInfoV1
  * @throws IOException if the JSON string is invalid with respect to ProductInCatalogInfoV1
  */
  public static ProductInCatalogInfoV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductInCatalogInfoV1.class);
  }

 /**
  * Convert an instance of ProductInCatalogInfoV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

