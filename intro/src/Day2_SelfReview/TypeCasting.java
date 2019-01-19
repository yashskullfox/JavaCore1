package Day2_SelfReview;

public class TypeCasting {
	public static void main(String[] args) {
        int intVal = 10;
        double doubleVal = 20.0;
        intVal = (int) doubleVal; // Type Casting due to Narrowing Conversion
        System.out.println(intVal);
    }
}
