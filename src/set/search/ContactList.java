package set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactList {

    private Set<Contact> contacts;
    
    ContactList() {
        this.contacts = new HashSet<Contact>();
    }

    public void addContact(String name, int number) {
        this.contacts.add(new Contact(name, number));
    }

    public void showAllContacts() {
        for(Contact c : contacts)
            System.out.println(c.toString());
    }

    public Set<Contact> findByName(String name) {
        Set<Contact> contacts = new HashSet<Contact>();
        for(Contact c : contacts)
            if(c.getName().startsWith(name)) {
                contacts.add(c);
            }       
        return contacts;         
    }

    public Contact updateContactNumber(String name, int number) {
        Contact contact = null;
        for(Contact c : contacts)
            if(c.getName() == name) {
                contact = c;
                contact.setNumber(number);
                break;
            }     
        return contact; 
    }
}

