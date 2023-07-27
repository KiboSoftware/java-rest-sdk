/*
 * Kibo Catalog Admin Services
 * OpenAPI Spec for Kibo Catalog Admin Services
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kibocommerce.sdk.catalogadministration.models;

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
 * Gets or Sets SearchType
 */
@JsonAdapter(SearchType.Adapter.class)
public enum SearchType {
  
  NUMBER_1(1),
  
  NUMBER_2(2);

  private Integer value;

  SearchType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SearchType fromValue(Integer value) {
    for (SearchType b : SearchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SearchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SearchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SearchType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return SearchType.fromValue(value);
    }
  }
}

