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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductPrice;
import com.kibocommerce.sdk.catalogadministration.models.CommerceRuntimeMeasurement;
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
 * Price of the product and currency used.
 */
@ApiModel(description = "Price of the product and currency used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsBundledProduct implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FULFILLMENT_TYPES_SUPPORTED = "fulfillmentTypesSupported";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_TYPES_SUPPORTED)
  private List<String> fulfillmentTypesSupported = null;

  public static final String SERIALIZED_NAME_PACKAGE_HEIGHT = "packageHeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_HEIGHT)
  private CommerceRuntimeMeasurement packageHeight;

  public static final String SERIALIZED_NAME_PACKAGE_LENGTH = "packageLength";
  @SerializedName(SERIALIZED_NAME_PACKAGE_LENGTH)
  private CommerceRuntimeMeasurement packageLength;

  public static final String SERIALIZED_NAME_PACKAGE_WEIGHT = "packageWeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WEIGHT)
  private CommerceRuntimeMeasurement packageWeight;

  public static final String SERIALIZED_NAME_PACKAGE_WIDTH = "packageWidth";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WIDTH)
  private CommerceRuntimeMeasurement packageWidth;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CatalogAdminsProductPrice price;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public CatalogAdminsBundledProduct() {
  }

  public CatalogAdminsBundledProduct fulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
    
    this.fulfillmentTypesSupported = fulfillmentTypesSupported;
    return this;
  }

  public CatalogAdminsBundledProduct addFulfillmentTypesSupportedItem(String fulfillmentTypesSupportedItem) {
    if (this.fulfillmentTypesSupported == null) {
      this.fulfillmentTypesSupported = new ArrayList<>();
    }
    this.fulfillmentTypesSupported.add(fulfillmentTypesSupportedItem);
    return this;
  }

   /**
   * Indicates the fulfillment types the product supports.
   * @return fulfillmentTypesSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the fulfillment types the product supports.")

  public List<String> getFulfillmentTypesSupported() {
    return fulfillmentTypesSupported;
  }


  public void setFulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
    this.fulfillmentTypesSupported = fulfillmentTypesSupported;
  }


  public CatalogAdminsBundledProduct packageHeight(CommerceRuntimeMeasurement packageHeight) {
    
    this.packageHeight = packageHeight;
    return this;
  }

   /**
   * Get packageHeight
   * @return packageHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageHeight() {
    return packageHeight;
  }


  public void setPackageHeight(CommerceRuntimeMeasurement packageHeight) {
    this.packageHeight = packageHeight;
  }


  public CatalogAdminsBundledProduct packageLength(CommerceRuntimeMeasurement packageLength) {
    
    this.packageLength = packageLength;
    return this;
  }

   /**
   * Get packageLength
   * @return packageLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageLength() {
    return packageLength;
  }


  public void setPackageLength(CommerceRuntimeMeasurement packageLength) {
    this.packageLength = packageLength;
  }


  public CatalogAdminsBundledProduct packageWeight(CommerceRuntimeMeasurement packageWeight) {
    
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * Get packageWeight
   * @return packageWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageWeight() {
    return packageWeight;
  }


  public void setPackageWeight(CommerceRuntimeMeasurement packageWeight) {
    this.packageWeight = packageWeight;
  }


  public CatalogAdminsBundledProduct packageWidth(CommerceRuntimeMeasurement packageWidth) {
    
    this.packageWidth = packageWidth;
    return this;
  }

   /**
   * Get packageWidth
   * @return packageWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommerceRuntimeMeasurement getPackageWidth() {
    return packageWidth;
  }


  public void setPackageWidth(CommerceRuntimeMeasurement packageWidth) {
    this.packageWidth = packageWidth;
  }


  public CatalogAdminsBundledProduct price(CatalogAdminsProductPrice price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsProductPrice getPrice() {
    return price;
  }


  public void setPrice(CatalogAdminsProductPrice price) {
    this.price = price;
  }


  public CatalogAdminsBundledProduct productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Product Code
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product Code")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public CatalogAdminsBundledProduct productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Read only Name of the BundledProduct
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read only Name of the BundledProduct")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public CatalogAdminsBundledProduct quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Qty of the bundled PRoduct
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Qty of the bundled PRoduct")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsBundledProduct catalogAdminsBundledProduct = (CatalogAdminsBundledProduct) o;
    return Objects.equals(this.fulfillmentTypesSupported, catalogAdminsBundledProduct.fulfillmentTypesSupported) &&
        Objects.equals(this.packageHeight, catalogAdminsBundledProduct.packageHeight) &&
        Objects.equals(this.packageLength, catalogAdminsBundledProduct.packageLength) &&
        Objects.equals(this.packageWeight, catalogAdminsBundledProduct.packageWeight) &&
        Objects.equals(this.packageWidth, catalogAdminsBundledProduct.packageWidth) &&
        Objects.equals(this.price, catalogAdminsBundledProduct.price) &&
        Objects.equals(this.productCode, catalogAdminsBundledProduct.productCode) &&
        Objects.equals(this.productName, catalogAdminsBundledProduct.productName) &&
        Objects.equals(this.quantity, catalogAdminsBundledProduct.quantity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentTypesSupported, packageHeight, packageLength, packageWeight, packageWidth, price, productCode, productName, quantity);
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
    sb.append("class CatalogAdminsBundledProduct {\n");
    sb.append("    fulfillmentTypesSupported: ").append(toIndentedString(fulfillmentTypesSupported)).append("\n");
    sb.append("    packageHeight: ").append(toIndentedString(packageHeight)).append("\n");
    sb.append("    packageLength: ").append(toIndentedString(packageLength)).append("\n");
    sb.append("    packageWeight: ").append(toIndentedString(packageWeight)).append("\n");
    sb.append("    packageWidth: ").append(toIndentedString(packageWidth)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
    openapiFields.add("fulfillmentTypesSupported");
    openapiFields.add("packageHeight");
    openapiFields.add("packageLength");
    openapiFields.add("packageWeight");
    openapiFields.add("packageWidth");
    openapiFields.add("price");
    openapiFields.add("productCode");
    openapiFields.add("productName");
    openapiFields.add("quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsBundledProduct
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsBundledProduct.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsBundledProduct is not found in the empty JSON string", CatalogAdminsBundledProduct.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsBundledProduct.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsBundledProduct` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("fulfillmentTypesSupported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentTypesSupported` to be an array in the JSON string but got `%s`", jsonObj.get("fulfillmentTypesSupported").toString()));
      }
      // validate the optional field `packageHeight`
      if (jsonObj.get("packageHeight") != null && !jsonObj.get("packageHeight").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageHeight"));
      }
      // validate the optional field `packageLength`
      if (jsonObj.get("packageLength") != null && !jsonObj.get("packageLength").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageLength"));
      }
      // validate the optional field `packageWeight`
      if (jsonObj.get("packageWeight") != null && !jsonObj.get("packageWeight").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageWeight"));
      }
      // validate the optional field `packageWidth`
      if (jsonObj.get("packageWidth") != null && !jsonObj.get("packageWidth").isJsonNull()) {
        CommerceRuntimeMeasurement.validateJsonObject(jsonObj.getAsJsonObject("packageWidth"));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        CatalogAdminsProductPrice.validateJsonObject(jsonObj.getAsJsonObject("price"));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonNull()) && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsBundledProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsBundledProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsBundledProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsBundledProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsBundledProduct>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsBundledProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsBundledProduct read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsBundledProduct given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsBundledProduct
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsBundledProduct
  */
  public static CatalogAdminsBundledProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsBundledProduct.class);
  }

 /**
  * Convert an instance of CatalogAdminsBundledProduct to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

