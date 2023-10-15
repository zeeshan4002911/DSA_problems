/**
 * Given two linked lists sorted in increasing order, create a new linked list representing the intersection of the two linked lists. The new linked list should be made with its own memory the original lists should not be changed.
Note: The linked list elements are not necessarily distinct.

Example 1:

Input:
L1 = 1->2->3->4->6
L2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given first two
linked list, 2, 4 and 6 are the elements
in the intersection.

Example 2:

Input:
L1 = 10->20->40->50
L2 = 15->40
Output: 40

Your Task:
The task is to complete the function intersection() which should find the intersection of two linked list and add all the elements in intersection to the third linked list and return the head of the third linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
Note: n,m are the size of the linked lists.

Constraints:
1 <= size of linked lists <= 5000
1 <= Data in linked list nodes <= 104
 */

//{ Driver Code Starts
import java.io.*;
import java.util.*;

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
            m = sc.nextInt();

            Node head1 = inputList(n);
            Node head2 = inputList(m);

            Sol obj = new Sol();

            Node result = obj.findIntersection(head1, head2);

            printList(result);
            System.out.println();
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

// } Driver Code Ends

/*
 * Node of a linked list
 * class Node {
 * int data;
 * Node next;
 * Node(int d) { data = d; next = null; }
 * }
 */

class Sol {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        if (head1 == null || head2 == null)
            return head1;

        Node head = null, curr = null;
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                Node newNode = new Node(head1.data);
                if (head == null) {
                    head = newNode;
                    head.next = null;
                    curr = head;
                } else {
                    curr.next = newNode;
                    curr = curr.next;
                }
                head1 = head1.next;
                head2 = head2.next;
            } else {
                if (head1.data < head2.data) {
                    head1 = head1.next;
                } else {
                    head2 = head2.next;
                }
            }
        }
        return head;
    }
}