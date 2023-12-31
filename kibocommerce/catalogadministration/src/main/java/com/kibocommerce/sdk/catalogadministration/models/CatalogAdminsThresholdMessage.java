/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogadministration.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.catalogadministration.models.ThresholdMessageLocalizedContent;
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
 * CatalogAdminsThresholdMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsThresholdMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DISCOUNT_ID = "discountId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_ID)
  private Integer discountId;

  public static final String SERIALIZED_NAME_THRESHOLD_VALUE = "thresholdValue";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_VALUE)
  private Double thresholdValue;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_SHOW_IN_CART = "showInCart";
  @SerializedName(SERIALIZED_NAME_SHOW_IN_CART)
  private Boolean showInCart;

  public static final String SERIALIZED_NAME_SHOW_ON_CHECKOUT = "showOnCheckout";
  @SerializedName(SERIALIZED_NAME_SHOW_ON_CHECKOUT)
  private Boolean showOnCheckout;

  public static final String SERIALIZED_NAME_REQUIRES_COUPON_CODE = "requiresCouponCode";
  @SerializedName(SERIALIZED_NAME_REQUIRES_COUPON_CODE)
  private Boolean requiresCouponCode;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ThresholdMessageLocalizedContent content;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public CatalogAdminsThresholdMessage() {
  }

  public CatalogAdminsThresholdMessage discountId(Integer discountId) {
    
    this.discountId = discountId;
    return this;
  }

   /**
   * Unique identifier of the discount. System-supplied and read-only.
   * @return discountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the discount. System-supplied and read-only.")

  public Integer getDiscountId() {
    return discountId;
  }


  public void setDiscountId(Integer discountId) {
    this.discountId = discountId;
  }


  public CatalogAdminsThresholdMessage thresholdValue(Double thresholdValue) {
    
    this.thresholdValue = thresholdValue;
    return this;
  }

   /**
   * The cart total amount that must be met before the threshold message is displayed
   * @return thresholdValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The cart total amount that must be met before the threshold message is displayed")

  public Double getThresholdValue() {
    return thresholdValue;
  }


  public void setThresholdValue(Double thresholdValue) {
    this.thresholdValue = thresholdValue;
  }


  public CatalogAdminsThresholdMessage isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if threshold messages are active for this discount
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if threshold messages are active for this discount")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public CatalogAdminsThresholdMessage showInCart(Boolean showInCart) {
    
    this.showInCart = showInCart;
    return this;
  }

   /**
   * Indicates if the threshold message will display in the cart
   * @return showInCart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the threshold message will display in the cart")

  public Boolean getShowInCart() {
    return showInCart;
  }


  public void setShowInCart(Boolean showInCart) {
    this.showInCart = showInCart;
  }


  public CatalogAdminsThresholdMessage showOnCheckout(Boolean showOnCheckout) {
    
    this.showOnCheckout = showOnCheckout;
    return this;
  }

   /**
   * Indicates if the threshold message will display on the checkout page
   * @return showOnCheckout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the threshold message will display on the checkout page")

  public Boolean getShowOnCheckout() {
    return showOnCheckout;
  }


  public void setShowOnCheckout(Boolean showOnCheckout) {
    this.showOnCheckout = showOnCheckout;
  }


  public CatalogAdminsThresholdMessage requiresCouponCode(Boolean requiresCouponCode) {
    
    this.requiresCouponCode = requiresCouponCode;
    return this;
  }

   /**
   * Indicates if the threshold message will display when a promo code is evaluated
   * @return requiresCouponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the threshold message will display when a promo code is evaluated")

  public Boolean getRequiresCouponCode() {
    return requiresCouponCode;
  }


  public void setRequiresCouponCode(Boolean requiresCouponCode) {
    this.requiresCouponCode = requiresCouponCode;
  }


  public CatalogAdminsThresholdMessage content(ThresholdMessageLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ThresholdMessageLocalizedContent getContent() {
    return content;
  }


  public void setContent(ThresholdMessageLocalizedContent content) {
    this.content = content;
  }


  public CatalogAdminsThresholdMessage auditInfo(AdminUserAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminUserAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AdminUserAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsThresholdMessage catalogAdminsThresholdMessage = (CatalogAdminsThresholdMessage) o;
    return Objects.equals(this.discountId, catalogAdminsThresholdMessage.discountId) &&
        Objects.equals(this.thresholdValue, catalogAdminsThresholdMessage.thresholdValue) &&
        Objects.equals(this.isActive, catalogAdminsThresholdMessage.isActive) &&
        Objects.equals(this.showInCart, catalogAdminsThresholdMessage.showInCart) &&
        Objects.equals(this.showOnCheckout, catalogAdminsThresholdMessage.showOnCheckout) &&
        Objects.equals(this.requiresCouponCode, catalogAdminsThresholdMessage.requiresCouponCode) &&
        Objects.equals(this.content, catalogAdminsThresholdMessage.content) &&
        Objects.equals(this.auditInfo, catalogAdminsThresholdMessage.auditInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountId, thresholdValue, isActive, showInCart, showOnCheckout, requiresCouponCode, content, auditInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogAdminsThresholdMessage {\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    showInCart: ").append(toIndentedString(showInCart)).append("\n");
    sb.append("    showOnCheckout: ").append(toIndentedString(showOnCheckout)).append("\n");
    sb.append("    requiresCouponCode: ").append(toIndentedString(requiresCouponCode)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
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
    openapiFields.add("discountId");
    openapiFields.add("thresholdValue");
    openapiFields.add("isActive");
    openapiFields.add("showInCart");
    openapiFields.add("showOnCheckout");
    openapiFields.add("requiresCouponCode");
    openapiFields.add("content");
    openapiFields.add("auditInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("discountId");
    openapiRequiredFields.add("thresholdValue");
    openapiRequiredFields.add("content");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsThresholdMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsThresholdMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsThresholdMessage is not found in the empty JSON string", CatalogAdminsThresholdMessage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsThresholdMessage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsThresholdMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogAdminsThresholdMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `content`
      ThresholdMessageLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsThresholdMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsThresholdMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsThresholdMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsThresholdMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsThresholdMessage>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsThresholdMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsThresholdMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsThresholdMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsThresholdMessage
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsThresholdMessage
  */
  public static CatalogAdminsThresholdMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsThresholdMessage.class);
  }

 /**
  * Convert an instance of CatalogAdminsThresholdMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

