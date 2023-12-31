/*
 * Kibo CommerceRuntime Service
 * OpenAPI Spec for Kibo CommerceRuntime Service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.commerce.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kibocommerce.sdk.commerce.models.BillingInfo;
import com.kibocommerce.sdk.commerce.models.PaymentGatewayInteraction;
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
 * PaymentAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentAction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_RETURN_URL = "returnUrl";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private String returnUrl;

  public static final String SERIALIZED_NAME_CANCEL_URL = "cancelUrl";
  @SerializedName(SERIALIZED_NAME_CANCEL_URL)
  private String cancelUrl;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_INTERACTION_DATE = "interactionDate";
  @SerializedName(SERIALIZED_NAME_INTERACTION_DATE)
  private OffsetDateTime interactionDate;

  public static final String SERIALIZED_NAME_NEW_BILLING_INFO = "newBillingInfo";
  @SerializedName(SERIALIZED_NAME_NEW_BILLING_INFO)
  private BillingInfo newBillingInfo;

  public static final String SERIALIZED_NAME_REFERENCE_SOURCE_PAYMENT_ID = "referenceSourcePaymentId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_SOURCE_PAYMENT_ID)
  private String referenceSourcePaymentId;

  public static final String SERIALIZED_NAME_MANUAL_GATEWAY_INTERACTION = "manualGatewayInteraction";
  @SerializedName(SERIALIZED_NAME_MANUAL_GATEWAY_INTERACTION)
  private PaymentGatewayInteraction manualGatewayInteraction;

  public static final String SERIALIZED_NAME_EXTERNAL_TRANSACTION_ID = "externalTransactionId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TRANSACTION_ID)
  private String externalTransactionId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_RECAPTCHA = "recaptcha";
  @SerializedName(SERIALIZED_NAME_RECAPTCHA)
  private String recaptcha;

  public PaymentAction() {
  }

  public PaymentAction actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Name of the Action to post
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Action to post")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public PaymentAction currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * ISO currency code for the transaction. Currently, only USD is supported.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO currency code for the transaction. Currently, only USD is supported.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PaymentAction checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * If paying by check, the check number.
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If paying by check, the check number.")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public PaymentAction returnUrl(String returnUrl) {
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * If paying by Paypal Express or some other potential non-gateway payment provider, a return redirect URL must be provided.
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If paying by Paypal Express or some other potential non-gateway payment provider, a return redirect URL must be provided.")

  public String getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  public PaymentAction cancelUrl(String cancelUrl) {
    
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * If paying by Paypal Express or some other potential non-gateway payment provider, a cancel redirect URL must be provided.  This will be used if something goes wrong on the third-party side.
   * @return cancelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If paying by Paypal Express or some other potential non-gateway payment provider, a cancel redirect URL must be provided.  This will be used if something goes wrong on the third-party side.")

  public String getCancelUrl() {
    return cancelUrl;
  }


  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }


  public PaymentAction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of funds to withdraw to pay for this order.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of funds to withdraw to pay for this order.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public PaymentAction interactionDate(OffsetDateTime interactionDate) {
    
    this.interactionDate = interactionDate;
    return this;
  }

   /**
   * Date the interaction occurred
   * @return interactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the interaction occurred")

  public OffsetDateTime getInteractionDate() {
    return interactionDate;
  }


  public void setInteractionDate(OffsetDateTime interactionDate) {
    this.interactionDate = interactionDate;
  }


  public PaymentAction newBillingInfo(BillingInfo newBillingInfo) {
    
    this.newBillingInfo = newBillingInfo;
    return this;
  }

   /**
   * Get newBillingInfo
   * @return newBillingInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BillingInfo getNewBillingInfo() {
    return newBillingInfo;
  }


  public void setNewBillingInfo(BillingInfo newBillingInfo) {
    this.newBillingInfo = newBillingInfo;
  }


  public PaymentAction referenceSourcePaymentId(String referenceSourcePaymentId) {
    
    this.referenceSourcePaymentId = referenceSourcePaymentId;
    return this;
  }

   /**
   * Reference payment id from which to copy the billing info.
   * @return referenceSourcePaymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference payment id from which to copy the billing info.")

  public String getReferenceSourcePaymentId() {
    return referenceSourcePaymentId;
  }


  public void setReferenceSourcePaymentId(String referenceSourcePaymentId) {
    this.referenceSourcePaymentId = referenceSourcePaymentId;
  }


  public PaymentAction manualGatewayInteraction(PaymentGatewayInteraction manualGatewayInteraction) {
    
    this.manualGatewayInteraction = manualGatewayInteraction;
    return this;
  }

   /**
   * Get manualGatewayInteraction
   * @return manualGatewayInteraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentGatewayInteraction getManualGatewayInteraction() {
    return manualGatewayInteraction;
  }


  public void setManualGatewayInteraction(PaymentGatewayInteraction manualGatewayInteraction) {
    this.manualGatewayInteraction = manualGatewayInteraction;
  }


  public PaymentAction externalTransactionId(String externalTransactionId) {
    
    this.externalTransactionId = externalTransactionId;
    return this;
  }

   /**
   * Get externalTransactionId
   * @return externalTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalTransactionId() {
    return externalTransactionId;
  }


  public void setExternalTransactionId(String externalTransactionId) {
    this.externalTransactionId = externalTransactionId;
  }


  public PaymentAction data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Custom data from payment providers
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom data from payment providers")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public PaymentAction recaptcha(String recaptcha) {
    
    this.recaptcha = recaptcha;
    return this;
  }

   /**
   * Recaptcha for validation.
   * @return recaptcha
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recaptcha for validation.")

  public String getRecaptcha() {
    return recaptcha;
  }


  public void setRecaptcha(String recaptcha) {
    this.recaptcha = recaptcha;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAction paymentAction = (PaymentAction) o;
    return Objects.equals(this.actionName, paymentAction.actionName) &&
        Objects.equals(this.currencyCode, paymentAction.currencyCode) &&
        Objects.equals(this.checkNumber, paymentAction.checkNumber) &&
        Objects.equals(this.returnUrl, paymentAction.returnUrl) &&
        Objects.equals(this.cancelUrl, paymentAction.cancelUrl) &&
        Objects.equals(this.amount, paymentAction.amount) &&
        Objects.equals(this.interactionDate, paymentAction.interactionDate) &&
        Objects.equals(this.newBillingInfo, paymentAction.newBillingInfo) &&
        Objects.equals(this.referenceSourcePaymentId, paymentAction.referenceSourcePaymentId) &&
        Objects.equals(this.manualGatewayInteraction, paymentAction.manualGatewayInteraction) &&
        Objects.equals(this.externalTransactionId, paymentAction.externalTransactionId) &&
        Objects.equals(this.data, paymentAction.data) &&
        Objects.equals(this.recaptcha, paymentAction.recaptcha);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, currencyCode, checkNumber, returnUrl, cancelUrl, amount, interactionDate, newBillingInfo, referenceSourcePaymentId, manualGatewayInteraction, externalTransactionId, data, recaptcha);
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
    sb.append("class PaymentAction {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    interactionDate: ").append(toIndentedString(interactionDate)).append("\n");
    sb.append("    newBillingInfo: ").append(toIndentedString(newBillingInfo)).append("\n");
    sb.append("    referenceSourcePaymentId: ").append(toIndentedString(referenceSourcePaymentId)).append("\n");
    sb.append("    manualGatewayInteraction: ").append(toIndentedString(manualGatewayInteraction)).append("\n");
    sb.append("    externalTransactionId: ").append(toIndentedString(externalTransactionId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    recaptcha: ").append(toIndentedString(recaptcha)).append("\n");
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
    openapiFields.add("actionName");
    openapiFields.add("currencyCode");
    openapiFields.add("checkNumber");
    openapiFields.add("returnUrl");
    openapiFields.add("cancelUrl");
    openapiFields.add("amount");
    openapiFields.add("interactionDate");
    openapiFields.add("newBillingInfo");
    openapiFields.add("referenceSourcePaymentId");
    openapiFields.add("manualGatewayInteraction");
    openapiFields.add("externalTransactionId");
    openapiFields.add("data");
    openapiFields.add("recaptcha");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentAction is not found in the empty JSON string", PaymentAction.openapiRequiredFields.toString()));
        }
      }

      // Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      // for (Entry<String, JsonElement> entry : entries) {
      //  if (!PaymentAction.openapiFields.contains(entry.getKey())) {
      //    throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
      //    }
      //  }
      
      if ((jsonObj.get("actionName") != null && !jsonObj.get("actionName").isJsonNull()) && !jsonObj.get("actionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionName").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("checkNumber") != null && !jsonObj.get("checkNumber").isJsonNull()) && !jsonObj.get("checkNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkNumber").toString()));
      }
      if ((jsonObj.get("returnUrl") != null && !jsonObj.get("returnUrl").isJsonNull()) && !jsonObj.get("returnUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnUrl").toString()));
      }
      if ((jsonObj.get("cancelUrl") != null && !jsonObj.get("cancelUrl").isJsonNull()) && !jsonObj.get("cancelUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancelUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancelUrl").toString()));
      }
      // validate the optional field `newBillingInfo`
      if (jsonObj.get("newBillingInfo") != null && !jsonObj.get("newBillingInfo").isJsonNull()) {
        BillingInfo.validateJsonObject(jsonObj.getAsJsonObject("newBillingInfo"));
      }
      if ((jsonObj.get("referenceSourcePaymentId") != null && !jsonObj.get("referenceSourcePaymentId").isJsonNull()) && !jsonObj.get("referenceSourcePaymentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceSourcePaymentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceSourcePaymentId").toString()));
      }
      // validate the optional field `manualGatewayInteraction`
      if (jsonObj.get("manualGatewayInteraction") != null && !jsonObj.get("manualGatewayInteraction").isJsonNull()) {
        PaymentGatewayInteraction.validateJsonObject(jsonObj.getAsJsonObject("manualGatewayInteraction"));
      }
      if ((jsonObj.get("externalTransactionId") != null && !jsonObj.get("externalTransactionId").isJsonNull()) && !jsonObj.get("externalTransactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalTransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalTransactionId").toString()));
      }
      if ((jsonObj.get("recaptcha") != null && !jsonObj.get("recaptcha").isJsonNull()) && !jsonObj.get("recaptcha").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recaptcha` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recaptcha").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentAction.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentAction>() {
           @Override
           public void write(JsonWriter out, PaymentAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentAction
  * @throws IOException if the JSON string is invalid with respect to PaymentAction
  */
  public static PaymentAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentAction.class);
  }

 /**
  * Convert an instance of PaymentAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

