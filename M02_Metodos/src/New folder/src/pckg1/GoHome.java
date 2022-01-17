package pckg1;

public class GoHome {
	public static final int MY_HOUSE = 0;

	public static void getHomeFrom(int houseNumber) {

		// Base case
		if (houseNumber == MY_HOUSE) {
			System.out.println("I'm home!");
		} else {
			// Recursive case
			System.out.println("I'm at house" + houseNumber);
			int currentHouse = houseNumber - 1; // move forward to next house
			GoHome.getHomeFrom(currentHouse);
		}
	}

	public static int getNumberOfZeros(int number) {
		// Base case #1: 0 is exactly 1 zero
		if (number == 0)
			return 1;
		// Base case #2: Numbers between 1 and 9 contain exactly 0 zeros
		if (number <= 9)
			return 0;
		//Calculate newNumber by dividing number by 10, to remove least significative digit
		int newNumber = number / 10;
		//Recursive case #1: Least significative digit is 1 zero 
		if (number % 10 == 0) {
			return 1 + getNumberOfZeros(newNumber);
		//Recursive case #2: Least significative digit is not a zero
		} else {
			return 0 + getNumberOfZeros(newNumber);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getNumberOfZeros(1001010));
	}
}
