package Day4_SelfReview;

public 
	class Child extends Parent1{
		private int val;
		public void setVal(int num){
		val = num;
		}
		public int getVal(){
		return val;
		}
		public void display(){
		super.display();
		System.out.println("Value :"+val);
		}
		}

