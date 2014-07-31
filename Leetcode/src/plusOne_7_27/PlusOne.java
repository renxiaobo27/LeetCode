package plusOne_7_27;


public class PlusOne {

	public int[] fun(int []A)
	{
		int i;
		for(i=A.length-1;i>=0;i--)
		{
			if(A[i]!=9)
			{
				A[i]++;
				break;
			}
			else 
				A[i] = 0;
		}
		
		if(i<0)
		{
			int []res = new int[A.length + 1];
			res[0] = 1;
			System.arraycopy(A,0,res,1,A.length);
			return res;
		}
		
		return A;
	}
}
