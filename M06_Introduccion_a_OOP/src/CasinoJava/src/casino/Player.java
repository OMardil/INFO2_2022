package casino;

import java.time.LocalDate;
import java.time.Period;

public class Player {

	public String name; //player name
	private int age;    //player age
	private double balance; //player balance $$
	//if account is valid, activeAccount == true.
	private boolean activeAccount;
	public double lastBetAmount; //last bet $$$
	public int lastBetNumber;    //selected number
	
	public Player(String name, LocalDate birthDate) {
		
		this.name = name;
		
		Period ageCalculator = Period.between(birthDate, LocalDate.now());
		this.age = ageCalculator.getYears();
		
		if (this.age >= 18) {
			this.activeAccount = true;
		} else {
			this.activeAccount = false;
		}
	}
	
	public void addFunds(double amount) {
		if (amount < 20) {
			System.out.println("Minimum deposit amount is 20.");
			return;
		}
		
		if (this.isActiveAccount()) {
			this.balance += amount*0.96;
		}
		System.out.println(amount*0.96 + " added to " + this.name + "'s account.");
		
	}
	
	public void withrawFunds(double amount) {
		if (this.balance - amount < 0) {
			System.out.println("Not enough funds!");
			return;
		}
		this.balance -= amount;
		System.out.println("Withrew " + amount + " from " + this.name + ".");
		
	}
	
	public void bet(double betAmount, int betNumber) {
		
		if (this.balance - betAmount < 0) {
			System.out.println("Not enough funds!");
			return;
		}		
		withrawFunds(betAmount);
		
		this.lastBetAmount = betAmount;
		this.lastBetNumber = betNumber;
		System.out.println(this.name +  " bet on " + this.lastBetNumber + ".");
		
	}

	public boolean isActiveAccount() {
		return this.activeAccount;
	} 
	
}
