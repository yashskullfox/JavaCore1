package Day4_1_2_3;

public class Hostelite extends student {
	private String hostelName;
	private int roomNo;

public Hostelite(int id,char studentType,String firstName , String lastName,double fes,String hostName, int romNo)
 {
		super(id,studentType,firstName,lastName);
		this.hostelName=hostName;
		roomNo=romNo;
		displayDetails();
}

/*Hostelite()
{
	
} */

public void displayDetails()
{
	super.displayDetails();
	System.out.println(" Hostel Name" + this.hostelName);
	System.out.println("Room No:" +roomNo);
}

public static void main(String args[])
{
	Hostelite student2 = new Hostelite(102,'h', "bbc","king",1002d,"Hostal A",102);
	DayScholar student3 = new DayScholar(102,'d',"bob","martin",1000d,"Hostal b");
	
}
}
