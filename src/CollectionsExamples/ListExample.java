package CollectionsExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListExample {
	static void accessElements(ArrayList<String> list)
	{
		ListIterator <String> it = list.listIterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}

	public static void main(String[] args) {
	
		
		ArrayList<String> aList = new ArrayList<>();
		aList.add("Madhuri");
		aList.add("Madhuri1");
		
		ListIterator<String> li = aList.listIterator(aList.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
