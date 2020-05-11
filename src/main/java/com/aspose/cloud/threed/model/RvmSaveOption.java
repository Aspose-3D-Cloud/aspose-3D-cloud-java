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
import com.aspose.cloud.threed.model.FileContentType;
import com.aspose.cloud.threed.model.SaveFormat;
import com.aspose.cloud.threed.model.SaveOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * RvmSaveOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T10:19:53.827+08:00")
public class RvmSaveOption extends SaveOptions {
  @SerializedName("FileNote")
  private String fileNote = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("CreationTime")
  private String creationTime = null;

  @SerializedName("FileContentType")
  private FileContentType fileContentType = null;

  public RvmSaveOption fileNote(String fileNote) {
    this.fileNote = fileNote;
    return this;
  }

   /**
   * File note in the file header.
   * @return fileNote
  **/
  @ApiModelProperty(value = "File note in the file header.")
  public String getFileNote() {
    return fileNote;
  }

  public void setFileNote(String fileNote) {
    this.fileNote = fileNote;
  }

  public RvmSaveOption author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author information, default value is &#39;3d@aspose&#39;.
   * @return author
  **/
  @ApiModelProperty(value = "Author information, default value is '3d@aspose'.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public RvmSaveOption creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * The timestamp that exported this file, default value is current time.
   * @return creationTime
  **/
  @ApiModelProperty(value = "The timestamp that exported this file, default value is current time.")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public RvmSaveOption fileContentType(FileContentType fileContentType) {
    this.fileContentType = fileContentType;
    return this;
  }

   /**
   * Gets or sets  of the FileContent Style.
   * @return fileContentType
  **/
  @ApiModelProperty(value = "Gets or sets  of the FileContent Style.")
  public FileContentType getFileContentType() {
    return fileContentType;
  }

  public void setFileContentType(FileContentType fileContentType) {
    this.fileContentType = fileContentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RvmSaveOption rvmSaveOption = (RvmSaveOption) o;
    return Objects.equals(this.fileNote, rvmSaveOption.fileNote) &&
        Objects.equals(this.author, rvmSaveOption.author) &&
        Objects.equals(this.creationTime, rvmSaveOption.creationTime) &&
        Objects.equals(this.fileContentType, rvmSaveOption.fileContentType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileNote, author, creationTime, fileContentType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RvmSaveOption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileNote: ").append(toIndentedString(fileNote)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    fileContentType: ").append(toIndentedString(fileContentType)).append("\n");
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

