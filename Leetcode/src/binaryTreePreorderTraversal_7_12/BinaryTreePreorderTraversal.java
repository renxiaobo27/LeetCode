/*
 * 
 * 
 * add是将传入的参数作为当前List中的一个Item存储，即使你传入一个List也只会另当前的List增加1个元素 
	addAll是传入一个List，将此List中的所有元素加入到当前List中，也就是当前List会增加的元素个数为传入的List的大小 
	
	List是一个接口，而ListArray是一个类。 
	ListArray继承并实现了List。 
	所以List不能被构造，但可以向上面那样为List创建一个引用，而ListArray就可以被构造。 
	List list;     //正确   list=null; 
	List list=new List();    //   是错误的用法
 * */
package binaryTreePreorderTraversal_7_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x)
	{
		val = x;
	}
}

public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();
		if(root==null) return list;
		list.add(root.val);
		list.addAll(preorderTraversal(root.left));
		list.addAll(preorderTraversal(root.right));
		return list;
	}
	
	public List<Integer> preorderTraversal2(TreeNode root) //non recursive
	{
		List<Integer> list = new ArrayList<Integer>();
		if(root==null) return list;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.empty())
		{
			TreeNode t = s.pop();
			list.add(t.val);
			if(t.right!=null) s.push(t.right);
			if(t.left!=null) s.push(t.left);
			
		}
		return list;
	}
}
