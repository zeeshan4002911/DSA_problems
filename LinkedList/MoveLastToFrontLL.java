/**
 * You are given the head of a Linked List. You have to move the last element to the front of the Linked List and return the list.

 

Example 1:

Input:
N = 5
List = {2,5,6,2,1}
Output:
{1,2,5,6,2}
Explanation:
In the given linked list, the last element is 1,
after moving the last element to the front the
linked list will be {1,2,5,6,2}.

 

Example 2:

Input:
N = 1
List = {2}
Output:
{2}
Explanation:
Here 2 is the only element so, the linked list
will remain the same.

 

Your Task:

You don't need to read input or print anything. Your task is to complete the function moveToFront() which takes the address of the head of the linked list and returns the modified linked list.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 105
0 <= Elements of List <= 109
Sum of N over all test cases doesn't exceeds 106

 */

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            Node head = Node.inputList(br);

            Solution obj = new Solution();
            Node res = obj.moveToFront(head);

            Node.printList(res);

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

    public static Node inputList(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node(Integer.parseInt(s[0])), tail = head;
        for (int i = 1; i < s.length; i++)
            tail = tail.next = new Node(Integer.parseInt(s[i]));

        return head;
    }

    public static void printList(Node node) {
        while (true) {
            System.out.print(node.data);
            node = node.next;
            if (node == null)
                break;
            System.out.print(" ");
        }
        System.out.println();
    }
}

// } Driver Code Ends

/*
 * 
 * Definition for singly Link List Node
 * class Node
 * {
 * int data;
 * Node next;
 * 
 * Node(int x){
 * data = x;
 * next = null;
 * }
 * }
 * 
 * You can also use the following for printing the link list.
 * Node.printList(Node node);
 */

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if (head == null || head.next == null)
            return head;

        Node curr = head, past = null;
        while (curr != null && curr.next != null) {
            past = curr;
            curr = curr.next;
        }
        past.next = null;
        curr.next = head;
        head = curr;
        return head;
    }
}
