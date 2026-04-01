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
    public boolean hasCycle(ListNode head) {
        Set<Integer> vales = new HashSet();
        int i =0;
        while(head != null){
           // System.out.println(head.val);
           
            // System.out.println(head.next);
            if( vales.contains(head.val)){
                return true;
            }else {
                vales.add(head.val);
            }
             head = head.next;
            
        }
        System.out.println(vales);
        return false;
    }
}
