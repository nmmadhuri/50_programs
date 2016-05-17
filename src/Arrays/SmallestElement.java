package Arrays;

public class SmallestElement {

	int smallest(int []arr)
	{
		int min;
		min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4324,43,3454,5654,23,34,345};
		SmallestElement se= new SmallestElement();
		System.out.println("The smallest element in the array is"+se.smallest(arr));

	}

}
