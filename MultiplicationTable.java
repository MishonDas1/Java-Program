
package com.mycompany.mishon;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        int m;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number:");
        m= input.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(m + " X "+ i+  " =" +m*i);
        }
    }
    
}
