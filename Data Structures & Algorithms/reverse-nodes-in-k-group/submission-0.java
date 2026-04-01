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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(0);
        ListNode  curr = result;
        ListNode fast = head;
        ListNode slow = head;

        while(slow != null){
           int counter =0;
            while(counter < k && fast != null){
                fast = fast.next;
                counter +=1;
            }
            ListNode curr2 = null;
            while(slow != fast && counter == k ){
                ListNode temp = slow.next;
                slow.next = curr2;
                curr2 = slow;
                slow = temp;
            }
            while(curr.next != null){
                curr = curr.next;
            }
            if(counter == k){
                 curr.next = curr2;
            }else{
                curr.next = slow;
                return result.next;
            }
           

         
        }

        return result.next;
    }
}