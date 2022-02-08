package animal;

public class Animal {
	
	public String name; 
	public String race;
	public String[] foods; //array with food the animal likes
	private int hunger; //1 -> not hungry, 10 -> very hungry
	
	public Animal(String name, String race, String[] foods, int hunger) {
		this.name = name;
		this.race = race;
		this.foods = foods;
		this.setHunger(hunger);
	}
	
	public Animal() {}
	
	public void eat(String inputFood) {
		if (getHunger() <= 0) {
			System.out.println("I'm full!");
			return;
		}
		
		
		//check if Animal eats inputFood
		for(String food: foods) {
			if (food.equals(inputFood)) {
				//When animal eats, hunger is decreased
				setHunger(getHunger() - 1);
				System.out.println("Delicious! I love " + inputFood);
				return;
			}
		}
		
		// Otherwise, 
		System.out.println("I don't like " + inputFood);
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
}
