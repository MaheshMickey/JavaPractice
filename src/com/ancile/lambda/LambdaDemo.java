package com.ancile.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		
		List<Integer> evenList = l.stream().filter(l1->l1%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> sortList = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList);
		
		List<Integer> sortRevList = 
				l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortRevList);
		
	}
}
