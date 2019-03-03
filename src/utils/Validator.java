package utils;

import domain.Event;

public class Validator {

    public static void validateEvent(Event event) throws Exception{

        if(event.getDayOfMonth() > 31 || event.getDayOfMonth() < 1) {
            throw new Exception("Invalid day of the month");
        }

        if(event.getHourOfDay() > 12 || event.getHourOfDay() < 0) {
            throw new Exception("Invalid hour");
        }

        if(event.getSubject().length() > 300) {
            throw new Exception("Size of message too big");
        }
    }
}
