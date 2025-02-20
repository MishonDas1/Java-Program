
package com.mycompany.basicjava1;

import java.util.Scanner;

public class VoterCheck {
    public static void main(String[] args) {
        System.out.println("Voter Age Checker");
        int age;
        int i =0;
        System.out.print("Enter your age:");
        Scanner input =new Scanner(System.in);
        age = input.nextInt();
        
        if(age<=17){
            System.out.println("This is not valid votter");
        }
        else {
            System.out.println("This is valid votter");
        }
    }
}
