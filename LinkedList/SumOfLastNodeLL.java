/**
 * Given a single linked list of size M, your task is to complete the function sumOfLastN_Nodes(), which should return the sum of last N nodes of the linked list.

Input:
The function takes two arguments as input, the reference pointer to the head of the linked list and the an integer N.
There will be T test cases and for each test case the function will be called seperately.

Output:
For each test case output the sum of last N nodes of the linked list.

Constraints:
1<=T<=100
1<=N<=M<=1000

Example:
Input:
2
6 3
5 9 6 3 4 10
2 2
1 2

Output:
17
3

Explanation:
Testcase 1: Sum of last three nodes in the linked list is 3 + 4 + 10 = 17.
 */

//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i = 1; i < n; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            Solution obj = new Solution();
            System.out.println(obj.sum(head, k));
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// } Driver Code Ends

/*
 * Node class is as follows:
 * 
 * class Node {
 * int data;
 * Node next;
 * 
 * public Node (int data){
 * this.data = data;
 * this.next = null;
 * }
 * }
 */

class Solution {

    // Return the sum of last k nodes
    public int sum(Node head, int k) {
        // write code here
        int sum = 0, len = 0;
        if (head == null) {
            return sum;
        }
        Node curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        curr = head;
        int c = len - k;
        while (curr != null && c-- > 0) {
            curr = curr.next; 
        }
        while (curr != null) {
            sum += curr.data;
            curr = curr.next; 
        }

        return sum;
    }
}