package sep15;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the Starting value of n:");
		int n1=kb.nextInt();
		System.out.println("Enter the Ending value of n:");
		int n2=kb.nextInt();
		
		int total=0;
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			total+=i;
			
		}
		int []list={11,12,13,14,15,17,18,19,20};
		/*if (n != list.length+1)
		{
			System.out.println("Error, array size"+list.length+" not as expected for value n" + n);
		}*/
		for(int i=0;i<list.length;i++)
		{
			sum+=list[i];	
		}
		System.out.println("The Missing letter in the array is:" +(total-sum));
		
		
		
	}

}
