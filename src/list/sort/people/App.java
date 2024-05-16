package list.sort.people;

public class App {
    
    public static void main(String[] args) {
        
        SortPeople peopleList = new SortPeople();

        peopleList.addPerson("João", 22, 1.80);
        peopleList.addPerson("Luana", 26, 1.68);
        peopleList.addPerson("Maria", 35, 1.72);
        peopleList.addPerson("Gustavo", 19, 1.76);

        System.out.println(peopleList.sortByAge());

        System.out.println(peopleList.sortByHeight());
    }
}
