package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Place;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:34:26.819Z")

@Api(value = "place", description = "the place API")
public interface PlaceApi {

    @ApiOperation(value = "adds an place", notes = "Adds an place to the system", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 409, message = "an existing item already exists", response = Void.class),
        @ApiResponse(code = 500, message = "internal server error", response = Void.class) })
    @RequestMapping(value = "/place",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addPlace(@ApiParam(value = "Inventory item to add"  ) @RequestBody Place event);


    @ApiOperation(value = "searches place", notes = "get places", response = Place.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "all places", response = Place.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Place.class) })
    @RequestMapping(value = "/place/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Place> getPlace(@PathVariable(value = "id") String id);

}
