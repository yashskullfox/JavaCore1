package Day4_1_2;

public class Hostelite extends student {
protected Hostelite(int id,char studentType,String firstName , String lastName,double fes,int romNo)
 {
		super(1,'d', "abc", "xyz");
		System.out.println("ID    " +id);
		System.out.println("Type  " +studentType);
		System.out.println("FristName  " +firstName);
		System.out.println("LastName  " +lastName);
		System.out.println("Fees  " +fes);
		System.out.println("RoomNo  " +romNo);
	}
private String hostelName;
private int roomNo;

/*Hostelite()
{
	
} */

public static void main(String args[])
{
	student student1 = new student (1,'d', "abc", "xyz");
	System.out.println(student.getStudentId());
	System.out.println(student.getStudentType());
	System.out.println(student.getStudentName());
	student1.student();
	Hostelite student2 = new Hostelite(102,'h', "bbc","king",1002d,102);
	student2.student();
	
}
}
