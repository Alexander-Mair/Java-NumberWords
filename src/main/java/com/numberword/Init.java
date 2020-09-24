package com.numberword;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to see it in words");

		String numberword = NumberWord.FormatNumber(s.nextInt());
		System.out.println(numberword);
		s.close();
	}

}
