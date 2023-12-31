/*
 * Inventory
 * Swagger JSON for inventory apis
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.inventory.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.inventory.models.AllocateItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Request needed for allocating inventory
 */
@ApiModel(description = "Request needed for allocating inventory")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AllocateInventoryRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AllocateItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER_DATE = "orderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private String orderDate;

  public static final String SERIALIZED_NAME_ORDER_WEIGHT = "orderWeight";
  @SerializedName(SERIALIZED_NAME_ORDER_WEIGHT)
  private Integer orderWeight;

  public static final String SERIALIZED_NAME_DECREMENT_ON_HAND_ON_DEALLOCATE = "decrementOnHandOnDeallocate";
  @SerializedName(SERIALIZED_NAME_DECREMENT_ON_HAND_ON_DEALLOCATE)
  private Boolean decrementOnHandOnDeallocate;

  public static final String SERIALIZED_NAME_AUTO_ASSIGN = "autoAssign";
  @SerializedName(SERIALIZED_NAME_AUTO_ASSIGN)
  private Boolean autoAssign;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_USER_I_D = "userID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_NUM = "pageNum";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  public AllocateInventoryRequest() {
  }

  public AllocateInventoryRequest items(List<AllocateItem> items) {
    
    this.items = items;
    return this;
  }

  public AllocateInventoryRequest addItemsItem(AllocateItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * list of AllocateItems
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "list of AllocateItems")

  public List<AllocateItem> getItems() {
    return items;
  }


  public void setItems(List<AllocateItem> items) {
    this.items = items;
  }


  public AllocateInventoryRequest orderDate(String orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * order date
   * @return orderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "order date")

  public String getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public AllocateInventoryRequest orderWeight(Integer orderWeight) {
    
    this.orderWeight = orderWeight;
    return this;
  }

   /**
   * order weight
   * @return orderWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "order weight")

  public Integer getOrderWeight() {
    return orderWeight;
  }


  public void setOrderWeight(Integer orderWeight) {
    this.orderWeight = orderWeight;
  }


  public AllocateInventoryRequest decrementOnHandOnDeallocate(Boolean decrementOnHandOnDeallocate) {
    
    this.decrementOnHandOnDeallocate = decrementOnHandOnDeallocate;
    return this;
  }

   /**
   * flag to determine deallocation on decrements
   * @return decrementOnHandOnDeallocate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "flag to determine deallocation on decrements")

  public Boolean getDecrementOnHandOnDeallocate() {
    return decrementOnHandOnDeallocate;
  }


  public void setDecrementOnHandOnDeallocate(Boolean decrementOnHandOnDeallocate) {
    this.decrementOnHandOnDeallocate = decrementOnHandOnDeallocate;
  }


  public AllocateInventoryRequest autoAssign(Boolean autoAssign) {
    
    this.autoAssign = autoAssign;
    return this;
  }

   /**
   * flag to determine whether the allocation was due to auto assignment
   * @return autoAssign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "flag to determine whether the allocation was due to auto assignment")

  public Boolean getAutoAssign() {
    return autoAssign;
  }


  public void setAutoAssign(Boolean autoAssign) {
    this.autoAssign = autoAssign;
  }


  public AllocateInventoryRequest locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Location Code
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Location Code")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public AllocateInventoryRequest userID(Integer userID) {
    
    this.userID = userID;
    return this;
  }

   /**
   * user id
   * @return userID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "user id")

  public Integer getUserID() {
    return userID;
  }


  public void setUserID(Integer userID) {
    this.userID = userID;
  }


  public AllocateInventoryRequest pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * how many results to show per page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "how many results to show per page")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AllocateInventoryRequest pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * which page to show
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "which page to show")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AllocateInventoryRequest sortBy(String sortBy) {
    
    this.sortBy = sortBy;
    return this;
  }

   /**
   * index to sort results by
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "index to sort results by")

  public String getSortBy() {
    return sortBy;
  }


  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocateInventoryRequest allocateInventoryRequest = (AllocateInventoryRequest) o;
    return Objects.equals(this.items, allocateInventoryRequest.items) &&
        Objects.equals(this.orderDate, allocateInventoryRequest.orderDate) &&
        Objects.equals(this.orderWeight, allocateInventoryRequest.orderWeight) &&
        Objects.equals(this.decrementOnHandOnDeallocate, allocateInventoryRequest.decrementOnHandOnDeallocate) &&
        Objects.equals(this.autoAssign, allocateInventoryRequest.autoAssign) &&
        Objects.equals(this.locationCode, allocateInventoryRequest.locationCode) &&
        Objects.equals(this.userID, allocateInventoryRequest.userID) &&
        Objects.equals(this.pageSize, allocateInventoryRequest.pageSize) &&
        Objects.equals(this.pageNum, allocateInventoryRequest.pageNum) &&
        Objects.equals(this.sortBy, allocateInventoryRequest.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, orderDate, orderWeight, decrementOnHandOnDeallocate, autoAssign, locationCode, userID, pageSize, pageNum, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateInventoryRequest {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderWeight: ").append(toIndentedString(orderWeight)).append("\n");
    sb.append("    decrementOnHandOnDeallocate: ").append(toIndentedString(decrementOnHandOnDeallocate)).append("\n");
    sb.append("    autoAssign: ").append(toIndentedString(autoAssign)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("orderDate");
    openapiFields.add("orderWeight");
    openapiFields.add("decrementOnHandOnDeallocate");
    openapiFields.add("autoAssign");
    openapiFields.add("locationCode");
    openapiFields.add("userID");
    openapiFields.add("pageSize");
    openapiFields.add("pageNum");
    openapiFields.add("sortBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AllocateInventoryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AllocateInventoryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllocateInventoryRequest is not found in the empty JSON string", AllocateInventoryRequest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AllocateInventoryRequest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AllocateInventoryRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AllocateInventoryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        AllocateItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("orderDate") != null && !jsonObj.get("orderDate").isJsonNull()) && !jsonObj.get("orderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderDate").toString()));
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("sortBy") != null && !jsonObj.get("sortBy").isJsonNull()) && !jsonObj.get("sortBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sortBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sortBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllocateInventoryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllocateInventoryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllocateInventoryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllocateInventoryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AllocateInventoryRequest>() {
           @Override
           public void write(JsonWriter out, AllocateInventoryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AllocateInventoryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AllocateInventoryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AllocateInventoryRequest
  * @throws IOException if the JSON string is invalid with respect to AllocateInventoryRequest
  */
  public static AllocateInventoryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllocateInventoryRequest.class);
  }

 /**
  * Convert an instance of AllocateInventoryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

