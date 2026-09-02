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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Represents a claimable item that allows a user to use one or more discounts.
 */
@ApiModel(description = "Represents a claimable item that allows a user to use one or more discounts.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CouponSet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ASSIGNED_DISCOUNT_COUNT = "assignedDiscountCount";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_DISCOUNT_COUNT)
  private Integer assignedDiscountCount;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CAN_BE_DELETED = "canBeDeleted";
  @SerializedName(SERIALIZED_NAME_CAN_BE_DELETED)
  private Boolean canBeDeleted;

  public static final String SERIALIZED_NAME_COUPON_CODE_COUNT = "couponCodeCount";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE_COUNT)
  private Integer couponCodeCount;

  public static final String SERIALIZED_NAME_COUPON_CODE_TYPE = "couponCodeType";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE_TYPE)
  private String couponCodeType;

  public static final String SERIALIZED_NAME_COUPON_SET_CODE = "couponSetCode";
  @SerializedName(SERIALIZED_NAME_COUPON_SET_CODE)
  private String couponSetCode;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MAX_REDEMPTIONS_PER_COUPON_CODE = "maxRedemptionsPerCouponCode";
  @SerializedName(SERIALIZED_NAME_MAX_REDEMPTIONS_PER_COUPON_CODE)
  private Integer maxRedemptionsPerCouponCode;

  public static final String SERIALIZED_NAME_MAX_REDEMPTIONS_PER_USER = "maxRedemptionsPerUser";
  @SerializedName(SERIALIZED_NAME_MAX_REDEMPTIONS_PER_USER)
  private Integer maxRedemptionsPerUser;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REDEMPTION_COUNT = "redemptionCount";
  @SerializedName(SERIALIZED_NAME_REDEMPTION_COUNT)
  private Integer redemptionCount;

  public static final String SERIALIZED_NAME_SET_SIZE = "setSize";
  @SerializedName(SERIALIZED_NAME_SET_SIZE)
  private Integer setSize;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public CouponSet() {
  }

  public CouponSet assignedDiscountCount(Integer assignedDiscountCount) {
    
    this.assignedDiscountCount = assignedDiscountCount;
    return this;
  }

   /**
   * ReadOnly sum of all redemptions for this coupon. Use \&quot;counts\&quot; response group.
   * @return assignedDiscountCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReadOnly sum of all redemptions for this coupon. Use \"counts\" response group.")

  public Integer getAssignedDiscountCount() {
    return assignedDiscountCount;
  }


  public void setAssignedDiscountCount(Integer assignedDiscountCount) {
    this.assignedDiscountCount = assignedDiscountCount;
  }


  public CouponSet auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public CouponSet canBeDeleted(Boolean canBeDeleted) {
    
    this.canBeDeleted = canBeDeleted;
    return this;
  }

   /**
   * Signifies that the coupon has not been exported and can be updated ReadOnly
   * @return canBeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Signifies that the coupon has not been exported and can be updated ReadOnly")

  public Boolean getCanBeDeleted() {
    return canBeDeleted;
  }


  public void setCanBeDeleted(Boolean canBeDeleted) {
    this.canBeDeleted = canBeDeleted;
  }


  public CouponSet couponCodeCount(Integer couponCodeCount) {
    
    this.couponCodeCount = couponCodeCount;
    return this;
  }

   /**
   * Count of associated couponCodes. Must use \&quot;counts\&quot; response group to get this value ReadOnly
   * @return couponCodeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of associated couponCodes. Must use \"counts\" response group to get this value ReadOnly")

  public Integer getCouponCodeCount() {
    return couponCodeCount;
  }


  public void setCouponCodeCount(Integer couponCodeCount) {
    this.couponCodeCount = couponCodeCount;
  }


  public CouponSet couponCodeType(String couponCodeType) {
    
    this.couponCodeType = couponCodeType;
    return this;
  }

   /**
   * Determines if the coupon is a persisted list of codes (static) or a list based on generated specification (dynamic).
   * @return couponCodeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines if the coupon is a persisted list of codes (static) or a list based on generated specification (dynamic).")

  public String getCouponCodeType() {
    return couponCodeType;
  }


  public void setCouponCodeType(String couponCodeType) {
    this.couponCodeType = couponCodeType;
  }


  public CouponSet couponSetCode(String couponSetCode) {
    
    this.couponSetCode = couponSetCode;
    return this;
  }

   /**
   * Unique tenant supplied identifier. Used as the prefix for generated sets. Required System generated if left null.
   * @return couponSetCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique tenant supplied identifier. Used as the prefix for generated sets. Required System generated if left null.")

  public String getCouponSetCode() {
    return couponSetCode;
  }


  public void setCouponSetCode(String couponSetCode) {
    this.couponSetCode = couponSetCode;
  }


  public CouponSet endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Date and time that the coupon codes becomes expired
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time that the coupon codes becomes expired")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public CouponSet id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Internal unique identifier of the couponset. System-supplied and read-only.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal unique identifier of the couponset. System-supplied and read-only.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CouponSet maxRedemptionsPerCouponCode(Integer maxRedemptionsPerCouponCode) {
    
    this.maxRedemptionsPerCouponCode = maxRedemptionsPerCouponCode;
    return this;
  }

   /**
   * Maximum number of times any code can de used. Must be null or &gt;&#x3D; 1 (0 is invalid). Defaults to 1 on creation if null.
   * @return maxRedemptionsPerCouponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of times any code can de used. Must be null or >= 1 (0 is invalid). Defaults to 1 on creation if null.")

  public Integer getMaxRedemptionsPerCouponCode() {
    return maxRedemptionsPerCouponCode;
  }


  public void setMaxRedemptionsPerCouponCode(Integer maxRedemptionsPerCouponCode) {
    this.maxRedemptionsPerCouponCode = maxRedemptionsPerCouponCode;
  }


  public CouponSet maxRedemptionsPerUser(Integer maxRedemptionsPerUser) {
    
    this.maxRedemptionsPerUser = maxRedemptionsPerUser;
    return this;
  }

   /**
   * Maximum number of times any single user can redeem any code. Must be null or &gt;&#x3D; 1 (0 is invalid). Defaults to 1 on creation only when legacy tenant behavior is enabled; otherwise null is preserved.
   * @return maxRedemptionsPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of times any single user can redeem any code. Must be null or >= 1 (0 is invalid). Defaults to 1 on creation only when legacy tenant behavior is enabled; otherwise null is preserved.")

  public Integer getMaxRedemptionsPerUser() {
    return maxRedemptionsPerUser;
  }


  public void setMaxRedemptionsPerUser(Integer maxRedemptionsPerUser) {
    this.maxRedemptionsPerUser = maxRedemptionsPerUser;
  }


  public CouponSet name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * CouponSet Name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "CouponSet Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CouponSet redemptionCount(Integer redemptionCount) {
    
    this.redemptionCount = redemptionCount;
    return this;
  }

   /**
   * ReadOnly count of all redemptions for this coupon set.
   * @return redemptionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReadOnly count of all redemptions for this coupon set.")

  public Integer getRedemptionCount() {
    return redemptionCount;
  }


  public void setRedemptionCount(Integer redemptionCount) {
    this.redemptionCount = redemptionCount;
  }


  public CouponSet setSize(Integer setSize) {
    
    this.setSize = setSize;
    return this;
  }

   /**
   * Sets the number of codes to generate for dynamic coupons Required when CouponCodeType is \&quot;Dynamic\&quot;
   * @return setSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the number of codes to generate for dynamic coupons Required when CouponCodeType is \"Dynamic\"")

  public Integer getSetSize() {
    return setSize;
  }


  public void setSetSize(Integer setSize) {
    this.setSize = setSize;
  }


  public CouponSet startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Date and time that the coupon codes becomes active
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time that the coupon codes becomes active")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CouponSet status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * CouponSet status which can be: Active, Expired,  Inactive System-supplied and read-only.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CouponSet status which can be: Active, Expired,  Inactive System-supplied and read-only.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponSet couponSet = (CouponSet) o;
    return Objects.equals(this.assignedDiscountCount, couponSet.assignedDiscountCount) &&
        Objects.equals(this.auditInfo, couponSet.auditInfo) &&
        Objects.equals(this.canBeDeleted, couponSet.canBeDeleted) &&
        Objects.equals(this.couponCodeCount, couponSet.couponCodeCount) &&
        Objects.equals(this.couponCodeType, couponSet.couponCodeType) &&
        Objects.equals(this.couponSetCode, couponSet.couponSetCode) &&
        Objects.equals(this.endDate, couponSet.endDate) &&
        Objects.equals(this.id, couponSet.id) &&
        Objects.equals(this.maxRedemptionsPerCouponCode, couponSet.maxRedemptionsPerCouponCode) &&
        Objects.equals(this.maxRedemptionsPerUser, couponSet.maxRedemptionsPerUser) &&
        Objects.equals(this.name, couponSet.name) &&
        Objects.equals(this.redemptionCount, couponSet.redemptionCount) &&
        Objects.equals(this.setSize, couponSet.setSize) &&
        Objects.equals(this.startDate, couponSet.startDate) &&
        Objects.equals(this.status, couponSet.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedDiscountCount, auditInfo, canBeDeleted, couponCodeCount, couponCodeType, couponSetCode, endDate, id, maxRedemptionsPerCouponCode, maxRedemptionsPerUser, name, redemptionCount, setSize, startDate, status);
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
    sb.append("class CouponSet {\n");
    sb.append("    assignedDiscountCount: ").append(toIndentedString(assignedDiscountCount)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    canBeDeleted: ").append(toIndentedString(canBeDeleted)).append("\n");
    sb.append("    couponCodeCount: ").append(toIndentedString(couponCodeCount)).append("\n");
    sb.append("    couponCodeType: ").append(toIndentedString(couponCodeType)).append("\n");
    sb.append("    couponSetCode: ").append(toIndentedString(couponSetCode)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxRedemptionsPerCouponCode: ").append(toIndentedString(maxRedemptionsPerCouponCode)).append("\n");
    sb.append("    maxRedemptionsPerUser: ").append(toIndentedString(maxRedemptionsPerUser)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redemptionCount: ").append(toIndentedString(redemptionCount)).append("\n");
    sb.append("    setSize: ").append(toIndentedString(setSize)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("assignedDiscountCount");
    openapiFields.add("auditInfo");
    openapiFields.add("canBeDeleted");
    openapiFields.add("couponCodeCount");
    openapiFields.add("couponCodeType");
    openapiFields.add("couponSetCode");
    openapiFields.add("endDate");
    openapiFields.add("id");
    openapiFields.add("maxRedemptionsPerCouponCode");
    openapiFields.add("maxRedemptionsPerUser");
    openapiFields.add("name");
    openapiFields.add("redemptionCount");
    openapiFields.add("setSize");
    openapiFields.add("startDate");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CouponSet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CouponSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CouponSet is not found in the empty JSON string", CouponSet.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CouponSet.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CouponSet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CouponSet.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("couponCodeType") != null && !jsonObj.get("couponCodeType").isJsonNull()) && !jsonObj.get("couponCodeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCodeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCodeType").toString()));
      }
      if ((jsonObj.get("couponSetCode") != null && !jsonObj.get("couponSetCode").isJsonNull()) && !jsonObj.get("couponSetCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponSetCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponSetCode").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CouponSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CouponSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CouponSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CouponSet.class));

       return (TypeAdapter<T>) new TypeAdapter<CouponSet>() {
           @Override
           public void write(JsonWriter out, CouponSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CouponSet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CouponSet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CouponSet
  * @throws IOException if the JSON string is invalid with respect to CouponSet
  */
  public static CouponSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CouponSet.class);
  }

 /**
  * Convert an instance of CouponSet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

