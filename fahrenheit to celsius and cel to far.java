
package com.mycompany.basicjava1;

import java.util.Scanner;


public class Temparature2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double cel,far,far1,farV;
        System.out.print("Enter The Celcius:");
        
        cel =input.nextDouble();
        far = 1.8*cel + 32;
        
        System.out.print("cel to Farneight value is:" + far );
        
        System.out.println("");
        
        System.out.print("Enter the Farn value:");
        far1=input.nextDouble();
        farV=0.56*(far1-32);
        System.out.print("Farn to celcius value is : "+ farV);
        
        
        
        
    }
    
}
