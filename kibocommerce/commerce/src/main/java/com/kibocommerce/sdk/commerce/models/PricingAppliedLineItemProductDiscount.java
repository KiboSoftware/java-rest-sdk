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
import com.kibocommerce.sdk.commerce.models.PricingDiscount;
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
 * PricingAppliedLineItemProductDiscount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingAppliedLineItemProductDiscount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLIES_TO_SALE_PRICE = "appliesToSalePrice";
  @SerializedName(SERIALIZED_NAME_APPLIES_TO_SALE_PRICE)
  private Boolean appliesToSalePrice;

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  private Double impact;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private PricingDiscount discount;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_COUPON_SET_ID = "couponSetId";
  @SerializedName(SERIALIZED_NAME_COUPON_SET_ID)
  private Integer couponSetId;

  public PricingAppliedLineItemProductDiscount() {
  }

  public PricingAppliedLineItemProductDiscount appliesToSalePrice(Boolean appliesToSalePrice) {
    
    this.appliesToSalePrice = appliesToSalePrice;
    return this;
  }

   /**
   * Get appliesToSalePrice
   * @return appliesToSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAppliesToSalePrice() {
    return appliesToSalePrice;
  }


  public void setAppliesToSalePrice(Boolean appliesToSalePrice) {
    this.appliesToSalePrice = appliesToSalePrice;
  }


  public PricingAppliedLineItemProductDiscount impact(Double impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getImpact() {
    return impact;
  }


  public void setImpact(Double impact) {
    this.impact = impact;
  }


  public PricingAppliedLineItemProductDiscount discount(PricingDiscount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PricingDiscount getDiscount() {
    return discount;
  }


  public void setDiscount(PricingDiscount discount) {
    this.discount = discount;
  }


  public PricingAppliedLineItemProductDiscount couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Get couponCode
   * @return couponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCouponCode() {
    return couponCode;
  }


  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public PricingAppliedLineItemProductDiscount couponSetId(Integer couponSetId) {
    
    this.couponSetId = couponSetId;
    return this;
  }

   /**
   * Get couponSetId
   * @return couponSetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCouponSetId() {
    return couponSetId;
  }


  public void setCouponSetId(Integer couponSetId) {
    this.couponSetId = couponSetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingAppliedLineItemProductDiscount pricingAppliedLineItemProductDiscount = (PricingAppliedLineItemProductDiscount) o;
    return Objects.equals(this.appliesToSalePrice, pricingAppliedLineItemProductDiscount.appliesToSalePrice) &&
        Objects.equals(this.impact, pricingAppliedLineItemProductDiscount.impact) &&
        Objects.equals(this.discount, pricingAppliedLineItemProductDiscount.discount) &&
        Objects.equals(this.couponCode, pricingAppliedLineItemProductDiscount.couponCode) &&
        Objects.equals(this.couponSetId, pricingAppliedLineItemProductDiscount.couponSetId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesToSalePrice, impact, discount, couponCode, couponSetId);
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
    sb.append("class PricingAppliedLineItemProductDiscount {\n");
    sb.append("    appliesToSalePrice: ").append(toIndentedString(appliesToSalePrice)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    couponSetId: ").append(toIndentedString(couponSetId)).append("\n");
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
    openapiFields.add("impact");
    openapiFields.add("discount");
    openapiFields.add("couponCode");
    openapiFields.add("couponSetId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PricingAppliedLineItemProductDiscount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PricingAppliedLineItemProductDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingAppliedLineItemProductDiscount is not found in the empty JSON string", PricingAppliedLineItemProductDiscount.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PricingAppliedLineItemProductDiscount.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PricingAppliedLineItemProductDiscount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        PricingDiscount.validateJsonObject(jsonObj.getAsJsonObject("discount"));
      }
      if ((jsonObj.get("couponCode") != null && !jsonObj.get("couponCode").isJsonNull()) && !jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingAppliedLineItemProductDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingAppliedLineItemProductDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingAppliedLineItemProductDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingAppliedLineItemProductDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingAppliedLineItemProductDiscount>() {
           @Override
           public void write(JsonWriter out, PricingAppliedLineItemProductDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingAppliedLineItemProductDiscount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricingAppliedLineItemProductDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricingAppliedLineItemProductDiscount
  * @throws IOException if the JSON string is invalid with respect to PricingAppliedLineItemProductDiscount
  */
  public static PricingAppliedLineItemProductDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingAppliedLineItemProductDiscount.class);
  }

 /**
  * Convert an instance of PricingAppliedLineItemProductDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

