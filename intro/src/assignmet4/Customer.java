package assignmet4;


public class Customer {
   private String customerID;
   private String customerName;
   private String address;
   private int pinCode;

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