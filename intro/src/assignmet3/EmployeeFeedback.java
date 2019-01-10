package assignmet3;

/*
	* This java file is a program to store and display the employee * number and their feedback from the customer.
	*/
	/**
	* This class will display the feedback of all the employees * Date : <<Replace with the date you do this assignment>>
	* @author <<Replace with your Emp No. & Name>>
	 * @version 1.0
 */
public class EmployeeFeedback {
/**
* Stores and displays the feedback of the employees from their * customer
* @param args: Command line arguments
*/
     public static void main (String [] args) {
       int [][]empInfo = {{1001,4,5}, {1002,2,4,5}};
       for (int outerLoop=0;outerLoop<empInfo.length;outerLoop++)
       {
        for (int innerLoop=0;innerLoop<empInfo[outerLoop].length;
                  innerLoop++)
         {
              System.out.println(empInfo[outerLoop][innerLoop]);
       } }
} 
     }

