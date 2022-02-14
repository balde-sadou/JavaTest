package com.techjava;



public class Main {

	public static void main(String[] args) 
	  {
		Main elem = new Main();
	    for(int i=1;i<100;i++){
	    	System.out.println(elem.convert(i));
	    }
	    
	  }
	 
	public  String convert(int toConvertToFizzBuzz) { 

		  if(toConvertToFizzBuzz%5==0){ 
		    return "Buzz"; 
		  } 

		  if(toConvertToFizzBuzz%3==0){ 
		    return "Fizz"; 
		  } 

		  return String.valueOf(toConvertToFizzBuzz); 
		} 
	    
}
