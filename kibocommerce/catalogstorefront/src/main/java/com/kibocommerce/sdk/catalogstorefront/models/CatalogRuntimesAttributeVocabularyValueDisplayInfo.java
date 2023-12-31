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
 * Product Attribute properties common between a Product Propery, Option, and Extra
 */
@ApiModel(description = "Product Attribute properties common between a Product Propery, Option, and Extra")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogRuntimesAttributeVocabularyValueDisplayInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CMS_ID = "cmsId";
  @SerializedName(SERIALIZED_NAME_CMS_ID)
  private String cmsId;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_COLOR_VALUE = "colorValue";
  @SerializedName(SERIALIZED_NAME_COLOR_VALUE)
  private String colorValue;

  public CatalogRuntimesAttributeVocabularyValueDisplayInfo() {
  }

  public CatalogRuntimesAttributeVocabularyValueDisplayInfo cmsId(String cmsId) {
    
    this.cmsId = cmsId;
    return this;
  }

   /**
   * Id of the image in the CMS.
   * @return cmsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the image in the CMS.")

  public String getCmsId() {
    return cmsId;
  }


  public void setCmsId(String cmsId) {
    this.cmsId = cmsId;
  }


  public CatalogRuntimesAttributeVocabularyValueDisplayInfo imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * URL of the image.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the image.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public CatalogRuntimesAttributeVocabularyValueDisplayInfo colorValue(String colorValue) {
    
    this.colorValue = colorValue;
    return this;
  }

   /**
   * Hex Color value to display in a color picker
   * @return colorValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hex Color value to display in a color picker")

  public String getColorValue() {
    return colorValue;
  }


  public void setColorValue(String colorValue) {
    this.colorValue = colorValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogRuntimesAttributeVocabularyValueDisplayInfo catalogRuntimesAttributeVocabularyValueDisplayInfo = (CatalogRuntimesAttributeVocabularyValueDisplayInfo) o;
    return Objects.equals(this.cmsId, catalogRuntimesAttributeVocabularyValueDisplayInfo.cmsId) &&
        Objects.equals(this.imageUrl, catalogRuntimesAttributeVocabularyValueDisplayInfo.imageUrl) &&
        Objects.equals(this.colorValue, catalogRuntimesAttributeVocabularyValueDisplayInfo.colorValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmsId, imageUrl, colorValue);
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
    sb.append("class CatalogRuntimesAttributeVocabularyValueDisplayInfo {\n");
    sb.append("    cmsId: ").append(toIndentedString(cmsId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    colorValue: ").append(toIndentedString(colorValue)).append("\n");
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
    openapiFields.add("cmsId");
    openapiFields.add("imageUrl");
    openapiFields.add("colorValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogRuntimesAttributeVocabularyValueDisplayInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogRuntimesAttributeVocabularyValueDisplayInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogRuntimesAttributeVocabularyValueDisplayInfo is not found in the empty JSON string", CatalogRuntimesAttributeVocabularyValueDisplayInfo.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogRuntimesAttributeVocabularyValueDisplayInfo.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogRuntimesAttributeVocabularyValueDisplayInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("cmsId") != null && !jsonObj.get("cmsId").isJsonNull()) && !jsonObj.get("cmsId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmsId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cmsId").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("colorValue") != null && !jsonObj.get("colorValue").isJsonNull()) && !jsonObj.get("colorValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colorValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colorValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogRuntimesAttributeVocabularyValueDisplayInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogRuntimesAttributeVocabularyValueDisplayInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogRuntimesAttributeVocabularyValueDisplayInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogRuntimesAttributeVocabularyValueDisplayInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogRuntimesAttributeVocabularyValueDisplayInfo>() {
           @Override
           public void write(JsonWriter out, CatalogRuntimesAttributeVocabularyValueDisplayInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogRuntimesAttributeVocabularyValueDisplayInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogRuntimesAttributeVocabularyValueDisplayInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogRuntimesAttributeVocabularyValueDisplayInfo
  * @throws IOException if the JSON string is invalid with respect to CatalogRuntimesAttributeVocabularyValueDisplayInfo
  */
  public static CatalogRuntimesAttributeVocabularyValueDisplayInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogRuntimesAttributeVocabularyValueDisplayInfo.class);
  }

 /**
  * Convert an instance of CatalogRuntimesAttributeVocabularyValueDisplayInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

