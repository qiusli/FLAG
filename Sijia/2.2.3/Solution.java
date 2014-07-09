public class Solution {
	public ListNode partition(ListNode head, int x) {
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		head = dummy;

		ListNode cur = head.next;
		ListNode preCur = head;
		ListNode largerStart = new ListNode(Integer.MIN_VALUE);
		ListNode lcur = largerStart;

		while (cur != null) {
			if (cur.val >= x) {
				preCur.next=cur.next;
				cur.next=null;
				lcur.next=cur;
				lcur=lcur.next;
				cur=preCur.next;
			} else {
				preCur = cur;
				cur = cur.next;
			}
		}
		
		preCur.next = largerStart.next;
		return head.next;
	}
}