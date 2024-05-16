package list.sort.people;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPeople {
    
    private List<Person> peopleList;

    SortPeople() {
        this.peopleList = new ArrayList<Person>();
    }

    public void addPerson(String name, int age, double height) {
        this.peopleList.add(new Person(name, age, height)); 
    }

    // using Comparable
    public List<Person> sortByAge() {
        List sorted = new ArrayList<Person>(peopleList);
        Collections.sort(sorted);
        return sorted;
    }

    //using Comparator
    public List<Person> sortByHeight() {
        List sorted = new ArrayList<Person>(peopleList);
        Collections.sort(sorted, new ComparatorByHeight());
        return sorted;
    }
}
