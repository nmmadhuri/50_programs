package sep15;

import java.util.Scanner;

public class Swap {
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the value of X:");
		int x,y,temp;
		x=kb.nextInt();
		System.out.println("Enter the value of Y:");
		y=kb.nextInt();
		temp=x;
		x=y;
		y=temp;
		System.out.println("The Value of X is"+x);
		System.out.println("The Value of Y is"+y);
		
		
		
		
	}

}
