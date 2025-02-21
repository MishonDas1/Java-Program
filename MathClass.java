import java.util.Scanner;


public class MathClass {
    public static void main(String[] args) {
        System.out.print("Enter a First number:");
        Scanner input =new Scanner(System.in);
        int a,b;
        
        a=input.nextInt();
         System.out.print("Enter a second number:");
         b= input.nextInt();
         
         int max =Math.max(a, b);
         System.out.println("Maximum value is:" + max);
         
         int min =Math.min(a, b);
         System.out.println("Minimum value is:" + min);
         
         
         int abs =Math.abs(a);
         System.out.println("Absulate value of first number is:" + abs );
         
         
         
    }
    
}
