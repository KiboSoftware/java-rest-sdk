/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.models;

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
 * Request/Response object for a tag
 */
@ApiModel(description = "Request/Response object for a tag")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InventoryTag implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TAG_I_D = "tagID";
  @SerializedName(SERIALIZED_NAME_TAG_I_D)
  private Integer tagID;

  public static final String SERIALIZED_NAME_TAG_VALUE = "tagValue";
  @SerializedName(SERIALIZED_NAME_TAG_VALUE)
  private String tagValue;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private Integer percent;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public InventoryTag() {
  }

  public InventoryTag tagID(Integer tagID) {
    
    this.tagID = tagID;
    return this;
  }

   /**
   * Tag ID
   * @return tagID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tag ID")

  public Integer getTagID() {
    return tagID;
  }


  public void setTagID(Integer tagID) {
    this.tagID = tagID;
  }


  public InventoryTag tagValue(String tagValue) {
    
    this.tagValue = tagValue;
    return this;
  }

   /**
   * Tag Value
   * @return tagValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tag Value")

  public String getTagValue() {
    return tagValue;
  }


  public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
  }


  public InventoryTag isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether or not this tag is the default tag for its category.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not this tag is the default tag for its category.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public InventoryTag percent(Integer percent) {
    
    this.percent = percent;
    return this;
  }

   /**
   * Percentage of available inventory this tag will get when the percentage update is performed. Must be between 0 and 100 (inclusive).
   * @return percent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of available inventory this tag will get when the percentage update is performed. Must be between 0 and 100 (inclusive).")

  public Integer getPercent() {
    return percent;
  }


  public void setPercent(Integer percent) {
    this.percent = percent;
  }


  public InventoryTag created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Date this tag was created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this tag was created")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public InventoryTag updated(String updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Date this tag was last updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this tag was last updated")

  public String getUpdated() {
    return updated;
  }


  public void setUpdated(String updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryTag inventoryTag = (InventoryTag) o;
    return Objects.equals(this.tagID, inventoryTag.tagID) &&
        Objects.equals(this.tagValue, inventoryTag.tagValue) &&
        Objects.equals(this.isDefault, inventoryTag.isDefault) &&
        Objects.equals(this.percent, inventoryTag.percent) &&
        Objects.equals(this.created, inventoryTag.created) &&
        Objects.equals(this.updated, inventoryTag.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagID, tagValue, isDefault, percent, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryTag {\n");
    sb.append("    tagID: ").append(toIndentedString(tagID)).append("\n");
    sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("tagID");
    openapiFields.add("tagValue");
    openapiFields.add("isDefault");
    openapiFields.add("percent");
    openapiFields.add("created");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InventoryTag
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InventoryTag.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InventoryTag is not found in the empty JSON string", InventoryTag.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!InventoryTag.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InventoryTag` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("tagValue") != null && !jsonObj.get("tagValue").isJsonNull()) && !jsonObj.get("tagValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tagValue").toString()));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if ((jsonObj.get("updated") != null && !jsonObj.get("updated").isJsonNull()) && !jsonObj.get("updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InventoryTag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InventoryTag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InventoryTag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InventoryTag.class));

       return (TypeAdapter<T>) new TypeAdapter<InventoryTag>() {
           @Override
           public void write(JsonWriter out, InventoryTag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InventoryTag read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InventoryTag given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InventoryTag
  * @throws IOException if the JSON string is invalid with respect to InventoryTag
  */
  public static InventoryTag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InventoryTag.class);
  }

 /**
  * Convert an instance of InventoryTag to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

