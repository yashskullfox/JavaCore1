package Day4_SelfReview;

public class Parent {
	protected int num;
	public void setNum(int val){
	num = val;
	}
	public int getNum(){
	return num;
	}
	public void display(){
	System.out.println("Number :"+num);
	}
	}
	
		class CourseMgmt{
		public static void main(String args[]){
		Child child;
		child = new Child();
		child.setNum(100);
		child.setVal(200);
		child.display();
		}
		
}
