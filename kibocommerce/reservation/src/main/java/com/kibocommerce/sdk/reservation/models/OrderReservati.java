/*
 * Kibo Reservation Web API
 * OpenAPI Spec for Kibo Reservation Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.reservation.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.reservation.models.ReservationItem;
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
 * OrderReservati
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderReservati implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private Integer orderNumber;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_RESERVATION_ITEMS = "reservationItems";
  @SerializedName(SERIALIZED_NAME_RESERVATION_ITEMS)
  private List<ReservationItem> reservationItems = null;

  public OrderReservati() {
  }

  public OrderReservati orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public OrderReservati orderNumber(Integer orderNumber) {
    
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderNumber() {
    return orderNumber;
  }


  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }


  public OrderReservati zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public OrderReservati reservationItems(List<ReservationItem> reservationItems) {
    
    this.reservationItems = reservationItems;
    return this;
  }

  public OrderReservati addReservationItemsItem(ReservationItem reservationItemsItem) {
    if (this.reservationItems == null) {
      this.reservationItems = new ArrayList<>();
    }
    this.reservationItems.add(reservationItemsItem);
    return this;
  }

   /**
   * Get reservationItems
   * @return reservationItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReservationItem> getReservationItems() {
    return reservationItems;
  }


  public void setReservationItems(List<ReservationItem> reservationItems) {
    this.reservationItems = reservationItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReservati orderReservati = (OrderReservati) o;
    return Objects.equals(this.orderId, orderReservati.orderId) &&
        Objects.equals(this.orderNumber, orderReservati.orderNumber) &&
        Objects.equals(this.zipCode, orderReservati.zipCode) &&
        Objects.equals(this.reservationItems, orderReservati.reservationItems);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderNumber, zipCode, reservationItems);
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
    sb.append("class OrderReservati {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    reservationItems: ").append(toIndentedString(reservationItems)).append("\n");
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
    openapiFields.add("orderId");
    openapiFields.add("orderNumber");
    openapiFields.add("zipCode");
    openapiFields.add("reservationItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderReservati
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderReservati.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderReservati is not found in the empty JSON string", OrderReservati.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!OrderReservati.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderReservati` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonNull()) && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
      if (jsonObj.get("reservationItems") != null && !jsonObj.get("reservationItems").isJsonNull()) {
        JsonArray jsonArrayreservationItems = jsonObj.getAsJsonArray("reservationItems");
        if (jsonArrayreservationItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reservationItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reservationItems` to be an array in the JSON string but got `%s`", jsonObj.get("reservationItems").toString()));
          }

          // validate the optional field `reservationItems` (array)
          for (int i = 0; i < jsonArrayreservationItems.size(); i++) {
            ReservationItem.validateJsonObject(jsonArrayreservationItems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderReservati.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderReservati' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderReservati> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderReservati.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderReservati>() {
           @Override
           public void write(JsonWriter out, OrderReservati value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderReservati read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderReservati given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderReservati
  * @throws IOException if the JSON string is invalid with respect to OrderReservati
  */
  public static OrderReservati fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderReservati.class);
  }

 /**
  * Convert an instance of OrderReservati to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

