package singleNumber2_7_20;

public class SingleNumber2 {

	public int singleNumber2(int []A)
	{
		int one = 0;
		int two = 0;
		int three = 0;
		
		for(int i=0;i<A.length;i++)
		{
			two |= one&A[i];
			one ^= A[i];
			three = one & two;
			one &= ~three;
			two &= ~three;
		}
		return one;
	}
}
