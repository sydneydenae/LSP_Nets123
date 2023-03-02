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
		
		set2.remove(7);
		System.out.println("Value of Set2 is: " + set2.toString());
		
		set1.clear();
		System.out.println("Value of Set1 is: " + set1.toString());
		set1.add(6);
		set1.add(34);
		set1.add(9);
		set1.add(8);
		System.out.println("Value of Set1 is: " + set1.toString());
		set1.union(set2);
		System.out.println("Set1 union Set2 is: "+ set1.toString());
		
		set1.clear();
		set2.clear();
		set1.add(1);
		set1.add(3);
		set1.add(7);
		set2.add(6);
		set2.add(3);
		set2.add(9);
		System.out.println("\nValue of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.intersect(set2);
		System.out.println("Intersection of set1 and set2 is: "+ set1.toString());
		
		set1.clear();
		set2.clear();
		set1.add(6);
		set1.add(8);
		set1.add(3);
		set2.add(7);
		set2.add(8);
		set2.add(2);
		System.out.println("\nValue of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.diff(set2);
		System.out.println("Difference of set1 and set2 is: "+ set1.toString());
		
		set1.clear();
		System.out.println("\nValue of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Set 1 is empty: "+ set1.isEmpty());
		System.out.println("Set 2 is empty: "+ set2.isEmpty());

	



		
		
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