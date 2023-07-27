/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
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
import com.kibocommerce.sdk.catalogadministration.models.CatalogAdminsProductCost;
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
 * Supplier info for the product
 */
@ApiModel(description = "Supplier info for the product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSupplierInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MFG_PART_NUMBER = "mfgPartNumber";
  @SerializedName(SERIALIZED_NAME_MFG_PART_NUMBER)
  private String mfgPartNumber;

  public static final String SERIALIZED_NAME_DIST_PART_NUMBER = "distPartNumber";
  @SerializedName(SERIALIZED_NAME_DIST_PART_NUMBER)
  private String distPartNumber;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private CatalogAdminsProductCost cost;

  public ProductSupplierInfo() {
  }

  public ProductSupplierInfo mfgPartNumber(String mfgPartNumber) {
    
    this.mfgPartNumber = mfgPartNumber;
    return this;
  }

   /**
   * Get mfgPartNumber
   * @return mfgPartNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMfgPartNumber() {
    return mfgPartNumber;
  }


  public void setMfgPartNumber(String mfgPartNumber) {
    this.mfgPartNumber = mfgPartNumber;
  }


  public ProductSupplierInfo distPartNumber(String distPartNumber) {
    
    this.distPartNumber = distPartNumber;
    return this;
  }

   /**
   * Get distPartNumber
   * @return distPartNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistPartNumber() {
    return distPartNumber;
  }


  public void setDistPartNumber(String distPartNumber) {
    this.distPartNumber = distPartNumber;
  }


  public ProductSupplierInfo cost(CatalogAdminsProductCost cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogAdminsProductCost getCost() {
    return cost;
  }


  public void setCost(CatalogAdminsProductCost cost) {
    this.cost = cost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSupplierInfo productSupplierInfo = (ProductSupplierInfo) o;
    return Objects.equals(this.mfgPartNumber, productSupplierInfo.mfgPartNumber) &&
        Objects.equals(this.distPartNumber, productSupplierInfo.distPartNumber) &&
        Objects.equals(this.cost, productSupplierInfo.cost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mfgPartNumber, distPartNumber, cost);
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
    sb.append("class ProductSupplierInfo {\n");
    sb.append("    mfgPartNumber: ").append(toIndentedString(mfgPartNumber)).append("\n");
    sb.append("    distPartNumber: ").append(toIndentedString(distPartNumber)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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
    openapiFields.add("mfgPartNumber");
    openapiFields.add("distPartNumber");
    openapiFields.add("cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductSupplierInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductSupplierInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSupplierInfo is not found in the empty JSON string", ProductSupplierInfo.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductSupplierInfo.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSupplierInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("mfgPartNumber") != null && !jsonObj.get("mfgPartNumber").isJsonNull()) && !jsonObj.get("mfgPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mfgPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mfgPartNumber").toString()));
      }
      if ((jsonObj.get("distPartNumber") != null && !jsonObj.get("distPartNumber").isJsonNull()) && !jsonObj.get("distPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distPartNumber").toString()));
      }
      // validate the optional field `cost`
      if (jsonObj.get("cost") != null && !jsonObj.get("cost").isJsonNull()) {
        CatalogAdminsProductCost.validateJsonObject(jsonObj.getAsJsonObject("cost"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSupplierInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSupplierInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSupplierInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSupplierInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSupplierInfo>() {
           @Override
           public void write(JsonWriter out, ProductSupplierInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSupplierInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSupplierInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSupplierInfo
  * @throws IOException if the JSON string is invalid with respect to ProductSupplierInfo
  */
  public static ProductSupplierInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSupplierInfo.class);
  }

 /**
  * Convert an instance of ProductSupplierInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

