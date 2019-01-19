package Day4_5;

public class student {
    private static int counter= 0;
    protected int studentID ;
    protected String studentNAme;

    public student(int studentID, String studentNAme) {
        this();
  
        this.studentNAme = studentNAme;
    }

    public student() {
        this.studentID = counter;
        counter++;
    }
    public static void main(String args[]){
        DayScholar student1 = new DayScholar(23,"Yash",34,"JAVA",4000,"1209 9th St");
        System.out.println(student1.calculateFees());
    }
}