package Day2_9;
public class student1 
{
private int studentID;
private int sID = 545;
private String studentName;
private String studentType;

student1()
{
studentID = sID; sID++;
studentType = "f";
//String studnetName = "test";
}
student1(char sType, String sName, String sType1)
{
	
	studentID = sID++; 
	this.studentType = sType1;
	this.studentName = sName+sType1;
}
 public void displayDetails(student1 std)
 {
	 System.out.println(std.studentID);
	 System.out.println(std.studentType);
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
