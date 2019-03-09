package DayPlaner;

import Builders.MonthBuilder;

import java.util.HashMap;

public class Year {
    private int year;
    private MonthBuilder monthBuilder = new MonthBuilder();
    private HashMap<Integer, Month> monthsInAYear;


    public Year(int year) {
        this.year = year;
    }

    public HashMap<Integer, Month> getMonthsInAYear() {
        return monthsInAYear;
    }

    public void setMonthsInAYear(HashMap<Integer, Month> monthsInAYear) {
        this.monthsInAYear = monthsInAYear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private void createYear(){

        monthsInAYear.put(1,monthBuilder.daysInA_Month(31).build());
        monthsInAYear.put(2,monthBuilder.daysInA_Month(28).build());
        monthsInAYear.put(3,monthBuilder.daysInA_Month(31).build());
        monthsInAYear.put(4,monthBuilder.daysInA_Month(30).build());
        monthsInAYear.put(5,monthBuilder.daysInA_Month(31).build());
        monthsInAYear.put(6,monthBuilder.daysInA_Month(30).build());
        monthsInAYear.put(7,monthBuilder.daysInA_Month(31).build());
        monthsInAYear.put(8,monthBuilder.daysInA_Month(31).build());
        monthsInAYear.put(9,monthBuilder.daysInA_Month(30).build());
        monthsInAYear.put(10,monthBuilder.daysInA_Month(31).build());
        monthsInAYear.put(11,monthBuilder.daysInA_Month(30).build());
        monthsInAYear.put(12,monthBuilder.daysInA_Month(31).build());
    }

    public Month getMonth(int monthIndex){
        return this.getMonthsInAYear().get(monthIndex);
    }

    public Day getDayFromAMonth(int monthIndex,int dayIndex){
        return this.getMonthsInAYear().get(monthIndex).getDaysOfTheMonth().get(dayIndex);

    }


}
