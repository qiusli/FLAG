public class Solution {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (k < 2 || head == null)
			return head;
		ListNode cur = head;
		ListNode nextGroup = null;
		ListNode reversedHead = null;
		for (int i = 1; i < k; i++) {
			if (cur.next == null)
				return head;
			cur = cur.next;
		}
		reversedHead = cur;
		nextGroup = cur.next;
		cur = head;

		ListNode newNextGroup = reverseKGroup(nextGroup, k);
		ListNode pre = null;
		ListNode next = null;
		while (next != reversedHead) {
			reversedHead.next = cur;
			if (pre == null) {
				next = cur.next;
				cur.next = newNextGroup;
			} else {
				next = cur.next;
				cur.next = pre;
			}
			pre = cur;
			cur = next;
		}
		return reversedHead;
	}
}