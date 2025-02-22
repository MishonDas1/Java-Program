
import java.util.Scanner;


public class SumInSeries{
    public static void main(String[] args) {
        int n,sum=0;
        
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Last Number:");
        n=input.nextInt();
        
        for(int i=1;i<= n;i=i+1){
            
            sum=sum+i;
        }
        System.out.println("Sum of all number is:" + sum);
        
    }
    
}
