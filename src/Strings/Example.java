package Strings;

public class Example {
	public static void main(String[] args) {
		String s="hello";
		System.out.println("before"+s.hashCode());
		s=s+"world";
		System.out.println("after"+s.hashCode());
		StringBuffer sf= new StringBuffer("hello");
		System.out.println("Before"+sf.hashCode());
		sf=sf.append("world");
		System.out.println("After"+sf.hashCode());
		
		}

}
