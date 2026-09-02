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
import com.kibocommerce.sdk.catalogadministration.models.FieldWeight;
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
 * SuggestSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SuggestSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CROSS_FIELD_ADDITIVE_SCORE_FACTOR = "crossFieldAdditiveScoreFactor";
  @SerializedName(SERIALIZED_NAME_CROSS_FIELD_ADDITIVE_SCORE_FACTOR)
  private Double crossFieldAdditiveScoreFactor;

  public static final String SERIALIZED_NAME_FIELD_WEIGHTS = "fieldWeights";
  @SerializedName(SERIALIZED_NAME_FIELD_WEIGHTS)
  private List<FieldWeight> fieldWeights = null;

  public static final String SERIALIZED_NAME_PERSONALIZATION_EXPERIENCE = "personalizationExperience";
  @SerializedName(SERIALIZED_NAME_PERSONALIZATION_EXPERIENCE)
  private String personalizationExperience;

  public static final String SERIALIZED_NAME_PERSONALIZATION_FACTOR = "personalizationFactor";
  @SerializedName(SERIALIZED_NAME_PERSONALIZATION_FACTOR)
  private Double personalizationFactor;

  public static final String SERIALIZED_NAME_RETURN_FIELDS = "returnFields";
  @SerializedName(SERIALIZED_NAME_RETURN_FIELDS)
  private List<String> returnFields = null;

  public SuggestSettings() {
  }

  public SuggestSettings crossFieldAdditiveScoreFactor(Double crossFieldAdditiveScoreFactor) {
    
    this.crossFieldAdditiveScoreFactor = crossFieldAdditiveScoreFactor;
    return this;
  }

   /**
   * Get crossFieldAdditiveScoreFactor
   * @return crossFieldAdditiveScoreFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getCrossFieldAdditiveScoreFactor() {
    return crossFieldAdditiveScoreFactor;
  }


  public void setCrossFieldAdditiveScoreFactor(Double crossFieldAdditiveScoreFactor) {
    this.crossFieldAdditiveScoreFactor = crossFieldAdditiveScoreFactor;
  }


  public SuggestSettings fieldWeights(List<FieldWeight> fieldWeights) {
    
    this.fieldWeights = fieldWeights;
    return this;
  }

  public SuggestSettings addFieldWeightsItem(FieldWeight fieldWeightsItem) {
    if (this.fieldWeights == null) {
      this.fieldWeights = new ArrayList<>();
    }
    this.fieldWeights.add(fieldWeightsItem);
    return this;
  }

   /**
   * Get fieldWeights
   * @return fieldWeights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FieldWeight> getFieldWeights() {
    return fieldWeights;
  }


  public void setFieldWeights(List<FieldWeight> fieldWeights) {
    this.fieldWeights = fieldWeights;
  }


  public SuggestSettings personalizationExperience(String personalizationExperience) {
    
    this.personalizationExperience = personalizationExperience;
    return this;
  }

   /**
   * Get personalizationExperience
   * @return personalizationExperience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPersonalizationExperience() {
    return personalizationExperience;
  }


  public void setPersonalizationExperience(String personalizationExperience) {
    this.personalizationExperience = personalizationExperience;
  }


  public SuggestSettings personalizationFactor(Double personalizationFactor) {
    
    this.personalizationFactor = personalizationFactor;
    return this;
  }

   /**
   * Get personalizationFactor
   * @return personalizationFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPersonalizationFactor() {
    return personalizationFactor;
  }


  public void setPersonalizationFactor(Double personalizationFactor) {
    this.personalizationFactor = personalizationFactor;
  }


  public SuggestSettings returnFields(List<String> returnFields) {
    
    this.returnFields = returnFields;
    return this;
  }

  public SuggestSettings addReturnFieldsItem(String returnFieldsItem) {
    if (this.returnFields == null) {
      this.returnFields = new ArrayList<>();
    }
    this.returnFields.add(returnFieldsItem);
    return this;
  }

   /**
   * Get returnFields
   * @return returnFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getReturnFields() {
    return returnFields;
  }


  public void setReturnFields(List<String> returnFields) {
    this.returnFields = returnFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestSettings suggestSettings = (SuggestSettings) o;
    return Objects.equals(this.crossFieldAdditiveScoreFactor, suggestSettings.crossFieldAdditiveScoreFactor) &&
        Objects.equals(this.fieldWeights, suggestSettings.fieldWeights) &&
        Objects.equals(this.personalizationExperience, suggestSettings.personalizationExperience) &&
        Objects.equals(this.personalizationFactor, suggestSettings.personalizationFactor) &&
        Objects.equals(this.returnFields, suggestSettings.returnFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossFieldAdditiveScoreFactor, fieldWeights, personalizationExperience, personalizationFactor, returnFields);
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
    sb.append("class SuggestSettings {\n");
    sb.append("    crossFieldAdditiveScoreFactor: ").append(toIndentedString(crossFieldAdditiveScoreFactor)).append("\n");
    sb.append("    fieldWeights: ").append(toIndentedString(fieldWeights)).append("\n");
    sb.append("    personalizationExperience: ").append(toIndentedString(personalizationExperience)).append("\n");
    sb.append("    personalizationFactor: ").append(toIndentedString(personalizationFactor)).append("\n");
    sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
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
    openapiFields.add("crossFieldAdditiveScoreFactor");
    openapiFields.add("fieldWeights");
    openapiFields.add("personalizationExperience");
    openapiFields.add("personalizationFactor");
    openapiFields.add("returnFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SuggestSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestSettings is not found in the empty JSON string", SuggestSettings.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SuggestSettings.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("fieldWeights") != null && !jsonObj.get("fieldWeights").isJsonNull()) {
        JsonArray jsonArrayfieldWeights = jsonObj.getAsJsonArray("fieldWeights");
        if (jsonArrayfieldWeights != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fieldWeights").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fieldWeights` to be an array in the JSON string but got `%s`", jsonObj.get("fieldWeights").toString()));
          }

          // validate the optional field `fieldWeights` (array)
          for (int i = 0; i < jsonArrayfieldWeights.size(); i++) {
            FieldWeight.validateJsonObject(jsonArrayfieldWeights.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("personalizationExperience") != null && !jsonObj.get("personalizationExperience").isJsonNull()) && !jsonObj.get("personalizationExperience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personalizationExperience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalizationExperience").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("returnFields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnFields` to be an array in the JSON string but got `%s`", jsonObj.get("returnFields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestSettings>() {
           @Override
           public void write(JsonWriter out, SuggestSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestSettings
  * @throws IOException if the JSON string is invalid with respect to SuggestSettings
  */
  public static SuggestSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestSettings.class);
  }

 /**
  * Convert an instance of SuggestSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

