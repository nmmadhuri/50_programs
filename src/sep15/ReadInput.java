package sep15;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Enter the String to Print");
			Scanner input = new Scanner(System.in);
			String str= input.nextLine();
			System.out.println("The Entered String is" + "      " +str);
	}

}
