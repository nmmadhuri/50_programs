package sep15;

public class SwapFun {

	public static  void SwapFun(int x, int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("The Values of X is"+x+"   Y is"+y);
		
		
		
		
	}
	public static void Swap(int x,int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("The Values of X is"+x+"   Y is"+y);

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x,y;
		
		SwapFun(10,20);
		Swap(30,40);
		
		

	}

}
