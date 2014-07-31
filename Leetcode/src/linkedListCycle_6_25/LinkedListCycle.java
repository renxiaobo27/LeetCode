/*Xiaobo June 25 2014*/
package linkedListCycle_6_25;

class ListNode{
	int val;
	ListNode next;
	ListNode(int val)
	{
		this.val = val;
		next = null;
	}
}
public class LinkedListCycle {

	public boolean hasCycle(ListNode head)
	{
		if(head==null || head.next==null) return false;
		ListNode p1,p2;
		p1 = p2 = head;
		while(p2!=null && p2.next!=null)
		{
			p1 = p1.next;
			p2 = p2.next.next;
			if(p1==p2)
				return true;
		}
		return false;
	}
}
