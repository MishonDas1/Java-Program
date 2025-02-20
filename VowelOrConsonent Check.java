
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'A') {
            System.out.println("This is a vowel");
        } else if (ch == 'e' || ch == 'E') {
            System.out.println("This is a vowel");
        } else if (ch == 'i' || ch == 'I') {
            System.out.println("This is a vowel");
        } else if (ch == 'o' || ch == 'O') {
            System.out.println("This is a vowel");
        } else if (ch == 'u' || ch == 'U') {
            System.out.println("This is a vowel");
        } else {
            System.out.println("This is a consonant");
        }

       
    }
}
