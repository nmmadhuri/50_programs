package sep15;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=s.nextInt();
		int list[] =new int[n];
		System.out.println("Enter all the elements in the list:");
		
		for(int i=0;i<n;i++)
		{
			list[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(list[i]>list[j])
				{
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for(int i=0;i<n;i++)
		{
			System.out.println(list[i]);
		}
		//System.out.println(list[n-1]);
		
		}
		
	}
