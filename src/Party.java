import java.awt.*;
import java.util.ArrayList;

public class Party {
    private String location, name;
    ArrayList<Person> personList = new ArrayList<Person>();

    public Party(String location, String name) {
        this.location = location;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPerson(Person person) {
        if (person.isAttendingParty) {
            System.out.println(person.name + " is already at the " + this.name + " party.");
        } else {
            person.isAttendingParty = true;
            personList.add(person);
            System.out.println(person.name+" entered the "+ this.name+" party and added to the list.");
        }
    }

    public void leave(Person person){
        if(this.personList.contains(person)){
            personList.remove(person);
            System.out.println(person.name+" left "+this.name+" party and removed from the list.");
        }else{
            System.out.println(person.name+" is not in "+this.name+" party right now.");
        }
    }

    public int attendeesCount(Party party){
        System.out.println(party.name+" party has a total of "+ party.personList.size()+" persons.");
        return party.personList.size();
    }

    public void listAttendees(Party party){
        System.out.println("\n Attendees list: \n");
        for (Person person: party.personList){
            System.out.println(" * "+person.toString()+"\n");
        }
    }
}
