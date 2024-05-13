package todolist;

import java.util.ArrayList;

public class ToDoList {
    
    private ArrayList<Task> items = new ArrayList<>();

    public void addTask(String description) {
        items.add(new Task(description));
    }

    public void deleteTask(String description) {
        for(Task t : items) 
            if(t.description == description)
                items.remove(t);
    }

    public int getTotalTaskNumber() {
        return items.size();
    }

    public void getAllTaskDescription() {
        for(Task t : items)
            System.out.println(t.description);
        System.out.println("------------------");
    }
}
