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
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null){
         return null;
       }
       ListNode st=head;
       while(st!=null && st.next!=null){
        if(st.val==st.next.val){
            st.next=st.next.next;
        }
        else{
            st=st.next;
        }
       } 
       return head;
    }
}