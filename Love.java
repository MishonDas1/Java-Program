
import java.util.Scanner;


public class LoveJava {
    public static void main(String[] args) {
        char ch;
        System.out.print("DO You Love Me?");
        System.out.println("Write Y/N. Y=Yes ,N=NO");
        
        Scanner input =new Scanner(System.in);
        ch=input.next().charAt(0);
        
        if(ch=='Y' || ch=='y'){
            System.out.println("Thank YOu!!");
        }
        else if(ch=='N' || ch=='n'){
            System.out.println("So sad!!");
        }
        else{
            System.out.println("Invalid letter");
        }
        input.close();
        
        
    }
    
}
