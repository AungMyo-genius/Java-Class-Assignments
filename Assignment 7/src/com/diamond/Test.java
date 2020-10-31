package com.diamond;

public class Test {

	public static void main(String[] args) {

		
		byte i,j;
		byte count=9,inc = 1,shape=5; 
		for( i = 1 ; i <= count ; i++){
			if(i<=5) {
				for(j=shape; j>=1; j--) 
				System.out.print(" ");
				} 
			else { 
				for(j=1; j<=shape;j++) 
				System.out.print(" ");
				}
			
			for(j=1 ; j<=inc ; j++) {
				System.out.print(j);
			}
			
			if(i<5) { 
				inc+=2; 
				shape--;
				}
			else 	 { 
				inc-=2; 
				shape++;
				}
			
			System.out.println();
		     
		  }	 
	}
	}
		
		