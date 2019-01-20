package Day4_SelfReview;


	class Cat extends Animal {
		public static void testClassMethod() {
		System.out.println("The class method in Cat.");
		}
		public void testInstanceMethod() {
			System.out.println("The instance method in Cat.");
		}
		public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;  
		Animal.testClassMethod();  			//call method in super class
		myAnimal.testInstanceMethod();		//call method in present class
		}
		}
		

