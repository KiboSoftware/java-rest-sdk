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
import com.kibocommerce.sdk.catalogstorefront.models.CommerceRuntimeMeasurement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * Physical dimensions of the package required to ship the product and its weight.
 */
@ApiModel(description = "Physical dimensions of the package required to ship the product and its weight.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogRuntimesPackageMeasurements implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PACKAGE_HEIGHT = "packageHeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_HEIGHT)
  private CommerceRuntimeMeasurement packageHeight;

  public static final String SERIALIZED_NAME_PACKAGE_WIDTH = "packageWidth";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WIDTH)
  private CommerceRuntimeMeasurement packageWidth;

  public static final String SERIALIZED_NAME_PACKAGE_LENGTH = "packageLength";
  @SerializedName(SERIALIZED_NAME_PACKAGE_LENGTH)
  private CommerceRuntimeMeasurement packageLength;

  public static final String SERIALIZED_NAME_PACKAGE_WEIGHT = "packageWeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WEIGHT)
  private CommerceRuntimeMeasurement packageWeight;

  public CatalogRuntimesPackageMeasurements() {
  }

  public CatalogRuntimesPackageMeasurements packageHeight(CommerceRuntimeMeasurement packageHeight) {
    
    this.packageHeight = packageHeight;
    return this;
  }

   /**
   * Get packageHeight
   * @return packageHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageHeight() {
    return packageHeight;
  }


  public void setPackageHeight(CommerceRuntimeMeasurement packageHeight) {
    this.packageHeight = packageHeight;
  }


  public CatalogRuntimesPackageMeasurements packageWidth(CommerceRuntimeMeasurement packageWidth) {
    
    this.packageWidth = packageWidth;
    return this;
  }

   /**
   * Get packageWidth
   * @return packageWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageWidth() {
    return packageWidth;
  }


  public void setPackageWidth(CommerceRuntimeMeasurement packageWidth) {
    this.packageWidth = packageWidth;
  }


  public CatalogRuntimesPackageMeasurements packageLength(CommerceRuntimeMeasurement packageLength) {
    
    this.packageLength = packageLength;
    return this;
  }

   /**
   * Get packageLength
   * @return packageLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageLength() {
    return packageLength;
  }


  public void setPackageLength(CommerceRuntimeMeasurement packageLength) {
    this.packageLength = packageLength;
  }


  public CatalogRuntimesPackageMeasurements packageWeight(CommerceRuntimeMeasurement packageWeight) {
    
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * Get packageWeight
   * @return packageWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageWeight() {
    return packageWeight;
  }


  public void setPackageWeight(CommerceRuntimeMeasurement packageWeight) {
    this.packageWeight = packageWeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogRuntimesPackageMeasurements catalogRuntimesPackageMeasurements = (CatalogRuntimesPackageMeasurements) o;
    return Objects.equals(this.packageHeight, catalogRuntimesPackageMeasurements.packageHeight) &&
        Objects.equals(this.packageWidth, catalogRuntimesPackageMeasurements.packageWidth) &&
        Objects.equals(this.packageLength, catalogRuntimesPackageMeasurements.packageLength) &&
        Objects.equals(this.packageWeight, catalogRuntimesPackageMeasurements.packageWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageHeight, packageWidth, packageLength, packageWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogRuntimesPackageMeasurements {\n");
    sb.append("    packageHeight: ").append(toIndentedString(packageHeight)).append("\n");
    sb.append("    packageWidth: ").append(toIndentedString(packageWidth)).append("\n");
    sb.append("    packageLength: ").append(toIndentedString(packageLength)).append("\n");
    sb.append("    packageWeight: ").append(toIndentedString(packageWeight)).append("\n");
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
    openapiFields.add("packageHeight");
    openapiFields.add("packageWidth");
    openapiFields.add("packageLength");
    openapiFields.add("packageWeight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogRuntimesPackageMeasurements
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogRuntimesPackageMeasurements.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogRuntimesPackageMeasurements is not found in the empty JSON string", CatalogRuntimesPackageMeasurements.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogRuntimesPackageMeasurements.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogRuntimesPackageMeasurements` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `packageHeight`
      if (jsonObj.get("packageHeight") != null && !jsonObj.get("packageHeight").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageHeight"));
      }
      // validate the optional field `packageWidth`
      if (jsonObj.get("packageWidth") != null && !jsonObj.get("packageWidth").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageWidth"));
      }
      // validate the optional field `packageLength`
      if (jsonObj.get("packageLength") != null && !jsonObj.get("packageLength").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageLength"));
      }
      // validate the optional field `packageWeight`
      if (jsonObj.get("packageWeight") != null && !jsonObj.get("packageWeight").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageWeight"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogRuntimesPackageMeasurements.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogRuntimesPackageMeasurements' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogRuntimesPackageMeasurements> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogRuntimesPackageMeasurements.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogRuntimesPackageMeasurements>() {
           @Override
           public void write(JsonWriter out, CatalogRuntimesPackageMeasurements value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogRuntimesPackageMeasurements read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogRuntimesPackageMeasurements given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogRuntimesPackageMeasurements
  * @throws IOException if the JSON string is invalid with respect to CatalogRuntimesPackageMeasurements
  */
  public static CatalogRuntimesPackageMeasurements fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogRuntimesPackageMeasurements.class);
  }

 /**
  * Convert an instance of CatalogRuntimesPackageMeasurements to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
