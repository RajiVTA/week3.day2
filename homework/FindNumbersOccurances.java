package week3.day2.homework;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
	
		
		//Declare an integer array
		int[] arr= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		
		// Create a TreeMap
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		
		// Find the number of occurrences of numbers and print it
		for (int a : arr)
		{
		map.put(a, map.getOrDefault(a, 0)+1);	
		}
		System.out.println(map);
		System.out.println();
	}

}

/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
 * 
 * Order: Ascending Order
 * 
 */

/*
 * Psuedcode:
 * 
 * 1) Create Map -> TreeMap
 * 2) For loop -> each number -> add to the map
 * 3) If it is exist -> update it with + 1
 * 	  Else -> new entry with 1 as value
 * 
 */