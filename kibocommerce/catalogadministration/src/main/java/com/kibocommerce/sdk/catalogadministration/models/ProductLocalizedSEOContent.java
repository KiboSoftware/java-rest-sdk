/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
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

  public static final String SERIALIZED_NAME_META_TAG_TITLE = "metaTagTitle";
  @SerializedName(SERIALIZED_NAME_META_TAG_TITLE)
  private String metaTagTitle;

  public static final String SERIALIZED_NAME_META_TAG_DESCRIPTION = "metaTagDescription";
  @SerializedName(SERIALIZED_NAME_META_TAG_DESCRIPTION)
  private String metaTagDescription;

  public static final String SERIALIZED_NAME_META_TAG_KEYWORDS = "metaTagKeywords";
  @SerializedName(SERIALIZED_NAME_META_TAG_KEYWORDS)
  private String metaTagKeywords;

  public static final String SERIALIZED_NAME_TITLE_TAG_TITLE = "titleTagTitle";
  @SerializedName(SERIALIZED_NAME_TITLE_TAG_TITLE)
  private String titleTagTitle;

  public static final String SERIALIZED_NAME_SEO_FRIENDLY_URL = "seoFriendlyUrl";
  @SerializedName(SERIALIZED_NAME_SEO_FRIENDLY_URL)
  private String seoFriendlyUrl;

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


  public ProductLocalizedSEOContent seoFriendlyUrl(String seoFriendlyUrl) {
    
    this.seoFriendlyUrl = seoFriendlyUrl;
    return this;
  }

   /**
   * Human-readable identifier that you can give to the product to create friendly URLs. For example,   instead of \&quot;http: //example.com/products?category&#x3D;2&amp;id&#x3D;25,\&quot; the friendly URL can be \&quot;http: //example.com/products/category/2/25.\&quot;
   * @return seoFriendlyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable identifier that you can give to the product to create friendly URLs. For example,   instead of \"http: //example.com/products?category=2&id=25,\" the friendly URL can be \"http: //example.com/products/category/2/25.\"")

  public String getSeoFriendlyUrl() {
    return seoFriendlyUrl;
  }


  public void setSeoFriendlyUrl(String seoFriendlyUrl) {
    this.seoFriendlyUrl = seoFriendlyUrl;
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
        Objects.equals(this.metaTagTitle, productLocalizedSEOContent.metaTagTitle) &&
        Objects.equals(this.metaTagDescription, productLocalizedSEOContent.metaTagDescription) &&
        Objects.equals(this.metaTagKeywords, productLocalizedSEOContent.metaTagKeywords) &&
        Objects.equals(this.titleTagTitle, productLocalizedSEOContent.titleTagTitle) &&
        Objects.equals(this.seoFriendlyUrl, productLocalizedSEOContent.seoFriendlyUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeCode, metaTagTitle, metaTagDescription, metaTagKeywords, titleTagTitle, seoFriendlyUrl);
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
    sb.append("    metaTagTitle: ").append(toIndentedString(metaTagTitle)).append("\n");
    sb.append("    metaTagDescription: ").append(toIndentedString(metaTagDescription)).append("\n");
    sb.append("    metaTagKeywords: ").append(toIndentedString(metaTagKeywords)).append("\n");
    sb.append("    titleTagTitle: ").append(toIndentedString(titleTagTitle)).append("\n");
    sb.append("    seoFriendlyUrl: ").append(toIndentedString(seoFriendlyUrl)).append("\n");
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
    openapiFields.add("metaTagTitle");
    openapiFields.add("metaTagDescription");
    openapiFields.add("metaTagKeywords");
    openapiFields.add("titleTagTitle");
    openapiFields.add("seoFriendlyUrl");

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
      if ((jsonObj.get("metaTagTitle") != null && !jsonObj.get("metaTagTitle").isJsonNull()) && !jsonObj.get("metaTagTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metaTagTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metaTagTitle").toString()));
      }
      if ((jsonObj.get("metaTagDescription") != null && !jsonObj.get("metaTagDescription").isJsonNull()) && !jsonObj.get("metaTagDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metaTagDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metaTagDescription").toString()));
      }
      if ((jsonObj.get("metaTagKeywords") != null && !jsonObj.get("metaTagKeywords").isJsonNull()) && !jsonObj.get("metaTagKeywords").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metaTagKeywords` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metaTagKeywords").toString()));
      }
      if ((jsonObj.get("titleTagTitle") != null && !jsonObj.get("titleTagTitle").isJsonNull()) && !jsonObj.get("titleTagTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `titleTagTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("titleTagTitle").toString()));
      }
      if ((jsonObj.get("seoFriendlyUrl") != null && !jsonObj.get("seoFriendlyUrl").isJsonNull()) && !jsonObj.get("seoFriendlyUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seoFriendlyUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seoFriendlyUrl").toString()));
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
