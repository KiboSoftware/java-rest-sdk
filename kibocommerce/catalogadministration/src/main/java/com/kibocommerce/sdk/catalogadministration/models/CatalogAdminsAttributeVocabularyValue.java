/*
 * Kibo Catalog Admin Services
 * <div id=\"overview_CATALOG_ADMIN\">             <h2>CATALOG ADMINISTRATION</h2>             <p>The Catalog Administration APIs are a collection of resources for configuring the catalogs and products offered to your shoppers, including                 discounts and coupon sets, faceting, price lists, and different types or variations of products. See the                 <a href=\"/concept-guides/catalog\">Catalog user guides</a>                 for information about the related features in the Unified Commerce Admin.</p>             <p>Use the <strong>Attributes</strong> resource to manage localization and attribute configurations for your catalogs. This current version of the Attributes API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access attribute data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Categories</strong> resource to organize products and control where they appear on the storefront. Create                 and maintain a hierarchy of categories and subcategories where the site will store properties. This current version of the Categories API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access category data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Coupon Sets</strong> resource to view and create coupon sets. You can use coupon sets to group multiple                 coupon codes together and associate them with one or more discounts.</p>             <p>Use the <strong>Currency</strong> resource to manage the currency localization rules and exchange rates for any of the                 currencies that are supported for placing orders in.</p>             <p>Use the <strong>Discounts</strong> and <strong>Discount Settings</strong> resources to define and manage discounts to apply to products, product categories, or                 orders. This current version of the Discounts API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access discount data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Facets</strong> resource to manage the facets shoppers use to filter product display results on a                 storefront. Facets can include categories, product attributes, or prices, and use either a range of                 values or discrete values.</p>             <p>Use the <strong>Master Catalog</strong> resource to view details of the master catalogs associated with a tenant and to                 manage the product publishing mode for each master catalog.</p>             <p>Use the <strong>Price Lists</strong> resources to view and create price lists. You can use price lists to override the                 catalog pricing of products for specific customer segments and/or sites.</p>             <p>Use the <strong>Products</strong>, <strong>Product Types/Extras/Options/Properties</strong>, and <strong>Product Sort Definitions</strong> resources to create new product definitions in the master catalog and determine which                 catalogs will feature products. This current version of the Products API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access product data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\".</p>             <p>Use the <strong>Publishing</strong> resource to publish pending product updates together as part of a set.</p>             <p>Use the <strong>Search</strong> resource to manage all settings and options for providing product search on your site, as                 well as search tuning rules.</p>         </div>
 *
 * The version of the OpenAPI document: v1
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
import com.kibocommerce.sdk.catalogadministration.models.AttributeVocabularyValueLocalizedContent;
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
 * Value of an attribute
 */
@ApiModel(description = "Value of an attribute")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsAttributeVocabularyValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private AttributeVocabularyValueLocalizedContent content;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "displayOrder";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Integer displayOrder;

  public static final String SERIALIZED_NAME_LOCALIZED_CONTENT = "localizedContent";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_CONTENT)
  private List<AttributeVocabularyValueLocalizedContent> localizedContent = null;

  public static final String SERIALIZED_NAME_MAPPED_GENERIC_VALUES = "mappedGenericValues";
  @SerializedName(SERIALIZED_NAME_MAPPED_GENERIC_VALUES)
  private List<Object> mappedGenericValues = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_VALUE_SEQUENCE = "valueSequence";
  @SerializedName(SERIALIZED_NAME_VALUE_SEQUENCE)
  private Integer valueSequence;

  public CatalogAdminsAttributeVocabularyValue() {
  }

  public CatalogAdminsAttributeVocabularyValue content(AttributeVocabularyValueLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttributeVocabularyValueLocalizedContent getContent() {
    return content;
  }


  public void setContent(AttributeVocabularyValueLocalizedContent content) {
    this.content = content;
  }


  public CatalogAdminsAttributeVocabularyValue displayOrder(Integer displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * The order in which the attribute value displays. If you omit a value for this property, Mozu infers the display order from the attribute value&#39;s position the list.
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order in which the attribute value displays. If you omit a value for this property, Mozu infers the display order from the attribute value's position the list.")

  public Integer getDisplayOrder() {
    return displayOrder;
  }


  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  public CatalogAdminsAttributeVocabularyValue localizedContent(List<AttributeVocabularyValueLocalizedContent> localizedContent) {
    
    this.localizedContent = localizedContent;
    return this;
  }

  public CatalogAdminsAttributeVocabularyValue addLocalizedContentItem(AttributeVocabularyValueLocalizedContent localizedContentItem) {
    if (this.localizedContent == null) {
      this.localizedContent = new ArrayList<>();
    }
    this.localizedContent.add(localizedContentItem);
    return this;
  }

   /**
   * The Content of an attribute value. This content is in multiple locals supported by the master catalog and is only valid for String DataType.
   * @return localizedContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Content of an attribute value. This content is in multiple locals supported by the master catalog and is only valid for String DataType.")

  public List<AttributeVocabularyValueLocalizedContent> getLocalizedContent() {
    return localizedContent;
  }


  public void setLocalizedContent(List<AttributeVocabularyValueLocalizedContent> localizedContent) {
    this.localizedContent = localizedContent;
  }


  public CatalogAdminsAttributeVocabularyValue mappedGenericValues(List<Object> mappedGenericValues) {
    
    this.mappedGenericValues = mappedGenericValues;
    return this;
  }

  public CatalogAdminsAttributeVocabularyValue addMappedGenericValuesItem(Object mappedGenericValuesItem) {
    if (this.mappedGenericValues == null) {
      this.mappedGenericValues = new ArrayList<>();
    }
    this.mappedGenericValues.add(mappedGenericValuesItem);
    return this;
  }

   /**
   * The actual values of the related generic attribute. This value must match the datatype of the attribute and already exist  within the Vocabulary values of the related ValueMappingAttribute. Only supporting string at this time.
   * @return mappedGenericValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual values of the related generic attribute. This value must match the datatype of the attribute and already exist  within the Vocabulary values of the related ValueMappingAttribute. Only supporting string at this time.")

  public List<Object> getMappedGenericValues() {
    return mappedGenericValues;
  }


  public void setMappedGenericValues(List<Object> mappedGenericValues) {
    this.mappedGenericValues = mappedGenericValues;
  }


  public CatalogAdminsAttributeVocabularyValue productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * The ProductName when the Attribute DataType is ProductCode.
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ProductName when the Attribute DataType is ProductCode.")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public CatalogAdminsAttributeVocabularyValue value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The actual value of the attribute vocabulary. This value must be unique within the vocabulary for a single attribute and match the datatype of the attribute.  String data type requires a canonical value here or one will be system generated if null. The actual string content displayed to users should be stored as Content.  String values require content to be present. Once this value is set it cannot be changed.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual value of the attribute vocabulary. This value must be unique within the vocabulary for a single attribute and match the datatype of the attribute.  String data type requires a canonical value here or one will be system generated if null. The actual string content displayed to users should be stored as Content.  String values require content to be present. Once this value is set it cannot be changed.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public CatalogAdminsAttributeVocabularyValue valueSequence(Integer valueSequence) {
    
    this.valueSequence = valueSequence;
    return this;
  }

   /**
   * Read only System generated monotonically increasing unique sequence.
   * @return valueSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only System generated monotonically increasing unique sequence.")

  public Integer getValueSequence() {
    return valueSequence;
  }


  public void setValueSequence(Integer valueSequence) {
    this.valueSequence = valueSequence;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsAttributeVocabularyValue catalogAdminsAttributeVocabularyValue = (CatalogAdminsAttributeVocabularyValue) o;
    return Objects.equals(this.content, catalogAdminsAttributeVocabularyValue.content) &&
        Objects.equals(this.displayOrder, catalogAdminsAttributeVocabularyValue.displayOrder) &&
        Objects.equals(this.localizedContent, catalogAdminsAttributeVocabularyValue.localizedContent) &&
        Objects.equals(this.mappedGenericValues, catalogAdminsAttributeVocabularyValue.mappedGenericValues) &&
        Objects.equals(this.productName, catalogAdminsAttributeVocabularyValue.productName) &&
        Objects.equals(this.value, catalogAdminsAttributeVocabularyValue.value) &&
        Objects.equals(this.valueSequence, catalogAdminsAttributeVocabularyValue.valueSequence);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, displayOrder, localizedContent, mappedGenericValues, productName, value, valueSequence);
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
    sb.append("class CatalogAdminsAttributeVocabularyValue {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    localizedContent: ").append(toIndentedString(localizedContent)).append("\n");
    sb.append("    mappedGenericValues: ").append(toIndentedString(mappedGenericValues)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueSequence: ").append(toIndentedString(valueSequence)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("displayOrder");
    openapiFields.add("localizedContent");
    openapiFields.add("mappedGenericValues");
    openapiFields.add("productName");
    openapiFields.add("value");
    openapiFields.add("valueSequence");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsAttributeVocabularyValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsAttributeVocabularyValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsAttributeVocabularyValue is not found in the empty JSON string", CatalogAdminsAttributeVocabularyValue.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsAttributeVocabularyValue.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsAttributeVocabularyValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        AttributeVocabularyValueLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      if (jsonObj.get("localizedContent") != null && !jsonObj.get("localizedContent").isJsonNull()) {
        JsonArray jsonArraylocalizedContent = jsonObj.getAsJsonArray("localizedContent");
        if (jsonArraylocalizedContent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("localizedContent").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `localizedContent` to be an array in the JSON string but got `%s`", jsonObj.get("localizedContent").toString()));
          }

          // validate the optional field `localizedContent` (array)
          for (int i = 0; i < jsonArraylocalizedContent.size(); i++) {
            AttributeVocabularyValueLocalizedContent.validateJsonObject(jsonArraylocalizedContent.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("mappedGenericValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mappedGenericValues` to be an array in the JSON string but got `%s`", jsonObj.get("mappedGenericValues").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsAttributeVocabularyValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsAttributeVocabularyValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsAttributeVocabularyValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsAttributeVocabularyValue.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsAttributeVocabularyValue>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsAttributeVocabularyValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsAttributeVocabularyValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsAttributeVocabularyValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsAttributeVocabularyValue
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsAttributeVocabularyValue
  */
  public static CatalogAdminsAttributeVocabularyValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsAttributeVocabularyValue.class);
  }

 /**
  * Convert an instance of CatalogAdminsAttributeVocabularyValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

