package com.teste.main;

import java.util.Scanner;

import com.teste.utils.StringUtils;


public class Teste2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringUtils stringUtils = new StringUtils();
		System.out.println("Enter the string: ");
		String s = scan.nextLine();
		int length = stringUtils.shortestSubstring(s);
		System.out.println(length);
	}

}
