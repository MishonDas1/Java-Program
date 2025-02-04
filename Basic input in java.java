
package com.mycompany.basicjava1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        String name;
        System.out.println("Enter your name:");
        name =input.next();
        
        System.out.println("Enter the Number:");
        number = input.nextInt();
        
       
       
       System.out.println("Wellcome "+ name);
       
       System.out.printf("The number is: %d",number);
    }
    
}
