package rec;

public class BigO {

	public static void main(String[] args) {
		int a = 20;
		int[] array = new int[a];
		
		System.out.println(countArrayElementsA(array));
		System.out.println(countArrayElementsB(array));
		System.out.println(countArrayElementsC(array));
		
	}

	//Big(O) = O(1)
	public static int countArrayElementsA(int[] a, String input) {
		return a.length; //atributo de la clase array
	}

	//Big(O) = O(n)
	public static int countArrayElementsB(int[] a) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			count++;
		}
		return count;
	}
	
	//Big(O) = O(n)
	public static int countArrayElementsC(int[] a) {
		int count = 0;
		//O(n)
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<10; j++) {
				count++;
			}
		}
		return count/10;
	}
	
	//Big(O) = O(n2)
	public static int countArrayElementsD(int[] a) {
		int count = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				count++;
			}
		}
		return count/10;
	}	
	
}
