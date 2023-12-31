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
import com.kibocommerce.sdk.fulfillment.models.FulfillmentChangeMessage;
import com.kibocommerce.sdk.fulfillment.models.PickWaveContent;
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
 * PickWave
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PickWave implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_AUDIT_INFO = "auditInfo";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private AuditInfo0 auditInfo;

  public static final String SERIALIZED_NAME_CHANGE_MESSAGES = "changeMessages";
  @SerializedName(SERIALIZED_NAME_CHANGE_MESSAGES)
  private List<FulfillmentChangeMessage> changeMessages = null;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<PickWaveContent> contents = null;

  public static final String SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE = "fulfillmentLocationCode";
  @SerializedName(SERIALIZED_NAME_FULFILLMENT_LOCATION_CODE)
  private String fulfillmentLocationCode;

  public static final String SERIALIZED_NAME_MAX_SHIPMENTS = "maxShipments";
  @SerializedName(SERIALIZED_NAME_MAX_SHIPMENTS)
  private Integer maxShipments;

  public static final String SERIALIZED_NAME_PARENT_PICK_WAVE_NUMBER = "parentPickWaveNumber";
  @SerializedName(SERIALIZED_NAME_PARENT_PICK_WAVE_NUMBER)
  private Integer parentPickWaveNumber;

  /**
   * Gets or Sets pickType
   */
  @JsonAdapter(PickTypeEnum.Adapter.class)
  public enum PickTypeEnum {
    MULTIPLE("MULTIPLE"),
    
    NORMAL("NORMAL"),
    
    SINGLE("SINGLE");

    private String value;

    PickTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickTypeEnum fromValue(String value) {
      for (PickTypeEnum b : PickTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PickTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PickTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_TYPE = "pickType";
  @SerializedName(SERIALIZED_NAME_PICK_TYPE)
  private PickTypeEnum pickType;

  public static final String SERIALIZED_NAME_PICK_WAVE_ID = "pickWaveId";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_ID)
  private String pickWaveId;

  public static final String SERIALIZED_NAME_PICK_WAVE_NUMBER = "pickWaveNumber";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_NUMBER)
  private Integer pickWaveNumber;

  /**
   * Gets or Sets pickWaveStatus
   */
  @JsonAdapter(PickWaveStatusEnum.Adapter.class)
  public enum PickWaveStatusEnum {
    CLOSED("CLOSED"),
    
    ERROR("ERROR"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    PENDING("PENDING"),
    
    PENDING_RECOVERY("PENDING_RECOVERY");

    private String value;

    PickWaveStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickWaveStatusEnum fromValue(String value) {
      for (PickWaveStatusEnum b : PickWaveStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PickWaveStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickWaveStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickWaveStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PickWaveStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_WAVE_STATUS = "pickWaveStatus";
  @SerializedName(SERIALIZED_NAME_PICK_WAVE_STATUS)
  private PickWaveStatusEnum pickWaveStatus;

  public static final String SERIALIZED_NAME_RECOVERY_PICK_WAVE_NUMBER = "recoveryPickWaveNumber";
  @SerializedName(SERIALIZED_NAME_RECOVERY_PICK_WAVE_NUMBER)
  private Integer recoveryPickWaveNumber;

  public static final String SERIALIZED_NAME_SHIPMENT_NUMBERS = "shipmentNumbers";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NUMBERS)
  private List<Integer> shipmentNumbers = null;

  public static final String SERIALIZED_NAME_SHIPMENT_TYPE = "shipmentType";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_TYPE)
  private String shipmentType;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private Integer tenantId;

  public static final String SERIALIZED_NAME_USER_DISPLAY_NAME = "userDisplayName";
  @SerializedName(SERIALIZED_NAME_USER_DISPLAY_NAME)
  private String userDisplayName;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public PickWave() {
  }

  public PickWave attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public PickWave putAttributesItem(String key, Object attributesItem) {
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


  public PickWave auditInfo(AuditInfo0 auditInfo) {
    
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


  public PickWave changeMessages(List<FulfillmentChangeMessage> changeMessages) {
    
    this.changeMessages = changeMessages;
    return this;
  }

  public PickWave addChangeMessagesItem(FulfillmentChangeMessage changeMessagesItem) {
    if (this.changeMessages == null) {
      this.changeMessages = new ArrayList<>();
    }
    this.changeMessages.add(changeMessagesItem);
    return this;
  }

   /**
   * Get changeMessages
   * @return changeMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FulfillmentChangeMessage> getChangeMessages() {
    return changeMessages;
  }


  public void setChangeMessages(List<FulfillmentChangeMessage> changeMessages) {
    this.changeMessages = changeMessages;
  }


  public PickWave contents(List<PickWaveContent> contents) {
    
    this.contents = contents;
    return this;
  }

  public PickWave addContentsItem(PickWaveContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PickWaveContent> getContents() {
    return contents;
  }


  public void setContents(List<PickWaveContent> contents) {
    this.contents = contents;
  }


  public PickWave fulfillmentLocationCode(String fulfillmentLocationCode) {
    
    this.fulfillmentLocationCode = fulfillmentLocationCode;
    return this;
  }

   /**
   * Get fulfillmentLocationCode
   * @return fulfillmentLocationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFulfillmentLocationCode() {
    return fulfillmentLocationCode;
  }


  public void setFulfillmentLocationCode(String fulfillmentLocationCode) {
    this.fulfillmentLocationCode = fulfillmentLocationCode;
  }


  public PickWave maxShipments(Integer maxShipments) {
    
    this.maxShipments = maxShipments;
    return this;
  }

   /**
   * Get maxShipments
   * @return maxShipments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxShipments() {
    return maxShipments;
  }


  public void setMaxShipments(Integer maxShipments) {
    this.maxShipments = maxShipments;
  }


  public PickWave parentPickWaveNumber(Integer parentPickWaveNumber) {
    
    this.parentPickWaveNumber = parentPickWaveNumber;
    return this;
  }

   /**
   * Get parentPickWaveNumber
   * @return parentPickWaveNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getParentPickWaveNumber() {
    return parentPickWaveNumber;
  }


  public void setParentPickWaveNumber(Integer parentPickWaveNumber) {
    this.parentPickWaveNumber = parentPickWaveNumber;
  }


  public PickWave pickType(PickTypeEnum pickType) {
    
    this.pickType = pickType;
    return this;
  }

   /**
   * Get pickType
   * @return pickType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PickTypeEnum getPickType() {
    return pickType;
  }


  public void setPickType(PickTypeEnum pickType) {
    this.pickType = pickType;
  }


  public PickWave pickWaveId(String pickWaveId) {
    
    this.pickWaveId = pickWaveId;
    return this;
  }

   /**
   * Get pickWaveId
   * @return pickWaveId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPickWaveId() {
    return pickWaveId;
  }


  public void setPickWaveId(String pickWaveId) {
    this.pickWaveId = pickWaveId;
  }


  public PickWave pickWaveNumber(Integer pickWaveNumber) {
    
    this.pickWaveNumber = pickWaveNumber;
    return this;
  }

   /**
   * Get pickWaveNumber
   * @return pickWaveNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPickWaveNumber() {
    return pickWaveNumber;
  }


  public void setPickWaveNumber(Integer pickWaveNumber) {
    this.pickWaveNumber = pickWaveNumber;
  }


  public PickWave pickWaveStatus(PickWaveStatusEnum pickWaveStatus) {
    
    this.pickWaveStatus = pickWaveStatus;
    return this;
  }

   /**
   * Get pickWaveStatus
   * @return pickWaveStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PickWaveStatusEnum getPickWaveStatus() {
    return pickWaveStatus;
  }


  public void setPickWaveStatus(PickWaveStatusEnum pickWaveStatus) {
    this.pickWaveStatus = pickWaveStatus;
  }


  public PickWave recoveryPickWaveNumber(Integer recoveryPickWaveNumber) {
    
    this.recoveryPickWaveNumber = recoveryPickWaveNumber;
    return this;
  }

   /**
   * Get recoveryPickWaveNumber
   * @return recoveryPickWaveNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRecoveryPickWaveNumber() {
    return recoveryPickWaveNumber;
  }


  public void setRecoveryPickWaveNumber(Integer recoveryPickWaveNumber) {
    this.recoveryPickWaveNumber = recoveryPickWaveNumber;
  }


  public PickWave shipmentNumbers(List<Integer> shipmentNumbers) {
    
    this.shipmentNumbers = shipmentNumbers;
    return this;
  }

  public PickWave addShipmentNumbersItem(Integer shipmentNumbersItem) {
    if (this.shipmentNumbers == null) {
      this.shipmentNumbers = new ArrayList<>();
    }
    this.shipmentNumbers.add(shipmentNumbersItem);
    return this;
  }

   /**
   * Get shipmentNumbers
   * @return shipmentNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getShipmentNumbers() {
    return shipmentNumbers;
  }


  public void setShipmentNumbers(List<Integer> shipmentNumbers) {
    this.shipmentNumbers = shipmentNumbers;
  }


  public PickWave shipmentType(String shipmentType) {
    
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShipmentType() {
    return shipmentType;
  }


  public void setShipmentType(String shipmentType) {
    this.shipmentType = shipmentType;
  }


  public PickWave tenantId(Integer tenantId) {
    
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


  public PickWave userDisplayName(String userDisplayName) {
    
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


  public PickWave userId(String userId) {
    
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
    PickWave pickWave = (PickWave) o;
    return Objects.equals(this.attributes, pickWave.attributes) &&
        Objects.equals(this.auditInfo, pickWave.auditInfo) &&
        Objects.equals(this.changeMessages, pickWave.changeMessages) &&
        Objects.equals(this.contents, pickWave.contents) &&
        Objects.equals(this.fulfillmentLocationCode, pickWave.fulfillmentLocationCode) &&
        Objects.equals(this.maxShipments, pickWave.maxShipments) &&
        Objects.equals(this.parentPickWaveNumber, pickWave.parentPickWaveNumber) &&
        Objects.equals(this.pickType, pickWave.pickType) &&
        Objects.equals(this.pickWaveId, pickWave.pickWaveId) &&
        Objects.equals(this.pickWaveNumber, pickWave.pickWaveNumber) &&
        Objects.equals(this.pickWaveStatus, pickWave.pickWaveStatus) &&
        Objects.equals(this.recoveryPickWaveNumber, pickWave.recoveryPickWaveNumber) &&
        Objects.equals(this.shipmentNumbers, pickWave.shipmentNumbers) &&
        Objects.equals(this.shipmentType, pickWave.shipmentType) &&
        Objects.equals(this.tenantId, pickWave.tenantId) &&
        Objects.equals(this.userDisplayName, pickWave.userDisplayName) &&
        Objects.equals(this.userId, pickWave.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, auditInfo, changeMessages, contents, fulfillmentLocationCode, maxShipments, parentPickWaveNumber, pickType, pickWaveId, pickWaveNumber, pickWaveStatus, recoveryPickWaveNumber, shipmentNumbers, shipmentType, tenantId, userDisplayName, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickWave {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    changeMessages: ").append(toIndentedString(changeMessages)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    fulfillmentLocationCode: ").append(toIndentedString(fulfillmentLocationCode)).append("\n");
    sb.append("    maxShipments: ").append(toIndentedString(maxShipments)).append("\n");
    sb.append("    parentPickWaveNumber: ").append(toIndentedString(parentPickWaveNumber)).append("\n");
    sb.append("    pickType: ").append(toIndentedString(pickType)).append("\n");
    sb.append("    pickWaveId: ").append(toIndentedString(pickWaveId)).append("\n");
    sb.append("    pickWaveNumber: ").append(toIndentedString(pickWaveNumber)).append("\n");
    sb.append("    pickWaveStatus: ").append(toIndentedString(pickWaveStatus)).append("\n");
    sb.append("    recoveryPickWaveNumber: ").append(toIndentedString(recoveryPickWaveNumber)).append("\n");
    sb.append("    shipmentNumbers: ").append(toIndentedString(shipmentNumbers)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
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
    openapiFields.add("changeMessages");
    openapiFields.add("contents");
    openapiFields.add("fulfillmentLocationCode");
    openapiFields.add("maxShipments");
    openapiFields.add("parentPickWaveNumber");
    openapiFields.add("pickType");
    openapiFields.add("pickWaveId");
    openapiFields.add("pickWaveNumber");
    openapiFields.add("pickWaveStatus");
    openapiFields.add("recoveryPickWaveNumber");
    openapiFields.add("shipmentNumbers");
    openapiFields.add("shipmentType");
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
  * @throws IOException if the JSON Object is invalid with respect to PickWave
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PickWave.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PickWave is not found in the empty JSON string", PickWave.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PickWave.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PickWave` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // validate the optional field `auditInfo`
      if (jsonObj.get("auditInfo") != null && !jsonObj.get("auditInfo").isJsonNull()) {
        AuditInfo0.validateJsonObject(jsonObj.getAsJsonObject("auditInfo"));
      }
      if (jsonObj.get("changeMessages") != null && !jsonObj.get("changeMessages").isJsonNull()) {
        JsonArray jsonArraychangeMessages = jsonObj.getAsJsonArray("changeMessages");
        if (jsonArraychangeMessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("changeMessages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `changeMessages` to be an array in the JSON string but got `%s`", jsonObj.get("changeMessages").toString()));
          }

          // validate the optional field `changeMessages` (array)
          for (int i = 0; i < jsonArraychangeMessages.size(); i++) {
            FulfillmentChangeMessage.validateJsonObject(jsonArraychangeMessages.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("contents") != null && !jsonObj.get("contents").isJsonNull()) {
        JsonArray jsonArraycontents = jsonObj.getAsJsonArray("contents");
        if (jsonArraycontents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("contents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `contents` to be an array in the JSON string but got `%s`", jsonObj.get("contents").toString()));
          }

          // validate the optional field `contents` (array)
          for (int i = 0; i < jsonArraycontents.size(); i++) {
            PickWaveContent.validateJsonObject(jsonArraycontents.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("fulfillmentLocationCode") != null && !jsonObj.get("fulfillmentLocationCode").isJsonNull()) && !jsonObj.get("fulfillmentLocationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fulfillmentLocationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fulfillmentLocationCode").toString()));
      }
      if ((jsonObj.get("pickType") != null && !jsonObj.get("pickType").isJsonNull()) && !jsonObj.get("pickType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickType").toString()));
      }
      if ((jsonObj.get("pickWaveId") != null && !jsonObj.get("pickWaveId").isJsonNull()) && !jsonObj.get("pickWaveId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickWaveId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickWaveId").toString()));
      }
      if ((jsonObj.get("pickWaveStatus") != null && !jsonObj.get("pickWaveStatus").isJsonNull()) && !jsonObj.get("pickWaveStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pickWaveStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pickWaveStatus").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("shipmentNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentNumbers").toString()));
      }
      if ((jsonObj.get("shipmentType") != null && !jsonObj.get("shipmentType").isJsonNull()) && !jsonObj.get("shipmentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipmentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipmentType").toString()));
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
       if (!PickWave.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PickWave' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PickWave> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PickWave.class));

       return (TypeAdapter<T>) new TypeAdapter<PickWave>() {
           @Override
           public void write(JsonWriter out, PickWave value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PickWave read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PickWave given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PickWave
  * @throws IOException if the JSON string is invalid with respect to PickWave
  */
  public static PickWave fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PickWave.class);
  }

 /**
  * Convert an instance of PickWave to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

