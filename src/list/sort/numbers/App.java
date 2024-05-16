package list.sort.numbers;

public class App {
    public static void main(String[] args) {

        SortNumber numberList = new SortNumber();
        
        numberList.addNumber(1);
        numberList.addNumber(3);
        numberList.addNumber(2);
        numberList.addNumber(6);
        numberList.addNumber(10);

        System.out.println(numberList.ascendingSort());
        System.out.println(numberList.descendingSort());
    }
}
