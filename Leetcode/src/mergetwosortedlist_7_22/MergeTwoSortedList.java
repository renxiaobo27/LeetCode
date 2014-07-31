package mergetwosortedlist_7_22;

class ListNode
{
	int val;
	ListNode next;
	ListNode(int x)
	{
		val = x;
	}
}
public class MergeTwoSortedList {

	public ListNode mergeTwoSortedList(ListNode l1,ListNode l2)
	{
		ListNode fakeHead = new ListNode(0);
		ListNode p = fakeHead;
		ListNode p1 = l1;
		ListNode p2 = l2;
		
		while(p1!=null && p2!=null)
		{
			if(p1.val<p2.val)
			{
				p.next = p1;
				p1 = p1.next;
			}
			else
			{
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		if(p1!=null) p.next = p1;
		if(p2!=null) p.next = p2;
		return fakeHead.next;
	}
}
