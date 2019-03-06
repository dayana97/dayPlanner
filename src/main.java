import DayPlaner.Event;
import DayPlaner.Year;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
         boolean shouldRun = true;
        Scanner scanner = new Scanner(System.in);

        try {
    while (shouldRun){
        printMenu();
        System.out.println("What would you like to do");
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("case 1");
            break;

            case 10:
                shouldRun = false;
                break;
        }




    }
            Year year2019 = new Year(2019);

//        year2019.getDayFromAMonth(2,10);


            Event event = new Event("","","");
            System.out.println(event.getDateAndTimeOfCreation());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    static void printMenu(){
        System.out.println(1+" " + "Get All Events");
    }
}
