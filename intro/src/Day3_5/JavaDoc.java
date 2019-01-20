package Day3_5;

import java.util.Scanner;

public class JavaDoc {
    private String userName;
    private int length;
    private String upperCase;
    private String lowerCase;
	private static Scanner scanner;
    public static void main(String[] args) {
        JavaDoc javaDoc = new JavaDoc();
        System.out.println("Enter user name : ");
        scanner = new Scanner(System.in);
        javaDoc.userName = scanner.next();
        javaDoc.length = javaDoc.userName.length();
        javaDoc.upperCase = javaDoc.userName.toUpperCase();
        javaDoc.lowerCase = javaDoc.userName.toLowerCase();
        System.out.println("Hi "+javaDoc.userName);
        System.out.println("Your name has "+javaDoc.length+" Characters");
        System.out.println("Uppercase : "+javaDoc.upperCase);
        System.out.println("Lowercase : "+javaDoc.lowerCase);
    }
}