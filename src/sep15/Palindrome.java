package sep15;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse=" ";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		original = in.nextLine();
		
		int len=original.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
			
		}
		System.out.println("The reversed String is "+reverse);
		
		 if(original.equalsIgnoreCase(reverse))
		 {
			 System.out.println("The string is a palindrome");
			 
		 }
		 else
		 {
			 System.out.println("The Entered String is not a palindrome");
		 }
	}

}
