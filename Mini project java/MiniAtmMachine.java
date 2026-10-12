
import java.util.Scanner;

public class MiniAtmMachine {
    static double balance = 10000;
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    
        System.out.print("Enter your balance:");
        int balance = sc.nextInt();
        System.out.println("-----------Welcome To Atm-----------");
        int choice;
        do {
            System.out.println(".............ATM.............."); 
            System.out.println("1.Current balance:");
            System.out.println("2. deposited money:");
            System.out.println("3. withdraw Money :");
           System.out.println("4. exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            // using switch case statement
            switch (choice) {
                case 1 :
                    currentBalance();
                    break;
                case 2 :
                    depositedMoney();
                    break;
                case 3 :
                    withdrawMoney();
                    break;
                 case 4 :
                    System.out.println("THANK YOU FOR VISITED ATM");
                    break;
                default:
                    System.out.println("invalid input"); 
            }

            
        } while (choice!=4);

    }
    public static void currentBalance(){
        System.out.println("Your current balance :" +balance);

    }
    public static void depositedMoney(){
        System.out.println("Enter your amount you want to deposited:");
        double amount = sc.nextInt();
        balance = balance+ amount;
        System.out.println("Successfull deposited and your balance " +balance);

    }
    public static void withdrawMoney(){
        System.out.println("Enter your amount you want to withdraw:");
        double amount = sc.nextInt();
        balance = balance - amount;
         System.out.println("Collect your amount");
         System.out.println("Now your current balance :" +balance);
         System.out.println("Thank you for using ATM");   
    }

}
