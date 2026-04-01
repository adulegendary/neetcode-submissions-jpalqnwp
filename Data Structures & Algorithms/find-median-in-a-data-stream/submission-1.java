class MedianFinder {
    
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
       min = new PriorityQueue<>(Collections.reverseOrder());
       max = new PriorityQueue<>();

    }
    
    public void addNum(int num) {
    
        min.add(num);
        while((!min.isEmpty() && !max.isEmpty()) && min.peek() > max.peek()){
              int val = min.poll();
              max.add(val);
        }

        while(min.size()-1 > max.size()){
            int maxValue = min.poll();
            max.add(maxValue);
        }

        while(max.size()-1 > min.size()){
            int minValue = max.poll();
            min.add(minValue);
        }


    }
    
    public double findMedian() {
        int total = min.size() + max.size();
        if(total % 2 == 0){
            int midval =min.peek() + max.peek();
            double val = (double) midval/2;
            return val;
        }

        else if(max.size() > min.size()){
            return (double)max.peek();
        }
        return (double) min.peek();
    }
}
