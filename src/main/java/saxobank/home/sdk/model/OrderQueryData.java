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
import saxobank.home.sdk.model.OrderQueryDisplayAndFormat;
import saxobank.home.sdk.model.OrderQueryExchange;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * OrderQueryData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class OrderQueryData {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AccountKey")
  private String accountKey = null;

  @SerializedName("AdviceNote")
  private String adviceNote = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("Ask")
  private BigDecimal ask = null;

  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("Bid")
  private BigDecimal bid = null;

  @SerializedName("BuySell")
  private String buySell = null;

  @SerializedName("CalculationReliability")
  private String calculationReliability = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("ClientKey")
  private String clientKey = null;

  @SerializedName("ClientName")
  private String clientName = null;

  @SerializedName("ClientNote")
  private String clientNote = null;

  @SerializedName("CorrelationKey")
  private String correlationKey = null;

  @SerializedName("CurrentPrice")
  private BigDecimal currentPrice = null;

  @SerializedName("CurrentPriceDelayMinutes")
  private Long currentPriceDelayMinutes = null;

  @SerializedName("CurrentPriceType")
  private String currentPriceType = null;

  @SerializedName("DisplayAndFormat")
  private OrderQueryDisplayAndFormat displayAndFormat = null;

  @SerializedName("DistanceToMarket")
  private BigDecimal distanceToMarket = null;

  @SerializedName("Duration")
  private Openapitradev2ordersOrderDuration duration = null;

  @SerializedName("Exchange")
  private OrderQueryExchange exchange = null;

  @SerializedName("IpoSubscriptionFee")
  private BigDecimal ipoSubscriptionFee = null;

  @SerializedName("ExternalReference")
  private String externalReference = null;

  @SerializedName("IsExtendedHoursEnabled")
  private Boolean isExtendedHoursEnabled = null;

  @SerializedName("IsForceOpen")
  private Boolean isForceOpen = null;

  @SerializedName("IsMarketOpen")
  private Boolean isMarketOpen = null;

  @SerializedName("MarketPrice")
  private BigDecimal marketPrice = null;

  @SerializedName("MarketState")
  private String marketState = null;

  @SerializedName("MarketValue")
  private BigDecimal marketValue = null;

  @SerializedName("NonTradableReason")
  private String nonTradableReason = null;

  @SerializedName("OpenOrderType")
  private String openOrderType = null;

  @SerializedName("OrderAmountType")
  private String orderAmountType = null;

  @SerializedName("OrderId")
  private String orderId = null;

  @SerializedName("OrderRelation")
  private String orderRelation = null;

  @SerializedName("OrderTime")
  private String orderTime = null;

  @SerializedName("Price")
  private BigDecimal price = null;

  @SerializedName("RelatedOpenOrders")
  private List<Object> relatedOpenOrders = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TradingStatus")
  private String tradingStatus = null;

  @SerializedName("Uic")
  private Long uic = null;

  public OrderQueryData accountId(String accountId) {
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

  public OrderQueryData accountKey(String accountKey) {
    this.accountKey = accountKey;
    return this;
  }

   /**
   * Get accountKey
   * @return accountKey
  **/
  @Schema(description = "")
  public String getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }

  public OrderQueryData adviceNote(String adviceNote) {
    this.adviceNote = adviceNote;
    return this;
  }

   /**
   * Get adviceNote
   * @return adviceNote
  **/
  @Schema(description = "")
  public String getAdviceNote() {
    return adviceNote;
  }

  public void setAdviceNote(String adviceNote) {
    this.adviceNote = adviceNote;
  }

  public OrderQueryData amount(BigDecimal amount) {
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

  public OrderQueryData ask(BigDecimal ask) {
    this.ask = ask;
    return this;
  }

   /**
   * Get ask
   * @return ask
  **/
  @Schema(description = "")
  public BigDecimal getAsk() {
    return ask;
  }

  public void setAsk(BigDecimal ask) {
    this.ask = ask;
  }

  public OrderQueryData assetType(String assetType) {
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

  public OrderQueryData bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @Schema(description = "")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public OrderQueryData buySell(String buySell) {
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

  public OrderQueryData calculationReliability(String calculationReliability) {
    this.calculationReliability = calculationReliability;
    return this;
  }

   /**
   * Get calculationReliability
   * @return calculationReliability
  **/
  @Schema(description = "")
  public String getCalculationReliability() {
    return calculationReliability;
  }

  public void setCalculationReliability(String calculationReliability) {
    this.calculationReliability = calculationReliability;
  }

  public OrderQueryData clientId(String clientId) {
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

  public OrderQueryData clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * Get clientKey
   * @return clientKey
  **/
  @Schema(description = "")
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public OrderQueryData clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @Schema(description = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public OrderQueryData clientNote(String clientNote) {
    this.clientNote = clientNote;
    return this;
  }

   /**
   * Get clientNote
   * @return clientNote
  **/
  @Schema(description = "")
  public String getClientNote() {
    return clientNote;
  }

  public void setClientNote(String clientNote) {
    this.clientNote = clientNote;
  }

  public OrderQueryData correlationKey(String correlationKey) {
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

  public OrderQueryData currentPrice(BigDecimal currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

   /**
   * Get currentPrice
   * @return currentPrice
  **/
  @Schema(description = "")
  public BigDecimal getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(BigDecimal currentPrice) {
    this.currentPrice = currentPrice;
  }

  public OrderQueryData currentPriceDelayMinutes(Long currentPriceDelayMinutes) {
    this.currentPriceDelayMinutes = currentPriceDelayMinutes;
    return this;
  }

   /**
   * Get currentPriceDelayMinutes
   * @return currentPriceDelayMinutes
  **/
  @Schema(description = "")
  public Long getCurrentPriceDelayMinutes() {
    return currentPriceDelayMinutes;
  }

  public void setCurrentPriceDelayMinutes(Long currentPriceDelayMinutes) {
    this.currentPriceDelayMinutes = currentPriceDelayMinutes;
  }

  public OrderQueryData currentPriceType(String currentPriceType) {
    this.currentPriceType = currentPriceType;
    return this;
  }

   /**
   * Get currentPriceType
   * @return currentPriceType
  **/
  @Schema(description = "")
  public String getCurrentPriceType() {
    return currentPriceType;
  }

  public void setCurrentPriceType(String currentPriceType) {
    this.currentPriceType = currentPriceType;
  }

  public OrderQueryData displayAndFormat(OrderQueryDisplayAndFormat displayAndFormat) {
    this.displayAndFormat = displayAndFormat;
    return this;
  }

   /**
   * Get displayAndFormat
   * @return displayAndFormat
  **/
  @Schema(description = "")
  public OrderQueryDisplayAndFormat getDisplayAndFormat() {
    return displayAndFormat;
  }

  public void setDisplayAndFormat(OrderQueryDisplayAndFormat displayAndFormat) {
    this.displayAndFormat = displayAndFormat;
  }

  public OrderQueryData distanceToMarket(BigDecimal distanceToMarket) {
    this.distanceToMarket = distanceToMarket;
    return this;
  }

   /**
   * Get distanceToMarket
   * @return distanceToMarket
  **/
  @Schema(description = "")
  public BigDecimal getDistanceToMarket() {
    return distanceToMarket;
  }

  public void setDistanceToMarket(BigDecimal distanceToMarket) {
    this.distanceToMarket = distanceToMarket;
  }

  public OrderQueryData duration(Openapitradev2ordersOrderDuration duration) {
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

  public OrderQueryData exchange(OrderQueryExchange exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @Schema(description = "")
  public OrderQueryExchange getExchange() {
    return exchange;
  }

  public void setExchange(OrderQueryExchange exchange) {
    this.exchange = exchange;
  }

  public OrderQueryData ipoSubscriptionFee(BigDecimal ipoSubscriptionFee) {
    this.ipoSubscriptionFee = ipoSubscriptionFee;
    return this;
  }

   /**
   * Get ipoSubscriptionFee
   * @return ipoSubscriptionFee
  **/
  @Schema(description = "")
  public BigDecimal getIpoSubscriptionFee() {
    return ipoSubscriptionFee;
  }

  public void setIpoSubscriptionFee(BigDecimal ipoSubscriptionFee) {
    this.ipoSubscriptionFee = ipoSubscriptionFee;
  }

  public OrderQueryData externalReference(String externalReference) {
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

  public OrderQueryData isExtendedHoursEnabled(Boolean isExtendedHoursEnabled) {
    this.isExtendedHoursEnabled = isExtendedHoursEnabled;
    return this;
  }

   /**
   * Get isExtendedHoursEnabled
   * @return isExtendedHoursEnabled
  **/
  @Schema(description = "")
  public Boolean isIsExtendedHoursEnabled() {
    return isExtendedHoursEnabled;
  }

  public void setIsExtendedHoursEnabled(Boolean isExtendedHoursEnabled) {
    this.isExtendedHoursEnabled = isExtendedHoursEnabled;
  }

  public OrderQueryData isForceOpen(Boolean isForceOpen) {
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

  public OrderQueryData isMarketOpen(Boolean isMarketOpen) {
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

  public OrderQueryData marketPrice(BigDecimal marketPrice) {
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * Get marketPrice
   * @return marketPrice
  **/
  @Schema(description = "")
  public BigDecimal getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(BigDecimal marketPrice) {
    this.marketPrice = marketPrice;
  }

  public OrderQueryData marketState(String marketState) {
    this.marketState = marketState;
    return this;
  }

   /**
   * Get marketState
   * @return marketState
  **/
  @Schema(description = "")
  public String getMarketState() {
    return marketState;
  }

  public void setMarketState(String marketState) {
    this.marketState = marketState;
  }

  public OrderQueryData marketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
    return this;
  }

   /**
   * Get marketValue
   * @return marketValue
  **/
  @Schema(description = "")
  public BigDecimal getMarketValue() {
    return marketValue;
  }

  public void setMarketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
  }

  public OrderQueryData nonTradableReason(String nonTradableReason) {
    this.nonTradableReason = nonTradableReason;
    return this;
  }

   /**
   * Get nonTradableReason
   * @return nonTradableReason
  **/
  @Schema(description = "")
  public String getNonTradableReason() {
    return nonTradableReason;
  }

  public void setNonTradableReason(String nonTradableReason) {
    this.nonTradableReason = nonTradableReason;
  }

  public OrderQueryData openOrderType(String openOrderType) {
    this.openOrderType = openOrderType;
    return this;
  }

   /**
   * Get openOrderType
   * @return openOrderType
  **/
  @Schema(description = "")
  public String getOpenOrderType() {
    return openOrderType;
  }

  public void setOpenOrderType(String openOrderType) {
    this.openOrderType = openOrderType;
  }

  public OrderQueryData orderAmountType(String orderAmountType) {
    this.orderAmountType = orderAmountType;
    return this;
  }

   /**
   * Get orderAmountType
   * @return orderAmountType
  **/
  @Schema(description = "")
  public String getOrderAmountType() {
    return orderAmountType;
  }

  public void setOrderAmountType(String orderAmountType) {
    this.orderAmountType = orderAmountType;
  }

  public OrderQueryData orderId(String orderId) {
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

  public OrderQueryData orderRelation(String orderRelation) {
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

  public OrderQueryData orderTime(String orderTime) {
    this.orderTime = orderTime;
    return this;
  }

   /**
   * Get orderTime
   * @return orderTime
  **/
  @Schema(description = "")
  public String getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }

  public OrderQueryData price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrderQueryData relatedOpenOrders(List<Object> relatedOpenOrders) {
    this.relatedOpenOrders = relatedOpenOrders;
    return this;
  }

  public OrderQueryData addRelatedOpenOrdersItem(Object relatedOpenOrdersItem) {
    if (this.relatedOpenOrders == null) {
      this.relatedOpenOrders = new ArrayList<Object>();
    }
    this.relatedOpenOrders.add(relatedOpenOrdersItem);
    return this;
  }

   /**
   * Get relatedOpenOrders
   * @return relatedOpenOrders
  **/
  @Schema(description = "")
  public List<Object> getRelatedOpenOrders() {
    return relatedOpenOrders;
  }

  public void setRelatedOpenOrders(List<Object> relatedOpenOrders) {
    this.relatedOpenOrders = relatedOpenOrders;
  }

  public OrderQueryData status(String status) {
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

  public OrderQueryData tradingStatus(String tradingStatus) {
    this.tradingStatus = tradingStatus;
    return this;
  }

   /**
   * Get tradingStatus
   * @return tradingStatus
  **/
  @Schema(description = "")
  public String getTradingStatus() {
    return tradingStatus;
  }

  public void setTradingStatus(String tradingStatus) {
    this.tradingStatus = tradingStatus;
  }

  public OrderQueryData uic(Long uic) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderQueryData orderQueryData = (OrderQueryData) o;
    return Objects.equals(this.accountId, orderQueryData.accountId) &&
        Objects.equals(this.accountKey, orderQueryData.accountKey) &&
        Objects.equals(this.adviceNote, orderQueryData.adviceNote) &&
        Objects.equals(this.amount, orderQueryData.amount) &&
        Objects.equals(this.ask, orderQueryData.ask) &&
        Objects.equals(this.assetType, orderQueryData.assetType) &&
        Objects.equals(this.bid, orderQueryData.bid) &&
        Objects.equals(this.buySell, orderQueryData.buySell) &&
        Objects.equals(this.calculationReliability, orderQueryData.calculationReliability) &&
        Objects.equals(this.clientId, orderQueryData.clientId) &&
        Objects.equals(this.clientKey, orderQueryData.clientKey) &&
        Objects.equals(this.clientName, orderQueryData.clientName) &&
        Objects.equals(this.clientNote, orderQueryData.clientNote) &&
        Objects.equals(this.correlationKey, orderQueryData.correlationKey) &&
        Objects.equals(this.currentPrice, orderQueryData.currentPrice) &&
        Objects.equals(this.currentPriceDelayMinutes, orderQueryData.currentPriceDelayMinutes) &&
        Objects.equals(this.currentPriceType, orderQueryData.currentPriceType) &&
        Objects.equals(this.displayAndFormat, orderQueryData.displayAndFormat) &&
        Objects.equals(this.distanceToMarket, orderQueryData.distanceToMarket) &&
        Objects.equals(this.duration, orderQueryData.duration) &&
        Objects.equals(this.exchange, orderQueryData.exchange) &&
        Objects.equals(this.ipoSubscriptionFee, orderQueryData.ipoSubscriptionFee) &&
        Objects.equals(this.externalReference, orderQueryData.externalReference) &&
        Objects.equals(this.isExtendedHoursEnabled, orderQueryData.isExtendedHoursEnabled) &&
        Objects.equals(this.isForceOpen, orderQueryData.isForceOpen) &&
        Objects.equals(this.isMarketOpen, orderQueryData.isMarketOpen) &&
        Objects.equals(this.marketPrice, orderQueryData.marketPrice) &&
        Objects.equals(this.marketState, orderQueryData.marketState) &&
        Objects.equals(this.marketValue, orderQueryData.marketValue) &&
        Objects.equals(this.nonTradableReason, orderQueryData.nonTradableReason) &&
        Objects.equals(this.openOrderType, orderQueryData.openOrderType) &&
        Objects.equals(this.orderAmountType, orderQueryData.orderAmountType) &&
        Objects.equals(this.orderId, orderQueryData.orderId) &&
        Objects.equals(this.orderRelation, orderQueryData.orderRelation) &&
        Objects.equals(this.orderTime, orderQueryData.orderTime) &&
        Objects.equals(this.price, orderQueryData.price) &&
        Objects.equals(this.relatedOpenOrders, orderQueryData.relatedOpenOrders) &&
        Objects.equals(this.status, orderQueryData.status) &&
        Objects.equals(this.tradingStatus, orderQueryData.tradingStatus) &&
        Objects.equals(this.uic, orderQueryData.uic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountKey, adviceNote, amount, ask, assetType, bid, buySell, calculationReliability, clientId, clientKey, clientName, clientNote, correlationKey, currentPrice, currentPriceDelayMinutes, currentPriceType, displayAndFormat, distanceToMarket, duration, exchange, ipoSubscriptionFee, externalReference, isExtendedHoursEnabled, isForceOpen, isMarketOpen, marketPrice, marketState, marketValue, nonTradableReason, openOrderType, orderAmountType, orderId, orderRelation, orderTime, price, relatedOpenOrders, status, tradingStatus, uic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderQueryData {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    adviceNote: ").append(toIndentedString(adviceNote)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    buySell: ").append(toIndentedString(buySell)).append("\n");
    sb.append("    calculationReliability: ").append(toIndentedString(calculationReliability)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientNote: ").append(toIndentedString(clientNote)).append("\n");
    sb.append("    correlationKey: ").append(toIndentedString(correlationKey)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    currentPriceDelayMinutes: ").append(toIndentedString(currentPriceDelayMinutes)).append("\n");
    sb.append("    currentPriceType: ").append(toIndentedString(currentPriceType)).append("\n");
    sb.append("    displayAndFormat: ").append(toIndentedString(displayAndFormat)).append("\n");
    sb.append("    distanceToMarket: ").append(toIndentedString(distanceToMarket)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    ipoSubscriptionFee: ").append(toIndentedString(ipoSubscriptionFee)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    isExtendedHoursEnabled: ").append(toIndentedString(isExtendedHoursEnabled)).append("\n");
    sb.append("    isForceOpen: ").append(toIndentedString(isForceOpen)).append("\n");
    sb.append("    isMarketOpen: ").append(toIndentedString(isMarketOpen)).append("\n");
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    marketState: ").append(toIndentedString(marketState)).append("\n");
    sb.append("    marketValue: ").append(toIndentedString(marketValue)).append("\n");
    sb.append("    nonTradableReason: ").append(toIndentedString(nonTradableReason)).append("\n");
    sb.append("    openOrderType: ").append(toIndentedString(openOrderType)).append("\n");
    sb.append("    orderAmountType: ").append(toIndentedString(orderAmountType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderRelation: ").append(toIndentedString(orderRelation)).append("\n");
    sb.append("    orderTime: ").append(toIndentedString(orderTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    relatedOpenOrders: ").append(toIndentedString(relatedOpenOrders)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tradingStatus: ").append(toIndentedString(tradingStatus)).append("\n");
    sb.append("    uic: ").append(toIndentedString(uic)).append("\n");
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
