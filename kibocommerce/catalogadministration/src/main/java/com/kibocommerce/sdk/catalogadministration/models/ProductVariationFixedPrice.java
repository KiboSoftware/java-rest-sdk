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
 * ProductVariationFixedPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductVariationFixedPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_LIST_PRICE = "listPrice";
  @SerializedName(SERIALIZED_NAME_LIST_PRICE)
  private Double listPrice;

  public static final String SERIALIZED_NAME_SALE_PRICE = "salePrice";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE)
  private Double salePrice;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private Double msrp;

  public static final String SERIALIZED_NAME_CREDIT_VALUE = "creditValue";
  @SerializedName(SERIALIZED_NAME_CREDIT_VALUE)
  private Double creditValue;

  public ProductVariationFixedPrice() {
  }

  public ProductVariationFixedPrice currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Which currency is in use.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Which currency is in use.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ProductVariationFixedPrice listPrice(Double listPrice) {
    
    this.listPrice = listPrice;
    return this;
  }

   /**
   * Variation price for fixed pricing
   * @return listPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variation price for fixed pricing")

  public Double getListPrice() {
    return listPrice;
  }


  public void setListPrice(Double listPrice) {
    this.listPrice = listPrice;
  }


  public ProductVariationFixedPrice salePrice(Double salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Variation sale price whne fixed pricing
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variation sale price whne fixed pricing")

  public Double getSalePrice() {
    return salePrice;
  }


  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }


  public ProductVariationFixedPrice msrp(Double msrp) {
    
    this.msrp = msrp;
    return this;
  }

   /**
   * Manufacturer Suggested Retail Price.
   * @return msrp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manufacturer Suggested Retail Price.")

  public Double getMsrp() {
    return msrp;
  }


  public void setMsrp(Double msrp) {
    this.msrp = msrp;
  }


  public ProductVariationFixedPrice creditValue(Double creditValue) {
    
    this.creditValue = creditValue;
    return this;
  }

   /**
   * Credit amt of the product
   * @return creditValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credit amt of the product")

  public Double getCreditValue() {
    return creditValue;
  }


  public void setCreditValue(Double creditValue) {
    this.creditValue = creditValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariationFixedPrice productVariationFixedPrice = (ProductVariationFixedPrice) o;
    return Objects.equals(this.currencyCode, productVariationFixedPrice.currencyCode) &&
        Objects.equals(this.listPrice, productVariationFixedPrice.listPrice) &&
        Objects.equals(this.salePrice, productVariationFixedPrice.salePrice) &&
        Objects.equals(this.msrp, productVariationFixedPrice.msrp) &&
        Objects.equals(this.creditValue, productVariationFixedPrice.creditValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, listPrice, salePrice, msrp, creditValue);
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
    sb.append("class ProductVariationFixedPrice {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    creditValue: ").append(toIndentedString(creditValue)).append("\n");
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
    openapiFields.add("currencyCode");
    openapiFields.add("listPrice");
    openapiFields.add("salePrice");
    openapiFields.add("msrp");
    openapiFields.add("creditValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductVariationFixedPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductVariationFixedPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductVariationFixedPrice is not found in the empty JSON string", ProductVariationFixedPrice.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductVariationFixedPrice.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductVariationFixedPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductVariationFixedPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductVariationFixedPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductVariationFixedPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductVariationFixedPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductVariationFixedPrice>() {
           @Override
           public void write(JsonWriter out, ProductVariationFixedPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductVariationFixedPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductVariationFixedPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductVariationFixedPrice
  * @throws IOException if the JSON string is invalid with respect to ProductVariationFixedPrice
  */
  public static ProductVariationFixedPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductVariationFixedPrice.class);
  }

 /**
  * Convert an instance of ProductVariationFixedPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

