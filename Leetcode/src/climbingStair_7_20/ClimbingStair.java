package climbingStair_7_20;

public class ClimbingStair {

	public int climb(int n)
	{
		if(n<=1) return 1;
		
		return climb(n-1) + climb(n-2);
	}
	
	public int climb2(int n)
	{
		if(n==1 || n==2)
			return n==1?1:2;
		int a = 1;
		int b = 2;
		int c = 0 ;
		for(int i=0;i<n-2;i++)
		{
			 c = a + b;
			 a = b;
			 b = c;
			 
		}
		return c;
	}
	public static void main(String[]str)
	{
		ClimbingStair c = new ClimbingStair();
		System.out.println(c.climb(5 ));
		System.out.println(c.climb2(5 ));
	}
}
