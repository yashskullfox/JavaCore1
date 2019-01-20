package Day3_1;

public class Student {
    private static int studentId = 550;
    char studentType;
    Student()
    {
        studentId++;
    }
    Student(char sType)
    {
        this(); 
        studentType = sType;
    }
    public void displayDetails(Student student)
    {
        System.out.println("Student ID :"+Student.studentId+ " Student Type   "+student.studentType);
    }
    public static void main(String[] args) {
        Student studentOne = new Student('D');
        studentOne.displayDetails(studentOne);
    }
}
