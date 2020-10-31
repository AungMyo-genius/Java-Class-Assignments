package com.diamond;

public class App {

	public static void main(String[] args) {

		
		byte i,j;
		byte count=9,shape = 5, inc = 1; 
		for( i = 1 ; i <= count ; i++){
			
			for(j=shape; j>=1; j--) {
				System.out.print(" ");
			}
			for(j=1; j<=inc; j++) {
				System.out.print(j);
			}
			System.out.println();
			if(i < 5) {
				shape--;
				inc+=2;
			} else {
				shape++;
				inc-=2;
			}
			
		     
		  }	 
		
		
		
	     

} }