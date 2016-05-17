package sep15;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the original String:");
		original=in.nextLine();
		 int len=original.length();
		 
		 for(int i=len-1;i>=0;i--)
		 {
			 reverse=reverse+original.charAt(i);
			 
			
		 }
		 System.out.println("THe reversed String is      "+reverse);
		 
		
			 
		 
		 
		
	}

}
