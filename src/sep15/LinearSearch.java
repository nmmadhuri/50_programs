package sep15;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
	
		System.out.println("Enter the number of integers:");
		int n=in.nextInt();
		
		int c,search;
		int[] array;
		System.out.println("Enter "+n+"number of Integers:");
		array=new int[n];
		
		for( c=0;c<n;c++)
		{
			array[c]=in.nextInt();
			
		}
		System.out.println("Enter the value to find:");
		search = in.nextInt();
		for(c=0;c<n;c++)
		{
			if(array[c]==search)
			{
				System.out.println(search+"is present at a location"+(c+1));
				break;
			}
			if(c==(n-1))
			{
				System.out.println("The"+search+" is not in the given array ");
				
			}
			
		}
		
		
		
	}
}

