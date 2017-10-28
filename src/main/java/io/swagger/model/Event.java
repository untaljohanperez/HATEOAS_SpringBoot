package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:34:26.819Z")

public class Event extends ResourceSupport  {
  @JsonProperty("idEvento")
  private String idEvent = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("places")
  private List<Place> places = new ArrayList<Place>();
  
  public Event(String idEvent, String name, String type, List<Place> places) {
	this.idEvent = idEvent;
	this.name = name;
	this.type = type;
	this.places = places;
}

public Event id(String id) {
    this.idEvent = id;
    return this;
  }

  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  public String getIdEvent() {
    return idEvent;
  }

  public void setIdEvent(String id) {
    this.idEvent = id;
  }

  public Event name(String name) {
    this.name = name;
    return this;
  }

  @ApiModelProperty(example = "Tomorrowland", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Event type(String type) {
    this.type = type;
    return this;
  }


  @ApiModelProperty(example = "Concert", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Event places(List<Place> places) {
    this.places = places;
    return this;
  }

  public Event addPlacesItem(Place placesItem) {
    this.places.add(placesItem);
    return this;
  }

  @ApiModelProperty(required = true, value = "")
  public List<Place> getPlaces() {
    return places;
  }

  public void setPlaces(List<Place> places) {
    this.places = places;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.idEvent, event.idEvent) &&
        Objects.equals(this.name, event.name) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.places, event.places);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEvent, name, type, places);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    idConcierto: ").append(toIndentedString(idEvent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
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

