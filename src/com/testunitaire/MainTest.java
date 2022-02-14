package com.testunitaire;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.techjava.Main;


class MainTest {

	@Test
	public void testIterateFunctionFizz() {
		Main fizzBuzz = new Main();
		for (int i = 1; i <= 100; i++) {
	        if ((i % 3 == 0) && !(i % 5 == 0)) {
	            assertEquals("Fizz", fizzBuzz.convert(i));
	        }
	    }
		
	}  
	@Test
	public void testIterateFunctionBuzz() {
		Main fizzBuzz = new Main();
		for (int i = 1; i <= 100; i++) {
	        if (!(i % 3 == 0) && (i % 5 == 0)) {
	            assertEquals("Buzz", fizzBuzz.convert(i));
	        }
	    }	
	}
	@Test
	public void testIterateFunctionValue() {
		Main fizzBuzz = new Main();
		for (int i = 1; i <= 100; i++) {
	        if (!(i % 3 == 0) && !(i % 5 == 0)) {
	            assertEquals(String.valueOf(i), fizzBuzz.convert(i));
	        }
	    }	
	}
}
