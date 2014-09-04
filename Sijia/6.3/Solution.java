package char6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode mergeKLists(List<ListNode> lists) {
    	int len=lists.size();
    	ListNode l1=lists.get(0);
    	
    	for(int i=1; i < len; i++)
    	{	
    		ListNode l2=lists.get(i);
    		l1=mergeTwoLists(l1,l2);
    	}
    	return l1;
    }

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null){
			return l2;
		}
		else if(l2==null){
			return l1;
		}
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