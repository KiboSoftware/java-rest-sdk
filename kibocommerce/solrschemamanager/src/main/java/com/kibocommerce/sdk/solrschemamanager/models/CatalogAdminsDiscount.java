/*
 * Kibo ProductRuntime Service
 * <div id=\"overview_CATALOG_ADMIN\">             <h2>CATALOG ADMINISTRATION</h2>             <p>The Catalog Administration APIs are a collection of resources for configuring the catalogs and products offered to your shoppers, including                 discounts and coupon sets, faceting, price lists, and different types or variations of products. See the                 <a href=\"/concept-guides/catalog\">Catalog user guides</a>                 for information about the related features in the Unified Commerce Admin.</p>             <p>Use the <strong>Attributes</strong> resource to manage localization and attribute configurations for your catalogs. This current version of the Attributes API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access attribute data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Categories</strong> resource to organize products and control where they appear on the storefront. Create                 and maintain a hierarchy of categories and subcategories where the site will store properties. This current version of the Categories API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access category data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Coupon Sets</strong> resource to view and create coupon sets. You can use coupon sets to group multiple                 coupon codes together and associate them with one or more discounts.</p>             <p>Use the <strong>Currency</strong> resource to manage the currency localization rules and exchange rates for any of the                 currencies that are supported for placing orders in.</p>             <p>Use the <strong>Discounts</strong> and <strong>Discount Settings</strong> resources to define and manage discounts to apply to products, product categories, or                 orders. This current version of the Discounts API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access discount data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\". </p>             <p>Use the <strong>Facets</strong> resource to manage the facets shoppers use to filter product display results on a                 storefront. Facets can include categories, product attributes, or prices, and use either a range of                 values or discrete values.</p>             <p>Use the <strong>Master Catalog</strong> resource to view details of the master catalogs associated with a tenant and to                 manage the product publishing mode for each master catalog.</p>             <p>Use the <strong>Price Lists</strong> resources to view and create price lists. You can use price lists to override the                 catalog pricing of products for specific customer segments and/or sites.</p>             <p>Use the <strong>Products</strong>, <strong>Product Types/Extras/Options/Properties</strong>, and <strong>Product Sort Definitions</strong> resources to create new product definitions in the master catalog and determine which                 catalogs will feature products. This current version of the Products API includes localizedContent to                 support <a href=\"/pages/catalog-structure#multi-locale-catalogs\">multi-locale catalogs</a>, which was not present in the legacy Products API model. If                 you were a client prior to May 2024 and have upgraded your implementation to support this feature,                 you can still access product data that has not yet been rewritten to the new model by providing                 an x-api-version header set to \"1\".</p>             <p>Use the <strong>Publishing</strong> resource to publish pending product updates together as part of a set.</p>             <p>Use the <strong>Search</strong> resource to manage all settings and options for providing product search on your site, as                 well as search tuning rules.</p>         </div>
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.solrschemamanager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * CatalogAdminsDiscount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsDiscount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Object amount = null;

  public static final String SERIALIZED_NAME_AMOUNT_TYPE = "amountType";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TYPE)
  private Object amountType = null;

  public static final String SERIALIZED_NAME_CAN_BE_DELETED = "canBeDeleted";
  @SerializedName(SERIALIZED_NAME_CAN_BE_DELETED)
  private Object canBeDeleted = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Object code = null;

  public static final String SERIALIZED_NAME_HAS_PURCHASE_CONDITIONS = "hasPurchaseConditions";
  @SerializedName(SERIALIZED_NAME_HAS_PURCHASE_CONDITIONS)
  private Object hasPurchaseConditions = null;

  public static final String SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_ORDER = "maximumDiscountImpactPerOrder";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_ORDER)
  private Object maximumDiscountImpactPerOrder = null;

  public static final String SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_REDEMPTION = "maximumDiscountImpactPerRedemption";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_DISCOUNT_IMPACT_PER_REDEMPTION)
  private Object maximumDiscountImpactPerRedemption = null;

  public static final String SERIALIZED_NAME_MAXIMUM_REDEMPTIONS_PER_ORDER = "maximumRedemptionsPerOrder";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_REDEMPTIONS_PER_ORDER)
  private Object maximumRedemptionsPerOrder = null;

  public static final String SERIALIZED_NAME_MAXIMUM_USES_PER_USER = "maximumUsesPerUser";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_USES_PER_USER)
  private Object maximumUsesPerUser = null;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private Object scope = null;

  public CatalogAdminsDiscount() {
  }

  public CatalogAdminsDiscount amount(Object amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAmount() {
    return amount;
  }


  public void setAmount(Object amount) {
    this.amount = amount;
  }


  public CatalogAdminsDiscount amountType(Object amountType) {
    
    this.amountType = amountType;
    return this;
  }

   /**
   * Get amountType
   * @return amountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAmountType() {
    return amountType;
  }


  public void setAmountType(Object amountType) {
    this.amountType = amountType;
  }


  public CatalogAdminsDiscount canBeDeleted(Object canBeDeleted) {
    
    this.canBeDeleted = canBeDeleted;
    return this;
  }

   /**
   * Get canBeDeleted
   * @return canBeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCanBeDeleted() {
    return canBeDeleted;
  }


  public void setCanBeDeleted(Object canBeDeleted) {
    this.canBeDeleted = canBeDeleted;
  }


  public CatalogAdminsDiscount code(Object code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCode() {
    return code;
  }


  public void setCode(Object code) {
    this.code = code;
  }


  public CatalogAdminsDiscount hasPurchaseConditions(Object hasPurchaseConditions) {
    
    this.hasPurchaseConditions = hasPurchaseConditions;
    return this;
  }

   /**
   * Get hasPurchaseConditions
   * @return hasPurchaseConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getHasPurchaseConditions() {
    return hasPurchaseConditions;
  }


  public void setHasPurchaseConditions(Object hasPurchaseConditions) {
    this.hasPurchaseConditions = hasPurchaseConditions;
  }


  public CatalogAdminsDiscount maximumDiscountImpactPerOrder(Object maximumDiscountImpactPerOrder) {
    
    this.maximumDiscountImpactPerOrder = maximumDiscountImpactPerOrder;
    return this;
  }

   /**
   * Get maximumDiscountImpactPerOrder
   * minimum: 0
   * @return maximumDiscountImpactPerOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaximumDiscountImpactPerOrder() {
    return maximumDiscountImpactPerOrder;
  }


  public void setMaximumDiscountImpactPerOrder(Object maximumDiscountImpactPerOrder) {
    this.maximumDiscountImpactPerOrder = maximumDiscountImpactPerOrder;
  }


  public CatalogAdminsDiscount maximumDiscountImpactPerRedemption(Object maximumDiscountImpactPerRedemption) {
    
    this.maximumDiscountImpactPerRedemption = maximumDiscountImpactPerRedemption;
    return this;
  }

   /**
   * Get maximumDiscountImpactPerRedemption
   * minimum: 0
   * @return maximumDiscountImpactPerRedemption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaximumDiscountImpactPerRedemption() {
    return maximumDiscountImpactPerRedemption;
  }


  public void setMaximumDiscountImpactPerRedemption(Object maximumDiscountImpactPerRedemption) {
    this.maximumDiscountImpactPerRedemption = maximumDiscountImpactPerRedemption;
  }


  public CatalogAdminsDiscount maximumRedemptionsPerOrder(Object maximumRedemptionsPerOrder) {
    
    this.maximumRedemptionsPerOrder = maximumRedemptionsPerOrder;
    return this;
  }

   /**
   * Get maximumRedemptionsPerOrder
   * minimum: 0
   * @return maximumRedemptionsPerOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaximumRedemptionsPerOrder() {
    return maximumRedemptionsPerOrder;
  }


  public void setMaximumRedemptionsPerOrder(Object maximumRedemptionsPerOrder) {
    this.maximumRedemptionsPerOrder = maximumRedemptionsPerOrder;
  }


  public CatalogAdminsDiscount maximumUsesPerUser(Object maximumUsesPerUser) {
    
    this.maximumUsesPerUser = maximumUsesPerUser;
    return this;
  }

   /**
   * Get maximumUsesPerUser
   * minimum: 0
   * @return maximumUsesPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMaximumUsesPerUser() {
    return maximumUsesPerUser;
  }


  public void setMaximumUsesPerUser(Object maximumUsesPerUser) {
    this.maximumUsesPerUser = maximumUsesPerUser;
  }


  public CatalogAdminsDiscount scope(Object scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getScope() {
    return scope;
  }


  public void setScope(Object scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsDiscount catalogAdminsDiscount = (CatalogAdminsDiscount) o;
    return Objects.equals(this.amount, catalogAdminsDiscount.amount) &&
        Objects.equals(this.amountType, catalogAdminsDiscount.amountType) &&
        Objects.equals(this.canBeDeleted, catalogAdminsDiscount.canBeDeleted) &&
        Objects.equals(this.code, catalogAdminsDiscount.code) &&
        Objects.equals(this.hasPurchaseConditions, catalogAdminsDiscount.hasPurchaseConditions) &&
        Objects.equals(this.maximumDiscountImpactPerOrder, catalogAdminsDiscount.maximumDiscountImpactPerOrder) &&
        Objects.equals(this.maximumDiscountImpactPerRedemption, catalogAdminsDiscount.maximumDiscountImpactPerRedemption) &&
        Objects.equals(this.maximumRedemptionsPerOrder, catalogAdminsDiscount.maximumRedemptionsPerOrder) &&
        Objects.equals(this.maximumUsesPerUser, catalogAdminsDiscount.maximumUsesPerUser) &&
        Objects.equals(this.scope, catalogAdminsDiscount.scope);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountType, canBeDeleted, code, hasPurchaseConditions, maximumDiscountImpactPerOrder, maximumDiscountImpactPerRedemption, maximumRedemptionsPerOrder, maximumUsesPerUser, scope);
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
    sb.append("class CatalogAdminsDiscount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    canBeDeleted: ").append(toIndentedString(canBeDeleted)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    hasPurchaseConditions: ").append(toIndentedString(hasPurchaseConditions)).append("\n");
    sb.append("    maximumDiscountImpactPerOrder: ").append(toIndentedString(maximumDiscountImpactPerOrder)).append("\n");
    sb.append("    maximumDiscountImpactPerRedemption: ").append(toIndentedString(maximumDiscountImpactPerRedemption)).append("\n");
    sb.append("    maximumRedemptionsPerOrder: ").append(toIndentedString(maximumRedemptionsPerOrder)).append("\n");
    sb.append("    maximumUsesPerUser: ").append(toIndentedString(maximumUsesPerUser)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("amountType");
    openapiFields.add("canBeDeleted");
    openapiFields.add("code");
    openapiFields.add("hasPurchaseConditions");
    openapiFields.add("maximumDiscountImpactPerOrder");
    openapiFields.add("maximumDiscountImpactPerRedemption");
    openapiFields.add("maximumRedemptionsPerOrder");
    openapiFields.add("maximumUsesPerUser");
    openapiFields.add("scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsDiscount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsDiscount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsDiscount is not found in the empty JSON string", CatalogAdminsDiscount.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsDiscount.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsDiscount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsDiscount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsDiscount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsDiscount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsDiscount.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsDiscount>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsDiscount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsDiscount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsDiscount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsDiscount
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsDiscount
  */
  public static CatalogAdminsDiscount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsDiscount.class);
  }

 /**
  * Convert an instance of CatalogAdminsDiscount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

