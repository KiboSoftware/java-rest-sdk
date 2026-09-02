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
import com.kibocommerce.sdk.catalogadministration.models.ProductTypeChangeValidationResult;
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
 * QuickEditChangeProductTypeResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuickEditChangeProductTypeResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_INITIAL_PRODUCT_TYPE_ID = "initialProductTypeId";
  @SerializedName(SERIALIZED_NAME_INITIAL_PRODUCT_TYPE_ID)
  private Integer initialProductTypeId;

  public static final String SERIALIZED_NAME_TARGET_PRODUCT_TYPE_ID = "targetProductTypeId";
  @SerializedName(SERIALIZED_NAME_TARGET_PRODUCT_TYPE_ID)
  private Integer targetProductTypeId;

  public static final String SERIALIZED_NAME_VALIDATION_RESULTS = "validationResults";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RESULTS)
  private List<ProductTypeChangeValidationResult> validationResults = null;

  public QuickEditChangeProductTypeResult() {
  }

  public QuickEditChangeProductTypeResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error message if any.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message if any.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public QuickEditChangeProductTypeResult resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * The unique resouce identifier
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique resouce identifier")

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public QuickEditChangeProductTypeResult success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * true if the patch succeeded.
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true if the patch succeeded.")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public QuickEditChangeProductTypeResult initialProductTypeId(Integer initialProductTypeId) {
    
    this.initialProductTypeId = initialProductTypeId;
    return this;
  }

   /**
   * The original product type id
   * @return initialProductTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original product type id")

  public Integer getInitialProductTypeId() {
    return initialProductTypeId;
  }


  public void setInitialProductTypeId(Integer initialProductTypeId) {
    this.initialProductTypeId = initialProductTypeId;
  }


  public QuickEditChangeProductTypeResult targetProductTypeId(Integer targetProductTypeId) {
    
    this.targetProductTypeId = targetProductTypeId;
    return this;
  }

   /**
   * The target product type id
   * @return targetProductTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target product type id")

  public Integer getTargetProductTypeId() {
    return targetProductTypeId;
  }


  public void setTargetProductTypeId(Integer targetProductTypeId) {
    this.targetProductTypeId = targetProductTypeId;
  }


  public QuickEditChangeProductTypeResult validationResults(List<ProductTypeChangeValidationResult> validationResults) {
    
    this.validationResults = validationResults;
    return this;
  }

  public QuickEditChangeProductTypeResult addValidationResultsItem(ProductTypeChangeValidationResult validationResultsItem) {
    if (this.validationResults == null) {
      this.validationResults = new ArrayList<>();
    }
    this.validationResults.add(validationResultsItem);
    return this;
  }

   /**
   * List of Mozu.ProductAdmin.Contracts.ProductTypeChangeValidationResult
   * @return validationResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Mozu.ProductAdmin.Contracts.ProductTypeChangeValidationResult")

  public List<ProductTypeChangeValidationResult> getValidationResults() {
    return validationResults;
  }


  public void setValidationResults(List<ProductTypeChangeValidationResult> validationResults) {
    this.validationResults = validationResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickEditChangeProductTypeResult quickEditChangeProductTypeResult = (QuickEditChangeProductTypeResult) o;
    return Objects.equals(this.message, quickEditChangeProductTypeResult.message) &&
        Objects.equals(this.resourceId, quickEditChangeProductTypeResult.resourceId) &&
        Objects.equals(this.success, quickEditChangeProductTypeResult.success) &&
        Objects.equals(this.initialProductTypeId, quickEditChangeProductTypeResult.initialProductTypeId) &&
        Objects.equals(this.targetProductTypeId, quickEditChangeProductTypeResult.targetProductTypeId) &&
        Objects.equals(this.validationResults, quickEditChangeProductTypeResult.validationResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resourceId, success, initialProductTypeId, targetProductTypeId, validationResults);
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
    sb.append("class QuickEditChangeProductTypeResult {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    initialProductTypeId: ").append(toIndentedString(initialProductTypeId)).append("\n");
    sb.append("    targetProductTypeId: ").append(toIndentedString(targetProductTypeId)).append("\n");
    sb.append("    validationResults: ").append(toIndentedString(validationResults)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("resourceId");
    openapiFields.add("success");
    openapiFields.add("initialProductTypeId");
    openapiFields.add("targetProductTypeId");
    openapiFields.add("validationResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuickEditChangeProductTypeResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!QuickEditChangeProductTypeResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuickEditChangeProductTypeResult is not found in the empty JSON string", QuickEditChangeProductTypeResult.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!QuickEditChangeProductTypeResult.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuickEditChangeProductTypeResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("resourceId") != null && !jsonObj.get("resourceId").isJsonNull()) && !jsonObj.get("resourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceId").toString()));
      }
      if (jsonObj.get("validationResults") != null && !jsonObj.get("validationResults").isJsonNull()) {
        JsonArray jsonArrayvalidationResults = jsonObj.getAsJsonArray("validationResults");
        if (jsonArrayvalidationResults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validationResults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validationResults` to be an array in the JSON string but got `%s`", jsonObj.get("validationResults").toString()));
          }

          // validate the optional field `validationResults` (array)
          for (int i = 0; i < jsonArrayvalidationResults.size(); i++) {
            ProductTypeChangeValidationResult.validateJsonObject(jsonArrayvalidationResults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuickEditChangeProductTypeResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuickEditChangeProductTypeResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuickEditChangeProductTypeResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuickEditChangeProductTypeResult.class));

       return (TypeAdapter<T>) new TypeAdapter<QuickEditChangeProductTypeResult>() {
           @Override
           public void write(JsonWriter out, QuickEditChangeProductTypeResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuickEditChangeProductTypeResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuickEditChangeProductTypeResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuickEditChangeProductTypeResult
  * @throws IOException if the JSON string is invalid with respect to QuickEditChangeProductTypeResult
  */
  public static QuickEditChangeProductTypeResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuickEditChangeProductTypeResult.class);
  }

 /**
  * Convert an instance of QuickEditChangeProductTypeResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

