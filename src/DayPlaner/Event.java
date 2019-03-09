package DayPlaner;

import java.security.SecureRandom;
import java.util.Calendar;

public class Event {
    private String eventTitle;
    private String dateAndTimeOfCreation;
    private String Durations;
    private String Description;
    private String uniqueID; // unique id will be handled by frontend no need to be human readable
    private java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+2");
    private java.util.Calendar c = java.util.Calendar.getInstance(tz);

    private volatile SecureRandom numberGenerator = null;
    private final long MSB = 0x8000000000000000L;


    public Event(String eventTitle, String durations, String description) {
        this.eventTitle = eventTitle;
        Description = description;
        this.dateAndTimeOfCreation = getCurrentTime();
        Durations = durations;
        uniqueID = unique();
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getDateAndTimeOfCreation() {
        return dateAndTimeOfCreation;
    }

    public void setDateAndTimeOfCreation(String dateAndTimeOfCreation) {
        this.dateAndTimeOfCreation = dateAndTimeOfCreation;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDurations() {
        return Durations;
    }

    public void setDurations(String durations) {
        Durations = durations;
    }
    public String getCurrentTime(){
        return c.get(Calendar.DATE)+":"+
                c.get(Calendar.MONTH)+":"+
                c.get(Calendar.YEAR)+" :: "+
                c.get(java.util.Calendar.HOUR_OF_DAY)+":"+
                c.get(java.util.Calendar.MINUTE)+":"+
                c.get(java.util.Calendar.SECOND);
    }
    public String unique() {
        SecureRandom ng = numberGenerator;
        if (ng == null) {
            numberGenerator = ng = new SecureRandom();
        }
        return Long.toHexString(MSB | ng.nextLong()) + Long.toHexString(MSB | ng.nextLong());
}
    public String getUniqueID() {
        return uniqueID;
    }
}