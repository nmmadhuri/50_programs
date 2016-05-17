package CollectionsExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Madhuri");
		alist.add("Kaushik");
		alist.add("Mallik");
		alist.add("Kruthi");
		/*String s=alist.get(0);
		System.out.println(s);*/
		
	/*	for(String s :alist){
			if(s !="null"){
				System.out.println("nothing to display");
				break;
			}
			else{
				System.out.println(s);
			}
			
		}*/
		
		Iterator<String> it =alist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
