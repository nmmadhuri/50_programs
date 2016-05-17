package sep15;

public class FactorialRec {
	public static  double FactorialRecur(int n)
	{
		double fact;
		if(n<1||n==1)
		{
			fact= 1;	
		}
		else
		{
			 fact = n * FactorialRecur(n-1);
		}
		
		return fact;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Factorial of  is  "+FactorialRecur(4));

		
		
	}

}
