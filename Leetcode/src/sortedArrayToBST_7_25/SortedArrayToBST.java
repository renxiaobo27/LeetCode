package sortedArrayToBST_7_25;

//import sameTree_6_22.TreeNode;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public  TreeNode (int x)
	{
		val = x;
	}
}
public class SortedArrayToBST {
	
	TreeNode fun(int[] num)
	{
		return BuildTree(num,0,num.length);
		
	}

	TreeNode BuildTree(int []num,int start,int end)
	{
		if(start>end) return null;
		int mid = start + ((end-start)>>1);
		TreeNode  root = new TreeNode(num[mid]);
		
		root.left  = BuildTree(num,start,mid-1);
		root.right = BuildTree(num,mid+1,end);
		
		return root;
		
	}
}
