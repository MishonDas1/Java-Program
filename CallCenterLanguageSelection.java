import java.util.Scanner;


public class CallCenter {
    public static void main(String[] args) {
        System.out.println("Wellcome to Call Center");
        int number;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Number:");
        
        number=input.nextInt();
        
        switch(number){
        
        case 1:
        System.out.println(" Selected language is Bengali");
        break;
         case 2:
        System.out.println(" Selected language is Hindi");
        break;
         case 3:
        System.out.println(" Selected language is Urdu");
        break;
         default:
        System.out.println(" Selected language is English");
       
        
    }
        
        
    }
    
}
