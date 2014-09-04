public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode nh = new ListNode(0);
		ListNode c = nh;
		ListNode c1 = l1;
		ListNode c2 = l2;

		while (c1 != null && c2 != null) {
			if (c1.val < c2.val) {
				c.next = c1;
				c1 = c1.next;
			} else {
				c.next = c2;
				c2 = c2.next;
			}
			c = c.next;
		}
		while (c1 != null) {
			c.next = c1;
			c1 = c1.next;
			c = c.next;
		}
		while (c2 != null) {
			c.next = c2;
			c2 = c2.next;
			c = c.next;
		}

		return nh.next;
	}
}