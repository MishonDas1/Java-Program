

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = input.nextInt();

        int output = petersen(num);

        if (num == output) {
            System.out.println(num + " is a Petersen number");
        } else {
            System.out.println(num + " is not a Petersen number");
        }
    }

    public static int factorial(int r) {
        int fact = 1;
        for (int i = 1; i <= r; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int petersen(int n) {
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum;
    }
}
