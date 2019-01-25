package assignment23_24_25;
//import java.io.*;

public class ExceptionHandlingDemo {
public static void main (String argus[])
{
String name = "h";
int total = 100,count=0; 
try
{
int average = total/count; 
System.out.println(average); 
System.out.println(name.length());
}
catch(ArithmeticException exception)
{ 
	System.out.println("Object is null");
}
finally{
System.out.println("wthin finally block");
}
System.out.println("Continuing the execution...");
}
}
