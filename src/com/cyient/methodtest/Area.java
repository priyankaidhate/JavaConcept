package com.cyient.methodtest;

public class Area {
	public static double  areaOfTriangle(int b,int h)
	{
		
		double area=(b*h)/2;
		return area;
	}
	public static double  areaOfCircle(int r)
	{
		
		double area= 3.14 * r*r;
		return area;
	}
	public static double  areaOfrectangle(int l,int w)
	{
		
		double area=l*w;
		return area;
	}
	
	public  double  areaOfSquare(int a)
	{
		
		double area=a*a;
		return area;
	}
	
	public static double  areaOfTrapezium(int a,int b,int h)
	{
		
		double area=((a+b)*0.5)/h;
		return area;
	}
	
}
