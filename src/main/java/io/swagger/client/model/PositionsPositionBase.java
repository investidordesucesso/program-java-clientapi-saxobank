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
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
/**
 * PositionsPositionBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-27T21:00:40.494761882Z[GMT]")

public class PositionsPositionBase {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("CanBeClosed")
  private Boolean canBeClosed = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("CloseConversionRateSettled")
  private Boolean closeConversionRateSettled = null;

  @SerializedName("ExecutionTimeOpen")
  private OffsetDateTime executionTimeOpen = null;

  @SerializedName("IsForceOpen")
  private Boolean isForceOpen = null;

  @SerializedName("IsMarketOpen")
  private Boolean isMarketOpen = null;

  @SerializedName("LockedByBackOffice")
  private Boolean lockedByBackOffice = null;

  @SerializedName("OpenPrice")
  private BigDecimal openPrice = null;

  @SerializedName("SpotDate")
  private LocalDate spotDate = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Uic")
  private Long uic = null;

  @SerializedName("ValueDate")
  private OffsetDateTime valueDate = null;

  public PositionsPositionBase accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public PositionsPositionBase amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(description = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PositionsPositionBase assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @Schema(description = "")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public PositionsPositionBase canBeClosed(Boolean canBeClosed) {
    this.canBeClosed = canBeClosed;
    return this;
  }

   /**
   * Get canBeClosed
   * @return canBeClosed
  **/
  @Schema(description = "")
  public Boolean isCanBeClosed() {
    return canBeClosed;
  }

  public void setCanBeClosed(Boolean canBeClosed) {
    this.canBeClosed = canBeClosed;
  }

  public PositionsPositionBase clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public PositionsPositionBase closeConversionRateSettled(Boolean closeConversionRateSettled) {
    this.closeConversionRateSettled = closeConversionRateSettled;
    return this;
  }

   /**
   * Get closeConversionRateSettled
   * @return closeConversionRateSettled
  **/
  @Schema(description = "")
  public Boolean isCloseConversionRateSettled() {
    return closeConversionRateSettled;
  }

  public void setCloseConversionRateSettled(Boolean closeConversionRateSettled) {
    this.closeConversionRateSettled = closeConversionRateSettled;
  }

  public PositionsPositionBase executionTimeOpen(OffsetDateTime executionTimeOpen) {
    this.executionTimeOpen = executionTimeOpen;
    return this;
  }

   /**
   * Get executionTimeOpen
   * @return executionTimeOpen
  **/
  @Schema(description = "")
  public OffsetDateTime getExecutionTimeOpen() {
    return executionTimeOpen;
  }

  public void setExecutionTimeOpen(OffsetDateTime executionTimeOpen) {
    this.executionTimeOpen = executionTimeOpen;
  }

  public PositionsPositionBase isForceOpen(Boolean isForceOpen) {
    this.isForceOpen = isForceOpen;
    return this;
  }

   /**
   * Get isForceOpen
   * @return isForceOpen
  **/
  @Schema(description = "")
  public Boolean isIsForceOpen() {
    return isForceOpen;
  }

  public void setIsForceOpen(Boolean isForceOpen) {
    this.isForceOpen = isForceOpen;
  }

  public PositionsPositionBase isMarketOpen(Boolean isMarketOpen) {
    this.isMarketOpen = isMarketOpen;
    return this;
  }

   /**
   * Get isMarketOpen
   * @return isMarketOpen
  **/
  @Schema(description = "")
  public Boolean isIsMarketOpen() {
    return isMarketOpen;
  }

  public void setIsMarketOpen(Boolean isMarketOpen) {
    this.isMarketOpen = isMarketOpen;
  }

  public PositionsPositionBase lockedByBackOffice(Boolean lockedByBackOffice) {
    this.lockedByBackOffice = lockedByBackOffice;
    return this;
  }

   /**
   * Get lockedByBackOffice
   * @return lockedByBackOffice
  **/
  @Schema(description = "")
  public Boolean isLockedByBackOffice() {
    return lockedByBackOffice;
  }

  public void setLockedByBackOffice(Boolean lockedByBackOffice) {
    this.lockedByBackOffice = lockedByBackOffice;
  }

  public PositionsPositionBase openPrice(BigDecimal openPrice) {
    this.openPrice = openPrice;
    return this;
  }

   /**
   * Get openPrice
   * @return openPrice
  **/
  @Schema(description = "")
  public BigDecimal getOpenPrice() {
    return openPrice;
  }

  public void setOpenPrice(BigDecimal openPrice) {
    this.openPrice = openPrice;
  }

  public PositionsPositionBase spotDate(LocalDate spotDate) {
    this.spotDate = spotDate;
    return this;
  }

   /**
   * Get spotDate
   * @return spotDate
  **/
  @Schema(description = "")
  public LocalDate getSpotDate() {
    return spotDate;
  }

  public void setSpotDate(LocalDate spotDate) {
    this.spotDate = spotDate;
  }

  public PositionsPositionBase status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PositionsPositionBase uic(Long uic) {
    this.uic = uic;
    return this;
  }

   /**
   * Get uic
   * @return uic
  **/
  @Schema(description = "")
  public Long getUic() {
    return uic;
  }

  public void setUic(Long uic) {
    this.uic = uic;
  }

  public PositionsPositionBase valueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Get valueDate
   * @return valueDate
  **/
  @Schema(description = "")
  public OffsetDateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionsPositionBase positionsPositionBase = (PositionsPositionBase) o;
    return Objects.equals(this.accountId, positionsPositionBase.accountId) &&
        Objects.equals(this.amount, positionsPositionBase.amount) &&
        Objects.equals(this.assetType, positionsPositionBase.assetType) &&
        Objects.equals(this.canBeClosed, positionsPositionBase.canBeClosed) &&
        Objects.equals(this.clientId, positionsPositionBase.clientId) &&
        Objects.equals(this.closeConversionRateSettled, positionsPositionBase.closeConversionRateSettled) &&
        Objects.equals(this.executionTimeOpen, positionsPositionBase.executionTimeOpen) &&
        Objects.equals(this.isForceOpen, positionsPositionBase.isForceOpen) &&
        Objects.equals(this.isMarketOpen, positionsPositionBase.isMarketOpen) &&
        Objects.equals(this.lockedByBackOffice, positionsPositionBase.lockedByBackOffice) &&
        Objects.equals(this.openPrice, positionsPositionBase.openPrice) &&
        Objects.equals(this.spotDate, positionsPositionBase.spotDate) &&
        Objects.equals(this.status, positionsPositionBase.status) &&
        Objects.equals(this.uic, positionsPositionBase.uic) &&
        Objects.equals(this.valueDate, positionsPositionBase.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, assetType, canBeClosed, clientId, closeConversionRateSettled, executionTimeOpen, isForceOpen, isMarketOpen, lockedByBackOffice, openPrice, spotDate, status, uic, valueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsPositionBase {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    canBeClosed: ").append(toIndentedString(canBeClosed)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    closeConversionRateSettled: ").append(toIndentedString(closeConversionRateSettled)).append("\n");
    sb.append("    executionTimeOpen: ").append(toIndentedString(executionTimeOpen)).append("\n");
    sb.append("    isForceOpen: ").append(toIndentedString(isForceOpen)).append("\n");
    sb.append("    isMarketOpen: ").append(toIndentedString(isMarketOpen)).append("\n");
    sb.append("    lockedByBackOffice: ").append(toIndentedString(lockedByBackOffice)).append("\n");
    sb.append("    openPrice: ").append(toIndentedString(openPrice)).append("\n");
    sb.append("    spotDate: ").append(toIndentedString(spotDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uic: ").append(toIndentedString(uic)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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
