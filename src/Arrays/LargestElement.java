package Arrays;

public class LargestElement {
	
	int largest(int []arr){
		 
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max < arr[i]){
				max=arr[i];
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int []arr={25,10,43,65,534,43};
		LargestElement a= new LargestElement();
		int i=a.largest(arr);
		
		
		System.out.println("The largest element in the array is"+i);
		
	}
	
}
