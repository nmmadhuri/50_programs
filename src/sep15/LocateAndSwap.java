package sep15;

import java.util.Scanner;

public class LocateAndSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,swapcount=0;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int n=s.nextInt();
		int list[] =new int[n];
		System.out.println("Enter the array Elements:");
		for(int i=0;i<n;i++)
		{
			list[i]=s.nextInt();
		}
		
		for(int i=0;(i<n && (swapcount==0)); i++)
		{
			for(int j=i+1;j<n && (swapcount == 0);j++)
			{
				if(list[i]>list[j])
				{
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
					swapcount++;
					System.out.println(list[n]);				
				}				
			}
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(list[i]);
		}
		
	}
}

