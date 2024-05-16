package set.basic.guests;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    
    private Set<Guest> guestSet;

    GuestSet() {
        this.guestSet = new HashSet<Guest>();
    }

    public void addGuest(String name, String token) {
        this.guestSet.add(new Guest(name, token));
    }

    public void removeGuest(String token) {
        Guest toRemove = null;
        for(Guest g : guestSet)
            if(g.getToken() == token) {
                toRemove = g;
                break;
            }
        this.guestSet.remove(toRemove);
    }

    public void showGuests() {
        for(Guest g : guestSet) {
            System.out.println(g.toString());
        }
    }

    public int getAllGuestsNumber() {
        return this.guestSet.size();
    }
}
