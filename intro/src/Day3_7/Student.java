package Day3_7;

public class Student {
	private int studentID;
	private char studentType;
	static int studentCount = 10;
	Student()
	{
		studentID=10; 
		studentType='F';
		studentCount++;
		}
	public void setstudentID(int ID)
	{
		
		studentID=ID;
		
	}
	public int getstudentID() {return studentID;}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public static int getStudentCount() {
		return studentCount;
	}
	
	
	
}
