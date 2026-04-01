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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
       ;
        ListNode curr =  slow.next ;
        slow.next = null;
        // System.out.println(curr.val);
        ListNode second = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = second;
            second = curr;
            curr = temp;
            
        }
        ListNode first = head;
       // System.out.println(second.next.val);
        while(second != null && first != null){
                ListNode temp1 = first.next;
                ListNode temp2 = second.next;
                first.next = second;
                second.next = temp1;
                first = temp1;
                second = temp2;
        }
      
    }
}
