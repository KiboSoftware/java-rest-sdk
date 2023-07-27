/*
 * Kibo Fulfillment Service
 * OpenAPI Spec for Kibo Fulfillment Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.fulfillment.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.fulfillment.models.AuditInfo0;
import com.kibocommerce.sdk.fulfillment.models.FulfillmentManifestShipment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Manifest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Manifest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo0 auditInfo;

  public static final String SERIALIZED_NAME_CARRIER_ID = "carrierId";
  @SerializedName(SERIALIZED_NAME_CARRIER_ID)
  private String carrierId;

  public static final String SERIALIZED_NAME_INTERNAL_ID = "internalId";
  @SerializedName(SERIALIZED_NAME_INTERNAL_ID)
  private String internalId;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_MANIFEST_ID = "manifestId";
  @SerializedName(SERIALIZED_NAME_MANIFEST_ID)
  private String manifestId;

  public static final String SERIALIZED_NAME_MANIFEST_URL = "manifestUrl";
  @SerializedName(SERIALIZED_NAME_MANIFEST_URL)
  private String manifestUrl;

  public static final String SERIALIZED_NAME_NUMBER_OF_PACKAGES = "numberOfPackages";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PACKAGES)
  private Integer numberOfPackages;

  public static final String SERIALIZED_NAME_NUMBER_OF_SHIPMENTS = "numberOfShipments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SHIPMENTS)
  private Integer numberOfShipments;

  public static final String SERIALIZED_NAME_SHIPMENTS = "shipments";
  @SerializedName(SERIALIZED_NAME_SHIPMENTS)
  private List<FulfillmentManifestShipment> shipments = null;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_USER_DISPLAY_NAME = "userDisplayName";
  @SerializedName(SERIALIZED_NAME_USER_DISPLAY_NAME)
  private String userDisplayName;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public Manifest() {
  }

  public Manifest attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Manifest putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public Manifest auditInfo(AuditInfo0 auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * Get auditInfo
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuditInfo0 getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(AuditInfo0 auditInfo) {
    this.auditInfo = auditInfo;
  }


  public Manifest carrierId(String carrierId) {
    
    this.carrierId = carrierId;
    return this;
  }

   /**
   * Get carrierId
   * @return carrierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCarrierId() {
    return carrierId;
  }


  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }


  public Manifest internalId(String internalId) {
    
    this.internalId = internalId;
    return this;
  }

   /**
   * Get internalId
   * @return internalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInternalId() {
    return internalId;
  }


  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }


  public Manifest locationCode(String locationCode) {
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }


  public Manifest manifestId(String manifestId) {
    
    this.manifestId = manifestId;
    return this;
  }

   /**
   * Get manifestId
   * @return manifestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManifestId() {
    return manifestId;
  }


  public void setManifestId(String manifestId) {
    this.manifestId = manifestId;
  }


  public Manifest manifestUrl(String manifestUrl) {
    
    this.manifestUrl = manifestUrl;
    return this;
  }

   /**
   * Get manifestUrl
   * @return manifestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManifestUrl() {
    return manifestUrl;
  }


  public void setManifestUrl(String manifestUrl) {
    this.manifestUrl = manifestUrl;
  }


  public Manifest numberOfPackages(Integer numberOfPackages) {
    
    this.numberOfPackages = numberOfPackages;
    return this;
  }

   /**
   * Get numberOfPackages
   * @return numberOfPackages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfPackages() {
    return numberOfPackages;
  }


  public void setNumberOfPackages(Integer numberOfPackages) {
    this.numberOfPackages = numberOfPackages;
  }


  public Manifest numberOfShipments(Integer numberOfShipments) {
    
    this.numberOfShipments = numberOfShipments;
    return this;
  }

   /**
   * Get numberOfShipments
   * @return numberOfShipments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfShipments() {
    return numberOfShipments;
  }


  public void setNumberOfShipments(Integer numberOfShipments) {
    this.numberOfShipments = numberOfShipments;
  }


  public Manifest shipments(List<FulfillmentManifestShipment> shipments) {
    
    this.shipments = shipments;
    return this;
  }

  public Manifest addShipmentsItem(FulfillmentManifestShipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FulfillmentManifestShipment> getShipments() {
    return shipments;
  }


  public void setShipments(List<FulfillmentManifestShipment> shipments) {
    this.shipments = shipments;
  }


  public Manifest tenantId(Integer tenantId) {
    
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


  public Manifest userDisplayName(String userDisplayName) {
    
    this.userDisplayName = userDisplayName;
    return this;
  }

   /**
   * Get userDisplayName
   * @return userDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserDisplayName() {
    return userDisplayName;
  }


  public void setUserDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
  }


  public Manifest userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manifest manifest = (Manifest) o;
    return Objects.equals(this.attributes, manifest.attributes) &&
        Objects.equals(this.auditInfo, manifest.auditInfo) &&
        Objects.equals(this.carrierId, manifest.carrierId) &&
        Objects.equals(this.internalId, manifest.internalId) &&
        Objects.equals(this.locationCode, manifest.locationCode) &&
        Objects.equals(this.manifestId, manifest.manifestId) &&
        Objects.equals(this.manifestUrl, manifest.manifestUrl) &&
        Objects.equals(this.numberOfPackages, manifest.numberOfPackages) &&
        Objects.equals(this.numberOfShipments, manifest.numberOfShipments) &&
        Objects.equals(this.shipments, manifest.shipments) &&
        Objects.equals(this.tenantId, manifest.tenantId) &&
        Objects.equals(this.userDisplayName, manifest.userDisplayName) &&
        Objects.equals(this.userId, manifest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, auditInfo, carrierId, internalId, locationCode, manifestId, manifestUrl, numberOfPackages, numberOfShipments, shipments, tenantId, userDisplayName, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manifest {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    internalId: ").append(toIndentedString(internalId)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    manifestUrl: ").append(toIndentedString(manifestUrl)).append("\n");
    sb.append("    numberOfPackages: ").append(toIndentedString(numberOfPackages)).append("\n");
    sb.append("    numberOfShipments: ").append(toIndentedString(numberOfShipments)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userDisplayName: ").append(toIndentedString(userDisplayName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("auditInfo");
    openapiFields.add("carrierId");
    openapiFields.add("internalId");
    openapiFields.add("locationCode");
    openapiFields.add("manifestId");
    openapiFields.add("manifestUrl");
    openapiFields.add("numberOfPackages");
    openapiFields.add("numberOfShipments");
    openapiFields.add("shipments");
    openapiFields.add("tenantId");
    openapiFields.add("userDisplayName");
    openapiFields.add("userId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Manifest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Manifest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Manifest is not found in the empty JSON string", Manifest.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!Manifest.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Manifest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AuditInfo0.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if ((jsonObj.get("carrierId") != null && !jsonObj.get("carrierId").isJsonNull()) && !jsonObj.get("carrierId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierId").toString()));
      }
      if ((jsonObj.get("internalId") != null && !jsonObj.get("internalId").isJsonNull()) && !jsonObj.get("internalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalId").toString()));
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("manifestId") != null && !jsonObj.get("manifestId").isJsonNull()) && !jsonObj.get("manifestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manifestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manifestId").toString()));
      }
      if ((jsonObj.get("manifestUrl") != null && !jsonObj.get("manifestUrl").isJsonNull()) && !jsonObj.get("manifestUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manifestUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manifestUrl").toString()));
      }
      if (jsonObj.get("shipments") != null && !jsonObj.get("shipments").isJsonNull()) {
        JsonArray jsonArrayshipments = jsonObj.getAsJsonArray("shipments");
        if (jsonArrayshipments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipments` to be an array in the JSON string but got `%s`", jsonObj.get("shipments").toString()));
          }

          // validate the optional field `shipments` (array)
          for (int i = 0; i < jsonArrayshipments.size(); i++) {
            FulfillmentManifestShipment.validateJsonObject(jsonArrayshipments.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("userDisplayName") != null && !jsonObj.get("userDisplayName").isJsonNull()) && !jsonObj.get("userDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userDisplayName").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Manifest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Manifest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Manifest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Manifest.class));

       return (TypeAdapter<T>) new TypeAdapter<Manifest>() {
           @Override
           public void write(JsonWriter out, Manifest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Manifest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Manifest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Manifest
  * @throws IOException if the JSON string is invalid with respect to Manifest
  */
  public static Manifest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Manifest.class);
  }

 /**
  * Convert an instance of Manifest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

