/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesAttributeVocabularyValueDisplayInfo;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesBundledProduct;
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
 * Value of product option...\&quot;red,\&quot; \&quot;white,\&quot; \&quot;blue.\&quot;
 */
@ApiModel(description = "Value of product option...\"red,\" \"white,\" \"blue.\"")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogRuntimesProductOptionValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_ATTRIBUTE_VALUE_ID = "attributeValueId";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_VALUE_ID)
  private Integer attributeValueId;

  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  private String stringValue;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_IS_SELECTED = "isSelected";
  @SerializedName(SERIALIZED_NAME_IS_SELECTED)
  private Boolean isSelected;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_DELTA_WEIGHT = "deltaWeight";
  @SerializedName(SERIALIZED_NAME_DELTA_WEIGHT)
  private Double deltaWeight;

  public static final String SERIALIZED_NAME_DELTA_PRICE = "deltaPrice";
  @SerializedName(SERIALIZED_NAME_DELTA_PRICE)
  private Double deltaPrice;

  public static final String SERIALIZED_NAME_SHOPPER_ENTERED_VALUE = "shopperEnteredValue";
  @SerializedName(SERIALIZED_NAME_SHOPPER_ENTERED_VALUE)
  private Object shopperEnteredValue = null;

  public static final String SERIALIZED_NAME_BUNDLED_PRODUCT = "bundledProduct";
  @SerializedName(SERIALIZED_NAME_BUNDLED_PRODUCT)
  private CatalogRuntimesBundledProduct bundledProduct;

  public static final String SERIALIZED_NAME_DISPLAY_INFO = "displayInfo";
  @SerializedName(SERIALIZED_NAME_DISPLAY_INFO)
  private CatalogRuntimesAttributeVocabularyValueDisplayInfo displayInfo;

  public CatalogRuntimesProductOptionValue() {
  }

  public CatalogRuntimesProductOptionValue value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public CatalogRuntimesProductOptionValue attributeValueId(Integer attributeValueId) {
    
    this.attributeValueId = attributeValueId;
    return this;
  }

   /**
   * Unique Id for the Value
   * @return attributeValueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique Id for the Value")

  public Integer getAttributeValueId() {
    return attributeValueId;
  }


  public void setAttributeValueId(Integer attributeValueId) {
    this.attributeValueId = attributeValueId;
  }


  public CatalogRuntimesProductOptionValue stringValue(String stringValue) {
    
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Localized Value in the language of the locale code only available for dataType string
   * @return stringValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Localized Value in the language of the locale code only available for dataType string")

  public String getStringValue() {
    return stringValue;
  }


  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }


  public CatalogRuntimesProductOptionValue isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * If true, this option is enabled and can be selected. During configuration, this returns false of this option value is invalid with other current selected options.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this option is enabled and can be selected. During configuration, this returns false of this option value is invalid with other current selected options.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public CatalogRuntimesProductOptionValue isSelected(Boolean isSelected) {
    
    this.isSelected = isSelected;
    return this;
  }

   /**
   * If true, this is the option that is currently selected. It can be either the default value or one that the shopper has selected.
   * @return isSelected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this is the option that is currently selected. It can be either the default value or one that the shopper has selected.")

  public Boolean getIsSelected() {
    return isSelected;
  }


  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }


  public CatalogRuntimesProductOptionValue isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * If true, this is the default value that the merchant supplied.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this is the default value that the merchant supplied.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public CatalogRuntimesProductOptionValue deltaWeight(Double deltaWeight) {
    
    this.deltaWeight = deltaWeight;
    return this;
  }

   /**
   * How much this option weighs above the weight of the product.
   * @return deltaWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How much this option weighs above the weight of the product.")

  public Double getDeltaWeight() {
    return deltaWeight;
  }


  public void setDeltaWeight(Double deltaWeight) {
    this.deltaWeight = deltaWeight;
  }


  public CatalogRuntimesProductOptionValue deltaPrice(Double deltaPrice) {
    
    this.deltaPrice = deltaPrice;
    return this;
  }

   /**
   * How much this option costs above the cost of the product.
   * @return deltaPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How much this option costs above the cost of the product.")

  public Double getDeltaPrice() {
    return deltaPrice;
  }


  public void setDeltaPrice(Double deltaPrice) {
    this.deltaPrice = deltaPrice;
  }


  public CatalogRuntimesProductOptionValue shopperEnteredValue(Object shopperEnteredValue) {
    
    this.shopperEnteredValue = shopperEnteredValue;
    return this;
  }

   /**
   * How much this option costs above the cost of the product.
   * @return shopperEnteredValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How much this option costs above the cost of the product.")

  public Object getShopperEnteredValue() {
    return shopperEnteredValue;
  }


  public void setShopperEnteredValue(Object shopperEnteredValue) {
    this.shopperEnteredValue = shopperEnteredValue;
  }


  public CatalogRuntimesProductOptionValue bundledProduct(CatalogRuntimesBundledProduct bundledProduct) {
    
    this.bundledProduct = bundledProduct;
    return this;
  }

   /**
   * Get bundledProduct
   * @return bundledProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesBundledProduct getBundledProduct() {
    return bundledProduct;
  }


  public void setBundledProduct(CatalogRuntimesBundledProduct bundledProduct) {
    this.bundledProduct = bundledProduct;
  }


  public CatalogRuntimesProductOptionValue displayInfo(CatalogRuntimesAttributeVocabularyValueDisplayInfo displayInfo) {
    
    this.displayInfo = displayInfo;
    return this;
  }

   /**
   * Get displayInfo
   * @return displayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesAttributeVocabularyValueDisplayInfo getDisplayInfo() {
    return displayInfo;
  }


  public void setDisplayInfo(CatalogRuntimesAttributeVocabularyValueDisplayInfo displayInfo) {
    this.displayInfo = displayInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogRuntimesProductOptionValue catalogRuntimesProductOptionValue = (CatalogRuntimesProductOptionValue) o;
    return Objects.equals(this.value, catalogRuntimesProductOptionValue.value) &&
        Objects.equals(this.attributeValueId, catalogRuntimesProductOptionValue.attributeValueId) &&
        Objects.equals(this.stringValue, catalogRuntimesProductOptionValue.stringValue) &&
        Objects.equals(this.isEnabled, catalogRuntimesProductOptionValue.isEnabled) &&
        Objects.equals(this.isSelected, catalogRuntimesProductOptionValue.isSelected) &&
        Objects.equals(this.isDefault, catalogRuntimesProductOptionValue.isDefault) &&
        Objects.equals(this.deltaWeight, catalogRuntimesProductOptionValue.deltaWeight) &&
        Objects.equals(this.deltaPrice, catalogRuntimesProductOptionValue.deltaPrice) &&
        Objects.equals(this.shopperEnteredValue, catalogRuntimesProductOptionValue.shopperEnteredValue) &&
        Objects.equals(this.bundledProduct, catalogRuntimesProductOptionValue.bundledProduct) &&
        Objects.equals(this.displayInfo, catalogRuntimesProductOptionValue.displayInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, attributeValueId, stringValue, isEnabled, isSelected, isDefault, deltaWeight, deltaPrice, shopperEnteredValue, bundledProduct, displayInfo);
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
    sb.append("class CatalogRuntimesProductOptionValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    attributeValueId: ").append(toIndentedString(attributeValueId)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    deltaWeight: ").append(toIndentedString(deltaWeight)).append("\n");
    sb.append("    deltaPrice: ").append(toIndentedString(deltaPrice)).append("\n");
    sb.append("    shopperEnteredValue: ").append(toIndentedString(shopperEnteredValue)).append("\n");
    sb.append("    bundledProduct: ").append(toIndentedString(bundledProduct)).append("\n");
    sb.append("    displayInfo: ").append(toIndentedString(displayInfo)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("attributeValueId");
    openapiFields.add("stringValue");
    openapiFields.add("isEnabled");
    openapiFields.add("isSelected");
    openapiFields.add("isDefault");
    openapiFields.add("deltaWeight");
    openapiFields.add("deltaPrice");
    openapiFields.add("shopperEnteredValue");
    openapiFields.add("bundledProduct");
    openapiFields.add("displayInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogRuntimesProductOptionValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogRuntimesProductOptionValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogRuntimesProductOptionValue is not found in the empty JSON string", CatalogRuntimesProductOptionValue.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogRuntimesProductOptionValue.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogRuntimesProductOptionValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull()) && !jsonObj.get("stringValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringValue").toString()));
      }
      // validate the optional field `bundledProduct`
      if (jsonObj.get("bundledProduct") != null && !jsonObj.get("bundledProduct").isJsonNull()) {
        CatalogRuntimesBundledProduct.validateJsonObject(jsonObj.getAsJsonObject("bundledProduct"));
      }
      // validate the optional field `displayInfo`
      if (jsonObj.get("displayInfo") != null && !jsonObj.get("displayInfo").isJsonNull()) {
        CatalogRuntimesAttributeVocabularyValueDisplayInfo.validateJsonObject(jsonObj.getAsJsonObject("displayInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogRuntimesProductOptionValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogRuntimesProductOptionValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogRuntimesProductOptionValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogRuntimesProductOptionValue.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogRuntimesProductOptionValue>() {
           @Override
           public void write(JsonWriter out, CatalogRuntimesProductOptionValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogRuntimesProductOptionValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogRuntimesProductOptionValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogRuntimesProductOptionValue
  * @throws IOException if the JSON string is invalid with respect to CatalogRuntimesProductOptionValue
  */
  public static CatalogRuntimesProductOptionValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogRuntimesProductOptionValue.class);
  }

 /**
  * Convert an instance of CatalogRuntimesProductOptionValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
