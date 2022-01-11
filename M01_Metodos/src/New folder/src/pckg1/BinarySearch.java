package pckg1;

public class BinarySearch {

	public static void main(String[] args) {

		int index = binarySearch(new int[] {1,2,3,4,5,6,7,8,9,10}, 11);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] array, int target) {
		return binarySearch(array, target, 0, array.length-1);
	}
	
	public static int binarySearch(int[] array, int target, int begin, int end) {
		int mid = (begin + end) / 2;		
		
		if (begin > end)
			return -1;
		if (array[mid] == target) 
			return mid;
		
		if (array[mid] > target) {
			return binarySearch(array, target, begin, mid-1);
		} else {
			return binarySearch(array, target, mid+1, end);
		}
	}	

}
