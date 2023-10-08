/**
 * Given a Singly Linked List of size N, delete all alternate nodes of the list.

Example 1:

Input:
LinkedList: 1->2->3->4->5->6
Output: 1->3->5
Explanation: Deleting alternate nodes
results in the linked list with elements
1->3->5.

 

Example 2:

Input:
LinkedList: 99->59->42->20
Output: 99->42

 

Your Task:

Your task is to complete the function deleteAlt() which takes the head of the linked list in the input parameter and modifies the given linked list accordingly.

 

Constraints:
1<=N<=100

 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

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

            Node head1 = null, tail1 = null;

            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            head1 = new Node(d1);
            tail1 = head1;

            while (n1-- > 1) {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }

            Solution obj = new Solution();
            obj.deleteAlternate(head1);
            while (head1 != null) {
                System.out.print(head1.data + " ");
                head1 = head1.next;
            }
            System.out.println();
        }
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

// } Driver Code Ends

/*
 * class Node {
 * int data;
 * Node next;
 * 
 * public Node(int data){
 * this.data = data;
 * }
 * }
 */
class Solution {

    public void deleteAlternate(Node head) {
        // Write your code here
        Node curr = head;

        while (curr != null && curr.next != null) {
            curr.next = curr.next.next;
            curr = curr.next;
        }
    }
}