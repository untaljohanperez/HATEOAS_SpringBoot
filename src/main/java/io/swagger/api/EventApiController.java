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
import io.swagger.dao.EventDao;
import io.swagger.model.Event;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:34:26.819Z")

@Controller
public class EventApiController implements EventApi {

    public ResponseEntity<List<Event>> getEvents() {
        List<Event> events = EventDao.getEvents();
        addLinksToEvents(events);
        return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
    }
    
    public ResponseEntity<Event> getEvent(@PathVariable(value = "id", required = false) String id) {
        Event event = EventDao.getEvent(id);
        addLink(event);
        return new ResponseEntity<Event>(event, HttpStatus.OK);
    }

	private void addLinksToEvents(List<Event> events) {
		for (Event event : events) 
			addLink(event);
	}

	private void addLink(Event event) {
		 event.add(linkTo(ControllerLinkBuilder.methodOn(EventApiController.class).getEvent(event.getIdEvent())).withSelfRel());
		 PlaceApiController.addLink(event.getPlaces());
	}
	
	public ResponseEntity<Void> addEvent(@ApiParam(value = "Event to add"  ) @RequestBody Event event) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
