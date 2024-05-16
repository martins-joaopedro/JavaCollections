package list.sort.people;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    
    private String name;
    private int age;
    private double height;
    
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.age, p.getAge());
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", height=" + height + "]";
    }
}
