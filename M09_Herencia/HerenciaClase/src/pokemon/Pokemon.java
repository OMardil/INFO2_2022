package pokemon;

public class Pokemon {
	
	private int pokedexNumber;
	private String name;
	private int level;
	private String type;
	public int generation;
		
	public Pokemon() {
		this.type = "No type yet";		
		generation = 1;
	}

	public Pokemon(int pokedexNumber, String name, int level) {
		this.pokedexNumber = pokedexNumber;
		this.name = name;
		this.level = level;
		this.type = "No type yet";			
		generation = 1;		
	}

	public int getPokedexNumber() {
		return pokedexNumber;
	}

	public void setPokedexNumber(int pokedexNumber) {
		this.pokedexNumber = pokedexNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void attack() {
		System.out.println(getName() + " can't attack!");
	}	
	
}
