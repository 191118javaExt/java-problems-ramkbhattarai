package com.revature.eval.java.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static  boolean isPrime(int n) {
		if(n < 2) return false;
		int i = 2;
		while( i <= n/i) {
			if(n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static int calculateNthPrime(int i) {
		if(i < 1) {
			throw new IllegalArgumentException();
		}
		int count = 0;
		int j = 2;
		int ans = 0;
		while(count < i) {
			if(isPrime(j)) {
				ans = j;
				//System.out.println(ans);
				count++;
			}
			//System.out.println("check");
			j++;
		}
		System.out.println(ans);
		// TODO Write an implementation for this method declaration
		return ans;
	}
	
	public static void main(String[] args) {
		calculateNthPrime(10001);
	//System.out.println(	isPrime(13));
		
	}

}
