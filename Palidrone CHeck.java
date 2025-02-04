

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str, letter = "y";
        int left, right;

        Scanner scanner = new Scanner(System.in);
        while (letter.equalsIgnoreCase("y")) {
            System.out.println("Enter a potential palindrome string:");
            str = scanner.nextLine();
            left = 0;
            right = str.length() - 1;
            while (left < right && str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            }
            System.out.println();
            if (left < right)
                System.out.println("This is not a palindrome");
            else
                System.out.println("This is a palindrome");
            System.out.println();

            System.out.println("Do you want to check another string? (y/n):");
            letter = scanner.nextLine();
        }
        
    }
}
