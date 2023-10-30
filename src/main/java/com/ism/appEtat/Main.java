package com.ism.appEtat;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("toto");
		list.add("titi");
		list.add("coucou");
		list.add("kiki");
		
		list.stream().filter(s -> s.startsWith("t")).forEach(System.out::println);
		
		System.out.println(list.stream().filter(s -> s.startsWith("t")).collect(Collectors.toList()));
	}
	
	

}
