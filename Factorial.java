import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of this number is: " + factorial);
    }
}
