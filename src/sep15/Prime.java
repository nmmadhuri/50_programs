package sep15;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		System.out.println("Enter the value");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		boolean isprime=false;
		for(int i=2;i<num/2;i++)
		{
			temp=num%i;	
		
		if(temp==0)
		{
			isprime =true;
			break;
		}
		
	
		}
		if(isprime==true)
		{
			System.out.println("The number is not a prime number");
		}
		else
		{
			System.out.println("The number is a prime number");
		}
		}

}
