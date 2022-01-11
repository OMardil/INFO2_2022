package casino;

import java.time.LocalDate;

public class RouletteDemo {

	public static void main(String[] args) {

		Player Mario = new Player("Mario", LocalDate.of(1980, 02, 1));		
		Player Jose  = new Player("Jose", LocalDate.of(1999, 04, 3));		
		Player Maria = new Player("Maria", LocalDate.of(2005, 01, 5));		
		Player Rocio = new Player("Rocio", LocalDate.of(1960, 11, 11));		
		Player Linda = new Player("Linda", LocalDate.of(1978, 7, 15));
		Player Jason = new Player("Jason", LocalDate.of(2000, 12, 31));
		Player Ruth = new Player("Ruth", LocalDate.of(1963, 2, 28));		
		
		Mario.addFunds(100);	
		Mario.addFunds(20);
		Jose.addFunds(500);
		Maria.addFunds(1200);
		Rocio.addFunds(600);
		Linda.addFunds(777);
		Jason.addFunds(77.30);		
		
		System.out.println();		
		
		RouletteTable r1 = new RouletteTable();		
		r1.addPlayer(Mario);
		r1.addPlayer(Jose);
		r1.addPlayer(Maria);
		r1.addPlayer(Rocio);
		r1.addPlayer(Jason);
		r1.addPlayer(Linda);
		r1.addPlayer(Ruth);
		
		System.out.println();
		
		Mario.bet(50, 1);
		Jose.bet(200, 2);
		Maria.bet(500, 3);
		Rocio.bet(300, 4);		
		Linda.bet(700, 5);
		Jason.bet(100, 6);
		
		System.out.println();
		r1.spin();
		System.out.println();		
		r1.pay();
		
	}

}
