package Day4_5;

public class PostGraduate extends student {
    protected int pCourseID;
    protected String pCourseName;
    protected int pCourseFees;

    public PostGraduate(int studentID, String studentNAme, int pCourseID, String pCourseName, int pCourseFees) {
        super(studentID , studentNAme);
        this.pCourseID = pCourseID;
        this.pCourseName = pCourseName;
        this.pCourseFees = pCourseFees;
        System.out.println(studentID  +" "+ studentNAme+ " "+ pCourseID + " "+ pCourseName+ " "+ pCourseFees);
    }
}