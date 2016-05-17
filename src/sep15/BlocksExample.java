package sep15;

public class BlocksExample {
	
	BlocksExample()
	{
		System.out.println("U r inside the constructor");
	
	}
	static int num;
	static{
		System.out.println("This is static Block1");
		num=25;
	}
	
	static {
		System.out.println("This is static Block2");
		num=125;
	}
	
	public static  void methodExample()
	{
		System.out.println("This is a static Method");
		
	}
	
	public static void main(String[] args) {
		
		BlocksExample be = new BlocksExample();
		
		methodExample();
		//System.out.println(num);
	}

}
