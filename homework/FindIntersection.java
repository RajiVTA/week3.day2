package week3.day2.homework;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

			
		// Define the array 1
		int[] data1 = {3,2,11,4,6,7};
		List<Integer> dataList1 = new ArrayList<Integer>();
		for(int d1    :data1)
		{
			dataList1.add(d1);
		}
		System.out.println("Original number list 1");
		System.out.println(dataList1);
		
		//int size1 = dataList1.size();
		//System.out.println("Size of list 1 is  =" + size1);
		
		// Define the array 2
		int[] data2 = {1,2,8,4,9,7};
		List<Integer> dataList2 = new ArrayList<Integer>();
		for(int d2    :data2)
		{
			dataList2.add(d2);
		}
		System.out.println("Original number list 2");
		System.out.println(dataList2);
		
		//int size2 = dataList2.size();
		//System.out.println("Size of list 2 is  =" + size2);
		
		
		// Compare Both the arrays using a condition statement
		System.out.print("The intersection numbers in both list  = ");
		for(int d1:data1)
		{
			for(int d2:data2)
			{
				if(d1==d2)
				{
					// Print the first array (should match item in both arrays)
					System.out.print(d1  +    "   ");
				}
			}
			
			
			
		}

	}

}

/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */
