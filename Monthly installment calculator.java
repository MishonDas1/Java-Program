
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		
		Scanner input =new Scanner(System.in);
		double phonePrice,installmentPerMonth,numberOfInstallment;
		System.out.println("Enter The Phone Price in $:");
		phonePrice=input.nextDouble();
		System.out.println("Enter The number of Installment:");
		numberOfInstallment =input.nextDouble();
		
	    installmentPerMonth = phonePrice/numberOfInstallment;
	    
	    System.out.println("Monthly installment Ammount : "+ installmentPerMonth +"$");
		
		
	}
}
