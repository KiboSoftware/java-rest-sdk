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
import com.kibocommerce.sdk.catalogstorefront.models.SearchMerchandizingFieldValueBoost;
import com.kibocommerce.sdk.catalogstorefront.models.SearchMerchandizingFilter;
import com.kibocommerce.sdk.catalogstorefront.models.SearchMerchandizingImpactItem;
import com.kibocommerce.sdk.catalogstorefront.models.SearchMerchandizingSortField;
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
 * SearchMerchandizingRule Condition
 */
@ApiModel(description = "SearchMerchandizingRule Condition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchMerchandizingRuleImpact implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RANKED_ITEMS = "rankedItems";
  @SerializedName(SERIALIZED_NAME_RANKED_ITEMS)
  private List<SearchMerchandizingImpactItem> rankedItems = null;

  public static final String SERIALIZED_NAME_BURIED_ITEMS = "buriedItems";
  @SerializedName(SERIALIZED_NAME_BURIED_ITEMS)
  private List<SearchMerchandizingImpactItem> buriedItems = null;

  public static final String SERIALIZED_NAME_EXCLUDED_ITEMS = "excludedItems";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_ITEMS)
  private List<SearchMerchandizingImpactItem> excludedItems = null;

  public static final String SERIALIZED_NAME_SORT_FIELDS = "sortFields";
  @SerializedName(SERIALIZED_NAME_SORT_FIELDS)
  private List<SearchMerchandizingSortField> sortFields = null;

  public static final String SERIALIZED_NAME_FIELD_VALUE_BOOST = "fieldValueBoost";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUE_BOOST)
  private SearchMerchandizingFieldValueBoost fieldValueBoost;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private SearchMerchandizingFilter filter;

  public SearchMerchandizingRuleImpact() {
  }

  public SearchMerchandizingRuleImpact rankedItems(List<SearchMerchandizingImpactItem> rankedItems) {
    
    this.rankedItems = rankedItems;
    return this;
  }

  public SearchMerchandizingRuleImpact addRankedItemsItem(SearchMerchandizingImpactItem rankedItemsItem) {
    if (this.rankedItems == null) {
      this.rankedItems = new ArrayList<>();
    }
    this.rankedItems.add(rankedItemsItem);
    return this;
  }

   /**
   * Get rankedItems
   * @return rankedItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchMerchandizingImpactItem> getRankedItems() {
    return rankedItems;
  }


  public void setRankedItems(List<SearchMerchandizingImpactItem> rankedItems) {
    this.rankedItems = rankedItems;
  }


  public SearchMerchandizingRuleImpact buriedItems(List<SearchMerchandizingImpactItem> buriedItems) {
    
    this.buriedItems = buriedItems;
    return this;
  }

  public SearchMerchandizingRuleImpact addBuriedItemsItem(SearchMerchandizingImpactItem buriedItemsItem) {
    if (this.buriedItems == null) {
      this.buriedItems = new ArrayList<>();
    }
    this.buriedItems.add(buriedItemsItem);
    return this;
  }

   /**
   * Get buriedItems
   * @return buriedItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchMerchandizingImpactItem> getBuriedItems() {
    return buriedItems;
  }


  public void setBuriedItems(List<SearchMerchandizingImpactItem> buriedItems) {
    this.buriedItems = buriedItems;
  }


  public SearchMerchandizingRuleImpact excludedItems(List<SearchMerchandizingImpactItem> excludedItems) {
    
    this.excludedItems = excludedItems;
    return this;
  }

  public SearchMerchandizingRuleImpact addExcludedItemsItem(SearchMerchandizingImpactItem excludedItemsItem) {
    if (this.excludedItems == null) {
      this.excludedItems = new ArrayList<>();
    }
    this.excludedItems.add(excludedItemsItem);
    return this;
  }

   /**
   * Get excludedItems
   * @return excludedItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchMerchandizingImpactItem> getExcludedItems() {
    return excludedItems;
  }


  public void setExcludedItems(List<SearchMerchandizingImpactItem> excludedItems) {
    this.excludedItems = excludedItems;
  }


  public SearchMerchandizingRuleImpact sortFields(List<SearchMerchandizingSortField> sortFields) {
    
    this.sortFields = sortFields;
    return this;
  }

  public SearchMerchandizingRuleImpact addSortFieldsItem(SearchMerchandizingSortField sortFieldsItem) {
    if (this.sortFields == null) {
      this.sortFields = new ArrayList<>();
    }
    this.sortFields.add(sortFieldsItem);
    return this;
  }

   /**
   * Get sortFields
   * @return sortFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SearchMerchandizingSortField> getSortFields() {
    return sortFields;
  }


  public void setSortFields(List<SearchMerchandizingSortField> sortFields) {
    this.sortFields = sortFields;
  }


  public SearchMerchandizingRuleImpact fieldValueBoost(SearchMerchandizingFieldValueBoost fieldValueBoost) {
    
    this.fieldValueBoost = fieldValueBoost;
    return this;
  }

   /**
   * Get fieldValueBoost
   * @return fieldValueBoost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchMerchandizingFieldValueBoost getFieldValueBoost() {
    return fieldValueBoost;
  }


  public void setFieldValueBoost(SearchMerchandizingFieldValueBoost fieldValueBoost) {
    this.fieldValueBoost = fieldValueBoost;
  }


  public SearchMerchandizingRuleImpact filter(SearchMerchandizingFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchMerchandizingFilter getFilter() {
    return filter;
  }


  public void setFilter(SearchMerchandizingFilter filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchMerchandizingRuleImpact searchMerchandizingRuleImpact = (SearchMerchandizingRuleImpact) o;
    return Objects.equals(this.rankedItems, searchMerchandizingRuleImpact.rankedItems) &&
        Objects.equals(this.buriedItems, searchMerchandizingRuleImpact.buriedItems) &&
        Objects.equals(this.excludedItems, searchMerchandizingRuleImpact.excludedItems) &&
        Objects.equals(this.sortFields, searchMerchandizingRuleImpact.sortFields) &&
        Objects.equals(this.fieldValueBoost, searchMerchandizingRuleImpact.fieldValueBoost) &&
        Objects.equals(this.filter, searchMerchandizingRuleImpact.filter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rankedItems, buriedItems, excludedItems, sortFields, fieldValueBoost, filter);
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
    sb.append("class SearchMerchandizingRuleImpact {\n");
    sb.append("    rankedItems: ").append(toIndentedString(rankedItems)).append("\n");
    sb.append("    buriedItems: ").append(toIndentedString(buriedItems)).append("\n");
    sb.append("    excludedItems: ").append(toIndentedString(excludedItems)).append("\n");
    sb.append("    sortFields: ").append(toIndentedString(sortFields)).append("\n");
    sb.append("    fieldValueBoost: ").append(toIndentedString(fieldValueBoost)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("rankedItems");
    openapiFields.add("buriedItems");
    openapiFields.add("excludedItems");
    openapiFields.add("sortFields");
    openapiFields.add("fieldValueBoost");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchMerchandizingRuleImpact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchMerchandizingRuleImpact.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchMerchandizingRuleImpact is not found in the empty JSON string", SearchMerchandizingRuleImpact.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SearchMerchandizingRuleImpact.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchMerchandizingRuleImpact` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("rankedItems") != null && !jsonObj.get("rankedItems").isJsonNull()) {
        JsonArray jsonArrayrankedItems = jsonObj.getAsJsonArray("rankedItems");
        if (jsonArrayrankedItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rankedItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rankedItems` to be an array in the JSON string but got `%s`", jsonObj.get("rankedItems").toString()));
          }

          // validate the optional field `rankedItems` (array)
          for (int i = 0; i < jsonArrayrankedItems.size(); i++) {
            SearchMerchandizingImpactItem.validateJsonObject(jsonArrayrankedItems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("buriedItems") != null && !jsonObj.get("buriedItems").isJsonNull()) {
        JsonArray jsonArrayburiedItems = jsonObj.getAsJsonArray("buriedItems");
        if (jsonArrayburiedItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("buriedItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `buriedItems` to be an array in the JSON string but got `%s`", jsonObj.get("buriedItems").toString()));
          }

          // validate the optional field `buriedItems` (array)
          for (int i = 0; i < jsonArrayburiedItems.size(); i++) {
            SearchMerchandizingImpactItem.validateJsonObject(jsonArrayburiedItems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("excludedItems") != null && !jsonObj.get("excludedItems").isJsonNull()) {
        JsonArray jsonArrayexcludedItems = jsonObj.getAsJsonArray("excludedItems");
        if (jsonArrayexcludedItems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("excludedItems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `excludedItems` to be an array in the JSON string but got `%s`", jsonObj.get("excludedItems").toString()));
          }

          // validate the optional field `excludedItems` (array)
          for (int i = 0; i < jsonArrayexcludedItems.size(); i++) {
            SearchMerchandizingImpactItem.validateJsonObject(jsonArrayexcludedItems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("sortFields") != null && !jsonObj.get("sortFields").isJsonNull()) {
        JsonArray jsonArraysortFields = jsonObj.getAsJsonArray("sortFields");
        if (jsonArraysortFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sortFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sortFields` to be an array in the JSON string but got `%s`", jsonObj.get("sortFields").toString()));
          }

          // validate the optional field `sortFields` (array)
          for (int i = 0; i < jsonArraysortFields.size(); i++) {
            SearchMerchandizingSortField.validateJsonObject(jsonArraysortFields.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `fieldValueBoost`
      if (jsonObj.get("fieldValueBoost") != null && !jsonObj.get("fieldValueBoost").isJsonNull()) {
        SearchMerchandizingFieldValueBoost.validateJsonObject(jsonObj.getAsJsonObject("fieldValueBoost"));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        SearchMerchandizingFilter.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchMerchandizingRuleImpact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchMerchandizingRuleImpact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchMerchandizingRuleImpact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchMerchandizingRuleImpact.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchMerchandizingRuleImpact>() {
           @Override
           public void write(JsonWriter out, SearchMerchandizingRuleImpact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchMerchandizingRuleImpact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchMerchandizingRuleImpact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchMerchandizingRuleImpact
  * @throws IOException if the JSON string is invalid with respect to SearchMerchandizingRuleImpact
  */
  public static SearchMerchandizingRuleImpact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchMerchandizingRuleImpact.class);
  }

 /**
  * Convert an instance of SearchMerchandizingRuleImpact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

