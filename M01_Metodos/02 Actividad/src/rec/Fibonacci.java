package rec;

public class Fibonacci {

	public static int recursiveCount = 0;
	public static int iterativeCount = 0;
	
	public static void main(String[] args) {
		int out1 = fibonacciIterative(30);
		int out2 = fibonacciRecursive(30);
		
		System.out.println("Iterative: " + iterativeCount);
		System.out.println("Recursive: " + recursiveCount);
	}

	public static int fibonacciRecursive(int n) {

		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}

	public static int fibonacciIterative(int n) {

		int[] calc = {0,0};

		if (n <= 0) {
			calc[0] = 0;
			calc[1] = 0;
		} else if (n >= 1) {
			calc[0] = 0;
			calc[1] = 1;
		}
			
		for (int i=2; i<=n; i++) {
			int newNumber = calc[0] + calc[1];
			calc[0] = calc[1];
			calc[1] = newNumber;
		}

		return calc[1];
	}
}