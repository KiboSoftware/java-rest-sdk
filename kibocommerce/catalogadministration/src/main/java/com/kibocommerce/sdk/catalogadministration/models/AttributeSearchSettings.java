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
 * Attribute Search Settings. A container for all of the search and indexing settings of an Attribute
 */
@ApiModel(description = "Attribute Search Settings. A container for all of the search and indexing settings of an Attribute")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttributeSearchSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALLOW_FILTERING_AND_SORTING_IN_STOREFRONT = "allowFilteringAndSortingInStorefront";
  @SerializedName(SERIALIZED_NAME_ALLOW_FILTERING_AND_SORTING_IN_STOREFRONT)
  private Boolean allowFilteringAndSortingInStorefront;

  public static final String SERIALIZED_NAME_CUSTOM_WEIGHT_IN_STOREFRONT_SEARCH = "customWeightInStorefrontSearch";
  @SerializedName(SERIALIZED_NAME_CUSTOM_WEIGHT_IN_STOREFRONT_SEARCH)
  private Boolean customWeightInStorefrontSearch;

  public static final String SERIALIZED_NAME_INDEX_VALUE_WITH_CASE = "indexValueWithCase";
  @SerializedName(SERIALIZED_NAME_INDEX_VALUE_WITH_CASE)
  private Boolean indexValueWithCase;

  public static final String SERIALIZED_NAME_SEARCH_DISPLAY_VALUE = "searchDisplayValue";
  @SerializedName(SERIALIZED_NAME_SEARCH_DISPLAY_VALUE)
  private Boolean searchDisplayValue;

  public static final String SERIALIZED_NAME_SEARCHABLE_IN_ADMIN = "searchableInAdmin";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE_IN_ADMIN)
  private Boolean searchableInAdmin;

  public static final String SERIALIZED_NAME_SEARCHABLE_IN_STOREFRONT = "searchableInStorefront";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE_IN_STOREFRONT)
  private Boolean searchableInStorefront;

  public AttributeSearchSettings() {
  }

  public AttributeSearchSettings allowFilteringAndSortingInStorefront(Boolean allowFilteringAndSortingInStorefront) {
    
    this.allowFilteringAndSortingInStorefront = allowFilteringAndSortingInStorefront;
    return this;
  }

   /**
   * Indicates whether the attribute should be able to be used in filters, facets, and sorting on the public storefront.
   * @return allowFilteringAndSortingInStorefront
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the attribute should be able to be used in filters, facets, and sorting on the public storefront.")

  public Boolean getAllowFilteringAndSortingInStorefront() {
    return allowFilteringAndSortingInStorefront;
  }


  public void setAllowFilteringAndSortingInStorefront(Boolean allowFilteringAndSortingInStorefront) {
    this.allowFilteringAndSortingInStorefront = allowFilteringAndSortingInStorefront;
  }


  public AttributeSearchSettings customWeightInStorefrontSearch(Boolean customWeightInStorefrontSearch) {
    
    this.customWeightInStorefrontSearch = customWeightInStorefrontSearch;
    return this;
  }

   /**
   * Indicates whether the attribute is indevidually stored as a tokenized field in search for custom term search weight
   * @return customWeightInStorefrontSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the attribute is indevidually stored as a tokenized field in search for custom term search weight")

  public Boolean getCustomWeightInStorefrontSearch() {
    return customWeightInStorefrontSearch;
  }


  public void setCustomWeightInStorefrontSearch(Boolean customWeightInStorefrontSearch) {
    this.customWeightInStorefrontSearch = customWeightInStorefrontSearch;
  }


  public AttributeSearchSettings indexValueWithCase(Boolean indexValueWithCase) {
    
    this.indexValueWithCase = indexValueWithCase;
    return this;
  }

   /**
   * Indicates whether the attribute value is case sensative for filtering and faceting. This applies to Text Admin entered attributes.  A null value means it is not case sensative
   * @return indexValueWithCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the attribute value is case sensative for filtering and faceting. This applies to Text Admin entered attributes.  A null value means it is not case sensative")

  public Boolean getIndexValueWithCase() {
    return indexValueWithCase;
  }


  public void setIndexValueWithCase(Boolean indexValueWithCase) {
    this.indexValueWithCase = indexValueWithCase;
  }


  public AttributeSearchSettings searchDisplayValue(Boolean searchDisplayValue) {
    
    this.searchDisplayValue = searchDisplayValue;
    return this;
  }

   /**
   * If true, the system will index the display value of string attributes instead of the canonical value for searching.  The canonical value will always be used for filtering. Does not apply for for non-string attributes.
   * @return searchDisplayValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the system will index the display value of string attributes instead of the canonical value for searching.  The canonical value will always be used for filtering. Does not apply for for non-string attributes.")

  public Boolean getSearchDisplayValue() {
    return searchDisplayValue;
  }


  public void setSearchDisplayValue(Boolean searchDisplayValue) {
    this.searchDisplayValue = searchDisplayValue;
  }


  public AttributeSearchSettings searchableInAdmin(Boolean searchableInAdmin) {
    
    this.searchableInAdmin = searchableInAdmin;
    return this;
  }

   /**
   * Indicates whether the attribute value should be searchable in the merchant catalog admin.
   * @return searchableInAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the attribute value should be searchable in the merchant catalog admin.")

  public Boolean getSearchableInAdmin() {
    return searchableInAdmin;
  }


  public void setSearchableInAdmin(Boolean searchableInAdmin) {
    this.searchableInAdmin = searchableInAdmin;
  }


  public AttributeSearchSettings searchableInStorefront(Boolean searchableInStorefront) {
    
    this.searchableInStorefront = searchableInStorefront;
    return this;
  }

   /**
   * Indicates whether the attribute value should be searchable on the public storefront.
   * @return searchableInStorefront
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the attribute value should be searchable on the public storefront.")

  public Boolean getSearchableInStorefront() {
    return searchableInStorefront;
  }


  public void setSearchableInStorefront(Boolean searchableInStorefront) {
    this.searchableInStorefront = searchableInStorefront;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeSearchSettings attributeSearchSettings = (AttributeSearchSettings) o;
    return Objects.equals(this.allowFilteringAndSortingInStorefront, attributeSearchSettings.allowFilteringAndSortingInStorefront) &&
        Objects.equals(this.customWeightInStorefrontSearch, attributeSearchSettings.customWeightInStorefrontSearch) &&
        Objects.equals(this.indexValueWithCase, attributeSearchSettings.indexValueWithCase) &&
        Objects.equals(this.searchDisplayValue, attributeSearchSettings.searchDisplayValue) &&
        Objects.equals(this.searchableInAdmin, attributeSearchSettings.searchableInAdmin) &&
        Objects.equals(this.searchableInStorefront, attributeSearchSettings.searchableInStorefront);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowFilteringAndSortingInStorefront, customWeightInStorefrontSearch, indexValueWithCase, searchDisplayValue, searchableInAdmin, searchableInStorefront);
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
    sb.append("class AttributeSearchSettings {\n");
    sb.append("    allowFilteringAndSortingInStorefront: ").append(toIndentedString(allowFilteringAndSortingInStorefront)).append("\n");
    sb.append("    customWeightInStorefrontSearch: ").append(toIndentedString(customWeightInStorefrontSearch)).append("\n");
    sb.append("    indexValueWithCase: ").append(toIndentedString(indexValueWithCase)).append("\n");
    sb.append("    searchDisplayValue: ").append(toIndentedString(searchDisplayValue)).append("\n");
    sb.append("    searchableInAdmin: ").append(toIndentedString(searchableInAdmin)).append("\n");
    sb.append("    searchableInStorefront: ").append(toIndentedString(searchableInStorefront)).append("\n");
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
    openapiFields.add("allowFilteringAndSortingInStorefront");
    openapiFields.add("customWeightInStorefrontSearch");
    openapiFields.add("indexValueWithCase");
    openapiFields.add("searchDisplayValue");
    openapiFields.add("searchableInAdmin");
    openapiFields.add("searchableInStorefront");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttributeSearchSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AttributeSearchSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttributeSearchSettings is not found in the empty JSON string", AttributeSearchSettings.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AttributeSearchSettings.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttributeSearchSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttributeSearchSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttributeSearchSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttributeSearchSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttributeSearchSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<AttributeSearchSettings>() {
           @Override
           public void write(JsonWriter out, AttributeSearchSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttributeSearchSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttributeSearchSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttributeSearchSettings
  * @throws IOException if the JSON string is invalid with respect to AttributeSearchSettings
  */
  public static AttributeSearchSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttributeSearchSettings.class);
  }

 /**
  * Convert an instance of AttributeSearchSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

