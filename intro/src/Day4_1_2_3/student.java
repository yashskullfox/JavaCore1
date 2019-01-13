package Day4_1_2_3;

public class student{
	private static int studentId;
	private static char studentType;
	private static  String studentName;
	private static double feesPerMonth;


public student(int id, char type, String firstName, String lastName)
	{
		this.setStudentId(id);
		this.setStudentType(type);
		this.setStudentName(firstName,lastName);
		displayDetails();
	}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public void setStudentType(char studentType) {
	this.studentType = studentType;
}
public void setStudentName(String firstName, String lastName) {
	this.studentName = firstName+lastName;
}
public void setFeesPerMonth(double feesPerMonth) {
	this.feesPerMonth = feesPerMonth;
}
public static int getStudentId() {
	return studentId;
}
public static char getStudentType() {
	return studentType;
}
public static String getStudentName() {
	return studentName;
}
public static double getFeesPerMonth() {
	return feesPerMonth;
}


public void student()
{
	feesPerMonth = 1000;
	if(studentType == 'd' )
	{
	System.out.println("Fees per month is:" + feesPerMonth);
	}
	else
	{
		System.out.println("Fees per month is: Hostelfees+Schoolfees" );
	}
}
public void displayDetails()
{
	System.out.println(student.getStudentId());
	System.out.println(student.getStudentType());
	System.out.println(student.getStudentName());
	System.out.println(student.getFeesPerMonth());
}
}
