import java.util.ArrayList;
import java.util.Arrays;

public class EventManagement implements EventManagementInterface {

    ArrayList<Event> events = new ArrayList<>();


    public void addEvent(Event event) {
        this.events.add(event);
    }
    //will list all events


    // prints all events
    public void display() {
        System.out.println(Arrays.toString(events.toArray()));
    }

    public void display1(int x) {
        int y = 0;
        for (Event event : events) {
            if (event.getEventId() == x) {
                y = x - 1;
                break;
            }
        }
        System.out.println(events.get(y).toString());
    }

    public void changeParameters(int x, String y, String a) {
        int z = 0;
        for (Event event : events) {
            if (event.getEventId() == x) {
                z = x - 1;
                break;

            }
        }

        if (y.equalsIgnoreCase("DATE")) {
            events.get(z).setDate(a);

        } else {
            events.get(z).setEventTitle(a);
        }

        System.out.println("New Event Details: " + events.get(z).toString());
    }

    public void deleteEvent(int x) {
        int y = 0;
        for (Event event : events) {
            if (event.getEventId() == x) {
                y = x - 1;
                break;
            }
        }
        System.out.println("Events before Amendment");
        display();
        events.remove(y);
        System.out.println("Events after Amendment");
        display();
    }

    public void listAttendee(int x) {
        int y = 0;
        for (Event event : events) {
            if (event.getEventId() == x) {
                y = x - 1;
                break;
            }
        }
        System.out.println(events.get(y).display());
    }

    public void addAttendee(int x, String a, String b, int c) {
        Attendee attendee = new Attendee(a, b, c);
        int y = 0;
        for (Event event : events) {
            if (event.getEventId() == x) {
                y = x - 1;
                events.get(y).addAttendee(attendee);
                break;
            }
        }
        System.out.println("Updated List of Attendees");
        System.out.println(events.get(y).display());
    }

    public void deleteAttendee(int x, int a) {
        int y = 0;
        for (Event event : events) {
            if (event.getEventId() == x) {
                y = x;
                break;
            }
        }
        events.get(y).deleteAttendee(a);
        System.out.println(events.get(y).display());

    }
}



