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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * InstrumentsDetailsOrderDistances
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-24T20:27:51.004902788Z[GMT]")

public class InstrumentsDetailsOrderDistances {
  @SerializedName("EntryDefaultDistance")
  private BigDecimal entryDefaultDistance = null;

  @SerializedName("EntryDefaultDistanceType")
  private String entryDefaultDistanceType = null;

  @SerializedName("LimitDefaultDistance")
  private BigDecimal limitDefaultDistance = null;

  @SerializedName("LimitDefaultDistanceType")
  private String limitDefaultDistanceType = null;

  @SerializedName("StopLimitDefaultDistance")
  private BigDecimal stopLimitDefaultDistance = null;

  @SerializedName("StopLimitDefaultDistanceType")
  private String stopLimitDefaultDistanceType = null;

  @SerializedName("StopLossDefaultDistance")
  private BigDecimal stopLossDefaultDistance = null;

  @SerializedName("StopLossDefaultDistanceType")
  private String stopLossDefaultDistanceType = null;

  @SerializedName("StopLossDefaultEnabled")
  private Boolean stopLossDefaultEnabled = null;

  @SerializedName("StopLossDefaultOrderType")
  private String stopLossDefaultOrderType = null;

  @SerializedName("TakeProfitDefaultDistance")
  private BigDecimal takeProfitDefaultDistance = null;

  @SerializedName("TakeProfitDefaultDistanceType")
  private String takeProfitDefaultDistanceType = null;

  @SerializedName("TakeProfitDefaultEnabled")
  private Boolean takeProfitDefaultEnabled = null;

  public InstrumentsDetailsOrderDistances entryDefaultDistance(BigDecimal entryDefaultDistance) {
    this.entryDefaultDistance = entryDefaultDistance;
    return this;
  }

   /**
   * Get entryDefaultDistance
   * @return entryDefaultDistance
  **/
  @Schema(description = "")
  public BigDecimal getEntryDefaultDistance() {
    return entryDefaultDistance;
  }

  public void setEntryDefaultDistance(BigDecimal entryDefaultDistance) {
    this.entryDefaultDistance = entryDefaultDistance;
  }

  public InstrumentsDetailsOrderDistances entryDefaultDistanceType(String entryDefaultDistanceType) {
    this.entryDefaultDistanceType = entryDefaultDistanceType;
    return this;
  }

   /**
   * Get entryDefaultDistanceType
   * @return entryDefaultDistanceType
  **/
  @Schema(description = "")
  public String getEntryDefaultDistanceType() {
    return entryDefaultDistanceType;
  }

  public void setEntryDefaultDistanceType(String entryDefaultDistanceType) {
    this.entryDefaultDistanceType = entryDefaultDistanceType;
  }

  public InstrumentsDetailsOrderDistances limitDefaultDistance(BigDecimal limitDefaultDistance) {
    this.limitDefaultDistance = limitDefaultDistance;
    return this;
  }

   /**
   * Get limitDefaultDistance
   * @return limitDefaultDistance
  **/
  @Schema(description = "")
  public BigDecimal getLimitDefaultDistance() {
    return limitDefaultDistance;
  }

  public void setLimitDefaultDistance(BigDecimal limitDefaultDistance) {
    this.limitDefaultDistance = limitDefaultDistance;
  }

  public InstrumentsDetailsOrderDistances limitDefaultDistanceType(String limitDefaultDistanceType) {
    this.limitDefaultDistanceType = limitDefaultDistanceType;
    return this;
  }

   /**
   * Get limitDefaultDistanceType
   * @return limitDefaultDistanceType
  **/
  @Schema(description = "")
  public String getLimitDefaultDistanceType() {
    return limitDefaultDistanceType;
  }

  public void setLimitDefaultDistanceType(String limitDefaultDistanceType) {
    this.limitDefaultDistanceType = limitDefaultDistanceType;
  }

  public InstrumentsDetailsOrderDistances stopLimitDefaultDistance(BigDecimal stopLimitDefaultDistance) {
    this.stopLimitDefaultDistance = stopLimitDefaultDistance;
    return this;
  }

   /**
   * Get stopLimitDefaultDistance
   * @return stopLimitDefaultDistance
  **/
  @Schema(description = "")
  public BigDecimal getStopLimitDefaultDistance() {
    return stopLimitDefaultDistance;
  }

  public void setStopLimitDefaultDistance(BigDecimal stopLimitDefaultDistance) {
    this.stopLimitDefaultDistance = stopLimitDefaultDistance;
  }

  public InstrumentsDetailsOrderDistances stopLimitDefaultDistanceType(String stopLimitDefaultDistanceType) {
    this.stopLimitDefaultDistanceType = stopLimitDefaultDistanceType;
    return this;
  }

   /**
   * Get stopLimitDefaultDistanceType
   * @return stopLimitDefaultDistanceType
  **/
  @Schema(description = "")
  public String getStopLimitDefaultDistanceType() {
    return stopLimitDefaultDistanceType;
  }

  public void setStopLimitDefaultDistanceType(String stopLimitDefaultDistanceType) {
    this.stopLimitDefaultDistanceType = stopLimitDefaultDistanceType;
  }

  public InstrumentsDetailsOrderDistances stopLossDefaultDistance(BigDecimal stopLossDefaultDistance) {
    this.stopLossDefaultDistance = stopLossDefaultDistance;
    return this;
  }

   /**
   * Get stopLossDefaultDistance
   * @return stopLossDefaultDistance
  **/
  @Schema(description = "")
  public BigDecimal getStopLossDefaultDistance() {
    return stopLossDefaultDistance;
  }

  public void setStopLossDefaultDistance(BigDecimal stopLossDefaultDistance) {
    this.stopLossDefaultDistance = stopLossDefaultDistance;
  }

  public InstrumentsDetailsOrderDistances stopLossDefaultDistanceType(String stopLossDefaultDistanceType) {
    this.stopLossDefaultDistanceType = stopLossDefaultDistanceType;
    return this;
  }

   /**
   * Get stopLossDefaultDistanceType
   * @return stopLossDefaultDistanceType
  **/
  @Schema(description = "")
  public String getStopLossDefaultDistanceType() {
    return stopLossDefaultDistanceType;
  }

  public void setStopLossDefaultDistanceType(String stopLossDefaultDistanceType) {
    this.stopLossDefaultDistanceType = stopLossDefaultDistanceType;
  }

  public InstrumentsDetailsOrderDistances stopLossDefaultEnabled(Boolean stopLossDefaultEnabled) {
    this.stopLossDefaultEnabled = stopLossDefaultEnabled;
    return this;
  }

   /**
   * Get stopLossDefaultEnabled
   * @return stopLossDefaultEnabled
  **/
  @Schema(description = "")
  public Boolean isStopLossDefaultEnabled() {
    return stopLossDefaultEnabled;
  }

  public void setStopLossDefaultEnabled(Boolean stopLossDefaultEnabled) {
    this.stopLossDefaultEnabled = stopLossDefaultEnabled;
  }

  public InstrumentsDetailsOrderDistances stopLossDefaultOrderType(String stopLossDefaultOrderType) {
    this.stopLossDefaultOrderType = stopLossDefaultOrderType;
    return this;
  }

   /**
   * Get stopLossDefaultOrderType
   * @return stopLossDefaultOrderType
  **/
  @Schema(description = "")
  public String getStopLossDefaultOrderType() {
    return stopLossDefaultOrderType;
  }

  public void setStopLossDefaultOrderType(String stopLossDefaultOrderType) {
    this.stopLossDefaultOrderType = stopLossDefaultOrderType;
  }

  public InstrumentsDetailsOrderDistances takeProfitDefaultDistance(BigDecimal takeProfitDefaultDistance) {
    this.takeProfitDefaultDistance = takeProfitDefaultDistance;
    return this;
  }

   /**
   * Get takeProfitDefaultDistance
   * @return takeProfitDefaultDistance
  **/
  @Schema(description = "")
  public BigDecimal getTakeProfitDefaultDistance() {
    return takeProfitDefaultDistance;
  }

  public void setTakeProfitDefaultDistance(BigDecimal takeProfitDefaultDistance) {
    this.takeProfitDefaultDistance = takeProfitDefaultDistance;
  }

  public InstrumentsDetailsOrderDistances takeProfitDefaultDistanceType(String takeProfitDefaultDistanceType) {
    this.takeProfitDefaultDistanceType = takeProfitDefaultDistanceType;
    return this;
  }

   /**
   * Get takeProfitDefaultDistanceType
   * @return takeProfitDefaultDistanceType
  **/
  @Schema(description = "")
  public String getTakeProfitDefaultDistanceType() {
    return takeProfitDefaultDistanceType;
  }

  public void setTakeProfitDefaultDistanceType(String takeProfitDefaultDistanceType) {
    this.takeProfitDefaultDistanceType = takeProfitDefaultDistanceType;
  }

  public InstrumentsDetailsOrderDistances takeProfitDefaultEnabled(Boolean takeProfitDefaultEnabled) {
    this.takeProfitDefaultEnabled = takeProfitDefaultEnabled;
    return this;
  }

   /**
   * Get takeProfitDefaultEnabled
   * @return takeProfitDefaultEnabled
  **/
  @Schema(description = "")
  public Boolean isTakeProfitDefaultEnabled() {
    return takeProfitDefaultEnabled;
  }

  public void setTakeProfitDefaultEnabled(Boolean takeProfitDefaultEnabled) {
    this.takeProfitDefaultEnabled = takeProfitDefaultEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentsDetailsOrderDistances instrumentsDetailsOrderDistances = (InstrumentsDetailsOrderDistances) o;
    return Objects.equals(this.entryDefaultDistance, instrumentsDetailsOrderDistances.entryDefaultDistance) &&
        Objects.equals(this.entryDefaultDistanceType, instrumentsDetailsOrderDistances.entryDefaultDistanceType) &&
        Objects.equals(this.limitDefaultDistance, instrumentsDetailsOrderDistances.limitDefaultDistance) &&
        Objects.equals(this.limitDefaultDistanceType, instrumentsDetailsOrderDistances.limitDefaultDistanceType) &&
        Objects.equals(this.stopLimitDefaultDistance, instrumentsDetailsOrderDistances.stopLimitDefaultDistance) &&
        Objects.equals(this.stopLimitDefaultDistanceType, instrumentsDetailsOrderDistances.stopLimitDefaultDistanceType) &&
        Objects.equals(this.stopLossDefaultDistance, instrumentsDetailsOrderDistances.stopLossDefaultDistance) &&
        Objects.equals(this.stopLossDefaultDistanceType, instrumentsDetailsOrderDistances.stopLossDefaultDistanceType) &&
        Objects.equals(this.stopLossDefaultEnabled, instrumentsDetailsOrderDistances.stopLossDefaultEnabled) &&
        Objects.equals(this.stopLossDefaultOrderType, instrumentsDetailsOrderDistances.stopLossDefaultOrderType) &&
        Objects.equals(this.takeProfitDefaultDistance, instrumentsDetailsOrderDistances.takeProfitDefaultDistance) &&
        Objects.equals(this.takeProfitDefaultDistanceType, instrumentsDetailsOrderDistances.takeProfitDefaultDistanceType) &&
        Objects.equals(this.takeProfitDefaultEnabled, instrumentsDetailsOrderDistances.takeProfitDefaultEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryDefaultDistance, entryDefaultDistanceType, limitDefaultDistance, limitDefaultDistanceType, stopLimitDefaultDistance, stopLimitDefaultDistanceType, stopLossDefaultDistance, stopLossDefaultDistanceType, stopLossDefaultEnabled, stopLossDefaultOrderType, takeProfitDefaultDistance, takeProfitDefaultDistanceType, takeProfitDefaultEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentsDetailsOrderDistances {\n");
    
    sb.append("    entryDefaultDistance: ").append(toIndentedString(entryDefaultDistance)).append("\n");
    sb.append("    entryDefaultDistanceType: ").append(toIndentedString(entryDefaultDistanceType)).append("\n");
    sb.append("    limitDefaultDistance: ").append(toIndentedString(limitDefaultDistance)).append("\n");
    sb.append("    limitDefaultDistanceType: ").append(toIndentedString(limitDefaultDistanceType)).append("\n");
    sb.append("    stopLimitDefaultDistance: ").append(toIndentedString(stopLimitDefaultDistance)).append("\n");
    sb.append("    stopLimitDefaultDistanceType: ").append(toIndentedString(stopLimitDefaultDistanceType)).append("\n");
    sb.append("    stopLossDefaultDistance: ").append(toIndentedString(stopLossDefaultDistance)).append("\n");
    sb.append("    stopLossDefaultDistanceType: ").append(toIndentedString(stopLossDefaultDistanceType)).append("\n");
    sb.append("    stopLossDefaultEnabled: ").append(toIndentedString(stopLossDefaultEnabled)).append("\n");
    sb.append("    stopLossDefaultOrderType: ").append(toIndentedString(stopLossDefaultOrderType)).append("\n");
    sb.append("    takeProfitDefaultDistance: ").append(toIndentedString(takeProfitDefaultDistance)).append("\n");
    sb.append("    takeProfitDefaultDistanceType: ").append(toIndentedString(takeProfitDefaultDistanceType)).append("\n");
    sb.append("    takeProfitDefaultEnabled: ").append(toIndentedString(takeProfitDefaultEnabled)).append("\n");
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
