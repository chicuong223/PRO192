package DTO;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyValidation {
	private static Scanner sc;

	//check whether number is >=min and >=max
	public static boolean checkNumber(int number, int min, int max) throws Exception {
		if(number <min || number >max)
			throw new Exception();
		return true;
	}
	
	//input an integer and check whether it is >=min and <=max
	public static int inputNumber(int min, int max) throws Exception {
		sc = new Scanner(System.in);
			int number = sc.nextInt();
			if (number < min || number >max)
				throw new Exception();
			return number;
		}
	
	//input a string and check whether it is empty
	public static String inputString() throws Exception {
		sc = new Scanner(System.in);
		String s="";
		s=sc.nextLine();
		if(s.isEmpty()) throw new Exception();
		return s;
	}
	
	//input a string and check whether it matches the pattern
	//input: pattern string
	//output: inputed string matches pattern
	public static String inputString(String pattern) throws Exception {
		sc = new Scanner(System.in);
		String s="";
		s=sc.nextLine();
		Pattern pat = Pattern.compile(pattern);
		Matcher mat = pat.matcher(s);
		if(s.isEmpty() || mat.matches()==false) throw new Exception();
		return s;
	}
	
}
