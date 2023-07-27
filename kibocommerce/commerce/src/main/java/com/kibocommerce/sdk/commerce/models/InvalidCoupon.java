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
import java.time.OffsetDateTime;
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
 * Represents a coupon that is considered invalid by the Mozu pricing service.
 */
@ApiModel(description = "Represents a coupon that is considered invalid by the Mozu pricing service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InvalidCoupon implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private Integer reasonCode;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_DISCOUNT_ID = "discountId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_ID)
  private Integer discountId;

  public InvalidCoupon() {
  }

  public InvalidCoupon couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Code that identifies the coupon.
   * @return couponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code that identifies the coupon.")

  public String getCouponCode() {
    return couponCode;
  }


  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public InvalidCoupon reasonCode(Integer reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Code that identifies the reason the coupon was invalid.
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code that identifies the reason the coupon was invalid.")

  public Integer getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(Integer reasonCode) {
    this.reasonCode = reasonCode;
  }


  public InvalidCoupon reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Description text of the reason.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description text of the reason.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public InvalidCoupon createDate(OffsetDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Create date of the invalid coupon.
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Create date of the invalid coupon.")

  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public InvalidCoupon discountId(Integer discountId) {
    
    this.discountId = discountId;
    return this;
  }

   /**
   * Get discountId
   * @return discountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiscountId() {
    return discountId;
  }


  public void setDiscountId(Integer discountId) {
    this.discountId = discountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidCoupon invalidCoupon = (InvalidCoupon) o;
    return Objects.equals(this.couponCode, invalidCoupon.couponCode) &&
        Objects.equals(this.reasonCode, invalidCoupon.reasonCode) &&
        Objects.equals(this.reason, invalidCoupon.reason) &&
        Objects.equals(this.createDate, invalidCoupon.createDate) &&
        Objects.equals(this.discountId, invalidCoupon.discountId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponCode, reasonCode, reason, createDate, discountId);
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
    sb.append("class InvalidCoupon {\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
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
    openapiFields.add("couponCode");
    openapiFields.add("reasonCode");
    openapiFields.add("reason");
    openapiFields.add("createDate");
    openapiFields.add("discountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvalidCoupon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvalidCoupon.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvalidCoupon is not found in the empty JSON string", InvalidCoupon.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!InvalidCoupon.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvalidCoupon` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("couponCode") != null && !jsonObj.get("couponCode").isJsonNull()) && !jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvalidCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvalidCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvalidCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvalidCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<InvalidCoupon>() {
           @Override
           public void write(JsonWriter out, InvalidCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvalidCoupon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvalidCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvalidCoupon
  * @throws IOException if the JSON string is invalid with respect to InvalidCoupon
  */
  public static InvalidCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvalidCoupon.class);
  }

 /**
  * Convert an instance of InvalidCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
