
package com.mycompany.basicjava1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1,num2,sum,sub,multiple,division,modulus;
        System.out.println("Enter The first Number:");
        num1=input.nextInt();
        
        System.out.println("Enter the second Number:");
        num2 = input.nextInt();
        
        sum=num1+num2;
        sub=num1-num2;
        multiple = num1*num2;
        division = num1/num2;
        modulus=num1%num2;
        
        System.out.println("Sum of two number is:"+ sum);
        System.out.println("Sub of two number is:"+ sub);
        System.out.println("Multiple of two number is:"+ multiple);
        System.out.println("DIvision of two number is:"+ division);
        System.out.println("Modulus of two number is:"+ modulus);
       
    }
    
}
