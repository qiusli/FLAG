/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode cur1=l1;
		ListNode cur2=l2;
		int carry=0;
		int temp=0;
		ListNode res=new ListNode(0);
		ListNode resCur=res;
		while(cur1!=null && cur2!=null){
			if((cur1.val+cur2.val+carry)>=10){
				temp=cur1.val+cur2.val+carry-10;
				carry=1;
			}
			else{
				temp=cur1.val+cur2.val+carry;
				carry=0;
			}
			cur1=cur1.next;
			cur2=cur2.next;
			ListNode node=new ListNode(temp);
			resCur.next=node;
			resCur=node;
		}
		while(cur1!=null){
			if((cur1.val+carry)>=10){
				temp=cur1.val+carry-10;
				carry=1;
			}
			else{
				temp=cur1.val+carry;
				carry=0;
			}
			cur1=cur1.next;
			ListNode node=new ListNode(temp);
			resCur.next=node;
			resCur=node;
		}
		while(cur2!=null){
			if((cur2.val+carry)>=10){
				temp=cur2.val+carry-10;
				carry=1;
			}
			else{
				temp=cur2.val+carry;
				carry=0;
			}
			cur2=cur2.next;
			ListNode node=new ListNode(temp);
			resCur.next=node;
			resCur=node;
		}
		if(carry==1){
			ListNode node=new ListNode(1);
			resCur.next=node;
		}
		return res.next;
	}
}