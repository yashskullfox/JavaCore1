package Day3_4;

public class student1 
{
private int studentID;
private int sID = 545;
private String studentName;
//private String firstName;
//private String lastName;
//private String studentType;

/*student1()
{
	sID++;
	studentID = sID; 

studentType = "f";
String studnetName = "test";
}*/

student1(char sType,  String firstName, String lastName)
{
	sID++;
	studentID = sID;
//	studentName = firstName+lastName;
	this.setStudentName(firstName, lastName);
}
public void setStudentName( String firstName, String lastName) {
	this.studentName = firstName+lastName;
} 
public void displayDetails(student1 std)
 {
	 System.out.println(std.studentID);
	 // System.out.println(std.studentType);
	 System.out.println(std.studentName);
 }
 

public static void main(String args[])
{
	student1 studentOne = new student1 ('D',"Boney","Thomas");
	studentOne.displayDetails(studentOne);
	student1 studentTwo = new student1('H',"Dinial","Bose");
	studentTwo.displayDetails(studentTwo);
	
}
}
