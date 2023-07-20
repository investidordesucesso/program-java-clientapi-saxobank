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
import io.swagger.client.model.OrdersCancelErrorInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OrdersCancel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-20T19:53:46.685908542Z[GMT]")

public class OrdersCancel {
  @SerializedName("ErrorInfo")
  private OrdersCancelErrorInfo errorInfo = null;

  public OrdersCancel errorInfo(OrdersCancelErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * Get errorInfo
   * @return errorInfo
  **/
  @Schema(description = "")
  public OrdersCancelErrorInfo getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(OrdersCancelErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersCancel ordersCancel = (OrdersCancel) o;
    return Objects.equals(this.errorInfo, ordersCancel.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersCancel {\n");
    
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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