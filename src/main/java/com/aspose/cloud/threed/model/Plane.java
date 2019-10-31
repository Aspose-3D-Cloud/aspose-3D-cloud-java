/*
 * Aspose.ThreeD Cloud API Reference
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.threed.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Plane Entity
 */
@ApiModel(description = "Plane Entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-14T15:01:31.292+08:00")
public class Plane {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Length")
  private Double length = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("LengthSegments")
  private Integer lengthSegments = null;

  @SerializedName("WidthSegments")
  private Integer widthSegments = null;

  public Plane name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of Plane
   * @return name
  **/
  @ApiModelProperty(value = "The name of Plane")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plane length(Double length) {
    this.length = length;
    return this;
  }

   /**
   * Gets or sets the length of the plane.             
   * @return length
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the length of the plane.             ")
  public Double getLength() {
    return length;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  public Plane width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the width of the plane             
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the width of the plane             ")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Plane lengthSegments(Integer lengthSegments) {
    this.lengthSegments = lengthSegments;
    return this;
  }

   /**
   * Gets or sets the length segments.             
   * @return lengthSegments
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the length segments.             ")
  public Integer getLengthSegments() {
    return lengthSegments;
  }

  public void setLengthSegments(Integer lengthSegments) {
    this.lengthSegments = lengthSegments;
  }

  public Plane widthSegments(Integer widthSegments) {
    this.widthSegments = widthSegments;
    return this;
  }

   /**
   * Gets or sets the width segments.
   * @return widthSegments
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the width segments.")
  public Integer getWidthSegments() {
    return widthSegments;
  }

  public void setWidthSegments(Integer widthSegments) {
    this.widthSegments = widthSegments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plane plane = (Plane) o;
    return Objects.equals(this.name, plane.name) &&
        Objects.equals(this.length, plane.length) &&
        Objects.equals(this.width, plane.width) &&
        Objects.equals(this.lengthSegments, plane.lengthSegments) &&
        Objects.equals(this.widthSegments, plane.widthSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, length, width, lengthSegments, widthSegments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plane {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    lengthSegments: ").append(toIndentedString(lengthSegments)).append("\n");
    sb.append("    widthSegments: ").append(toIndentedString(widthSegments)).append("\n");
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

