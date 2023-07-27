/*
 * Kibo AppDev Service
 * OpenAPI Spec for Kibo AppDev Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.appdevelopment.models;

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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PackageRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_KEY = "appKey";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_PARENT_THEME_APP_KEY = "parentThemeAppKey";
  @SerializedName(SERIALIZED_NAME_PARENT_THEME_APP_KEY)
  private String parentThemeAppKey;

  public PackageRequest() {
  }

  public PackageRequest appKey(String appKey) {
    
    this.appKey = appKey;
    return this;
  }

   /**
   * 
   * @return appKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppKey() {
    return appKey;
  }


  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  public PackageRequest parentThemeAppKey(String parentThemeAppKey) {
    
    this.parentThemeAppKey = parentThemeAppKey;
    return this;
  }

   /**
   * 
   * @return parentThemeAppKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParentThemeAppKey() {
    return parentThemeAppKey;
  }


  public void setParentThemeAppKey(String parentThemeAppKey) {
    this.parentThemeAppKey = parentThemeAppKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageRequest packageRequest = (PackageRequest) o;
    return Objects.equals(this.appKey, packageRequest.appKey) &&
        Objects.equals(this.parentThemeAppKey, packageRequest.parentThemeAppKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, parentThemeAppKey);
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
    sb.append("class PackageRequest {\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    parentThemeAppKey: ").append(toIndentedString(parentThemeAppKey)).append("\n");
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
    openapiFields.add("appKey");
    openapiFields.add("parentThemeAppKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PackageRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PackageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PackageRequest is not found in the empty JSON string", PackageRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PackageRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PackageRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("appKey") != null && !jsonObj.get("appKey").isJsonNull()) && !jsonObj.get("appKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appKey").toString()));
      }
      if ((jsonObj.get("parentThemeAppKey") != null && !jsonObj.get("parentThemeAppKey").isJsonNull()) && !jsonObj.get("parentThemeAppKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentThemeAppKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentThemeAppKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PackageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PackageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PackageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PackageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PackageRequest>() {
           @Override
           public void write(JsonWriter out, PackageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PackageRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PackageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PackageRequest
  * @throws IOException if the JSON string is invalid with respect to PackageRequest
  */
  public static PackageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PackageRequest.class);
  }

 /**
  * Convert an instance of PackageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
