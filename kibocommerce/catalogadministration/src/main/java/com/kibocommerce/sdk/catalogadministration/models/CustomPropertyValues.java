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
 * CustomPropertyValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomPropertyValues implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALUE1 = "value1";
  @SerializedName(SERIALIZED_NAME_VALUE1)
  private String value1;

  public static final String SERIALIZED_NAME_VALUE10 = "value10";
  @SerializedName(SERIALIZED_NAME_VALUE10)
  private String value10;

  public static final String SERIALIZED_NAME_VALUE2 = "value2";
  @SerializedName(SERIALIZED_NAME_VALUE2)
  private String value2;

  public static final String SERIALIZED_NAME_VALUE3 = "value3";
  @SerializedName(SERIALIZED_NAME_VALUE3)
  private String value3;

  public static final String SERIALIZED_NAME_VALUE4 = "value4";
  @SerializedName(SERIALIZED_NAME_VALUE4)
  private String value4;

  public static final String SERIALIZED_NAME_VALUE5 = "value5";
  @SerializedName(SERIALIZED_NAME_VALUE5)
  private String value5;

  public static final String SERIALIZED_NAME_VALUE6 = "value6";
  @SerializedName(SERIALIZED_NAME_VALUE6)
  private String value6;

  public static final String SERIALIZED_NAME_VALUE7 = "value7";
  @SerializedName(SERIALIZED_NAME_VALUE7)
  private String value7;

  public static final String SERIALIZED_NAME_VALUE8 = "value8";
  @SerializedName(SERIALIZED_NAME_VALUE8)
  private String value8;

  public static final String SERIALIZED_NAME_VALUE9 = "value9";
  @SerializedName(SERIALIZED_NAME_VALUE9)
  private String value9;

  public CustomPropertyValues() {
  }

  public CustomPropertyValues value1(String value1) {
    
    this.value1 = value1;
    return this;
  }

   /**
   * Get value1
   * @return value1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue1() {
    return value1;
  }


  public void setValue1(String value1) {
    this.value1 = value1;
  }


  public CustomPropertyValues value10(String value10) {
    
    this.value10 = value10;
    return this;
  }

   /**
   * Get value10
   * @return value10
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue10() {
    return value10;
  }


  public void setValue10(String value10) {
    this.value10 = value10;
  }


  public CustomPropertyValues value2(String value2) {
    
    this.value2 = value2;
    return this;
  }

   /**
   * Get value2
   * @return value2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue2() {
    return value2;
  }


  public void setValue2(String value2) {
    this.value2 = value2;
  }


  public CustomPropertyValues value3(String value3) {
    
    this.value3 = value3;
    return this;
  }

   /**
   * Get value3
   * @return value3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue3() {
    return value3;
  }


  public void setValue3(String value3) {
    this.value3 = value3;
  }


  public CustomPropertyValues value4(String value4) {
    
    this.value4 = value4;
    return this;
  }

   /**
   * Get value4
   * @return value4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue4() {
    return value4;
  }


  public void setValue4(String value4) {
    this.value4 = value4;
  }


  public CustomPropertyValues value5(String value5) {
    
    this.value5 = value5;
    return this;
  }

   /**
   * Get value5
   * @return value5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue5() {
    return value5;
  }


  public void setValue5(String value5) {
    this.value5 = value5;
  }


  public CustomPropertyValues value6(String value6) {
    
    this.value6 = value6;
    return this;
  }

   /**
   * Get value6
   * @return value6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue6() {
    return value6;
  }


  public void setValue6(String value6) {
    this.value6 = value6;
  }


  public CustomPropertyValues value7(String value7) {
    
    this.value7 = value7;
    return this;
  }

   /**
   * Get value7
   * @return value7
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue7() {
    return value7;
  }


  public void setValue7(String value7) {
    this.value7 = value7;
  }


  public CustomPropertyValues value8(String value8) {
    
    this.value8 = value8;
    return this;
  }

   /**
   * Get value8
   * @return value8
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue8() {
    return value8;
  }


  public void setValue8(String value8) {
    this.value8 = value8;
  }


  public CustomPropertyValues value9(String value9) {
    
    this.value9 = value9;
    return this;
  }

   /**
   * Get value9
   * @return value9
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue9() {
    return value9;
  }


  public void setValue9(String value9) {
    this.value9 = value9;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomPropertyValues customPropertyValues = (CustomPropertyValues) o;
    return Objects.equals(this.value1, customPropertyValues.value1) &&
        Objects.equals(this.value10, customPropertyValues.value10) &&
        Objects.equals(this.value2, customPropertyValues.value2) &&
        Objects.equals(this.value3, customPropertyValues.value3) &&
        Objects.equals(this.value4, customPropertyValues.value4) &&
        Objects.equals(this.value5, customPropertyValues.value5) &&
        Objects.equals(this.value6, customPropertyValues.value6) &&
        Objects.equals(this.value7, customPropertyValues.value7) &&
        Objects.equals(this.value8, customPropertyValues.value8) &&
        Objects.equals(this.value9, customPropertyValues.value9);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(value1, value10, value2, value3, value4, value5, value6, value7, value8, value9);
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
    sb.append("class CustomPropertyValues {\n");
    sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
    sb.append("    value10: ").append(toIndentedString(value10)).append("\n");
    sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
    sb.append("    value3: ").append(toIndentedString(value3)).append("\n");
    sb.append("    value4: ").append(toIndentedString(value4)).append("\n");
    sb.append("    value5: ").append(toIndentedString(value5)).append("\n");
    sb.append("    value6: ").append(toIndentedString(value6)).append("\n");
    sb.append("    value7: ").append(toIndentedString(value7)).append("\n");
    sb.append("    value8: ").append(toIndentedString(value8)).append("\n");
    sb.append("    value9: ").append(toIndentedString(value9)).append("\n");
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
    openapiFields.add("value1");
    openapiFields.add("value10");
    openapiFields.add("value2");
    openapiFields.add("value3");
    openapiFields.add("value4");
    openapiFields.add("value5");
    openapiFields.add("value6");
    openapiFields.add("value7");
    openapiFields.add("value8");
    openapiFields.add("value9");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomPropertyValues
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomPropertyValues.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomPropertyValues is not found in the empty JSON string", CustomPropertyValues.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CustomPropertyValues.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomPropertyValues` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("value1") != null && !jsonObj.get("value1").isJsonNull()) && !jsonObj.get("value1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value1").toString()));
      }
      if ((jsonObj.get("value10") != null && !jsonObj.get("value10").isJsonNull()) && !jsonObj.get("value10").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value10` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value10").toString()));
      }
      if ((jsonObj.get("value2") != null && !jsonObj.get("value2").isJsonNull()) && !jsonObj.get("value2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value2").toString()));
      }
      if ((jsonObj.get("value3") != null && !jsonObj.get("value3").isJsonNull()) && !jsonObj.get("value3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value3").toString()));
      }
      if ((jsonObj.get("value4") != null && !jsonObj.get("value4").isJsonNull()) && !jsonObj.get("value4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value4").toString()));
      }
      if ((jsonObj.get("value5") != null && !jsonObj.get("value5").isJsonNull()) && !jsonObj.get("value5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value5").toString()));
      }
      if ((jsonObj.get("value6") != null && !jsonObj.get("value6").isJsonNull()) && !jsonObj.get("value6").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value6` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value6").toString()));
      }
      if ((jsonObj.get("value7") != null && !jsonObj.get("value7").isJsonNull()) && !jsonObj.get("value7").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value7` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value7").toString()));
      }
      if ((jsonObj.get("value8") != null && !jsonObj.get("value8").isJsonNull()) && !jsonObj.get("value8").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value8` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value8").toString()));
      }
      if ((jsonObj.get("value9") != null && !jsonObj.get("value9").isJsonNull()) && !jsonObj.get("value9").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value9` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value9").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomPropertyValues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomPropertyValues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomPropertyValues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomPropertyValues.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomPropertyValues>() {
           @Override
           public void write(JsonWriter out, CustomPropertyValues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomPropertyValues read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomPropertyValues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomPropertyValues
  * @throws IOException if the JSON string is invalid with respect to CustomPropertyValues
  */
  public static CustomPropertyValues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomPropertyValues.class);
  }

 /**
  * Convert an instance of CustomPropertyValues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

