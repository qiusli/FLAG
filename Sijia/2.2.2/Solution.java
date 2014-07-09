public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		/*add a new node at the beginning of the list and make it "head" */
		ListNode temp=new ListNode(0);
		temp.next=head;
		head=temp;
        reverse(head, m, n);
        return head.next;
    }

	public void reverse(ListNode head, int m, int n){
		if((n-m)>=2){
	    	ListNode pre=getNthNode(head, m-1);
	    	ListNode start=pre.next;
	    	ListNode startNext=start.next;
	    	ListNode endPre=getNthNode(head,n-1);
	    	ListNode end=endPre.next;
	    	ListNode endNext=end.next;

	    	pre.next=end;
	    	end.next=startNext;
	    	endPre.next=start;
	    	start.next=endNext;
	    	reverse(head, m+1, n-1);
		}
		else if((n-m)==1){
	    	ListNode pre=getNthNode(head, m-1);
	    	ListNode start=pre.next;
	    	ListNode end=getNthNode(head, n);
	    	ListNode endNext=end.next;
	    	pre.next=end;
	    	end.next=start;
	    	start.next=endNext;
		}
	}
	
	public ListNode getNthNode(ListNode head, int N) {
		if(N==0) return head;
		ListNode cur = head.next;
		int i = 1;
		while (cur != null && i < N) {
			cur = cur.next;
			i++;
		}
		return cur;
	}
}
