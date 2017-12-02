/**
   Store Project
   @author John Doe Period 1
*/

import java.util.Scanner;

public class StoreProject 
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);   // reads user input
      double quantity = 0;                         // quantity of item ordered                        
      double subtotal = 0.0;                       // subtotal of customer's purchase                      
      double taxAmount = 0.0;                      // total amount of tax                  
      double totalCost = 0.0;                      // total cost of purchase                     
      final double BOOK_PRICE = 10.0;              // price per book              
      final double TAX_RATE = 0.06999;             // tax rate         
      
      Store store = new Store();
      
      // ******************************* user inputs
      System.out.println(store.myName);
      
      displayStoreTitle();
      System.out.print("Enter number of books: ");
      quantity = keyboard.nextDouble();
      keyboard.nextLine();    // get rid of hidden \n in the keyboard buffer
      
      // ******************************* computations
      subtotal = quantity * BOOK_PRICE;
      taxAmount = computeTax(subtotal, TAX_RATE);

      totalCost = subtotal + taxAmount;
		
      // ******************************* display the output
      System.out.println("You owe $" + totalCost);
   }// end of main method
   
   // ********************************** static methods
   
   public static void displayStoreTitle()
   {
      System.out.println("*************");
      System.out.println("** WyoMart **");
      System.out.println("*************");
   }// end of displayStoreTitle
   
   public static double computeTax(double amount, double taxRate)
   {
      return amount * taxRate;
   }// end of computeTax
	
}// end of StoreTest class