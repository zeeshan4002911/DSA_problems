/**
 * Given a singly linked list and an integer x.Delete xth node from the singly linked list.

Example 1:

Input: 1 -> 3 -> 4 
       x = 3
Output: 1 -> 3
Explanation:
After deleting the node at 3rd
position (1-base indexing), the
linked list is as 1 -> 3. 

Example 2:

Input: 1 -> 5 -> 2 -> 9 
x = 2
Output: 1 -> 2 -> 9
Explanation: 
After deleting the node at 2nd
position (1-based indexing), the
linked list is as 1 -> 2 -> 9.

Your task: Your task is to complete the method deleteNode() which takes two arguments: the address of the head of the linked list and an integer x. The function returns the head of the modified linked list.

Constraints:
2 <= N <= 105
1 <= x <= N
 */

//{ Driver Code Starts
import java.util.*;

class DeleteNode {
    Node head;

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

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

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            // int k = sc.nextInt();
            DeleteNode llist = new DeleteNode();
            // int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            int x = sc.nextInt();
            // System.out.println(llist.head.data);
            GfG g = new GfG();
            // System.out.println(k);
            // System.out.println(g.getNthFromLast(llist.head,k));
            Node result = g.deleteNode(llist.head, x);
            llist.printList(result);
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
 * Linklist node structure
 * class Node
 * {
 * int data;
 * Node next;
 * 
 * Node(int d)
 * {
 * data = d;
 * next = null;
 * }
 * }
 */
/* You are required to complete below method */
class GfG {
    Node deleteNode(Node head, int x) {
        // Your code here
        if (head == null)
            return head;

        if (x == 1) {
            head = head.next;
            return head;
        }

        int count = 1;
        Node curr = head;

        while (curr != null) {
            count++;
            if (count == x) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
