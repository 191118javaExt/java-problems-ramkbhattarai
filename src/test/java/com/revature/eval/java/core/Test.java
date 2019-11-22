package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static  boolean isPrime2(long n) {
		if(n < 2) return false;
		long i = 2;
		while( i <= n/i) {
			if(n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public  static List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		List<Long> ans = new ArrayList<>();
		long i  =2;
		while( l > 1) {
			//System.out.println("i = " + i);
			//System.out.println("l = " + l);
			if(isPrime2(i) && l % i == 0) {
				ans.add(i);
				l /= i;
			}else {
				i++;
			}
			
		}
		for(long a : ans) {
			System.out.println(a);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		calculatePrimeFactorsOf(9);   //anobstacleisoftenasteppingstone
	//System.out.println(	isPrime(13));   gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt
		
	}

}
