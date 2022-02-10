package spaceship;

public class SpaceshipDemo {

	public static void main(String[] args) {
		
		System.out.println("Problem 1");
		Spaceship s1 = new Spaceship("Battlecruiser", 1000);
		s1.board(250);
		s1.leave(100);
		s1.board(5);
		System.out.println(s1);
		System.out.println("----------");	
		//----------------------------------------------------
		
		System.out.println("Problem 2");		
		Spaceship Hyperion = new Spaceship("", 2500);
		Hyperion.setShipName("Hyperion");
		Hyperion.board(450);
		Hyperion.board(3655);
		
		Spaceship TheMilano = new Spaceship("The Milano", 10);
		TheMilano.setShipName("Milano");
		
		Hyperion = TheMilano;
		TheMilano.board(1);
		Hyperion.board(4);
		
		System.out.println(TheMilano);
		System.out.println(Hyperion);
		System.out.println("----------");		
		//----------------------------------------------------

		System.out.println("Problem 3");				
		Spaceship Normandy, Andromeda;
		Normandy = new Spaceship("Normandy", 30);
		Andromeda = new Spaceship("Andromeda", 500);
		Andromeda = Normandy;
		Normandy.setShipName("SSV Normandy SR-1");
		Normandy.board(10);
		Andromeda.board(10);
		Andromeda.setShipName("Andromeda ISS");
		Andromeda.board(20);
		
		System.out.println(Andromeda);
		System.out.println(Normandy);		
		
		//----------------------------------------------------
		System.out.println("Problem 4");
		Spaceship Voyager1, Apollo;
		Voyager1 = new Spaceship("Voyager 1", 5);
		Apollo = new Spaceship("Apollo 11", 10);
		
		Voyager1.board(3);
		Voyager1.transferTo(Apollo);
		
		Voyager1.board(5);
		Voyager1.transferTo(Apollo);
		
		Voyager1.board(2);
		Voyager1.transferTo(Apollo);
		
		//------------------------------------------------------
		
		
		
		
	}

}
