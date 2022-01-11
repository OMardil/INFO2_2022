package animal;

public class AnimalDemo {

	public static void main(String[] args) {

		Animal rhino = new Animal();
		rhino.name = "Sally";
		rhino.race = "White Rhino";
		rhino.setHunger(10); //very hungry!
		rhino.foods = new String[]{"fruit", "bushes", "grass"};
		
		
		Animal bear = new Animal("Yogi", "Grizzly", new String[] {"fish","berries"}, 3);
		bear.eat("bushes");
		
	}

}
