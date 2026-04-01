class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
       
        for(int i=0; i< numCourses; i++){ graph.add(new ArrayList());};


        int [] ind = new int[numCourses];
        for(int [] pre :prerequisites ){
            int a = pre[0];
            int b = pre[1];
            graph.get(b).add(a);
            ind[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<ind.length; i++){
            if(ind[i] == 0){
                q.add(i);
            }
        }
        int []result = new int[numCourses];
        int index =0;
        while(!q.isEmpty()){
              int v = q.poll();
              result[index++] = v;
              for(int i : graph.get(v)){
                ind[i] = ind[i]-1;
                if(ind[i] ==0){
                    q.add(i);
                }
              }
        }

        if(index != numCourses) {
            return  new int[]{};
        }
        return result;

        
    }
}
