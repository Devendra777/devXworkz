package com.dev.devapp;

import java.util.Scanner;

public class OilTester {

	public static void main(String[] args) {
		Oil oil = new Oil();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id");
		
		String id = scanner.next();
		// auto boxing
		int id1=  Integer.parseInt(id);
		//oil.id = id1;

		System.out.println("Oil price is : " + oil.id);

	}

}
