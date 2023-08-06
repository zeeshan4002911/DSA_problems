/**
 * Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and 
smallest positive missing number is 1.

Example 2:

Input:
N = 3
Arr[] = {1, 3, 3}
Output: 3 2
Explanation: Repeating number is 3 and 
smallest positive missing number is 2.

Your Task:
You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 105
1 ≤ Arr[i] ≤ N

 */

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
// import java.util.*;

class GFindMissingAndRepeating {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {

        /*  
        // Dry Run For Duplicate
        1 3 4 5 5 
        -1 _3_ -3 -4 -5 --> on last -5 it will try to get inserted
        on same 4th index and fail so by that if condition 
        */

        int[] result = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            int value = Math.abs(arr[i]);
            if (arr[value - 1] > 0) {
                arr[value - 1] = -arr[value - 1];
            } else {
                result[0] = value;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }
}
