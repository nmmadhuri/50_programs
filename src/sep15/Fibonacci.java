package sep15;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int limit=20;
		 long [] list= new long[limit];
		 list[0]=0;
		 list[1]=1;
		 
		 for( int i=2;i<limit;i++)
		 {
			 list[i]=list[i-1]+list[i-2];
			 
		 }
		 
		 System.out.println("the fibinocci series upto   "+limit);
		 for(int i=0;i<limit;i++)
		 {
			 System.out.print(list[i]+"  ");
		 }
		 
	}

}
