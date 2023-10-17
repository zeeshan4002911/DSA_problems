/**
 * Given two linked lists, the task is to complete the function
 * findIntersection(), that returns the intersection of two linked lists. Each
 * of the two linked list contains distinct node values.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList1: 9->6->4->2->3->8
 * LinkedList2: 1->2->8->6
 * Output: 6 2 8
 * 
 * Your Task:
 * You task is to complete the function findIntersection() which takes the heads
 * of the 2 input linked lists as parameter and returns the head of intersection
 * list. Returned list will be automatically printed by driver code.
 * Note: The order of nodes in this list should be same as the order in which
 * those particular nodes appear in input list 1.
 * 
 * Constraints:
 * 1 <= n,m <= 104
 * 
 * Expected time complexity: O(m+n)
 * Expected auxiliary space: O(m+n)
 * 
 */

//{ Driver Code Starts
//

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

class GfG {
    static Scanner sc = new Scanner(System.in);

    public static Node inputList(int size) {
        Node head, tail;
        int val;

        val = sc.nextInt();
        head = tail = new Node(val);

        size--;
        while (size-- > 0) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        return head;
    }

    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String args[]) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;

            n = sc.nextInt();
            Node head1 = inputList(n);

            m = sc.nextInt();
            Node head2 = inputList(m);

            Solution obj = new Solution();

            Node result = obj.findIntersection(head1, head2);

            printList(result);
            System.out.println();
        }
    }
}

// } Driver Code Ends

// User function Template for Java

/*
 * structure of list Node:
 * 
 * class Node
 * {
 * int data;
 * Node next;
 * 
 * Node(int a)
 * {
 * data = a;
 * next = null;
 * }
 * }
 * 
 */

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // add your code here
        // return the head of intersection list
        HashSet<Integer> set = new HashSet<>();
        Node curr = head2;
        while (curr != null) {
            set.add(curr.data);
            curr = curr.next;
        }
        curr = head1;

        while (curr != null && curr.next != null) {
            if (!set.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        if (!set.contains(head1.data)) {
            head1 = head1.next;
        }

        if (curr != null && !set.contains(curr.data)) {
            curr = null;
        }
        return head1;
    }
}