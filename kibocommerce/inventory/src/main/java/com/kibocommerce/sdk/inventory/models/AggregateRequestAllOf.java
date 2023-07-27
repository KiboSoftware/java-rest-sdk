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
import com.kibocommerce.sdk.inventory.models.InventoryItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * AggregateRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AggregateRequestAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<InventoryItem> items = null;

  public static final String SERIALIZED_NAME_IGNORE_SAFETY_STOCK = "ignoreSafetyStock";
  @SerializedName(SERIALIZED_NAME_IGNORE_SAFETY_STOCK)
  private Boolean ignoreSafetyStock;

  public static final String SERIALIZED_NAME_INCLUDE_NEGATIVE_INVENTORY = "includeNegativeInventory";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NEGATIVE_INVENTORY)
  private Boolean includeNegativeInventory;

  public static final String SERIALIZED_NAME_DIRECT_SHIP = "directShip";
  @SerializedName(SERIALIZED_NAME_DIRECT_SHIP)
  private Boolean directShip;

  public static final String SERIALIZED_NAME_TRANSFER_ENABLED = "transferEnabled";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ENABLED)
  private Boolean transferEnabled;

  public static final String SERIALIZED_NAME_PICKUP = "pickup";
  @SerializedName(SERIALIZED_NAME_PICKUP)
  private Boolean pickup;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  /**
   * Include future inventory or not
   */
  @JsonAdapter(IncludeFutureInventoryEnum.Adapter.class)
  public enum IncludeFutureInventoryEnum {
    ONLY("FUTURE_ONLY"),
    
    AND_CURRENT("FUTURE_AND_CURRENT");

    private String value;

    IncludeFutureInventoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IncludeFutureInventoryEnum fromValue(String value) {
      for (IncludeFutureInventoryEnum b : IncludeFutureInventoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IncludeFutureInventoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IncludeFutureInventoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IncludeFutureInventoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IncludeFutureInventoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INCLUDE_FUTURE_INVENTORY = "includeFutureInventory";
  @SerializedName(SERIALIZED_NAME_INCLUDE_FUTURE_INVENTORY)
  private IncludeFutureInventoryEnum includeFutureInventory;

  public static final String SERIALIZED_NAME_INCLUDE_NEGATIVE_FUTURE_INVENTORY = "includeNegativeFutureInventory";
  @SerializedName(SERIALIZED_NAME_INCLUDE_NEGATIVE_FUTURE_INVENTORY)
  private Boolean includeNegativeFutureInventory;

  public static final String SERIALIZED_NAME_FUTURE_START_DATE = "futureStartDate";
  @SerializedName(SERIALIZED_NAME_FUTURE_START_DATE)
  private OffsetDateTime futureStartDate = null;

  public static final String SERIALIZED_NAME_FUTURE_END_DATE = "futureEndDate";
  @SerializedName(SERIALIZED_NAME_FUTURE_END_DATE)
  private OffsetDateTime futureEndDate = null;

  public static final String SERIALIZED_NAME_FORCE_DEFAULTS_FOR_UNSPECIFIED_TAG_CATEGORIES = "forceDefaultsForUnspecifiedTagCategories";
  @SerializedName(SERIALIZED_NAME_FORCE_DEFAULTS_FOR_UNSPECIFIED_TAG_CATEGORIES)
  private Boolean forceDefaultsForUnspecifiedTagCategories;

  public AggregateRequestAllOf() {
  }

  public AggregateRequestAllOf items(List<InventoryItem> items) {
    
    this.items = items;
    return this;
  }

  public AggregateRequestAllOf addItemsItem(InventoryItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of Items to search on
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Items to search on")

  public List<InventoryItem> getItems() {
    return items;
  }


  public void setItems(List<InventoryItem> items) {
    this.items = items;
  }


  public AggregateRequestAllOf ignoreSafetyStock(Boolean ignoreSafetyStock) {
    
    this.ignoreSafetyStock = ignoreSafetyStock;
    return this;
  }

   /**
   * Whether to ignore the safety stock buffer put in place
   * @return ignoreSafetyStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to ignore the safety stock buffer put in place")

  public Boolean getIgnoreSafetyStock() {
    return ignoreSafetyStock;
  }


  public void setIgnoreSafetyStock(Boolean ignoreSafetyStock) {
    this.ignoreSafetyStock = ignoreSafetyStock;
  }


  public AggregateRequestAllOf includeNegativeInventory(Boolean includeNegativeInventory) {
    
    this.includeNegativeInventory = includeNegativeInventory;
    return this;
  }

   /**
   * Whether to allow items with negative inventory in the results
   * @return includeNegativeInventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to allow items with negative inventory in the results")

  public Boolean getIncludeNegativeInventory() {
    return includeNegativeInventory;
  }


  public void setIncludeNegativeInventory(Boolean includeNegativeInventory) {
    this.includeNegativeInventory = includeNegativeInventory;
  }


  public AggregateRequestAllOf directShip(Boolean directShip) {
    
    this.directShip = directShip;
    return this;
  }

   /**
   * Whether to limit results to locations that are shipping enabled
   * @return directShip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to limit results to locations that are shipping enabled")

  public Boolean getDirectShip() {
    return directShip;
  }


  public void setDirectShip(Boolean directShip) {
    this.directShip = directShip;
  }


  public AggregateRequestAllOf transferEnabled(Boolean transferEnabled) {
    
    this.transferEnabled = transferEnabled;
    return this;
  }

   /**
   * Filter results by locations that apply tax (true) or don&#39;t (false)
   * @return transferEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by locations that apply tax (true) or don't (false)")

  public Boolean getTransferEnabled() {
    return transferEnabled;
  }


  public void setTransferEnabled(Boolean transferEnabled) {
    this.transferEnabled = transferEnabled;
  }


  public AggregateRequestAllOf pickup(Boolean pickup) {
    
    this.pickup = pickup;
    return this;
  }

   /**
   * Filter results by pickup enabled (true) or not (false)
   * @return pickup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by pickup enabled (true) or not (false)")

  public Boolean getPickup() {
    return pickup;
  }


  public void setPickup(Boolean pickup) {
    this.pickup = pickup;
  }


  public AggregateRequestAllOf tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public AggregateRequestAllOf putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Associative Map of &lt;String, String&gt; for tagCategoryName &#x3D;&gt; tagName
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associative Map of <String, String> for tagCategoryName => tagName")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public AggregateRequestAllOf includeFutureInventory(IncludeFutureInventoryEnum includeFutureInventory) {
    
    this.includeFutureInventory = includeFutureInventory;
    return this;
  }

   /**
   * Include future inventory or not
   * @return includeFutureInventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include future inventory or not")

  public IncludeFutureInventoryEnum getIncludeFutureInventory() {
    return includeFutureInventory;
  }


  public void setIncludeFutureInventory(IncludeFutureInventoryEnum includeFutureInventory) {
    this.includeFutureInventory = includeFutureInventory;
  }


  public AggregateRequestAllOf includeNegativeFutureInventory(Boolean includeNegativeFutureInventory) {
    
    this.includeNegativeFutureInventory = includeNegativeFutureInventory;
    return this;
  }

   /**
   * Whether to allow items with negative future inventory in the results
   * @return includeNegativeFutureInventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to allow items with negative future inventory in the results")

  public Boolean getIncludeNegativeFutureInventory() {
    return includeNegativeFutureInventory;
  }


  public void setIncludeNegativeFutureInventory(Boolean includeNegativeFutureInventory) {
    this.includeNegativeFutureInventory = includeNegativeFutureInventory;
  }


  public AggregateRequestAllOf futureStartDate(OffsetDateTime futureStartDate) {
    
    this.futureStartDate = futureStartDate;
    return this;
  }

   /**
   * Future start Date at which the inventory should be allocated against.
   * @return futureStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Future start Date at which the inventory should be allocated against.")

  public OffsetDateTime getFutureStartDate() {
    return futureStartDate;
  }


  public void setFutureStartDate(OffsetDateTime futureStartDate) {
    this.futureStartDate = futureStartDate;
  }


  public AggregateRequestAllOf futureEndDate(OffsetDateTime futureEndDate) {
    
    this.futureEndDate = futureEndDate;
    return this;
  }

   /**
   * Future end Date at which the inventory should be allocated against.
   * @return futureEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Future end Date at which the inventory should be allocated against.")

  public OffsetDateTime getFutureEndDate() {
    return futureEndDate;
  }


  public void setFutureEndDate(OffsetDateTime futureEndDate) {
    this.futureEndDate = futureEndDate;
  }


  public AggregateRequestAllOf forceDefaultsForUnspecifiedTagCategories(Boolean forceDefaultsForUnspecifiedTagCategories) {
    
    this.forceDefaultsForUnspecifiedTagCategories = forceDefaultsForUnspecifiedTagCategories;
    return this;
  }

   /**
   * Whether to force populate default tags onto the request if they are unspecified for any tag category
   * @return forceDefaultsForUnspecifiedTagCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to force populate default tags onto the request if they are unspecified for any tag category")

  public Boolean getForceDefaultsForUnspecifiedTagCategories() {
    return forceDefaultsForUnspecifiedTagCategories;
  }


  public void setForceDefaultsForUnspecifiedTagCategories(Boolean forceDefaultsForUnspecifiedTagCategories) {
    this.forceDefaultsForUnspecifiedTagCategories = forceDefaultsForUnspecifiedTagCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateRequestAllOf aggregateRequestAllOf = (AggregateRequestAllOf) o;
    return Objects.equals(this.items, aggregateRequestAllOf.items) &&
        Objects.equals(this.ignoreSafetyStock, aggregateRequestAllOf.ignoreSafetyStock) &&
        Objects.equals(this.includeNegativeInventory, aggregateRequestAllOf.includeNegativeInventory) &&
        Objects.equals(this.directShip, aggregateRequestAllOf.directShip) &&
        Objects.equals(this.transferEnabled, aggregateRequestAllOf.transferEnabled) &&
        Objects.equals(this.pickup, aggregateRequestAllOf.pickup) &&
        Objects.equals(this.tags, aggregateRequestAllOf.tags) &&
        Objects.equals(this.includeFutureInventory, aggregateRequestAllOf.includeFutureInventory) &&
        Objects.equals(this.includeNegativeFutureInventory, aggregateRequestAllOf.includeNegativeFutureInventory) &&
        Objects.equals(this.futureStartDate, aggregateRequestAllOf.futureStartDate) &&
        Objects.equals(this.futureEndDate, aggregateRequestAllOf.futureEndDate) &&
        Objects.equals(this.forceDefaultsForUnspecifiedTagCategories, aggregateRequestAllOf.forceDefaultsForUnspecifiedTagCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, ignoreSafetyStock, includeNegativeInventory, directShip, transferEnabled, pickup, tags, includeFutureInventory, includeNegativeFutureInventory, futureStartDate, futureEndDate, forceDefaultsForUnspecifiedTagCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateRequestAllOf {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    ignoreSafetyStock: ").append(toIndentedString(ignoreSafetyStock)).append("\n");
    sb.append("    includeNegativeInventory: ").append(toIndentedString(includeNegativeInventory)).append("\n");
    sb.append("    directShip: ").append(toIndentedString(directShip)).append("\n");
    sb.append("    transferEnabled: ").append(toIndentedString(transferEnabled)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    includeFutureInventory: ").append(toIndentedString(includeFutureInventory)).append("\n");
    sb.append("    includeNegativeFutureInventory: ").append(toIndentedString(includeNegativeFutureInventory)).append("\n");
    sb.append("    futureStartDate: ").append(toIndentedString(futureStartDate)).append("\n");
    sb.append("    futureEndDate: ").append(toIndentedString(futureEndDate)).append("\n");
    sb.append("    forceDefaultsForUnspecifiedTagCategories: ").append(toIndentedString(forceDefaultsForUnspecifiedTagCategories)).append("\n");
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
    openapiFields.add("ignoreSafetyStock");
    openapiFields.add("includeNegativeInventory");
    openapiFields.add("directShip");
    openapiFields.add("transferEnabled");
    openapiFields.add("pickup");
    openapiFields.add("tags");
    openapiFields.add("includeFutureInventory");
    openapiFields.add("includeNegativeFutureInventory");
    openapiFields.add("futureStartDate");
    openapiFields.add("futureEndDate");
    openapiFields.add("forceDefaultsForUnspecifiedTagCategories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AggregateRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AggregateRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AggregateRequestAllOf is not found in the empty JSON string", AggregateRequestAllOf.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AggregateRequestAllOf.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AggregateRequestAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            InventoryItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("includeFutureInventory") != null && !jsonObj.get("includeFutureInventory").isJsonNull()) && !jsonObj.get("includeFutureInventory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `includeFutureInventory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("includeFutureInventory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AggregateRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AggregateRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AggregateRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AggregateRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<AggregateRequestAllOf>() {
           @Override
           public void write(JsonWriter out, AggregateRequestAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AggregateRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AggregateRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AggregateRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to AggregateRequestAllOf
  */
  public static AggregateRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AggregateRequestAllOf.class);
  }

 /**
  * Convert an instance of AggregateRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
