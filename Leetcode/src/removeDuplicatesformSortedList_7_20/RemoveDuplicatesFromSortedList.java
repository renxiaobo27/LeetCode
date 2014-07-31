package removeDuplicatesformSortedList_7_20;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		ListNode p = head;
		
		while(p!=null && p.next!=null)
		{
			if(p.val==p.next.val)
				p.next = p.next.next;
			else
				p = p.next;
		}
		return p;
	}
}
