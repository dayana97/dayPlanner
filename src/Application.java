import domain.Event;
import ui.EventHandling;

import java.util.Scanner;

public class Application {

    private static EventHandling eventHandling = new EventHandling();

    public static void main(String[] args) {
        // print calendar in the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose day from the calendar");
        String day = scan.nextLine();

        System.out.println("Subject:");
        String subject = scan.nextLine();
        System.out.println("Time:");
        String hour = scan.nextLine();
        addEvent(day, subject, hour);

        readAllEvents();
    }

    private static void addEvent(String day, String subject, String hour){
        Event event = new Event(day, hour, subject);
        try{
            eventHandling.insertEvent(event);
        } catch (Exception e){
            System.out.println("Something happened! ");
            e.printStackTrace();
        }
    }

    private static void readAllEvents(){
        System.out.println(eventHandling.findAllEvents().toString());
    }
}
