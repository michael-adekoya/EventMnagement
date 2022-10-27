public class Attendee implements EventManagementInterface {

    private final String firstName;
    private final String lastName;
    private final int number;


    public Attendee(String firstName, String lastName, int number){
        this.firstName=firstName;
        this.lastName=lastName;
        this.number= number;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return ("\nFirst Name: " +getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nMobile Number: " + getNumber());
    }
}
