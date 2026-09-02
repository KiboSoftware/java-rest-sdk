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
 * PriceListEntryPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PriceListEntryPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LIST_PRICE = "listPrice";
  @SerializedName(SERIALIZED_NAME_LIST_PRICE)
  private Double listPrice;

  public static final String SERIALIZED_NAME_LIST_PRICE_MODE = "listPriceMode";
  @SerializedName(SERIALIZED_NAME_LIST_PRICE_MODE)
  private String listPriceMode;

  public static final String SERIALIZED_NAME_MIN_QTY = "minQty";
  @SerializedName(SERIALIZED_NAME_MIN_QTY)
  private Integer minQty;

  public static final String SERIALIZED_NAME_SALE_PRICE = "salePrice";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE)
  private Double salePrice;

  public static final String SERIALIZED_NAME_SALE_PRICE_MODE = "salePriceMode";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE_MODE)
  private String salePriceMode;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PRICE = "subscriptionPrice";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PRICE)
  private Double subscriptionPrice;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PRICE_MODE = "subscriptionPriceMode";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PRICE_MODE)
  private String subscriptionPriceMode;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SALE_PRICE = "subscriptionSalePrice";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SALE_PRICE)
  private Double subscriptionSalePrice;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SALE_PRICE_MODE = "subscriptionSalePriceMode";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SALE_PRICE_MODE)
  private String subscriptionSalePriceMode;

  public PriceListEntryPrice() {
  }

  public PriceListEntryPrice listPrice(Double listPrice) {
    
    this.listPrice = listPrice;
    return this;
  }

   /**
   * Get listPrice
   * @return listPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getListPrice() {
    return listPrice;
  }


  public void setListPrice(Double listPrice) {
    this.listPrice = listPrice;
  }


  public PriceListEntryPrice listPriceMode(String listPriceMode) {
    
    this.listPriceMode = listPriceMode;
    return this;
  }

   /**
   * Get listPriceMode
   * @return listPriceMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListPriceMode() {
    return listPriceMode;
  }


  public void setListPriceMode(String listPriceMode) {
    this.listPriceMode = listPriceMode;
  }


  public PriceListEntryPrice minQty(Integer minQty) {
    
    this.minQty = minQty;
    return this;
  }

   /**
   * Get minQty
   * @return minQty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinQty() {
    return minQty;
  }


  public void setMinQty(Integer minQty) {
    this.minQty = minQty;
  }


  public PriceListEntryPrice salePrice(Double salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Get salePrice
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSalePrice() {
    return salePrice;
  }


  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }


  public PriceListEntryPrice salePriceMode(String salePriceMode) {
    
    this.salePriceMode = salePriceMode;
    return this;
  }

   /**
   * Get salePriceMode
   * @return salePriceMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSalePriceMode() {
    return salePriceMode;
  }


  public void setSalePriceMode(String salePriceMode) {
    this.salePriceMode = salePriceMode;
  }


  public PriceListEntryPrice subscriptionPrice(Double subscriptionPrice) {
    
    this.subscriptionPrice = subscriptionPrice;
    return this;
  }

   /**
   * Get subscriptionPrice
   * @return subscriptionPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSubscriptionPrice() {
    return subscriptionPrice;
  }


  public void setSubscriptionPrice(Double subscriptionPrice) {
    this.subscriptionPrice = subscriptionPrice;
  }


  public PriceListEntryPrice subscriptionPriceMode(String subscriptionPriceMode) {
    
    this.subscriptionPriceMode = subscriptionPriceMode;
    return this;
  }

   /**
   * Get subscriptionPriceMode
   * @return subscriptionPriceMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriptionPriceMode() {
    return subscriptionPriceMode;
  }


  public void setSubscriptionPriceMode(String subscriptionPriceMode) {
    this.subscriptionPriceMode = subscriptionPriceMode;
  }


  public PriceListEntryPrice subscriptionSalePrice(Double subscriptionSalePrice) {
    
    this.subscriptionSalePrice = subscriptionSalePrice;
    return this;
  }

   /**
   * Get subscriptionSalePrice
   * @return subscriptionSalePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSubscriptionSalePrice() {
    return subscriptionSalePrice;
  }


  public void setSubscriptionSalePrice(Double subscriptionSalePrice) {
    this.subscriptionSalePrice = subscriptionSalePrice;
  }


  public PriceListEntryPrice subscriptionSalePriceMode(String subscriptionSalePriceMode) {
    
    this.subscriptionSalePriceMode = subscriptionSalePriceMode;
    return this;
  }

   /**
   * Get subscriptionSalePriceMode
   * @return subscriptionSalePriceMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriptionSalePriceMode() {
    return subscriptionSalePriceMode;
  }


  public void setSubscriptionSalePriceMode(String subscriptionSalePriceMode) {
    this.subscriptionSalePriceMode = subscriptionSalePriceMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceListEntryPrice priceListEntryPrice = (PriceListEntryPrice) o;
    return Objects.equals(this.listPrice, priceListEntryPrice.listPrice) &&
        Objects.equals(this.listPriceMode, priceListEntryPrice.listPriceMode) &&
        Objects.equals(this.minQty, priceListEntryPrice.minQty) &&
        Objects.equals(this.salePrice, priceListEntryPrice.salePrice) &&
        Objects.equals(this.salePriceMode, priceListEntryPrice.salePriceMode) &&
        Objects.equals(this.subscriptionPrice, priceListEntryPrice.subscriptionPrice) &&
        Objects.equals(this.subscriptionPriceMode, priceListEntryPrice.subscriptionPriceMode) &&
        Objects.equals(this.subscriptionSalePrice, priceListEntryPrice.subscriptionSalePrice) &&
        Objects.equals(this.subscriptionSalePriceMode, priceListEntryPrice.subscriptionSalePriceMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(listPrice, listPriceMode, minQty, salePrice, salePriceMode, subscriptionPrice, subscriptionPriceMode, subscriptionSalePrice, subscriptionSalePriceMode);
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
    sb.append("class PriceListEntryPrice {\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    listPriceMode: ").append(toIndentedString(listPriceMode)).append("\n");
    sb.append("    minQty: ").append(toIndentedString(minQty)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    salePriceMode: ").append(toIndentedString(salePriceMode)).append("\n");
    sb.append("    subscriptionPrice: ").append(toIndentedString(subscriptionPrice)).append("\n");
    sb.append("    subscriptionPriceMode: ").append(toIndentedString(subscriptionPriceMode)).append("\n");
    sb.append("    subscriptionSalePrice: ").append(toIndentedString(subscriptionSalePrice)).append("\n");
    sb.append("    subscriptionSalePriceMode: ").append(toIndentedString(subscriptionSalePriceMode)).append("\n");
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
    openapiFields.add("listPrice");
    openapiFields.add("listPriceMode");
    openapiFields.add("minQty");
    openapiFields.add("salePrice");
    openapiFields.add("salePriceMode");
    openapiFields.add("subscriptionPrice");
    openapiFields.add("subscriptionPriceMode");
    openapiFields.add("subscriptionSalePrice");
    openapiFields.add("subscriptionSalePriceMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PriceListEntryPrice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PriceListEntryPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceListEntryPrice is not found in the empty JSON string", PriceListEntryPrice.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PriceListEntryPrice.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceListEntryPrice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("listPriceMode") != null && !jsonObj.get("listPriceMode").isJsonNull()) && !jsonObj.get("listPriceMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listPriceMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listPriceMode").toString()));
      }
      if ((jsonObj.get("salePriceMode") != null && !jsonObj.get("salePriceMode").isJsonNull()) && !jsonObj.get("salePriceMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salePriceMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salePriceMode").toString()));
      }
      if ((jsonObj.get("subscriptionPriceMode") != null && !jsonObj.get("subscriptionPriceMode").isJsonNull()) && !jsonObj.get("subscriptionPriceMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionPriceMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionPriceMode").toString()));
      }
      if ((jsonObj.get("subscriptionSalePriceMode") != null && !jsonObj.get("subscriptionSalePriceMode").isJsonNull()) && !jsonObj.get("subscriptionSalePriceMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionSalePriceMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionSalePriceMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceListEntryPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceListEntryPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceListEntryPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceListEntryPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceListEntryPrice>() {
           @Override
           public void write(JsonWriter out, PriceListEntryPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceListEntryPrice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceListEntryPrice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceListEntryPrice
  * @throws IOException if the JSON string is invalid with respect to PriceListEntryPrice
  */
  public static PriceListEntryPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceListEntryPrice.class);
  }

 /**
  * Convert an instance of PriceListEntryPrice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

