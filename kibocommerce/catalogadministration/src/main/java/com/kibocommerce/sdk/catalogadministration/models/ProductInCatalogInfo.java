/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
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
 * Use the Products resource to create and manage products for your store.  You can create products with options that a shopper configures  (such as a T-shirt color and size). The system can manage inventory for all  combinations of your product options, and can calculate tax and shipping costs.
 */
@ApiModel(description = "Use the Products resource to create and manage products for your store.  You can create products with options that a shopper configures  (such as a T-shirt color and size). The system can manage inventory for all  combinations of your product options, and can calculate tax and shipping costs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductInCatalogInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_CONTENT_OVERRIDDEN = "isContentOverridden";
  @SerializedName(SERIALIZED_NAME_IS_CONTENT_OVERRIDDEN)
  private Boolean isContentOverridden;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ProductLocalizedContent content;

  public static final String SERIALIZED_NAME_IS_PRICE_OVERRIDDEN = "isPriceOverridden";
  @SerializedName(SERIALIZED_NAME_IS_PRICE_OVERRIDDEN)
  private Boolean isPriceOverridden;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CatalogAdminsProductPrice price;

  public static final String SERIALIZED_NAME_IS_SEO_CONTENT_OVERRIDDEN = "isSeoContentOverridden";
  @SerializedName(SERIALIZED_NAME_IS_SEO_CONTENT_OVERRIDDEN)
  private Boolean isSeoContentOverridden;

  public static final String SERIALIZED_NAME_SEO_CONTENT = "seoContent";
  @SerializedName(SERIALIZED_NAME_SEO_CONTENT)
  private ProductLocalizedSEOContent seoContent;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORIES = "productCategories";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORIES)
  private List<ProductCategory> productCategories = null;

  public static final String SERIALIZED_NAME_PRIMARY_PRODUCT_CATEGORY = "primaryProductCategory";
  @SerializedName(SERIALIZED_NAME_PRIMARY_PRODUCT_CATEGORY)
  private ProductCategory primaryProductCategory;

  public static final String SERIALIZED_NAME_DATE_FIRST_AVAILABLE_IN_CATALOG = "dateFirstAvailableInCatalog";
  @SerializedName(SERIALIZED_NAME_DATE_FIRST_AVAILABLE_IN_CATALOG)
  private OffsetDateTime dateFirstAvailableInCatalog;

  public static final String SERIALIZED_NAME_ACTIVE_DATE_RANGE = "activeDateRange";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DATE_RANGE)
  private CatalogAdminsActiveDateRange activeDateRange;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public ProductInCatalogInfo() {
  }

  public ProductInCatalogInfo catalogId(Integer catalogId) {
    
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


  public ProductInCatalogInfo isActive(Boolean isActive) {
    
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


  public ProductInCatalogInfo isContentOverridden(Boolean isContentOverridden) {
    
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


  public ProductInCatalogInfo content(ProductLocalizedContent content) {
    
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


  public ProductInCatalogInfo isPriceOverridden(Boolean isPriceOverridden) {
    
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


  public ProductInCatalogInfo price(CatalogAdminsProductPrice price) {
    
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


  public ProductInCatalogInfo isSeoContentOverridden(Boolean isSeoContentOverridden) {
    
    this.isSeoContentOverridden = isSeoContentOverridden;
    return this;
  }

   /**
   * If true, the SEO content for this product is overridden in the catalog. If false, the MasterCatalog level SEO content will be used for the product.
   * @return isSeoContentOverridden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the SEO content for this product is overridden in the catalog. If false, the MasterCatalog level SEO content will be used for the product.")

  public Boolean getIsSeoContentOverridden() {
    return isSeoContentOverridden;
  }


  public void setIsSeoContentOverridden(Boolean isSeoContentOverridden) {
    this.isSeoContentOverridden = isSeoContentOverridden;
  }


  public ProductInCatalogInfo seoContent(ProductLocalizedSEOContent seoContent) {
    
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


  public ProductInCatalogInfo productCategories(List<ProductCategory> productCategories) {
    
    this.productCategories = productCategories;
    return this;
  }

  public ProductInCatalogInfo addProductCategoriesItem(ProductCategory productCategoriesItem) {
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


  public ProductInCatalogInfo primaryProductCategory(ProductCategory primaryProductCategory) {
    
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


  public ProductInCatalogInfo dateFirstAvailableInCatalog(OffsetDateTime dateFirstAvailableInCatalog) {
    
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


  public ProductInCatalogInfo activeDateRange(CatalogAdminsActiveDateRange activeDateRange) {
    
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


  public ProductInCatalogInfo auditInfo(AdminUserAuditInfo auditInfo) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInCatalogInfo productInCatalogInfo = (ProductInCatalogInfo) o;
    return Objects.equals(this.catalogId, productInCatalogInfo.catalogId) &&
        Objects.equals(this.isActive, productInCatalogInfo.isActive) &&
        Objects.equals(this.isContentOverridden, productInCatalogInfo.isContentOverridden) &&
        Objects.equals(this.content, productInCatalogInfo.content) &&
        Objects.equals(this.isPriceOverridden, productInCatalogInfo.isPriceOverridden) &&
        Objects.equals(this.price, productInCatalogInfo.price) &&
        Objects.equals(this.isSeoContentOverridden, productInCatalogInfo.isSeoContentOverridden) &&
        Objects.equals(this.seoContent, productInCatalogInfo.seoContent) &&
        Objects.equals(this.productCategories, productInCatalogInfo.productCategories) &&
        Objects.equals(this.primaryProductCategory, productInCatalogInfo.primaryProductCategory) &&
        Objects.equals(this.dateFirstAvailableInCatalog, productInCatalogInfo.dateFirstAvailableInCatalog) &&
        Objects.equals(this.activeDateRange, productInCatalogInfo.activeDateRange) &&
        Objects.equals(this.auditInfo, productInCatalogInfo.auditInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, isActive, isContentOverridden, content, isPriceOverridden, price, isSeoContentOverridden, seoContent, productCategories, primaryProductCategory, dateFirstAvailableInCatalog, activeDateRange, auditInfo);
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
    sb.append("class ProductInCatalogInfo {\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isContentOverridden: ").append(toIndentedString(isContentOverridden)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    isPriceOverridden: ").append(toIndentedString(isPriceOverridden)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isSeoContentOverridden: ").append(toIndentedString(isSeoContentOverridden)).append("\n");
    sb.append("    seoContent: ").append(toIndentedString(seoContent)).append("\n");
    sb.append("    productCategories: ").append(toIndentedString(productCategories)).append("\n");
    sb.append("    primaryProductCategory: ").append(toIndentedString(primaryProductCategory)).append("\n");
    sb.append("    dateFirstAvailableInCatalog: ").append(toIndentedString(dateFirstAvailableInCatalog)).append("\n");
    sb.append("    activeDateRange: ").append(toIndentedString(activeDateRange)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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
    openapiFields.add("catalogId");
    openapiFields.add("isActive");
    openapiFields.add("isContentOverridden");
    openapiFields.add("content");
    openapiFields.add("isPriceOverridden");
    openapiFields.add("price");
    openapiFields.add("isSeoContentOverridden");
    openapiFields.add("seoContent");
    openapiFields.add("productCategories");
    openapiFields.add("primaryProductCategory");
    openapiFields.add("dateFirstAvailableInCatalog");
    openapiFields.add("activeDateRange");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductInCatalogInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductInCatalogInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductInCatalogInfo is not found in the empty JSON string", ProductInCatalogInfo.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductInCatalogInfo.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductInCatalogInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        ProductLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CatalogAdminsProductPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
      // validate the optional field `seoContent`
      if (jsonObj.get("seoContent") != null && !jsonObj.get("seoContent").isJsonNull()) {
        ProductLocalizedSEOContent.validateJsonObject(jsonObj.getAsJsonObject("seoContent"));
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
      // validate the optional field `primaryProductCategory`
      if (jsonObj.get("primaryProductCategory") != null && !jsonObj.get("primaryProductCategory").isJsonNull()) {
        ProductCategory.validateJsonObject(jsonObj.getAsJsonObject("primaryProductCategory"));
      }
      // validate the optional field `activeDateRange`
      if (jsonObj.get("activeDateRange") != null && !jsonObj.get("activeDateRange").isJsonNull()) {
        CatalogAdminsActiveDateRange.validateJsonObject(jsonObj.getAsJsonObject("activeDateRange"));
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductInCatalogInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductInCatalogInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductInCatalogInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductInCatalogInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductInCatalogInfo>() {
           @Override
           public void write(JsonWriter out, ProductInCatalogInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductInCatalogInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductInCatalogInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductInCatalogInfo
  * @throws IOException if the JSON string is invalid with respect to ProductInCatalogInfo
  */
  public static ProductInCatalogInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductInCatalogInfo.class);
  }

 /**
  * Convert an instance of ProductInCatalogInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

