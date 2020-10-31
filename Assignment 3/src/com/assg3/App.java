package com.assg3;


import java.util.Scanner;



public class App {

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		
		
		for(int i = 1; i <= count; i++) {
			for(int j = 1 ; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

}
