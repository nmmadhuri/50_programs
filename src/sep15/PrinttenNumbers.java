package sep15;

public class PrinttenNumbers {
	static void recursivePrint(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			recursivePrint(n+1);
			
		}
	}
	public static void main(String[] args) {
		recursivePrint(1);
	}

}
