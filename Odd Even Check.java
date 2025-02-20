
package com.mycompany.basicjava1;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        int num;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a Number:");
        num=input.nextInt();
        
        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.print("The number is Odd");
        }
    }
    
}
