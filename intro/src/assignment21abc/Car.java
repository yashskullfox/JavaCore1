package assignment21abc;

class Tyre {}
public class Car { 
		Car tyre; 
		String name;
	
	public static void main(String[] args) 
	{
		Car carMain = new Car(); 
		carMain.setFeatures(carMain);
	}
	
void setFeatures(Car car) { 
		Car tyre = new Car(); 
		car.setName("Swift");
}
 void setName(String name){
this.name = name;
}
}