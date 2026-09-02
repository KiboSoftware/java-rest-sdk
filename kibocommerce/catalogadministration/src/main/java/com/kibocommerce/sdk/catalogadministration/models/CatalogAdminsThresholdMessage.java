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
import com.kibocommerce.sdk.catalogadministration.models.ThresholdMessageLocalizedContent;
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
 * CatalogAdminsThresholdMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CatalogAdminsThresholdMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ThresholdMessageLocalizedContent content;

  public static final String SERIALIZED_NAME_DISCOUNT_ID = "discountId";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_ID)
  private Integer discountId;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_LOCALIZED_CONTENT = "localizedContent";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_CONTENT)
  private List<ThresholdMessageLocalizedContent> localizedContent = null;

  public static final String SERIALIZED_NAME_REQUIRES_COUPON_CODE = "requiresCouponCode";
  @SerializedName(SERIALIZED_NAME_REQUIRES_COUPON_CODE)
  private Boolean requiresCouponCode;

  public static final String SERIALIZED_NAME_SHOW_IN_CART = "showInCart";
  @SerializedName(SERIALIZED_NAME_SHOW_IN_CART)
  private Boolean showInCart;

  public static final String SERIALIZED_NAME_SHOW_ON_CHECKOUT = "showOnCheckout";
  @SerializedName(SERIALIZED_NAME_SHOW_ON_CHECKOUT)
  private Boolean showOnCheckout;

  public static final String SERIALIZED_NAME_THRESHOLD_VALUE = "thresholdValue";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_VALUE)
  private Double thresholdValue;

  public CatalogAdminsThresholdMessage() {
  }

  public CatalogAdminsThresholdMessage auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public CatalogAdminsThresholdMessage content(ThresholdMessageLocalizedContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThresholdMessageLocalizedContent getContent() {
    return content;
  }


  public void setContent(ThresholdMessageLocalizedContent content) {
    this.content = content;
  }


  public CatalogAdminsThresholdMessage discountId(Integer discountId) {
    
    this.discountId = discountId;
    return this;
  }

   /**
   * Unique identifier of the discount. System-supplied and read-only.
   * @return discountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier of the discount. System-supplied and read-only.")

  public Integer getDiscountId() {
    return discountId;
  }


  public void setDiscountId(Integer discountId) {
    this.discountId = discountId;
  }


  public CatalogAdminsThresholdMessage isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if threshold messages are active for this discount
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if threshold messages are active for this discount")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public CatalogAdminsThresholdMessage localizedContent(List<ThresholdMessageLocalizedContent> localizedContent) {
    
    this.localizedContent = localizedContent;
    return this;
  }

  public CatalogAdminsThresholdMessage addLocalizedContentItem(ThresholdMessageLocalizedContent localizedContentItem) {
    if (this.localizedContent == null) {
      this.localizedContent = new ArrayList<>();
    }
    this.localizedContent.add(localizedContentItem);
    return this;
  }

   /**
   * Container for the language-specific name of the threshold message. You will have a container for each supported language (LocaleCode). This enables you to display the message in multiple languages yet manage it as a single message internally.
   * @return localizedContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container for the language-specific name of the threshold message. You will have a container for each supported language (LocaleCode). This enables you to display the message in multiple languages yet manage it as a single message internally.")

  public List<ThresholdMessageLocalizedContent> getLocalizedContent() {
    return localizedContent;
  }


  public void setLocalizedContent(List<ThresholdMessageLocalizedContent> localizedContent) {
    this.localizedContent = localizedContent;
  }


  public CatalogAdminsThresholdMessage requiresCouponCode(Boolean requiresCouponCode) {
    
    this.requiresCouponCode = requiresCouponCode;
    return this;
  }

   /**
   * Indicates if the threshold message will display when a promo code is evaluated
   * @return requiresCouponCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the threshold message will display when a promo code is evaluated")

  public Boolean getRequiresCouponCode() {
    return requiresCouponCode;
  }


  public void setRequiresCouponCode(Boolean requiresCouponCode) {
    this.requiresCouponCode = requiresCouponCode;
  }


  public CatalogAdminsThresholdMessage showInCart(Boolean showInCart) {
    
    this.showInCart = showInCart;
    return this;
  }

   /**
   * Indicates if the threshold message will display in the cart
   * @return showInCart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the threshold message will display in the cart")

  public Boolean getShowInCart() {
    return showInCart;
  }


  public void setShowInCart(Boolean showInCart) {
    this.showInCart = showInCart;
  }


  public CatalogAdminsThresholdMessage showOnCheckout(Boolean showOnCheckout) {
    
    this.showOnCheckout = showOnCheckout;
    return this;
  }

   /**
   * Indicates if the threshold message will display on the checkout page
   * @return showOnCheckout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the threshold message will display on the checkout page")

  public Boolean getShowOnCheckout() {
    return showOnCheckout;
  }


  public void setShowOnCheckout(Boolean showOnCheckout) {
    this.showOnCheckout = showOnCheckout;
  }


  public CatalogAdminsThresholdMessage thresholdValue(Double thresholdValue) {
    
    this.thresholdValue = thresholdValue;
    return this;
  }

   /**
   * The cart total amount that must be met before the threshold message is displayed
   * @return thresholdValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The cart total amount that must be met before the threshold message is displayed")

  public Double getThresholdValue() {
    return thresholdValue;
  }


  public void setThresholdValue(Double thresholdValue) {
    this.thresholdValue = thresholdValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogAdminsThresholdMessage catalogAdminsThresholdMessage = (CatalogAdminsThresholdMessage) o;
    return Objects.equals(this.auditInfo, catalogAdminsThresholdMessage.auditInfo) &&
        Objects.equals(this.content, catalogAdminsThresholdMessage.content) &&
        Objects.equals(this.discountId, catalogAdminsThresholdMessage.discountId) &&
        Objects.equals(this.isActive, catalogAdminsThresholdMessage.isActive) &&
        Objects.equals(this.localizedContent, catalogAdminsThresholdMessage.localizedContent) &&
        Objects.equals(this.requiresCouponCode, catalogAdminsThresholdMessage.requiresCouponCode) &&
        Objects.equals(this.showInCart, catalogAdminsThresholdMessage.showInCart) &&
        Objects.equals(this.showOnCheckout, catalogAdminsThresholdMessage.showOnCheckout) &&
        Objects.equals(this.thresholdValue, catalogAdminsThresholdMessage.thresholdValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, content, discountId, isActive, localizedContent, requiresCouponCode, showInCart, showOnCheckout, thresholdValue);
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
    sb.append("class CatalogAdminsThresholdMessage {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    localizedContent: ").append(toIndentedString(localizedContent)).append("\n");
    sb.append("    requiresCouponCode: ").append(toIndentedString(requiresCouponCode)).append("\n");
    sb.append("    showInCart: ").append(toIndentedString(showInCart)).append("\n");
    sb.append("    showOnCheckout: ").append(toIndentedString(showOnCheckout)).append("\n");
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("discountId");
    openapiFields.add("isActive");
    openapiFields.add("localizedContent");
    openapiFields.add("requiresCouponCode");
    openapiFields.add("showInCart");
    openapiFields.add("showOnCheckout");
    openapiFields.add("thresholdValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("discountId");
    openapiRequiredFields.add("thresholdValue");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogAdminsThresholdMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogAdminsThresholdMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogAdminsThresholdMessage is not found in the empty JSON string", CatalogAdminsThresholdMessage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!CatalogAdminsThresholdMessage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogAdminsThresholdMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogAdminsThresholdMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        ThresholdMessageLocalizedContent.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      if (jsonObj.get("localizedContent") != null && !jsonObj.get("localizedContent").isJsonNull()) {
        JsonArray jsonArraylocalizedContent = jsonObj.getAsJsonArray("localizedContent");
        if (jsonArraylocalizedContent != null) {
          // ensure the json data is an array
          if (!jsonObj.get("localizedContent").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `localizedContent` to be an array in the JSON string but got `%s`", jsonObj.get("localizedContent").toString()));
          }

          // validate the optional field `localizedContent` (array)
          for (int i = 0; i < jsonArraylocalizedContent.size(); i++) {
            ThresholdMessageLocalizedContent.validateJsonObject(jsonArraylocalizedContent.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogAdminsThresholdMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogAdminsThresholdMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogAdminsThresholdMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogAdminsThresholdMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogAdminsThresholdMessage>() {
           @Override
           public void write(JsonWriter out, CatalogAdminsThresholdMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogAdminsThresholdMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogAdminsThresholdMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogAdminsThresholdMessage
  * @throws IOException if the JSON string is invalid with respect to CatalogAdminsThresholdMessage
  */
  public static CatalogAdminsThresholdMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogAdminsThresholdMessage.class);
  }

 /**
  * Convert an instance of CatalogAdminsThresholdMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

