package com.techelevator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, String> namesMappedToZip = new HashMap<>();
		namesMappedToZip.put("David", "44120");
		namesMappedToZip.put("Dan", "44124");
		namesMappedToZip.put("Elizabeth", "44012");

		

		namesMappedToZip.put("Dan", "99999"); // Overwrites the original value for Dan. See in Console.

		System.out.println("David lives in: " + namesMappedToZip.get("David"));
		System.out.println("Dan lives in: " + namesMappedToZip.get("Dan"));
		System.out.println("Elizabeth lives in: " + namesMappedToZip.get("Elizabeth"));

		/* Map is an interface and HashMap is a class that implements Map */

		/* The "put" method is used to add elements to a Map */

		/* The "get" method is used to retrieve elements from a Map */

		/* keySet returns a Set of all of the keys in the Map */

		/*
		 * If the key already exists, put will overwrite the existing value with the new
		 * value
		 */

		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		
		
		Set<String> elephantEars = new HashSet<>();
		
		elephantEars.add("big ear");
		elephantEars.add("small ear");
		
		
		
		elephantEars.add("big ear");
		
		
		
		
	
		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();

		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();
 
	}

	public static void namePrinter(HashMap<String, String> namesMappedToZip, String searchString, String nameOfThePerson) {

		
		

	}

	
	
	public static void printOutEars(Set<String> setOfEars ) {
		
		for (String ear : setOfEars) {
			System.out.println(ear);
		}
		
	}
}
