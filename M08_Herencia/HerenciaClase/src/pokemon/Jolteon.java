package pokemon;

public class Jolteon extends ElectricPokemon {

	public Jolteon(int pokedexNumber, String name, int level) {
		super(pokedexNumber, name, level);
	}
	
	//redefinition
	public void attack() {
		System.out.println(getName() + " uses Thunderbolt!");		
	}

}
