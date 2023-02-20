/**
 * Sydney Stokes
 */

package org.howard.edu.lsp.assignment4;

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
		//NOT FINISHED
		return true;
	}; 

	
	
}
