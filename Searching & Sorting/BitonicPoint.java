/**
 * Given an array arr of n elements that is first strictly increasing and then
 * maybe strictly decreasing, find the maximum element in the array.
 * Note: If the array is increasing then just print the last element will be the
 * maximum value.
 * 
 * Example 1:
 * 
 * Input:
 * n = 9
 * arr[] = {1,15,25,45,42,21,17,12,11}
 * Output: 45
 * Explanation: Maximum element is 45.
 * 
 * Example 2:
 * 
 * Input:
 * n = 5
 * arr[] = {1,45,47,50,5}
 * Output: 50
 * Explanation: Maximum element is 50.
 * 
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the
 * function findMaximum() which takes the array arr[], and n as parameters and
 * returns an integer denoting the answer.
 * 
 * Expected Time Complexity: O(logn)
 * Expected Auxiliary Space: O(1)
 * 
 * Constraints:
 * 3 ≤ n ≤ 106
 * 1 ≤ arri ≤ 106
 * 
 */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                result = arr[i - 1];
                break;
            }
        }

        if (arr[n - 1] > result)
            return arr[n - 1];
        return result;
    }
}