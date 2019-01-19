package assignment5_6;

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
	public void display()
	{
		System.out.println("First Name: "+fName);
		System.out.println("Last Name: "+lName);
		System.out.println("Email ID: " +emailID);
		System.out.println("A/C Type: "+acType);
		System.out.println("Gender "+gender);
		System.out.println("Maritial Status "+mStatus);
	}
	public static void main (String[] args)
	{
		Salary sal1 = new Salary("Paul","Anderson","Paul@Wellsfargo.com","salary","01/03/1985",'M',"Single");
		System.out.println("Salary 1");
		sal1.display();
		nonSalary non1 = new nonSalary();
		System.out.println("Non Salary 1");
		
		non1.Discount();
		
	}
	}
