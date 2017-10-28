package io.swagger.api;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import java.util.List;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;
import io.swagger.dao.PlaceDao;
import io.swagger.model.Place;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:34:26.819Z")

@Controller
public class PlaceApiController implements PlaceApi {

    public ResponseEntity<Place> getPlace(@PathVariable(value = "id") String id) {
    	Place place = PlaceDao.getPlace(id);
    	addLink(place);
        return new ResponseEntity<Place>(place, HttpStatus.OK);
    }
    
    public ResponseEntity<Void> addPlace(@ApiParam(value = "Place to add"  ) @RequestBody Place event) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    public static void addLink(Place place) {
    	place.add(linkTo(ControllerLinkBuilder.methodOn(PlaceApiController.class).getPlace(place.getIdPlace())).withSelfRel());
	}

	public static void addLink(List<Place> places) {
		for (Place place : places) 
			addLink(place);
	}
}
