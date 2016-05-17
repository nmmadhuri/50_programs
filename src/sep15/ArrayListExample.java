package sep15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String > alist= new ArrayList<>();
		alist.add("Madhuri");
		alist.add("Swetha");
		alist.add("kruthi");
		System.out.println("The records in the ArrayList are:");
		Iterator<String> it = alist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("The records in the reverse order are:");
		ListIterator<String> li = alist.listIterator(alist.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}