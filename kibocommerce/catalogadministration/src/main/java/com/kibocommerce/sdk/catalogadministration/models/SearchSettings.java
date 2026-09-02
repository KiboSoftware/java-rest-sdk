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
import com.kibocommerce.sdk.catalogadministration.models.CollapseSettings;
import com.kibocommerce.sdk.catalogadministration.models.ListingSettings;
import com.kibocommerce.sdk.catalogadministration.models.ProductSuggestSettings;
import com.kibocommerce.sdk.catalogadministration.models.SiteSearchSettings;
import com.kibocommerce.sdk.catalogadministration.models.SuggestSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * Settings to control product search and indexing behavior
 */
@ApiModel(description = "Settings to control product search and indexing behavior")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CATEGORY_SUGGEST_SETTINGS = "categorySuggestSettings";
  @SerializedName(SERIALIZED_NAME_CATEGORY_SUGGEST_SETTINGS)
  private SuggestSettings categorySuggestSettings;

  public static final String SERIALIZED_NAME_COLLAPSE_SETTINGS = "collapseSettings";
  @SerializedName(SERIALIZED_NAME_COLLAPSE_SETTINGS)
  private CollapseSettings collapseSettings;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_LISTING_SETTINGS = "listingSettings";
  @SerializedName(SERIALIZED_NAME_LISTING_SETTINGS)
  private ListingSettings listingSettings;

  public static final String SERIALIZED_NAME_PRODUCT_SUGGEST_SETTINGS = "productSuggestSettings";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SUGGEST_SETTINGS)
  private ProductSuggestSettings productSuggestSettings;

  public static final String SERIALIZED_NAME_SETTINGS_NAME = "settingsName";
  @SerializedName(SERIALIZED_NAME_SETTINGS_NAME)
  private String settingsName;

  public static final String SERIALIZED_NAME_SITE_SEARCH_SETTINGS = "siteSearchSettings";
  @SerializedName(SERIALIZED_NAME_SITE_SEARCH_SETTINGS)
  private SiteSearchSettings siteSearchSettings;

  public SearchSettings() {
  }

  public SearchSettings auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public SearchSettings categorySuggestSettings(SuggestSettings categorySuggestSettings) {
    
    this.categorySuggestSettings = categorySuggestSettings;
    return this;
  }

   /**
   * Get categorySuggestSettings
   * @return categorySuggestSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SuggestSettings getCategorySuggestSettings() {
    return categorySuggestSettings;
  }


  public void setCategorySuggestSettings(SuggestSettings categorySuggestSettings) {
    this.categorySuggestSettings = categorySuggestSettings;
  }


  public SearchSettings collapseSettings(CollapseSettings collapseSettings) {
    
    this.collapseSettings = collapseSettings;
    return this;
  }

   /**
   * Get collapseSettings
   * @return collapseSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CollapseSettings getCollapseSettings() {
    return collapseSettings;
  }


  public void setCollapseSettings(CollapseSettings collapseSettings) {
    this.collapseSettings = collapseSettings;
  }


  public SearchSettings description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SearchSettings isDefault(Boolean isDefault) {
    
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


  public SearchSettings listingSettings(ListingSettings listingSettings) {
    
    this.listingSettings = listingSettings;
    return this;
  }

   /**
   * Get listingSettings
   * @return listingSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListingSettings getListingSettings() {
    return listingSettings;
  }


  public void setListingSettings(ListingSettings listingSettings) {
    this.listingSettings = listingSettings;
  }


  public SearchSettings productSuggestSettings(ProductSuggestSettings productSuggestSettings) {
    
    this.productSuggestSettings = productSuggestSettings;
    return this;
  }

   /**
   * Get productSuggestSettings
   * @return productSuggestSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductSuggestSettings getProductSuggestSettings() {
    return productSuggestSettings;
  }


  public void setProductSuggestSettings(ProductSuggestSettings productSuggestSettings) {
    this.productSuggestSettings = productSuggestSettings;
  }


  public SearchSettings settingsName(String settingsName) {
    
    this.settingsName = settingsName;
    return this;
  }

   /**
   * Get settingsName
   * @return settingsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSettingsName() {
    return settingsName;
  }


  public void setSettingsName(String settingsName) {
    this.settingsName = settingsName;
  }


  public SearchSettings siteSearchSettings(SiteSearchSettings siteSearchSettings) {
    
    this.siteSearchSettings = siteSearchSettings;
    return this;
  }

   /**
   * Get siteSearchSettings
   * @return siteSearchSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SiteSearchSettings getSiteSearchSettings() {
    return siteSearchSettings;
  }


  public void setSiteSearchSettings(SiteSearchSettings siteSearchSettings) {
    this.siteSearchSettings = siteSearchSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSettings searchSettings = (SearchSettings) o;
    return Objects.equals(this.auditInfo, searchSettings.auditInfo) &&
        Objects.equals(this.categorySuggestSettings, searchSettings.categorySuggestSettings) &&
        Objects.equals(this.collapseSettings, searchSettings.collapseSettings) &&
        Objects.equals(this.description, searchSettings.description) &&
        Objects.equals(this.isDefault, searchSettings.isDefault) &&
        Objects.equals(this.listingSettings, searchSettings.listingSettings) &&
        Objects.equals(this.productSuggestSettings, searchSettings.productSuggestSettings) &&
        Objects.equals(this.settingsName, searchSettings.settingsName) &&
        Objects.equals(this.siteSearchSettings, searchSettings.siteSearchSettings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, categorySuggestSettings, collapseSettings, description, isDefault, listingSettings, productSuggestSettings, settingsName, siteSearchSettings);
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
    sb.append("class SearchSettings {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    categorySuggestSettings: ").append(toIndentedString(categorySuggestSettings)).append("\n");
    sb.append("    collapseSettings: ").append(toIndentedString(collapseSettings)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    listingSettings: ").append(toIndentedString(listingSettings)).append("\n");
    sb.append("    productSuggestSettings: ").append(toIndentedString(productSuggestSettings)).append("\n");
    sb.append("    settingsName: ").append(toIndentedString(settingsName)).append("\n");
    sb.append("    siteSearchSettings: ").append(toIndentedString(siteSearchSettings)).append("\n");
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
    openapiFields.add("categorySuggestSettings");
    openapiFields.add("collapseSettings");
    openapiFields.add("description");
    openapiFields.add("isDefault");
    openapiFields.add("listingSettings");
    openapiFields.add("productSuggestSettings");
    openapiFields.add("settingsName");
    openapiFields.add("siteSearchSettings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchSettings is not found in the empty JSON string", SearchSettings.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SearchSettings.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      // validate the optional field `categorySuggestSettings`
      if (jsonObj.get("categorySuggestSettings") != null && !jsonObj.get("categorySuggestSettings").isJsonNull()) {
        SuggestSettings.validateJsonObject(jsonObj.getAsJsonObject("categorySuggestSettings"));
      }
      // validate the optional field `collapseSettings`
      if (jsonObj.get("collapseSettings") != null && !jsonObj.get("collapseSettings").isJsonNull()) {
        CollapseSettings.validateJsonObject(jsonObj.getAsJsonObject("collapseSettings"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `listingSettings`
      if (jsonObj.get("listingSettings") != null && !jsonObj.get("listingSettings").isJsonNull()) {
        ListingSettings.validateJsonObject(jsonObj.getAsJsonObject("listingSettings"));
      }
      // validate the optional field `productSuggestSettings`
      if (jsonObj.get("productSuggestSettings") != null && !jsonObj.get("productSuggestSettings").isJsonNull()) {
        ProductSuggestSettings.validateJsonObject(jsonObj.getAsJsonObject("productSuggestSettings"));
      }
      if ((jsonObj.get("settingsName") != null && !jsonObj.get("settingsName").isJsonNull()) && !jsonObj.get("settingsName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settingsName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settingsName").toString()));
      }
      // validate the optional field `siteSearchSettings`
      if (jsonObj.get("siteSearchSettings") != null && !jsonObj.get("siteSearchSettings").isJsonNull()) {
        SiteSearchSettings.validateJsonObject(jsonObj.getAsJsonObject("siteSearchSettings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchSettings>() {
           @Override
           public void write(JsonWriter out, SearchSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchSettings
  * @throws IOException if the JSON string is invalid with respect to SearchSettings
  */
  public static SearchSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchSettings.class);
  }

 /**
  * Convert an instance of SearchSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

