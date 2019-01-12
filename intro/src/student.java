
public class student {
	int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
student()
{
	
}
student(int id, char type, String firstName, String lastName)
	{
		
	}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public void setStudentType(char studentType) {
	this.studentType = studentType;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public void setFeesPerMonth(double feesPerMonth) {
	this.feesPerMonth = feesPerMonth;
}
public int getStudentId() {
	return studentId;
}
public char getStudentType() {
	return studentType;
}
public String getStudentName() {
	return studentName;
}
public double getFeesPerMonth() {
	return feesPerMonth;
}

}
