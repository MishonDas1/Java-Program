package com.mycompany.basicjava1;

public class unaryOperator {
    public static void main(String[] args) {
        int x=20;
        int y;
        
        y=+x;
        System.out.println("first value is:" + y);
        
        y=-x;
        System.out.println("Second value is:" + y);
                
        
        System.out.println("Pre incremment"); 
        
        y=++x;
        System.out.println("First  value is:" + y);
        
        y=--x;
        System.out.println("Second value is  value is:" + y);
        
         System.out.println("Post incremment");
         y=x++;
         System.out.println("First  value is:" + y);
         y=x;
         System.out.println("Second value is  value is:" + y);
         
    }
    
}
