public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		if (head.next==null) return head;
		/* create dummy head */
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		head = dummy;

		/* current pointer */
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode next = cur.next;

		while (cur != null) {
		    next = cur.next;
			while (next != null) {
				if (cur.val == next.val) {
					next = next.next;
				} else {
					break;
				}
			}
			if (cur.next == next) {
				pre.next = cur;
				pre = cur;
				cur = next;
			} else {
				cur = next;
			}
		}
		pre.next=null;
		return head.next;
	}
}