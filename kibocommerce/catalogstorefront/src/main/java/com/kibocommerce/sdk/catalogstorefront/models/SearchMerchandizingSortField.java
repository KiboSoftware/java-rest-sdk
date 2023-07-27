/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

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
 * SearchMerchandizingSortField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchMerchandizingSortField implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public static final String SERIALIZED_NAME_PROPERTY_NAME = "propertyName";
  @SerializedName(SERIALIZED_NAME_PROPERTY_NAME)
  private String propertyName;

  public SearchMerchandizingSortField() {
  }

  public SearchMerchandizingSortField direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public SearchMerchandizingSortField propertyName(String propertyName) {
    
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Get propertyName
   * @return propertyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyName() {
    return propertyName;
  }


  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMerchandizingSortField searchMerchandizingSortField = (SearchMerchandizingSortField) o;
    return Objects.equals(this.direction, searchMerchandizingSortField.direction) &&
        Objects.equals(this.propertyName, searchMerchandizingSortField.propertyName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, propertyName);
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
    sb.append("class SearchMerchandizingSortField {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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
    openapiFields.add("direction");
    openapiFields.add("propertyName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchMerchandizingSortField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchMerchandizingSortField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchMerchandizingSortField is not found in the empty JSON string", SearchMerchandizingSortField.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SearchMerchandizingSortField.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchMerchandizingSortField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) && !jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if ((jsonObj.get("propertyName") != null && !jsonObj.get("propertyName").isJsonNull()) && !jsonObj.get("propertyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchMerchandizingSortField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchMerchandizingSortField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchMerchandizingSortField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchMerchandizingSortField.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchMerchandizingSortField>() {
           @Override
           public void write(JsonWriter out, SearchMerchandizingSortField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchMerchandizingSortField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchMerchandizingSortField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchMerchandizingSortField
  * @throws IOException if the JSON string is invalid with respect to SearchMerchandizingSortField
  */
  public static SearchMerchandizingSortField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchMerchandizingSortField.class);
  }

 /**
  * Convert an instance of SearchMerchandizingSortField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

