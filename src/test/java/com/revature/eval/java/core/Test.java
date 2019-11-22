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
	

	
	public static String rotate(String string, int key) {
		// TODO Write an implementation for this method declaration
		String[] alp = "abcdefghijklmnopqrstuvwxyz".split("");
		String[] ALP = "abcdefghijklmnopqrstuvwxyz".toUpperCase().split("");
		String ans = "";
		for(int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			String s = Character.toString(ch);
			boolean test = Character.isUpperCase(ch);
			
			if(test) {
				if(includes(ALP,s)) {
					int idx = Arrays.asList(ALP).indexOf(s);
					int newIdx = (idx + key) % alp.length;
					ans += ALP[newIdx];
					}else {
						ans += s;
					}
				
			}else {
				if(includes(alp,s)) {
					int idx = Arrays.asList(alp).indexOf(s);
					int newIdx = (idx + key) % alp.length;
					ans += alp[newIdx];
					}else {
						ans += s;
					}
				
			}
			
			//System.out.println(includes(alp, s));
			
			
		}
		//System.out.println(ans); //Xiwxmrk 1 2 3 xiwxmrk   Gzo'n zvo, Bmviyhv!
		return ans;
	}
	
	public static void main(String[] args) {
		rotate("Gur dhvpx oebja sbk whzcf bire gur ynml qbt.",13);
		
		
	}

}
