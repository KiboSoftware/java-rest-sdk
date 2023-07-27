/*
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.orderrouting.models;

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
 * SuggestionEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SuggestionEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAUSE_I_D = "causeID";
  @SerializedName(SERIALIZED_NAME_CAUSE_I_D)
  private Integer causeID;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NEW_REQUEST("NEW_REQUEST"),
    
    ROUTE_SELECTED("ROUTE_SELECTED"),
    
    MAKE_LOCATIONS_AVAILABLE("MAKE_LOCATIONS_AVAILABLE"),
    
    NO_ROUTE_FOUND("NO_ROUTE_FOUND"),
    
    REMOVED_INACTIVE_LOCATIONS("REMOVED_INACTIVE_LOCATIONS"),
    
    REMOVED_ON_HOLD_LOCATIONS("REMOVED_ON_HOLD_LOCATIONS"),
    
    REMOVED_OVERFULFILLED_LOCATIONS("REMOVED_OVERFULFILLED_LOCATIONS"),
    
    GROUP("GROUP"),
    
    GROUP_FILTER("GROUP_FILTER"),
    
    GROUP_SORT("GROUP_SORT"),
    
    FILTER("FILTER"),
    
    SORT("SORT"),
    
    AFTER_ACTION("AFTER_ACTION"),
    
    FOUND_FULL_ORDER_LOCATION("FOUND_FULL_ORDER_LOCATION"),
    
    RESPONSE("RESPONSE"),
    
    AFTER_ACTION_SORT("AFTER_ACTION_SORT"),
    
    DEFAULT_RESPONSE("DEFAULT_RESPONSE"),
    
    MAX_SPLITS_EXCEEDED("MAX_SPLITS_EXCEEDED"),
    
    AUTO_ASSIGN_LIMIT_EXCEEDED("AUTO_ASSIGN_LIMIT_EXCEEDED"),
    
    INVENTORY_REQUEST("INVENTORY_REQUEST"),
    
    REMOVED_INTERNATIONAL_LOCATIONS("REMOVED_INTERNATIONAL_LOCATIONS"),
    
    SUGGESTION_UPDATED("SUGGESTION_UPDATED"),
    
    NON_EXPRESS_LOCATIONS_FILTERED("NON_EXPRESS_LOCATIONS_FILTERED"),
    
    STH_CONSOLIDATED_INITIATED("STH_CONSOLIDATED_INITIATED"),
    
    STH_CONSOLIDATED_NOT_USED("STH_CONSOLIDATED_NOT_USED"),
    
    STH_CONSOLIDATED_USED("STH_CONSOLIDATED_USED"),
    
    FUTURE_ATP_INITIATED("FUTURE_ATP_INITIATED"),
    
    FUTURE_ATP_NOT_USED("FUTURE_ATP_NOT_USED"),
    
    FUTURE_ATP_USED("FUTURE_ATP_USED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public SuggestionEvent() {
  }

  public SuggestionEvent causeID(Integer causeID) {
    
    this.causeID = causeID;
    return this;
  }

   /**
   * Get causeID
   * @return causeID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCauseID() {
    return causeID;
  }


  public void setCauseID(Integer causeID) {
    this.causeID = causeID;
  }


  public SuggestionEvent errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public SuggestionEvent addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  public SuggestionEvent name(String name) {
    
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


  public SuggestionEvent type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionEvent suggestionEvent = (SuggestionEvent) o;
    return Objects.equals(this.causeID, suggestionEvent.causeID) &&
        Objects.equals(this.errors, suggestionEvent.errors) &&
        Objects.equals(this.name, suggestionEvent.name) &&
        Objects.equals(this.type, suggestionEvent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causeID, errors, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionEvent {\n");
    sb.append("    causeID: ").append(toIndentedString(causeID)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("causeID");
    openapiFields.add("errors");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionEvent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SuggestionEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionEvent is not found in the empty JSON string", SuggestionEvent.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!SuggestionEvent.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionEvent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      // ensure the json data is an array
      if (!jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionEvent>() {
           @Override
           public void write(JsonWriter out, SuggestionEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionEvent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionEvent
  * @throws IOException if the JSON string is invalid with respect to SuggestionEvent
  */
  public static SuggestionEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionEvent.class);
  }

 /**
  * Convert an instance of SuggestionEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
