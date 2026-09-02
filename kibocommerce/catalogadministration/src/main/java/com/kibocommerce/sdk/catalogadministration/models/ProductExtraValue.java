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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsAttributeVocabularyValue;
import com.kibocommerce.sdk.catalogadministration.models.ProductExtraValueDeltaPrice;
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
 * A value of a product option for this product. For example, a computer product may have an option called \&quot;Memory\&quot; that can have the values \&quot;6GB,\&quot;8GB,\&quot; and \&quot;12GB.\&quot;
 */
@ApiModel(description = "A value of a product option for this product. For example, a computer product may have an option called \"Memory\" that can have the values \"6GB,\"8GB,\" and \"12GB.\"")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductExtraValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTE_VOCABULARY_VALUE_DETAIL = "attributeVocabularyValueDetail";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_VOCABULARY_VALUE_DETAIL)
  private CatalogAdminsAttributeVocabularyValue attributeVocabularyValueDetail;

  public static final String SERIALIZED_NAME_DELTA_PRICE = "deltaPrice";
  @SerializedName(SERIALIZED_NAME_DELTA_PRICE)
  private ProductExtraValueDeltaPrice deltaPrice;

  public static final String SERIALIZED_NAME_DELTA_WEIGHT = "deltaWeight";
  @SerializedName(SERIALIZED_NAME_DELTA_WEIGHT)
  private Double deltaWeight;

  public static final String SERIALIZED_NAME_IS_DEFAULTED = "isDefaulted";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULTED)
  private Boolean isDefaulted;

  public static final String SERIALIZED_NAME_LOCALIZED_DELTA_PRICE = "localizedDeltaPrice";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_DELTA_PRICE)
  private List<ProductExtraValueDeltaPrice> localizedDeltaPrice = null;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public ProductExtraValue() {
  }

  public ProductExtraValue attributeVocabularyValueDetail(CatalogAdminsAttributeVocabularyValue attributeVocabularyValueDetail) {
    
    this.attributeVocabularyValueDetail = attributeVocabularyValueDetail;
    return this;
  }

   /**
   * Get attributeVocabularyValueDetail
   * @return attributeVocabularyValueDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsAttributeVocabularyValue getAttributeVocabularyValueDetail() {
    return attributeVocabularyValueDetail;
  }


  public void setAttributeVocabularyValueDetail(CatalogAdminsAttributeVocabularyValue attributeVocabularyValueDetail) {
    this.attributeVocabularyValueDetail = attributeVocabularyValueDetail;
  }


  public ProductExtraValue deltaPrice(ProductExtraValueDeltaPrice deltaPrice) {
    
    this.deltaPrice = deltaPrice;
    return this;
  }

   /**
   * Get deltaPrice
   * @return deltaPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductExtraValueDeltaPrice getDeltaPrice() {
    return deltaPrice;
  }


  public void setDeltaPrice(ProductExtraValueDeltaPrice deltaPrice) {
    this.deltaPrice = deltaPrice;
  }


  public ProductExtraValue deltaWeight(Double deltaWeight) {
    
    this.deltaWeight = deltaWeight;
    return this;
  }

   /**
   * Get deltaWeight
   * @return deltaWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDeltaWeight() {
    return deltaWeight;
  }


  public void setDeltaWeight(Double deltaWeight) {
    this.deltaWeight = deltaWeight;
  }


  public ProductExtraValue isDefaulted(Boolean isDefaulted) {
    
    this.isDefaulted = isDefaulted;
    return this;
  }

   /**
   * Get isDefaulted
   * @return isDefaulted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDefaulted() {
    return isDefaulted;
  }


  public void setIsDefaulted(Boolean isDefaulted) {
    this.isDefaulted = isDefaulted;
  }


  public ProductExtraValue localizedDeltaPrice(List<ProductExtraValueDeltaPrice> localizedDeltaPrice) {
    
    this.localizedDeltaPrice = localizedDeltaPrice;
    return this;
  }

  public ProductExtraValue addLocalizedDeltaPriceItem(ProductExtraValueDeltaPrice localizedDeltaPriceItem) {
    if (this.localizedDeltaPrice == null) {
      this.localizedDeltaPrice = new ArrayList<>();
    }
    this.localizedDeltaPrice.add(localizedDeltaPriceItem);
    return this;
  }

   /**
   * Get localizedDeltaPrice
   * @return localizedDeltaPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProductExtraValueDeltaPrice> getLocalizedDeltaPrice() {
    return localizedDeltaPrice;
  }


  public void setLocalizedDeltaPrice(List<ProductExtraValueDeltaPrice> localizedDeltaPrice) {
    this.localizedDeltaPrice = localizedDeltaPrice;
  }


  public ProductExtraValue quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public ProductExtraValue value(Object value) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductExtraValue productExtraValue = (ProductExtraValue) o;
    return Objects.equals(this.attributeVocabularyValueDetail, productExtraValue.attributeVocabularyValueDetail) &&
        Objects.equals(this.deltaPrice, productExtraValue.deltaPrice) &&
        Objects.equals(this.deltaWeight, productExtraValue.deltaWeight) &&
        Objects.equals(this.isDefaulted, productExtraValue.isDefaulted) &&
        Objects.equals(this.localizedDeltaPrice, productExtraValue.localizedDeltaPrice) &&
        Objects.equals(this.quantity, productExtraValue.quantity) &&
        Objects.equals(this.value, productExtraValue.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeVocabularyValueDetail, deltaPrice, deltaWeight, isDefaulted, localizedDeltaPrice, quantity, value);
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
    sb.append("class ProductExtraValue {\n");
    sb.append("    attributeVocabularyValueDetail: ").append(toIndentedString(attributeVocabularyValueDetail)).append("\n");
    sb.append("    deltaPrice: ").append(toIndentedString(deltaPrice)).append("\n");
    sb.append("    deltaWeight: ").append(toIndentedString(deltaWeight)).append("\n");
    sb.append("    isDefaulted: ").append(toIndentedString(isDefaulted)).append("\n");
    sb.append("    localizedDeltaPrice: ").append(toIndentedString(localizedDeltaPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("attributeVocabularyValueDetail");
    openapiFields.add("deltaPrice");
    openapiFields.add("deltaWeight");
    openapiFields.add("isDefaulted");
    openapiFields.add("localizedDeltaPrice");
    openapiFields.add("quantity");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductExtraValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductExtraValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductExtraValue is not found in the empty JSON string", ProductExtraValue.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductExtraValue.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductExtraValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `attributeVocabularyValueDetail`
      if (jsonObj.get("attributeVocabularyValueDetail") != null && !jsonObj.get("attributeVocabularyValueDetail").isJsonNull()) {
        CatalogAdminsAttributeVocabularyValue.validateJsonObject(jsonObj.getAsJsonObject("attributeVocabularyValueDetail"));
      }
      // validate the optional field `deltaPrice`
      if (jsonObj.get("deltaPrice") != null && !jsonObj.get("deltaPrice").isJsonNull()) {
        ProductExtraValueDeltaPrice.validateJsonObject(jsonObj.getAsJsonObject("deltaPrice"));
      }
      if (jsonObj.get("localizedDeltaPrice") != null && !jsonObj.get("localizedDeltaPrice").isJsonNull()) {
        JsonArray jsonArraylocalizedDeltaPrice = jsonObj.getAsJsonArray("localizedDeltaPrice");
        if (jsonArraylocalizedDeltaPrice != null) {
          // ensure the json data is an array
          if (!jsonObj.get("localizedDeltaPrice").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `localizedDeltaPrice` to be an array in the JSON string but got `%s`", jsonObj.get("localizedDeltaPrice").toString()));
          }

          // validate the optional field `localizedDeltaPrice` (array)
          for (int i = 0; i < jsonArraylocalizedDeltaPrice.size(); i++) {
            ProductExtraValueDeltaPrice.validateJsonObject(jsonArraylocalizedDeltaPrice.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductExtraValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductExtraValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductExtraValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductExtraValue.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductExtraValue>() {
           @Override
           public void write(JsonWriter out, ProductExtraValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductExtraValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductExtraValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductExtraValue
  * @throws IOException if the JSON string is invalid with respect to ProductExtraValue
  */
  public static ProductExtraValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductExtraValue.class);
  }

 /**
  * Convert an instance of ProductExtraValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

