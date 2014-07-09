public class Solution {
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		head = dummy;
		if (head.next == null)
			return null;
		ListNode pre = head;
		ListNode cur1 = head.next;
		ListNode cur2 = cur1.next;

		while (cur1 != null && cur2 != null) {
			pre.next = cur2;
			cur1.next = cur2.next;
			cur2.next = cur1;
			pre = cur1;
			cur1 = cur1.next;
			if (cur1 == null)
				break;
			cur2 = cur1.next;
		}
		return head.next;
	}
}