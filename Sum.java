
import java.util.Scanner;


public class sum {
    public static void main(String[] args) {
        int n,m;
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number:");
        n= input.nextInt();
        System.out.print("Enter End number:");
        m= input.nextInt();
        
        for(int i=n;i<=m;i++){
            if(i%2==0){
                sum=sum+i;
                System.out.println("  " +i);
            }
            
        }
        
        System.out.println("Sum of all Even number is:" + sum);
        
    }
    
}
