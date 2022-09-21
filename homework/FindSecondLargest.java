package week3.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

				// Define the array 
				int[] data = {3,2,11,4,6,7};
				List<Integer> dataList = new ArrayList<Integer>();
				for(int d    :data)
				{
					dataList.add(d);
				}
				System.out.println("Original number list");
				System.out.println(dataList);
				
				// Arrange the array in ascending order
				Collections.sort(dataList);
				
				System.out.println("Number in ascending order");
				// Printing the numbers in ascending order
				for(int dl    :dataList)
				{
					System.out.print(dl);
					System.out.print("   ");
				}
			
				//Pick the 2nd element from the last and print it
				Integer big = dataList.get(dataList.size()-2);
				System.out.println();
				System.out.println("The second largest element is = " +big);
				
				

	}

}


// Here is the input
		//int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
