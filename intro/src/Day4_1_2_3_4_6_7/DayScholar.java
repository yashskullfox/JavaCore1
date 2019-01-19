package Day4_1_2_3_4_6_7;

class DayScholar extends student {

private static String residentialAddress;

public DayScholar(int id,char studentType,String firstName , String lastName,double fees, String resAddress)
{
	super(id,studentType,firstName,lastName);
	residentialAddress=resAddress;
    this.getResidentialAddress();
    displayDetails(); 
}

public static String getResidentialAddress() {
	return residentialAddress;
}

public void displayDetails()
{
	System.out.println(this.getResidentialAddress());
}
}
