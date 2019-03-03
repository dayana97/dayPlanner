package domain;

public class Event {
    private int id;
    private String dayOfMonth;
    private String hourOfDay;
    private String subject;

    public Event(String dayOfMonth, String hourOfDay, String subject){
        this.dayOfMonth = dayOfMonth;
        this.hourOfDay = hourOfDay;
        this.subject = subject;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(String hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", dayOfMonth='" + dayOfMonth + '\'' +
                ", hourOfDay='" + hourOfDay + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
