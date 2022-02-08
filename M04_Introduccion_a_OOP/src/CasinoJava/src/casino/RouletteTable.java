package casino;

import java.util.Random;

public class RouletteTable {

	private int playerCount;
	private Player[] players;
	private int lastSpinNumber;
	
	public RouletteTable() {
		players = new Player[5];
		playerCount = 0;
	}
	
	
	public void addPlayer(Player p1) {
		
		if (!p1.isActiveAccount()) {
			System.out.println(p1.name + " is an inactive player.");
			return;
		}
		
		if (playerCount >= players.length) {
			System.out.println("We can't add more players!");
			return;
		}
		
		players[playerCount++] = p1;
		System.out.println(p1.name + " sat at the table.");
	}
	
	public void removePlayer(int playerIndex) {
		
		if (playerIndex > this.playerCount) {
			System.out.println("Error, no player at index " + playerIndex + ".");
			return;
		}
		
		System.out.println("Player " + players[playerIndex].name + " stood up.");
		
		for(int i=playerIndex; i<players.length-1; i++) {
			players[i] = players[i+1];
		}
		players[players.length-1] = null;
		
	}
	
	public void spin() {
		
		Random r1 = new Random();
		this.lastSpinNumber = r1.nextInt(10)+1;
		System.out.println("The roulette drew " + this.lastSpinNumber);
		
	}
	
	public void pay() {
		
		for(Player p1: players) {
			if (p1.isActiveAccount() && p1.lastBetNumber == this.lastSpinNumber) {
				System.out.println(p1.name + " won " +  p1.lastBetAmount*10 +"!");
				p1.addFunds(p1.lastBetAmount*10);
			}
			
			p1.lastBetAmount = -1;
			p1.lastBetNumber = -1;
		}
		
	}
	
	
}
