package populatingNextRightPointersinEachNode_7_14;


class TreeLinkNode {
    TreeLinkNode left;
    TreeLinkNode right;
    TreeLinkNode next;
  }

public class PopulatingNextRightPointersinEachNode {
	
	public void connet(TreeLinkNode root)
	{
		if(root==null) return;
		if(root.left!=null) root.left.next = root.right;
		if(root.right!=null && root.next.left!=null) root.right.next = root.next.left;
		
		connet(root.left);
		connet(root.right);
	}

}
