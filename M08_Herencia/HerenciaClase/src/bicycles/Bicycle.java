package bicycles;

public class Bicycle { 
    // the Bicycle class has three fields
    protected int cadence;
    public int gear;
    private int speed;    
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }      
    // the Bicycle class has four methods
    protected void setCadence(int newValue) {
        cadence = newValue;
    }
        
    private void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
	public void reset() {
		cadence = 0;
		gear = 0;
		speed = 0;
	} 
	
	public void reset(int newValue) {
		this.cadence = newValue;
		this.gear = newValue;
		this.speed = newValue;
	}
}