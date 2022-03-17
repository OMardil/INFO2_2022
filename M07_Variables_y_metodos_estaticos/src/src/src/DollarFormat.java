package src;

public class DollarFormat {

	public static void main(String[] args) {
		DollarFormat.writeln(100.00);
		DollarFormat.writeln(10.00);
		DollarFormat.writeln(1.00);
		DollarFormat.writeln(0.10);
		DollarFormat.writeln(0.01);
		DollarFormat.writeln(0.001);
		DollarFormat.writeln(0.00);
		DollarFormat.writeln(12.78);
		DollarFormat.writeln(11.456);
		
		DollarFormat.writeln(-100.00);
		DollarFormat.writeln(-10.00);
		DollarFormat.writeln(-1.00);
		DollarFormat.writeln(-0.10);
		DollarFormat.writeln(-0.01);
		DollarFormat.writeln(-0.001);
		DollarFormat.writeln(-0.00);
		DollarFormat.writeln(-12.78);
		DollarFormat.writeln(-11.456);
		
	}

	public static void write(double amount) {
		if (amount < 0) {
			System.out.print("-");
		}
		DollarFormat.writePositive(Math.abs(amount));
	}
	
	private static void writeln(double amount) {
		write(amount);
		System.out.println();
	}

	private static void writePositive(double amount) {
		int cents = (int)(Math.round(amount * 100));
		cents = cents % 100;
		int dollars = (int)amount;
		
		System.out.print("$");
		System.out.print(dollars);
		System.out.print(".");
		if (cents < 10) {
			System.out.print("0");
		}
		System.out.print(cents);
	}
	
}
