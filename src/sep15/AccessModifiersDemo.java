package sep15;

public class AccessModifiersDemo {
	
	public static String PublicDemo()
	{
		return "This is Public Access Modifier Demo";
		
	}
	
	private static String PrivateDemo(){
		
		return "This is Private Access Modifiers Demo";
	}
	
	protected static String ProtectedDemo()
	{
		return "This is Protected Access Modifiers Demo";
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Message returned from public:    "+PublicDemo() +"\n");
		System.out.println("Message returned from private:    "+PrivateDemo() +"\n");
		System.out.println("Message returned from protected:   	"+ProtectedDemo() +"\n");
		
		
	}
}
	

