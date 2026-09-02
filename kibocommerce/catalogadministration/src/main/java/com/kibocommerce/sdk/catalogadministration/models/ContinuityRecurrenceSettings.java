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
 * ContinuityRecurrenceSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContinuityRecurrenceSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Integer interval;

  public static final String SERIALIZED_NAME_START_ORDINAL = "startOrdinal";
  @SerializedName(SERIALIZED_NAME_START_ORDINAL)
  private Integer startOrdinal;

  public static final String SERIALIZED_NAME_STOP_ORDINAL = "stopOrdinal";
  @SerializedName(SERIALIZED_NAME_STOP_ORDINAL)
  private Integer stopOrdinal;

  public ContinuityRecurrenceSettings() {
  }

  public ContinuityRecurrenceSettings interval(Integer interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Interval until next discount applies
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interval until next discount applies")

  public Integer getInterval() {
    return interval;
  }


  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  public ContinuityRecurrenceSettings startOrdinal(Integer startOrdinal) {
    
    this.startOrdinal = startOrdinal;
    return this;
  }

   /**
   * Continuity ordinal to start discounting
   * @return startOrdinal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Continuity ordinal to start discounting")

  public Integer getStartOrdinal() {
    return startOrdinal;
  }


  public void setStartOrdinal(Integer startOrdinal) {
    this.startOrdinal = startOrdinal;
  }


  public ContinuityRecurrenceSettings stopOrdinal(Integer stopOrdinal) {
    
    this.stopOrdinal = stopOrdinal;
    return this;
  }

   /**
   * Continuity ordinal to stop discounting
   * @return stopOrdinal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Continuity ordinal to stop discounting")

  public Integer getStopOrdinal() {
    return stopOrdinal;
  }


  public void setStopOrdinal(Integer stopOrdinal) {
    this.stopOrdinal = stopOrdinal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContinuityRecurrenceSettings continuityRecurrenceSettings = (ContinuityRecurrenceSettings) o;
    return Objects.equals(this.interval, continuityRecurrenceSettings.interval) &&
        Objects.equals(this.startOrdinal, continuityRecurrenceSettings.startOrdinal) &&
        Objects.equals(this.stopOrdinal, continuityRecurrenceSettings.stopOrdinal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, startOrdinal, stopOrdinal);
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
    sb.append("class ContinuityRecurrenceSettings {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    startOrdinal: ").append(toIndentedString(startOrdinal)).append("\n");
    sb.append("    stopOrdinal: ").append(toIndentedString(stopOrdinal)).append("\n");
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
    openapiFields.add("interval");
    openapiFields.add("startOrdinal");
    openapiFields.add("stopOrdinal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContinuityRecurrenceSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContinuityRecurrenceSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContinuityRecurrenceSettings is not found in the empty JSON string", ContinuityRecurrenceSettings.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ContinuityRecurrenceSettings.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContinuityRecurrenceSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContinuityRecurrenceSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContinuityRecurrenceSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContinuityRecurrenceSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContinuityRecurrenceSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ContinuityRecurrenceSettings>() {
           @Override
           public void write(JsonWriter out, ContinuityRecurrenceSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContinuityRecurrenceSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContinuityRecurrenceSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContinuityRecurrenceSettings
  * @throws IOException if the JSON string is invalid with respect to ContinuityRecurrenceSettings
  */
  public static ContinuityRecurrenceSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContinuityRecurrenceSettings.class);
  }

 /**
  * Convert an instance of ContinuityRecurrenceSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

