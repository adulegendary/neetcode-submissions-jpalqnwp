class TimeMap {
    Map<String, TreeMap<Integer, String>> vales;
    public TimeMap() {
          vales = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
         if(!vales.containsKey(key)){
            vales.put(key, new TreeMap<>());
         }
         vales.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!vales.containsKey(key)){
            return "";
        }
        TreeMap<Integer, String> values = vales.get(key);
        Integer floorTime = values.floorKey(timestamp);
        if(floorTime == null){
            return "";
        }
       
        return values.get(floorTime);
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */