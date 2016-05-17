package CollectionsExamples;
import java.util.*;

public class SortListExample {
	
	static ArrayList<Integer> sortList(ArrayList <Integer> list)
	{
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		
		ArrayList <Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(12);
		list1.add(5);
		list1.add(24);
		list1.add(2);
		list1.add(45);
		list1.add(75);
		list1.add(38);
		sortList(list1);
		for(Integer i : list1)
		{
		System.out.println("The list after sorting" +i);	
		}
		
	}
}
