/**
 * Given an array arr of size n, the task is to find the maximum triplet product in the array.


Example 1:

Input:
n = 4
arr[] = {1, 2, 3, 5}
Output:
30
Explanation:
5*3*2 gives 30. This is the maximum possible
triplet product in the array.

Example 2:

Input:
n = 7
arr[] = {-3, -5, 1, 0, 8, 3, -2} 
Output:
120
Explanation: 
-3*-5*8 gives 120. This is the maximum possible triplet product in the array.


Your Task:
You don't need to read input or print anything. Your task is to complete the function maxTripletProduct() which takes an integer n and an array arr and returns the maximum triplet product in the array.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)


Constraints:
3 ≤ N ≤ 5*105
-106 ≤ A[i] ≤ 106

 */

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
// import java.util.*;

// { Driver Code Starts.

// Driver class
class MaxTripletProduct {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            int sizeOfArray = Integer.parseInt(br.readLine());

            Long[] arr = new Long[sizeOfArray];

            String line = br.readLine();
            String[] elements = line.trim().split("\\s+");

            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Long.parseLong(elements[i]);
            }

            Solution11 obj = new Solution11();
            Long res = obj.maxTripletProduct(arr, sizeOfArray);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution11 {
    Long maxTripletProduct(Long arr[], int n) {
        // Complete the function
        long max1 = (long) Double.NEGATIVE_INFINITY;
        long max2 = (long) Double.NEGATIVE_INFINITY;
        long max3 = (long) Double.NEGATIVE_INFINITY;
        long min1 = (long) Double.POSITIVE_INFINITY;
        long min2 = (long) Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3) {
                max3 = arr[i];
            }

            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }

        long prod1 = max1 * max2 * max3;
        long prod2 = max1 * min1 * min2;
        return Math.max(prod1, prod2);
    }
}