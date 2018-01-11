package com.ustglobal.demo.ci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
	
      public static int sumOfTwoNumbersTest(int a, int b) throws IOException{
		
		int c1;
    	c1 = a+b;
    	System.out.println("\nSum of two numbers:"+ c1);
		return c1;
    	    
	}
	
      public static String sumOfTwoNumbersTest(int a, String b) throws IOException{
  		
  		int c1 = 0;
  		try{
      	c1 =a+Integer.valueOf(b);
  		}
  		catch(Exception e){
  			return "please enter the valid inputs";
  			
  		}
  		
      	System.out.println("\nSum of two numbers:"+ c1);
		return null;
      	    
  	}
	
	
	public static String sumOfTwoNumbers() throws IOException{
		
		int a,b,c = 0;
    	BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
    	System.out.println("Enter the two numbers to add:");
    	a=Integer.parseInt(br.readLine());
    	b=Integer.parseInt(br.readLine());
    	c = a+b;
    	System.out.println("\nSum of two numbers:"+ c);
    	    	
		return String.valueOf(c);
    	    
	}
	
	
	
	
	
    public static void main( String[] args ) throws IOException
    {
    	sumOfTwoNumbers();
    	
    	
    	    }
}
