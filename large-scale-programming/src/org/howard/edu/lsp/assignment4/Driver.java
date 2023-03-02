/**
 * Sydney Stokes
 */

package org.howard.edu.lsp.assignment4;

public class Driver {	
	public static void main(String[] args) {
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(2);
		set1.add(7);
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Length of Set1 is: " + set1.length());
		System.out.println("Set 1 contains 2: " + set1.contains(2));
		System.out.println("Largest value in Set1 is: " + set1.largest());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());

		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(7);
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Set1 and Set2 are equal: " + set2.equals(set1));
		
		set1.clear();
		System.out.println("Value of Set1 is: " + set1.toString());


		
		
		/*
		Make this to test IntegerSet
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println(“Value of Set1 is:” + set1.toString());
		System.out.println(“Smallest value in Set1 is:” + set1.smallest());
		System.out.println(“Largest value in Set1 is:” + set1.largest());

		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);

		System.out.println(“Union of Set1 and Set2”);
		System.out.println(“Value of Set1 is:” + set1.toString());
		System.out.println(“Value of Set2 is:” + set2.toString());
		set1.union(set2);	// union of set1 and set2
		System.out.println(“Result of union of Set1 and Set2”);
		
		Edge cases
		- Empty Set
		- Same number set
		*/
	}
}