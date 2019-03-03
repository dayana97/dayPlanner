package ui;

import domain.Event;
import utils.Validator;

import java.util.ArrayList;
import java.util.List;


public class EventHandling {

    List<Event> eventsDB = new ArrayList<>();


    public void insertEvent(Event event) throws Exception{
        // insert event into the DB
        Validator.validateEvent(event);
        eventsDB.add(event);
    }

    public void editEvent(Event event) {
        // update single event
    }

    public Event findEvent(Event event) {
        // find single event from the DB
        return null;
    }

    public List<Event> findAllEvents() {

        return eventsDB;
    }

    public boolean deleteEvent(Event event) {
        // delete single event
        return false;
    }
}
