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
import saxobank.home.sdk.model.PositionsPositionBase;
import saxobank.home.sdk.model.PositionsPositionView;

import java.io.IOException;
/**
 * PositionsData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class PositionsData {
  @SerializedName("NetPositionId")
  private String netPositionId = null;

  @SerializedName("PositionBase")
  private PositionsPositionBase positionBase = null;

  @SerializedName("PositionId")
  private String positionId = null;

  @SerializedName("PositionView")
  private PositionsPositionView positionView = null;

  public PositionsData netPositionId(String netPositionId) {
    this.netPositionId = netPositionId;
    return this;
  }

   /**
   * Get netPositionId
   * @return netPositionId
  **/
  @Schema(description = "")
  public String getNetPositionId() {
    return netPositionId;
  }

  public void setNetPositionId(String netPositionId) {
    this.netPositionId = netPositionId;
  }

  public PositionsData positionBase(PositionsPositionBase positionBase) {
    this.positionBase = positionBase;
    return this;
  }

   /**
   * Get positionBase
   * @return positionBase
  **/
  @Schema(description = "")
  public PositionsPositionBase getPositionBase() {
    return positionBase;
  }

  public void setPositionBase(PositionsPositionBase positionBase) {
    this.positionBase = positionBase;
  }

  public PositionsData positionId(String positionId) {
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

  public PositionsData positionView(PositionsPositionView positionView) {
    this.positionView = positionView;
    return this;
  }

   /**
   * Get positionView
   * @return positionView
  **/
  @Schema(description = "")
  public PositionsPositionView getPositionView() {
    return positionView;
  }

  public void setPositionView(PositionsPositionView positionView) {
    this.positionView = positionView;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionsData positionsData = (PositionsData) o;
    return Objects.equals(this.netPositionId, positionsData.netPositionId) &&
        Objects.equals(this.positionBase, positionsData.positionBase) &&
        Objects.equals(this.positionId, positionsData.positionId) &&
        Objects.equals(this.positionView, positionsData.positionView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netPositionId, positionBase, positionId, positionView);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsData {\n");
    
    sb.append("    netPositionId: ").append(toIndentedString(netPositionId)).append("\n");
    sb.append("    positionBase: ").append(toIndentedString(positionBase)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionView: ").append(toIndentedString(positionView)).append("\n");
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
