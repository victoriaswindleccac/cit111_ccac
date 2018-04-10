package Project;

import java.util.Scanner;

/**
 *
 * @author victoriaswindle
 */
public class tabulator {
    private static int WingsOrder = 0;
    private static int FriesOrder = 0;
 
    
    private static int wingTotal = 0;
    private static int friesTotal = 0;
    
    private final static double wingPrice = .50;
    private final static double friesPrice = 7.09;
    private final static double tax = 0.06;
    
public static void main(String args[]) {
  
    System.out.println(" Welcome To Tabulator!");
    menu();
    int userOp;
    Scanner scanner = new Scanner(System.in);
    
    //switch options
    do {
    userOp = scanner.nextInt();
        
        switch (userOp) {
            
            case 1: 
                placeOrder();
                break;
            case 2:
                checkout();
                break;
            case 3:
                break;
        }
    } while(userOp < 3);
} 
    
//method for wings
public static void wing() {
    
    System.out.println("Enter the nubmer of Wings to order");
    
    Scanner scanner = new Scanner(System.in);
    WingsOrder = scanner.nextInt(); 
    
    System.out.println("Order Placed!");
    System.out.println("To place another order press the corresponding letter in");
    System.out.println(" w Wing");
    System.out.println(" f Fries");
    System.out.println(" d Done");
} 
    
//method for fries
public static void fries() {
    System.out.println("Enter the nubmer of orders you want of fries"); 
    Scanner scanner = new Scanner(System.in);
    FriesOrder = scanner.nextInt();
    
    System.out.println("Order Placed!");
    System.out.println("To place another order press the letter");
    System.out.println(" w  Wing");
    System.out.println(" f Fries");
    System.out.println(" d Done");
}
//display menu
public static void menu() {
    System.out.println("Select a number");
    System.out.println("1: Place Order");
    System.out.println("2: Checkout");
    System.out.println("3: Exit");
} //close menu

//method allows user to place an order
public static void placeOrder() {
    System.out.println("To place order press the letter");
    System.out.println(" w Wing");
    System.out.println(" f Fries");
    System.out.println(" d Done");
    
    Scanner scanner = new Scanner(System.in);
    int userOp = 0;
    String userInput;
    
    //switch 
    do {
        userInput = scanner.next();
        
        switch(userInput) {
            case "w": 
                wing();
                break;  
            case "f":
                fries();
                break;
            case "d":
                userOp = 1;
                menu();
                break;  
        } 
    } while(userOp < 1);
} 

//method displays receipt
public static void checkout() {
    System.out.println("Receipt");
    if(WingsOrder >= 1) {
        wingTotal = (int) (WingsOrder * wingPrice);
        System.out.println("Wings: $" + wingTotal);
    }
       
    if(FriesOrder >= 1) {
        friesTotal = (int) (FriesOrder * friesPrice);
        System.out.println("Fries: $" + friesTotal);
    }
    //calculates everything
    
    double grandTotal = wingTotal + friesTotal;
    System.out.println("Total: $" + grandTotal);
    double orderTax = tax * grandTotal;
    System.out.println("Tax: $" + orderTax);
    grandTotal = grandTotal + orderTax;
    System.out.println("Grand Total: $" + grandTotal);
    System.out.println(" d Done");
}
}
