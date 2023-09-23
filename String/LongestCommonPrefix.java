/**
 * Given an array of N strings, find the longest common prefix among all strings present in the array.


Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.

Example 2:

Input: 
N = 2
arr[] = {hello, world}
Output: -1
Explanation: There's no common prefix
in the given strings.


Your Task:
You don't need to read input or print anything. Your task is to complete the function longestCommonPrefix() which takes the string array arr[] and its size N as inputs and returns the longest common prefix common in all the strings in the array. If there's no prefix common in all the strings, return "-1".


Expected Time Complexity: O(N*min(|arri|)).
Expected Auxiliary Space: O(min(|arri|)) for result.


Constraints:
1 ≤ N ≤ 103
1 ≤ |arri| ≤ 103
 */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    String longestCommonPrefix(String arr[], int n) {
        // code here
        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder();
        String x = arr[0];
        String y = arr[n - 1];
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == y.charAt(i)) {
                ans.append(x.charAt(i));
            } else {
                break;
            }
        }
        return ans.toString().isEmpty() ? "-1" : ans.toString();
    }
}