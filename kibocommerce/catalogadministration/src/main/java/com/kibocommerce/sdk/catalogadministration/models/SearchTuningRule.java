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
import com.kibocommerce.sdk.catalogadministration.models.SearchTuningRuleFilter;
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
 * SearchTuningRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchTuningRule implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ACTIVE_END_DATE = "activeEndDate";
  @SerializedName(SERIALIZED_NAME_ACTIVE_END_DATE)
  private OffsetDateTime activeEndDate;

  public static final String SERIALIZED_NAME_ACTIVE_START_DATE = "activeStartDate";
  @SerializedName(SERIALIZED_NAME_ACTIVE_START_DATE)
  private OffsetDateTime activeStartDate;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_BLOCKED_PRODUCT_CODES = "blockedProductCodes";
  @SerializedName(SERIALIZED_NAME_BLOCKED_PRODUCT_CODES)
  private List<String> blockedProductCodes = null;

  public static final String SERIALIZED_NAME_BOOSTED_PRODUCT_CODES = "boostedProductCodes";
  @SerializedName(SERIALIZED_NAME_BOOSTED_PRODUCT_CODES)
  private List<String> boostedProductCodes = null;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<SearchTuningRuleFilter> filters = null;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_SEARCH_TUNING_RULE_CODE = "searchTuningRuleCode";
  @SerializedName(SERIALIZED_NAME_SEARCH_TUNING_RULE_CODE)
  private String searchTuningRuleCode;

  public static final String SERIALIZED_NAME_SEARCH_TUNING_RULE_DESCRIPTION = "searchTuningRuleDescription";
  @SerializedName(SERIALIZED_NAME_SEARCH_TUNING_RULE_DESCRIPTION)
  private String searchTuningRuleDescription;

  public static final String SERIALIZED_NAME_SEARCH_TUNING_RULE_NAME = "searchTuningRuleName";
  @SerializedName(SERIALIZED_NAME_SEARCH_TUNING_RULE_NAME)
  private String searchTuningRuleName;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public SearchTuningRule() {
  }

  public SearchTuningRule active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public SearchTuningRule activeEndDate(OffsetDateTime activeEndDate) {
    
    this.activeEndDate = activeEndDate;
    return this;
  }

   /**
   * Get activeEndDate
   * @return activeEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getActiveEndDate() {
    return activeEndDate;
  }


  public void setActiveEndDate(OffsetDateTime activeEndDate) {
    this.activeEndDate = activeEndDate;
  }


  public SearchTuningRule activeStartDate(OffsetDateTime activeStartDate) {
    
    this.activeStartDate = activeStartDate;
    return this;
  }

   /**
   * Get activeStartDate
   * @return activeStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getActiveStartDate() {
    return activeStartDate;
  }


  public void setActiveStartDate(OffsetDateTime activeStartDate) {
    this.activeStartDate = activeStartDate;
  }


  public SearchTuningRule auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public SearchTuningRule blockedProductCodes(List<String> blockedProductCodes) {
    
    this.blockedProductCodes = blockedProductCodes;
    return this;
  }

  public SearchTuningRule addBlockedProductCodesItem(String blockedProductCodesItem) {
    if (this.blockedProductCodes == null) {
      this.blockedProductCodes = new ArrayList<>();
    }
    this.blockedProductCodes.add(blockedProductCodesItem);
    return this;
  }

   /**
   * Get blockedProductCodes
   * @return blockedProductCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBlockedProductCodes() {
    return blockedProductCodes;
  }


  public void setBlockedProductCodes(List<String> blockedProductCodes) {
    this.blockedProductCodes = blockedProductCodes;
  }


  public SearchTuningRule boostedProductCodes(List<String> boostedProductCodes) {
    
    this.boostedProductCodes = boostedProductCodes;
    return this;
  }

  public SearchTuningRule addBoostedProductCodesItem(String boostedProductCodesItem) {
    if (this.boostedProductCodes == null) {
      this.boostedProductCodes = new ArrayList<>();
    }
    this.boostedProductCodes.add(boostedProductCodesItem);
    return this;
  }

   /**
   * Get boostedProductCodes
   * @return boostedProductCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBoostedProductCodes() {
    return boostedProductCodes;
  }


  public void setBoostedProductCodes(List<String> boostedProductCodes) {
    this.boostedProductCodes = boostedProductCodes;
  }


  public SearchTuningRule filters(List<SearchTuningRuleFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public SearchTuningRule addFiltersItem(SearchTuningRuleFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchTuningRuleFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<SearchTuningRuleFilter> filters) {
    this.filters = filters;
  }


  public SearchTuningRule isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public SearchTuningRule keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public SearchTuningRule addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public SearchTuningRule searchTuningRuleCode(String searchTuningRuleCode) {
    
    this.searchTuningRuleCode = searchTuningRuleCode;
    return this;
  }

   /**
   * Get searchTuningRuleCode
   * @return searchTuningRuleCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSearchTuningRuleCode() {
    return searchTuningRuleCode;
  }


  public void setSearchTuningRuleCode(String searchTuningRuleCode) {
    this.searchTuningRuleCode = searchTuningRuleCode;
  }


  public SearchTuningRule searchTuningRuleDescription(String searchTuningRuleDescription) {
    
    this.searchTuningRuleDescription = searchTuningRuleDescription;
    return this;
  }

   /**
   * Get searchTuningRuleDescription
   * @return searchTuningRuleDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSearchTuningRuleDescription() {
    return searchTuningRuleDescription;
  }


  public void setSearchTuningRuleDescription(String searchTuningRuleDescription) {
    this.searchTuningRuleDescription = searchTuningRuleDescription;
  }


  public SearchTuningRule searchTuningRuleName(String searchTuningRuleName) {
    
    this.searchTuningRuleName = searchTuningRuleName;
    return this;
  }

   /**
   * Get searchTuningRuleName
   * @return searchTuningRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSearchTuningRuleName() {
    return searchTuningRuleName;
  }


  public void setSearchTuningRuleName(String searchTuningRuleName) {
    this.searchTuningRuleName = searchTuningRuleName;
  }


  public SearchTuningRule siteId(Integer siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSiteId() {
    return siteId;
  }


  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTuningRule searchTuningRule = (SearchTuningRule) o;
    return Objects.equals(this.active, searchTuningRule.active) &&
        Objects.equals(this.activeEndDate, searchTuningRule.activeEndDate) &&
        Objects.equals(this.activeStartDate, searchTuningRule.activeStartDate) &&
        Objects.equals(this.auditInfo, searchTuningRule.auditInfo) &&
        Objects.equals(this.blockedProductCodes, searchTuningRule.blockedProductCodes) &&
        Objects.equals(this.boostedProductCodes, searchTuningRule.boostedProductCodes) &&
        Objects.equals(this.filters, searchTuningRule.filters) &&
        Objects.equals(this.isDefault, searchTuningRule.isDefault) &&
        Objects.equals(this.keywords, searchTuningRule.keywords) &&
        Objects.equals(this.searchTuningRuleCode, searchTuningRule.searchTuningRuleCode) &&
        Objects.equals(this.searchTuningRuleDescription, searchTuningRule.searchTuningRuleDescription) &&
        Objects.equals(this.searchTuningRuleName, searchTuningRule.searchTuningRuleName) &&
        Objects.equals(this.siteId, searchTuningRule.siteId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, activeEndDate, activeStartDate, auditInfo, blockedProductCodes, boostedProductCodes, filters, isDefault, keywords, searchTuningRuleCode, searchTuningRuleDescription, searchTuningRuleName, siteId);
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
    sb.append("class SearchTuningRule {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activeEndDate: ").append(toIndentedString(activeEndDate)).append("\n");
    sb.append("    activeStartDate: ").append(toIndentedString(activeStartDate)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    blockedProductCodes: ").append(toIndentedString(blockedProductCodes)).append("\n");
    sb.append("    boostedProductCodes: ").append(toIndentedString(boostedProductCodes)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    searchTuningRuleCode: ").append(toIndentedString(searchTuningRuleCode)).append("\n");
    sb.append("    searchTuningRuleDescription: ").append(toIndentedString(searchTuningRuleDescription)).append("\n");
    sb.append("    searchTuningRuleName: ").append(toIndentedString(searchTuningRuleName)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("activeEndDate");
    openapiFields.add("activeStartDate");
    openapiFields.add("auditInfo");
    openapiFields.add("blockedProductCodes");
    openapiFields.add("boostedProductCodes");
    openapiFields.add("filters");
    openapiFields.add("isDefault");
    openapiFields.add("keywords");
    openapiFields.add("searchTuningRuleCode");
    openapiFields.add("searchTuningRuleDescription");
    openapiFields.add("searchTuningRuleName");
    openapiFields.add("siteId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchTuningRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchTuningRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchTuningRule is not found in the empty JSON string", SearchTuningRule.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SearchTuningRule.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchTuningRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("blockedProductCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockedProductCodes` to be an array in the JSON string but got `%s`", jsonObj.get("blockedProductCodes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("boostedProductCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `boostedProductCodes` to be an array in the JSON string but got `%s`", jsonObj.get("boostedProductCodes").toString()));
      }
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
        if (jsonArrayfilters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("filters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
          }

          // validate the optional field `filters` (array)
          for (int i = 0; i < jsonArrayfilters.size(); i++) {
            SearchTuningRuleFilter.validateJsonObject(jsonArrayfilters.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      if ((jsonObj.get("searchTuningRuleCode") != null && !jsonObj.get("searchTuningRuleCode").isJsonNull()) && !jsonObj.get("searchTuningRuleCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchTuningRuleCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchTuningRuleCode").toString()));
      }
      if ((jsonObj.get("searchTuningRuleDescription") != null && !jsonObj.get("searchTuningRuleDescription").isJsonNull()) && !jsonObj.get("searchTuningRuleDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchTuningRuleDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchTuningRuleDescription").toString()));
      }
      if ((jsonObj.get("searchTuningRuleName") != null && !jsonObj.get("searchTuningRuleName").isJsonNull()) && !jsonObj.get("searchTuningRuleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchTuningRuleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchTuningRuleName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchTuningRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchTuningRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchTuningRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchTuningRule.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchTuningRule>() {
           @Override
           public void write(JsonWriter out, SearchTuningRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchTuningRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchTuningRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchTuningRule
  * @throws IOException if the JSON string is invalid with respect to SearchTuningRule
  */
  public static SearchTuningRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchTuningRule.class);
  }

 /**
  * Convert an instance of SearchTuningRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

