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
 * ProductTypeChangeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductTypeChangeRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IGNORE_DATA_LOSS = "ignoreDataLoss";
  @SerializedName(SERIALIZED_NAME_IGNORE_DATA_LOSS)
  private Boolean ignoreDataLoss;

  public static final String SERIALIZED_NAME_SHOULD_FAIL_FAST = "shouldFailFast";
  @SerializedName(SERIALIZED_NAME_SHOULD_FAIL_FAST)
  private Boolean shouldFailFast;

  public static final String SERIALIZED_NAME_TARGET_PRODUCT_TYPE_ID = "targetProductTypeId";
  @SerializedName(SERIALIZED_NAME_TARGET_PRODUCT_TYPE_ID)
  private Integer targetProductTypeId;

  public static final String SERIALIZED_NAME_TEST_MODE = "testMode";
  @SerializedName(SERIALIZED_NAME_TEST_MODE)
  private Boolean testMode;

  public ProductTypeChangeRequest() {
  }

  public ProductTypeChangeRequest ignoreDataLoss(Boolean ignoreDataLoss) {
    
    this.ignoreDataLoss = ignoreDataLoss;
    return this;
  }

   /**
   * When set to true any attributes or values that were set on the product that are not defined the target product type will be lost.  When false, the process will stop without making updates if there are any conditions that would result in dataloss. Validation output will be returned. Defaults to false.
   * @return ignoreDataLoss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set to true any attributes or values that were set on the product that are not defined the target product type will be lost.  When false, the process will stop without making updates if there are any conditions that would result in dataloss. Validation output will be returned. Defaults to false.")

  public Boolean getIgnoreDataLoss() {
    return ignoreDataLoss;
  }


  public void setIgnoreDataLoss(Boolean ignoreDataLoss) {
    this.ignoreDataLoss = ignoreDataLoss;
  }


  public ProductTypeChangeRequest shouldFailFast(Boolean shouldFailFast) {
    
    this.shouldFailFast = shouldFailFast;
    return this;
  }

   /**
   * When true the validation will stop on the first error.  Defaults to run all validation.
   * @return shouldFailFast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When true the validation will stop on the first error.  Defaults to run all validation.")

  public Boolean getShouldFailFast() {
    return shouldFailFast;
  }


  public void setShouldFailFast(Boolean shouldFailFast) {
    this.shouldFailFast = shouldFailFast;
  }


  public ProductTypeChangeRequest targetProductTypeId(Integer targetProductTypeId) {
    
    this.targetProductTypeId = targetProductTypeId;
    return this;
  }

   /**
   * The target product type id to move the product to.
   * @return targetProductTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target product type id to move the product to.")

  public Integer getTargetProductTypeId() {
    return targetProductTypeId;
  }


  public void setTargetProductTypeId(Integer targetProductTypeId) {
    this.targetProductTypeId = targetProductTypeId;
  }


  public ProductTypeChangeRequest testMode(Boolean testMode) {
    
    this.testMode = testMode;
    return this;
  }

   /**
   * When set to true no updates will be made but the validation will return any warnings or failures. Defaults to false.
   * @return testMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set to true no updates will be made but the validation will return any warnings or failures. Defaults to false.")

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
    ProductTypeChangeRequest productTypeChangeRequest = (ProductTypeChangeRequest) o;
    return Objects.equals(this.ignoreDataLoss, productTypeChangeRequest.ignoreDataLoss) &&
        Objects.equals(this.shouldFailFast, productTypeChangeRequest.shouldFailFast) &&
        Objects.equals(this.targetProductTypeId, productTypeChangeRequest.targetProductTypeId) &&
        Objects.equals(this.testMode, productTypeChangeRequest.testMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ignoreDataLoss, shouldFailFast, targetProductTypeId, testMode);
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
    sb.append("class ProductTypeChangeRequest {\n");
    sb.append("    ignoreDataLoss: ").append(toIndentedString(ignoreDataLoss)).append("\n");
    sb.append("    shouldFailFast: ").append(toIndentedString(shouldFailFast)).append("\n");
    sb.append("    targetProductTypeId: ").append(toIndentedString(targetProductTypeId)).append("\n");
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
    openapiFields.add("shouldFailFast");
    openapiFields.add("targetProductTypeId");
    openapiFields.add("testMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductTypeChangeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductTypeChangeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductTypeChangeRequest is not found in the empty JSON string", ProductTypeChangeRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductTypeChangeRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductTypeChangeRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductTypeChangeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductTypeChangeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductTypeChangeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductTypeChangeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductTypeChangeRequest>() {
           @Override
           public void write(JsonWriter out, ProductTypeChangeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductTypeChangeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductTypeChangeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductTypeChangeRequest
  * @throws IOException if the JSON string is invalid with respect to ProductTypeChangeRequest
  */
  public static ProductTypeChangeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductTypeChangeRequest.class);
  }

 /**
  * Convert an instance of ProductTypeChangeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

