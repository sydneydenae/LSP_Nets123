/**
 * Sydney Stokes
 */

package org.howard.edu.lsp.assignment4;

import java.util.Collections;
import java.util.HashSet;

public class IntegerSet  {
	//creates HashSet
	private HashSet<Integer> nums = new HashSet<Integer>();

	// Default Constructor
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
	
	public int largest(){
		//idk if this is the right way to call length
		if (length() == 0) {
			return -1;
		} else {
			return Collections.max(nums);
		}
	}; 
	
	public int smallest(){
		//idk if this is the right way to call length
		if (length() == 0) {
			return -1;
		} else {
			return Collections.min(nums);
		}
	}; 
	
	public void add(int a) {
		nums.add(a);
	};
	
	public String toString() {
		String printedNums = "";
		for(int i: nums) {
			printedNums += i;
			printedNums += " ";
			}
		return printedNums;
	};

	
	
}
