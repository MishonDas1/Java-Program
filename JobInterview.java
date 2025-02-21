
import java.util.Scanner;


public class jobInterView {
    public static void main(String[] args) {
        char c,d;
        System.out.println("Wellcome to the Job Interview");
        System.out.println(" Have you completed your masters? y/n ");
        Scanner input =new Scanner(System.in);
        c=input.next().charAt(0);
        System.out.println(" Are you fulent in English? y/n ");
        d=input.next().charAt(0);
        
        if(c=='y' && d=='y'){
            System.out.println("You are eligible to for the job interview");
        }
        else{
            System.out.println("Sorry. you are not eligible to for the job interview");
        }
        
        
        
    }
    
}
