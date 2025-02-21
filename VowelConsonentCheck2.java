import java.util.Scanner;

public class VowelConsonantCheck2 {
    public static void main(String[] args) {
        char c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        c = input.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("This is a vowel");
        } else {
            System.out.println("This is a consonant.");
        }
    }
}
