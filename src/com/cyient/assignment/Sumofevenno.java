package com.cyient.assignment;

public class Sumofevenno {

	
	public static void main(String[] args) {
		
		
		int n =50, sum = 0;
		System.out.print("list of even numbers from 0 to "+n+" :");
		for(int i=0;i<=n;i++)
		{
			if(i % 2 == 0)
			{
				sum = sum + i;  
				System.out.print( sum + " " );
			}
		}
			
			if(sum % 2==0)
			{
				System.out.print("even ");
			}
			else
			{
				System.out.print("odd");
				}
		

		
		
	}
	}


