package set.basic.guests;

import java.util.Objects;

public class Guest {
    
    private String name;
    private String token;

    public Guest(String name, String token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Guest guest)) return false;
        return this.getToken() == guest.getToken();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getToken());
    }

    @Override
    public String toString() {
        return "[name=" + name + ", token=" + token + "]";
    }

}
