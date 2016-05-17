package sep15;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] list ={10,5,13,12,4,7,54,43,66,34};
		int max=list[0];
		for (int i=0;i<list.length;i++)
		{
			if(max<list[i])
			{
				max =list[i];
			}
			
		}
		System.out.println("The largest Array element is " +max);
		

	}

}
