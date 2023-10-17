/**
 * Given a Cirular Linked List of size N, split it into two halves circular
 * lists. If there are odd number of nodes in the given circular linked list
 * then out of the resulting two halved lists, first list should have one node
 * more than the second list. The resultant lists should also be circular lists
 * and not linear lists.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input:
 * Circular LinkedList: 1->5->7
 * Output:
 * 1 5
 * 7
 * 
 * 
 * 
 * Example 2:
 * 
 * Input:
 * Circular LinkedList: 2->6->1->5
 * Output:
 * 2 6
 * 1 5
 * 
 * 
 * Your Task:
 * Your task is to complete the given function splitList(), which takes 3 input
 * parameters: The address of the head of the linked list, addresses of the head
 * of the first and second halved resultant lists and Set the head1_ref and
 * head2_ref to the first resultant list and second resultant list respectively.
 * 
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxilliary Space: O(1)
 * 
 * 
 * Constraints:
 * 1 <= N <= 100
 */

//{ Driver Code Starts
import java.util.*;

class circular_LinkedList {
    Node head, head1, head2; // head of lisl
    // Node last = null;
    Node last = null;

    /* Linked list Node */

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;

        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    /* Function to print linked list */
    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
        System.out.println();
    }

    void circular() {
        last = head;
        while (last.next != null)
            last = last.next;
        last.next = head;
        // System.out.println(last);
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /*
         * Constructed Linked List is 1->2->3->4->5->6->
         * 7->8->8->9->null
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            circular_LinkedList llist = new circular_LinkedList();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));

            }
            /*
             * Node x = head;
             * while(x!=null)
             * {
             * System.out.print(x.data+" ");
             * x = x.next;
             * }
             */
            llist.circular();
            // int k=sc.nextInt();
            gfg g = new gfg();
            llist.head1 = null;
            llist.head2 = null;
            g.splitList(llist);
            llist.printList(llist.head1);
            llist.printList(llist.head2);

            t--;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
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

class gfg {
    // Function to split a circular LinkedList
    void splitList(circular_LinkedList list) {
        // DO NOT REMOVE THESE 3 LINES
        Node head = list.head;
        Node head1 = null;
        Node head2 = null;

        Node curr = head;
        int len = 0;
        while (curr.next != head) {
            len++;
            curr = curr.next;
        }
        int mid = (int) Math.ceil((len + 1) / 2.0);

        head1 = head;
        curr = head1;
        for (int i = 1; i < mid; i++) {
            curr = curr.next;
        }
        Node curr2 = curr.next;
        head2 = curr2;
        curr.next = head1;

        while (curr2.next != head) {
            curr2 = curr2.next;
        }
        curr2.next = head2;

        // Modify these head1 and head2 here, head is the starting point of our original
        // linked list.

        // DO NOT REMOVE THESE 2 LINES
        list.head1 = head1;
        list.head2 = head2;
    }
}