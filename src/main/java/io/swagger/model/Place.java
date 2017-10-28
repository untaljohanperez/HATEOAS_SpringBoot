package io.swagger.model;

import java.util.Objects;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Place
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:34:26.819Z")

public class Place extends ResourceSupport {
  @JsonProperty("idPlace")
  private String idPlace = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("address")
  private String address = null;
  
  public Place(String idPlace, String name, String city, String address) {
	this.idPlace = idPlace;
	this.name = name;
	this.city = city;
	this.address = address;
}

public Place idPlace(String idPlace) {
    this.idPlace = idPlace;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  public String getIdPlace() {
    return idPlace;
  }

  public void setIdPlace(String id) {
    this.idPlace = id;
  }

  public Place name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "ACME Corporation", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Place city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Place address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "408-867-5309", required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Place place = (Place) o;
    return Objects.equals(this.idPlace, place.idPlace) &&
        Objects.equals(this.name, place.name) &&
        Objects.equals(this.city, place.city) &&
        Objects.equals(this.address, place.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPlace, name, city, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Place {\n");
    
    sb.append("    id: ").append(toIndentedString(idPlace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

