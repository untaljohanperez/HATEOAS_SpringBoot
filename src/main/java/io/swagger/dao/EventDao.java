package io.swagger.dao;

import java.util.ArrayList;
import java.util.List;

import io.swagger.model.Event;

public class EventDao {
	
	public static List<Event> getEvents() {
		List<Event> events = new ArrayList<>();
        events.add(new Event("001", "Feria del las flores", "Feria", PlaceDao.getPlaces()));
        events.add(new Event("002", "CarrosSobreRuedas", "Exposicion", PlaceDao.getPlaces()));
		return events;
	}
	
	public static Event getEvent(String id) {
		return new Event(id, "Dummy Event", "Dummy", PlaceDao.getPlaces());
	}
}
