package com.m.string;

public class StringMethods {
	

		public static void main(String[] args) {
		
			String First = "Jai Jai ";				//First literals String created
			System.out.println("String First : "+First);
			
			int length = First.length();			//Get length of String using Length() Method
			System.out.println("First String Length : "+length); //Printing Length of String
			
			String Second = "Ram Krishna Hari...";
			
			String joinedString = First.concat(" "+Second); //Joining Two Strings using concat() method
			System.out.println(joinedString);
			System.out.println(First+" "+Second); 			//Joining Two String using +
			
			String Third = "Jai Jai";
			
			boolean comp1 = First.equals(Second);			//Comparing First & Second String Using equals()method.
			System.out.println("String First & Second equals : "+comp1); //Printing Result
			
			boolean comp2 = First==Third;			//Comparing First & Third String Using ==operator.
			System.out.println("String First & Third equals : "+comp2); //Printing Result
			
			
			String example = "This is the \"String\" class.";   // use the "Escape" character
			//String example = "This is the "String" class.";  //Compile Time error.
			System.out.println(example);
			
			
			String str1 = new String ("     Shree Swami Samartha       "); //Created new String using new keyword
			boolean str1result= str1.contains("Swami");			//check if str1 contains "Swami" using contains() Method
			System.out.println("String str1 Contain \"Swami\" : "+str1result); //contains() method is case-sensitive
			
			System.out.println(str1.charAt(11));
			
			System.out.println(str1.indexOf('h'));
			
			
			
			String str2 = str1.substring(0, 9); //extract substring from index 0 to 4 using "substring() Method"
			
			System.out.println("Extracting using Substring : "+str2);
			System.out.println(str1.substring(5)); //Without End Index method print string from give index and escape earlier String
			
			String joinstr = String.join(" ",Third,str1);	// join strings with space between them using "String.join() Method"
			System.out.println("String.join() Method : "+ joinstr);
			
			String name = "kadam";
			String n1 = name.replace('a', 's'); //"replace() method" change all occurrences of characters
			System.out.println(name+ " "+n1);
			System.out.println("Printing name by replace() method : "+name.replace("kadam", "Amit")); //replace in run time
			System.out.println("name after replace() method : "+name); //
			System.out.println(str1.trim());
			
			
		    System.out.println("To Lower Case : "+str1.toLowerCase()); // toLowerCase() convert to lower case letters
		    System.out.println("To Upper Case : "+str1.toUpperCase()); // toUpperCase() convert to lower case letters
		    
		 
		    System.out.println("startsWith() Method : "+str1.startsWith("Shree"));// checks if string starts with "Shree"
		    System.out.println("startsWith() Method : "+str1.endsWith("Shree"));// checks if string ends with "Shree"
		    
		    
		    System.out.println("Hashcode of Str1 : "+name.hashCode());
		    
		    
			

		}

	}

