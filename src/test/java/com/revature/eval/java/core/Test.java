package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	
	public static boolean isNumeric(String strNum) { // this is the helper function to check whether it is a digit or not
    return strNum.matches("-?\\d+(\\.\\d+)?");
}
	

	public static boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		string = string.replace("-", "");
		String[] arr = string.split("");
		String lastEle = arr[arr.length -1];
		if(!isNumeric(lastEle)) {
			if(!lastEle.equals("X")) {
				System.out.println("inside first if");
				return false;
			}
		}
		int i = 10;
		int sum = 0;
		for(int k = 0; k < arr.length - 1; k++) {
			int j = Integer.parseInt(arr[k]);
			//System.out.println(j);
			sum += j * i;
			i--;
		}
		
		if(lastEle.equals("X")) {
			sum += 10;
		}else {
			sum += Integer.parseInt(lastEle) * 1;
		}
		System.out.println("sum = " + sum + "  sum mod 11 = " + sum % 11);
		if(sum % 11 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isValidIsbn("3-598-21507-0"));   //anobstacleisoftenasteppingstone
	//System.out.println(	isPrime(13));   gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt
		
	}

}
