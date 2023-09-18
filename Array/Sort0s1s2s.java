/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.


Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 10^6
0 <= A[i] <= 2

 */

//{ Driver Code Starts
//Initial template for Java

import java.io.*;
// import java.util.*;

// { Driver Code Starts.

class Sort0s1s2s {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution22 ob = new Solution22();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr[i] + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends

// } Driver Code Ends
// User function template for Java

class Solution22 {
    public void sort012(int a[], int n) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                zeros++;
            else if (a[i] == 1)
                ones++;
        }

        for (int i = 0; i < n; i++) {
            if (zeros != 0) {
                a[i] = 0;
                zeros--;
            } else if (ones != 0) {
                a[i] = 1;
                ones--;
            } else
                a[i] = 2;
        }
    }
}