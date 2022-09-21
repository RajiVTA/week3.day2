package week3.day2.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
	
		
				//Number of duplicates in an Integer array
				// Declare an integer array 
				int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
				//int[] arr= {1,2,3,4,1,2,3,4,6,7,8};
				List<Integer> list = new ArrayList<Integer>();
				
				// Add values to the list
				for (Integer i : arr)
				{
					list.add(i);
				}
		
				//Sort the list and print it
				Collections.sort(list);
				System.out.print("Original list is  = " );
				System.out.println(list);
				
				//Find the size of the list
				int size = list.size();			
				
				//Iterate the loop to find the duplicates
				System.out.println("Duplicate numbers are :");
				for(int j=0;j<size-1;j++)
				{
					if(list.get(j) == list.get(j+1))
						System.out.println(list.get(j));
				}

	}

}


/*
 * int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

// get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count 
	
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	
			// compare both the loop variables & check they're equal
		
					// increase the count if both the arrays are equal
			
	// Out of the inner loop, check and print the first array variable if count is more than 0
 */