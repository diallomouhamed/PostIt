import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String [] args) {
        launch();
    }

    public static void launch() {
        ArrayList<PostIt> todoList = new ArrayList<>();
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        String input = null;
        
        while(!quit) {
            System.out.println(
                  "\nWhat do you want to do ? (Enter a number of the following actions)\n"
                + "1/ List my tasks\n"
                + "2/ Add task\n"
                + "3/ Mark done and delete a task\n"
                + "4/ Quit\n"
                );

            input = scanner.nextLine();
            input = input.trim();

            switch(input) {
                case "1":
                    listTodoList(todoList);
                    break;

                case "2":
                    todoList = addTask(todoList);
                    break;

                case "3":
                    todoList = deleteTask(todoList);
                    break;

                case "4":
                    quit = true;
                    break;
                    
                default:
                    System.out.println("\nWrong entry !");
                    break;
            }
        }
        scanner.close();
        System.out.println("\nGood bye !\n");
    }

    private static void listTodoList(ArrayList<PostIt> todoList) {
        for(PostIt postIt : todoList) {
            System.out.println(postIt.toString() + "\n");
        }
    }

    private static ArrayList<PostIt> addTask(ArrayList<PostIt> todoList) {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        String input = null;

        while(!quit) {
            System.out.println("\nEnter task name:\n");
            input = scanner.nextLine();
            input = input.trim();

            if(!input.isEmpty()) {
                todoList.add(new PostIt(input));
                quit = true;
            }
        }

        scanner.close();
        return todoList;
    }

    private static ArrayList<PostIt> deleteTask(ArrayList<PostIt> todoList) {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        String input = null;

        while(!quit) {
            System.out.println("\nEnter task's number to mark sone and delete:\n");
            
            int todoListLength = todoList.size();

            for(int i = 0; i < todoListLength; i++) {
                System.out.println(i + "/" + todoList.get(i).toString() + "\n");
            }

            input = scanner.nextLine();
            input = input.trim();
            int inputInt = -1;

            try {
                inputInt = Integer.parseInt(input);
            } catch(Exception e) {}

            if(!input.isEmpty() && inputInt > 0 && inputInt <= todoListLength) {
                todoList.remove(inputInt);
                quit = true;
            } else {
                System.out.println("\nWrong entry !");
            }
        }

        scanner.close();
        return todoList;
    }
}