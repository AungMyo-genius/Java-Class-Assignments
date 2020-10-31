package com.assg2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type Seconds: ");
		int seconds = in.nextInt();
		SecToHMSconverter timeobj = new SecToHMSconverter();
		timeobj.convert(seconds);
 
	
	}

}