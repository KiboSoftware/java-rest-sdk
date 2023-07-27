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
import com.kibocommerce.sdk.catalogadministration.models.AttributeInProductTypeDisplayInfo;
import com.kibocommerce.sdk.catalogadministration.models.AttributeVocabularyValueInProductType;
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttribute;
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
 * AttributeInProductType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttributeInProductType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTE_F_Q_N = "attributeFQN";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_F_Q_N)
  private String attributeFQN;

  public static final String SERIALIZED_NAME_IS_INHERITED_FROM_BASE_TYPE = "isInheritedFromBaseType";
  @SerializedName(SERIALIZED_NAME_IS_INHERITED_FROM_BASE_TYPE)
  private Boolean isInheritedFromBaseType;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_IS_REQUIRED_BY_ADMIN = "isRequiredByAdmin";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED_BY_ADMIN)
  private Boolean isRequiredByAdmin;

  public static final String SERIALIZED_NAME_IS_HIDDEN_PROPERTY = "isHiddenProperty";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN_PROPERTY)
  private Boolean isHiddenProperty;

  public static final String SERIALIZED_NAME_IS_ADMIN_ONLY_PROPERTY = "isAdminOnlyProperty";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN_ONLY_PROPERTY)
  private Boolean isAdminOnlyProperty;

  public static final String SERIALIZED_NAME_IS_PRODUCT_DETAILS_ONLY_PROPERTY = "isProductDetailsOnlyProperty";
  @SerializedName(SERIALIZED_NAME_IS_PRODUCT_DETAILS_ONLY_PROPERTY)
  private Boolean isProductDetailsOnlyProperty;

  public static final String SERIALIZED_NAME_IS_MULTI_VALUE_PROPERTY = "isMultiValueProperty";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_VALUE_PROPERTY)
  private Boolean isMultiValueProperty;

  public static final String SERIALIZED_NAME_DISPLAY_INFO = "displayInfo";
  @SerializedName(SERIALIZED_NAME_DISPLAY_INFO)
  private AttributeInProductTypeDisplayInfo displayInfo;

  public static final String SERIALIZED_NAME_VOCABULARY_VALUES = "vocabularyValues";
  @SerializedName(SERIALIZED_NAME_VOCABULARY_VALUES)
  private List<AttributeVocabularyValueInProductType> vocabularyValues = null;

  public static final String SERIALIZED_NAME_ATTRIBUTE_DETAIL = "attributeDetail";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DETAIL)
  private CatalogAdminsAttribute attributeDetail;

  public AttributeInProductType() {
  }

  public AttributeInProductType attributeFQN(String attributeFQN) {
    
    this.attributeFQN = attributeFQN;
    return this;
  }

   /**
   * Unique identifier of the Attribute. Must be an attribute fully qualilfied name that already exists. If no namespace is specified Tenant is assumed
   * @return attributeFQN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the Attribute. Must be an attribute fully qualilfied name that already exists. If no namespace is specified Tenant is assumed")

  public String getAttributeFQN() {
    return attributeFQN;
  }


  public void setAttributeFQN(String attributeFQN) {
    this.attributeFQN = attributeFQN;
  }


  public AttributeInProductType isInheritedFromBaseType(Boolean isInheritedFromBaseType) {
    
    this.isInheritedFromBaseType = isInheritedFromBaseType;
    return this;
  }

   /**
   * If True, the attribute is part of the base product type and can only have order modified.
   * @return isInheritedFromBaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True, the attribute is part of the base product type and can only have order modified.")

  public Boolean getIsInheritedFromBaseType() {
    return isInheritedFromBaseType;
  }


  public void setIsInheritedFromBaseType(Boolean isInheritedFromBaseType) {
    this.isInheritedFromBaseType = isInheritedFromBaseType;
  }


  public AttributeInProductType order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Used to order the display of the attributes within a section
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to order the display of the attributes within a section")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public AttributeInProductType isRequiredByAdmin(Boolean isRequiredByAdmin) {
    
    this.isRequiredByAdmin = isRequiredByAdmin;
    return this;
  }

   /**
   * If True, the admin must include this attribute in products of this productType
   * @return isRequiredByAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True, the admin must include this attribute in products of this productType")

  public Boolean getIsRequiredByAdmin() {
    return isRequiredByAdmin;
  }


  public void setIsRequiredByAdmin(Boolean isRequiredByAdmin) {
    this.isRequiredByAdmin = isRequiredByAdmin;
  }


  public AttributeInProductType isHiddenProperty(Boolean isHiddenProperty) {
    
    this.isHiddenProperty = isHiddenProperty;
    return this;
  }

   /**
   * If True, the property is hidden in the storefront. This field only applies to properties.
   * @return isHiddenProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True, the property is hidden in the storefront. This field only applies to properties.")

  public Boolean getIsHiddenProperty() {
    return isHiddenProperty;
  }


  public void setIsHiddenProperty(Boolean isHiddenProperty) {
    this.isHiddenProperty = isHiddenProperty;
  }


  public AttributeInProductType isAdminOnlyProperty(Boolean isAdminOnlyProperty) {
    
    this.isAdminOnlyProperty = isAdminOnlyProperty;
    return this;
  }

   /**
   * If true, this property is not available on the storefront. If false, this property will be available on storefront. The IsHiddenProperty hides the property from the customer, but is still available from the API.
   * @return isAdminOnlyProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this property is not available on the storefront. If false, this property will be available on storefront. The IsHiddenProperty hides the property from the customer, but is still available from the API.")

  public Boolean getIsAdminOnlyProperty() {
    return isAdminOnlyProperty;
  }


  public void setIsAdminOnlyProperty(Boolean isAdminOnlyProperty) {
    this.isAdminOnlyProperty = isAdminOnlyProperty;
  }


  public AttributeInProductType isProductDetailsOnlyProperty(Boolean isProductDetailsOnlyProperty) {
    
    this.isProductDetailsOnlyProperty = isProductDetailsOnlyProperty;
    return this;
  }

   /**
   * If True this property will not be returned  storefront product listings (Search,GetProduct) it will still be returned on GetProduct, ValidateProduct...)
   * @return isProductDetailsOnlyProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True this property will not be returned  storefront product listings (Search,GetProduct) it will still be returned on GetProduct, ValidateProduct...)")

  public Boolean getIsProductDetailsOnlyProperty() {
    return isProductDetailsOnlyProperty;
  }


  public void setIsProductDetailsOnlyProperty(Boolean isProductDetailsOnlyProperty) {
    this.isProductDetailsOnlyProperty = isProductDetailsOnlyProperty;
  }


  public AttributeInProductType isMultiValueProperty(Boolean isMultiValueProperty) {
    
    this.isMultiValueProperty = isMultiValueProperty;
    return this;
  }

   /**
   * If True, the property can have multiple values selected on the product. Only applies to PredefinedVocabulary properties.
   * @return isMultiValueProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If True, the property can have multiple values selected on the product. Only applies to PredefinedVocabulary properties.")

  public Boolean getIsMultiValueProperty() {
    return isMultiValueProperty;
  }


  public void setIsMultiValueProperty(Boolean isMultiValueProperty) {
    this.isMultiValueProperty = isMultiValueProperty;
  }


  public AttributeInProductType displayInfo(AttributeInProductTypeDisplayInfo displayInfo) {
    
    this.displayInfo = displayInfo;
    return this;
  }

   /**
   * Get displayInfo
   * @return displayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributeInProductTypeDisplayInfo getDisplayInfo() {
    return displayInfo;
  }


  public void setDisplayInfo(AttributeInProductTypeDisplayInfo displayInfo) {
    this.displayInfo = displayInfo;
  }


  public AttributeInProductType vocabularyValues(List<AttributeVocabularyValueInProductType> vocabularyValues) {
    
    this.vocabularyValues = vocabularyValues;
    return this;
  }

  public AttributeInProductType addVocabularyValuesItem(AttributeVocabularyValueInProductType vocabularyValuesItem) {
    if (this.vocabularyValues == null) {
      this.vocabularyValues = new ArrayList<>();
    }
    this.vocabularyValues.add(vocabularyValuesItem);
    return this;
  }

   /**
   * The collection of vocabulary values included in this product type.
   * @return vocabularyValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The collection of vocabulary values included in this product type.")

  public List<AttributeVocabularyValueInProductType> getVocabularyValues() {
    return vocabularyValues;
  }


  public void setVocabularyValues(List<AttributeVocabularyValueInProductType> vocabularyValues) {
    this.vocabularyValues = vocabularyValues;
  }


  public AttributeInProductType attributeDetail(CatalogAdminsAttribute attributeDetail) {
    
    this.attributeDetail = attributeDetail;
    return this;
  }

   /**
   * Get attributeDetail
   * @return attributeDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsAttribute getAttributeDetail() {
    return attributeDetail;
  }


  public void setAttributeDetail(CatalogAdminsAttribute attributeDetail) {
    this.attributeDetail = attributeDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeInProductType attributeInProductType = (AttributeInProductType) o;
    return Objects.equals(this.attributeFQN, attributeInProductType.attributeFQN) &&
        Objects.equals(this.isInheritedFromBaseType, attributeInProductType.isInheritedFromBaseType) &&
        Objects.equals(this.order, attributeInProductType.order) &&
        Objects.equals(this.isRequiredByAdmin, attributeInProductType.isRequiredByAdmin) &&
        Objects.equals(this.isHiddenProperty, attributeInProductType.isHiddenProperty) &&
        Objects.equals(this.isAdminOnlyProperty, attributeInProductType.isAdminOnlyProperty) &&
        Objects.equals(this.isProductDetailsOnlyProperty, attributeInProductType.isProductDetailsOnlyProperty) &&
        Objects.equals(this.isMultiValueProperty, attributeInProductType.isMultiValueProperty) &&
        Objects.equals(this.displayInfo, attributeInProductType.displayInfo) &&
        Objects.equals(this.vocabularyValues, attributeInProductType.vocabularyValues) &&
        Objects.equals(this.attributeDetail, attributeInProductType.attributeDetail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeFQN, isInheritedFromBaseType, order, isRequiredByAdmin, isHiddenProperty, isAdminOnlyProperty, isProductDetailsOnlyProperty, isMultiValueProperty, displayInfo, vocabularyValues, attributeDetail);
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
    sb.append("class AttributeInProductType {\n");
    sb.append("    attributeFQN: ").append(toIndentedString(attributeFQN)).append("\n");
    sb.append("    isInheritedFromBaseType: ").append(toIndentedString(isInheritedFromBaseType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    isRequiredByAdmin: ").append(toIndentedString(isRequiredByAdmin)).append("\n");
    sb.append("    isHiddenProperty: ").append(toIndentedString(isHiddenProperty)).append("\n");
    sb.append("    isAdminOnlyProperty: ").append(toIndentedString(isAdminOnlyProperty)).append("\n");
    sb.append("    isProductDetailsOnlyProperty: ").append(toIndentedString(isProductDetailsOnlyProperty)).append("\n");
    sb.append("    isMultiValueProperty: ").append(toIndentedString(isMultiValueProperty)).append("\n");
    sb.append("    displayInfo: ").append(toIndentedString(displayInfo)).append("\n");
    sb.append("    vocabularyValues: ").append(toIndentedString(vocabularyValues)).append("\n");
    sb.append("    attributeDetail: ").append(toIndentedString(attributeDetail)).append("\n");
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
    openapiFields.add("attributeFQN");
    openapiFields.add("isInheritedFromBaseType");
    openapiFields.add("order");
    openapiFields.add("isRequiredByAdmin");
    openapiFields.add("isHiddenProperty");
    openapiFields.add("isAdminOnlyProperty");
    openapiFields.add("isProductDetailsOnlyProperty");
    openapiFields.add("isMultiValueProperty");
    openapiFields.add("displayInfo");
    openapiFields.add("vocabularyValues");
    openapiFields.add("attributeDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttributeInProductType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AttributeInProductType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttributeInProductType is not found in the empty JSON string", AttributeInProductType.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AttributeInProductType.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttributeInProductType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("attributeFQN") != null && !jsonObj.get("attributeFQN").isJsonNull()) && !jsonObj.get("attributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeFQN").toString()));
      }
      // validate the optional field `displayInfo`
      if (jsonObj.get("displayInfo") != null && !jsonObj.get("displayInfo").isJsonNull()) {
        AttributeInProductTypeDisplayInfo.validateJsonObject(jsonObj.getAsJsonObject("displayInfo"));
      }
      if (jsonObj.get("vocabularyValues") != null && !jsonObj.get("vocabularyValues").isJsonNull()) {
        JsonArray jsonArrayvocabularyValues = jsonObj.getAsJsonArray("vocabularyValues");
        if (jsonArrayvocabularyValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vocabularyValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vocabularyValues` to be an array in the JSON string but got `%s`", jsonObj.get("vocabularyValues").toString()));
          }

          // validate the optional field `vocabularyValues` (array)
          for (int i = 0; i < jsonArrayvocabularyValues.size(); i++) {
            AttributeVocabularyValueInProductType.validateJsonObject(jsonArrayvocabularyValues.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `attributeDetail`
      if (jsonObj.get("attributeDetail") != null && !jsonObj.get("attributeDetail").isJsonNull()) {
        CatalogAdminsAttribute.validateJsonObject(jsonObj.getAsJsonObject("attributeDetail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttributeInProductType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttributeInProductType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttributeInProductType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttributeInProductType.class));

       return (TypeAdapter<T>) new TypeAdapter<AttributeInProductType>() {
           @Override
           public void write(JsonWriter out, AttributeInProductType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttributeInProductType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttributeInProductType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttributeInProductType
  * @throws IOException if the JSON string is invalid with respect to AttributeInProductType
  */
  public static AttributeInProductType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttributeInProductType.class);
  }

 /**
  * Convert an instance of AttributeInProductType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

