
package com.cyient.assignment;

public class OddEven {
public static void main(String[] args) {
	int n = 30;
	System.out.print("Even Numbers from 0 to "+n+" are:\n ");
	for (int i = 0; i <= n; i++) {
	   //if number%2 == 0 it means its an even number
	   if (i % 2 == 0) {
		System.out.print(i  + " ");
		
	   }
	   
	}
	System.out.print("Odd Numbers from 0 to "+n+" are: \n");
	for (int i = 0; i <= n; i++) {
	   //if number%2 == 0 it means its an even number
	   if (i % 2 != 0) {
		System.out.print(i + " ");
	   }
	
}
}
}