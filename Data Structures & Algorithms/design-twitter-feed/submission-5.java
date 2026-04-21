class Twitter {
  
   List<Integer> news;
   int time;
   Map<Integer, Set<Integer>> connection;
  Map<Integer, Integer> withId;
   List<int[]> pq;
    public Twitter() {
        pq = new ArrayList<>();
        news = new ArrayList<>();
        connection = new HashMap<>();
        time =0;

    }
    
    public void postTweet(int userId, int tweetId) {
       
        connection.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);
        
        pq.add(new int[]{time, userId, tweetId});
        time +=1;

        
    }
    
    public List<Integer> getNewsFeed(int userId) {
           List<Integer> result = new ArrayList<>();
           Set<Integer> followers = connection.getOrDefault(userId, new HashSet());
           int size = pq.size()-1;
           int atMost =10;
           while(!followers.isEmpty() && size >=0){
              int [] data = pq.get(size);
              int userID = data[1];
              int tweet = data[2];
              if(followers.contains(userID)){
                 if(result.size() < atMost){
                      result.add(tweet);
                 }
                 
              }
              size -=1; 
           }
           return result;

         
    }
    
    public void follow(int followerId, int followeeId) {
        if(connection.containsKey(followerId)){

           connection.get(followerId).add(followeeId);
        }
        else {
          connection.computeIfAbsent(followerId, k -> new HashSet<>()).add(followerId);
          connection.get(followerId).add(followeeId);
        }
        
        
        System.out.println(connection);
         
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(connection.containsKey(followerId)){
          Set<Integer> val = connection.get(followerId);
          if(val.size()>1){
           val.remove(followeeId);
         }
         connection.put(followerId, val);
        }
       
        
    }
}
