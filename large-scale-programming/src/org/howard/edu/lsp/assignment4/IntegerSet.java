/**
 * Sydney Stokes
 */

package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;

import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;

public class IntegerSet  {
	//creates HashSet
	//GOOD
	ArrayList<Integer> nums = new ArrayList<Integer>();	// Default Constructor
	
	public IntegerSet() {
	}
	
	/**
	 * clears internal representation of set
	 */
	public void clear() {
		nums.clear();
	};
	
	/**
	 * @return Returns the length of the set
	 */
	public int length() {
		return nums.size();
	};
	
	
	/**
	 * @param b is an integer set to compare to
	 * @return true if they contain all of the same values in ANY order
	 */
	public boolean equals(IntegerSet b) {
		if(nums.equals(b.nums)) {
			return true;
		} else {
			return false;
		}
	}; 
	
	
	/**
	 * @param v is a number to check against
	 * @return true if the HashSet contains the value v
	 */
	public boolean contains(int v) {
		if(nums.contains(v)) {
			return true;
		} else {
			return false;
		}
	}; 
	
	/**
	 * @return largest number in the set
	 * @throws IntegerSetExceptio when empty

	 */
	public int largest() throws IntegerSetException{
		//idk if this is the right way to call length
		if (length() == 0) {
			throw new IntegerSetException("Empty Set");
		} else {
			return Collections.max(nums);
		}
	}; 
	
	/**
	 * @return smallest number in the set
	 * @throws IntegerSetExceptio when empty
	 */
	public int smallest() throws IntegerSetException{
		//idk if this is the right way to call length
		if (length() == 0) {
			throw new IntegerSetException("Empty Set");
		} else {
			return Collections.min(nums);
		}
	}; 
	
	/**
	 * @param a is a number to add
	 * adds a number to set
	 */
	public void add(int a) {
		 if(nums.contains(a)){
			
		 } else {
			nums.add(a);
		 }
	};
	
	/**
	 * @param v is the number to remove
	 * removes a number from a set
	 */
	public void remove(int r) {
		int index = nums.indexOf(r);
		nums.remove(index);
	}
	
	/**
	 * @param b is an IntegerSet obj from which we can add to the other numbers
	 * creates a union from both InegerSets
	 */
	public void union(IntegerSet b) {
		for (int i : b.nums) {
		     if(nums.contains(i)) {
		    	 
		     }else {
		    	 add(i);
		     }
		}
	}; 
	
	/**
	 * @param b is an IntegerSet obj from which we can add to the other numbers
	 * changes the set to the intersection of  both sets
	 */
	public void intersect(IntegerSet b) {
		nums.retainAll(b.nums);
	}; 
	
	/**
	 * @param b is an IntegerSet obj from which we can add to the other numbers
	 * changes the set to the differences between sets
	 */
	public void diff(IntegerSet b) {
		for (int i : b.nums) {
		     if(nums.contains(i)) {
		    	 remove(i);
		     }else {
		    	 
		     }
		}
	}; 
	
	/**
	 * @return true if the HashSet is empty
	 */
	public boolean isEmpty() {
		if (length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return string representation of the HashSet
	 */
	public String toString() {
		String printedNums = "";
		for(int i: nums) {
			printedNums += i;
			printedNums += " ";
			}
		return printedNums;
	};
	
	public class IntegerSetException extends Exception {
		private static final long serialVersionUID = 1L;

		public IntegerSetException(String error) {
			super(error);
		}
		
	}

	
	
}
