/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.orderrouting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.orderrouting.models.CandidateSuggestionFutureInventory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * CandidateSuggestionInventory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CandidateSuggestionInventory implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_FUTURE_INVENTORY = "futureInventory";
  @SerializedName(SERIALIZED_NAME_FUTURE_INVENTORY)
  private List<CandidateSuggestionFutureInventory> futureInventory = null;

  public static final String SERIALIZED_NAME_PART_NUMBER = "partNumber";
  @SerializedName(SERIALIZED_NAME_PART_NUMBER)
  private String partNumber;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public CandidateSuggestionInventory() {
  }

  public CandidateSuggestionInventory available(Integer available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailable() {
    return available;
  }


  public void setAvailable(Integer available) {
    this.available = available;
  }


  public CandidateSuggestionInventory futureInventory(List<CandidateSuggestionFutureInventory> futureInventory) {
    
    this.futureInventory = futureInventory;
    return this;
  }

  public CandidateSuggestionInventory addFutureInventoryItem(CandidateSuggestionFutureInventory futureInventoryItem) {
    if (this.futureInventory == null) {
      this.futureInventory = new ArrayList<>();
    }
    this.futureInventory.add(futureInventoryItem);
    return this;
  }

   /**
   * Get futureInventory
   * @return futureInventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CandidateSuggestionFutureInventory> getFutureInventory() {
    return futureInventory;
  }


  public void setFutureInventory(List<CandidateSuggestionFutureInventory> futureInventory) {
    this.futureInventory = futureInventory;
  }


  public CandidateSuggestionInventory partNumber(String partNumber) {
    
    this.partNumber = partNumber;
    return this;
  }

   /**
   * Get partNumber
   * @return partNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartNumber() {
    return partNumber;
  }


  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }


  public CandidateSuggestionInventory sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public CandidateSuggestionInventory upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * Get upc
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateSuggestionInventory candidateSuggestionInventory = (CandidateSuggestionInventory) o;
    return Objects.equals(this.available, candidateSuggestionInventory.available) &&
        Objects.equals(this.futureInventory, candidateSuggestionInventory.futureInventory) &&
        Objects.equals(this.partNumber, candidateSuggestionInventory.partNumber) &&
        Objects.equals(this.sku, candidateSuggestionInventory.sku) &&
        Objects.equals(this.upc, candidateSuggestionInventory.upc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, futureInventory, partNumber, sku, upc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateSuggestionInventory {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    futureInventory: ").append(toIndentedString(futureInventory)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
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
    openapiFields.add("available");
    openapiFields.add("futureInventory");
    openapiFields.add("partNumber");
    openapiFields.add("sku");
    openapiFields.add("upc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CandidateSuggestionInventory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CandidateSuggestionInventory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CandidateSuggestionInventory is not found in the empty JSON string", CandidateSuggestionInventory.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CandidateSuggestionInventory.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CandidateSuggestionInventory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("futureInventory") != null && !jsonObj.get("futureInventory").isJsonNull()) {
        JsonArray jsonArrayfutureInventory = jsonObj.getAsJsonArray("futureInventory");
        if (jsonArrayfutureInventory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("futureInventory").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `futureInventory` to be an array in the JSON string but got `%s`", jsonObj.get("futureInventory").toString()));
          }

          // validate the optional field `futureInventory` (array)
          for (int i = 0; i < jsonArrayfutureInventory.size(); i++) {
            CandidateSuggestionFutureInventory.validateJsonObject(jsonArrayfutureInventory.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("partNumber") != null && !jsonObj.get("partNumber").isJsonNull()) && !jsonObj.get("partNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partNumber").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CandidateSuggestionInventory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CandidateSuggestionInventory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CandidateSuggestionInventory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CandidateSuggestionInventory.class));

       return (TypeAdapter<T>) new TypeAdapter<CandidateSuggestionInventory>() {
           @Override
           public void write(JsonWriter out, CandidateSuggestionInventory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CandidateSuggestionInventory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CandidateSuggestionInventory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CandidateSuggestionInventory
  * @throws IOException if the JSON string is invalid with respect to CandidateSuggestionInventory
  */
  public static CandidateSuggestionInventory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CandidateSuggestionInventory.class);
  }

 /**
  * Convert an instance of CandidateSuggestionInventory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

