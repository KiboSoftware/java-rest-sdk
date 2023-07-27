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
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesFacet;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesProduct;
import com.kibocommerce.sdk.catalogstorefront.models.CatalogRuntimesSpellcheck;
import com.kibocommerce.sdk.catalogstorefront.models.SolrDebugInfo;
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
 * Products and search information returned for search preview query.
 */
@ApiModel(description = "Products and search information returned for search preview query.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductSearchPreviewResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FACETS = "facets";
  @SerializedName(SERIALIZED_NAME_FACETS)
  private List<CatalogRuntimesFacet> facets = null;

  public static final String SERIALIZED_NAME_SOLR_DEBUG_INFO = "solrDebugInfo";
  @SerializedName(SERIALIZED_NAME_SOLR_DEBUG_INFO)
  private SolrDebugInfo solrDebugInfo;

  public static final String SERIALIZED_NAME_SEARCH_REDIRECT = "searchRedirect";
  @SerializedName(SERIALIZED_NAME_SEARCH_REDIRECT)
  private String searchRedirect;

  public static final String SERIALIZED_NAME_SEARCH_ENGINE = "searchEngine";
  @SerializedName(SERIALIZED_NAME_SEARCH_ENGINE)
  private String searchEngine;

  public static final String SERIALIZED_NAME_NEXT_CURSOR_MARK = "nextCursorMark";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR_MARK)
  private String nextCursorMark;

  public static final String SERIALIZED_NAME_SPELLCHECK = "spellcheck";
  @SerializedName(SERIALIZED_NAME_SPELLCHECK)
  private CatalogRuntimesSpellcheck spellcheck;

  public static final String SERIALIZED_NAME_START_INDEX = "startIndex";
  @SerializedName(SERIALIZED_NAME_START_INDEX)
  private Integer startIndex;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "pageCount";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CatalogRuntimesProduct> items = null;

  public ProductSearchPreviewResult() {
  }

  public ProductSearchPreviewResult facets(List<CatalogRuntimesFacet> facets) {
    
    this.facets = facets;
    return this;
  }

  public ProductSearchPreviewResult addFacetsItem(CatalogRuntimesFacet facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

   /**
   * Get facets
   * @return facets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CatalogRuntimesFacet> getFacets() {
    return facets;
  }


  public void setFacets(List<CatalogRuntimesFacet> facets) {
    this.facets = facets;
  }


  public ProductSearchPreviewResult solrDebugInfo(SolrDebugInfo solrDebugInfo) {
    
    this.solrDebugInfo = solrDebugInfo;
    return this;
  }

   /**
   * Get solrDebugInfo
   * @return solrDebugInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SolrDebugInfo getSolrDebugInfo() {
    return solrDebugInfo;
  }


  public void setSolrDebugInfo(SolrDebugInfo solrDebugInfo) {
    this.solrDebugInfo = solrDebugInfo;
  }


  public ProductSearchPreviewResult searchRedirect(String searchRedirect) {
    
    this.searchRedirect = searchRedirect;
    return this;
  }

   /**
   * Get searchRedirect
   * @return searchRedirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSearchRedirect() {
    return searchRedirect;
  }


  public void setSearchRedirect(String searchRedirect) {
    this.searchRedirect = searchRedirect;
  }


  public ProductSearchPreviewResult searchEngine(String searchEngine) {
    
    this.searchEngine = searchEngine;
    return this;
  }

   /**
   * Get searchEngine
   * @return searchEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSearchEngine() {
    return searchEngine;
  }


  public void setSearchEngine(String searchEngine) {
    this.searchEngine = searchEngine;
  }


  public ProductSearchPreviewResult nextCursorMark(String nextCursorMark) {
    
    this.nextCursorMark = nextCursorMark;
    return this;
  }

   /**
   * Get nextCursorMark
   * @return nextCursorMark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNextCursorMark() {
    return nextCursorMark;
  }


  public void setNextCursorMark(String nextCursorMark) {
    this.nextCursorMark = nextCursorMark;
  }


  public ProductSearchPreviewResult spellcheck(CatalogRuntimesSpellcheck spellcheck) {
    
    this.spellcheck = spellcheck;
    return this;
  }

   /**
   * Get spellcheck
   * @return spellcheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CatalogRuntimesSpellcheck getSpellcheck() {
    return spellcheck;
  }


  public void setSpellcheck(CatalogRuntimesSpellcheck spellcheck) {
    this.spellcheck = spellcheck;
  }


  public ProductSearchPreviewResult startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartIndex() {
    return startIndex;
  }


  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public ProductSearchPreviewResult pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ProductSearchPreviewResult pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public ProductSearchPreviewResult totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public ProductSearchPreviewResult items(List<CatalogRuntimesProduct> items) {
    
    this.items = items;
    return this;
  }

  public ProductSearchPreviewResult addItemsItem(CatalogRuntimesProduct itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CatalogRuntimesProduct> getItems() {
    return items;
  }


  public void setItems(List<CatalogRuntimesProduct> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSearchPreviewResult productSearchPreviewResult = (ProductSearchPreviewResult) o;
    return Objects.equals(this.facets, productSearchPreviewResult.facets) &&
        Objects.equals(this.solrDebugInfo, productSearchPreviewResult.solrDebugInfo) &&
        Objects.equals(this.searchRedirect, productSearchPreviewResult.searchRedirect) &&
        Objects.equals(this.searchEngine, productSearchPreviewResult.searchEngine) &&
        Objects.equals(this.nextCursorMark, productSearchPreviewResult.nextCursorMark) &&
        Objects.equals(this.spellcheck, productSearchPreviewResult.spellcheck) &&
        Objects.equals(this.startIndex, productSearchPreviewResult.startIndex) &&
        Objects.equals(this.pageSize, productSearchPreviewResult.pageSize) &&
        Objects.equals(this.pageCount, productSearchPreviewResult.pageCount) &&
        Objects.equals(this.totalCount, productSearchPreviewResult.totalCount) &&
        Objects.equals(this.items, productSearchPreviewResult.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(facets, solrDebugInfo, searchRedirect, searchEngine, nextCursorMark, spellcheck, startIndex, pageSize, pageCount, totalCount, items);
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
    sb.append("class ProductSearchPreviewResult {\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    solrDebugInfo: ").append(toIndentedString(solrDebugInfo)).append("\n");
    sb.append("    searchRedirect: ").append(toIndentedString(searchRedirect)).append("\n");
    sb.append("    searchEngine: ").append(toIndentedString(searchEngine)).append("\n");
    sb.append("    nextCursorMark: ").append(toIndentedString(nextCursorMark)).append("\n");
    sb.append("    spellcheck: ").append(toIndentedString(spellcheck)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("facets");
    openapiFields.add("solrDebugInfo");
    openapiFields.add("searchRedirect");
    openapiFields.add("searchEngine");
    openapiFields.add("nextCursorMark");
    openapiFields.add("spellcheck");
    openapiFields.add("startIndex");
    openapiFields.add("pageSize");
    openapiFields.add("pageCount");
    openapiFields.add("totalCount");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductSearchPreviewResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductSearchPreviewResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSearchPreviewResult is not found in the empty JSON string", ProductSearchPreviewResult.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductSearchPreviewResult.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSearchPreviewResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("facets") != null && !jsonObj.get("facets").isJsonNull()) {
        JsonArray jsonArrayfacets = jsonObj.getAsJsonArray("facets");
        if (jsonArrayfacets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("facets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `facets` to be an array in the JSON string but got `%s`", jsonObj.get("facets").toString()));
          }

          // validate the optional field `facets` (array)
          for (int i = 0; i < jsonArrayfacets.size(); i++) {
            CatalogRuntimesFacet.validateJsonObject(jsonArrayfacets.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `solrDebugInfo`
      if (jsonObj.get("solrDebugInfo") != null && !jsonObj.get("solrDebugInfo").isJsonNull()) {
        SolrDebugInfo.validateJsonObject(jsonObj.getAsJsonObject("solrDebugInfo"));
      }
      if ((jsonObj.get("searchRedirect") != null && !jsonObj.get("searchRedirect").isJsonNull()) && !jsonObj.get("searchRedirect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchRedirect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchRedirect").toString()));
      }
      if ((jsonObj.get("searchEngine") != null && !jsonObj.get("searchEngine").isJsonNull()) && !jsonObj.get("searchEngine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchEngine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchEngine").toString()));
      }
      if ((jsonObj.get("nextCursorMark") != null && !jsonObj.get("nextCursorMark").isJsonNull()) && !jsonObj.get("nextCursorMark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextCursorMark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextCursorMark").toString()));
      }
      // validate the optional field `spellcheck`
      if (jsonObj.get("spellcheck") != null && !jsonObj.get("spellcheck").isJsonNull()) {
        CatalogRuntimesSpellcheck.validateJsonObject(jsonObj.getAsJsonObject("spellcheck"));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            CatalogRuntimesProduct.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSearchPreviewResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSearchPreviewResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSearchPreviewResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSearchPreviewResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSearchPreviewResult>() {
           @Override
           public void write(JsonWriter out, ProductSearchPreviewResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSearchPreviewResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSearchPreviewResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSearchPreviewResult
  * @throws IOException if the JSON string is invalid with respect to ProductSearchPreviewResult
  */
  public static ProductSearchPreviewResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSearchPreviewResult.class);
  }

 /**
  * Convert an instance of ProductSearchPreviewResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
