package com.example.exercise2;
import java.util.*;// To get math library
public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // power of 7 raised to 9
		int base , exponent;
		double result;
		
		base = 7;
		exponent = 5;
		result = Math.pow(base,exponent);
		System.out.println("power of 7 rasied to 5 is :"+result);
		
		// Square root of 88
		double number= 88;
		double squareRoot= Math.sqrt(number);
		System.out.println("square root of 88 is :"+squareRoot);
		
		// rounding 5.2 into 5.0
		double value = 5.2;
		double roundNumber=Math.round(value);
		System.out.println("Rounding 5.2 is :"+roundNumber);
		
		// rounding 7.8 into 8.0
		double figure = 7.8;
		double RoundNumber=Math.round(figure);
		System.out.println("rounding of 7.8 is :"+RoundNumber);
		
		// ceiling 3.01 into 4.0
		double amount=3.01;
		double ceilNumber=Math.ceil(amount);
		System.out.println("ceiling of 3.01 is :"+ceilNumber);
		// value of PI
		double answer=Math.PI;
		System.out.println("value of pi is:"+answer);
		
		System.out.println("program by hardik mehta");
		
		int x=5,y=7;
		int ans=x++ + ++y;
		System.out.println(ans);
	}

}
