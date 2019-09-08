package com.dev.java.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CharecterMatching {

	public static void main(String[] args) 
	{
		Pattern pat = Pattern.compile("\\w+\\s\\w+\\s\\w+");
		Matcher mat = pat.matcher("Nisarga Gangadkar DC");
//		System.out.println("for \\w+\\s\\w+ : "+mat.matches());
//
//		pat = Pattern.compile("\\w+\\s\\w+\\s\\w+"); 
//		mat = pat.matcher("Nisarga Gangadkar DC");
//		System.out.println("for \\w+\\s\\w+ : "+mat.matches());

		pat = Pattern.compile("[A-Za-z]{5,10}\\s[A-Za-z]{1,10}\\s[A-Za-z]{1,10}"); //for names with limited chars
		mat = pat.matcher("Nisu Gangadkar DC");
		System.out.println("For a particular size: "+mat.matches());

//		pat = Pattern.compile("[A-Za-z]{1,15}\\s[A-Za-z]{1,15}"); //for names with limited chars
//		mat = pat.matcher("some thing");
//		System.out.println("For a particular size: "+mat.matches());
//
//		pat = Pattern.compile("[A-Za-z]{1,25}"); //for names with limited chars
//		mat = pat.matcher("Ivan Shishkin");
//		System.out.println("For a particular size: "+mat.matches());
//
//		pat = Pattern.compile("[A-Za-z]{0,25}"); //for names with limited chars
//		mat = pat.matcher("Ivan");
//		System.out.println("For a particular size: "+mat.matches());
//
//		pat = Pattern.compile("[0-9]{0,5}"); //for numbers with limited digits
//		mat = pat.matcher("1");
//		System.out.println("For a particular size: "+mat.matches());
//
//		pat = Pattern.compile("[0-9]{0,5}\\s[0-9]{0,2}"); //for numbers with limited digits
//		mat = pat.matcher("1 3");
//		System.out.println("For a particular size: "+mat.matches());
//
//		pat = Pattern.compile("[0-9]{0,5}\\s[0-9]{0,2}"); //for numbers with limited digits
//		mat = pat.matcher("1 354");
//		System.out.println("For a particular size: "+mat.matches());
//
//		pat = Pattern.compile("\\w+\\@\\w+\\.\\w+"); //for email matching
//		mat = pat.matcher("abcd123@xyx.def");
//		System.out.println("For a email: "+mat.matches());

		pat = Pattern.compile("\\w+\\@\\w+\\.\\w+"); //for email matching
		mat = pat.matcher("abcd123&xyx*def");
		System.out.println("For a email: "+mat.matches());

	}

}
