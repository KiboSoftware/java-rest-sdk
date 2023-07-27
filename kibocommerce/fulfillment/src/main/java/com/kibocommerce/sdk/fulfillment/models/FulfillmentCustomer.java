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
import com.kibocommerce.sdk.fulfillment.models.FulfillmentContact;
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
 * FulfillmentCustomer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FulfillmentCustomer implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CUSTOMER_CONTACT = "customerContact";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_CONTACT)
  private FulfillmentContact customerContact;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_IS_DESTINATION_COMMERCIAL = "isDestinationCommercial";
  @SerializedName(SERIALIZED_NAME_IS_DESTINATION_COMMERCIAL)
  private Boolean isDestinationCommercial;

  public FulfillmentCustomer() {
  }

  public FulfillmentCustomer customerContact(FulfillmentContact customerContact) {
    
    this.customerContact = customerContact;
    return this;
  }

   /**
   * Get customerContact
   * @return customerContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FulfillmentContact getCustomerContact() {
    return customerContact;
  }


  public void setCustomerContact(FulfillmentContact customerContact) {
    this.customerContact = customerContact;
  }


  public FulfillmentCustomer data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public FulfillmentCustomer isDestinationCommercial(Boolean isDestinationCommercial) {
    
    this.isDestinationCommercial = isDestinationCommercial;
    return this;
  }

   /**
   * Get isDestinationCommercial
   * @return isDestinationCommercial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDestinationCommercial() {
    return isDestinationCommercial;
  }


  public void setIsDestinationCommercial(Boolean isDestinationCommercial) {
    this.isDestinationCommercial = isDestinationCommercial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentCustomer fulfillmentCustomer = (FulfillmentCustomer) o;
    return Objects.equals(this.customerContact, fulfillmentCustomer.customerContact) &&
        Objects.equals(this.data, fulfillmentCustomer.data) &&
        Objects.equals(this.isDestinationCommercial, fulfillmentCustomer.isDestinationCommercial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerContact, data, isDestinationCommercial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentCustomer {\n");
    sb.append("    customerContact: ").append(toIndentedString(customerContact)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isDestinationCommercial: ").append(toIndentedString(isDestinationCommercial)).append("\n");
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
    openapiFields.add("customerContact");
    openapiFields.add("data");
    openapiFields.add("isDestinationCommercial");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FulfillmentCustomer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FulfillmentCustomer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FulfillmentCustomer is not found in the empty JSON string", FulfillmentCustomer.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!FulfillmentCustomer.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FulfillmentCustomer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `customerContact`
      if (jsonObj.get("customerContact") != null && !jsonObj.get("customerContact").isJsonNull()) {
        FulfillmentContact.validateJsonObject(jsonObj.getAsJsonObject("customerContact"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FulfillmentCustomer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FulfillmentCustomer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FulfillmentCustomer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FulfillmentCustomer.class));

       return (TypeAdapter<T>) new TypeAdapter<FulfillmentCustomer>() {
           @Override
           public void write(JsonWriter out, FulfillmentCustomer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FulfillmentCustomer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FulfillmentCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FulfillmentCustomer
  * @throws IOException if the JSON string is invalid with respect to FulfillmentCustomer
  */
  public static FulfillmentCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FulfillmentCustomer.class);
  }

 /**
  * Convert an instance of FulfillmentCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
