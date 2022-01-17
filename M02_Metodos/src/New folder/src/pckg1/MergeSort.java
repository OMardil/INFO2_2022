package pckg1;

/**
 * Class for sorting an array of integers from smallest to largest using the
 * merge sort algorithm.
 */
public class MergeSort {

	public static void mergeSort(int[] a) {

		// Base case => a.length == 1, so a is sorted.
		if (a.length <= 1)
			return;
		
		// Recursive case
		if (a.length >= 2) {
			int mid = a.length / 2;
			int[] firstHalf = new int[mid];
			int[] lastHalf = new int[a.length-mid];

			// 1. Divide array into halves
			divide(a, firstHalf, lastHalf);

			// 2. Recursive call
			mergeSort(firstHalf);
			mergeSort(lastHalf);

			// 3. Merge arrays
			merge(a, firstHalf, lastHalf);
		}
	}

	private static void divide(int[] from, int[] firstHalf, int[] lastHalf) {
		for (int i = 0; i < firstHalf.length; i++)
			firstHalf[i] = from[i];
		for (int i = 0; i < lastHalf.length; i++)
			lastHalf[i] = from[firstHalf.length + i];
	}

	private static void merge(int[] newArray, int[] firstHalf, int[] lastHalf) {
		int firstHalfIndex = 0, lastHalfIndex = 0, newArrayIndex = 0;

		while ((firstHalfIndex < firstHalf.length) && (lastHalfIndex < lastHalf.length)) {
			if (firstHalf[firstHalfIndex] < lastHalf[lastHalfIndex]) {
				newArray[newArrayIndex] = firstHalf[firstHalfIndex];
				firstHalfIndex++;
			} else {
				newArray[newArrayIndex] = lastHalf[lastHalfIndex];
				lastHalfIndex++;
			}
			newArrayIndex++;
		}
		// At least one of firstHalf and lastHalf has been
		// completely copied to a.
		// Copy rest of firstHalf, if any.
		while (firstHalfIndex < firstHalf.length) {
			newArray[newArrayIndex] = firstHalf[firstHalfIndex];
			newArrayIndex++;
			firstHalfIndex++;
		}
		// Copy rest of lastHalf, if any.
		while (lastHalfIndex < lastHalf.length) {
			newArray[newArrayIndex] = lastHalf[lastHalfIndex];
			newArrayIndex++;
			lastHalfIndex++;
		}
	}
}