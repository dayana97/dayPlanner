package DayPlaner;

import java.util.HashMap;

public class Month {
    private HashMap<Integer, Day> daysOfTheMonth;

    public Month(HashMap<Integer, Day> daysOfTheMonth) {
        this.daysOfTheMonth = daysOfTheMonth;
    }

    public HashMap<Integer, Day> getDaysOfTheMonth() {
        return daysOfTheMonth;
    }

    public void setDaysOfTheMonth(HashMap<Integer, Day> daysOfTheMonth) {
        this.daysOfTheMonth = daysOfTheMonth;
    }
}
