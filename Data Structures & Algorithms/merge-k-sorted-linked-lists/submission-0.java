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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode  dummy = new ListNode(0);
        ListNode curr = dummy;
        System.out.println(lists.length);
        if(lists.length <1){
            return null;
        }
        int counter =0;
       for(int i=0; i< lists.length; i++){

          while(lists[i] != null){
             curr.next = new ListNode(lists[i].val);
             lists[i] = lists[i].next;
             curr = curr.next;
            counter +=1;
          }
       }
       System.out.println(counter);
       int []arr = new int[counter];
       ListNode curr2 = dummy.next;
       for(int i=0; i<counter; i++){
          arr[i] = curr2.val;
          curr2 = curr2.next;
       }
       Arrays.sort(arr);  
       System.out.println(Arrays.toString(arr));
       ListNode  result = new ListNode(0);
      ListNode curr3 = result;
       for(int i=0; i<counter; i++){
          curr3.next = new ListNode(arr[i]);
          curr3 = curr3.next;
       }

        return result.next;
        
    }
}