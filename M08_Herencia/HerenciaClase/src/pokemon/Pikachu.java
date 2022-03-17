package pokemon;

public class Pikachu extends ElectricPokemon {

	public Pikachu(int pokedexNumber, String name, int level) {
		super(pokedexNumber, name, level);
	}
	
	//redefinition
	public void attack() {
		System.out.println(getName() + " uses Volt tackle!");		
	}

}
