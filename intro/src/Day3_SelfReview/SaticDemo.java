package Day3_SelfReview;

public class SaticDemo {
	static int count=10;
	SaticDemo(){
	count++;
	}
	static void display(){
	System.out.println(count);
	}
	static{
	System.out.println("Static Block written Before Main");
	}
	public static void main(String args[]){
	SaticDemo t1=new SaticDemo();
	SaticDemo t2=new SaticDemo();
	SaticDemo.display();
	t2.display();
	}
	static{
	System.out.println("Static Block written After Main");
	}
	
}
