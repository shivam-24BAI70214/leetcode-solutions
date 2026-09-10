/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode i=head;
       ListNode j=head;
       while(j!=null && j.next!=null){
        i=i.next;
        j=j.next.next;
       }
       ListNode prev=null;
       while(i!=null){
        ListNode temp=i.next;
        i.next=prev;
        prev=i;
        i=temp;
       }
       ListNode st=head;
       ListNode r=prev;
       while(r!=null){
        if(st.val != r.val){
            return false;
        }
        else{
            st=st.next;
            r=r.next;
        }
       }
       return true;
    }
}