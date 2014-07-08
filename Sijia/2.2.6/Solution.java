public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null) return null;
        ListNode cur=head;
        ListNode pre=head;
        int len=0;
        
    	while(cur!=null){
    	    pre=cur;
    		cur=cur.next;
    		len++;
    	}
        n=n%len;
    	pre.next=head;
    	cur=head;
    	
    	int count=0;
    	while(count<(len-n)){
    		pre=cur;
    		cur=cur.next;
    		count++;
    	}
    	head=cur;
    	pre.next=null;
    	return head;	
    }
}