package assignmet4;

/*
* This java file is a demo Java program which depicts a class
* with a main method inside and necessary instance variables */
/**
* This class is template to create Customer Object.
* Date : <<Replace with the date you do this assignment>> * @author <<Replace with your Emp No. & Name>>
* @version 1.0
*/
public class Customer {
   private String customerID;
   private String customerName;
   private String address;
   private int pinCode;
/**
* This method creates an object of Customer Class and sets its *instance variable and display the same.
* @param args The command line arguments
*/
public static void main (String [] args){
   Customer customer1 = new Customer();						 //statement 1
   customer1.customerID = "1234";   						//statement 2
   customer1.address = "PHA-Sawan Apts.,Yadavgiri, Mysore"; //statement 4 
   customer1.pinCode = 570020; 								//statement 5
   System.out.println("Customer ID       " 	+ customer1.customerID); 
   System.out.println("Customer Name     " 	+ customer1.customerName); 
   System.out.println("Customer Address  " 	+ customer1.address); 
   System.out.println("Customer Pin Code " 	+ customer1.pinCode);
   } 
}