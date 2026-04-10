/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Map<Node, Node> seperateCopy = new HashMap<>();
       if (head == null) return null;

       seperateCopy.put(null, null);

       Node cur = head;
       while(cur != null){
          Node copy = new Node(cur.val);
          seperateCopy.put(cur, copy);
          cur = cur.next;
       }

       Node curs = head;
       while(curs != null){
          Node copyFromDic =  seperateCopy.get(curs);
          copyFromDic.next = seperateCopy.get(curs.next);
          copyFromDic.random = seperateCopy.get(curs.random);

          curs = curs.next;
       }

       return seperateCopy.get(head);


    }
}
