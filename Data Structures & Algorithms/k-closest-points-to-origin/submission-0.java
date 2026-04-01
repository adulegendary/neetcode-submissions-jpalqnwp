class Node {
    int []arr;
    double value;

    Node(int []temp, double v) {
        arr = temp;
        value = v;
    }
}


class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //PriorityQueue<Node> pq = new PriorityQueue<>();

        PriorityQueue<Node> pq = new PriorityQueue<>(
    (a, b) -> Double.compare(a.value, b.value)  // min-heap by value
);

        int row = points.length;
        int col = points[0].length;
        int [][]result = new int[k][col];

        for(int []arr : points){
            int x = arr[0];
            int y= arr[1];
            double cal = Math.sqrt((Math.pow(0-x, 2) + Math.pow(0-y,2)));
            pq.add(new Node(arr, cal));

        }
       int i=0;
       while(i<k){
         Node best = pq.poll(); 
         result[i++] = best.arr;
       }

       return result;  
    }
}
