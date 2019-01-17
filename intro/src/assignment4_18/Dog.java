package assignment4_18;

public class Dog extends Animal implements PetAnimal {
		private String color;
	    public Dog( int height, int weight, String color) {
	        super( height, weight);
	        this.color = color;
	  
	    }

	    public String getColor() {
	        return color;
	    }
	}
