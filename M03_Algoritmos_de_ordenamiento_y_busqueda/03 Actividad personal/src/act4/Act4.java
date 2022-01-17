package act4;

public class Act4 {

	public static void main(String[] args) {

//		String[] arr1 = { "z", "x", "y", "c", "b", "d" };
//		bubbleSort(arr1);
//		print(arr1);
		
		int[][] a = {{9,8,17,7},{6,23,5,1},{2,3,17,11},{2,3,17,11}};
		sortMatrix(a);
		for(int[] row: a) {
			for(int element: row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}


	private static void print(String[] arr1) {
		for(String out: arr1) {
			System.out.println(out);
		}
	}


	public static int[] findElement(int[] array, int key) {
		
		int[] answer;
		int count = 0;
		
		for(int element: array) {
			if (element == key) {
				count++;
			}
		}
		
		answer = new int[count];
		
		
		for(int i = 0, fill = 0; i<array.length; i++) {
			if (array[i] == key) {
				answer[fill++] = i;
			}
		}	
		
		return answer;
		
	}
	
	
	public static void bubbleSort(String[] data) {
		
		if (data == null)
			return;
		
		boolean flagSwap = true;		
		
		for(int i = 0; i<data.length-1 && flagSwap; i++) {
			
			flagSwap = false;
			
			for(int j = 0; j<data.length-1-i; j++) {
				flagSwap |= compareAndSwap(data, j, j+1);				
			}
		}
		
	}
	
	private static void swap(String[] data, int i, int j) {
		String temp = data[j];
		data[j] = data[i];
		data[i] = temp;
	}	


	private static boolean compareAndSwap(String[] data, int i, int j) {
		
		int result = data[i].compareTo(data[j]);
		if (result < 0) {
			swap(data, i, j);
			return true;
		}
		
		return false;
		
	}

	
	private static void sortMatrix(int[][] array) {
		
		int swaps = 0, comparisons = 0;
		int elementCount = array.length * array[0].length;

		for (int i = 0; i < elementCount; i++) {
			int min = i;
			for (int j = i + 1; j < elementCount; j++) {
				comparisons++;
				if (array[min / array.length][min % array[0].length] > array[j / array.length][j % array.length]) {
					min = j;
				}
			}
			swap(array, min, i);		
			if (min != i) swaps++;
		}
		
		System.out.println("Swaps: " + swaps);
		System.out.println("Comparisons: " + comparisons);
	}

	private static void swap(int[][] array, int a, int b) {

		if (a == b)
			return;
		
		int temp = array[a/array.length][a % array.length];
		array[a/array.length][a % array.length] = array[b/array.length][b % array.length];		
		array[b/array.length][b % array.length] = temp;
	}
	
	                  

}
