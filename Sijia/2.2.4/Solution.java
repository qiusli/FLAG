package latest;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		/* create dummy head */
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		head = dummy;
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode newList = new ListNode(Integer.MIN_VALUE);
		ListNode nl = newList;
		while (cur != null) {
			if (nl.val != cur.val) {
				deleteNode(pre);
				nl.next = cur;
				nl = nl.next;
				cur = pre.next;
				pre = pre.next;

			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return newList.next;
	}

	public void deleteNode(ListNode pre) {
		ListNode cur = pre.next;
		if (cur != null) {
			pre.next = cur.next;
			cur.next = null;
		}
	}
}