package SamplePrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortByDesArray {

	public static void main(String[] args) {
		Integer arr[] = { 15, 3, 65, 2654, 854, 22, 21, 55 };
		// Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types.
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

	}

}
