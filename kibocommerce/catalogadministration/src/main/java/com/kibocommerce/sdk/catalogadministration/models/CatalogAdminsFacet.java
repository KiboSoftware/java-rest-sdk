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
import com.kibocommerce.sdk.catalogadministration.models.AdminUserAuditInfo;
import com.kibocommerce.sdk.catalogadministration.models.FacetRangeQuery;
import com.kibocommerce.sdk.catalogadministration.models.FacetSource;
import com.kibocommerce.sdk.catalogadministration.models.FacetValidity;
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
 * The definition of a Facet
 */
@ApiModel(description = "The definition of a Facet")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsFacet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CATEGORY_CODE = "categoryCode";
  @SerializedName(SERIALIZED_NAME_CATEGORY_CODE)
  private String categoryCode;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_FACET_ID = "facetId";
  @SerializedName(SERIALIZED_NAME_FACET_ID)
  private Integer facetId;

  public static final String SERIALIZED_NAME_FACET_TYPE = "facetType";
  @SerializedName(SERIALIZED_NAME_FACET_TYPE)
  private String facetType;

  public static final String SERIALIZED_NAME_IS_HIDDEN = "isHidden";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN)
  private Boolean isHidden;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_OVERRIDE_FACET_ID = "overrideFacetId";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_FACET_ID)
  private Integer overrideFacetId;

  public static final String SERIALIZED_NAME_RANGE_QUERIES = "rangeQueries";
  @SerializedName(SERIALIZED_NAME_RANGE_QUERIES)
  private List<FacetRangeQuery> rangeQueries = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private FacetSource source;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private FacetValidity validity;

  public static final String SERIALIZED_NAME_VALUE_SORT_TYPE = "valueSortType";
  @SerializedName(SERIALIZED_NAME_VALUE_SORT_TYPE)
  private String valueSortType;

  public CatalogAdminsFacet() {
  }

  public CatalogAdminsFacet auditInfo(AdminUserAuditInfo auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminUserAuditInfo getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AdminUserAuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }


  public CatalogAdminsFacet categoryCode(String categoryCode) {
    
    this.categoryCode = categoryCode;
    return this;
  }

   /**
   * The category that the facet is being configured at
   * @return categoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category that the facet is being configured at")

  public String getCategoryCode() {
    return categoryCode;
  }


  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }


  public CatalogAdminsFacet categoryId(Integer categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The category that the facet is being configured at
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category that the facet is being configured at")

  public Integer getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public CatalogAdminsFacet facetId(Integer facetId) {
    
    this.facetId = facetId;
    return this;
  }

   /**
   * The unique identifier for the facet definition
   * @return facetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the facet definition")

  public Integer getFacetId() {
    return facetId;
  }


  public void setFacetId(Integer facetId) {
    this.facetId = facetId;
  }


  public CatalogAdminsFacet facetType(String facetType) {
    
    this.facetType = facetType;
    return this;
  }

   /**
   * The type of facet. Allowable values are: Value, RangeQuery  Must be a valid value for DataType defined in FacetTypeConst.
   * @return facetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of facet. Allowable values are: Value, RangeQuery  Must be a valid value for DataType defined in FacetTypeConst.")

  public String getFacetType() {
    return facetType;
  }


  public void setFacetType(String facetType) {
    this.facetType = facetType;
  }


  public CatalogAdminsFacet isHidden(Boolean isHidden) {
    
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Indicates whether the facet is hidden for the given category
   * @return isHidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the facet is hidden for the given category")

  public Boolean getIsHidden() {
    return isHidden;
  }


  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public CatalogAdminsFacet order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Used to order the display of the facets within a section
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to order the display of the facets within a section")

  public Integer getOrder() {
    return order;
  }


  public void setOrder(Integer order) {
    this.order = order;
  }


  public CatalogAdminsFacet overrideFacetId(Integer overrideFacetId) {
    
    this.overrideFacetId = overrideFacetId;
    return this;
  }

   /**
   * The ID of a parent category&#39;s facet being overriden
   * @return overrideFacetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of a parent category's facet being overriden")

  public Integer getOverrideFacetId() {
    return overrideFacetId;
  }


  public void setOverrideFacetId(Integer overrideFacetId) {
    this.overrideFacetId = overrideFacetId;
  }


  public CatalogAdminsFacet rangeQueries(List<FacetRangeQuery> rangeQueries) {
    
    this.rangeQueries = rangeQueries;
    return this;
  }

  public CatalogAdminsFacet addRangeQueriesItem(FacetRangeQuery rangeQueriesItem) {
    if (this.rangeQueries == null) {
      this.rangeQueries = new ArrayList<>();
    }
    this.rangeQueries.add(rangeQueriesItem);
    return this;
  }

   /**
   * List of ranges if the Facet is of type Range
   * @return rangeQueries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of ranges if the Facet is of type Range")

  public List<FacetRangeQuery> getRangeQueries() {
    return rangeQueries;
  }


  public void setRangeQueries(List<FacetRangeQuery> rangeQueries) {
    this.rangeQueries = rangeQueries;
  }


  public CatalogAdminsFacet source(FacetSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacetSource getSource() {
    return source;
  }


  public void setSource(FacetSource source) {
    this.source = source;
  }


  public CatalogAdminsFacet validity(FacetValidity validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacetValidity getValidity() {
    return validity;
  }


  public void setValidity(FacetValidity validity) {
    this.validity = validity;
  }


  public CatalogAdminsFacet valueSortType(String valueSortType) {
    
    this.valueSortType = valueSortType;
    return this;
  }

   /**
   * Determines how the facet values will be sorted in the store.  Must be a valid value for DataType defined in FacetValueSortTypeConst.  Allowable values are: CountAscending, CountDescending, ValuesAscending, ValuesDescending, AttributeDefinition, AttributeDefinitionDescending. The default if no value is specified will be CountDescending.
   * @return valueSortType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines how the facet values will be sorted in the store.  Must be a valid value for DataType defined in FacetValueSortTypeConst.  Allowable values are: CountAscending, CountDescending, ValuesAscending, ValuesDescending, AttributeDefinition, AttributeDefinitionDescending. The default if no value is specified will be CountDescending.")

  public String getValueSortType() {
    return valueSortType;
  }


  public void setValueSortType(String valueSortType) {
    this.valueSortType = valueSortType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsFacet catalogAdminsFacet = (CatalogAdminsFacet) o;
    return Objects.equals(this.auditInfo, catalogAdminsFacet.auditInfo) &&
        Objects.equals(this.categoryCode, catalogAdminsFacet.categoryCode) &&
        Objects.equals(this.categoryId, catalogAdminsFacet.categoryId) &&
        Objects.equals(this.facetId, catalogAdminsFacet.facetId) &&
        Objects.equals(this.facetType, catalogAdminsFacet.facetType) &&
        Objects.equals(this.isHidden, catalogAdminsFacet.isHidden) &&
        Objects.equals(this.order, catalogAdminsFacet.order) &&
        Objects.equals(this.overrideFacetId, catalogAdminsFacet.overrideFacetId) &&
        Objects.equals(this.rangeQueries, catalogAdminsFacet.rangeQueries) &&
        Objects.equals(this.source, catalogAdminsFacet.source) &&
        Objects.equals(this.validity, catalogAdminsFacet.validity) &&
        Objects.equals(this.valueSortType, catalogAdminsFacet.valueSortType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, categoryCode, categoryId, facetId, facetType, isHidden, order, overrideFacetId, rangeQueries, source, validity, valueSortType);
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
    sb.append("class CatalogAdminsFacet {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    facetId: ").append(toIndentedString(facetId)).append("\n");
    sb.append("    facetType: ").append(toIndentedString(facetType)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    overrideFacetId: ").append(toIndentedString(overrideFacetId)).append("\n");
    sb.append("    rangeQueries: ").append(toIndentedString(rangeQueries)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    valueSortType: ").append(toIndentedString(valueSortType)).append("\n");
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
    openapiFields.add("auditInfo");
    openapiFields.add("categoryCode");
    openapiFields.add("categoryId");
    openapiFields.add("facetId");
    openapiFields.add("facetType");
    openapiFields.add("isHidden");
    openapiFields.add("order");
    openapiFields.add("overrideFacetId");
    openapiFields.add("rangeQueries");
    openapiFields.add("source");
    openapiFields.add("validity");
    openapiFields.add("valueSortType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsFacet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsFacet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsFacet is not found in the empty JSON string", CatalogAdminsFacet.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsFacet.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsFacet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("categoryCode") != null && !jsonObj.get("categoryCode").isJsonNull()) && !jsonObj.get("categoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categoryCode").toString()));
      }
      if ((jsonObj.get("facetType") != null && !jsonObj.get("facetType").isJsonNull()) && !jsonObj.get("facetType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `facetType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("facetType").toString()));
      }
      if (jsonObj.get("rangeQueries") != null && !jsonObj.get("rangeQueries").isJsonNull()) {
        JsonArray jsonArrayrangeQueries = jsonObj.getAsJsonArray("rangeQueries");
        if (jsonArrayrangeQueries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rangeQueries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rangeQueries` to be an array in the JSON string but got `%s`", jsonObj.get("rangeQueries").toString()));
          }

          // validate the optional field `rangeQueries` (array)
          for (int i = 0; i < jsonArrayrangeQueries.size(); i++) {
            FacetRangeQuery.validateJsonObject(jsonArrayrangeQueries.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        FacetSource.validateJsonObject(jsonObj.getAsJsonObject("source"));
      }
      // validate the optional field `validity`
      if (jsonObj.get("validity") != null && !jsonObj.get("validity").isJsonNull()) {
        FacetValidity.validateJsonObject(jsonObj.getAsJsonObject("validity"));
      }
      if ((jsonObj.get("valueSortType") != null && !jsonObj.get("valueSortType").isJsonNull()) && !jsonObj.get("valueSortType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueSortType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueSortType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsFacet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsFacet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsFacet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsFacet.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsFacet>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsFacet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsFacet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsFacet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsFacet
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsFacet
  */
  public static CatalogAdminsFacet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsFacet.class);
  }

 /**
  * Convert an instance of CatalogAdminsFacet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

