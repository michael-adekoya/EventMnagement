import java.util.ArrayList;
import java.util.Arrays;

public class Event implements EventManagementInterface{


    private final int eventId;
    private String eventTitle;
    private String date;
    ArrayList<Attendee> attendee = new ArrayList<>();


    public Event(int eventId,String eventTitle, String date){
            this.eventId=eventId;
            this.eventTitle=eventTitle;
            this.date=date;

    }

    public int getEventId(){return eventId;}

    public String getEventTitle(){return eventTitle;}
    public void setEventTitle(String d){this.eventTitle = d;}

    //change
    public String getDate(){return date;}
    public void setDate(String dd){this.date = dd;}

    public void addAttendee(Attendee attendee){
        this.attendee.add(attendee);
    }


    public String display(){
        return (Arrays.toString(attendee.toArray()));
    }
    public void deleteAttendee(int x) {

    }

    //will be used to list sigular/multiple events
    @Override
    public String toString() {
        return ("\nName of Event: " +getEventTitle() +
                "\nID of Event: " + getEventId() +
                "\nDate of Event: " + getDate());
    }

}
