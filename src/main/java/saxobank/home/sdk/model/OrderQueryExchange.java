/*
 * Saxobank trading API
 * Saxobank trading API
 *
 * OpenAPI spec version: 0.1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package saxobank.home.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OrderQueryExchange
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class OrderQueryExchange {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("ExchangeId")
  private String exchangeId = null;

  @SerializedName("IsOpen")
  private Boolean isOpen = null;

  @SerializedName("TimeZoneId")
  private String timeZoneId = null;

  public OrderQueryExchange description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderQueryExchange exchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

   /**
   * Get exchangeId
   * @return exchangeId
  **/
  @Schema(description = "")
  public String getExchangeId() {
    return exchangeId;
  }

  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  public OrderQueryExchange isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Get isOpen
   * @return isOpen
  **/
  @Schema(description = "")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  public OrderQueryExchange timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }

   /**
   * Get timeZoneId
   * @return timeZoneId
  **/
  @Schema(description = "")
  public String getTimeZoneId() {
    return timeZoneId;
  }

  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderQueryExchange orderQueryExchange = (OrderQueryExchange) o;
    return Objects.equals(this.description, orderQueryExchange.description) &&
        Objects.equals(this.exchangeId, orderQueryExchange.exchangeId) &&
        Objects.equals(this.isOpen, orderQueryExchange.isOpen) &&
        Objects.equals(this.timeZoneId, orderQueryExchange.timeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, exchangeId, isOpen, timeZoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderQueryExchange {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}