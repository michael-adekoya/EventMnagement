import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();

    }


    private static void menu() {

        EventManagement e = new EventManagement();
        Event e1 = new Event(1,"Going Home", "08/12/2022");
        Event e2 = new Event(2,"Going abroad","15/11/2023");
        Event e3 = new Event(3,"Going on Holidays","13/02/2021");
        e.addEvent(e1);
        e.addEvent(e2);
        e.addEvent(e3);

        Attendee a1 = new Attendee("mike","james",545);
        Attendee a2 = new Attendee("ALex","Dare",458);
        e1.addAttendee(a1);
        e1.addAttendee(a2);


        Scanner input = new Scanner(System.in);
        String c1;
        int c2;
        String c3;
        String c4;
        int c5;

        System.out.println("""
                Choose an option:
                Enter [ 1 ] to list all events
                Enter [ 2 ] to list an individual event
                Enter [ 3 ] edit an event
                Enter [ 4 ] to delete an event
                Enter [ 5 ] list all the attendees attending an event
                Enter [ 6 ] to add an attendee to an event
                Enter [ 7 ] to delete an attendee from an event\s
                Enter [ 0 ] to EXIT program""");

        c1 = input.next();
        switch (c1.toUpperCase()) {

            case "1":
                System.out.println("Listing all events");
                e.display();
                newMenu();
                break;

            case "2":
                System.out.println("Enter ID of Event to list Details");
                c2= Integer.parseInt(input.next());
                e.display1(c2);
                newMenu();
                break;

            case "3":
                System.out.println("Enter ID of an event you wish to change details of");
                c2= Integer.parseInt(input.next());
                System.out.println("Enter 'Title' or 'Date'");
                c3= input.next();
                System.out.println("Enter new details");
                c4= input.next();
                newMenu();
                e.changeParameters(c2,c3,c4);

            case "4":
                System.out.println("Enter ID of event you wish to delete");
                c2= input.nextInt();
                e.deleteEvent(c2);
                newMenu();
                break;

            case "5":
                System.out.println("Enter ID of event to list attendees");
                c2= input.nextInt();
                newMenu();
                e.listAttendee(c2);



            case "6":
                System.out.println("Enter Id of event you wish to add attendee to");
                c2= input.nextInt();
                System.out.println("Enter Attendee First Name");
                c3= input.next();
                System.out.println("Enter Attendee Last Name");
                c4= input.next();
                System.out.println("Enter Attendee Number");
                c5= Integer.parseInt(input.next());
                e.addAttendee(c2,c3,c4,c5);
                newMenu();
                break;

            //this does not work properly yet
            case "7":
                System.out.println("Enter ID of event you wish to delete attendee from");
                c2=input.nextInt();
                e.listAttendee(c2);
                System.out.println("Enter Attendee Number you wish to delete");
                c5=input.nextInt();
                newMenu();
                e.deleteAttendee(c2,c5);


            case "0":
                System.out.println("End of Program");
                System.exit(0);



        }

    }

    public static void newMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("""
                \s
                Choose an option:\s
                Enter [ 1 ] to go back to menu
                Enter [ 2 ] to exit program""");

        String c1;
        c1 = input.next();

        switch (c1) {
            case "1" -> menu();
            case "2" -> {
                System.out.println("End of program");
                System.exit(0);
            }
        }
    }
    }

