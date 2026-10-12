
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;
        // using do-while loop
        do { 
            System.out.println("----------TO DO LIST MENU----------");
            System.out.println("1. view task");
            System.out.println("2. Add task");
            System.out.println("3. Delete task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:(1-4):");
            choice = sc.nextInt();
            sc.nextLine();

         // using switch case statement  
            switch (choice) {
                case 1:
                    if(tasks.isEmpty()){
                        System.out.println("No task yet");
                    }
                    else{
                        for(int i=0; i<tasks.size();i++){
                            System.out.println((i+1)+ "." +tasks.get(i));
                        }
                    }
                     
                     break;
                case 2:
                    System.out.print("Enter the task:");
                    String t1 = sc.nextLine();
                    tasks.add(t1);
                    System.out.println(" task added");
                    break; 
                case 3:
                    if(tasks.isEmpty()){
                        System.out.println("no task is deleted");
                    }
                    else{
                        for(int i=0; i<tasks.size();i++){
                            System.out.println((i+1) +"." +tasks.get(i));
                            System.out.print("Enter the task number to delete:");
                            int index = sc.nextInt();
                            sc.nextLine();
                            if(index>0 && index<=tasks.size()){
                                String remeved = tasks.remove(index-1);
                                System.out.println("Deleted" +remeved);
                            }
                            else{
                                System.out.println("invalid task input");
                            }
                        }
                    }  
                    break;      
                case 4:
                    System.out.println("Good bye!");
                    break;
                    default:
                        System.out.println("invalid inputd");
            } 
            
        } while (choice!= 4);
        sc.close();
    }
}
