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
 * Coupon in a coupon set.
 */
@ApiModel(description = "Coupon in a coupon set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Coupon implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CAN_BE_DELETED = "canBeDeleted";
  @SerializedName(SERIALIZED_NAME_CAN_BE_DELETED)
  private Boolean canBeDeleted;

  public static final String SERIALIZED_NAME_COUPON_CODE = "couponCode";
  @SerializedName(SERIALIZED_NAME_COUPON_CODE)
  private String couponCode;

  public static final String SERIALIZED_NAME_COUPON_SET_CODE = "couponSetCode";
  @SerializedName(SERIALIZED_NAME_COUPON_SET_CODE)
  private String couponSetCode;

  public static final String SERIALIZED_NAME_COUPON_SET_ID = "couponSetId";
  @SerializedName(SERIALIZED_NAME_COUPON_SET_ID)
  private Integer couponSetId;

  public static final String SERIALIZED_NAME_REDEMPTION_COUNT = "redemptionCount";
  @SerializedName(SERIALIZED_NAME_REDEMPTION_COUNT)
  private Integer redemptionCount;

  public Coupon() {
  }

  public Coupon auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public Coupon canBeDeleted(Boolean canBeDeleted) {
    
    this.canBeDeleted = canBeDeleted;
    return this;
  }

   /**
   * Get canBeDeleted
   * @return canBeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanBeDeleted() {
    return canBeDeleted;
  }


  public void setCanBeDeleted(Boolean canBeDeleted) {
    this.canBeDeleted = canBeDeleted;
  }


  public Coupon couponCode(String couponCode) {
    
    this.couponCode = couponCode;
    return this;
  }

   /**
   * The code the customer uses to claim this coupon
   * @return couponCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The code the customer uses to claim this coupon")

  public String getCouponCode() {
    return couponCode;
  }


  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }


  public Coupon couponSetCode(String couponSetCode) {
    
    this.couponSetCode = couponSetCode;
    return this;
  }

   /**
   * Link to associated coupon
   * @return couponSetCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to associated coupon")

  public String getCouponSetCode() {
    return couponSetCode;
  }


  public void setCouponSetCode(String couponSetCode) {
    this.couponSetCode = couponSetCode;
  }


  public Coupon couponSetId(Integer couponSetId) {
    
    this.couponSetId = couponSetId;
    return this;
  }

   /**
   * ReadOnly system id for releated couponset.
   * @return couponSetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReadOnly system id for releated couponset.")

  public Integer getCouponSetId() {
    return couponSetId;
  }


  public void setCouponSetId(Integer couponSetId) {
    this.couponSetId = couponSetId;
  }


  public Coupon redemptionCount(Integer redemptionCount) {
    
    this.redemptionCount = redemptionCount;
    return this;
  }

   /**
   * Total number of times this code has been redeemed. ReadOnly, calculated. Only returned with response group includeCounts
   * @return redemptionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of times this code has been redeemed. ReadOnly, calculated. Only returned with response group includeCounts")

  public Integer getRedemptionCount() {
    return redemptionCount;
  }


  public void setRedemptionCount(Integer redemptionCount) {
    this.redemptionCount = redemptionCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coupon coupon = (Coupon) o;
    return Objects.equals(this.auditInfo, coupon.auditInfo) &&
        Objects.equals(this.canBeDeleted, coupon.canBeDeleted) &&
        Objects.equals(this.couponCode, coupon.couponCode) &&
        Objects.equals(this.couponSetCode, coupon.couponSetCode) &&
        Objects.equals(this.couponSetId, coupon.couponSetId) &&
        Objects.equals(this.redemptionCount, coupon.redemptionCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, canBeDeleted, couponCode, couponSetCode, couponSetId, redemptionCount);
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
    sb.append("class Coupon {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    canBeDeleted: ").append(toIndentedString(canBeDeleted)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    couponSetCode: ").append(toIndentedString(couponSetCode)).append("\n");
    sb.append("    couponSetId: ").append(toIndentedString(couponSetId)).append("\n");
    sb.append("    redemptionCount: ").append(toIndentedString(redemptionCount)).append("\n");
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
    openapiFields.add("canBeDeleted");
    openapiFields.add("couponCode");
    openapiFields.add("couponSetCode");
    openapiFields.add("couponSetId");
    openapiFields.add("redemptionCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("couponCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Coupon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Coupon.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Coupon is not found in the empty JSON string", Coupon.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!Coupon.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Coupon` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Coupon.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if (!jsonObj.get("couponCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponCode").toString()));
      }
      if ((jsonObj.get("couponSetCode") != null && !jsonObj.get("couponSetCode").isJsonNull()) && !jsonObj.get("couponSetCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `couponSetCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("couponSetCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Coupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Coupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Coupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Coupon.class));

       return (TypeAdapter<T>) new TypeAdapter<Coupon>() {
           @Override
           public void write(JsonWriter out, Coupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Coupon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Coupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Coupon
  * @throws IOException if the JSON string is invalid with respect to Coupon
  */
  public static Coupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Coupon.class);
  }

 /**
  * Convert an instance of Coupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

