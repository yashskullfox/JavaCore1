package Day4_5;

public class DayScholar extends PostGraduate {
    private String address;

    public DayScholar(int studentID, String studentNAme, int pCourseID, String pCourseName, int pCourseFees, String address) {
        super(studentID, studentNAme, pCourseID, pCourseName, pCourseFees);
        this.address = address;
        System.out.println(address);
    }

    public double calculateFees(){
        double fees = super.pCourseFees/6.0;
        return fees;
    }
}