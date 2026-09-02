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
import com.kibocommerce.sdk.catalogadministration.models.AttributeInProductType;
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
 * ProductType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AdminUserAuditInfo auditInfo;

  public static final String SERIALIZED_NAME_EXTRAS = "extras";
  @SerializedName(SERIALIZED_NAME_EXTRAS)
  private List<AttributeInProductType> extras = null;

  public static final String SERIALIZED_NAME_GOODS_TYPE = "goodsType";
  @SerializedName(SERIALIZED_NAME_GOODS_TYPE)
  private String goodsType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IS_BASE_PRODUCT_TYPE = "isBaseProductType";
  @SerializedName(SERIALIZED_NAME_IS_BASE_PRODUCT_TYPE)
  private Boolean isBaseProductType;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<AttributeInProductType> options = null;

  public static final String SERIALIZED_NAME_PRODUCT_COUNT = "productCount";
  @SerializedName(SERIALIZED_NAME_PRODUCT_COUNT)
  private Integer productCount;

  public static final String SERIALIZED_NAME_PRODUCT_USAGES = "productUsages";
  @SerializedName(SERIALIZED_NAME_PRODUCT_USAGES)
  private List<String> productUsages = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<AttributeInProductType> properties = null;

  public static final String SERIALIZED_NAME_VARIANT_PROPERTIES = "variantProperties";
  @SerializedName(SERIALIZED_NAME_VARIANT_PROPERTIES)
  private List<AttributeInProductType> variantProperties = null;

  public ProductType() {
  }

  public ProductType auditInfo(AdminUserAuditInfo auditInfo) {
    
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


  public ProductType extras(List<AttributeInProductType> extras) {
    
    this.extras = extras;
    return this;
  }

  public ProductType addExtrasItem(AttributeInProductType extrasItem) {
    if (this.extras == null) {
      this.extras = new ArrayList<>();
    }
    this.extras.add(extrasItem);
    return this;
  }

   /**
   * Collection of the Attributes that are Extras in this productType
   * @return extras
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of the Attributes that are Extras in this productType")

  public List<AttributeInProductType> getExtras() {
    return extras;
  }


  public void setExtras(List<AttributeInProductType> extras) {
    this.extras = extras;
  }


  public ProductType goodsType(String goodsType) {
    
    this.goodsType = goodsType;
    return this;
  }

   /**
   * The TYpe of Goods of this product
   * @return goodsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The TYpe of Goods of this product")

  public String getGoodsType() {
    return goodsType;
  }


  public void setGoodsType(String goodsType) {
    this.goodsType = goodsType;
  }


  public ProductType id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the ProductType. System-supplied and read-only.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the ProductType. System-supplied and read-only.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ProductType isBaseProductType(Boolean isBaseProductType) {
    
    this.isBaseProductType = isBaseProductType;
    return this;
  }

   /**
   * System supplied and read only. There is only one BaseProductType per MasterCatalog.
   * @return isBaseProductType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "System supplied and read only. There is only one BaseProductType per MasterCatalog.")

  public Boolean getIsBaseProductType() {
    return isBaseProductType;
  }


  public void setIsBaseProductType(Boolean isBaseProductType) {
    this.isBaseProductType = isBaseProductType;
  }


  public ProductType masterCatalogId(Integer masterCatalogId) {
    
    this.masterCatalogId = masterCatalogId;
    return this;
  }

   /**
   * Indentifier of the Master Catalog that this ProductType is a member of. System-supplied and read-only.
   * @return masterCatalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indentifier of the Master Catalog that this ProductType is a member of. System-supplied and read-only.")

  public Integer getMasterCatalogId() {
    return masterCatalogId;
  }


  public void setMasterCatalogId(Integer masterCatalogId) {
    this.masterCatalogId = masterCatalogId;
  }


  public ProductType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the productType
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the productType")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductType options(List<AttributeInProductType> options) {
    
    this.options = options;
    return this;
  }

  public ProductType addOptionsItem(AttributeInProductType optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Collection of the Attributes that are Options in this productType
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of the Attributes that are Options in this productType")

  public List<AttributeInProductType> getOptions() {
    return options;
  }


  public void setOptions(List<AttributeInProductType> options) {
    this.options = options;
  }


  public ProductType productCount(Integer productCount) {
    
    this.productCount = productCount;
    return this;
  }

   /**
   * Indicates the number of products currently using this Product Type. System-supplied and read-only.
   * @return productCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the number of products currently using this Product Type. System-supplied and read-only.")

  public Integer getProductCount() {
    return productCount;
  }


  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }


  public ProductType productUsages(List<String> productUsages) {
    
    this.productUsages = productUsages;
    return this;
  }

  public ProductType addProductUsagesItem(String productUsagesItem) {
    if (this.productUsages == null) {
      this.productUsages = new ArrayList<>();
    }
    this.productUsages.add(productUsagesItem);
    return this;
  }

   /**
   * List of ProductUsages supported by the ProductType.
   * @return productUsages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of ProductUsages supported by the ProductType.")

  public List<String> getProductUsages() {
    return productUsages;
  }


  public void setProductUsages(List<String> productUsages) {
    this.productUsages = productUsages;
  }


  public ProductType properties(List<AttributeInProductType> properties) {
    
    this.properties = properties;
    return this;
  }

  public ProductType addPropertiesItem(AttributeInProductType propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Collection of the Attributes that are Properties in this productType
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of the Attributes that are Properties in this productType")

  public List<AttributeInProductType> getProperties() {
    return properties;
  }


  public void setProperties(List<AttributeInProductType> properties) {
    this.properties = properties;
  }


  public ProductType variantProperties(List<AttributeInProductType> variantProperties) {
    
    this.variantProperties = variantProperties;
    return this;
  }

  public ProductType addVariantPropertiesItem(AttributeInProductType variantPropertiesItem) {
    if (this.variantProperties == null) {
      this.variantProperties = new ArrayList<>();
    }
    this.variantProperties.add(variantPropertiesItem);
    return this;
  }

   /**
   * Collection of the Attributes that are VariantProperties in this productType
   * @return variantProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection of the Attributes that are VariantProperties in this productType")

  public List<AttributeInProductType> getVariantProperties() {
    return variantProperties;
  }


  public void setVariantProperties(List<AttributeInProductType> variantProperties) {
    this.variantProperties = variantProperties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType productType = (ProductType) o;
    return Objects.equals(this.auditInfo, productType.auditInfo) &&
        Objects.equals(this.extras, productType.extras) &&
        Objects.equals(this.goodsType, productType.goodsType) &&
        Objects.equals(this.id, productType.id) &&
        Objects.equals(this.isBaseProductType, productType.isBaseProductType) &&
        Objects.equals(this.masterCatalogId, productType.masterCatalogId) &&
        Objects.equals(this.name, productType.name) &&
        Objects.equals(this.options, productType.options) &&
        Objects.equals(this.productCount, productType.productCount) &&
        Objects.equals(this.productUsages, productType.productUsages) &&
        Objects.equals(this.properties, productType.properties) &&
        Objects.equals(this.variantProperties, productType.variantProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, extras, goodsType, id, isBaseProductType, masterCatalogId, name, options, productCount, productUsages, properties, variantProperties);
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
    sb.append("class ProductType {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("    goodsType: ").append(toIndentedString(goodsType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBaseProductType: ").append(toIndentedString(isBaseProductType)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    productUsages: ").append(toIndentedString(productUsages)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    variantProperties: ").append(toIndentedString(variantProperties)).append("\n");
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
    openapiFields.add("extras");
    openapiFields.add("goodsType");
    openapiFields.add("id");
    openapiFields.add("isBaseProductType");
    openapiFields.add("masterCatalogId");
    openapiFields.add("name");
    openapiFields.add("options");
    openapiFields.add("productCount");
    openapiFields.add("productUsages");
    openapiFields.add("properties");
    openapiFields.add("variantProperties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductType is not found in the empty JSON string", ProductType.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!ProductType.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AdminUserAuditInfo.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if (jsonObj.get("extras") != null && !jsonObj.get("extras").isJsonNull()) {
        JsonArray jsonArrayextras = jsonObj.getAsJsonArray("extras");
        if (jsonArrayextras != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extras").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extras` to be an array in the JSON string but got `%s`", jsonObj.get("extras").toString()));
          }

          // validate the optional field `extras` (array)
          for (int i = 0; i < jsonArrayextras.size(); i++) {
            AttributeInProductType.validateJsonObject(jsonArrayextras.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("goodsType") != null && !jsonObj.get("goodsType").isJsonNull()) && !jsonObj.get("goodsType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goodsType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goodsType").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            AttributeInProductType.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("productUsages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `productUsages` to be an array in the JSON string but got `%s`", jsonObj.get("productUsages").toString()));
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            AttributeInProductType.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("variantProperties") != null && !jsonObj.get("variantProperties").isJsonNull()) {
        JsonArray jsonArrayvariantProperties = jsonObj.getAsJsonArray("variantProperties");
        if (jsonArrayvariantProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variantProperties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variantProperties` to be an array in the JSON string but got `%s`", jsonObj.get("variantProperties").toString()));
          }

          // validate the optional field `variantProperties` (array)
          for (int i = 0; i < jsonArrayvariantProperties.size(); i++) {
            AttributeInProductType.validateJsonObject(jsonArrayvariantProperties.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductType.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductType>() {
           @Override
           public void write(JsonWriter out, ProductType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductType
  * @throws IOException if the JSON string is invalid with respect to ProductType
  */
  public static ProductType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductType.class);
  }

 /**
  * Convert an instance of ProductType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

