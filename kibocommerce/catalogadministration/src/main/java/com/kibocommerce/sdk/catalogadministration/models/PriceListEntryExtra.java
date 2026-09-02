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
 * Extra for an entry on a price list
 */
@ApiModel(description = "Extra for an entry on a price list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PriceListEntryExtra implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTE_CODE = "attributeCode";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_CODE)
  private String attributeCode;

  public static final String SERIALIZED_NAME_ATTRIBUTE_F_Q_N = "attributeFQN";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_F_Q_N)
  private String attributeFQN;

  public static final String SERIALIZED_NAME_DISPLAY_VALUE = "displayValue";
  @SerializedName(SERIALIZED_NAME_DISPLAY_VALUE)
  private String displayValue;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public PriceListEntryExtra() {
  }

  public PriceListEntryExtra attributeCode(String attributeCode) {
    
    this.attributeCode = attributeCode;
    return this;
  }

   /**
   * AttributeCode. ReadOnly
   * @return attributeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AttributeCode. ReadOnly")

  public String getAttributeCode() {
    return attributeCode;
  }


  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }


  public PriceListEntryExtra attributeFQN(String attributeFQN) {
    
    this.attributeFQN = attributeFQN;
    return this;
  }

   /**
   * AttributeFQN of the extra ReadOnly
   * @return attributeFQN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "AttributeFQN of the extra ReadOnly")

  public String getAttributeFQN() {
    return attributeFQN;
  }


  public void setAttributeFQN(String attributeFQN) {
    this.attributeFQN = attributeFQN;
  }


  public PriceListEntryExtra displayValue(String displayValue) {
    
    this.displayValue = displayValue;
    return this;
  }

   /**
   * Value to display.  Currently only vaild when Value is a string type. ReadOnly
   * @return displayValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value to display.  Currently only vaild when Value is a string type. ReadOnly")

  public String getDisplayValue() {
    return displayValue;
  }


  public void setDisplayValue(String displayValue) {
    this.displayValue = displayValue;
  }


  public PriceListEntryExtra price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * PriceList price for the extra
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PriceList price for the extra")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public PriceListEntryExtra value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value stored with the extra ReadOnly
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value stored with the extra ReadOnly")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceListEntryExtra priceListEntryExtra = (PriceListEntryExtra) o;
    return Objects.equals(this.attributeCode, priceListEntryExtra.attributeCode) &&
        Objects.equals(this.attributeFQN, priceListEntryExtra.attributeFQN) &&
        Objects.equals(this.displayValue, priceListEntryExtra.displayValue) &&
        Objects.equals(this.price, priceListEntryExtra.price) &&
        Objects.equals(this.value, priceListEntryExtra.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeCode, attributeFQN, displayValue, price, value);
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
    sb.append("class PriceListEntryExtra {\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
    sb.append("    attributeFQN: ").append(toIndentedString(attributeFQN)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("attributeCode");
    openapiFields.add("attributeFQN");
    openapiFields.add("displayValue");
    openapiFields.add("price");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attributeFQN");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PriceListEntryExtra
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PriceListEntryExtra.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceListEntryExtra is not found in the empty JSON string", PriceListEntryExtra.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PriceListEntryExtra.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceListEntryExtra` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PriceListEntryExtra.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("attributeCode") != null && !jsonObj.get("attributeCode").isJsonNull()) && !jsonObj.get("attributeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeCode").toString()));
      }
      if (!jsonObj.get("attributeFQN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeFQN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeFQN").toString()));
      }
      if ((jsonObj.get("displayValue") != null && !jsonObj.get("displayValue").isJsonNull()) && !jsonObj.get("displayValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceListEntryExtra.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceListEntryExtra' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceListEntryExtra> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceListEntryExtra.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceListEntryExtra>() {
           @Override
           public void write(JsonWriter out, PriceListEntryExtra value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceListEntryExtra read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceListEntryExtra given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceListEntryExtra
  * @throws IOException if the JSON string is invalid with respect to PriceListEntryExtra
  */
  public static PriceListEntryExtra fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceListEntryExtra.class);
  }

 /**
  * Convert an instance of PriceListEntryExtra to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

