package assignment5;

public class Salary {
		 private String fName;
		 private String lName;
		 private String mName;
		 private String emailID;
		 private String acType;
		 private String DOB;
		 private char gender;
		 private String mStatus;
	Salary()
	{
		
		fName = "empty"; lName = "empty";
		emailID = "empty"; acType = "empty"; 
		DOB = "empty"; gender = ' ';
		mStatus = "empty";

	}
	Salary(String fn, String ln, String E, String ac, String db, char g, String status)
	{
		
		fName = fn; lName = ln; 
		emailID = E; acType = ac;
		DOB = db; gender = g;
		mStatus = status;
	}
	public static void main (String[] args)
	{
		Salary sal1 = new Salary("xyz","xyz","x@g.c","salary","01/10/19",'m',"married");
		System.out.println("Salary 1");
		nonSalary non1 = new nonSalary();
		System.out.println("Non Salary 1");
		
		non1.Discount();
		
	}
	}
