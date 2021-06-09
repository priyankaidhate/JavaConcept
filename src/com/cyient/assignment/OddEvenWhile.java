package com.cyient.assignment;

public class OddEvenWhile {
public static void main(String[] args) {
	int limit = 30;
    int num = 0;

    System.out.println("Printing Even numbers between 0 and " + limit);

    while (num <= limit) {
        num++;
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

        // if the number is divisible by 2 then it is even
       // if( number % 2 == 0){
          //  System.out.print(num + " ");
        }
}
}


