import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter the number of copies to be printed");
    int noOfCopies = myObj.nextInt();
    
    if (noOfCopies > 0 && noOfCopies < 100) {
        double pricePerCopy = 0.30;
        System.out.println("Price per copy: $" + pricePerCopy);
        double totalCost = noOfCopies * pricePerCopy;
        System.out.println("Total cost is: $" + totalCost);
    } else if (noOfCopies >= 100 && noOfCopies < 500) {
        double pricePerCopy = 0.28;
        System.out.println("Price per copy: $" + pricePerCopy);
        double totalCost = noOfCopies * pricePerCopy;
        System.out.println("Total cost is: $" + totalCost);
    } else if (noOfCopies >= 500 && noOfCopies < 800) {
        double pricePerCopy = 0.27;
        System.out.println("Price per copy: $" + pricePerCopy);
        double totalCost = noOfCopies * pricePerCopy;
        System.out.println("Total cost is: $" + totalCost);
    } else if (noOfCopies >= 800 && noOfCopies < 1000) {
        double pricePerCopy = 0.26;
        System.out.println("Price per copy: $" + pricePerCopy);
        double totalCost = noOfCopies * pricePerCopy;
        System.out.println("Total cost is: $" + totalCost);
    } else {
        double pricePerCopy = 0.25;
        System.out.println("Price per copy: $" + pricePerCopy);
        double totalCost = noOfCopies * pricePerCopy;
        System.out.println("Total cost is: $" + totalCost);
    }
  }
}
