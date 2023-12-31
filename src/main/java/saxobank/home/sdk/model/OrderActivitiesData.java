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
import saxobank.home.sdk.model.Openapitradev2ordersOrderDuration;
import saxobank.home.sdk.model.OrderActivitiesDisplayAndFormat;
import saxobank.home.sdk.model.OrderActivitiesSleepingOrderCondition;

import java.io.IOException;
import java.math.BigDecimal;
/**
 * OrderActivitiesData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class OrderActivitiesData {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("ActivityTime")
  private String activityTime = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("AveragePrice")
  private BigDecimal averagePrice = null;

  @SerializedName("BuySell")
  private String buySell = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("CorrelationKey")
  private String correlationKey = null;

  @SerializedName("DisplayAndFormat")
  private OrderActivitiesDisplayAndFormat displayAndFormat = null;

  @SerializedName("Duration")
  private Openapitradev2ordersOrderDuration duration = null;

  @SerializedName("ExecutionPrice")
  private BigDecimal executionPrice = null;

  @SerializedName("ExternalReference")
  private String externalReference = null;

  @SerializedName("FillAmount")
  private BigDecimal fillAmount = null;

  @SerializedName("FilledAmount")
  private BigDecimal filledAmount = null;

  @SerializedName("HandledBy")
  private String handledBy = null;

  @SerializedName("LogId")
  private String logId = null;

  @SerializedName("OrderId")
  private String orderId = null;

  @SerializedName("OrderRelation")
  private String orderRelation = null;

  @SerializedName("OrderType")
  private String orderType = null;

  @SerializedName("PositionId")
  private String positionId = null;

  @SerializedName("SleepingOrderCondition")
  private OrderActivitiesSleepingOrderCondition sleepingOrderCondition = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("SubStatus")
  private String subStatus = null;

  @SerializedName("Uic")
  private Long uic = null;

  @SerializedName("UserId")
  private String userId = null;

  public OrderActivitiesData accountId(String accountId) {
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

  public OrderActivitiesData activityTime(String activityTime) {
    this.activityTime = activityTime;
    return this;
  }

   /**
   * Get activityTime
   * @return activityTime
  **/
  @Schema(description = "")
  public String getActivityTime() {
    return activityTime;
  }

  public void setActivityTime(String activityTime) {
    this.activityTime = activityTime;
  }

  public OrderActivitiesData amount(BigDecimal amount) {
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

  public OrderActivitiesData assetType(String assetType) {
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

  public OrderActivitiesData averagePrice(BigDecimal averagePrice) {
    this.averagePrice = averagePrice;
    return this;
  }

   /**
   * Get averagePrice
   * @return averagePrice
  **/
  @Schema(description = "")
  public BigDecimal getAveragePrice() {
    return averagePrice;
  }

  public void setAveragePrice(BigDecimal averagePrice) {
    this.averagePrice = averagePrice;
  }

  public OrderActivitiesData buySell(String buySell) {
    this.buySell = buySell;
    return this;
  }

   /**
   * Get buySell
   * @return buySell
  **/
  @Schema(description = "")
  public String getBuySell() {
    return buySell;
  }

  public void setBuySell(String buySell) {
    this.buySell = buySell;
  }

  public OrderActivitiesData clientId(String clientId) {
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

  public OrderActivitiesData correlationKey(String correlationKey) {
    this.correlationKey = correlationKey;
    return this;
  }

   /**
   * Get correlationKey
   * @return correlationKey
  **/
  @Schema(description = "")
  public String getCorrelationKey() {
    return correlationKey;
  }

  public void setCorrelationKey(String correlationKey) {
    this.correlationKey = correlationKey;
  }

  public OrderActivitiesData displayAndFormat(OrderActivitiesDisplayAndFormat displayAndFormat) {
    this.displayAndFormat = displayAndFormat;
    return this;
  }

   /**
   * Get displayAndFormat
   * @return displayAndFormat
  **/
  @Schema(description = "")
  public OrderActivitiesDisplayAndFormat getDisplayAndFormat() {
    return displayAndFormat;
  }

  public void setDisplayAndFormat(OrderActivitiesDisplayAndFormat displayAndFormat) {
    this.displayAndFormat = displayAndFormat;
  }

  public OrderActivitiesData duration(Openapitradev2ordersOrderDuration duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(description = "")
  public Openapitradev2ordersOrderDuration getDuration() {
    return duration;
  }

  public void setDuration(Openapitradev2ordersOrderDuration duration) {
    this.duration = duration;
  }

  public OrderActivitiesData executionPrice(BigDecimal executionPrice) {
    this.executionPrice = executionPrice;
    return this;
  }

   /**
   * Get executionPrice
   * @return executionPrice
  **/
  @Schema(description = "")
  public BigDecimal getExecutionPrice() {
    return executionPrice;
  }

  public void setExecutionPrice(BigDecimal executionPrice) {
    this.executionPrice = executionPrice;
  }

  public OrderActivitiesData externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

   /**
   * Get externalReference
   * @return externalReference
  **/
  @Schema(description = "")
  public String getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  public OrderActivitiesData fillAmount(BigDecimal fillAmount) {
    this.fillAmount = fillAmount;
    return this;
  }

   /**
   * Get fillAmount
   * @return fillAmount
  **/
  @Schema(description = "")
  public BigDecimal getFillAmount() {
    return fillAmount;
  }

  public void setFillAmount(BigDecimal fillAmount) {
    this.fillAmount = fillAmount;
  }

  public OrderActivitiesData filledAmount(BigDecimal filledAmount) {
    this.filledAmount = filledAmount;
    return this;
  }

   /**
   * Get filledAmount
   * @return filledAmount
  **/
  @Schema(description = "")
  public BigDecimal getFilledAmount() {
    return filledAmount;
  }

  public void setFilledAmount(BigDecimal filledAmount) {
    this.filledAmount = filledAmount;
  }

  public OrderActivitiesData handledBy(String handledBy) {
    this.handledBy = handledBy;
    return this;
  }

   /**
   * Get handledBy
   * @return handledBy
  **/
  @Schema(description = "")
  public String getHandledBy() {
    return handledBy;
  }

  public void setHandledBy(String handledBy) {
    this.handledBy = handledBy;
  }

  public OrderActivitiesData logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @Schema(description = "")
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public OrderActivitiesData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderActivitiesData orderRelation(String orderRelation) {
    this.orderRelation = orderRelation;
    return this;
  }

   /**
   * Get orderRelation
   * @return orderRelation
  **/
  @Schema(description = "")
  public String getOrderRelation() {
    return orderRelation;
  }

  public void setOrderRelation(String orderRelation) {
    this.orderRelation = orderRelation;
  }

  public OrderActivitiesData orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @Schema(description = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public OrderActivitiesData positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }

   /**
   * Get positionId
   * @return positionId
  **/
  @Schema(description = "")
  public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public OrderActivitiesData sleepingOrderCondition(OrderActivitiesSleepingOrderCondition sleepingOrderCondition) {
    this.sleepingOrderCondition = sleepingOrderCondition;
    return this;
  }

   /**
   * Get sleepingOrderCondition
   * @return sleepingOrderCondition
  **/
  @Schema(description = "")
  public OrderActivitiesSleepingOrderCondition getSleepingOrderCondition() {
    return sleepingOrderCondition;
  }

  public void setSleepingOrderCondition(OrderActivitiesSleepingOrderCondition sleepingOrderCondition) {
    this.sleepingOrderCondition = sleepingOrderCondition;
  }

  public OrderActivitiesData status(String status) {
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

  public OrderActivitiesData subStatus(String subStatus) {
    this.subStatus = subStatus;
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/
  @Schema(description = "")
  public String getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }

  public OrderActivitiesData uic(Long uic) {
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

  public OrderActivitiesData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderActivitiesData orderActivitiesData = (OrderActivitiesData) o;
    return Objects.equals(this.accountId, orderActivitiesData.accountId) &&
        Objects.equals(this.activityTime, orderActivitiesData.activityTime) &&
        Objects.equals(this.amount, orderActivitiesData.amount) &&
        Objects.equals(this.assetType, orderActivitiesData.assetType) &&
        Objects.equals(this.averagePrice, orderActivitiesData.averagePrice) &&
        Objects.equals(this.buySell, orderActivitiesData.buySell) &&
        Objects.equals(this.clientId, orderActivitiesData.clientId) &&
        Objects.equals(this.correlationKey, orderActivitiesData.correlationKey) &&
        Objects.equals(this.displayAndFormat, orderActivitiesData.displayAndFormat) &&
        Objects.equals(this.duration, orderActivitiesData.duration) &&
        Objects.equals(this.executionPrice, orderActivitiesData.executionPrice) &&
        Objects.equals(this.externalReference, orderActivitiesData.externalReference) &&
        Objects.equals(this.fillAmount, orderActivitiesData.fillAmount) &&
        Objects.equals(this.filledAmount, orderActivitiesData.filledAmount) &&
        Objects.equals(this.handledBy, orderActivitiesData.handledBy) &&
        Objects.equals(this.logId, orderActivitiesData.logId) &&
        Objects.equals(this.orderId, orderActivitiesData.orderId) &&
        Objects.equals(this.orderRelation, orderActivitiesData.orderRelation) &&
        Objects.equals(this.orderType, orderActivitiesData.orderType) &&
        Objects.equals(this.positionId, orderActivitiesData.positionId) &&
        Objects.equals(this.sleepingOrderCondition, orderActivitiesData.sleepingOrderCondition) &&
        Objects.equals(this.status, orderActivitiesData.status) &&
        Objects.equals(this.subStatus, orderActivitiesData.subStatus) &&
        Objects.equals(this.uic, orderActivitiesData.uic) &&
        Objects.equals(this.userId, orderActivitiesData.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, activityTime, amount, assetType, averagePrice, buySell, clientId, correlationKey, displayAndFormat, duration, executionPrice, externalReference, fillAmount, filledAmount, handledBy, logId, orderId, orderRelation, orderType, positionId, sleepingOrderCondition, status, subStatus, uic, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderActivitiesData {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    activityTime: ").append(toIndentedString(activityTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
    sb.append("    buySell: ").append(toIndentedString(buySell)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    correlationKey: ").append(toIndentedString(correlationKey)).append("\n");
    sb.append("    displayAndFormat: ").append(toIndentedString(displayAndFormat)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    executionPrice: ").append(toIndentedString(executionPrice)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    fillAmount: ").append(toIndentedString(fillAmount)).append("\n");
    sb.append("    filledAmount: ").append(toIndentedString(filledAmount)).append("\n");
    sb.append("    handledBy: ").append(toIndentedString(handledBy)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderRelation: ").append(toIndentedString(orderRelation)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    sleepingOrderCondition: ").append(toIndentedString(sleepingOrderCondition)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    uic: ").append(toIndentedString(uic)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
