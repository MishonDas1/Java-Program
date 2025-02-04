class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter the number of copies to be printed");
    int noOfCopies = myObj.nextInt();
    
    double pricePerCopy;
    
    if (noOfCopies > 0 && noOfCopies < 100) {
        pricePerCopy = 0.30;
    } else if (noOfCopies >= 100 && noOfCopies < 500) {
        pricePerCopy = 0.28;
    } else if (noOfCopies >= 500 && noOfCopies < 800) {
        pricePerCopy = 0.27;
    } else if (noOfCopies >= 800 && noOfCopies < 1000) {
        pricePerCopy = 0.26;
    } else {
        pricePerCopy = 0.25;
    }
    
    System.out.println("Price per copy: $" + pricePerCopy);
    double totalCost = noOfCopies * pricePerCopy;
    System.out.println("Total cost is: $" + totalCost);
  }
}
