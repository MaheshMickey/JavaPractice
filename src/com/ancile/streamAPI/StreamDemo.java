package com.ancile.streamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(3);
		al.add(1);
		al.add(20);
		System.out.println(al);
		
		List al1 = al.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(al1);
		
	}

}
