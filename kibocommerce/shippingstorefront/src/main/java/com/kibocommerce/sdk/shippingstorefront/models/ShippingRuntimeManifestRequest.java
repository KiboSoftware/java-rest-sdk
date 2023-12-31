/*
 * Kibo ShippingRuntime Service
 * OpenAPI Spec for Kibo ShippingRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.shippingstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.shippingstorefront.models.ShippingRuntimeManifestShipment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * ShippingRuntimeManifestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShippingRuntimeManifestRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CARRIER_ID = "carrierId";
  @SerializedName(SERIALIZED_NAME_CARRIER_ID)
  private String carrierId;

  public static final String SERIALIZED_NAME_INCLUDED_SHIPMENTS = "includedShipments";
  @SerializedName(SERIALIZED_NAME_INCLUDED_SHIPMENTS)
  private List<ShippingRuntimeManifestShipment> includedShipments = null;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public ShippingRuntimeManifestRequest() {
  }

  public ShippingRuntimeManifestRequest carrierId(String carrierId) {
    
    this.carrierId = carrierId;
    return this;
  }

   /**
   * Get carrierId
   * @return carrierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCarrierId() {
    return carrierId;
  }


  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }


  public ShippingRuntimeManifestRequest includedShipments(List<ShippingRuntimeManifestShipment> includedShipments) {
    
    this.includedShipments = includedShipments;
    return this;
  }

  public ShippingRuntimeManifestRequest addIncludedShipmentsItem(ShippingRuntimeManifestShipment includedShipmentsItem) {
    if (this.includedShipments == null) {
      this.includedShipments = new ArrayList<>();
    }
    this.includedShipments.add(includedShipmentsItem);
    return this;
  }

   /**
   * Get includedShipments
   * @return includedShipments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ShippingRuntimeManifestShipment> getIncludedShipments() {
    return includedShipments;
  }


  public void setIncludedShipments(List<ShippingRuntimeManifestShipment> includedShipments) {
    this.includedShipments = includedShipments;
  }


  public ShippingRuntimeManifestRequest locationCode(String locationCode) {
    
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
    ShippingRuntimeManifestRequest shippingRuntimeManifestRequest = (ShippingRuntimeManifestRequest) o;
    return Objects.equals(this.carrierId, shippingRuntimeManifestRequest.carrierId) &&
        Objects.equals(this.includedShipments, shippingRuntimeManifestRequest.includedShipments) &&
        Objects.equals(this.locationCode, shippingRuntimeManifestRequest.locationCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, includedShipments, locationCode);
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
    sb.append("class ShippingRuntimeManifestRequest {\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    includedShipments: ").append(toIndentedString(includedShipments)).append("\n");
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
    openapiFields.add("carrierId");
    openapiFields.add("includedShipments");
    openapiFields.add("locationCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShippingRuntimeManifestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShippingRuntimeManifestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShippingRuntimeManifestRequest is not found in the empty JSON string", ShippingRuntimeManifestRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ShippingRuntimeManifestRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShippingRuntimeManifestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("carrierId") != null && !jsonObj.get("carrierId").isJsonNull()) && !jsonObj.get("carrierId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierId").toString()));
      }
      if (jsonObj.get("includedShipments") != null && !jsonObj.get("includedShipments").isJsonNull()) {
        JsonArray jsonArrayincludedShipments = jsonObj.getAsJsonArray("includedShipments");
        if (jsonArrayincludedShipments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("includedShipments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `includedShipments` to be an array in the JSON string but got `%s`", jsonObj.get("includedShipments").toString()));
          }

          // validate the optional field `includedShipments` (array)
          for (int i = 0; i < jsonArrayincludedShipments.size(); i++) {
            ShippingRuntimeManifestShipment.validateJsonObject(jsonArrayincludedShipments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShippingRuntimeManifestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShippingRuntimeManifestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShippingRuntimeManifestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShippingRuntimeManifestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ShippingRuntimeManifestRequest>() {
           @Override
           public void write(JsonWriter out, ShippingRuntimeManifestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShippingRuntimeManifestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShippingRuntimeManifestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShippingRuntimeManifestRequest
  * @throws IOException if the JSON string is invalid with respect to ShippingRuntimeManifestRequest
  */
  public static ShippingRuntimeManifestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShippingRuntimeManifestRequest.class);
  }

 /**
  * Convert an instance of ShippingRuntimeManifestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

