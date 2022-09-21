package week3.day2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args)
	{
				
			// define the array
			int[] data = {1,2,3,4,7,6,8};
			//int[] data = {3,5,1,6,2};
		
			List<Integer> miss1=new ArrayList<Integer>();
			for(int d    :data)
			{
				miss1.add(d);
			}
			System.out.print("Original number list = ");
			System.out.println(miss1);
			
			// Sort the array
			Collections.sort(miss1);
			
			// Print the sorted list
			System.out.print("Sorted number list  = ");
			for( int m   : miss1)
			{
				System.out.print(m   +  "  ");
			}
			
			// Size of the array
			int size = miss1.size();
			System.out.println();
			System.out.println("Size is = " + size);
			System.out.print("The Missing Number is = ");
			
			// Print the missing number
			 int j = 0;
			for (int i = 1; i <= size; i++) 
			{
			    if (j < size && i == miss1.get(j))
			    {
			    	j++;
			    }
			    else
			    {
			    System.out.println(i + " ");
			    }
			}

	}
}

				


// Here is the input
//int[] arr = {1,2,3,4,7,6,8};

// Sort the array	


// loop through the array (start i from arr[0] till the length of the array)

	// check if the iterator variable is not equal to the array values respectively
	
		// print the number
		
		// once printed break the iteration
