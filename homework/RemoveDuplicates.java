package week3.day2.homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		// *  Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Original text= " + text);
		

		 //*  Split the String into array and iterate over it 
		String s1[]=text.split("\\s");
		
		
		//*  Initialize another loop to check whether the word is there in the array
		Set<String> value=new LinkedHashSet<String>();
		for(String s:s1)
		{
			if(s!=null)
			{
				value.add(s);
	
			}
			
		}
		
		// * Displaying the String without duplicate words	
		String output="";
		for(String sec:value)
		{
			output=output+ "  " + sec;
		}
		System.out.print("After removing duplicates  =  ");
		System.out.print(output + "   ");
				

	}

}


/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */
