//Leetcode 23 : Merge k Sorted Lists

import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { val = v; }
}
public class mergeKLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node);
            }
        }
        ListNode ans = null;
        ListNode temp = null;
        while(!pq.isEmpty()){
            ListNode top = pq.poll();
            if(ans==null){
                ans = top;
                temp = top;
            }
            else{
                temp.next = top;
                temp = temp.next;
            }
            if(top.next!=null){
                pq.add(top.next);
            }
        }
        return ans;
    }
    // Utility to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Utility to convert array -> linked list
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode t = head;
        for (int i = 1; i < arr.length; i++) {
            t.next = new ListNode(arr[i]);
            t = t.next;
        }
        return head;
    }

    public static void main(String[] args) {

        // 5 TEST CASES
        int[][][] tests = {
            { {1,4,5}, {1,3,4}, {2,6} },
            { {} },
            { {}, {} },
            { {1}, {0} },
            { {2,5,7}, {1,3}, {4,6,8} }
        };

        for (int i = 0; i < tests.length; i++) {
            int[][] t = tests[i];
            ListNode[] lists = new ListNode[t.length];

            for (int j = 0; j < t.length; j++) {
                lists[j] = buildList(t[j]);
            }

            System.out.println("Test " + (i + 1) + ":");
            ListNode ans = mergeKLists(lists); // you will implement this
            printList(ans);
            System.out.println();
        }
    }
}
