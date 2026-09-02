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
import com.kibocommerce.sdk.catalogadministration.models.PriceListEntryFailure;
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
 * Category
 */
@ApiModel(description = "Category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PriceListBulkResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FAILURE_COUNT = "failureCount";
  @SerializedName(SERIALIZED_NAME_FAILURE_COUNT)
  private Integer failureCount;

  public static final String SERIALIZED_NAME_FAILURE_DETAILS = "failureDetails";
  @SerializedName(SERIALIZED_NAME_FAILURE_DETAILS)
  private List<PriceListEntryFailure> failureDetails = null;

  public static final String SERIALIZED_NAME_SUCCESS_COUNT = "successCount";
  @SerializedName(SERIALIZED_NAME_SUCCESS_COUNT)
  private Integer successCount;

  public PriceListBulkResult() {
  }

  public PriceListBulkResult failureCount(Integer failureCount) {
    
    this.failureCount = failureCount;
    return this;
  }

   /**
   * Get failureCount
   * @return failureCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailureCount() {
    return failureCount;
  }


  public void setFailureCount(Integer failureCount) {
    this.failureCount = failureCount;
  }


  public PriceListBulkResult failureDetails(List<PriceListEntryFailure> failureDetails) {
    
    this.failureDetails = failureDetails;
    return this;
  }

  public PriceListBulkResult addFailureDetailsItem(PriceListEntryFailure failureDetailsItem) {
    if (this.failureDetails == null) {
      this.failureDetails = new ArrayList<>();
    }
    this.failureDetails.add(failureDetailsItem);
    return this;
  }

   /**
   * Get failureDetails
   * @return failureDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PriceListEntryFailure> getFailureDetails() {
    return failureDetails;
  }


  public void setFailureDetails(List<PriceListEntryFailure> failureDetails) {
    this.failureDetails = failureDetails;
  }


  public PriceListBulkResult successCount(Integer successCount) {
    
    this.successCount = successCount;
    return this;
  }

   /**
   * Get successCount
   * @return successCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccessCount() {
    return successCount;
  }


  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceListBulkResult priceListBulkResult = (PriceListBulkResult) o;
    return Objects.equals(this.failureCount, priceListBulkResult.failureCount) &&
        Objects.equals(this.failureDetails, priceListBulkResult.failureDetails) &&
        Objects.equals(this.successCount, priceListBulkResult.successCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureCount, failureDetails, successCount);
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
    sb.append("class PriceListBulkResult {\n");
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
    sb.append("    failureDetails: ").append(toIndentedString(failureDetails)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
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
    openapiFields.add("failureCount");
    openapiFields.add("failureDetails");
    openapiFields.add("successCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PriceListBulkResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PriceListBulkResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceListBulkResult is not found in the empty JSON string", PriceListBulkResult.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PriceListBulkResult.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceListBulkResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("failureDetails") != null && !jsonObj.get("failureDetails").isJsonNull()) {
        JsonArray jsonArrayfailureDetails = jsonObj.getAsJsonArray("failureDetails");
        if (jsonArrayfailureDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("failureDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `failureDetails` to be an array in the JSON string but got `%s`", jsonObj.get("failureDetails").toString()));
          }

          // validate the optional field `failureDetails` (array)
          for (int i = 0; i < jsonArrayfailureDetails.size(); i++) {
            PriceListEntryFailure.validateJsonObject(jsonArrayfailureDetails.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceListBulkResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceListBulkResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceListBulkResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceListBulkResult.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceListBulkResult>() {
           @Override
           public void write(JsonWriter out, PriceListBulkResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceListBulkResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PriceListBulkResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PriceListBulkResult
  * @throws IOException if the JSON string is invalid with respect to PriceListBulkResult
  */
  public static PriceListBulkResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceListBulkResult.class);
  }

 /**
  * Convert an instance of PriceListBulkResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

