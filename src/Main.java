public class Main {
    public static void main(String[] args) {

        Party graduation = new Party("Amsterdam", "Graduation");

        Person sam = new Person("Sam", "Beer", 36, true);
        graduation.addPerson(sam);
        graduation.addPerson(new Person("Karol", "White wine", 30, false));
        graduation.addPerson(new Person("Kristel", "Rose wine", 28, false));
        graduation.addPerson(new Person("Roland", "Beer", 29, false));
        Person reymond = new Person("Reymond", "Red wine", 39, true);
        graduation.addPerson(new Person("Koen", "Milk", 26, false));

        graduation.leave(reymond);
        graduation.listAttendees(graduation);
        graduation.attendeesCount(graduation);
    }
}
