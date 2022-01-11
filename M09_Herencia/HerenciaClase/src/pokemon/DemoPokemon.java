package pokemon;

public class DemoPokemon {

	public static void main(String[] args) {

		/*
		 * Pikachu ashPikachu = new Pikachu(25, "Ash's Pikachu", 50);
		 * ashPikachu.attack();
		 * 
		 * ElectricPokemon omarPikachu = new ElectricPokemon(25, "Omar's Pikachu", 50);
		 * omarPikachu.attack();
		 */
		
		//Polimorfismo
		//Un objeto de una clase derivada se puede comportar como un objeto de cualquiera de sus clases base
		Pokemon[] myPokemon = new Pokemon[2];
		myPokemon[0] = new Pikachu(25, "Pikachu", 50);
		myPokemon[1] = new Jolteon(60, "Jolteon", 65);
		
		for(Pokemon p: myPokemon) {
			p.attack();
		}

	}

}
