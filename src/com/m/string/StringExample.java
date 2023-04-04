package com.m.string;

public class StringExample {

	public static void main(String[] args) {
		// Using literal
		
		String s = "xyz"; // Pool memory

		//System.out.println(s.hashCode());
			
		String s1 = "abc";
		s.concat("abc");
		System.out.println(s);//String is immutable

		// by using new keyword
		/*String s2 = new String("abc");

		System.out.println(s2.hashCode());

		s2 = s2 + "xyz";
		System.out.println(s2);*/
		
		String str = new String("         Java Class     ");
		
		String str1 = new String ("Automation using Java");
		
		System.out.println("Char at index 3=" +str.charAt(3));//index of 3rd char
		
		System.out.println("Lenghth of String = " + str.length());//Length of String
		
		System.out.println("Substring =" + str.substring(5 , 10));//Prints char between 4 & 10
		
		System.out.println(str.contains("Java"));// checks string present or not
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.replace('J', 'K'));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.trim());
		
		int index1 = str1.indexOf("Java"); //returns first occurance of specified string
		System.out.println(index1);
		
		
		
		System.out.println(str.equalsIgnoreCase("java Class"));
		String str2 = "I Love India";
		
		//prints String Split
		String []strArr = str2.split(" ");
		strArr[0] = "I";
		strArr[1] = "am";
		strArr[2] = "Indian";
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		// using for each loop
		for(String abc: strArr) {
			System.out.println(abc);
		}
		
	}

}
