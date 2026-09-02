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
import com.kibocommerce.sdk.catalogadministration.models.ProductV1PatchDocument;
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
 * List of JsonPatch operations to be applied to a Mozu.ProductAdmin.Contracts.Product
 */
@ApiModel(description = "List of JsonPatch operations to be applied to a Mozu.ProductAdmin.Contracts.Product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChangeProductTypeAction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IGNORE_DATA_LOSS = "ignoreDataLoss";
  @SerializedName(SERIALIZED_NAME_IGNORE_DATA_LOSS)
  private Boolean ignoreDataLoss;

  public static final String SERIALIZED_NAME_PATCHES = "patches";
  @SerializedName(SERIALIZED_NAME_PATCHES)
  private ProductV1PatchDocument patches;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_SAVE_AND_PUBLISH = "saveAndPublish";
  @SerializedName(SERIALIZED_NAME_SAVE_AND_PUBLISH)
  private Boolean saveAndPublish;

  public static final String SERIALIZED_NAME_TEST_MODE = "testMode";
  @SerializedName(SERIALIZED_NAME_TEST_MODE)
  private Boolean testMode;

  public ChangeProductTypeAction() {
  }

  public ChangeProductTypeAction ignoreDataLoss(Boolean ignoreDataLoss) {
    
    this.ignoreDataLoss = ignoreDataLoss;
    return this;
  }

   /**
   * Whether to ignore data loss. If true, data loss will be ignored. If false, the product will not be updated when warnings are encountered
   * @return ignoreDataLoss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to ignore data loss. If true, data loss will be ignored. If false, the product will not be updated when warnings are encountered")

  public Boolean getIgnoreDataLoss() {
    return ignoreDataLoss;
  }


  public void setIgnoreDataLoss(Boolean ignoreDataLoss) {
    this.ignoreDataLoss = ignoreDataLoss;
  }


  public ChangeProductTypeAction patches(ProductV1PatchDocument patches) {
    
    this.patches = patches;
    return this;
  }

   /**
   * Get patches
   * @return patches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductV1PatchDocument getPatches() {
    return patches;
  }


  public void setPatches(ProductV1PatchDocument patches) {
    this.patches = patches;
  }


  public ChangeProductTypeAction productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Product code of the target product
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product code of the target product")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ChangeProductTypeAction saveAndPublish(Boolean saveAndPublish) {
    
    this.saveAndPublish = saveAndPublish;
    return this;
  }

   /**
   * If true and publishing is enabled, actions are applied to a draft version of the product and then the draft is published otherwise changes are saved to the live product.
   * @return saveAndPublish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true and publishing is enabled, actions are applied to a draft version of the product and then the draft is published otherwise changes are saved to the live product.")

  public Boolean getSaveAndPublish() {
    return saveAndPublish;
  }


  public void setSaveAndPublish(Boolean saveAndPublish) {
    this.saveAndPublish = saveAndPublish;
  }


  public ChangeProductTypeAction testMode(Boolean testMode) {
    
    this.testMode = testMode;
    return this;
  }

   /**
   * Whether to run in test mode.  If true, no changes will be made.
   * @return testMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to run in test mode.  If true, no changes will be made.")

  public Boolean getTestMode() {
    return testMode;
  }


  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeProductTypeAction changeProductTypeAction = (ChangeProductTypeAction) o;
    return Objects.equals(this.ignoreDataLoss, changeProductTypeAction.ignoreDataLoss) &&
        Objects.equals(this.patches, changeProductTypeAction.patches) &&
        Objects.equals(this.productCode, changeProductTypeAction.productCode) &&
        Objects.equals(this.saveAndPublish, changeProductTypeAction.saveAndPublish) &&
        Objects.equals(this.testMode, changeProductTypeAction.testMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreDataLoss, patches, productCode, saveAndPublish, testMode);
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
    sb.append("class ChangeProductTypeAction {\n");
    sb.append("    ignoreDataLoss: ").append(toIndentedString(ignoreDataLoss)).append("\n");
    sb.append("    patches: ").append(toIndentedString(patches)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    saveAndPublish: ").append(toIndentedString(saveAndPublish)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
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
    openapiFields.add("ignoreDataLoss");
    openapiFields.add("patches");
    openapiFields.add("productCode");
    openapiFields.add("saveAndPublish");
    openapiFields.add("testMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangeProductTypeAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangeProductTypeAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangeProductTypeAction is not found in the empty JSON string", ChangeProductTypeAction.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ChangeProductTypeAction.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangeProductTypeAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `patches`
      if (jsonObj.get("patches") != null && !jsonObj.get("patches").isJsonNull()) {
        ProductV1PatchDocument.validateJsonObject(jsonObj.getAsJsonObject("patches"));
      }
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangeProductTypeAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangeProductTypeAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangeProductTypeAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangeProductTypeAction.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangeProductTypeAction>() {
           @Override
           public void write(JsonWriter out, ChangeProductTypeAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangeProductTypeAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangeProductTypeAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangeProductTypeAction
  * @throws IOException if the JSON string is invalid with respect to ChangeProductTypeAction
  */
  public static ChangeProductTypeAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangeProductTypeAction.class);
  }

 /**
  * Convert an instance of ChangeProductTypeAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

