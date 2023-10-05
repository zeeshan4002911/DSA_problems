/**
 * Given a linked list sorted in ascending order and an integer called data,
 * insert data in the linked list such that the list remains sorted.
 * 
 * Example 1:
 * 
 * Input:
 * LinkedList: 25->36->47->58->69->80
 * data: 19
 * Output:
 * 19 25 36 47 58 69 80
 * Explanation:
 * After inserting 19 the sorted linked list will look like the one in the
 * output.
 * 
 * Example 2:
 * 
 * Input:
 * LinkedList: 50->100
 * data: 75
 * Output:
 * 50 75 100
 * Explanation:
 * After inserting 75 the sorted linked list will look like the one in the
 * output.
 * 
 * Your Task:
 * The task is to complete the function sortedInsert() which should insert the
 * element in sorted Linked List and return the head of the linked list
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 1 <= N <= 104
 * -99999 <= A[i] <= 99999, for each valid i
 */

//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            int k = sc.nextInt();

            Solution g = new Solution();
            head = g.sortedInsert(head, k);

            printList(head);
            t--;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}

// } Driver Code Ends

/*
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int d) {data = d; next = null; }
 * }
 */

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node curr = head1;
        if (curr.data >= key) {
            Node newNode = new Node(key);
            newNode.next = curr;
            return newNode;
        }
        Node prev = curr;
        while (curr != null) {
            if (curr.data >= key) {
                Node newNode = new Node(key);
                prev.next = newNode;
                newNode.next = curr;
                return head1;
            }
            prev = curr;
            curr = curr.next;
        }
        if (prev.data <= key) {
            Node newNode = new Node(key);
            prev.next = newNode;
            newNode.next = null;
        }
        return head1;
    }
}