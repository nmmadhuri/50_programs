package sep15;

public class SortExample {
	
	public static void main(String[] args){
		int a[]={43,23,45,42354,656};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++)
			{ if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
			}
		}
		System.out.println("The sorted array is \n");
		for(int i=0;i<a.length;i++){
			
		System.out.println(a[i]);
		}
		
		
	}
}
