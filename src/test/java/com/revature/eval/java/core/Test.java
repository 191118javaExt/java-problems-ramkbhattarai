package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public static Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		if(string.contains("\n")) {
			//System.out.println("inside");
			string = string.replace("\n", "");
		}
		if(string.contains(","))
			string = string.replace(",", " ");
		//System.out.println(string);
		// TODO Write an implementation for this method declaration
		Map<String, Integer> ans = new HashMap<String, Integer>();
		String[] arr = string.split(" ");
		//System.out.println(Arrays.toString(arr));
		for(String s : arr) {
			System.out.print(s);
			if(ans.containsKey(s)) {
				//System.out.println("Inside if");
				 int i = ans.get(s);
				i++;
				ans.replace(s, i);
				
			}else {
				
				ans.put(s, 1);
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		wordCount("one,\ntwo,\nthree"); 
		//System.out.println(ans);
		//anobstacleisoftenasteppingstone
	//System.out.println(	isPrime(13));   gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt
		
	}

}
