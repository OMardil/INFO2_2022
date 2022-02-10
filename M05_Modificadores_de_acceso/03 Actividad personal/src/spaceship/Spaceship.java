package spaceship;

public class Spaceship {
	
	private String shipName;
	private int passengerCount;
	private int maxPassengers;
	
	public Spaceship(String shipName, int maxPassengers) {
		this.shipName = shipName;
		this.maxPassengers = (maxPassengers >= 0)?maxPassengers:100; 
		/* Code above is equal to: 
		if (maxPassengers >= 0)
			this.maxPassengers = maxPassengers; 
		else
			this.maxPassengers = 100;
		*/
	}
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public String getShipName() {
		return this.shipName;
	}
	
	public int getMaxPassengers() {
		return this.maxPassengers;
	}
	
	public void board(int boardingPassengers) {
		if ( this.passengerCount + boardingPassengers <= maxPassengers) {
			this.passengerCount += boardingPassengers;
		}
	} 
	
	public void leave(int leavingPassengers) {
		if ( this.passengerCount - leavingPassengers >= 0 ) {
			this.passengerCount -= leavingPassengers;
		}
	}
	
	public int getPassengerCount() {
		return this.passengerCount;
	}
	
	public void transferTo(Spaceship newShip) {
		if (newShip == null)
			return;
	
		if (this.getPassengerCount() + newShip.getPassengerCount() <= newShip.getMaxPassengers()) {
			newShip.board(this.getPassengerCount());
			this.leave(this.getPassengerCount());
		}
	}
	
	// Method toString() will automatically be called when invoked 
	// inside a System.out.println() instruction.
	public String toString() {
		String out = "Ship name: " + this.shipName + "\n" +
					 "Passenger count: " + this.passengerCount + "\n" + 
					 "Max passengers: " + this.maxPassengers;
		return out;
	}
	
	public Spaceship clone() {
		Spaceship out = new Spaceship(this.getShipName(), this.getMaxPassengers());
		out.passengerCount = this.getPassengerCount();
		return out;
	}
	
	public boolean equals(Spaceship otherShip) {
		if (this.maxPassengers == otherShip.maxPassengers && 
				this.passengerCount == otherShip.passengerCount &&
				this.shipName.equals(otherShip.shipName)) {
			return true;
		}
		
		return false;
	
	}	
	
}
