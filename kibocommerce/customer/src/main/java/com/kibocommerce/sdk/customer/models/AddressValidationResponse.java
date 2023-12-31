/*
 * Kibo Customer Service
 * OpenAPI Spec for Kibo Customer Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.customer.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.customer.models.CommerceRuntimeAddress;
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
 * Address Validation Response
 */
@ApiModel(description = "Address Validation Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddressValidationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADDRESS_CANDIDATES = "addressCandidates";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CANDIDATES)
  private List<CommerceRuntimeAddress> addressCandidates = null;

  public AddressValidationResponse() {
  }

  public AddressValidationResponse addressCandidates(List<CommerceRuntimeAddress> addressCandidates) {
    
    this.addressCandidates = addressCandidates;
    return this;
  }

  public AddressValidationResponse addAddressCandidatesItem(CommerceRuntimeAddress addressCandidatesItem) {
    if (this.addressCandidates == null) {
      this.addressCandidates = new ArrayList<>();
    }
    this.addressCandidates.add(addressCandidatesItem);
    return this;
  }

   /**
   * Address Candidates
   * @return addressCandidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address Candidates")

  public List<CommerceRuntimeAddress> getAddressCandidates() {
    return addressCandidates;
  }


  public void setAddressCandidates(List<CommerceRuntimeAddress> addressCandidates) {
    this.addressCandidates = addressCandidates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressValidationResponse addressValidationResponse = (AddressValidationResponse) o;
    return Objects.equals(this.addressCandidates, addressValidationResponse.addressCandidates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCandidates);
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
    sb.append("class AddressValidationResponse {\n");
    sb.append("    addressCandidates: ").append(toIndentedString(addressCandidates)).append("\n");
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
    openapiFields.add("addressCandidates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressValidationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddressValidationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressValidationResponse is not found in the empty JSON string", AddressValidationResponse.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!AddressValidationResponse.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressValidationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if (jsonObj.get("addressCandidates") != null && !jsonObj.get("addressCandidates").isJsonNull()) {
        JsonArray jsonArrayaddressCandidates = jsonObj.getAsJsonArray("addressCandidates");
        if (jsonArrayaddressCandidates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addressCandidates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addressCandidates` to be an array in the JSON string but got `%s`", jsonObj.get("addressCandidates").toString()));
          }

          // validate the optional field `addressCandidates` (array)
          for (int i = 0; i < jsonArrayaddressCandidates.size(); i++) {
            CommerceRuntimeAddress.validateJsonObject(jsonArrayaddressCandidates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressValidationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressValidationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressValidationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressValidationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressValidationResponse>() {
           @Override
           public void write(JsonWriter out, AddressValidationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressValidationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressValidationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressValidationResponse
  * @throws IOException if the JSON string is invalid with respect to AddressValidationResponse
  */
  public static AddressValidationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressValidationResponse.class);
  }

 /**
  * Convert an instance of AddressValidationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

