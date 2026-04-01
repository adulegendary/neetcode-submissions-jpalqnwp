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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
               ListNode curr = new ListNode(0);
               ListNode result = curr;
               int l1hold = 0;
               int l2hold = 0;
               if (l1.val == 0 && l1.next == null && l2.val == 0 && l2.next == null) {
    return new ListNode(0);
}               
               int total =0;
               while(l1 != null || l2!= null){
                    if(l1 != null && l2 !=null){
                        total += l1.val + l2.val;
                        int val = total%10;
                        total /=10;
                        curr.next = new ListNode(val);
                        curr = curr.next;
                    }
                     if(l1 == null && l2 !=null){
                        total += 0 + l2.val;
                        int val = total%10;
                        total /=10;
                        curr.next = new ListNode(val);
                        curr = curr.next;
                    }if(l1 != null && l2 ==null){
                        total += 0 + l1.val;
                        int val = total%10;
                        total /=10;
                        curr.next = new ListNode(val);
                        curr = curr.next;
                    }
                  
                    


                   if(l1 != null){
                      l1 = l1.next;
                   }
                   if(l2 != null){
                      l2 = l2.next;
                   }
               }

              if(total >0){
                 curr.next = new ListNode(total);
              }
              






               return result.next;        
    }
}