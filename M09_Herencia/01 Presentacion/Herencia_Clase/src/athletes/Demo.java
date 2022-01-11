package athletes;

public class Demo {

	public static void main(String[] args) {
		
		Person[] list = new Person[2];
		list[0] = new Person("Omar");
		list[1] = new SoccerPlayer("Omar", 17);
		
		for(Person p1: list) {
			System.out.println(p1.toString());
		}
		
	}
}
