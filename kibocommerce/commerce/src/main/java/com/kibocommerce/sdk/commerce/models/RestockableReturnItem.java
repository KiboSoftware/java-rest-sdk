/*
 * Kibo CommerceRuntime Service
 * OpenAPI Spec for Kibo CommerceRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.commerce.models;

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
 * RestockableReturnItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestockableReturnItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RETURN_ITEM_ID = "returnItemId";
  @SerializedName(SERIALIZED_NAME_RETURN_ITEM_ID)
  private String returnItemId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public RestockableReturnItem() {
  }

  public RestockableReturnItem returnItemId(String returnItemId) {
    
    this.returnItemId = returnItemId;
    return this;
  }

   /**
   * Get returnItemId
   * @return returnItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReturnItemId() {
    return returnItemId;
  }


  public void setReturnItemId(String returnItemId) {
    this.returnItemId = returnItemId;
  }


  public RestockableReturnItem quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public RestockableReturnItem locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestockableReturnItem restockableReturnItem = (RestockableReturnItem) o;
    return Objects.equals(this.returnItemId, restockableReturnItem.returnItemId) &&
        Objects.equals(this.quantity, restockableReturnItem.quantity) &&
        Objects.equals(this.locationCode, restockableReturnItem.locationCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnItemId, quantity, locationCode);
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
    sb.append("class RestockableReturnItem {\n");
    sb.append("    returnItemId: ").append(toIndentedString(returnItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
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
    openapiFields.add("returnItemId");
    openapiFields.add("quantity");
    openapiFields.add("locationCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RestockableReturnItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RestockableReturnItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestockableReturnItem is not found in the empty JSON string", RestockableReturnItem.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!RestockableReturnItem.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestockableReturnItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("returnItemId") != null && !jsonObj.get("returnItemId").isJsonNull()) && !jsonObj.get("returnItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnItemId").toString()));
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestockableReturnItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestockableReturnItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestockableReturnItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestockableReturnItem.class));

       return (TypeAdapter<T>) new TypeAdapter<RestockableReturnItem>() {
           @Override
           public void write(JsonWriter out, RestockableReturnItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestockableReturnItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestockableReturnItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestockableReturnItem
  * @throws IOException if the JSON string is invalid with respect to RestockableReturnItem
  */
  public static RestockableReturnItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestockableReturnItem.class);
  }

 /**
  * Convert an instance of RestockableReturnItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
