package DayPlaner;

import java.util.ArrayList;

public class Day {
    private ArrayList<Event> events;

    public Day() {
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
}
