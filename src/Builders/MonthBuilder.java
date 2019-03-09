package Builders;

import DayPlaner.Day;
import DayPlaner.Month;

import java.util.HashMap;

public class MonthBuilder {

    private HashMap<Integer, Day> localHashMap;

    public MonthBuilder daysInA_Month(int daysAmount){
        HashMap<Integer, Day> daysOfTheMonth = new HashMap<>();

        for (int i = 1; i <= daysAmount ; i++) {
            daysOfTheMonth.put(i,new Day());
        }

        this.localHashMap = daysOfTheMonth;

        return  this;
    }

    public Month build(){
        return new Month(this.localHashMap);
    }


}
