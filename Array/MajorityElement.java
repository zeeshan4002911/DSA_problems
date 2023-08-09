/**
 * Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.

Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.


Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 

Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106

 */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            System.out.println(new Solution().majorityElement(arr, n));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    int majorityElement(int a[], int size) {
        int count = 1;
        int ansIndex = 0;
        for (int i = 1; i < size; i++) {
            if (a[i] == a[ansIndex]) {
                count++;
            } else
                count--;
            if (count <= 0) {
                count = 1;
                ansIndex = i;
            }
        }

        int freq = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == a[ansIndex]) {
                freq++;
            }
        }
        if (freq > size / 2)
            return a[ansIndex];

        return -1;

        // O(n^2) Solution -- TLE
        // int max_count = 0;
        // int idx = -1;
        // for (int i = 0; i < size; i++) {
        // int count = 0;
        // for (int j = 0; j < size; j++) {
        // if (a[i] == a[j]) {
        // count++;
        // }
        // }
        // if (count > max_count) {
        // max_count = count;
        // idx = i;
        // }
        // }
        // return (max_count > (size / 2)) ? a[idx] : -1;
    }
}
