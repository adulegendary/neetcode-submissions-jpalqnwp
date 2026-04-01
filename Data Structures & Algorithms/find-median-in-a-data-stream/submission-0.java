class MedianFinder {
    int counter;
    List<Integer> store;
    public MedianFinder() {
        counter =0;
        store = new ArrayList<>();
    }
    
    public void addNum(int num) {
        counter +=num;
        store.add(num);
        Collections.sort(store);
    }
    
    public double findMedian() {
        int mid = store.size()/2;
        if(store.size() % 2 == 0){
            System.out.println(store + "mid val");
            int midval = store.get(mid) + store.get(mid-1);
            double val = (double) midval/2;
            return val;
        }
        return (double) store.get(mid);
    }
}
