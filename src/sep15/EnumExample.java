package sep15;


public class EnumExample
{
	public static void main(String[] args) {
	
		for(Months m:Months.values())
		{
			System.out.println(m);
		}
		
	}
}
enum Months
{
	JANUARY , FEBURARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,
	NOVEMBER,DECEMBER;
}


