
class CourseManagement{
static protected int regId;
protected String courseName;
CourseManagement(){
regId++;
}
	CourseManagement (String cName){
		this.courseName=cName;
		
}
public void displayDetails(){
System.out.println("Registration ID :"+regId);
System.out.println("CourseName :"+courseName);
}
}

class Student extends CourseManagement{
protected int studentId;
protected char studentType;
protected String studentName;
private int semesterFees;
private int feesPerMonth;
Student(int studentId, String cName){
super(cName);
this.studentId=studentId;
}
Student(int studentId,char studentType,String studName,int
semFees,String cName){
super(cName);
studentType=studentType;
studentName=studName;
semesterFees=semFees;
}
}
class DayScholar extends Student{
private String residentialAddress;
DayScholar(int studentId,char studentType, String studName,
int semFees, String residentialAddress, String cName){
super(studentId,studentType,studName, semFees, cName);
this.residentialAddress=residentialAddress;
}
public void displayDetails(){
//need to display the Details of the Student and
//DayScholar
}
}

class CourseReg{
public static void main(String args[]){
DayScholar dayscholar = new DayScholar
(1001,'D',"Eugene",12000,"No32/68 Vijayanagar","OOP");
dayscholar.displayDetails();
}
}