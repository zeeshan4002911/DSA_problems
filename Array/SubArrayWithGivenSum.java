/**
 * Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.

Your Task:
You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N, and S as input parameters and returns an ArrayList containing the starting and ending positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found, return an array consisting of only one element that is -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= Ai <= 109
0<= S <= 109
 */

//{ Driver Code Starts
import java.util.*;
// import java.lang.*;
import java.io.*;

class MSubArrayWithGivenSum {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            String s[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for (int ii = 0; ii < res.size(); ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends

class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    public ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (s == 0) {
            result.add(-1);
            return result;
        }
        int sum = 0, j = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            while (sum > s && j < arr.length) {
                sum -= arr[j];
                j++;
            }

            if (sum == s) {
                result.add(j + 1);
                result.add(i + 1);
                break;
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
