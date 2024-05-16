package list.sort.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumber {

    private List<Integer> numbersList;

    SortNumber() {
        this.numbersList = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        this.numbersList.add(number);
    }

    public List<Integer> ascendingSort()  {
        List<Integer> sorted = new ArrayList<Integer>(numbersList);    
        Collections.sort(sorted);
        return sorted;
    } 

    public List<Integer> descendingSort()  {
        List<Integer> sorted = new ArrayList<Integer>(numbersList);
        sorted.sort(Collections.reverseOrder());
        return sorted;
    } 
}
