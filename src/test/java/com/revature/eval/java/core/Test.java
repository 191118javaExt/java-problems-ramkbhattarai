package com.revature.eval.java.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static boolean includes(String[] arr, String s) { // helper method
		for(String s1 : arr) {
			if(s.equals(s1)) {
				return true;
			}
		}
		return false;
	}
	
	public static String decode(String string) {
		if(string.contains(" "))
			string = string.replace(" ", "");
		String[] arr = "abcdefghijklmnopqrstuvwxyz".split("");
		String ans = "";
		for(int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			String s = Character.toString(ch).toLowerCase();
			if(includes(arr,s)) {
				int idx = Arrays.asList(arr).indexOf(s);
				int newIdx = (arr.length - idx - 1);
				ans += arr[newIdx];
				}
			else {
					ans += s;
				}
		}
		// TODO Write an implementation for this method declaration
		System.out.println(ans);
		return ans;
	}
	
	public static void main(String[] args) {
		decode("gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt");   //anobstacleisoftenasteppingstone
	//System.out.println(	isPrime(13));   gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt
		
	}

}
