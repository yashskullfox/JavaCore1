package assignment4_18;

public class Cat extends Animal implements PetAnimal {
	private String color;
    public Cat( int height, int weight, String color) {
        super( height, weight);
        this.color = color;
  
    }

    public String getColor() {
        return color;
    }
}
