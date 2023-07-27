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
 * AbstractFulfillmentItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AbstractFulfillmentItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_FULFILLMENT_ITEM_TYPE = "fulfillmentItemType";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_ITEM_TYPE)
  private String fulfillmentItemType;

  public static final String SERIALIZED_NAME_LINE_ID = "lineId";
  @SerializedName(SERIALIZED_NAME_LINE_ID)
  private Integer lineId;

  public static final String SERIALIZED_NAME_OPTION_ATTRIBUTE_F_Q_N = "optionAttributeFQN";
  @SerializedName(SERIALIZED_NAME_OPTION_ATTRIBUTE_F_Q_N)
  private String optionAttributeFQN;

  public AbstractFulfillmentItem() {
  }

  public AbstractFulfillmentItem productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Code of the Product to be fulfilled.
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code of the Product to be fulfilled.")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AbstractFulfillmentItem quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of the order item
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quantity of the order item")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public AbstractFulfillmentItem fulfillmentItemType(String fulfillmentItemType) {
    
    this.fulfillmentItemType = fulfillmentItemType;
    return this;
  }

   /**
   * The type of fulfillment item
   * @return fulfillmentItemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of fulfillment item")

  public String getFulfillmentItemType() {
    return fulfillmentItemType;
  }


  public void setFulfillmentItemType(String fulfillmentItemType) {
    this.fulfillmentItemType = fulfillmentItemType;
  }


  public AbstractFulfillmentItem lineId(Integer lineId) {
    
    this.lineId = lineId;
    return this;
  }

   /**
   * The line id associated with the fulfillment.
   * @return lineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The line id associated with the fulfillment.")

  public Integer getLineId() {
    return lineId;
  }


  public void setLineId(Integer lineId) {
    this.lineId = lineId;
  }


  public AbstractFulfillmentItem optionAttributeFQN(String optionAttributeFQN) {
    
    this.optionAttributeFQN = optionAttributeFQN;
    return this;
  }

   /**
   * Get optionAttributeFQN
   * @return optionAttributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOptionAttributeFQN() {
    return optionAttributeFQN;
  }


  public void setOptionAttributeFQN(String optionAttributeFQN) {
    this.optionAttributeFQN = optionAttributeFQN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractFulfillmentItem abstractFulfillmentItem = (AbstractFulfillmentItem) o;
    return Objects.equals(this.productCode, abstractFulfillmentItem.productCode) &&
        Objects.equals(this.quantity, abstractFulfillmentItem.quantity) &&
        Objects.equals(this.fulfillmentItemType, abstractFulfillmentItem.fulfillmentItemType) &&
        Objects.equals(this.lineId, abstractFulfillmentItem.lineId) &&
        Objects.equals(this.optionAttributeFQN, abstractFulfillmentItem.optionAttributeFQN);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, quantity, fulfillmentItemType, lineId, optionAttributeFQN);
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
    sb.append("class AbstractFulfillmentItem {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    fulfillmentItemType: ").append(toIndentedString(fulfillmentItemType)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    optionAttributeFQN: ").append(toIndentedString(optionAttributeFQN)).append("\n");
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
    openapiFields.add("productCode");
    openapiFields.add("quantity");
    openapiFields.add("fulfillmentItemType");
    openapiFields.add("lineId");
    openapiFields.add("optionAttributeFQN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbstractFulfillmentItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AbstractFulfillmentItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbstractFulfillmentItem is not found in the empty JSON string", AbstractFulfillmentItem.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AbstractFulfillmentItem.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AbstractFulfillmentItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("fulfillmentItemType") != null && !jsonObj.get("fulfillmentItemType").isJsonNull()) && !jsonObj.get("fulfillmentItemType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentItemType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentItemType").toString()));
      }
      if ((jsonObj.get("optionAttributeFQN") != null && !jsonObj.get("optionAttributeFQN").isJsonNull()) && !jsonObj.get("optionAttributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionAttributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionAttributeFQN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AbstractFulfillmentItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AbstractFulfillmentItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AbstractFulfillmentItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AbstractFulfillmentItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AbstractFulfillmentItem>() {
           @Override
           public void write(JsonWriter out, AbstractFulfillmentItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AbstractFulfillmentItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AbstractFulfillmentItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbstractFulfillmentItem
  * @throws IOException if the JSON string is invalid with respect to AbstractFulfillmentItem
  */
  public static AbstractFulfillmentItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbstractFulfillmentItem.class);
  }

 /**
  * Convert an instance of AbstractFulfillmentItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

