package com.m.exceptionhandling;

public class TestCustomException {

	public static void main(String[] args) {
		try  
        {  
            // throw an object of user defined exception  
            throw new CustomExceptionExample();  
        }  
        catch (CustomExceptionExample ex)  
        {  
            System.out.println("Caught the exception");  
            System.out.println(ex.getMessage());  
        }  
  
        System.out.println("rest of the code...");    
    }  



	}


