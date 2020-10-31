
package com.assg;


public class InchesToFeetConverter {
	protected int inches;
	
	public void convert(int inches) {
		this.inches = inches;
	    int foot = inches/12;
	    int inchesext = inches%12;
	    System.out.println(inches+"\" has "+foot+ "' "+inchesext+"\"");
		}
}