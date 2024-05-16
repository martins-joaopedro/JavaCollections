package set.search;

import java.util.Objects;

public class Contact {

    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Contact contact)) return false;
        return this.getName() == contact.getName();    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", number=" + number + "]";
    }

}
