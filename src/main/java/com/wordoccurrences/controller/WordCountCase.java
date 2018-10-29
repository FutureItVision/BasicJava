package com.wordoccurrences.controller;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class WordCountCase {

	public static void WordCountWithCaseSensitive() {
		System.out.println("Write your word  here :  ");
		Scanner scanner= new Scanner(System.in); //This line you will input your word or sentence mixed with upper case and lower case repeated word 
		String input=scanner.nextLine();
		String[]words=input.split("[(' '),.-]"); //This line will spilt your word or chracter by , . - and empty space 
		
	HashMap<String, Integer> uniques = new HashMap<String, Integer>();
		//char[]strArray=input.toCharArray();
		for(String str:words) {
			if(uniques.get(str)!=null) {
				uniques.put(str, uniques.get(str)+1);
			}
			else
			{
				uniques.put(str, 1);
			}
		}
		Set<String>str2=uniques.keySet();
		for(String str : str2) {
			System.out.println("This word repeted: "+str+" repeted "+uniques.get(str)+" time ");
		}
		
	}

}
