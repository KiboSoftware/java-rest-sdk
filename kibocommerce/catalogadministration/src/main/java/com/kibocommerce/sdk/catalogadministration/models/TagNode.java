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
 * TagNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TagNode implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<TagNode> children = null;

  public static final String SERIALIZED_NAME_IS_ROOT = "isRoot";
  @SerializedName(SERIALIZED_NAME_IS_ROOT)
  private Boolean isRoot;

  public static final String SERIALIZED_NAME_TAG_CODE = "tagCode";
  @SerializedName(SERIALIZED_NAME_TAG_CODE)
  private String tagCode;

  public static final String SERIALIZED_NAME_TAG_NAME = "tagName";
  @SerializedName(SERIALIZED_NAME_TAG_NAME)
  private String tagName;

  public static final String SERIALIZED_NAME_TAG_PATH = "tagPath";
  @SerializedName(SERIALIZED_NAME_TAG_PATH)
  private String tagPath;

  public TagNode() {
  }

  public TagNode children(List<TagNode> children) {
    
    this.children = children;
    return this;
  }

  public TagNode addChildrenItem(TagNode childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TagNode> getChildren() {
    return children;
  }


  public void setChildren(List<TagNode> children) {
    this.children = children;
  }


  public TagNode isRoot(Boolean isRoot) {
    
    this.isRoot = isRoot;
    return this;
  }

   /**
   * Get isRoot
   * @return isRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRoot() {
    return isRoot;
  }


  public void setIsRoot(Boolean isRoot) {
    this.isRoot = isRoot;
  }


  public TagNode tagCode(String tagCode) {
    
    this.tagCode = tagCode;
    return this;
  }

   /**
   * Get tagCode
   * @return tagCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTagCode() {
    return tagCode;
  }


  public void setTagCode(String tagCode) {
    this.tagCode = tagCode;
  }


  public TagNode tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTagName() {
    return tagName;
  }


  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public TagNode tagPath(String tagPath) {
    
    this.tagPath = tagPath;
    return this;
  }

   /**
   * Get tagPath
   * @return tagPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTagPath() {
    return tagPath;
  }


  public void setTagPath(String tagPath) {
    this.tagPath = tagPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagNode tagNode = (TagNode) o;
    return Objects.equals(this.children, tagNode.children) &&
        Objects.equals(this.isRoot, tagNode.isRoot) &&
        Objects.equals(this.tagCode, tagNode.tagCode) &&
        Objects.equals(this.tagName, tagNode.tagName) &&
        Objects.equals(this.tagPath, tagNode.tagPath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, isRoot, tagCode, tagName, tagPath);
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
    sb.append("class TagNode {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    tagCode: ").append(toIndentedString(tagCode)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagPath: ").append(toIndentedString(tagPath)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("isRoot");
    openapiFields.add("tagCode");
    openapiFields.add("tagName");
    openapiFields.add("tagPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TagNode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TagNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TagNode is not found in the empty JSON string", TagNode.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!TagNode.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TagNode` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonNull()) {
        JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
        if (jsonArraychildren != null) {
          // ensure the json data is an array
          if (!jsonObj.get("children").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
          }

          // validate the optional field `children` (array)
          for (int i = 0; i < jsonArraychildren.size(); i++) {
            TagNode.validateJsonObject(jsonArraychildren.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("tagCode") != null && !jsonObj.get("tagCode").isJsonNull()) && !jsonObj.get("tagCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tagCode").toString()));
      }
      if ((jsonObj.get("tagName") != null && !jsonObj.get("tagName").isJsonNull()) && !jsonObj.get("tagName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tagName").toString()));
      }
      if ((jsonObj.get("tagPath") != null && !jsonObj.get("tagPath").isJsonNull()) && !jsonObj.get("tagPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tagPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TagNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TagNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TagNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TagNode.class));

       return (TypeAdapter<T>) new TypeAdapter<TagNode>() {
           @Override
           public void write(JsonWriter out, TagNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TagNode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TagNode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TagNode
  * @throws IOException if the JSON string is invalid with respect to TagNode
  */
  public static TagNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TagNode.class);
  }

 /**
  * Convert an instance of TagNode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

