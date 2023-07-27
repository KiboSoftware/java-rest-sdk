/*
 * Kibo SiteSettings Service
 * OpenAPI Spec for Kibo SiteSettings Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.settings.models;

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
 * EmailTypeSetting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EmailTypeSetting implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SENDER_EMAIL_ADDRESS_OVERRIDE = "senderEmailAddressOverride";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL_ADDRESS_OVERRIDE)
  private String senderEmailAddressOverride;

  public static final String SERIALIZED_NAME_SENDER_EMAIL_ALIAS_OVERRIDE = "senderEmailAliasOverride";
  @SerializedName(SERIALIZED_NAME_SENDER_EMAIL_ALIAS_OVERRIDE)
  private String senderEmailAliasOverride;

  public static final String SERIALIZED_NAME_REPLY_TO_EMAIL_ADDRESS_OVERRIDE = "replyToEmailAddressOverride";
  @SerializedName(SERIALIZED_NAME_REPLY_TO_EMAIL_ADDRESS_OVERRIDE)
  private String replyToEmailAddressOverride;

  public static final String SERIALIZED_NAME_BCC_EMAIL_ADDRESS_OVERRIDE = "bccEmailAddressOverride";
  @SerializedName(SERIALIZED_NAME_BCC_EMAIL_ADDRESS_OVERRIDE)
  private String bccEmailAddressOverride;

  public EmailTypeSetting() {
  }

  public EmailTypeSetting id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EmailTypeSetting senderEmailAddressOverride(String senderEmailAddressOverride) {
    
    this.senderEmailAddressOverride = senderEmailAddressOverride;
    return this;
  }

   /**
   * Get senderEmailAddressOverride
   * @return senderEmailAddressOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSenderEmailAddressOverride() {
    return senderEmailAddressOverride;
  }


  public void setSenderEmailAddressOverride(String senderEmailAddressOverride) {
    this.senderEmailAddressOverride = senderEmailAddressOverride;
  }


  public EmailTypeSetting senderEmailAliasOverride(String senderEmailAliasOverride) {
    
    this.senderEmailAliasOverride = senderEmailAliasOverride;
    return this;
  }

   /**
   * Get senderEmailAliasOverride
   * @return senderEmailAliasOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSenderEmailAliasOverride() {
    return senderEmailAliasOverride;
  }


  public void setSenderEmailAliasOverride(String senderEmailAliasOverride) {
    this.senderEmailAliasOverride = senderEmailAliasOverride;
  }


  public EmailTypeSetting replyToEmailAddressOverride(String replyToEmailAddressOverride) {
    
    this.replyToEmailAddressOverride = replyToEmailAddressOverride;
    return this;
  }

   /**
   * Get replyToEmailAddressOverride
   * @return replyToEmailAddressOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReplyToEmailAddressOverride() {
    return replyToEmailAddressOverride;
  }


  public void setReplyToEmailAddressOverride(String replyToEmailAddressOverride) {
    this.replyToEmailAddressOverride = replyToEmailAddressOverride;
  }


  public EmailTypeSetting bccEmailAddressOverride(String bccEmailAddressOverride) {
    
    this.bccEmailAddressOverride = bccEmailAddressOverride;
    return this;
  }

   /**
   * Get bccEmailAddressOverride
   * @return bccEmailAddressOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBccEmailAddressOverride() {
    return bccEmailAddressOverride;
  }


  public void setBccEmailAddressOverride(String bccEmailAddressOverride) {
    this.bccEmailAddressOverride = bccEmailAddressOverride;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailTypeSetting emailTypeSetting = (EmailTypeSetting) o;
    return Objects.equals(this.id, emailTypeSetting.id) &&
        Objects.equals(this.senderEmailAddressOverride, emailTypeSetting.senderEmailAddressOverride) &&
        Objects.equals(this.senderEmailAliasOverride, emailTypeSetting.senderEmailAliasOverride) &&
        Objects.equals(this.replyToEmailAddressOverride, emailTypeSetting.replyToEmailAddressOverride) &&
        Objects.equals(this.bccEmailAddressOverride, emailTypeSetting.bccEmailAddressOverride);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, senderEmailAddressOverride, senderEmailAliasOverride, replyToEmailAddressOverride, bccEmailAddressOverride);
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
    sb.append("class EmailTypeSetting {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    senderEmailAddressOverride: ").append(toIndentedString(senderEmailAddressOverride)).append("\n");
    sb.append("    senderEmailAliasOverride: ").append(toIndentedString(senderEmailAliasOverride)).append("\n");
    sb.append("    replyToEmailAddressOverride: ").append(toIndentedString(replyToEmailAddressOverride)).append("\n");
    sb.append("    bccEmailAddressOverride: ").append(toIndentedString(bccEmailAddressOverride)).append("\n");
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
    openapiFields.add("senderEmailAddressOverride");
    openapiFields.add("senderEmailAliasOverride");
    openapiFields.add("replyToEmailAddressOverride");
    openapiFields.add("bccEmailAddressOverride");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailTypeSetting
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmailTypeSetting.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailTypeSetting is not found in the empty JSON string", EmailTypeSetting.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!EmailTypeSetting.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailTypeSetting` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("senderEmailAddressOverride") != null && !jsonObj.get("senderEmailAddressOverride").isJsonNull()) && !jsonObj.get("senderEmailAddressOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderEmailAddressOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderEmailAddressOverride").toString()));
      }
      if ((jsonObj.get("senderEmailAliasOverride") != null && !jsonObj.get("senderEmailAliasOverride").isJsonNull()) && !jsonObj.get("senderEmailAliasOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderEmailAliasOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderEmailAliasOverride").toString()));
      }
      if ((jsonObj.get("replyToEmailAddressOverride") != null && !jsonObj.get("replyToEmailAddressOverride").isJsonNull()) && !jsonObj.get("replyToEmailAddressOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `replyToEmailAddressOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("replyToEmailAddressOverride").toString()));
      }
      if ((jsonObj.get("bccEmailAddressOverride") != null && !jsonObj.get("bccEmailAddressOverride").isJsonNull()) && !jsonObj.get("bccEmailAddressOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bccEmailAddressOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bccEmailAddressOverride").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailTypeSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailTypeSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailTypeSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailTypeSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailTypeSetting>() {
           @Override
           public void write(JsonWriter out, EmailTypeSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailTypeSetting read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailTypeSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailTypeSetting
  * @throws IOException if the JSON string is invalid with respect to EmailTypeSetting
  */
  public static EmailTypeSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailTypeSetting.class);
  }

 /**
  * Convert an instance of EmailTypeSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
