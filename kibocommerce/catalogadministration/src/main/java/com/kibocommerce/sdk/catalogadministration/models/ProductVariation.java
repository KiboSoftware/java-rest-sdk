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
import com.kibocommerce.sdk.catalogadministration.models.ProductSupplierInfo;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationDeltaPrice;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationFixedPrice;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationOption;
import com.kibocommerce.sdk.catalogadministration.models.ProductVariationProperty;
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
 * The ProductVariation resource helps merchants manage their products with configurable options. Using this resource, the system creates a matrix of all possible combinations of the product options and the merchant confirms which variations match products for sale. For example, a T-shirt with three color and three size options has nine possible product variations. The system keeps track of inventory for each variation.
 */
@ApiModel(description = "The ProductVariation resource helps merchants manage their products with configurable options. Using this resource, the system creates a matrix of all possible combinations of the product options and the merchant confirms which variations match products for sale. For example, a T-shirt with three color and three size options has nine possible product variations. The system keeps track of inventory for each variation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductVariation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DELTA_PRICE = "deltaPrice";
  @SerializedName(SERIALIZED_NAME_DELTA_PRICE)
  private ProductVariationDeltaPrice deltaPrice;

  public static final String SERIALIZED_NAME_DELTA_WEIGHT = "deltaWeight";
  @SerializedName(SERIALIZED_NAME_DELTA_WEIGHT)
  private Double deltaWeight;

  public static final String SERIALIZED_NAME_FIXED_PRICE = "fixedPrice";
  @SerializedName(SERIALIZED_NAME_FIXED_PRICE)
  private ProductVariationFixedPrice fixedPrice;

  public static final String SERIALIZED_NAME_FIXED_WEIGHT = "fixedWeight";
  @SerializedName(SERIALIZED_NAME_FIXED_WEIGHT)
  private Double fixedWeight;

  public static final String SERIALIZED_NAME_FULFILLMENT_TYPES_SUPPORTED = "fulfillmentTypesSupported";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_TYPES_SUPPORTED)
  private List<String> fulfillmentTypesSupported = null;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_IS_ORPHAN = "isOrphan";
  @SerializedName(SERIALIZED_NAME_IS_ORPHAN)
  private Boolean isOrphan;

  public static final String SERIALIZED_NAME_LOCALIZED_DELTA_PRICE = "localizedDeltaPrice";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_DELTA_PRICE)
  private List<ProductVariationDeltaPrice> localizedDeltaPrice = null;

  public static final String SERIALIZED_NAME_LOCALIZED_FIXED_PRICE = "localizedFixedPrice";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_FIXED_PRICE)
  private List<ProductVariationFixedPrice> localizedFixedPrice = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ProductVariationOption> options = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<ProductVariationProperty> properties = null;

  public static final String SERIALIZED_NAME_SUPPLIER_INFO = "supplierInfo";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_INFO)
  private ProductSupplierInfo supplierInfo;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_VARIATION_EXISTS = "variationExists";
  @SerializedName(SERIALIZED_NAME_VARIATION_EXISTS)
  private Boolean variationExists;

  public static final String SERIALIZED_NAME_VARIATION_PRODUCT_CODE = "variationProductCode";
  @SerializedName(SERIALIZED_NAME_VARIATION_PRODUCT_CODE)
  private String variationProductCode;

  public static final String SERIALIZED_NAME_VARIATIONKEY = "variationkey";
  @SerializedName(SERIALIZED_NAME_VARIATIONKEY)
  private String variationkey;

  public ProductVariation() {
  }

  public ProductVariation deltaPrice(ProductVariationDeltaPrice deltaPrice) {
    
    this.deltaPrice = deltaPrice;
    return this;
  }

   /**
   * Get deltaPrice
   * @return deltaPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductVariationDeltaPrice getDeltaPrice() {
    return deltaPrice;
  }


  public void setDeltaPrice(ProductVariationDeltaPrice deltaPrice) {
    this.deltaPrice = deltaPrice;
  }


  public ProductVariation deltaWeight(Double deltaWeight) {
    
    this.deltaWeight = deltaWeight;
    return this;
  }

   /**
   * Weight of the product with this variation.
   * @return deltaWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Weight of the product with this variation.")

  public Double getDeltaWeight() {
    return deltaWeight;
  }


  public void setDeltaWeight(Double deltaWeight) {
    this.deltaWeight = deltaWeight;
  }


  public ProductVariation fixedPrice(ProductVariationFixedPrice fixedPrice) {
    
    this.fixedPrice = fixedPrice;
    return this;
  }

   /**
   * Get fixedPrice
   * @return fixedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductVariationFixedPrice getFixedPrice() {
    return fixedPrice;
  }


  public void setFixedPrice(ProductVariationFixedPrice fixedPrice) {
    this.fixedPrice = fixedPrice;
  }


  public ProductVariation fixedWeight(Double fixedWeight) {
    
    this.fixedWeight = fixedWeight;
    return this;
  }

   /**
   * Fixed weight of the product with this variation.
   * @return fixedWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed weight of the product with this variation.")

  public Double getFixedWeight() {
    return fixedWeight;
  }


  public void setFixedWeight(Double fixedWeight) {
    this.fixedWeight = fixedWeight;
  }


  public ProductVariation fulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
    
    this.fulfillmentTypesSupported = fulfillmentTypesSupported;
    return this;
  }

  public ProductVariation addFulfillmentTypesSupportedItem(String fulfillmentTypesSupportedItem) {
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


  public ProductVariation isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * If true, the merchant accepts the variation generated from the configurable options as a product offering. If IsActive is false then the product variation is not for sale--either because it was never a product offering or it was permanently dropped. IsActive is not intended for temporary unavailability. Default is false.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the merchant accepts the variation generated from the configurable options as a product offering. If IsActive is false then the product variation is not for sale--either because it was never a product offering or it was permanently dropped. IsActive is not intended for temporary unavailability. Default is false.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ProductVariation isOrphan(Boolean isOrphan) {
    
    this.isOrphan = isOrphan;
    return this;
  }

   /**
   * If true, the variation is no longer possible. The system sets IsOrphan to true when the merchant has changed something to make this variation impossible. For example, if the merchant stopped selling all \&quot;small\&quot; shirts, all product variations with the \&quot;small\&quot; option are set to IsOrphan. System-supplied and read-only.
   * @return isOrphan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the variation is no longer possible. The system sets IsOrphan to true when the merchant has changed something to make this variation impossible. For example, if the merchant stopped selling all \"small\" shirts, all product variations with the \"small\" option are set to IsOrphan. System-supplied and read-only.")

  public Boolean getIsOrphan() {
    return isOrphan;
  }


  public void setIsOrphan(Boolean isOrphan) {
    this.isOrphan = isOrphan;
  }


  public ProductVariation localizedDeltaPrice(List<ProductVariationDeltaPrice> localizedDeltaPrice) {
    
    this.localizedDeltaPrice = localizedDeltaPrice;
    return this;
  }

  public ProductVariation addLocalizedDeltaPriceItem(ProductVariationDeltaPrice localizedDeltaPriceItem) {
    if (this.localizedDeltaPrice == null) {
      this.localizedDeltaPrice = new ArrayList<>();
    }
    this.localizedDeltaPrice.add(localizedDeltaPriceItem);
    return this;
  }

   /**
   * How much more the variation costs above the cost of the base product. If the price of the base product changes, this price is adjusted accordingly. This collection allows for multiple currencies.
   * @return localizedDeltaPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How much more the variation costs above the cost of the base product. If the price of the base product changes, this price is adjusted accordingly. This collection allows for multiple currencies.")

  public List<ProductVariationDeltaPrice> getLocalizedDeltaPrice() {
    return localizedDeltaPrice;
  }


  public void setLocalizedDeltaPrice(List<ProductVariationDeltaPrice> localizedDeltaPrice) {
    this.localizedDeltaPrice = localizedDeltaPrice;
  }


  public ProductVariation localizedFixedPrice(List<ProductVariationFixedPrice> localizedFixedPrice) {
    
    this.localizedFixedPrice = localizedFixedPrice;
    return this;
  }

  public ProductVariation addLocalizedFixedPriceItem(ProductVariationFixedPrice localizedFixedPriceItem) {
    if (this.localizedFixedPrice == null) {
      this.localizedFixedPrice = new ArrayList<>();
    }
    this.localizedFixedPrice.add(localizedFixedPriceItem);
    return this;
  }

   /**
   * Price of the variation using fixed per currency This collection allows for multiple currencies.
   * @return localizedFixedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price of the variation using fixed per currency This collection allows for multiple currencies.")

  public List<ProductVariationFixedPrice> getLocalizedFixedPrice() {
    return localizedFixedPrice;
  }


  public void setLocalizedFixedPrice(List<ProductVariationFixedPrice> localizedFixedPrice) {
    this.localizedFixedPrice = localizedFixedPrice;
  }


  public ProductVariation options(List<ProductVariationOption> options) {
    
    this.options = options;
    return this;
  }

  public ProductVariation addOptionsItem(ProductVariationOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * List of values for this product variation: such as \&quot;small, \&quot;red.. these are read only here as the variationKey defines the values \&quot;
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of values for this product variation: such as \"small, \"red.. these are read only here as the variationKey defines the values \"")

  public List<ProductVariationOption> getOptions() {
    return options;
  }


  public void setOptions(List<ProductVariationOption> options) {
    this.options = options;
  }


  public ProductVariation properties(List<ProductVariationProperty> properties) {
    
    this.properties = properties;
    return this;
  }

  public ProductVariation addPropertiesItem(ProductVariationProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * List of properties specific to this variation
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of properties specific to this variation")

  public List<ProductVariationProperty> getProperties() {
    return properties;
  }


  public void setProperties(List<ProductVariationProperty> properties) {
    this.properties = properties;
  }


  public ProductVariation supplierInfo(ProductSupplierInfo supplierInfo) {
    
    this.supplierInfo = supplierInfo;
    return this;
  }

   /**
   * Get supplierInfo
   * @return supplierInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductSupplierInfo getSupplierInfo() {
    return supplierInfo;
  }


  public void setSupplierInfo(ProductSupplierInfo supplierInfo) {
    this.supplierInfo = supplierInfo;
  }


  public ProductVariation upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * Price Lookup Unit code for the product
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price Lookup Unit code for the product")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }


  public ProductVariation variationExists(Boolean variationExists) {
    
    this.variationExists = variationExists;
    return this;
  }

   /**
   * If true, the product variation exists. When the merchant sets IsActive to true, the system sets VariationExists to true and creates a Variation Key as a unique identifier for this variation. System-supplied and read-only.
   * @return variationExists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the product variation exists. When the merchant sets IsActive to true, the system sets VariationExists to true and creates a Variation Key as a unique identifier for this variation. System-supplied and read-only.")

  public Boolean getVariationExists() {
    return variationExists;
  }


  public void setVariationExists(Boolean variationExists) {
    this.variationExists = variationExists;
  }


  public ProductVariation variationProductCode(String variationProductCode) {
    
    this.variationProductCode = variationProductCode;
    return this;
  }

   /**
   * Descriptive code to refer to a single variation. Typically this is a sequence appended to the base ProduceCode. A merchant can create this code to easily recognize a product variation. By default, the system creates this code by appending a number to the base product. After the merchant supplies this code, it becomes read-only.
   * @return variationProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Descriptive code to refer to a single variation. Typically this is a sequence appended to the base ProduceCode. A merchant can create this code to easily recognize a product variation. By default, the system creates this code by appending a number to the base product. After the merchant supplies this code, it becomes read-only.")

  public String getVariationProductCode() {
    return variationProductCode;
  }


  public void setVariationProductCode(String variationProductCode) {
    this.variationProductCode = variationProductCode;
  }


  public ProductVariation variationkey(String variationkey) {
    
    this.variationkey = variationkey;
    return this;
  }

   /**
   * Unique identifier for a single variation (\&quot;small\&quot; + \&quot;red\&quot; + \&quot;short-sleeved\&quot;). System-supplied and read-only.
   * @return variationkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for a single variation (\"small\" + \"red\" + \"short-sleeved\"). System-supplied and read-only.")

  public String getVariationkey() {
    return variationkey;
  }


  public void setVariationkey(String variationkey) {
    this.variationkey = variationkey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariation productVariation = (ProductVariation) o;
    return Objects.equals(this.deltaPrice, productVariation.deltaPrice) &&
        Objects.equals(this.deltaWeight, productVariation.deltaWeight) &&
        Objects.equals(this.fixedPrice, productVariation.fixedPrice) &&
        Objects.equals(this.fixedWeight, productVariation.fixedWeight) &&
        Objects.equals(this.fulfillmentTypesSupported, productVariation.fulfillmentTypesSupported) &&
        Objects.equals(this.isActive, productVariation.isActive) &&
        Objects.equals(this.isOrphan, productVariation.isOrphan) &&
        Objects.equals(this.localizedDeltaPrice, productVariation.localizedDeltaPrice) &&
        Objects.equals(this.localizedFixedPrice, productVariation.localizedFixedPrice) &&
        Objects.equals(this.options, productVariation.options) &&
        Objects.equals(this.properties, productVariation.properties) &&
        Objects.equals(this.supplierInfo, productVariation.supplierInfo) &&
        Objects.equals(this.upc, productVariation.upc) &&
        Objects.equals(this.variationExists, productVariation.variationExists) &&
        Objects.equals(this.variationProductCode, productVariation.variationProductCode) &&
        Objects.equals(this.variationkey, productVariation.variationkey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deltaPrice, deltaWeight, fixedPrice, fixedWeight, fulfillmentTypesSupported, isActive, isOrphan, localizedDeltaPrice, localizedFixedPrice, options, properties, supplierInfo, upc, variationExists, variationProductCode, variationkey);
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
    sb.append("class ProductVariation {\n");
    sb.append("    deltaPrice: ").append(toIndentedString(deltaPrice)).append("\n");
    sb.append("    deltaWeight: ").append(toIndentedString(deltaWeight)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    fixedWeight: ").append(toIndentedString(fixedWeight)).append("\n");
    sb.append("    fulfillmentTypesSupported: ").append(toIndentedString(fulfillmentTypesSupported)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isOrphan: ").append(toIndentedString(isOrphan)).append("\n");
    sb.append("    localizedDeltaPrice: ").append(toIndentedString(localizedDeltaPrice)).append("\n");
    sb.append("    localizedFixedPrice: ").append(toIndentedString(localizedFixedPrice)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    supplierInfo: ").append(toIndentedString(supplierInfo)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    variationExists: ").append(toIndentedString(variationExists)).append("\n");
    sb.append("    variationProductCode: ").append(toIndentedString(variationProductCode)).append("\n");
    sb.append("    variationkey: ").append(toIndentedString(variationkey)).append("\n");
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
    openapiFields.add("deltaPrice");
    openapiFields.add("deltaWeight");
    openapiFields.add("fixedPrice");
    openapiFields.add("fixedWeight");
    openapiFields.add("fulfillmentTypesSupported");
    openapiFields.add("isActive");
    openapiFields.add("isOrphan");
    openapiFields.add("localizedDeltaPrice");
    openapiFields.add("localizedFixedPrice");
    openapiFields.add("options");
    openapiFields.add("properties");
    openapiFields.add("supplierInfo");
    openapiFields.add("upc");
    openapiFields.add("variationExists");
    openapiFields.add("variationProductCode");
    openapiFields.add("variationkey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductVariation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductVariation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductVariation is not found in the empty JSON string", ProductVariation.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductVariation.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductVariation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `deltaPrice`
      if (jsonObj.get("deltaPrice") != null && !jsonObj.get("deltaPrice").isJsonNull()) {
        ProductVariationDeltaPrice.validateJsonObject(jsonObj.getAsJsonObject("deltaPrice"));
      }
      // validate the optional field `fixedPrice`
      if (jsonObj.get("fixedPrice") != null && !jsonObj.get("fixedPrice").isJsonNull()) {
        ProductVariationFixedPrice.validateJsonObject(jsonObj.getAsJsonObject("fixedPrice"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("fulfillmentTypesSupported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentTypesSupported` to be an array in the JSON string but got `%s`", jsonObj.get("fulfillmentTypesSupported").toString()));
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
            ProductVariationDeltaPrice.validateJsonObject(jsonArraylocalizedDeltaPrice.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("localizedFixedPrice") != null && !jsonObj.get("localizedFixedPrice").isJsonNull()) {
        JsonArray jsonArraylocalizedFixedPrice = jsonObj.getAsJsonArray("localizedFixedPrice");
        if (jsonArraylocalizedFixedPrice != null) {
          // ensure the json data is an array
          if (!jsonObj.get("localizedFixedPrice").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `localizedFixedPrice` to be an array in the JSON string but got `%s`", jsonObj.get("localizedFixedPrice").toString()));
          }

          // validate the optional field `localizedFixedPrice` (array)
          for (int i = 0; i < jsonArraylocalizedFixedPrice.size(); i++) {
            ProductVariationFixedPrice.validateJsonObject(jsonArraylocalizedFixedPrice.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            ProductVariationOption.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            ProductVariationProperty.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `supplierInfo`
      if (jsonObj.get("supplierInfo") != null && !jsonObj.get("supplierInfo").isJsonNull()) {
        ProductSupplierInfo.validateJsonObject(jsonObj.getAsJsonObject("supplierInfo"));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("variationProductCode") != null && !jsonObj.get("variationProductCode").isJsonNull()) && !jsonObj.get("variationProductCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variationProductCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variationProductCode").toString()));
      }
      if ((jsonObj.get("variationkey") != null && !jsonObj.get("variationkey").isJsonNull()) && !jsonObj.get("variationkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variationkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variationkey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductVariation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductVariation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductVariation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductVariation.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductVariation>() {
           @Override
           public void write(JsonWriter out, ProductVariation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductVariation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductVariation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductVariation
  * @throws IOException if the JSON string is invalid with respect to ProductVariation
  */
  public static ProductVariation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductVariation.class);
  }

 /**
  * Convert an instance of ProductVariation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

