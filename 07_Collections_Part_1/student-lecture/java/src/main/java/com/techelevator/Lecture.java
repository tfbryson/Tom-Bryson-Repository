package com.techelevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<>();

		names.add("Thomas");
		names.add("Audrey");
		names.add("Austin");
		names.add("Carl");
		names.add("Jackie");
		names.add("Madeline");
		names.add("Amyre");
		names.add("Kirsten");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < names.size(); i++) { // size () is the same as length
			System.out.println(names.get(i)); // get returns what is in that index position

		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Thomas");

		for (int i = 0; i < names.size(); i++) { // size () is the same as length
			System.out.println(names.get(i)); // get returns what is in that index position

		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");

		names.add(2, "John");

		for (int i = 0; i < names.size(); i++) { // size () is the same as length
			System.out.println(names.get(i)); // get returns what is in that index position

		}

		System.out.println("####################");

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);

		for (int i = 0; i < names.size(); i++) { // size () is the same as length
			System.out.println(names.get(i)); // get returns what is in that index position

		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean inList = names.contains("Jackie");
		System.out.println("Jackie in the List?" + inList);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = (names.toArray(new String[names.size()])); // length
		for (int i = 0; i < namesArray.length; i++) { // get returns what is in that index position
			System.out.println(namesArray[i]);
		}

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/*
		 * Every primitive data type has an equivalent "primitive wrapper class" that is
		 * an object representation of a primitive value
		 */

		Integer employees = new Integer(25); // int employees = 25;
		// new Integer(25), the (25) calls a constructor and saves 25 as the variables
		// employee value.
		
		int piecesOfCake = 24;

		if (employees > piecesOfCake) {
			System.out.println("Somebody must die!");
		}

		String myStr = new String("Hello there!"); // String you don't need to include the "new" or parenthesis 
		System.out.println(myStr);
		
		
		
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		
		
		for(String name : names) { // for each String name in the arrayList called names, do-
			System.out.println(name);
			}
		
		
		// this is the same as 
		// for (int = 0; i < names.size(); i++) 
		//{ system.out.println(names.get(i)); }

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		
		
		//a queue is first in, first out. It's just a line. 
		
		Queue<String> priorities = new LinkedList<>();
		priorities.offer("Clean the dishes");
		priorities.offer("Wash the floor");
		priorities.offer("Play video games!");
		priorities.offer("Do homework");
		
		

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		
		while(priorities.size() > 0 ) {
			String nextPriority = priorities.poll(); // poll() removes the item from the queue and returns it 
			System.out.println("NEXT ITEM TO DO:" + nextPriority); 
		}

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		// Stacks are last in, first out. Think of undo when we undo the latest change. 
		// How Operating Systems and Java works. 
		
		
		Stack <String> browserStack = new Stack <>();
		
		
		////////////////////           
		// PUSHING ITEMS TO THE STACK    //essentially bringing items in
		////////////////////
		
		browserStack.push("http://www.google.com");
		browserStack.push("http://www.stackoverflow.com");
		browserStack.push("http://www.w3c.org");
		browserStack.push("http://www.techelevator.com");
		
		
		
		

		////////////////////        //essentially removing 
		// POPPING THE STACK
		////////////////////

		while(browserStack.size() > 0 ) {
			String previousPage = browserStack.pop();
			System.out.println("Previous Page:" + previousPage); 
			
		}
		
		
	}
}
