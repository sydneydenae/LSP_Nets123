package org.howard.edu.lsp.midterm.problem51;

public interface Range {
	
	public class EmptyRangeException extends Exception {
		private static final long serialVersionUID = 1L;

		public EmptyRangeException(String error) {
			super(error);
		}
	}
	
	//defining range methods
	public boolean contains(int value);
	public boolean overlaps(Range other) throws EmptyRangeException;
	public int size();
	public int getUpper();
	public int getLower();
}