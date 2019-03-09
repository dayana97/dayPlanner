package DayPlaner;

import java.util.ArrayList;

public class Day {
    private ArrayList<Event> events;

    public Day() {
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void printAllEvents(){
        for (Event event :
                events) {
            System.out.println(event.getEventTitle() + " " + event.getDurations() + " " + event.getDateAndTimeOfCreation() + " " + event.getUniqueID());
        }
    }
    public void addEvent(String eventTitle, String durations, String description){
        events.add(new Event(eventTitle,durations,description));
    }
    public boolean removeEvent(String uniqueID){
        for (Event event :
                events) {
            if (event.getUniqueID().equals(uniqueID)){
                events.remove(event);
                return true;
            }
        }
        return false; // throw exception
    }
    //TODO: add modify event
    public boolean printFullEventInforation(String uniqueID){
        for (Event event :
                events) {
            if (event.getUniqueID().equals(uniqueID)){
                System.out.println(event.getEventTitle() + " " + event.getDurations() + " " + event.getDateAndTimeOfCreation() + " " + event.getUniqueID());
                System.out.println(event.getDescription() );

                return true;
            }
        }
        return false; // throw exception
    }
}
