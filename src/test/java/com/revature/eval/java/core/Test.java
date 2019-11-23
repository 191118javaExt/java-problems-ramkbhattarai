package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		if(string.contains("\n"))
			string.replace("\n", "");
		if(string.contains(","))
			string = string.replace(",", " ");
		// TODO Write an implementation for this method declaration
		Map<String, Integer> ans = new HashMap<String, Integer>();
		String[] arr = string.split(" ");
		for(String s : arr) {
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
		 //isLuhnValid("055-444-285"); 
		//System.out.println(ans);
		//anobstacleisoftenasteppingstone
	//System.out.println(	isPrime(13));   gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt
		
	}

}
