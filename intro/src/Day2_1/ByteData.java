package Day2_1;

public class ByteData {
    public static void main(String[] args) {
        int intval = 100;
        byte byteval = (byte)intval;
        byte max = 127;
        byte min = -128;
        byte sum = (byte) (max+min); 
        System.out.println("sum = "+sum);
    }
}