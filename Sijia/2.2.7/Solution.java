public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode dummy=new ListNode(Integer.MIN_VALUE);
    	dummy.next=head;
    	head=dummy;
        if(head.next==null) return null;
        ListNode pre=head;
        ListNode cur=head.next;
        int len=0;
        while(cur!=null){
        	pre=cur;
        	cur=cur.next;
        	len++;
        }
        pre=findNthNode(head, len-n);
        cur=findNthNode(head, len-n+1);
        pre.next=cur.next;
        return head.next;
    }
    public ListNode findNthNode(ListNode head, int N){
    	if(N==0)return head;
    	ListNode cur=head;
    	int count=0;
    	while(count<N){
    		cur=cur.next;
    		count++;
    	}
    	return cur;
    }
}