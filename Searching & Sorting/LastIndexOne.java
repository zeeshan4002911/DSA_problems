/**
 * Given a string S consisting only '0's and '1's, find the last index of the
 * '1' present in it.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input:
 * S = 00001
 * Output:
 * 4
 * Explanation:
 * Last index of 1 in given string is 4.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input:
 * 0
 * Output:
 * -1
 * Explanation:
 * Since, 1 is not present, so output is -1.
 * 
 * 
 * 
 * 
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the
 * function lastIndex() which takes the string S as inputs and returns the last
 * index of '1'. If '1' is not present, return "-1" (without quotes).
 * 
 * 
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * 
 * 
 * Constraints:
 * 1 <= |S| <= 106
 * S = {0,1}
 */
//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();
            System.out.println(obj.lastIndex(s));

        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public int lastIndex(String s) {
        int last_idx = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                last_idx = i;
                break;
            }
        }
        return last_idx;
    }
}