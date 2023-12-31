/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesFutureInventory;
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
 * The inventory for a product at a specific Location
 */
@ApiModel(description = "The inventory for a product at a specific Location")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LocationInventory implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "productCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_STOCK_AVAILABLE = "stockAvailable";
  @SerializedName(SERIALIZED_NAME_STOCK_AVAILABLE)
  private Integer stockAvailable;

  public static final String SERIALIZED_NAME_SOFT_STOCK_AVAILABLE = "softStockAvailable";
  @SerializedName(SERIALIZED_NAME_SOFT_STOCK_AVAILABLE)
  private Integer softStockAvailable;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_MFG_PART_NUMBER = "mfgPartNumber";
  @SerializedName(SERIALIZED_NAME_MFG_PART_NUMBER)
  private String mfgPartNumber;

  public static final String SERIALIZED_NAME_FUTURE_INVENTORIES = "futureInventories";
  @SerializedName(SERIALIZED_NAME_FUTURE_INVENTORIES)
  private List<CatalogRuntimesFutureInventory> futureInventories = null;

  public LocationInventory() {
  }

  public LocationInventory productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public LocationInventory locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public LocationInventory stockAvailable(Integer stockAvailable) {
    
    this.stockAvailable = stockAvailable;
    return this;
  }

   /**
   * Get stockAvailable
   * @return stockAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStockAvailable() {
    return stockAvailable;
  }


  public void setStockAvailable(Integer stockAvailable) {
    this.stockAvailable = stockAvailable;
  }


  public LocationInventory softStockAvailable(Integer softStockAvailable) {
    
    this.softStockAvailable = softStockAvailable;
    return this;
  }

   /**
   * Get softStockAvailable
   * @return softStockAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSoftStockAvailable() {
    return softStockAvailable;
  }


  public void setSoftStockAvailable(Integer softStockAvailable) {
    this.softStockAvailable = softStockAvailable;
  }


  public LocationInventory sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public LocationInventory mfgPartNumber(String mfgPartNumber) {
    
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


  public LocationInventory futureInventories(List<CatalogRuntimesFutureInventory> futureInventories) {
    
    this.futureInventories = futureInventories;
    return this;
  }

  public LocationInventory addFutureInventoriesItem(CatalogRuntimesFutureInventory futureInventoriesItem) {
    if (this.futureInventories == null) {
      this.futureInventories = new ArrayList<>();
    }
    this.futureInventories.add(futureInventoriesItem);
    return this;
  }

   /**
   * Get futureInventories
   * @return futureInventories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CatalogRuntimesFutureInventory> getFutureInventories() {
    return futureInventories;
  }


  public void setFutureInventories(List<CatalogRuntimesFutureInventory> futureInventories) {
    this.futureInventories = futureInventories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationInventory locationInventory = (LocationInventory) o;
    return Objects.equals(this.productCode, locationInventory.productCode) &&
        Objects.equals(this.locationCode, locationInventory.locationCode) &&
        Objects.equals(this.stockAvailable, locationInventory.stockAvailable) &&
        Objects.equals(this.softStockAvailable, locationInventory.softStockAvailable) &&
        Objects.equals(this.sku, locationInventory.sku) &&
        Objects.equals(this.mfgPartNumber, locationInventory.mfgPartNumber) &&
        Objects.equals(this.futureInventories, locationInventory.futureInventories);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, locationCode, stockAvailable, softStockAvailable, sku, mfgPartNumber, futureInventories);
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
    sb.append("class LocationInventory {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    stockAvailable: ").append(toIndentedString(stockAvailable)).append("\n");
    sb.append("    softStockAvailable: ").append(toIndentedString(softStockAvailable)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    mfgPartNumber: ").append(toIndentedString(mfgPartNumber)).append("\n");
    sb.append("    futureInventories: ").append(toIndentedString(futureInventories)).append("\n");
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
    openapiFields.add("productCode");
    openapiFields.add("locationCode");
    openapiFields.add("stockAvailable");
    openapiFields.add("softStockAvailable");
    openapiFields.add("sku");
    openapiFields.add("mfgPartNumber");
    openapiFields.add("futureInventories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationInventory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationInventory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationInventory is not found in the empty JSON string", LocationInventory.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!LocationInventory.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocationInventory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("productCode") != null && !jsonObj.get("productCode").isJsonNull()) && !jsonObj.get("productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCode").toString()));
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("mfgPartNumber") != null && !jsonObj.get("mfgPartNumber").isJsonNull()) && !jsonObj.get("mfgPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mfgPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mfgPartNumber").toString()));
      }
      if (jsonObj.get("futureInventories") != null && !jsonObj.get("futureInventories").isJsonNull()) {
        JsonArray jsonArrayfutureInventories = jsonObj.getAsJsonArray("futureInventories");
        if (jsonArrayfutureInventories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("futureInventories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `futureInventories` to be an array in the JSON string but got `%s`", jsonObj.get("futureInventories").toString()));
          }

          // validate the optional field `futureInventories` (array)
          for (int i = 0; i < jsonArrayfutureInventories.size(); i++) {
            CatalogRuntimesFutureInventory.validateJsonObject(jsonArrayfutureInventories.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationInventory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationInventory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationInventory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationInventory.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationInventory>() {
           @Override
           public void write(JsonWriter out, LocationInventory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocationInventory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocationInventory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationInventory
  * @throws IOException if the JSON string is invalid with respect to LocationInventory
  */
  public static LocationInventory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationInventory.class);
  }

 /**
  * Convert an instance of LocationInventory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

