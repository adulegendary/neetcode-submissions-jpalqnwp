class MyHashMap {
    Map<Integer, Integer> store;

    public MyHashMap() {
        store = new HashMap<>();
    }
    
    public void put(int key, int value) {
        store.put(key, value);
    }
    
    public int get(int key) {
        return store.getOrDefault(key, -1);
    }
    
    public void remove(int key) {
        store.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */