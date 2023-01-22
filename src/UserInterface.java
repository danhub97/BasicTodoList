import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList toDoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.toDoList = todoList;
    }

    public void start(){
        while(true){
            String command;
            System.out.print("Command: ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                toDoList.add(task);
            }
            if (command.equalsIgnoreCase("list")){
                toDoList.print();
            }
            if (command.equalsIgnoreCase("remove")){
                System.out.print("Which one is removed? ");
                int removedTask = Integer.valueOf(scanner.nextLine());
                toDoList.remove(removedTask);
            }

            //Stop program
            if (command.equalsIgnoreCase("stop")){
                break;
            }


        }
    }
}
