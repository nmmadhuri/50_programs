package sep15;

public class CommonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []list1={10,12,14,43,35,65};
		int []list2={32,53,14,35,43,75};
		for(int i=0;i<list1.length;i++)
		{
			for (int j=0;j<list2.length;j++)
			{
				if (list1[i]==list2[j])
				{
					System.out.println("The common Elements in the array are:"+list1[i]);
					
				}
			}
		}
		

	}

}
