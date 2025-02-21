
import java.util.Scanner;


public class FirstToLastSum {
    public static void main(String[] args) {
        int a,b,sum=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a staring value:");
        a= input.nextInt();
        System.out.print("Enter a Ending value:");
        b= input.nextInt();
        
        for(int i =a;i<=b;i++){
            if(i%2!=0){
              sum +=i;
            }
            
           
            
        }
                    System.out.println("Sum of all odd numbe is :"+ sum);

    }
    
}
