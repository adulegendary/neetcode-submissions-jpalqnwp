class MyHashSet {
   Set<Integer> store;
    public MyHashSet() {
         store = new HashSet<>();
    }
    
    public void add(int key) {
        store.add(key);
    }
    
    public void remove(int key) {
        store.remove(key);
    }
    
    public boolean contains(int key) {
        return store.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */