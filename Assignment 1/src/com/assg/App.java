package com.assg;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner usernum = new Scanner(System.in);
		System.out.print("Type Number: ");
		int num = usernum.nextInt();
		InchesToFeetConverter obj = new InchesToFeetConverter();
		obj.convert(num);

	}

}