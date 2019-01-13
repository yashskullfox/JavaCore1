package Day4_1_2_3;

class DayScholar {

private static String residentialAddress;

public DayScholar(int id,char type,String name ,double fees, String resAddress)
{
this.setResidentialAddress(resAddress);
System.out.println("ID:  " +id);
System.out.println("Type:" +type);
System.out.println("Name:" +name);
System.out.println("Fees:" +fees);
}

public static String getResidentialAddress() {
	return residentialAddress;
}

public void setResidentialAddress(String residentialAddress) {
	this.residentialAddress = residentialAddress;
}

}