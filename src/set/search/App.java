package set.search;

public class App {
    public static void main(String[] args) {
        
        ContactList contacts = new ContactList();
        
        contacts.addContact("Joao", 1);
        contacts.addContact("Joao Pedro", 1);
        contacts.addContact("Joao Lucas", 1);
        contacts.addContact("Joao Marcos", 1);
        contacts.addContact("Maria", 2);
        contacts.addContact("Lucas", 3);
        contacts.addContact("Pedro", 4);
        contacts.addContact("Joao", 99);
        
        System.out.println(contacts.findByName("Joao"));

        contacts.showAllContacts();

        System.out.println(contacts.updateContactNumber("Pedro", 100));
    }
}
