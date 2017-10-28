package io.swagger.api;

import java.util.List;

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
import io.swagger.model.Event;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:34:26.819Z")

@Api(value = "event", description = "the event API")
public interface EventApi {

    @ApiOperation(value = "adds an event", notes = "Adds an event to the system", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created", response = Void.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid", response = Void.class),
        @ApiResponse(code = 409, message = "an existing item already exists", response = Void.class),
        @ApiResponse(code = 500, message = "internal server error", response = Void.class) })
    @RequestMapping(value = "/event",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addEvent(@ApiParam(value = "Inventory item to add"  ) @RequestBody Event event);


    @ApiOperation(value = "searches events", notes = "get events", response = Event.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Event.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Event.class) })
    @RequestMapping(value = "/event",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Event>> getEvents();
    
  
    @ApiOperation(value = "searches events", notes = "get events", response = Event.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Event.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Event.class) })
    @RequestMapping(value = "/event/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Event> getEvent(@PathVariable(value = "id") String id);

}
