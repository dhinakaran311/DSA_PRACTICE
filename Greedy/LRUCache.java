// LeetCode 146 - LRU Cache
// https://leetcode.com/problems/lru-cache/

import java.util.*;

class Node {
    Node prev;
    Node next;
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    Node head;
    Node tail;
    int capacity;
    HashMap<Integer, Node> mp;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        mp = new HashMap<>();
    }

    public void addNode(Node newNode) {
        newNode.prev = head;
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
    }

    public void delNode(Node del_node) {
        del_node.prev.next = del_node.next;
        del_node.next.prev = del_node.prev;
    }

    public int get(int key) {
        if (mp.containsKey(key)) {
            Node res = mp.get(key);
            delNode(res);
            addNode(res);
            return res.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (mp.containsKey(key)) {
            Node exist = mp.get(key);
            mp.remove(key);
            delNode(exist);
        }

        if (mp.size() == capacity) {
            mp.remove(tail.prev.key);
            delNode(tail.prev);
        }

        Node new_node = new Node(key, value);
        addNode(new_node);
        mp.put(key, new_node);
    }
}

public class LRUCache146Test {
    public static void main(String[] args) {

        LRUCache cache = new LRUCache(3);

        System.out.println("Test 1  put(1,10)"); cache.put(1, 10);
        System.out.println("Test 2  put(2,20)"); cache.put(2, 20);
        System.out.println("Test 3  put(3,30)"); cache.put(3, 30);

        System.out.println("Test 4  get(1)  -> " + cache.get(1)); // 10

        System.out.println("Test 5  put(4,40)"); cache.put(4, 40); // evicts 2

        System.out.println("Test 6  get(2)  -> " + cache.get(2)); // -1
        System.out.println("Test 7  get(3)  -> " + cache.get(3)); // 30

        System.out.println("Test 8  put(5,50)"); cache.put(5, 50); // evicts 1

        System.out.println("Test 9  get(1)  -> " + cache.get(1)); // -1
        System.out.println("Test 10 get(4)  -> " + cache.get(4)); // 40
    }
}
