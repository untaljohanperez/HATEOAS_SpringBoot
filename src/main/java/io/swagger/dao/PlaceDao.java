package io.swagger.dao;

import java.util.ArrayList;
import java.util.List;

import io.swagger.model.Place;

public class PlaceDao {
	
	public static List<Place> getPlaces() {
		List<Place> places = new ArrayList<>();
        places.add(new Place("99", "Plaza Mayor", "Medellin", "Cra 80"));
        places.add(new Place("100", "UdeA", "Medellin", "Cra 33"));
		return places;
	}
	
	public static Place getPlace(String id) {
		return new Place(id, "Dummy Place", "City", "Adress");
	}


}
