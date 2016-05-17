package sep15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedINput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the First NUmber:");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Enter the Second Number:");
		int num2=Integer.parseInt(br.readLine());
		
		System.out.println("The difference of 2 Numbers is:" +(num1-num2));
		

	}

}
