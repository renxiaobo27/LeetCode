package balancedBinaryTree;

class TreeNode { 
	int val; 
	TreeNode left; 
	TreeNode right; 
	TreeNode(int x) { val = x; } 
} 

public class BalancedBinaryTree {
	public boolean fun(TreeNode root)
	{
		if(root==null) return true;
		
		if(Math.abs(depth(root.left)-depth(root.right))>1) return false;
		
		return fun(root.left) && fun(root.right);
		
	}
	
	public int depth(TreeNode root) 
	{
		if(root==null) return 0;
		return 1+Math.max(depth(root.left),depth(root.right));
	}
}
