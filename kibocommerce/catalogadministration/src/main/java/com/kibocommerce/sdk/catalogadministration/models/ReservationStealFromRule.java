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
import com.kibocommerce.sdk.catalogadministration.models.ProductRuleCode;
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
 * Reservation Steal-From Rule contract (CAT-7911). Structurally identical to Mozu.ProductAdmin.Contracts.ReservationRules.ReservationRule except it does not have &#x60;TimeFenceDays&#x60;; instead it adds an explicit Mozu.ProductAdmin.Contracts.ReservationStealFromRules.ReservationStealFromRule.StartDate/Mozu.ProductAdmin.Contracts.ReservationStealFromRules.ReservationStealFromRule.EndDate window during which the rule is enabled — the same effective-date-window concept used by Discounts and Price Lists, not a reworded time fence. Fully independent of the sibling Mozu.ProductAdmin.Contracts.ReservationStealForRules.ReservationStealForRule.
 */
@ApiModel(description = "Reservation Steal-From Rule contract (CAT-7911). Structurally identical to Mozu.ProductAdmin.Contracts.ReservationRules.ReservationRule except it does not have `TimeFenceDays`; instead it adds an explicit Mozu.ProductAdmin.Contracts.ReservationStealFromRules.ReservationStealFromRule.StartDate/Mozu.ProductAdmin.Contracts.ReservationStealFromRules.ReservationStealFromRule.EndDate window during which the rule is enabled — the same effective-date-window concept used by Discounts and Price Lists, not a reworded time fence. Fully independent of the sibling Mozu.ProductAdmin.Contracts.ReservationStealForRules.ReservationStealForRule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReservationStealFromRule implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CALL_OFF_ORDER_RULES = "callOffOrderRules";
  @SerializedName(SERIALIZED_NAME_CALL_OFF_ORDER_RULES)
  private List<String> callOffOrderRules = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CUSTOMER_RULES = "customerRules";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_RULES)
  private List<String> customerRules = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_RULES = "productRules";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RULES)
  private List<ProductRuleCode> productRules = null;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_SORT_ATTRIBUTE = "sortAttribute";
  @SerializedName(SERIALIZED_NAME_SORT_ATTRIBUTE)
  private String sortAttribute;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_VALID_FOR_ALL_SITES = "validForAllSites";
  @SerializedName(SERIALIZED_NAME_VALID_FOR_ALL_SITES)
  private Boolean validForAllSites;

  public static final String SERIALIZED_NAME_VALID_SITES = "validSites";
  @SerializedName(SERIALIZED_NAME_VALID_SITES)
  private List<Integer> validSites = null;

  public ReservationStealFromRule() {
  }

  public ReservationStealFromRule auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public ReservationStealFromRule callOffOrderRules(List<String> callOffOrderRules) {
    
    this.callOffOrderRules = callOffOrderRules;
    return this;
  }

  public ReservationStealFromRule addCallOffOrderRulesItem(String callOffOrderRulesItem) {
    if (this.callOffOrderRules == null) {
      this.callOffOrderRules = new ArrayList<>();
    }
    this.callOffOrderRules.add(callOffOrderRulesItem);
    return this;
  }

   /**
   * Referenced call-off-order rule codes. Max 1 entry.
   * @return callOffOrderRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Referenced call-off-order rule codes. Max 1 entry.")

  public List<String> getCallOffOrderRules() {
    return callOffOrderRules;
  }


  public void setCallOffOrderRules(List<String> callOffOrderRules) {
    this.callOffOrderRules = callOffOrderRules;
  }


  public ReservationStealFromRule code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique identifier. Auto-generated when omitted on create.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier. Auto-generated when omitted on create.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ReservationStealFromRule customerRules(List<String> customerRules) {
    
    this.customerRules = customerRules;
    return this;
  }

  public ReservationStealFromRule addCustomerRulesItem(String customerRulesItem) {
    if (this.customerRules == null) {
      this.customerRules = new ArrayList<>();
    }
    this.customerRules.add(customerRulesItem);
    return this;
  }

   /**
   * Referenced customer rule codes. Max 1 entry.
   * @return customerRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Referenced customer rule codes. Max 1 entry.")

  public List<String> getCustomerRules() {
    return customerRules;
  }


  public void setCustomerRules(List<String> customerRules) {
    this.customerRules = customerRules;
  }


  public ReservationStealFromRule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Optional description, max 500 chars.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional description, max 500 chars.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReservationStealFromRule enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the rule is active. Defaults to true when omitted/null on create or update.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the rule is active. Defaults to true when omitted/null on create or update.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ReservationStealFromRule endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of the rule's effective window. Null = never expires. Must be >= StartDate when both supplied.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public ReservationStealFromRule isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ReservationStealFromRule metaData(Object metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Opaque JSON metadata. Passed through unchanged.
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Opaque JSON metadata. Passed through unchanged.")

  public Object getMetaData() {
    return metaData;
  }


  public void setMetaData(Object metaData) {
    this.metaData = metaData;
  }


  public ReservationStealFromRule name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Display name. Required, max 200 chars.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display name. Required, max 200 chars.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReservationStealFromRule productRules(List<ProductRuleCode> productRules) {
    
    this.productRules = productRules;
    return this;
  }

  public ReservationStealFromRule addProductRulesItem(ProductRuleCode productRulesItem) {
    if (this.productRules == null) {
      this.productRules = new ArrayList<>();
    }
    this.productRules.add(productRulesItem);
    return this;
  }

   /**
   * Referenced product rules. Max 1 entry.
   * @return productRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Referenced product rules. Max 1 entry.")

  public List<ProductRuleCode> getProductRules() {
    return productRules;
  }


  public void setProductRules(List<ProductRuleCode> productRules) {
    this.productRules = productRules;
  }


  public ReservationStealFromRule rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * Priority rank, unique per master catalog within the tenant. Auto-assigned on create when omitted or ≤0. Rejected (not auto-assigned) on update when omitted or ≤0.
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority rank, unique per master catalog within the tenant. Auto-assigned on create when omitted or ≤0. Rejected (not auto-assigned) on update when omitted or ≤0.")

  public Integer getRank() {
    return rank;
  }


  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public ReservationStealFromRule sortAttribute(String sortAttribute) {
    
    this.sortAttribute = sortAttribute;
    return this;
  }

   /**
   * Optional tiebreaker attribute name used by the reservation-stealing engine when two candidates match. Max 50 chars.
   * @return sortAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional tiebreaker attribute name used by the reservation-stealing engine when two candidates match. Max 50 chars.")

  public String getSortAttribute() {
    return sortAttribute;
  }


  public void setSortAttribute(String sortAttribute) {
    this.sortAttribute = sortAttribute;
  }


  public ReservationStealFromRule startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start of the rule&#39;s effective window. Null &#x3D; no lower bound.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of the rule's effective window. Null = no lower bound.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public ReservationStealFromRule validForAllSites(Boolean validForAllSites) {
    
    this.validForAllSites = validForAllSites;
    return this;
  }

   /**
   * When true the rule applies to all sites; ValidSites is ignored. When false/omitted and             ValidSites is also omitted, ValidSites auto-populates with the calling site from the request             context (FR-022); the save is rejected if no site context is available.
   * @return validForAllSites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true the rule applies to all sites; ValidSites is ignored. When false/omitted and             ValidSites is also omitted, ValidSites auto-populates with the calling site from the request             context (FR-022); the save is rejected if no site context is available.")

  public Boolean getValidForAllSites() {
    return validForAllSites;
  }


  public void setValidForAllSites(Boolean validForAllSites) {
    this.validForAllSites = validForAllSites;
  }


  public ReservationStealFromRule validSites(List<Integer> validSites) {
    
    this.validSites = validSites;
    return this;
  }

  public ReservationStealFromRule addValidSitesItem(Integer validSitesItem) {
    if (this.validSites == null) {
      this.validSites = new ArrayList<>();
    }
    this.validSites.add(validSitesItem);
    return this;
  }

   /**
   * Site IDs this rule applies to.
   * @return validSites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Site IDs this rule applies to.")

  public List<Integer> getValidSites() {
    return validSites;
  }


  public void setValidSites(List<Integer> validSites) {
    this.validSites = validSites;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationStealFromRule reservationStealFromRule = (ReservationStealFromRule) o;
    return Objects.equals(this.auditInfo, reservationStealFromRule.auditInfo) &&
        Objects.equals(this.callOffOrderRules, reservationStealFromRule.callOffOrderRules) &&
        Objects.equals(this.code, reservationStealFromRule.code) &&
        Objects.equals(this.customerRules, reservationStealFromRule.customerRules) &&
        Objects.equals(this.description, reservationStealFromRule.description) &&
        Objects.equals(this.enabled, reservationStealFromRule.enabled) &&
        Objects.equals(this.endDate, reservationStealFromRule.endDate) &&
        Objects.equals(this.isActive, reservationStealFromRule.isActive) &&
        Objects.equals(this.metaData, reservationStealFromRule.metaData) &&
        Objects.equals(this.name, reservationStealFromRule.name) &&
        Objects.equals(this.productRules, reservationStealFromRule.productRules) &&
        Objects.equals(this.rank, reservationStealFromRule.rank) &&
        Objects.equals(this.sortAttribute, reservationStealFromRule.sortAttribute) &&
        Objects.equals(this.startDate, reservationStealFromRule.startDate) &&
        Objects.equals(this.validForAllSites, reservationStealFromRule.validForAllSites) &&
        Objects.equals(this.validSites, reservationStealFromRule.validSites);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, callOffOrderRules, code, customerRules, description, enabled, endDate, isActive, metaData, name, productRules, rank, sortAttribute, startDate, validForAllSites, validSites);
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
    sb.append("class ReservationStealFromRule {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    callOffOrderRules: ").append(toIndentedString(callOffOrderRules)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    customerRules: ").append(toIndentedString(customerRules)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productRules: ").append(toIndentedString(productRules)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    sortAttribute: ").append(toIndentedString(sortAttribute)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    validForAllSites: ").append(toIndentedString(validForAllSites)).append("\n");
    sb.append("    validSites: ").append(toIndentedString(validSites)).append("\n");
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
    openapiFields.add("auditInfo");
    openapiFields.add("callOffOrderRules");
    openapiFields.add("code");
    openapiFields.add("customerRules");
    openapiFields.add("description");
    openapiFields.add("enabled");
    openapiFields.add("endDate");
    openapiFields.add("isActive");
    openapiFields.add("metaData");
    openapiFields.add("name");
    openapiFields.add("productRules");
    openapiFields.add("rank");
    openapiFields.add("sortAttribute");
    openapiFields.add("startDate");
    openapiFields.add("validForAllSites");
    openapiFields.add("validSites");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReservationStealFromRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReservationStealFromRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReservationStealFromRule is not found in the empty JSON string", ReservationStealFromRule.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ReservationStealFromRule.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReservationStealFromRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("callOffOrderRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `callOffOrderRules` to be an array in the JSON string but got `%s`", jsonObj.get("callOffOrderRules").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("customerRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerRules` to be an array in the JSON string but got `%s`", jsonObj.get("customerRules").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("productRules") != null && !jsonObj.get("productRules").isJsonNull()) {
        JsonArray jsonArrayproductRules = jsonObj.getAsJsonArray("productRules");
        if (jsonArrayproductRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productRules` to be an array in the JSON string but got `%s`", jsonObj.get("productRules").toString()));
          }

          // validate the optional field `productRules` (array)
          for (int i = 0; i < jsonArrayproductRules.size(); i++) {
            ProductRuleCode.validateJsonObject(jsonArrayproductRules.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("sortAttribute") != null && !jsonObj.get("sortAttribute").isJsonNull()) && !jsonObj.get("sortAttribute").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortAttribute` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortAttribute").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("validSites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validSites` to be an array in the JSON string but got `%s`", jsonObj.get("validSites").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReservationStealFromRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReservationStealFromRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReservationStealFromRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReservationStealFromRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ReservationStealFromRule>() {
           @Override
           public void write(JsonWriter out, ReservationStealFromRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReservationStealFromRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReservationStealFromRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReservationStealFromRule
  * @throws IOException if the JSON string is invalid with respect to ReservationStealFromRule
  */
  public static ReservationStealFromRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReservationStealFromRule.class);
  }

 /**
  * Convert an instance of ReservationStealFromRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

