/**
 * Sydney Stokes
 */

package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Assignment2 {

	public static void main(String[] args) {
		String fileText = "";
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//Reads file into String 
		FileReader fr = new FileReader();
		try {
			fileText = fr.readToString("main/resources/words.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
		
		//Breaks string into words, parses words
		String[] wordList = fileText.split(" ");
		for (String word :wordList){
			
			//parsing and formatting words uniformly
			String myWord = word.toLowerCase();
						
			
			if((myWord.length() > 3) && !(isNum(myWord))) {
				wordCount.put(myWord, 1);
			}
		}
		
		for (String i : wordCount.keySet()) {
		      System.out.println( i + wordCount.get(i));
		}
		
	}
	
	//method returns true if string is a number
	public static boolean isNum(String word) {
		try {
	        double x = Double.parseDouble(word);
	        return true;
	    } catch (NumberFormatException nfe) {
	        return false;
	    }	
	}
	
	
}
