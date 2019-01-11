package assignment8_9_10;

public class EmployeeGrade{
	
	private int employeeNo;
	String employeeName; 
	float customer1Feedback; 
	float customer2Feedback; 
	float customer3Feedback;
	float avgFeedback;
	char grade;

EmployeeGrade(int eNo, String eName, float c1Feedback, float c2Feedback, float c3Feedback)
{
	this.setEmployeeNo(eNo);
	this.setEmployeeName(eName);
	this.setCustomer1Feedback(c1Feedback);
	this.setCustomer2Feedback(c2Feedback);
	this.setCustomer3Feedback(c3Feedback);
	
} 
public void calculateAverageFeedback()
{
		avgFeedback = (customer1Feedback+customer2Feedback+customer3Feedback)/3;	
}
public void calculateGrade()
{
	if(avgFeedback>0 && avgFeedback<=2)
	{
	grade = 'C';
	}
	else if(avgFeedback>2 && avgFeedback<=3)
	{
	grade = 'B';

	}
	else 
	{
	grade = 'A';

	}
}
public void display()

	{
		System.out.println(" no:	"+employeeNo);
		System.out.println(" name:	"+employeeName);
		System.out.println(" average feedback:	"+avgFeedback);
		System.out.println(" grade	:	"+grade);
	}

 
public void setEmployeeNo(int employeeNo) {
	this.employeeNo = employeeNo;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public void setCustomer1Feedback(float customer1Feedback) {
	this.customer1Feedback = customer1Feedback;
}
public void setCustomer2Feedback(float customer2Feedback) {
	this.customer2Feedback = customer2Feedback;
}
public void setCustomer3Feedback(float customer3Feedback) {
	this.customer3Feedback = customer3Feedback;
}
public void setAvgFeedback(float avgFeedback) {
	this.avgFeedback = avgFeedback;
}
public void setGrade(char grade) {
	this.grade = grade;
}
}