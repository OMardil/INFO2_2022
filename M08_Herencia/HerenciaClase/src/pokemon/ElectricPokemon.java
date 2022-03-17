package pokemon;

public class ElectricPokemon extends Pokemon{

	private boolean doubleDamageFromRock;
	
	public ElectricPokemon(int pokedexNumber, String name, int level) {
		super(pokedexNumber, name, level);		
		this.setType("Electric");
		this.doubleDamageFromRock = true;
	}

	public void attack() {
		System.out.println(getName() + " uses Thundershock!");
	}

	public boolean isDoubleDamageFromRock() {
		return doubleDamageFromRock;
	}

	public void setDoubleDamageFromRock(boolean doubleDamageFromRock) {
		this.doubleDamageFromRock = doubleDamageFromRock;
	}
	
}
