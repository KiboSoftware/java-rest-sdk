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
 * Container for language-specific content to display on the storefront. You&#39;ll have a container for each supported language (LocaleCode). This enables you to display a product in multiple languages yet manage it as a single product internally.
 */
@ApiModel(description = "Container for language-specific content to display on the storefront. You'll have a container for each supported language (LocaleCode). This enables you to display a product in multiple languages yet manage it as a single product internally.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductLocalizedSEOContent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_META_TAG_DESCRIPTION = "metaTagDescription";
  @SerializedName(SERIALIZED_NAME_META_TAG_DESCRIPTION)
  private String metaTagDescription;

  public static final String SERIALIZED_NAME_META_TAG_KEYWORDS = "metaTagKeywords";
  @SerializedName(SERIALIZED_NAME_META_TAG_KEYWORDS)
  private String metaTagKeywords;

  public static final String SERIALIZED_NAME_META_TAG_TITLE = "metaTagTitle";
  @SerializedName(SERIALIZED_NAME_META_TAG_TITLE)
  private String metaTagTitle;

  public static final String SERIALIZED_NAME_SEO_FRIENDLY_URL = "seoFriendlyUrl";
  @SerializedName(SERIALIZED_NAME_SEO_FRIENDLY_URL)
  private String seoFriendlyUrl;

  public static final String SERIALIZED_NAME_TITLE_TAG_TITLE = "titleTagTitle";
  @SerializedName(SERIALIZED_NAME_TITLE_TAG_TITLE)
  private String titleTagTitle;

  public ProductLocalizedSEOContent() {
  }

  public ProductLocalizedSEOContent localeCode(String localeCode) {
    
    this.localeCode = localeCode;
    return this;
  }

   /**
   * Lanugage used for product content. Currently, only en_US is supported.
   * @return localeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lanugage used for product content. Currently, only en_US is supported.")

  public String getLocaleCode() {
    return localeCode;
  }


  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }


  public ProductLocalizedSEOContent metaTagDescription(String metaTagDescription) {
    
    this.metaTagDescription = metaTagDescription;
    return this;
  }

   /**
   * Metadata description. Metadata can be used to manage information internally. Sometimes used for SEO.
   * @return metaTagDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata description. Metadata can be used to manage information internally. Sometimes used for SEO.")

  public String getMetaTagDescription() {
    return metaTagDescription;
  }


  public void setMetaTagDescription(String metaTagDescription) {
    this.metaTagDescription = metaTagDescription;
  }


  public ProductLocalizedSEOContent metaTagKeywords(String metaTagKeywords) {
    
    this.metaTagKeywords = metaTagKeywords;
    return this;
  }

   /**
   * Metadata keywords. Metadata can be used to manage information internally. Sometimes used for SEO.
   * @return metaTagKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata keywords. Metadata can be used to manage information internally. Sometimes used for SEO.")

  public String getMetaTagKeywords() {
    return metaTagKeywords;
  }


  public void setMetaTagKeywords(String metaTagKeywords) {
    this.metaTagKeywords = metaTagKeywords;
  }


  public ProductLocalizedSEOContent metaTagTitle(String metaTagTitle) {
    
    this.metaTagTitle = metaTagTitle;
    return this;
  }

   /**
   * Metadata title. Metadata can be used to manage information internally. Sometimes used for SEO.
   * @return metaTagTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata title. Metadata can be used to manage information internally. Sometimes used for SEO.")

  public String getMetaTagTitle() {
    return metaTagTitle;
  }


  public void setMetaTagTitle(String metaTagTitle) {
    this.metaTagTitle = metaTagTitle;
  }


  public ProductLocalizedSEOContent seoFriendlyUrl(String seoFriendlyUrl) {
    
    this.seoFriendlyUrl = seoFriendlyUrl;
    return this;
  }

   /**
   * Human-readable identifier that you can give to the product to create friendly URLs. For example,  instead of \&quot;http: //example.com/products?category&#x3D;2&amp;id&#x3D;25,\&quot; the friendly URL can be \&quot;http: //example.com/products/category/2/25.\&quot;
   * @return seoFriendlyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable identifier that you can give to the product to create friendly URLs. For example,  instead of \"http: //example.com/products?category=2&id=25,\" the friendly URL can be \"http: //example.com/products/category/2/25.\"")

  public String getSeoFriendlyUrl() {
    return seoFriendlyUrl;
  }


  public void setSeoFriendlyUrl(String seoFriendlyUrl) {
    this.seoFriendlyUrl = seoFriendlyUrl;
  }


  public ProductLocalizedSEOContent titleTagTitle(String titleTagTitle) {
    
    this.titleTagTitle = titleTagTitle;
    return this;
  }

   /**
   * Used to customize the HTML title tag within the head section of the product details page
   * @return titleTagTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to customize the HTML title tag within the head section of the product details page")

  public String getTitleTagTitle() {
    return titleTagTitle;
  }


  public void setTitleTagTitle(String titleTagTitle) {
    this.titleTagTitle = titleTagTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductLocalizedSEOContent productLocalizedSEOContent = (ProductLocalizedSEOContent) o;
    return Objects.equals(this.localeCode, productLocalizedSEOContent.localeCode) &&
        Objects.equals(this.metaTagDescription, productLocalizedSEOContent.metaTagDescription) &&
        Objects.equals(this.metaTagKeywords, productLocalizedSEOContent.metaTagKeywords) &&
        Objects.equals(this.metaTagTitle, productLocalizedSEOContent.metaTagTitle) &&
        Objects.equals(this.seoFriendlyUrl, productLocalizedSEOContent.seoFriendlyUrl) &&
        Objects.equals(this.titleTagTitle, productLocalizedSEOContent.titleTagTitle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeCode, metaTagDescription, metaTagKeywords, metaTagTitle, seoFriendlyUrl, titleTagTitle);
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
    sb.append("class ProductLocalizedSEOContent {\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    metaTagDescription: ").append(toIndentedString(metaTagDescription)).append("\n");
    sb.append("    metaTagKeywords: ").append(toIndentedString(metaTagKeywords)).append("\n");
    sb.append("    metaTagTitle: ").append(toIndentedString(metaTagTitle)).append("\n");
    sb.append("    seoFriendlyUrl: ").append(toIndentedString(seoFriendlyUrl)).append("\n");
    sb.append("    titleTagTitle: ").append(toIndentedString(titleTagTitle)).append("\n");
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
    openapiFields.add("localeCode");
    openapiFields.add("metaTagDescription");
    openapiFields.add("metaTagKeywords");
    openapiFields.add("metaTagTitle");
    openapiFields.add("seoFriendlyUrl");
    openapiFields.add("titleTagTitle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductLocalizedSEOContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductLocalizedSEOContent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductLocalizedSEOContent is not found in the empty JSON string", ProductLocalizedSEOContent.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductLocalizedSEOContent.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductLocalizedSEOContent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("localeCode") != null && !jsonObj.get("localeCode").isJsonNull()) && !jsonObj.get("localeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localeCode").toString()));
      }
      if ((jsonObj.get("metaTagDescription") != null && !jsonObj.get("metaTagDescription").isJsonNull()) && !jsonObj.get("metaTagDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metaTagDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metaTagDescription").toString()));
      }
      if ((jsonObj.get("metaTagKeywords") != null && !jsonObj.get("metaTagKeywords").isJsonNull()) && !jsonObj.get("metaTagKeywords").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metaTagKeywords` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metaTagKeywords").toString()));
      }
      if ((jsonObj.get("metaTagTitle") != null && !jsonObj.get("metaTagTitle").isJsonNull()) && !jsonObj.get("metaTagTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metaTagTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metaTagTitle").toString()));
      }
      if ((jsonObj.get("seoFriendlyUrl") != null && !jsonObj.get("seoFriendlyUrl").isJsonNull()) && !jsonObj.get("seoFriendlyUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seoFriendlyUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seoFriendlyUrl").toString()));
      }
      if ((jsonObj.get("titleTagTitle") != null && !jsonObj.get("titleTagTitle").isJsonNull()) && !jsonObj.get("titleTagTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titleTagTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titleTagTitle").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductLocalizedSEOContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductLocalizedSEOContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductLocalizedSEOContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductLocalizedSEOContent.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductLocalizedSEOContent>() {
           @Override
           public void write(JsonWriter out, ProductLocalizedSEOContent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductLocalizedSEOContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductLocalizedSEOContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductLocalizedSEOContent
  * @throws IOException if the JSON string is invalid with respect to ProductLocalizedSEOContent
  */
  public static ProductLocalizedSEOContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductLocalizedSEOContent.class);
  }

 /**
  * Convert an instance of ProductLocalizedSEOContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

