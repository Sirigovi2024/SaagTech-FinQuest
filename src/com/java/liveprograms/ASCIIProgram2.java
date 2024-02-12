package com.java.liveprograms;

public class ASCIIProgram2 {
	    public static void main(String[] args) {

	        for (int i = 0; i <= 256; i++) {
	            System.out.print(i + " : ");
	            // Convert the integer to a character and then print its ASCII value
	            System.out.println((char) i);
	        }
	    }
	}
