package set.basic.guests;

public class App {
    public static void main(String[] args) {
        
        GuestSet guestSet = new GuestSet();

        guestSet.addGuest("Joao", "1");
        guestSet.addGuest("Pedro", "2");
        guestSet.addGuest("Maria", "3");
        guestSet.addGuest("Lucas", "4");
        guestSet.addGuest("Pablo", "5");
        guestSet.addGuest("Joao", "6");

        guestSet.showGuests();
        System.out.println(guestSet.getAllGuestsNumber());

        guestSet.removeGuest("6");
        System.out.println(guestSet.getAllGuestsNumber());
        guestSet.showGuests();
        
        guestSet.addGuest("Joao", "6");
        guestSet.addGuest("Joao", "6");
        System.out.println(guestSet.getAllGuestsNumber());
        guestSet.showGuests();
    }
}
