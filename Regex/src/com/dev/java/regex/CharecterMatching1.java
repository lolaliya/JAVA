package com.dev.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharecterMatching1 {

	public static void main(String[] args) {
		Pattern pat = Pattern.compile("\\w+\\@\\w+\\.\\w+"); // for email id's.
		Matcher mat = pat.matcher("qwerty@email.com");
		System.out.println(mat.matches());
		
		pat = Pattern.compile("\\w+\\s\\w+\\s\\w+"); // for first, middle, and last name
		mat = pat.matcher("A B C");
		System.out.println(mat.matches());
		
		pat = Pattern.compile("[A-Za-z]{1,25}\\s[A-Za-z]{1,25}"); //for names with limited chars
		mat = pat.matcher("Ivan Shishkin");
		System.out.println("For a particular size: "+mat.matches());
		
		pat = Pattern.compile("\\w+\\W+\\w+"); //for alphanumeric passwords
		mat = pat.matcher("afimf#4df");
		System.out.println(mat.matches());

	}

}