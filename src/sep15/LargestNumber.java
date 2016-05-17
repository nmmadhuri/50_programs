package sep15;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []list={10,2,8,14,23,15,45,32,21,43};
			int temp=list[0];
			for(int i=0;i<list.length;i++)
			{
				if(list[i]>temp)
				{
					temp=list[i];
				}
				
			}
			System.out.println("The Largest number in the Array is:" +temp);
			
			
	}
}