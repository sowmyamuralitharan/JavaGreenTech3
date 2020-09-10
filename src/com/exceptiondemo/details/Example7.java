package com.exceptiondemo.details;

public class Example7 {

	public static void main(String[] args) {

		String s = "Jacva";
		
		//string to int
		
		int num = Integer.parseInt(s);
		System.out.println(num);
		
		
		//int to String
		
		String word = String.valueOf(num);
		System.out.println(word);
		
		//String to WrapperClass
		
		Integer valueOf = Integer.valueOf(word);
		System.out.println(valueOf);
	}

}
