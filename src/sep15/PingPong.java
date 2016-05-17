package sep15;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner kb=new Scanner(System.in);
		int n;
		n=kb.nextInt();
		kb.close();
		
		if(n%3 == 0)
		{
			System.out.println("Ping");
			
		}
		if(n%5 ==0)
		{
			System.out.println("Pong");
				
		}
		
		if((n%3==0) && (n%5==0))
		{
			System.out.println("Ping Pong");
			
		}
		if((n%3!=0) && (n%5!=0))
		{
			System.out.println(n);
		}
		
	}

}
