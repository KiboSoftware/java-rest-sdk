/*
 * Kibo Tenant Service
 * OpenAPI Spec for Kibo Tenant Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.common.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.common.models.AdminUserMasterCatalog;
import com.kibocommerce.sdk.common.models.Site;
import com.kibocommerce.sdk.common.models.TenantAttribute;
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
 * TenantTenant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TenantTenant implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IS_DEV_TENANT = "isDevTenant";
  @SerializedName(SERIALIZED_NAME_IS_DEV_TENANT)
  private Boolean isDevTenant;

  public static final String SERIALIZED_NAME_SITES = "sites";
  @SerializedName(SERIALIZED_NAME_SITES)
  private List<Site> sites = null;

  public static final String SERIALIZED_NAME_MASTER_CATALOGS = "masterCatalogs";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOGS)
  private List<AdminUserMasterCatalog> masterCatalogs = null;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_LAST_LOGIN_DATE = "lastLoginDate";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_DATE)
  private OffsetDateTime lastLoginDate;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<TenantAttribute> attributes = null;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private OffsetDateTime expiry;

  public static final String SERIALIZED_NAME_IS_UNIFIED = "isUnified";
  @SerializedName(SERIALIZED_NAME_IS_UNIFIED)
  private Boolean isUnified;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TenantTenant() {
  }

  public TenantTenant isDevTenant(Boolean isDevTenant) {
    
    this.isDevTenant = isDevTenant;
    return this;
  }

   /**
   * Get isDevTenant
   * @return isDevTenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDevTenant() {
    return isDevTenant;
  }


  public void setIsDevTenant(Boolean isDevTenant) {
    this.isDevTenant = isDevTenant;
  }


  public TenantTenant sites(List<Site> sites) {
    
    this.sites = sites;
    return this;
  }

  public TenantTenant addSitesItem(Site sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<>();
    }
    this.sites.add(sitesItem);
    return this;
  }

   /**
   * Get sites
   * @return sites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Site> getSites() {
    return sites;
  }


  public void setSites(List<Site> sites) {
    this.sites = sites;
  }


  public TenantTenant masterCatalogs(List<AdminUserMasterCatalog> masterCatalogs) {
    
    this.masterCatalogs = masterCatalogs;
    return this;
  }

  public TenantTenant addMasterCatalogsItem(AdminUserMasterCatalog masterCatalogsItem) {
    if (this.masterCatalogs == null) {
      this.masterCatalogs = new ArrayList<>();
    }
    this.masterCatalogs.add(masterCatalogsItem);
    return this;
  }

   /**
   * Get masterCatalogs
   * @return masterCatalogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AdminUserMasterCatalog> getMasterCatalogs() {
    return masterCatalogs;
  }


  public void setMasterCatalogs(List<AdminUserMasterCatalog> masterCatalogs) {
    this.masterCatalogs = masterCatalogs;
  }


  public TenantTenant domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public TenantTenant lastLoginDate(OffsetDateTime lastLoginDate) {
    
    this.lastLoginDate = lastLoginDate;
    return this;
  }

   /**
   * Get lastLoginDate
   * @return lastLoginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastLoginDate() {
    return lastLoginDate;
  }


  public void setLastLoginDate(OffsetDateTime lastLoginDate) {
    this.lastLoginDate = lastLoginDate;
  }


  public TenantTenant attributes(List<TenantAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public TenantTenant addAttributesItem(TenantAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TenantAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<TenantAttribute> attributes) {
    this.attributes = attributes;
  }


  public TenantTenant expiry(OffsetDateTime expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiry() {
    return expiry;
  }


  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }


  public TenantTenant isUnified(Boolean isUnified) {
    
    this.isUnified = isUnified;
    return this;
  }

   /**
   * Get isUnified
   * @return isUnified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsUnified() {
    return isUnified;
  }


  public void setIsUnified(Boolean isUnified) {
    this.isUnified = isUnified;
  }


  public TenantTenant id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TenantTenant name(String name) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantTenant tenantTenant = (TenantTenant) o;
    return Objects.equals(this.isDevTenant, tenantTenant.isDevTenant) &&
        Objects.equals(this.sites, tenantTenant.sites) &&
        Objects.equals(this.masterCatalogs, tenantTenant.masterCatalogs) &&
        Objects.equals(this.domain, tenantTenant.domain) &&
        Objects.equals(this.lastLoginDate, tenantTenant.lastLoginDate) &&
        Objects.equals(this.attributes, tenantTenant.attributes) &&
        Objects.equals(this.expiry, tenantTenant.expiry) &&
        Objects.equals(this.isUnified, tenantTenant.isUnified) &&
        Objects.equals(this.id, tenantTenant.id) &&
        Objects.equals(this.name, tenantTenant.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDevTenant, sites, masterCatalogs, domain, lastLoginDate, attributes, expiry, isUnified, id, name);
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
    sb.append("class TenantTenant {\n");
    sb.append("    isDevTenant: ").append(toIndentedString(isDevTenant)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    masterCatalogs: ").append(toIndentedString(masterCatalogs)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    lastLoginDate: ").append(toIndentedString(lastLoginDate)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    isUnified: ").append(toIndentedString(isUnified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TenantTenant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TenantTenant.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TenantTenant is not found in the empty JSON string", TenantTenant.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!TenantTenant.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TenantTenant` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("sites") != null && !jsonObj.get("sites").isJsonNull()) {
        JsonArray jsonArraysites = jsonObj.getAsJsonArray("sites");
        if (jsonArraysites != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sites").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sites` to be an array in the JSON string but got `%s`", jsonObj.get("sites").toString()));
          }

          // validate the optional field `sites` (array)
          for (int i = 0; i < jsonArraysites.size(); i++) {
            Site.validateJsonObject(jsonArraysites.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("masterCatalogs") != null && !jsonObj.get("masterCatalogs").isJsonNull()) {
        JsonArray jsonArraymasterCatalogs = jsonObj.getAsJsonArray("masterCatalogs");
        if (jsonArraymasterCatalogs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("masterCatalogs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `masterCatalogs` to be an array in the JSON string but got `%s`", jsonObj.get("masterCatalogs").toString()));
          }

          // validate the optional field `masterCatalogs` (array)
          for (int i = 0; i < jsonArraymasterCatalogs.size(); i++) {
            AdminUserMasterCatalog.validateJsonObject(jsonArraymasterCatalogs.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
        if (jsonArrayattributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
          }

          // validate the optional field `attributes` (array)
          for (int i = 0; i < jsonArrayattributes.size(); i++) {
            TenantAttribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TenantTenant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TenantTenant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TenantTenant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TenantTenant.class));

       return (TypeAdapter<T>) new TypeAdapter<TenantTenant>() {
           @Override
           public void write(JsonWriter out, TenantTenant value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TenantTenant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TenantTenant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TenantTenant
  * @throws IOException if the JSON string is invalid with respect to TenantTenant
  */
  public static TenantTenant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TenantTenant.class);
  }

 /**
  * Convert an instance of TenantTenant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
