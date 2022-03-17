package athletes;

public class SoccerPlayer extends Person{

	private int shirtNumber;

	public SoccerPlayer(String name, int shirtNumber) {
		super(name);
		this.shirtNumber = shirtNumber;
	}
	
	public String toString() {
		return super.toString() + "\n" + this.shirtNumber;
	}

}
