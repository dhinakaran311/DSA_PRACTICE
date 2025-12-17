import java.util.*;

class Twitter {
    HashMap<Integer, ArrayList<int[]>> tweets;
    HashMap<Integer, HashSet<Integer>> followMap;
    int time;

    public Twitter() {
        tweets = new HashMap<>();
        followMap = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId, new ArrayList<>());
        tweets.get(userId).add(new int[]{time++, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        HashSet<Integer> following = followMap.getOrDefault(userId, new HashSet<>());
        following.add(userId);

        for (int u : following) {
            ArrayList<int[]> list = tweets.getOrDefault(u, new ArrayList<>());
            for (int[] t : list) {
                pq.add(t);
                if (pq.size() > 10) pq.poll();
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(0, pq.poll()[1]);
        }
        return ans;
    }

    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId, new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(followeeId);
        }
    }
}

public class DesignTwitter {
    public static void main(String[] args) {

        Twitter twitter = new Twitter();

        twitter.postTweet(1, 5);
        System.out.println(twitter.getNewsFeed(1)); // [5]

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.println(twitter.getNewsFeed(1)); // [6, 5]

        twitter.unfollow(1, 2);
        System.out.println(twitter.getNewsFeed(1)); // [5]
    }
}
