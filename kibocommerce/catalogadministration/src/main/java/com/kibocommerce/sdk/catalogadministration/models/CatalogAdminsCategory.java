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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsCategoryAttribute;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsDynamicExpression;
import com.kibocommerce.sdk.catalogadministration.models.CategoryLocalizedContent;
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
 * Category
 */
@ApiModel(description = "Category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsCategory implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVE_DATE_END = "activeDateEnd";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DATE_END)
  private OffsetDateTime activeDateEnd;

  public static final String SERIALIZED_NAME_ACTIVE_DATE_START = "activeDateStart";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DATE_START)
  private OffsetDateTime activeDateStart;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<CatalogAdminsCategoryAttribute> attributes = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_CATEGORY_TYPE = "categoryType";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TYPE)
  private String categoryType;

  public static final String SERIALIZED_NAME_CHILD_COUNT = "childCount";
  @SerializedName(SERIALIZED_NAME_CHILD_COUNT)
  private Integer childCount;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private CategoryLocalizedContent content;

  public static final String SERIALIZED_NAME_DYNAMIC_EXPRESSION = "dynamicExpression";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_EXPRESSION)
  private CatalogAdminsDynamicExpression dynamicExpression;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_DISPLAYED = "isDisplayed";
  @SerializedName(SERIALIZED_NAME_IS_DISPLAYED)
  private Boolean isDisplayed;

  public static final String SERIALIZED_NAME_LOCALIZED_CONTENT = "localizedContent";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_CONTENT)
  private List<CategoryLocalizedContent> localizedContent = null;

  public static final String SERIALIZED_NAME_PARENT_CATEGORY_CODE = "parentCategoryCode";
  @SerializedName(SERIALIZED_NAME_PARENT_CATEGORY_CODE)
  private String parentCategoryCode;

  public static final String SERIALIZED_NAME_PARENT_CATEGORY_ID = "parentCategoryId";
  @SerializedName(SERIALIZED_NAME_PARENT_CATEGORY_ID)
  private Integer parentCategoryId;

  public static final String SERIALIZED_NAME_PARENT_CATEGORY_NAME = "parentCategoryName";
  @SerializedName(SERIALIZED_NAME_PARENT_CATEGORY_NAME)
  private String parentCategoryName;

  public static final String SERIALIZED_NAME_PARENT_IS_ACTIVE = "parentIsActive";
  @SerializedName(SERIALIZED_NAME_PARENT_IS_ACTIVE)
  private Boolean parentIsActive;

  public static final String SERIALIZED_NAME_PRODUCT_COUNT = "productCount";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COUNT)
  private Integer productCount;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_SHOULD_SLICE = "shouldSlice";
  @SerializedName(SERIALIZED_NAME_SHOULD_SLICE)
  private Boolean shouldSlice;

  public CatalogAdminsCategory() {
  }

  public CatalogAdminsCategory activeDateEnd(OffsetDateTime activeDateEnd) {
    
    this.activeDateEnd = activeDateEnd;
    return this;
  }

   /**
   * Active end Date
   * @return activeDateEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active end Date")

  public OffsetDateTime getActiveDateEnd() {
    return activeDateEnd;
  }


  public void setActiveDateEnd(OffsetDateTime activeDateEnd) {
    this.activeDateEnd = activeDateEnd;
  }


  public CatalogAdminsCategory activeDateStart(OffsetDateTime activeDateStart) {
    
    this.activeDateStart = activeDateStart;
    return this;
  }

   /**
   * Active Start Date
   * @return activeDateStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active Start Date")

  public OffsetDateTime getActiveDateStart() {
    return activeDateStart;
  }


  public void setActiveDateStart(OffsetDateTime activeDateStart) {
    this.activeDateStart = activeDateStart;
  }


  public CatalogAdminsCategory attributes(List<CatalogAdminsCategoryAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public CatalogAdminsCategory addAttributesItem(CatalogAdminsCategoryAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * List of attributes for the category.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attributes for the category.")

  public List<CatalogAdminsCategoryAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<CatalogAdminsCategoryAttribute> attributes) {
    this.attributes = attributes;
  }


  public CatalogAdminsCategory auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public CatalogAdminsCategory catalogId(Integer catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * The CatalogId that the category belongs to.
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CatalogId that the category belongs to.")

  public Integer getCatalogId() {
    return catalogId;
  }


  public void setCatalogId(Integer catalogId) {
    this.catalogId = catalogId;
  }


  public CatalogAdminsCategory categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * External unique identifier of the category.
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External unique identifier of the category.")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public CatalogAdminsCategory categoryType(String categoryType) {
    
    this.categoryType = categoryType;
    return this;
  }

   /**
   * The Type of Category Static, Dyanmic, DynamicPreComputed
   * @return categoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Type of Category Static, Dyanmic, DynamicPreComputed")

  public String getCategoryType() {
    return categoryType;
  }


  public void setCategoryType(String categoryType) {
    this.categoryType = categoryType;
  }


  public CatalogAdminsCategory childCount(Integer childCount) {
    
    this.childCount = childCount;
    return this;
  }

   /**
   * Number of subcategories that belong to this category. These subcategories are at the same level (siblings).
   * @return childCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of subcategories that belong to this category. These subcategories are at the same level (siblings).")

  public Integer getChildCount() {
    return childCount;
  }


  public void setChildCount(Integer childCount) {
    this.childCount = childCount;
  }


  public CatalogAdminsCategory content(CategoryLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CategoryLocalizedContent getContent() {
    return content;
  }


  public void setContent(CategoryLocalizedContent content) {
    this.content = content;
  }


  public CatalogAdminsCategory dynamicExpression(CatalogAdminsDynamicExpression dynamicExpression) {
    
    this.dynamicExpression = dynamicExpression;
    return this;
  }

   /**
   * Get dynamicExpression
   * @return dynamicExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsDynamicExpression getDynamicExpression() {
    return dynamicExpression;
  }


  public void setDynamicExpression(CatalogAdminsDynamicExpression dynamicExpression) {
    this.dynamicExpression = dynamicExpression;
  }


  public CatalogAdminsCategory id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Internal unique identifier of the category. System-supplied and read-only.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal unique identifier of the category. System-supplied and read-only.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CatalogAdminsCategory isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * If false, the category is considered unavailable in runtime (default is true if not specified on create)
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If false, the category is considered unavailable in runtime (default is true if not specified on create)")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public CatalogAdminsCategory isDisplayed(Boolean isDisplayed) {
    
    this.isDisplayed = isDisplayed;
    return this;
  }

   /**
   * If true, the category appears to shoppers on the storefront.
   * @return isDisplayed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the category appears to shoppers on the storefront.")

  public Boolean getIsDisplayed() {
    return isDisplayed;
  }


  public void setIsDisplayed(Boolean isDisplayed) {
    this.isDisplayed = isDisplayed;
  }


  public CatalogAdminsCategory localizedContent(List<CategoryLocalizedContent> localizedContent) {
    
    this.localizedContent = localizedContent;
    return this;
  }

  public CatalogAdminsCategory addLocalizedContentItem(CategoryLocalizedContent localizedContentItem) {
    if (this.localizedContent == null) {
      this.localizedContent = new ArrayList<>();
    }
    this.localizedContent.add(localizedContentItem);
    return this;
  }

   /**
   * Container for language-specific content to display on the storefront. You&#39;ll have a container for each supported language (LocaleCode).  This enables you to display a category in multiple languages yet manage it as a single category internally.
   * @return localizedContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container for language-specific content to display on the storefront. You'll have a container for each supported language (LocaleCode).  This enables you to display a category in multiple languages yet manage it as a single category internally.")

  public List<CategoryLocalizedContent> getLocalizedContent() {
    return localizedContent;
  }


  public void setLocalizedContent(List<CategoryLocalizedContent> localizedContent) {
    this.localizedContent = localizedContent;
  }


  public CatalogAdminsCategory parentCategoryCode(String parentCategoryCode) {
    
    this.parentCategoryCode = parentCategoryCode;
    return this;
  }

   /**
   * Get parentCategoryCode
   * @return parentCategoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentCategoryCode() {
    return parentCategoryCode;
  }


  public void setParentCategoryCode(String parentCategoryCode) {
    this.parentCategoryCode = parentCategoryCode;
  }


  public CatalogAdminsCategory parentCategoryId(Integer parentCategoryId) {
    
    this.parentCategoryId = parentCategoryId;
    return this;
  }

   /**
   * Unique identifier of the category to which this category belongs. If nil, this is a top-level category. System-supplied and read-only.
   * @return parentCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the category to which this category belongs. If nil, this is a top-level category. System-supplied and read-only.")

  public Integer getParentCategoryId() {
    return parentCategoryId;
  }


  public void setParentCategoryId(Integer parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }


  public CatalogAdminsCategory parentCategoryName(String parentCategoryName) {
    
    this.parentCategoryName = parentCategoryName;
    return this;
  }

   /**
   * Get parentCategoryName
   * @return parentCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentCategoryName() {
    return parentCategoryName;
  }


  public void setParentCategoryName(String parentCategoryName) {
    this.parentCategoryName = parentCategoryName;
  }


  public CatalogAdminsCategory parentIsActive(Boolean parentIsActive) {
    
    this.parentIsActive = parentIsActive;
    return this;
  }

   /**
   * Get parentIsActive
   * @return parentIsActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getParentIsActive() {
    return parentIsActive;
  }


  public void setParentIsActive(Boolean parentIsActive) {
    this.parentIsActive = parentIsActive;
  }


  public CatalogAdminsCategory productCount(Integer productCount) {
    
    this.productCount = productCount;
    return this;
  }

   /**
   * Number of products contained in this category. This count includes all products contained in any subcategories of this category.
   * @return productCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of products contained in this category. This count includes all products contained in any subcategories of this category.")

  public Integer getProductCount() {
    return productCount;
  }


  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }


  public CatalogAdminsCategory sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Order in which categories appear when they are at the same level (siblings). For example, you could change the sequence of categories so that a specific category always appears first.
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order in which categories appear when they are at the same level (siblings). For example, you could change the sequence of categories so that a specific category always appears first.")

  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public CatalogAdminsCategory shouldSlice(Boolean shouldSlice) {
    
    this.shouldSlice = shouldSlice;
    return this;
  }

   /**
   * If True, search displays sliced view
   * @return shouldSlice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True, search displays sliced view")

  public Boolean getShouldSlice() {
    return shouldSlice;
  }


  public void setShouldSlice(Boolean shouldSlice) {
    this.shouldSlice = shouldSlice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsCategory catalogAdminsCategory = (CatalogAdminsCategory) o;
    return Objects.equals(this.activeDateEnd, catalogAdminsCategory.activeDateEnd) &&
        Objects.equals(this.activeDateStart, catalogAdminsCategory.activeDateStart) &&
        Objects.equals(this.attributes, catalogAdminsCategory.attributes) &&
        Objects.equals(this.auditInfo, catalogAdminsCategory.auditInfo) &&
        Objects.equals(this.catalogId, catalogAdminsCategory.catalogId) &&
        Objects.equals(this.categoryCode, catalogAdminsCategory.categoryCode) &&
        Objects.equals(this.categoryType, catalogAdminsCategory.categoryType) &&
        Objects.equals(this.childCount, catalogAdminsCategory.childCount) &&
        Objects.equals(this.content, catalogAdminsCategory.content) &&
        Objects.equals(this.dynamicExpression, catalogAdminsCategory.dynamicExpression) &&
        Objects.equals(this.id, catalogAdminsCategory.id) &&
        Objects.equals(this.isActive, catalogAdminsCategory.isActive) &&
        Objects.equals(this.isDisplayed, catalogAdminsCategory.isDisplayed) &&
        Objects.equals(this.localizedContent, catalogAdminsCategory.localizedContent) &&
        Objects.equals(this.parentCategoryCode, catalogAdminsCategory.parentCategoryCode) &&
        Objects.equals(this.parentCategoryId, catalogAdminsCategory.parentCategoryId) &&
        Objects.equals(this.parentCategoryName, catalogAdminsCategory.parentCategoryName) &&
        Objects.equals(this.parentIsActive, catalogAdminsCategory.parentIsActive) &&
        Objects.equals(this.productCount, catalogAdminsCategory.productCount) &&
        Objects.equals(this.sequence, catalogAdminsCategory.sequence) &&
        Objects.equals(this.shouldSlice, catalogAdminsCategory.shouldSlice);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDateEnd, activeDateStart, attributes, auditInfo, catalogId, categoryCode, categoryType, childCount, content, dynamicExpression, id, isActive, isDisplayed, localizedContent, parentCategoryCode, parentCategoryId, parentCategoryName, parentIsActive, productCount, sequence, shouldSlice);
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
    sb.append("class CatalogAdminsCategory {\n");
    sb.append("    activeDateEnd: ").append(toIndentedString(activeDateEnd)).append("\n");
    sb.append("    activeDateStart: ").append(toIndentedString(activeDateStart)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    categoryType: ").append(toIndentedString(categoryType)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    dynamicExpression: ").append(toIndentedString(dynamicExpression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDisplayed: ").append(toIndentedString(isDisplayed)).append("\n");
    sb.append("    localizedContent: ").append(toIndentedString(localizedContent)).append("\n");
    sb.append("    parentCategoryCode: ").append(toIndentedString(parentCategoryCode)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
    sb.append("    parentCategoryName: ").append(toIndentedString(parentCategoryName)).append("\n");
    sb.append("    parentIsActive: ").append(toIndentedString(parentIsActive)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    shouldSlice: ").append(toIndentedString(shouldSlice)).append("\n");
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
    openapiFields.add("activeDateEnd");
    openapiFields.add("activeDateStart");
    openapiFields.add("attributes");
    openapiFields.add("auditInfo");
    openapiFields.add("catalogId");
    openapiFields.add("categoryCode");
    openapiFields.add("categoryType");
    openapiFields.add("childCount");
    openapiFields.add("content");
    openapiFields.add("dynamicExpression");
    openapiFields.add("id");
    openapiFields.add("isActive");
    openapiFields.add("isDisplayed");
    openapiFields.add("localizedContent");
    openapiFields.add("parentCategoryCode");
    openapiFields.add("parentCategoryId");
    openapiFields.add("parentCategoryName");
    openapiFields.add("parentIsActive");
    openapiFields.add("productCount");
    openapiFields.add("sequence");
    openapiFields.add("shouldSlice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsCategory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsCategory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsCategory is not found in the empty JSON string", CatalogAdminsCategory.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsCategory.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsCategory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            CatalogAdminsCategoryAttribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("categoryCode") != null && !jsonObj.get("categoryCode").isJsonNull()) && !jsonObj.get("categoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryCode").toString()));
      }
      if ((jsonObj.get("categoryType") != null && !jsonObj.get("categoryType").isJsonNull()) && !jsonObj.get("categoryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryType").toString()));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        CategoryLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      // validate the optional field `dynamicExpression`
      if (jsonObj.get("dynamicExpression") != null && !jsonObj.get("dynamicExpression").isJsonNull()) {
        CatalogAdminsDynamicExpression.validateJsonObject(jsonObj.getAsJsonObject("dynamicExpression"));
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
            CategoryLocalizedContent.validateJsonObject(jsonArraylocalizedContent.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("parentCategoryCode") != null && !jsonObj.get("parentCategoryCode").isJsonNull()) && !jsonObj.get("parentCategoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentCategoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentCategoryCode").toString()));
      }
      if ((jsonObj.get("parentCategoryName") != null && !jsonObj.get("parentCategoryName").isJsonNull()) && !jsonObj.get("parentCategoryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentCategoryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentCategoryName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsCategory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsCategory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsCategory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsCategory.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsCategory>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsCategory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsCategory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsCategory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsCategory
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsCategory
  */
  public static CatalogAdminsCategory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsCategory.class);
  }

 /**
  * Convert an instance of CatalogAdminsCategory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

