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
	
	//clears internal representation of set
	public void clear() {
		nums.clear();
	};
	
	
	// Returns the length of the set
	public int length() {
		return nums.size();
	};
	
	
	/*
     * Returns true if the 2 sets are equal, false otherwise;
	* Two sets are equal if they contain all of the same values in ANY order.
	*/
	
	public boolean equals(IntegerSet b) {
		if(nums.equals(b.nums)) {
			return true;
		} else {
			return false;
		}
	}; 
	
	//Returns true if the HashSet contains the value v
	public boolean contains(int v) {
		if(nums.contains(v)) {
			return true;
		} else {
			return false;
		}
	}; 
	
	public int largest() throws IntegerSetException{
		//idk if this is the right way to call length
		if (length() == 0) {
			throw new IntegerSetException("Empty Set");
		} else {
			return Collections.max(nums);
		}
	}; 
	
	public int smallest() throws IntegerSetException{
		//idk if this is the right way to call length
		if (length() == 0) {
			throw new IntegerSetException("Empty Set");
		} else {
			return Collections.min(nums);
		}
	}; 
	
	public void add(int a) {
		 if(nums.contains(a)){
			
		 } else {
			nums.add(a);
		 }
	};
	
	public void remove(int r) {
		int index = nums.indexOf(r);
		nums.remove(index);
	}
	
	public void union(IntegerSet b) {
		for (int i : b.nums) {
		     if(nums.contains(i)) {
		    	 
		     }else {
		    	 add(i);
		     }
		}
	}; 
	
	
	public void intersect(IntegerSet b) {
		nums.retainAll(b.nums);
	}; 
	
	
	public void diff(IntegerSet b) {
		for (int i : b.nums) {
		     if(nums.contains(i)) {
		    	 remove(i);
		     }else {
		    	 
		     }
		}
	}; 
	
	public boolean isEmpty() {
		if (length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	
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
