import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 5000;
        int withdraw, deposit;
        
        while (true) {
            System.out.println("Welcome to Arnab Bank ATM :");
            System.out.println("Press 1 to Withdraw:");
            System.out.println("Press 2 to Deposit balance:");
            System.out.println("Press 3 to Check balance:");
            System.out.println("Press 4 to Exit:");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Your new balance is: " + balance);
                    } 
                    else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println(" Your new balance is: " + balance);
                    break;
                    
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                    
                case 4:
                    System.out.println("Thank you!!");
                    System.exit(0);
                    
                default:
                System.out.println("Invalid choice");
            }
        }
    }
}
