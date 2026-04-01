class ListNode{
   int key;
   int val;
   ListNode next;
   ListNode prev;
   public ListNode(int key, int val){
      this.key = key;
      this.val = val;
   }


}

class LRUCache {
    Map<Integer, ListNode> store;
    int size;
    ListNode head;
    ListNode tail;
    public LRUCache(int capacity) {
         store = new HashMap<>();
         size = capacity;
         head = new ListNode(-1,-1);
         tail =  new ListNode(-1,-1);
         head.next = tail;
         tail.prev = head;
    }
    
    public int get(int key) {
        if(!store.containsKey(key)){
            return -1;
        }
        ListNode temp = store.get(key);
        removeNode(temp);
        addNode(temp);

        return temp.val;
        
    }
    public void addNode(ListNode node){
         ListNode temps = tail.prev;
         temps.next = node;
         node.next = tail;
         node.prev = temps;
         tail.prev = node;
    }
    public void removeNode(ListNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    public void put(int key, int value) {
        if(store.containsKey(key)){
            ListNode temps = store.get(key);
            removeNode(temps);
        }
        ListNode news = new ListNode(key, value);
        store.put(key, news);
        addNode(news);
        if(store.size() > size){
            ListNode temps = head.next;
            removeNode(temps);
            store.remove(temps.key);
        }
    }
}
