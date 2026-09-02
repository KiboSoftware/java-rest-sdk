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
import java.time.OffsetDateTime;
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
 * ExtensibleAttributeValidation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExtensibleAttributeValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MAX_DATE_TIME = "maxDateTime";
  @SerializedName(SERIALIZED_NAME_MAX_DATE_TIME)
  private OffsetDateTime maxDateTime;

  public static final String SERIALIZED_NAME_MAX_NUMERIC_VALUE = "maxNumericValue";
  @SerializedName(SERIALIZED_NAME_MAX_NUMERIC_VALUE)
  private Double maxNumericValue;

  public static final String SERIALIZED_NAME_MAX_STRING_LENGTH = "maxStringLength";
  @SerializedName(SERIALIZED_NAME_MAX_STRING_LENGTH)
  private Integer maxStringLength;

  public static final String SERIALIZED_NAME_MIN_DATE_TIME = "minDateTime";
  @SerializedName(SERIALIZED_NAME_MIN_DATE_TIME)
  private OffsetDateTime minDateTime;

  public static final String SERIALIZED_NAME_MIN_NUMERIC_VALUE = "minNumericValue";
  @SerializedName(SERIALIZED_NAME_MIN_NUMERIC_VALUE)
  private Double minNumericValue;

  public static final String SERIALIZED_NAME_MIN_STRING_LENGTH = "minStringLength";
  @SerializedName(SERIALIZED_NAME_MIN_STRING_LENGTH)
  private Integer minStringLength;

  public static final String SERIALIZED_NAME_REGULAR_EXPRESSION = "regularExpression";
  @SerializedName(SERIALIZED_NAME_REGULAR_EXPRESSION)
  private String regularExpression;

  public ExtensibleAttributeValidation() {
  }

  public ExtensibleAttributeValidation maxDateTime(OffsetDateTime maxDateTime) {
    
    this.maxDateTime = maxDateTime;
    return this;
  }

   /**
   * Get maxDateTime
   * @return maxDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getMaxDateTime() {
    return maxDateTime;
  }


  public void setMaxDateTime(OffsetDateTime maxDateTime) {
    this.maxDateTime = maxDateTime;
  }


  public ExtensibleAttributeValidation maxNumericValue(Double maxNumericValue) {
    
    this.maxNumericValue = maxNumericValue;
    return this;
  }

   /**
   * Get maxNumericValue
   * @return maxNumericValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMaxNumericValue() {
    return maxNumericValue;
  }


  public void setMaxNumericValue(Double maxNumericValue) {
    this.maxNumericValue = maxNumericValue;
  }


  public ExtensibleAttributeValidation maxStringLength(Integer maxStringLength) {
    
    this.maxStringLength = maxStringLength;
    return this;
  }

   /**
   * Get maxStringLength
   * @return maxStringLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxStringLength() {
    return maxStringLength;
  }


  public void setMaxStringLength(Integer maxStringLength) {
    this.maxStringLength = maxStringLength;
  }


  public ExtensibleAttributeValidation minDateTime(OffsetDateTime minDateTime) {
    
    this.minDateTime = minDateTime;
    return this;
  }

   /**
   * Get minDateTime
   * @return minDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getMinDateTime() {
    return minDateTime;
  }


  public void setMinDateTime(OffsetDateTime minDateTime) {
    this.minDateTime = minDateTime;
  }


  public ExtensibleAttributeValidation minNumericValue(Double minNumericValue) {
    
    this.minNumericValue = minNumericValue;
    return this;
  }

   /**
   * Get minNumericValue
   * @return minNumericValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMinNumericValue() {
    return minNumericValue;
  }


  public void setMinNumericValue(Double minNumericValue) {
    this.minNumericValue = minNumericValue;
  }


  public ExtensibleAttributeValidation minStringLength(Integer minStringLength) {
    
    this.minStringLength = minStringLength;
    return this;
  }

   /**
   * Get minStringLength
   * @return minStringLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinStringLength() {
    return minStringLength;
  }


  public void setMinStringLength(Integer minStringLength) {
    this.minStringLength = minStringLength;
  }


  public ExtensibleAttributeValidation regularExpression(String regularExpression) {
    
    this.regularExpression = regularExpression;
    return this;
  }

   /**
   * Get regularExpression
   * @return regularExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegularExpression() {
    return regularExpression;
  }


  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensibleAttributeValidation extensibleAttributeValidation = (ExtensibleAttributeValidation) o;
    return Objects.equals(this.maxDateTime, extensibleAttributeValidation.maxDateTime) &&
        Objects.equals(this.maxNumericValue, extensibleAttributeValidation.maxNumericValue) &&
        Objects.equals(this.maxStringLength, extensibleAttributeValidation.maxStringLength) &&
        Objects.equals(this.minDateTime, extensibleAttributeValidation.minDateTime) &&
        Objects.equals(this.minNumericValue, extensibleAttributeValidation.minNumericValue) &&
        Objects.equals(this.minStringLength, extensibleAttributeValidation.minStringLength) &&
        Objects.equals(this.regularExpression, extensibleAttributeValidation.regularExpression);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxDateTime, maxNumericValue, maxStringLength, minDateTime, minNumericValue, minStringLength, regularExpression);
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
    sb.append("class ExtensibleAttributeValidation {\n");
    sb.append("    maxDateTime: ").append(toIndentedString(maxDateTime)).append("\n");
    sb.append("    maxNumericValue: ").append(toIndentedString(maxNumericValue)).append("\n");
    sb.append("    maxStringLength: ").append(toIndentedString(maxStringLength)).append("\n");
    sb.append("    minDateTime: ").append(toIndentedString(minDateTime)).append("\n");
    sb.append("    minNumericValue: ").append(toIndentedString(minNumericValue)).append("\n");
    sb.append("    minStringLength: ").append(toIndentedString(minStringLength)).append("\n");
    sb.append("    regularExpression: ").append(toIndentedString(regularExpression)).append("\n");
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
    openapiFields.add("maxDateTime");
    openapiFields.add("maxNumericValue");
    openapiFields.add("maxStringLength");
    openapiFields.add("minDateTime");
    openapiFields.add("minNumericValue");
    openapiFields.add("minStringLength");
    openapiFields.add("regularExpression");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtensibleAttributeValidation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExtensibleAttributeValidation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtensibleAttributeValidation is not found in the empty JSON string", ExtensibleAttributeValidation.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ExtensibleAttributeValidation.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtensibleAttributeValidation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("regularExpression") != null && !jsonObj.get("regularExpression").isJsonNull()) && !jsonObj.get("regularExpression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regularExpression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regularExpression").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtensibleAttributeValidation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtensibleAttributeValidation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtensibleAttributeValidation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtensibleAttributeValidation.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtensibleAttributeValidation>() {
           @Override
           public void write(JsonWriter out, ExtensibleAttributeValidation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtensibleAttributeValidation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExtensibleAttributeValidation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtensibleAttributeValidation
  * @throws IOException if the JSON string is invalid with respect to ExtensibleAttributeValidation
  */
  public static ExtensibleAttributeValidation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtensibleAttributeValidation.class);
  }

 /**
  * Convert an instance of ExtensibleAttributeValidation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

