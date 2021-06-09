package advanceforloop;
import java.util.Scanner;

public class Programs {
	
	private static Scanner sc;
public static void main(String[] args) {

		
			int maximum, oddSum = 0;
			sc = new Scanner(System.in);
			
			
			
			System.out.print(" Please Enter the Maximum value : ");
			maximum = sc.nextInt();	
			
			
		
			int i=1, sum = 0;
			
			for(i = 1; i <= maximum; i++)
			{
				if(i % 2 != 0)
				{
					sum = sum + i;  
				}
			}
			System.out.print(sum + " ");
		}
	}


