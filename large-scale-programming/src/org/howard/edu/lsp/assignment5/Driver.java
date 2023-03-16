/**
 * @author Sydney Stokes
 */

package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;

public class Driver {	
	/*
	 * main method
	 * @param args is CL argument
	 */
	public static void main(String[] args){
		
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(2);
		set1.add(7);
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("Length of set1 is: " + set1.length());
		System.out.println("set1 contains 2: " + set1.contains(2));
		System.out.println("set1 contains 19: " + set1.contains(19));
		try {
			System.out.println("Largest value in set1 is: " + set1.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Smallest value in set1 is: " + set1.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(7);
		IntegerSet set3 = new IntegerSet();
		set3.add(61);
		set3.add(23);
		System.out.println("\nValue of set1 is: " + set1.toString());
		System.out.println("Value of set2 is: " + set2.toString());
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("set1 and set2 are equal: " + set1.equals(set2));
		System.out.println("set2 and set3 are equal: " + set2.equals(set3));

		
		System.out.println("\nValue of set2 is: " + set2.toString());
		set2.remove(7);
		set2.remove(1);
		System.out.println("Value of set2 with values removed is: " + set2.toString());
		
		set1.clear();
		System.out.println("\nValue of cleared set1 is: " + set1.toString());
		set1.add(6);
		set1.add(34);
		set1.add(9);
		set1.add(8);
		set2.add(8);
		set2.add(33);
		System.out.println("\nValue of set1 is: " + set1.toString());
		System.out.println("Value of set2 is: " + set2.toString());
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
		System.out.println("set 1 is empty: "+ set1.isEmpty());
		System.out.println("set 2 is empty: "+ set2.isEmpty());
		
		try {
			System.out.println("Largest value in set1 is: " + set1.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}