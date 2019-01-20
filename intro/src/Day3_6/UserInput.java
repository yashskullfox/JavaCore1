package Day3_6;

	import java.util.Scanner;
	public class UserInput {
		
	    private static Scanner scanner;

		public static void main(String[] args) {
	        int number;
	        int iterations;
	        
	        System.out.println("Enter the number: ");
	        
	        scanner = new Scanner(System.in);
	        number = scanner.nextInt();
	        System.out.println("Enter the iterations :");
	        iterations = scanner.nextInt();
	        System.out.println("\tMultiplication for "+number+" : \n");
	       System.out.println("\t"+number+" * "+iterations+" = "+(number*iterations));
	        
	    }
	}
