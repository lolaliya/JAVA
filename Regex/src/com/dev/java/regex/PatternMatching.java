package com.dev.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching 
{
	public static void main(String[] args)
	{
		Pattern pat = Pattern.compile("\\d"); 	//  "\" do not work for
		// java so using with "\\"
		/*
		 * compile() is used to give the type of pattern to be matched
		 */
		Matcher mat = pat.matcher("1");	// gives true only for the values 
		//between 0to9 but false with any other digits
		System.out.println("for \\d"+mat.matches()); // matches() has the return type of boolean


		pat = Pattern.compile("\\d");
		mat = pat.matcher("1234585");
		System.out.println("for \\d"+mat.matches());


		pat = Pattern.compile("\\d+"); // "\\d+" matches the number with more than 1digit 
		mat = pat.matcher("1234585");
		System.out.println("for \\d+"+mat.matches());


		pat = Pattern.compile("\\D"); // "\\D" matches a non digit single value
		mat = pat.matcher("e");
		System.out.println("for \\D"+mat.matches());


		pat = Pattern.compile("\\D+"); // "\\D+" matches a non digit multiple values
		mat = pat.matcher("erys");
		System.out.println("for \\D+"+mat.matches());


		pat = Pattern.compile("\\D"); // "\\D"  cannot match a digit or multiple values
		mat = pat.matcher("1");
		System.out.println("for \\D"+mat.matches());


		pat = Pattern.compile("\\w"); // "\\w"  matches a alphabets or a digit single value
		mat = pat.matcher("1");
		System.out.println("for \\s+"+mat.matches());


		pat = Pattern.compile("\\w+"); // "\\w+"  matches a alphabets or a digit multiple value
		mat = pat.matcher("1hdg65");
		System.out.println("for \\s+"+mat.matches());


		pat = Pattern.compile("\\W"); // "\\W"  matches a single special charecter. this doesnot match with alphabets or digits
		mat = pat.matcher("@");
		System.out.println("for \\s+"+mat.matches());


		pat = Pattern.compile("\\W+"); 	// "\\W+"  matches Multiple special charecters. this doesnot match with alphabets or digits
										// used to filter data with no alphabets or numerics
		mat = pat.matcher("@&^%");
		System.out.println("for \\s+"+mat.matches());


		pat = Pattern.compile("\\s"); // "\\s"  matches a single widespace. this doesnot match with alphabets or digits
		mat = pat.matcher(" ");
		System.out.println("for \\s+"+mat.matches());
		
		
		pat = Pattern.compile("\\s+"); // "\\s"  matches a single widespace. this doesnot match with alphabets or digits
		mat = pat.matcher("     ");
		System.out.println("for \\s+"+mat.matches());

		pat = Pattern.compile("\\s+");
		mat = pat.matcher("     ");
		System.out.println("for \\s+"+mat.matches());



	}
}
