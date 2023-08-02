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
 * NetPositionsMeNetPositionView
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class NetPositionsMeNetPositionView {
  @SerializedName("Ask")
  private BigDecimal ask = null;

  @SerializedName("AverageOpenPrice")
  private BigDecimal averageOpenPrice = null;

  @SerializedName("AverageOpenPriceIncludingCosts")
  private BigDecimal averageOpenPriceIncludingCosts = null;

  @SerializedName("Bid")
  private BigDecimal bid = null;

  @SerializedName("CalculationReliability")
  private String calculationReliability = null;

  @SerializedName("ConversionRateCurrent")
  private BigDecimal conversionRateCurrent = null;

  @SerializedName("CurrentPrice")
  private BigDecimal currentPrice = null;

  @SerializedName("CurrentPriceDelayMinutes")
  private BigDecimal currentPriceDelayMinutes = null;

  @SerializedName("CurrentPriceType")
  private String currentPriceType = null;

  @SerializedName("Exposure")
  private BigDecimal exposure = null;

  @SerializedName("ExposureCurrency")
  private String exposureCurrency = null;

  @SerializedName("ExposureInBaseCurrency")
  private BigDecimal exposureInBaseCurrency = null;

  @SerializedName("InstrumentPriceDayPercentChange")
  private BigDecimal instrumentPriceDayPercentChange = null;

  @SerializedName("MarketValue")
  private BigDecimal marketValue = null;

  @SerializedName("MarketValueInBaseCurrency")
  private BigDecimal marketValueInBaseCurrency = null;

  @SerializedName("PositionCount")
  private Integer positionCount = null;

  @SerializedName("PositionsAverageBuyPrice")
  private BigDecimal positionsAverageBuyPrice = null;

  @SerializedName("PositionsAverageSellPrice")
  private BigDecimal positionsAverageSellPrice = null;

  @SerializedName("PositionsNotClosedCount")
  private Integer positionsNotClosedCount = null;

  @SerializedName("ProfitLossOnTrade")
  private BigDecimal profitLossOnTrade = null;

  @SerializedName("ProfitLossOnTradeInBaseCurrency")
  private BigDecimal profitLossOnTradeInBaseCurrency = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TradeCostsTotal")
  private BigDecimal tradeCostsTotal = null;

  @SerializedName("TradeCostsTotalInBaseCurrency")
  private BigDecimal tradeCostsTotalInBaseCurrency = null;

  public NetPositionsMeNetPositionView ask(BigDecimal ask) {
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

  public NetPositionsMeNetPositionView averageOpenPrice(BigDecimal averageOpenPrice) {
    this.averageOpenPrice = averageOpenPrice;
    return this;
  }

   /**
   * Get averageOpenPrice
   * @return averageOpenPrice
  **/
  @Schema(description = "")
  public BigDecimal getAverageOpenPrice() {
    return averageOpenPrice;
  }

  public void setAverageOpenPrice(BigDecimal averageOpenPrice) {
    this.averageOpenPrice = averageOpenPrice;
  }

  public NetPositionsMeNetPositionView averageOpenPriceIncludingCosts(BigDecimal averageOpenPriceIncludingCosts) {
    this.averageOpenPriceIncludingCosts = averageOpenPriceIncludingCosts;
    return this;
  }

   /**
   * Get averageOpenPriceIncludingCosts
   * @return averageOpenPriceIncludingCosts
  **/
  @Schema(description = "")
  public BigDecimal getAverageOpenPriceIncludingCosts() {
    return averageOpenPriceIncludingCosts;
  }

  public void setAverageOpenPriceIncludingCosts(BigDecimal averageOpenPriceIncludingCosts) {
    this.averageOpenPriceIncludingCosts = averageOpenPriceIncludingCosts;
  }

  public NetPositionsMeNetPositionView bid(BigDecimal bid) {
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

  public NetPositionsMeNetPositionView calculationReliability(String calculationReliability) {
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

  public NetPositionsMeNetPositionView conversionRateCurrent(BigDecimal conversionRateCurrent) {
    this.conversionRateCurrent = conversionRateCurrent;
    return this;
  }

   /**
   * Get conversionRateCurrent
   * @return conversionRateCurrent
  **/
  @Schema(description = "")
  public BigDecimal getConversionRateCurrent() {
    return conversionRateCurrent;
  }

  public void setConversionRateCurrent(BigDecimal conversionRateCurrent) {
    this.conversionRateCurrent = conversionRateCurrent;
  }

  public NetPositionsMeNetPositionView currentPrice(BigDecimal currentPrice) {
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

  public NetPositionsMeNetPositionView currentPriceDelayMinutes(BigDecimal currentPriceDelayMinutes) {
    this.currentPriceDelayMinutes = currentPriceDelayMinutes;
    return this;
  }

   /**
   * Get currentPriceDelayMinutes
   * @return currentPriceDelayMinutes
  **/
  @Schema(description = "")
  public BigDecimal getCurrentPriceDelayMinutes() {
    return currentPriceDelayMinutes;
  }

  public void setCurrentPriceDelayMinutes(BigDecimal currentPriceDelayMinutes) {
    this.currentPriceDelayMinutes = currentPriceDelayMinutes;
  }

  public NetPositionsMeNetPositionView currentPriceType(String currentPriceType) {
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

  public NetPositionsMeNetPositionView exposure(BigDecimal exposure) {
    this.exposure = exposure;
    return this;
  }

   /**
   * Get exposure
   * @return exposure
  **/
  @Schema(description = "")
  public BigDecimal getExposure() {
    return exposure;
  }

  public void setExposure(BigDecimal exposure) {
    this.exposure = exposure;
  }

  public NetPositionsMeNetPositionView exposureCurrency(String exposureCurrency) {
    this.exposureCurrency = exposureCurrency;
    return this;
  }

   /**
   * Get exposureCurrency
   * @return exposureCurrency
  **/
  @Schema(description = "")
  public String getExposureCurrency() {
    return exposureCurrency;
  }

  public void setExposureCurrency(String exposureCurrency) {
    this.exposureCurrency = exposureCurrency;
  }

  public NetPositionsMeNetPositionView exposureInBaseCurrency(BigDecimal exposureInBaseCurrency) {
    this.exposureInBaseCurrency = exposureInBaseCurrency;
    return this;
  }

   /**
   * Get exposureInBaseCurrency
   * @return exposureInBaseCurrency
  **/
  @Schema(description = "")
  public BigDecimal getExposureInBaseCurrency() {
    return exposureInBaseCurrency;
  }

  public void setExposureInBaseCurrency(BigDecimal exposureInBaseCurrency) {
    this.exposureInBaseCurrency = exposureInBaseCurrency;
  }

  public NetPositionsMeNetPositionView instrumentPriceDayPercentChange(BigDecimal instrumentPriceDayPercentChange) {
    this.instrumentPriceDayPercentChange = instrumentPriceDayPercentChange;
    return this;
  }

   /**
   * Get instrumentPriceDayPercentChange
   * @return instrumentPriceDayPercentChange
  **/
  @Schema(description = "")
  public BigDecimal getInstrumentPriceDayPercentChange() {
    return instrumentPriceDayPercentChange;
  }

  public void setInstrumentPriceDayPercentChange(BigDecimal instrumentPriceDayPercentChange) {
    this.instrumentPriceDayPercentChange = instrumentPriceDayPercentChange;
  }

  public NetPositionsMeNetPositionView marketValue(BigDecimal marketValue) {
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

  public NetPositionsMeNetPositionView marketValueInBaseCurrency(BigDecimal marketValueInBaseCurrency) {
    this.marketValueInBaseCurrency = marketValueInBaseCurrency;
    return this;
  }

   /**
   * Get marketValueInBaseCurrency
   * @return marketValueInBaseCurrency
  **/
  @Schema(description = "")
  public BigDecimal getMarketValueInBaseCurrency() {
    return marketValueInBaseCurrency;
  }

  public void setMarketValueInBaseCurrency(BigDecimal marketValueInBaseCurrency) {
    this.marketValueInBaseCurrency = marketValueInBaseCurrency;
  }

  public NetPositionsMeNetPositionView positionCount(Integer positionCount) {
    this.positionCount = positionCount;
    return this;
  }

   /**
   * Get positionCount
   * @return positionCount
  **/
  @Schema(description = "")
  public Integer getPositionCount() {
    return positionCount;
  }

  public void setPositionCount(Integer positionCount) {
    this.positionCount = positionCount;
  }

  public NetPositionsMeNetPositionView positionsAverageBuyPrice(BigDecimal positionsAverageBuyPrice) {
    this.positionsAverageBuyPrice = positionsAverageBuyPrice;
    return this;
  }

   /**
   * Get positionsAverageBuyPrice
   * @return positionsAverageBuyPrice
  **/
  @Schema(description = "")
  public BigDecimal getPositionsAverageBuyPrice() {
    return positionsAverageBuyPrice;
  }

  public void setPositionsAverageBuyPrice(BigDecimal positionsAverageBuyPrice) {
    this.positionsAverageBuyPrice = positionsAverageBuyPrice;
  }

  public NetPositionsMeNetPositionView positionsAverageSellPrice(BigDecimal positionsAverageSellPrice) {
    this.positionsAverageSellPrice = positionsAverageSellPrice;
    return this;
  }

   /**
   * Get positionsAverageSellPrice
   * @return positionsAverageSellPrice
  **/
  @Schema(description = "")
  public BigDecimal getPositionsAverageSellPrice() {
    return positionsAverageSellPrice;
  }

  public void setPositionsAverageSellPrice(BigDecimal positionsAverageSellPrice) {
    this.positionsAverageSellPrice = positionsAverageSellPrice;
  }

  public NetPositionsMeNetPositionView positionsNotClosedCount(Integer positionsNotClosedCount) {
    this.positionsNotClosedCount = positionsNotClosedCount;
    return this;
  }

   /**
   * Get positionsNotClosedCount
   * @return positionsNotClosedCount
  **/
  @Schema(description = "")
  public Integer getPositionsNotClosedCount() {
    return positionsNotClosedCount;
  }

  public void setPositionsNotClosedCount(Integer positionsNotClosedCount) {
    this.positionsNotClosedCount = positionsNotClosedCount;
  }

  public NetPositionsMeNetPositionView profitLossOnTrade(BigDecimal profitLossOnTrade) {
    this.profitLossOnTrade = profitLossOnTrade;
    return this;
  }

   /**
   * Get profitLossOnTrade
   * @return profitLossOnTrade
  **/
  @Schema(description = "")
  public BigDecimal getProfitLossOnTrade() {
    return profitLossOnTrade;
  }

  public void setProfitLossOnTrade(BigDecimal profitLossOnTrade) {
    this.profitLossOnTrade = profitLossOnTrade;
  }

  public NetPositionsMeNetPositionView profitLossOnTradeInBaseCurrency(BigDecimal profitLossOnTradeInBaseCurrency) {
    this.profitLossOnTradeInBaseCurrency = profitLossOnTradeInBaseCurrency;
    return this;
  }

   /**
   * Get profitLossOnTradeInBaseCurrency
   * @return profitLossOnTradeInBaseCurrency
  **/
  @Schema(description = "")
  public BigDecimal getProfitLossOnTradeInBaseCurrency() {
    return profitLossOnTradeInBaseCurrency;
  }

  public void setProfitLossOnTradeInBaseCurrency(BigDecimal profitLossOnTradeInBaseCurrency) {
    this.profitLossOnTradeInBaseCurrency = profitLossOnTradeInBaseCurrency;
  }

  public NetPositionsMeNetPositionView status(String status) {
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

  public NetPositionsMeNetPositionView tradeCostsTotal(BigDecimal tradeCostsTotal) {
    this.tradeCostsTotal = tradeCostsTotal;
    return this;
  }

   /**
   * Get tradeCostsTotal
   * @return tradeCostsTotal
  **/
  @Schema(description = "")
  public BigDecimal getTradeCostsTotal() {
    return tradeCostsTotal;
  }

  public void setTradeCostsTotal(BigDecimal tradeCostsTotal) {
    this.tradeCostsTotal = tradeCostsTotal;
  }

  public NetPositionsMeNetPositionView tradeCostsTotalInBaseCurrency(BigDecimal tradeCostsTotalInBaseCurrency) {
    this.tradeCostsTotalInBaseCurrency = tradeCostsTotalInBaseCurrency;
    return this;
  }

   /**
   * Get tradeCostsTotalInBaseCurrency
   * @return tradeCostsTotalInBaseCurrency
  **/
  @Schema(description = "")
  public BigDecimal getTradeCostsTotalInBaseCurrency() {
    return tradeCostsTotalInBaseCurrency;
  }

  public void setTradeCostsTotalInBaseCurrency(BigDecimal tradeCostsTotalInBaseCurrency) {
    this.tradeCostsTotalInBaseCurrency = tradeCostsTotalInBaseCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetPositionsMeNetPositionView netPositionsMeNetPositionView = (NetPositionsMeNetPositionView) o;
    return Objects.equals(this.ask, netPositionsMeNetPositionView.ask) &&
        Objects.equals(this.averageOpenPrice, netPositionsMeNetPositionView.averageOpenPrice) &&
        Objects.equals(this.averageOpenPriceIncludingCosts, netPositionsMeNetPositionView.averageOpenPriceIncludingCosts) &&
        Objects.equals(this.bid, netPositionsMeNetPositionView.bid) &&
        Objects.equals(this.calculationReliability, netPositionsMeNetPositionView.calculationReliability) &&
        Objects.equals(this.conversionRateCurrent, netPositionsMeNetPositionView.conversionRateCurrent) &&
        Objects.equals(this.currentPrice, netPositionsMeNetPositionView.currentPrice) &&
        Objects.equals(this.currentPriceDelayMinutes, netPositionsMeNetPositionView.currentPriceDelayMinutes) &&
        Objects.equals(this.currentPriceType, netPositionsMeNetPositionView.currentPriceType) &&
        Objects.equals(this.exposure, netPositionsMeNetPositionView.exposure) &&
        Objects.equals(this.exposureCurrency, netPositionsMeNetPositionView.exposureCurrency) &&
        Objects.equals(this.exposureInBaseCurrency, netPositionsMeNetPositionView.exposureInBaseCurrency) &&
        Objects.equals(this.instrumentPriceDayPercentChange, netPositionsMeNetPositionView.instrumentPriceDayPercentChange) &&
        Objects.equals(this.marketValue, netPositionsMeNetPositionView.marketValue) &&
        Objects.equals(this.marketValueInBaseCurrency, netPositionsMeNetPositionView.marketValueInBaseCurrency) &&
        Objects.equals(this.positionCount, netPositionsMeNetPositionView.positionCount) &&
        Objects.equals(this.positionsAverageBuyPrice, netPositionsMeNetPositionView.positionsAverageBuyPrice) &&
        Objects.equals(this.positionsAverageSellPrice, netPositionsMeNetPositionView.positionsAverageSellPrice) &&
        Objects.equals(this.positionsNotClosedCount, netPositionsMeNetPositionView.positionsNotClosedCount) &&
        Objects.equals(this.profitLossOnTrade, netPositionsMeNetPositionView.profitLossOnTrade) &&
        Objects.equals(this.profitLossOnTradeInBaseCurrency, netPositionsMeNetPositionView.profitLossOnTradeInBaseCurrency) &&
        Objects.equals(this.status, netPositionsMeNetPositionView.status) &&
        Objects.equals(this.tradeCostsTotal, netPositionsMeNetPositionView.tradeCostsTotal) &&
        Objects.equals(this.tradeCostsTotalInBaseCurrency, netPositionsMeNetPositionView.tradeCostsTotalInBaseCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ask, averageOpenPrice, averageOpenPriceIncludingCosts, bid, calculationReliability, conversionRateCurrent, currentPrice, currentPriceDelayMinutes, currentPriceType, exposure, exposureCurrency, exposureInBaseCurrency, instrumentPriceDayPercentChange, marketValue, marketValueInBaseCurrency, positionCount, positionsAverageBuyPrice, positionsAverageSellPrice, positionsNotClosedCount, profitLossOnTrade, profitLossOnTradeInBaseCurrency, status, tradeCostsTotal, tradeCostsTotalInBaseCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetPositionsMeNetPositionView {\n");
    
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    averageOpenPrice: ").append(toIndentedString(averageOpenPrice)).append("\n");
    sb.append("    averageOpenPriceIncludingCosts: ").append(toIndentedString(averageOpenPriceIncludingCosts)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    calculationReliability: ").append(toIndentedString(calculationReliability)).append("\n");
    sb.append("    conversionRateCurrent: ").append(toIndentedString(conversionRateCurrent)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    currentPriceDelayMinutes: ").append(toIndentedString(currentPriceDelayMinutes)).append("\n");
    sb.append("    currentPriceType: ").append(toIndentedString(currentPriceType)).append("\n");
    sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
    sb.append("    exposureCurrency: ").append(toIndentedString(exposureCurrency)).append("\n");
    sb.append("    exposureInBaseCurrency: ").append(toIndentedString(exposureInBaseCurrency)).append("\n");
    sb.append("    instrumentPriceDayPercentChange: ").append(toIndentedString(instrumentPriceDayPercentChange)).append("\n");
    sb.append("    marketValue: ").append(toIndentedString(marketValue)).append("\n");
    sb.append("    marketValueInBaseCurrency: ").append(toIndentedString(marketValueInBaseCurrency)).append("\n");
    sb.append("    positionCount: ").append(toIndentedString(positionCount)).append("\n");
    sb.append("    positionsAverageBuyPrice: ").append(toIndentedString(positionsAverageBuyPrice)).append("\n");
    sb.append("    positionsAverageSellPrice: ").append(toIndentedString(positionsAverageSellPrice)).append("\n");
    sb.append("    positionsNotClosedCount: ").append(toIndentedString(positionsNotClosedCount)).append("\n");
    sb.append("    profitLossOnTrade: ").append(toIndentedString(profitLossOnTrade)).append("\n");
    sb.append("    profitLossOnTradeInBaseCurrency: ").append(toIndentedString(profitLossOnTradeInBaseCurrency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tradeCostsTotal: ").append(toIndentedString(tradeCostsTotal)).append("\n");
    sb.append("    tradeCostsTotalInBaseCurrency: ").append(toIndentedString(tradeCostsTotalInBaseCurrency)).append("\n");
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