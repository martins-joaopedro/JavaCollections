package todolist;

public class App {
    public static void main(String[] args) {
        
        ToDoList todo = new ToDoList();

        todo.addTask("Lavar roupa");
        todo.addTask("Lavar sapato");
        todo.addTask("Limpar casa");
        todo.addTask("Passear com cachorro");

        todo.getAllTaskDescription();

        todo.deleteTask("Limpar casa");
        todo.getAllTaskDescription();
        System.out.println("Faltam " + todo.getTotalTaskNumber() + " tarefas para completar");
    }
}
