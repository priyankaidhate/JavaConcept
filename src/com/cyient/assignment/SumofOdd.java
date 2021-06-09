package com.cyient.assignment;
import java.util.Scanner;

public class SumofOdd {
		
		private static Scanner sc;
	public static void main(String[] args) {

			
				int maximum;
				sc = new Scanner(System.in);
				
				
				System.out.print(" Please Enter the Maximum value : ");
				maximum = sc.nextInt();	
				
				
			
				int i=1, oddsum = 0;
				
				for(i = 1; i <= maximum; i++)
				{
					if(i % 2 != 0)
					{
						oddsum = oddsum + i;  
					}
				}
				System.out.print(oddsum + " ");
			}
		}





