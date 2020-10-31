package com.assg4;


import java.util.Scanner;



public class App {

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		Scanner in = new Scanner(System.in);
		byte count = in.nextByte();
		
		byte i,j,x;
		for(i = count; i > 0; i--) {
			for(x = (byte) (i-1); x > 0 ; x--) {
				System.out.print(" ");
			}
			for(j = i; j <= count; j++) {
				System.out.print(j);
			}
			System.out.println();
			}
		
		
		
		
	}

}
