package com.java.liveprograms;

import java.util.StringJoiner;

public class StringJoinerExmple1 {
	/**
	 * 
	 * a:b:c
	 * 
	 * m,n
	 * 
	 */
	public static void main(String[] args) {
		
		
		StringJoiner sj = new StringJoiner(":", "[", "]");
	    sj.add("a").add("b").add("c");
	    System.out.println(sj);

}
}