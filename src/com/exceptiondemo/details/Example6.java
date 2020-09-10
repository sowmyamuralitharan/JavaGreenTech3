package com.exceptiondemo.details;

import java.util.ArrayList;
import java.util.List;

public class Example6 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		Integer integer = li.get(5);
		System.out.println(integer);
		
		
		
	}

}
