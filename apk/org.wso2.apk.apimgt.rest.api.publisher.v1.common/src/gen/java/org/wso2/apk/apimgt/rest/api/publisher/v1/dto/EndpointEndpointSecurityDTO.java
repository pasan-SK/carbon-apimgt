package org.wso2.apk.apimgt.rest.api.publisher.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class EndpointEndpointSecurityDTO   {
  
    private Boolean enabled = null;
    private String type = null;
    private String username = null;
    private String password = null;

  /**
   **/
  public EndpointEndpointSecurityDTO enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("enabled")
  public Boolean isEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public EndpointEndpointSecurityDTO type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "basic", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public EndpointEndpointSecurityDTO username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "basic", value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  public EndpointEndpointSecurityDTO password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(example = "basic", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointEndpointSecurityDTO endpointEndpointSecurity = (EndpointEndpointSecurityDTO) o;
    return Objects.equals(enabled, endpointEndpointSecurity.enabled) &&
        Objects.equals(type, endpointEndpointSecurity.type) &&
        Objects.equals(username, endpointEndpointSecurity.username) &&
        Objects.equals(password, endpointEndpointSecurity.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, type, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointEndpointSecurityDTO {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
