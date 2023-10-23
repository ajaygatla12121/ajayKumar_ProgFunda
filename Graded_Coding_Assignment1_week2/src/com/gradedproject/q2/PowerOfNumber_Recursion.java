package com.gradedproject.q2;

public class PowerOfNumber_Recursion {

	//Recursion Method for calculating the Power of Number
	public int power(int x, int n) {

		//Condition for Terminating the process
		if(n==0) {
			return 1;
		}

		//core logic for calculating the Power of Number
		int result = x*power(x, n-1);

		//returning the output to method
		return result;
	}

}
