/*Xiaobo June 25 2014*/
package uniqueBinarySearchTree;

public class UniqueBinarySearchTree {
	
	public static int numTree(int n)
	{
		if(n==0) return 1;
		if(n==1) return 1;
		int []re = new int[n+1];
		re[0] = 1;
		re[1] = 1;
		for(int i=2;i<n+1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				re[i] += re[i-j]*re[j-1];
			}
		}
		
		return re[n];
	}

	public static void main(String []str)
	{
		
		System.out.println("numTree\t"+numTree(4));
	}
}
