package com.mycompany.basicjava1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("|ONE to NINE number to Word|");
        int num;
        
        System.out.print("Enter The Number: ");
        num = input.nextInt();
        
        if (num == 1) {
            System.out.println("This number spelling is: ONE");
        } else if (num == 2) {
            System.out.println("This number spelling is: TWO");
        } else if (num == 3) {
            System.out.println("This number spelling is: THREE");
        } else if (num == 4) {
            System.out.println("This number spelling is: FOUR");
        } else if (num == 5) {
            System.out.println("This number spelling is: FIVE");
        } else if (num == 6) {
            System.out.println("This number spelling is: SIX");
        } else if (num == 7) {
            System.out.println("This number spelling is: SEVEN");
        } else if (num == 8) {
            System.out.println("This number spelling is: EIGHT");
        } else if (num == 9) {
            System.out.println("This number spelling is: NINE");
        } else {
            System.out.println("Please input a valid number between 1 and 9");
        }
    }
}
