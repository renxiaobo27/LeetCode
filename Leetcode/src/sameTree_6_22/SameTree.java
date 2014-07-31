package sameTree_6_22;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
}

public class SameTree {

	public boolean isSameTree(TreeNode q, TreeNode p) //root function
	{
		return utility(q,p);
	}
	public boolean utility(TreeNode q, TreeNode p)
	{
		if(p==null && q==null) return true;
		if(p==null && q!=null) return false;
		if(p!=null && q==null) return false;
		if(p.val == q.val)
		{
			return utility(q.left,p.left)&& utility(q.right,p.right);
		}
		else
		{
			return false;
		}
	}
}
