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
import com.kibocommerce.sdk.catalogadministration.models.ProductRuleCode;
import com.kibocommerce.sdk.catalogadministration.models.ShipmentRuleCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ShipmentReleaseRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShipmentReleaseRule implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTE_SELECTION = "attributeSelection";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_SELECTION)
  private Object attributeSelection = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CUSTOMER_RULES = "customerRules";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_RULES)
  private List<String> customerRules = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_LOCATION_CODES = "locationCodes";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODES)
  private List<String> locationCodes = null;

  public static final String SERIALIZED_NAME_LOCATION_GROUPS = "locationGroups";
  @SerializedName(SERIALIZED_NAME_LOCATION_GROUPS)
  private List<String> locationGroups = null;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private Object metaData = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRODUCT_RULES = "productRules";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RULES)
  private List<ProductRuleCode> productRules = null;

  public static final String SERIALIZED_NAME_RANK = "rank";
  @SerializedName(SERIALIZED_NAME_RANK)
  private Integer rank;

  public static final String SERIALIZED_NAME_SHIPMENT_RULES = "shipmentRules";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_RULES)
  private List<ShipmentRuleCode> shipmentRules = null;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public ShipmentReleaseRule() {
  }

  public ShipmentReleaseRule attributeSelection(Object attributeSelection) {
    
    this.attributeSelection = attributeSelection;
    return this;
  }

   /**
   * Get attributeSelection
   * @return attributeSelection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAttributeSelection() {
    return attributeSelection;
  }


  public void setAttributeSelection(Object attributeSelection) {
    this.attributeSelection = attributeSelection;
  }


  public ShipmentReleaseRule auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public ShipmentReleaseRule code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ShipmentReleaseRule customerRules(List<String> customerRules) {
    
    this.customerRules = customerRules;
    return this;
  }

  public ShipmentReleaseRule addCustomerRulesItem(String customerRulesItem) {
    if (this.customerRules == null) {
      this.customerRules = new ArrayList<>();
    }
    this.customerRules.add(customerRulesItem);
    return this;
  }

   /**
   * Get customerRules
   * @return customerRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCustomerRules() {
    return customerRules;
  }


  public void setCustomerRules(List<String> customerRules) {
    this.customerRules = customerRules;
  }


  public ShipmentReleaseRule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ShipmentReleaseRule enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ShipmentReleaseRule endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End of the rule&#39;s effective window. Null &#x3D; never expires. Must be &gt;&#x3D; StartDate when both supplied.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End of the rule's effective window. Null = never expires. Must be >= StartDate when both supplied.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public ShipmentReleaseRule isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only. Computed server-side: true when the current UTC instant is inside the effective window (StartDate null/≤now AND EndDate null/≥now), false otherwise. A rule with no dates is always active. This reflects the effective window alone and does not incorporate the enabled flag.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public ShipmentReleaseRule locationCodes(List<String> locationCodes) {
    
    this.locationCodes = locationCodes;
    return this;
  }

  public ShipmentReleaseRule addLocationCodesItem(String locationCodesItem) {
    if (this.locationCodes == null) {
      this.locationCodes = new ArrayList<>();
    }
    this.locationCodes.add(locationCodesItem);
    return this;
  }

   /**
   * Get locationCodes
   * @return locationCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocationCodes() {
    return locationCodes;
  }


  public void setLocationCodes(List<String> locationCodes) {
    this.locationCodes = locationCodes;
  }


  public ShipmentReleaseRule locationGroups(List<String> locationGroups) {
    
    this.locationGroups = locationGroups;
    return this;
  }

  public ShipmentReleaseRule addLocationGroupsItem(String locationGroupsItem) {
    if (this.locationGroups == null) {
      this.locationGroups = new ArrayList<>();
    }
    this.locationGroups.add(locationGroupsItem);
    return this;
  }

   /**
   * Get locationGroups
   * @return locationGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocationGroups() {
    return locationGroups;
  }


  public void setLocationGroups(List<String> locationGroups) {
    this.locationGroups = locationGroups;
  }


  public ShipmentReleaseRule metaData(Object metaData) {
    
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetaData() {
    return metaData;
  }


  public void setMetaData(Object metaData) {
    this.metaData = metaData;
  }


  public ShipmentReleaseRule name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ShipmentReleaseRule productRules(List<ProductRuleCode> productRules) {
    
    this.productRules = productRules;
    return this;
  }

  public ShipmentReleaseRule addProductRulesItem(ProductRuleCode productRulesItem) {
    if (this.productRules == null) {
      this.productRules = new ArrayList<>();
    }
    this.productRules.add(productRulesItem);
    return this;
  }

   /**
   * Get productRules
   * @return productRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProductRuleCode> getProductRules() {
    return productRules;
  }


  public void setProductRules(List<ProductRuleCode> productRules) {
    this.productRules = productRules;
  }


  public ShipmentReleaseRule rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRank() {
    return rank;
  }


  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public ShipmentReleaseRule shipmentRules(List<ShipmentRuleCode> shipmentRules) {
    
    this.shipmentRules = shipmentRules;
    return this;
  }

  public ShipmentReleaseRule addShipmentRulesItem(ShipmentRuleCode shipmentRulesItem) {
    if (this.shipmentRules == null) {
      this.shipmentRules = new ArrayList<>();
    }
    this.shipmentRules.add(shipmentRulesItem);
    return this;
  }

   /**
   * Get shipmentRules
   * @return shipmentRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ShipmentRuleCode> getShipmentRules() {
    return shipmentRules;
  }


  public void setShipmentRules(List<ShipmentRuleCode> shipmentRules) {
    this.shipmentRules = shipmentRules;
  }


  public ShipmentReleaseRule startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start of the rule&#39;s effective window. Null &#x3D; no lower bound (already active).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start of the rule's effective window. Null = no lower bound (already active).")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentReleaseRule shipmentReleaseRule = (ShipmentReleaseRule) o;
    return Objects.equals(this.attributeSelection, shipmentReleaseRule.attributeSelection) &&
        Objects.equals(this.auditInfo, shipmentReleaseRule.auditInfo) &&
        Objects.equals(this.code, shipmentReleaseRule.code) &&
        Objects.equals(this.customerRules, shipmentReleaseRule.customerRules) &&
        Objects.equals(this.description, shipmentReleaseRule.description) &&
        Objects.equals(this.enabled, shipmentReleaseRule.enabled) &&
        Objects.equals(this.endDate, shipmentReleaseRule.endDate) &&
        Objects.equals(this.isActive, shipmentReleaseRule.isActive) &&
        Objects.equals(this.locationCodes, shipmentReleaseRule.locationCodes) &&
        Objects.equals(this.locationGroups, shipmentReleaseRule.locationGroups) &&
        Objects.equals(this.metaData, shipmentReleaseRule.metaData) &&
        Objects.equals(this.name, shipmentReleaseRule.name) &&
        Objects.equals(this.productRules, shipmentReleaseRule.productRules) &&
        Objects.equals(this.rank, shipmentReleaseRule.rank) &&
        Objects.equals(this.shipmentRules, shipmentReleaseRule.shipmentRules) &&
        Objects.equals(this.startDate, shipmentReleaseRule.startDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeSelection, auditInfo, code, customerRules, description, enabled, endDate, isActive, locationCodes, locationGroups, metaData, name, productRules, rank, shipmentRules, startDate);
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
    sb.append("class ShipmentReleaseRule {\n");
    sb.append("    attributeSelection: ").append(toIndentedString(attributeSelection)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    customerRules: ").append(toIndentedString(customerRules)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    locationCodes: ").append(toIndentedString(locationCodes)).append("\n");
    sb.append("    locationGroups: ").append(toIndentedString(locationGroups)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productRules: ").append(toIndentedString(productRules)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    shipmentRules: ").append(toIndentedString(shipmentRules)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("attributeSelection");
    openapiFields.add("auditInfo");
    openapiFields.add("code");
    openapiFields.add("customerRules");
    openapiFields.add("description");
    openapiFields.add("enabled");
    openapiFields.add("endDate");
    openapiFields.add("isActive");
    openapiFields.add("locationCodes");
    openapiFields.add("locationGroups");
    openapiFields.add("metaData");
    openapiFields.add("name");
    openapiFields.add("productRules");
    openapiFields.add("rank");
    openapiFields.add("shipmentRules");
    openapiFields.add("startDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ShipmentReleaseRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ShipmentReleaseRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ShipmentReleaseRule is not found in the empty JSON string", ShipmentReleaseRule.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ShipmentReleaseRule.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ShipmentReleaseRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("customerRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerRules` to be an array in the JSON string but got `%s`", jsonObj.get("customerRules").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("locationCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCodes` to be an array in the JSON string but got `%s`", jsonObj.get("locationCodes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("locationGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationGroups` to be an array in the JSON string but got `%s`", jsonObj.get("locationGroups").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("productRules") != null && !jsonObj.get("productRules").isJsonNull()) {
        JsonArray jsonArrayproductRules = jsonObj.getAsJsonArray("productRules");
        if (jsonArrayproductRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productRules` to be an array in the JSON string but got `%s`", jsonObj.get("productRules").toString()));
          }

          // validate the optional field `productRules` (array)
          for (int i = 0; i < jsonArrayproductRules.size(); i++) {
            ProductRuleCode.validateJsonObject(jsonArrayproductRules.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("shipmentRules") != null && !jsonObj.get("shipmentRules").isJsonNull()) {
        JsonArray jsonArrayshipmentRules = jsonObj.getAsJsonArray("shipmentRules");
        if (jsonArrayshipmentRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipmentRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipmentRules` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentRules").toString()));
          }

          // validate the optional field `shipmentRules` (array)
          for (int i = 0; i < jsonArrayshipmentRules.size(); i++) {
            ShipmentRuleCode.validateJsonObject(jsonArrayshipmentRules.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShipmentReleaseRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShipmentReleaseRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShipmentReleaseRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShipmentReleaseRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ShipmentReleaseRule>() {
           @Override
           public void write(JsonWriter out, ShipmentReleaseRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShipmentReleaseRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShipmentReleaseRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShipmentReleaseRule
  * @throws IOException if the JSON string is invalid with respect to ShipmentReleaseRule
  */
  public static ShipmentReleaseRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShipmentReleaseRule.class);
  }

 /**
  * Convert an instance of ShipmentReleaseRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

