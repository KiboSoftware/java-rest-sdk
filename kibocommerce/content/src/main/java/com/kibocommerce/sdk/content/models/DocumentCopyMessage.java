/*
 * Kibo Content Service
 * OpenAPI Spec for Kibo Content Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.content.models;

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
 * DocumentCopyMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentCopyMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORIGINAL_DOCUMENT_ID = "originalDocumentId";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DOCUMENT_ID)
  private String originalDocumentId;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "documentName";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;

  public static final String SERIALIZED_NAME_DOCUMENT_PUBLISH_SET_CODE = "documentPublishSetCode";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_PUBLISH_SET_CODE)
  private String documentPublishSetCode;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public DocumentCopyMessage() {
  }

  public DocumentCopyMessage originalDocumentId(String originalDocumentId) {
    
    this.originalDocumentId = originalDocumentId;
    return this;
  }

   /**
   * Get originalDocumentId
   * @return originalDocumentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOriginalDocumentId() {
    return originalDocumentId;
  }


  public void setOriginalDocumentId(String originalDocumentId) {
    this.originalDocumentId = originalDocumentId;
  }


  public DocumentCopyMessage documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public DocumentCopyMessage documentName(String documentName) {
    
    this.documentName = documentName;
    return this;
  }

   /**
   * Get documentName
   * @return documentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocumentName() {
    return documentName;
  }


  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  public DocumentCopyMessage documentPublishSetCode(String documentPublishSetCode) {
    
    this.documentPublishSetCode = documentPublishSetCode;
    return this;
  }

   /**
   * Get documentPublishSetCode
   * @return documentPublishSetCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocumentPublishSetCode() {
    return documentPublishSetCode;
  }


  public void setDocumentPublishSetCode(String documentPublishSetCode) {
    this.documentPublishSetCode = documentPublishSetCode;
  }


  public DocumentCopyMessage message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public DocumentCopyMessage success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCopyMessage documentCopyMessage = (DocumentCopyMessage) o;
    return Objects.equals(this.originalDocumentId, documentCopyMessage.originalDocumentId) &&
        Objects.equals(this.documentId, documentCopyMessage.documentId) &&
        Objects.equals(this.documentName, documentCopyMessage.documentName) &&
        Objects.equals(this.documentPublishSetCode, documentCopyMessage.documentPublishSetCode) &&
        Objects.equals(this.message, documentCopyMessage.message) &&
        Objects.equals(this.success, documentCopyMessage.success);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalDocumentId, documentId, documentName, documentPublishSetCode, message, success);
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
    sb.append("class DocumentCopyMessage {\n");
    sb.append("    originalDocumentId: ").append(toIndentedString(originalDocumentId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentPublishSetCode: ").append(toIndentedString(documentPublishSetCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("originalDocumentId");
    openapiFields.add("documentId");
    openapiFields.add("documentName");
    openapiFields.add("documentPublishSetCode");
    openapiFields.add("message");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocumentCopyMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocumentCopyMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentCopyMessage is not found in the empty JSON string", DocumentCopyMessage.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!DocumentCopyMessage.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentCopyMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("originalDocumentId") != null && !jsonObj.get("originalDocumentId").isJsonNull()) && !jsonObj.get("originalDocumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalDocumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalDocumentId").toString()));
      }
      if ((jsonObj.get("documentId") != null && !jsonObj.get("documentId").isJsonNull()) && !jsonObj.get("documentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentId").toString()));
      }
      if ((jsonObj.get("documentName") != null && !jsonObj.get("documentName").isJsonNull()) && !jsonObj.get("documentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentName").toString()));
      }
      if ((jsonObj.get("documentPublishSetCode") != null && !jsonObj.get("documentPublishSetCode").isJsonNull()) && !jsonObj.get("documentPublishSetCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentPublishSetCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentPublishSetCode").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentCopyMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentCopyMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentCopyMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentCopyMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentCopyMessage>() {
           @Override
           public void write(JsonWriter out, DocumentCopyMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentCopyMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentCopyMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentCopyMessage
  * @throws IOException if the JSON string is invalid with respect to DocumentCopyMessage
  */
  public static DocumentCopyMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentCopyMessage.class);
  }

 /**
  * Convert an instance of DocumentCopyMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

