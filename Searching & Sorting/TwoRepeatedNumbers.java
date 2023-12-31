/**
 * 
 * You are given an array of N+2 integer elements. All elements of the array are
 * in the range 1 to N. Also, all elements occur once except two numbers which
 * occur twice. Find the two repeating numbers.
 * 
 * Note: Return the numbers in their order of appearing twice. So, if X and Y
 * are the repeating numbers, and X repeats twice before Y repeating twice, then
 * the order should be (X, Y).
 * 
 * Example 1:
 * 
 * Input:
 * N = 4
 * array[] = {1,2,1,3,4,3}
 * Output: 1 3
 * Explanation: In the given array,
 * 1 and 3 are repeated two times.
 * 
 * Example 2:
 * 
 * Input:
 * N = 2
 * array[] = {1,2,2,1}
 * Output: 2 1
 * Explanation: In the given array,
 * 1 and 2 are repeated two times
 * and second occurence of 2 comes
 * before 1. So the output is 2 1.
 * 
 * Your Task:
 * The task is to complete the function repeatedElements() which takes array
 * arr[] and an integer N as inputs (the size of the array is N + 2 and elements
 * are in the range[1, N]) and finds the two repeated element in the array and
 * return them in a list.
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(1).
 * 
 * Constraints:
 * 2 ≤ N ≤ 105
 * 1 ≤ array[i] ≤ N
 * 
 */

//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String l = br.readLine();
            String[] sarr = l.split(" ");
            int[] arr = new int[sarr.length];
            for (int i1 = 0; i1 < arr.length; i1++) {
                arr[i1] = Integer.parseInt(sarr[i1]);
            }

            Solution obj = new Solution();

            int[] res = obj.twoRepeated(arr, n);
            System.out.println(res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends

// User function template for JAVA

class Solution {
    // Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int N) {
        int[] res = new int[2];
        for (int i = 0; i < N + 2; i++) {
            if (arr[Math.abs(arr[i])] > 0)
                arr[Math.abs(arr[i])] *= -1;
            else {
                if (res[0] == 0)
                    res[0] = (Math.abs(arr[i]));
                else
                    res[1] = (Math.abs(arr[i]));
            }
        }
        return res;
    }
}