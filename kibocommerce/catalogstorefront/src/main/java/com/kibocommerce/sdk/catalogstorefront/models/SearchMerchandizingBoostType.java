/*
 * Kibo Catalog Runtime Services
 * OpenAPI Spec for Kibo Catalog Runtime Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogstorefront.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets SearchMerchandizingBoostType
 */
@JsonAdapter(SearchMerchandizingBoostType.Adapter.class)
public enum SearchMerchandizingBoostType {
  
  NUMBER_1(1);

  private Integer value;

  SearchMerchandizingBoostType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SearchMerchandizingBoostType fromValue(Integer value) {
    for (SearchMerchandizingBoostType b : SearchMerchandizingBoostType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SearchMerchandizingBoostType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SearchMerchandizingBoostType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SearchMerchandizingBoostType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return SearchMerchandizingBoostType.fromValue(value);
    }
  }
}
