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
 * InfoPriceQuote
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-27T21:00:40.494761882Z[GMT]")

public class InfoPriceQuote {
  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("Ask")
  private BigDecimal ask = null;

  @SerializedName("AskSize")
  private BigDecimal askSize = null;

  @SerializedName("Bid")
  private BigDecimal bid = null;

  @SerializedName("BidSize")
  private BigDecimal bidSize = null;

  @SerializedName("DelayedByMinutes")
  private Long delayedByMinutes = null;

  @SerializedName("ErrorCode")
  private String errorCode = null;

  @SerializedName("MarketState")
  private String marketState = null;

  @SerializedName("Mid")
  private BigDecimal mid = null;

  @SerializedName("PriceSource")
  private String priceSource = null;

  @SerializedName("PriceSourceType")
  private String priceSourceType = null;

  @SerializedName("PriceTypeAsk")
  private String priceTypeAsk = null;

  @SerializedName("PriceTypeBid")
  private String priceTypeBid = null;

  public InfoPriceQuote amount(BigDecimal amount) {
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

  public InfoPriceQuote ask(BigDecimal ask) {
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

  public InfoPriceQuote askSize(BigDecimal askSize) {
    this.askSize = askSize;
    return this;
  }

   /**
   * Get askSize
   * @return askSize
  **/
  @Schema(description = "")
  public BigDecimal getAskSize() {
    return askSize;
  }

  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
  }

  public InfoPriceQuote bid(BigDecimal bid) {
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

  public InfoPriceQuote bidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
    return this;
  }

   /**
   * Get bidSize
   * @return bidSize
  **/
  @Schema(description = "")
  public BigDecimal getBidSize() {
    return bidSize;
  }

  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  public InfoPriceQuote delayedByMinutes(Long delayedByMinutes) {
    this.delayedByMinutes = delayedByMinutes;
    return this;
  }

   /**
   * Get delayedByMinutes
   * @return delayedByMinutes
  **/
  @Schema(description = "")
  public Long getDelayedByMinutes() {
    return delayedByMinutes;
  }

  public void setDelayedByMinutes(Long delayedByMinutes) {
    this.delayedByMinutes = delayedByMinutes;
  }

  public InfoPriceQuote errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(description = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public InfoPriceQuote marketState(String marketState) {
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

  public InfoPriceQuote mid(BigDecimal mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @Schema(description = "")
  public BigDecimal getMid() {
    return mid;
  }

  public void setMid(BigDecimal mid) {
    this.mid = mid;
  }

  public InfoPriceQuote priceSource(String priceSource) {
    this.priceSource = priceSource;
    return this;
  }

   /**
   * Get priceSource
   * @return priceSource
  **/
  @Schema(description = "")
  public String getPriceSource() {
    return priceSource;
  }

  public void setPriceSource(String priceSource) {
    this.priceSource = priceSource;
  }

  public InfoPriceQuote priceSourceType(String priceSourceType) {
    this.priceSourceType = priceSourceType;
    return this;
  }

   /**
   * Get priceSourceType
   * @return priceSourceType
  **/
  @Schema(description = "")
  public String getPriceSourceType() {
    return priceSourceType;
  }

  public void setPriceSourceType(String priceSourceType) {
    this.priceSourceType = priceSourceType;
  }

  public InfoPriceQuote priceTypeAsk(String priceTypeAsk) {
    this.priceTypeAsk = priceTypeAsk;
    return this;
  }

   /**
   * Get priceTypeAsk
   * @return priceTypeAsk
  **/
  @Schema(description = "")
  public String getPriceTypeAsk() {
    return priceTypeAsk;
  }

  public void setPriceTypeAsk(String priceTypeAsk) {
    this.priceTypeAsk = priceTypeAsk;
  }

  public InfoPriceQuote priceTypeBid(String priceTypeBid) {
    this.priceTypeBid = priceTypeBid;
    return this;
  }

   /**
   * Get priceTypeBid
   * @return priceTypeBid
  **/
  @Schema(description = "")
  public String getPriceTypeBid() {
    return priceTypeBid;
  }

  public void setPriceTypeBid(String priceTypeBid) {
    this.priceTypeBid = priceTypeBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoPriceQuote infoPriceQuote = (InfoPriceQuote) o;
    return Objects.equals(this.amount, infoPriceQuote.amount) &&
        Objects.equals(this.ask, infoPriceQuote.ask) &&
        Objects.equals(this.askSize, infoPriceQuote.askSize) &&
        Objects.equals(this.bid, infoPriceQuote.bid) &&
        Objects.equals(this.bidSize, infoPriceQuote.bidSize) &&
        Objects.equals(this.delayedByMinutes, infoPriceQuote.delayedByMinutes) &&
        Objects.equals(this.errorCode, infoPriceQuote.errorCode) &&
        Objects.equals(this.marketState, infoPriceQuote.marketState) &&
        Objects.equals(this.mid, infoPriceQuote.mid) &&
        Objects.equals(this.priceSource, infoPriceQuote.priceSource) &&
        Objects.equals(this.priceSourceType, infoPriceQuote.priceSourceType) &&
        Objects.equals(this.priceTypeAsk, infoPriceQuote.priceTypeAsk) &&
        Objects.equals(this.priceTypeBid, infoPriceQuote.priceTypeBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, ask, askSize, bid, bidSize, delayedByMinutes, errorCode, marketState, mid, priceSource, priceSourceType, priceTypeAsk, priceTypeBid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoPriceQuote {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    delayedByMinutes: ").append(toIndentedString(delayedByMinutes)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    marketState: ").append(toIndentedString(marketState)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    priceSource: ").append(toIndentedString(priceSource)).append("\n");
    sb.append("    priceSourceType: ").append(toIndentedString(priceSourceType)).append("\n");
    sb.append("    priceTypeAsk: ").append(toIndentedString(priceTypeAsk)).append("\n");
    sb.append("    priceTypeBid: ").append(toIndentedString(priceTypeBid)).append("\n");
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
