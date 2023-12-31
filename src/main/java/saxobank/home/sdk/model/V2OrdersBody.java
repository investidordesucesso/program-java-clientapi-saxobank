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
import saxobank.home.sdk.model.Openapitradev2ordersOrders;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * V2OrdersBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class V2OrdersBody {
  @SerializedName("OrderDuration")
  private Openapitradev2ordersOrderDuration orderDuration = null;

  @SerializedName("AssetType")
  private String assetType = null;

  @SerializedName("OrderType")
  private String orderType = null;

  @SerializedName("Amount")
  private BigDecimal amount = null;

  @SerializedName("AmountType")
  private String amountType = null;

  @SerializedName("OrderPrice")
  private BigDecimal orderPrice = null;

  @SerializedName("BuySell")
  private String buySell = null;

  @SerializedName("OrderRelation")
  private String orderRelation = null;

  @SerializedName("ExternalReference")
  private String externalReference = null;

  @SerializedName("ManualOrder")
  private Boolean manualOrder = null;

  @SerializedName("AccountKey")
  private String accountKey = null;

  @SerializedName("Uic")
  private Long uic = null;

  @SerializedName("Orders")
  private List<Openapitradev2ordersOrders> orders = null;

  public V2OrdersBody orderDuration(Openapitradev2ordersOrderDuration orderDuration) {
    this.orderDuration = orderDuration;
    return this;
  }

   /**
   * Get orderDuration
   * @return orderDuration
  **/
  @Schema(description = "")
  public Openapitradev2ordersOrderDuration getOrderDuration() {
    return orderDuration;
  }

  public void setOrderDuration(Openapitradev2ordersOrderDuration orderDuration) {
    this.orderDuration = orderDuration;
  }

  public V2OrdersBody assetType(String assetType) {
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

  public V2OrdersBody orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/placeorder/8a54c1dda631991abd75280e2740c42e/placeableordertype/1434dd641953bb711e8c6d3f7ad963e7
   * @return orderType
  **/
  @Schema(description = "See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/placeorder/8a54c1dda631991abd75280e2740c42e/placeableordertype/1434dd641953bb711e8c6d3f7ad963e7")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public V2OrdersBody amount(BigDecimal amount) {
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

  public V2OrdersBody amountType(String amountType) {
    this.amountType = amountType;
    return this;
  }

   /**
   * See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/placeorder/8a54c1dda631991abd75280e2740c42e/orderamounttype/543ba72d79bc1061609d375d3682aa7a
   * @return amountType
  **/
  @Schema(description = "See https://www.developer.saxo/openapi/referencedocs/trade/v2/orders/placeorder/8a54c1dda631991abd75280e2740c42e/orderamounttype/543ba72d79bc1061609d375d3682aa7a")
  public String getAmountType() {
    return amountType;
  }

  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }

  public V2OrdersBody orderPrice(BigDecimal orderPrice) {
    this.orderPrice = orderPrice;
    return this;
  }

   /**
   * Order Price. Optional for market orders.
   * @return orderPrice
  **/
  @Schema(description = "Order Price. Optional for market orders.")
  public BigDecimal getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(BigDecimal orderPrice) {
    this.orderPrice = orderPrice;
  }

  public V2OrdersBody buySell(String buySell) {
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

  public V2OrdersBody orderRelation(String orderRelation) {
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

  public V2OrdersBody externalReference(String externalReference) {
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

  public V2OrdersBody manualOrder(Boolean manualOrder) {
    this.manualOrder = manualOrder;
    return this;
  }

   /**
   * Get manualOrder
   * @return manualOrder
  **/
  @Schema(description = "")
  public Boolean isManualOrder() {
    return manualOrder;
  }

  public void setManualOrder(Boolean manualOrder) {
    this.manualOrder = manualOrder;
  }

  public V2OrdersBody accountKey(String accountKey) {
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

  public V2OrdersBody uic(Long uic) {
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

  public V2OrdersBody orders(List<Openapitradev2ordersOrders> orders) {
    this.orders = orders;
    return this;
  }

  public V2OrdersBody addOrdersItem(Openapitradev2ordersOrders ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<Openapitradev2ordersOrders>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @Schema(description = "")
  public List<Openapitradev2ordersOrders> getOrders() {
    return orders;
  }

  public void setOrders(List<Openapitradev2ordersOrders> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2OrdersBody v2OrdersBody = (V2OrdersBody) o;
    return Objects.equals(this.orderDuration, v2OrdersBody.orderDuration) &&
        Objects.equals(this.assetType, v2OrdersBody.assetType) &&
        Objects.equals(this.orderType, v2OrdersBody.orderType) &&
        Objects.equals(this.amount, v2OrdersBody.amount) &&
        Objects.equals(this.amountType, v2OrdersBody.amountType) &&
        Objects.equals(this.orderPrice, v2OrdersBody.orderPrice) &&
        Objects.equals(this.buySell, v2OrdersBody.buySell) &&
        Objects.equals(this.orderRelation, v2OrdersBody.orderRelation) &&
        Objects.equals(this.externalReference, v2OrdersBody.externalReference) &&
        Objects.equals(this.manualOrder, v2OrdersBody.manualOrder) &&
        Objects.equals(this.accountKey, v2OrdersBody.accountKey) &&
        Objects.equals(this.uic, v2OrdersBody.uic) &&
        Objects.equals(this.orders, v2OrdersBody.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderDuration, assetType, orderType, amount, amountType, orderPrice, buySell, orderRelation, externalReference, manualOrder, accountKey, uic, orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2OrdersBody {\n");
    
    sb.append("    orderDuration: ").append(toIndentedString(orderDuration)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    orderPrice: ").append(toIndentedString(orderPrice)).append("\n");
    sb.append("    buySell: ").append(toIndentedString(buySell)).append("\n");
    sb.append("    orderRelation: ").append(toIndentedString(orderRelation)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    manualOrder: ").append(toIndentedString(manualOrder)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    uic: ").append(toIndentedString(uic)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
