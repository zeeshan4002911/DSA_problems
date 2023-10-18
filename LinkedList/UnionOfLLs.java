/**
 * Given two linked lists, your task is to complete the function makeUnion(), that returns the union list of two linked lists. This union list should include all the distinct elements only and it should be sorted in ascending order.

Example 1:

Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 
1 2 3 4 6 8 9
Explaination: 
All the distinct numbers from two lists, when sorted forms the list in the output. 

Example 2:

Input:
L1 = 1->5->1->2->2->5
L2 = 4->5->6->7->1
Output: 
1 2 4 5 6 7
Explaination: 
All the distinct numbers from two lists, when sorted forms the list in the output.

Your Task:
The task is to complete the function makeUnion() which makes the union of the given two lists and returns the head of the new list.

Expected Time Complexity: O((N+M)*Log(N+M))
Expected Auxiliary Space: O(N+M)

Constraints:
1<=N,M<=104
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
            Node head1 = inputList(n);

            m = sc.nextInt();
            Node head2 = inputList(m);

            Sol obj = new Sol();

            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}

// } Driver Code Ends
class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

/*
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int d) {data = d; next = null; }
 * }
 */

class Sol {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        SortedSet<Integer> sorted_set = new TreeSet<>();
        Node curr1 = head1;
        while (curr1 != null) {
            sorted_set.add(curr1.data);
            curr1 = curr1.next;
        }
        Node curr2 = head2;
        while (curr2 != null) {
            sorted_set.add(curr2.data);
            curr2 = curr2.next;

        }
        Node head = new Node(0);
        Node curr = head;
        Object[] arr = sorted_set.toArray();
        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node((int) arr[i]);
            curr.next = newNode;
            curr = curr.next;
        }
        head = head.next;
        return head;
    }
}