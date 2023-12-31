/*
 * Kibo MZDB Service
 * OpenAPI Spec for Kibo MZDB Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.entities.models;

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
 * The metadata and Entity contents for an entity persisted in an EntityList in MZDB. The Item property contains the json representation of the Entity
 */
@ApiModel(description = "The metadata and Entity contents for an entity persisted in an EntityList in MZDB. The Item property contains the json representation of the Entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityContainer implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Integer siteId;

  public static final String SERIALIZED_NAME_MASTER_CATALOG_ID = "masterCatalogId";
  @SerializedName(SERIALIZED_NAME_MASTER_CATALOG_ID)
  private Integer masterCatalogId;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_LOCALE_CODE = "localeCode";
  @SerializedName(SERIALIZED_NAME_LOCALE_CODE)
  private String localeCode;

  public static final String SERIALIZED_NAME_LIST_FULL_NAME = "listFullName";
  @SerializedName(SERIALIZED_NAME_LIST_FULL_NAME)
  private String listFullName;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private Object item = null;

  public static final String SERIALIZED_NAME_CREATE_BY = "createBy";
  @SerializedName(SERIALIZED_NAME_CREATE_BY)
  private String createBy;

  public static final String SERIALIZED_NAME_CREATE_DATE = "createDate";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE)
  private OffsetDateTime createDate;

  public static final String SERIALIZED_NAME_UPDATE_BY = "updateBy";
  @SerializedName(SERIALIZED_NAME_UPDATE_BY)
  private String updateBy;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "updateDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private OffsetDateTime updateDate;

  public EntityContainer() {
  }

  public EntityContainer tenantId(Integer tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTenantId() {
    return tenantId;
  }


  public void setTenantId(Integer tenantId) {
    this.tenantId = tenantId;
  }


  public EntityContainer siteId(Integer siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSiteId() {
    return siteId;
  }


  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }


  public EntityContainer masterCatalogId(Integer masterCatalogId) {
    
    this.masterCatalogId = masterCatalogId;
    return this;
  }

   /**
   * Get masterCatalogId
   * @return masterCatalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMasterCatalogId() {
    return masterCatalogId;
  }


  public void setMasterCatalogId(Integer masterCatalogId) {
    this.masterCatalogId = masterCatalogId;
  }


  public EntityContainer catalogId(Integer catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCatalogId() {
    return catalogId;
  }


  public void setCatalogId(Integer catalogId) {
    this.catalogId = catalogId;
  }


  public EntityContainer localeCode(String localeCode) {
    
    this.localeCode = localeCode;
    return this;
  }

   /**
   * The localeCode for the Entity. This will only be populated for EntityLists that are created with IsLocaleSpecific set to true.
   * @return localeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The localeCode for the Entity. This will only be populated for EntityLists that are created with IsLocaleSpecific set to true.")

  public String getLocaleCode() {
    return localeCode;
  }


  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }


  public EntityContainer listFullName(String listFullName) {
    
    this.listFullName = listFullName;
    return this;
  }

   /**
   * The nameSpace and name for the EntityList in the format name@nameSpace.
   * @return listFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The nameSpace and name for the EntityList in the format name@nameSpace.")

  public String getListFullName() {
    return listFullName;
  }


  public void setListFullName(String listFullName) {
    this.listFullName = listFullName;
  }


  public EntityContainer userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The userId of the shopper account associated with this Entity. This will only be populated for EntityLists that are creaetd with IsShopperSpecific set to true.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The userId of the shopper account associated with this Entity. This will only be populated for EntityLists that are creaetd with IsShopperSpecific set to true.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public EntityContainer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the Entity.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the Entity.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EntityContainer item(Object item) {
    
    this.item = item;
    return this;
  }

   /**
   * The entity in json format.
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The entity in json format.")

  public Object getItem() {
    return item;
  }


  public void setItem(Object item) {
    this.item = item;
  }


  public EntityContainer createBy(String createBy) {
    
    this.createBy = createBy;
    return this;
  }

   /**
   * Get createBy
   * @return createBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateBy() {
    return createBy;
  }


  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public EntityContainer createDate(OffsetDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreateDate() {
    return createDate;
  }


  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }


  public EntityContainer updateBy(String updateBy) {
    
    this.updateBy = updateBy;
    return this;
  }

   /**
   * Get updateBy
   * @return updateBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateBy() {
    return updateBy;
  }


  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public EntityContainer updateDate(OffsetDateTime updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }


  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityContainer entityContainer = (EntityContainer) o;
    return Objects.equals(this.tenantId, entityContainer.tenantId) &&
        Objects.equals(this.siteId, entityContainer.siteId) &&
        Objects.equals(this.masterCatalogId, entityContainer.masterCatalogId) &&
        Objects.equals(this.catalogId, entityContainer.catalogId) &&
        Objects.equals(this.localeCode, entityContainer.localeCode) &&
        Objects.equals(this.listFullName, entityContainer.listFullName) &&
        Objects.equals(this.userId, entityContainer.userId) &&
        Objects.equals(this.id, entityContainer.id) &&
        Objects.equals(this.item, entityContainer.item) &&
        Objects.equals(this.createBy, entityContainer.createBy) &&
        Objects.equals(this.createDate, entityContainer.createDate) &&
        Objects.equals(this.updateBy, entityContainer.updateBy) &&
        Objects.equals(this.updateDate, entityContainer.updateDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, siteId, masterCatalogId, catalogId, localeCode, listFullName, userId, id, item, createBy, createDate, updateBy, updateDate);
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
    sb.append("class EntityContainer {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    masterCatalogId: ").append(toIndentedString(masterCatalogId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    listFullName: ").append(toIndentedString(listFullName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("siteId");
    openapiFields.add("masterCatalogId");
    openapiFields.add("catalogId");
    openapiFields.add("localeCode");
    openapiFields.add("listFullName");
    openapiFields.add("userId");
    openapiFields.add("id");
    openapiFields.add("item");
    openapiFields.add("createBy");
    openapiFields.add("createDate");
    openapiFields.add("updateBy");
    openapiFields.add("updateDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EntityContainer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EntityContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EntityContainer is not found in the empty JSON string", EntityContainer.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!EntityContainer.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EntityContainer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("localeCode") != null && !jsonObj.get("localeCode").isJsonNull()) && !jsonObj.get("localeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localeCode").toString()));
      }
      if ((jsonObj.get("listFullName") != null && !jsonObj.get("listFullName").isJsonNull()) && !jsonObj.get("listFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listFullName").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("createBy") != null && !jsonObj.get("createBy").isJsonNull()) && !jsonObj.get("createBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createBy").toString()));
      }
      if ((jsonObj.get("updateBy") != null && !jsonObj.get("updateBy").isJsonNull()) && !jsonObj.get("updateBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updateBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntityContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntityContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntityContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntityContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<EntityContainer>() {
           @Override
           public void write(JsonWriter out, EntityContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntityContainer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntityContainer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntityContainer
  * @throws IOException if the JSON string is invalid with respect to EntityContainer
  */
  public static EntityContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntityContainer.class);
  }

 /**
  * Convert an instance of EntityContainer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

