package sep15;

import java.util.Scanner;

public class Factorial {
	public static void main(String [] args)
	{
		int fact=1;
		   System.out.println("Enter the positive integer:");
	       Scanner kb = new Scanner(System.in);
	       int n=kb.nextInt();
	       kb.close();
	       

		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
    System.out.println("Factorial of"+n+"is"+" "+fact);
	}
}
