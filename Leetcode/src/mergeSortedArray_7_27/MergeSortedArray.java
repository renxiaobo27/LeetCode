package mergeSortedArray_7_27;

public class MergeSortedArray {

	public void fun(int[]A,int m,int[]B,int n)
	{
		int i = m-1;
		int j = n-1;
		int pos = m + n - 1;
		
		while(pos>=0)
		{
			if(j<0||( i>=0 && A[i]>B[j])) 
				A[pos--] = A[i--];			
			else
				A[pos--] = B[j--];

		}
		
	}
	
	public  static void main(String[]str)
	{
		int []A = new int[0];
		int []B = new int[1];
		B[0] = 1;
		MergeSortedArray m = new MergeSortedArray();
		m.fun(A, 0, B, 1);// the A should have enough memory for B, otherwise this is the problem case.
	}
}


//int i = m-1,
//j = n-1,
//k = m+n-1;        
//while(k>=0){
//if(j<0 || (i>=0 && A[i]>B[j]))
//    A[k--]=A[i--];
//else
//    A[k--]=B[j--];