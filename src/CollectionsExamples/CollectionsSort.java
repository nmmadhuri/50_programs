package CollectionsExamples;
import java.util.*;

import java.util.ArrayList;

public class CollectionsSort {
	static ArrayList<Integer>  sorting(ArrayList<Integer> list)
	{
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
				 int temp= list.get(i);
				 list.set(i,list.get(j));
				 list.set(j, list.get(i));
				}
			}
		}
		
		//System.out.println("The sorted  list is : "+list);
		return list;
	}		

	public static void main(String[] args) {
	 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(23);
		list1.add(21);
		list1.add(4);
		list1.add(44);
		list1.add(1);
		
	sorting(list1);
	
	ListIterator<Integer> ll= new List
	
	
	
		
		
}
}

   