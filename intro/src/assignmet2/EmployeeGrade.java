package assignmet2;
import java.util.Arrays;


public class EmployeeGrade {
	public static void main( String args[]){
	int employeeId[]={1001,1002,1003,1004,1005};
	float customer1Feedback[]={4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
	float customer2Feedback[]={4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
	float customer3Feedback[]={4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
	
	float[] avgFeedback = new float[employeeId.length];
	char[] grade = new char[employeeId.length];
	for(int i=0; i<employeeId.length; i++)
	{
		avgFeedback[i] = (customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3;
		if(avgFeedback[i]>0 && avgFeedback[i]<=2)
		{
			grade[i] = 'C';
		
		}
		else if(avgFeedback[i]>2 && avgFeedback[i]<=3)
		{
			grade[i] = 'B';
		
		}
		else 
		{
			grade[i] = 'A';
		
		}
		System.out.println("ID     " + employeeId[i]);
		System.out.println("AVG    " + avgFeedback[i]);
		System.out.println("Grade  " + grade[i]);
	}
	
	} 
}