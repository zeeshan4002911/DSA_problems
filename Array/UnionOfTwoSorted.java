/**
 * Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.


Example 1:

Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including 
both the arrays are: 1 2 3 4 5.

 

Example 2:

Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 1 2 3 4 5
Explanation: Distinct elements including 
both the arrays are: 1 2 3 4 5.

 

Example 3:

Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 1 2
Explanation: Distinct elements including 
both the arrays are: 1 2.


Your Task: 
You do not need to read input or print anything. Complete the function findUnion() that takes two arrays arr1[], arr2[], and their size n and m as input parameters and returns a list containing the union of the two arrays. 
 

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(n+m).
 

Constraints:
1 <= n, m <= 105
1 <= arr[i], brr[i] <= 106

 */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
// import java.lang.*;

class UnionOfTwoSorted {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);

            int arr1[] = new int[N];
            int arr2[] = new int[M];

            st = read.readLine().trim().split(" ");
            for (int i = 0; i < N; i++)
                arr1[i] = Integer.parseInt(st[i]);

            st = read.readLine().trim().split(" ");
            for (int i = 0; i < M; i++)
                arr2[i] = Integer.parseInt(st[i]);

            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

// User function Template for Java

// arr1,arr2 : the arrays
// n, m: size of arrays
class Solution {
    private static int cacheVal = 0;

    // Function to return a list containing the union of the two arrays.
    public ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                addtoResult(arr1[i], result);
                i++;
            } else {
                addtoResult(arr2[j], result);
                j++;
            }
        }
        while (i < n) {
            addtoResult(arr1[i], result);
            i++;
        }
        while (j < m) {
            addtoResult(arr2[j], result);
            j++;
        }

        return result;
    }

    private static void addtoResult(int val, ArrayList<Integer> result) {
        if (val != cacheVal) {
            result.add(val);
            cacheVal = val;
        }
    }
}
