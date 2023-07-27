/*
 * Kibo Fulfillment Service
 * OpenAPI Spec for Kibo Fulfillment Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.models;

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
 * FutureShipmentUpdateDateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FutureShipmentUpdateDateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BYPASS_FUTURE_ALLOCATE_DEALLOCATE = "bypassFutureAllocateDeallocate";
  @SerializedName(SERIALIZED_NAME_BYPASS_FUTURE_ALLOCATE_DEALLOCATE)
  private Boolean bypassFutureAllocateDeallocate;

  public static final String SERIALIZED_NAME_FUTURE_DATE = "futureDate";
  @SerializedName(SERIALIZED_NAME_FUTURE_DATE)
  private OffsetDateTime futureDate;

  public FutureShipmentUpdateDateRequest() {
  }

  public FutureShipmentUpdateDateRequest bypassFutureAllocateDeallocate(Boolean bypassFutureAllocateDeallocate) {
    
    this.bypassFutureAllocateDeallocate = bypassFutureAllocateDeallocate;
    return this;
  }

   /**
   * Get bypassFutureAllocateDeallocate
   * @return bypassFutureAllocateDeallocate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBypassFutureAllocateDeallocate() {
    return bypassFutureAllocateDeallocate;
  }


  public void setBypassFutureAllocateDeallocate(Boolean bypassFutureAllocateDeallocate) {
    this.bypassFutureAllocateDeallocate = bypassFutureAllocateDeallocate;
  }


  public FutureShipmentUpdateDateRequest futureDate(OffsetDateTime futureDate) {
    
    this.futureDate = futureDate;
    return this;
  }

   /**
   * Get futureDate
   * @return futureDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getFutureDate() {
    return futureDate;
  }


  public void setFutureDate(OffsetDateTime futureDate) {
    this.futureDate = futureDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FutureShipmentUpdateDateRequest futureShipmentUpdateDateRequest = (FutureShipmentUpdateDateRequest) o;
    return Objects.equals(this.bypassFutureAllocateDeallocate, futureShipmentUpdateDateRequest.bypassFutureAllocateDeallocate) &&
        Objects.equals(this.futureDate, futureShipmentUpdateDateRequest.futureDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bypassFutureAllocateDeallocate, futureDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FutureShipmentUpdateDateRequest {\n");
    sb.append("    bypassFutureAllocateDeallocate: ").append(toIndentedString(bypassFutureAllocateDeallocate)).append("\n");
    sb.append("    futureDate: ").append(toIndentedString(futureDate)).append("\n");
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
    openapiFields.add("bypassFutureAllocateDeallocate");
    openapiFields.add("futureDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("futureDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FutureShipmentUpdateDateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FutureShipmentUpdateDateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FutureShipmentUpdateDateRequest is not found in the empty JSON string", FutureShipmentUpdateDateRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!FutureShipmentUpdateDateRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FutureShipmentUpdateDateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FutureShipmentUpdateDateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FutureShipmentUpdateDateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FutureShipmentUpdateDateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FutureShipmentUpdateDateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FutureShipmentUpdateDateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FutureShipmentUpdateDateRequest>() {
           @Override
           public void write(JsonWriter out, FutureShipmentUpdateDateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FutureShipmentUpdateDateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FutureShipmentUpdateDateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FutureShipmentUpdateDateRequest
  * @throws IOException if the JSON string is invalid with respect to FutureShipmentUpdateDateRequest
  */
  public static FutureShipmentUpdateDateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FutureShipmentUpdateDateRequest.class);
  }

 /**
  * Convert an instance of FutureShipmentUpdateDateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
