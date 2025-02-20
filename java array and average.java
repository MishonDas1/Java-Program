import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
         int sum =0;
        int len = array.length;
       
        for (int i = 0; i < len; i++) {
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " | ");
        }
        
        
        
        for (int a:array){
            System.out.println(a);
        }
        
        
        
         for (int i = 0; i < len; i++) {
            
            sum += array[i];
        }

        double average = (double) sum / len;
        System.out.println("The average value is: " + average);
        
        
        
    
    }
}
