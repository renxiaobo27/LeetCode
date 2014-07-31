/*
 * 
 * 
 * add�ǽ�����Ĳ�����Ϊ��ǰList�е�һ��Item�洢����ʹ�㴫��һ��ListҲֻ����ǰ��List����1��Ԫ�� 
	addAll�Ǵ���һ��List������List�е�����Ԫ�ؼ��뵽��ǰList�У�Ҳ���ǵ�ǰList�����ӵ�Ԫ�ظ���Ϊ�����List�Ĵ�С 
	
	List��һ���ӿڣ���ListArray��һ���ࡣ 
	ListArray�̳в�ʵ����List�� 
	����List���ܱ����죬����������������ΪList����һ�����ã���ListArray�Ϳ��Ա����졣 
	List list;     //��ȷ   list=null; 
	List list=new List();    //   �Ǵ�����÷�
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
