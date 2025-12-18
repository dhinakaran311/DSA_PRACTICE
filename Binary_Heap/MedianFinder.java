import java.util.*;
// Leetcode 295. Find Median from Data Stream
class MedianFinder {

    PriorityQueue<Integer> minH;
    PriorityQueue<Integer> maxH;

    public MedianFinder() {
        minH = new PriorityQueue<>();
        maxH = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        maxH.add(num);
        minH.add(maxH.poll());
        if (minH.size() > maxH.size()) {
            maxH.add(minH.poll());
        }
    }

    public double findMedian() {
        if (minH.size() == maxH.size()) {
            return (minH.peek() + maxH.peek()) / 2.0;
        } else {
            return maxH.peek();
        }
    }

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5

        mf.addNum(3);
        System.out.println(mf.findMedian()); // 2.0

        mf.addNum(4);
        System.out.println(mf.findMedian()); // 2.5
    }
}
