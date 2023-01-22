import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> listOfTasks;

    public TodoList() {
        this.listOfTasks = new ArrayList<>();
    }

    public void add(String task){
        listOfTasks.add(task);
    }

    public void print(){
        for(int i = 0; i < listOfTasks.size(); i++){
            System.out.println(i+1 +": " + listOfTasks.get(i));
        }
    }

    public void remove(int num){
        listOfTasks.remove(num-1);
    }


}
