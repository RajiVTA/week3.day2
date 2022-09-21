package week3.day2.homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstMostDuplicate {

	public static void main(String[] args) {
	
		// Define a string 
		String text="abbaba";
		//String text="cdcdddcc";
		
		// Map - Hashmap
		Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		
		//String to character array
		char[] charArray=text.toCharArray();
		
		// Store in a map and print
		for (char ch : charArray)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		
		//Create an entrySet 
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		
		int maxOccurrence =0;
		char maxCharacter=0;
		
		// Find the max duplicate character and its occurrence
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>maxOccurrence)
			{
				maxCharacter = entry.getKey();
				maxOccurrence = entry.getValue();
				
			}
			{
				maxOccurrence=entry.getValue();
				maxCharacter = entry.getKey();
			}
		
		}
		
		System.out.println("First most repeated number of times = " +maxOccurrence);
		System.out.println("First most occurrence character = " +maxCharacter);
	}

}

/* * input: abbaba
 * output: b
 * 
 * 
 */

/*
 * Psuedocode
 * 
 * 1) Map -> HashMap 
 * 2) String -> ch[] -> Get all the character -> occurance
 * 3) Keep comparing the occurance with other values -> max value -> character
 * 
 */
